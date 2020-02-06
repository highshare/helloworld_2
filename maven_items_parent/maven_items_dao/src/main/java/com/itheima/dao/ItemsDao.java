package com.itheima.dao;

import com.itheima.domain.Items;

/**
 * Created By liming on 2020/2/4
 */
public interface ItemsDao {

    public Items findItemById(Integer id);

}