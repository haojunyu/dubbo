package com.hjy.provider;

/**
 * @author a11080355
 */
public class QueryComputerListServiceImpl implements QueryComputerListService{

    @Override
    public int queryComputerCount() {
        System.out.println("执行提供者接口的线程:" + Thread.currentThread().getName());
        return 100;
    }
}
