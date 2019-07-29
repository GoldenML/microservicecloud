package com.yao.springcloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.yao.springcloud.entities.Dept;
import com.yao.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author shkstart
 * @create 2019-07-07 10:44
 */
@RestController
public class DeptController
{
    @Autowired
    private DeptService service;
    @Autowired
    private DiscoveryClient client;

    @RequestMapping(value="/dept/add",method= RequestMethod.POST)
    public boolean add(@RequestBody Dept dept)
    {

        return service.addDept(dept);
    }

    @RequestMapping(value="/dept/get/{id}",method=RequestMethod.GET)
    @HystrixCommand(fallbackMethod = "processHystrix_Get")
    public Dept get(@PathVariable("id") Long id)
    {
        Dept dept = service.findById(id);
        if(dept == null){
            throw new RuntimeException("该id："+id+"没有对应的信息");
        }
        return dept;
    }
    public Dept processHystrix_Get(@PathVariable("id") Long id){
        return new Dept().setDeptno(id)
                .setDname("该ID："+id+"没有没有对应的信息,null--@HystrixCommand")
                .setDb_source("no this database in MySQL");
    }

    @RequestMapping(value="/dept/list",method=RequestMethod.GET)
    public List<Dept> list()
    {
        return service.findAll();
    }

    @RequestMapping(value = "/dept/discovery",method = RequestMethod.GET)
    public Object discovery(){
        List<String> list = client.getServices();
        System.out.println("****************"+list);
        List<ServiceInstance> srvList = client.getInstances("MICROSERVICECLOUD-DEPT");
        for(ServiceInstance element : srvList){
            System.out.println(element.getServiceId()+"\t"+element.getHost()+"\t"+element.getPort()+"\t"+element.getUri());
        }
        return this.client;
    }

}

