package com.rp.springboot.controller;

import com.rp.springboot.beans.Dept;
import com.rp.springboot.dao.DeptDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author rp
 * @create 2018/9/13
 */
@RestController
public class DeptController {
    @Autowired
    private DeptDao deptDao;

    @RequestMapping("/findDept/{id}")
    public Object jpaIndex(@PathVariable("id") int id) {
        Optional<Dept> deptOptional  = deptDao.findById(id);
        Dept deptResult = deptOptional .get();
        return deptResult == null ? "没有查询到数据" : deptResult;
    }
}