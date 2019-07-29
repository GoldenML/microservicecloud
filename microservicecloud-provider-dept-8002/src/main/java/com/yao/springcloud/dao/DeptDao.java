package com.yao.springcloud.dao;

import com.yao.springcloud.entities.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author shkstart
 * @create 2019-07-07 10:34
 */
@Mapper
public interface DeptDao {
    public boolean addDept(Dept dept);

    public Dept findById(Long id);

    public List<Dept> findAll();

}
