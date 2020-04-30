package com.koom.dao;

import com.koom.entity.Admin;

import java.util.List;

/**
 * @ClassName IAdminDao
 * @Description TODO
 * @Author 0Glass
 * @Date 2020/04/30 14:40
 * @Version 1.0
 */
public interface IAdminDao {

    /**
     * 查询所有
     * @return
     */
    List<Admin> findAll();
}
