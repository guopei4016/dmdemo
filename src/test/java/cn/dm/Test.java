package cn.dm;

import cn.dm.common.Dto;

public class Test {
    private Dto dto=new Dto();
    @org.junit.Test
    public void test(){
        System.out.println(dto.getErrorCode());
    }
}
