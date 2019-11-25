package com.briup.cms.service;

import com.briup.cms.bean.Customer;

public interface ICustomerService {
    /**
     * 根据id查询数据
     * @param id
     * @return
     */
    Customer findById(int id);
}
