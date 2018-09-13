package com.rp.springboot.dao;

import com.rp.springboot.beans.Dept;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author rp
 * @create 2018/9/13
 */
public interface DeptDao extends JpaRepository<Dept,Integer> {

}