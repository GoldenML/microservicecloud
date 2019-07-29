package com.yao.springcloud.service;

import com.yao.springcloud.entities.Dept;

import java.util.List;

/**
 * @author shkstart
 * @create 2019-07-07 10:41
 */
public interface DeptService {
    public boolean addDept(Dept dept);

    public Dept findById(Long id);

    public List<Dept> findAll();
}
