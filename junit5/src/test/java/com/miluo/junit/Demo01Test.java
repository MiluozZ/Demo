package com.miluo.junit;

import org.junit.jupiter.api.*;

/**
 * @className: Demo01Test
 * @description: Junit5基本测试
 *  测试成功控制台为绿色，不显示数据，测试失败时控制台爆红显示期待值和实际值。
 *  测试方法不需要被调用也不需要返回值，所以入参为空，出参为void。
 *
 * @author: Miluo
 * @date: 2021/3/3
 **/

public class Demo01Test {
    //@BeforeAll、@AfterAll在所有测试前、后执行，必须是static的。
    @BeforeAll
    public static void beforeAll(){
        System.out.println("----------->beforeAll");
    }
    @AfterAll
    public static void afterAll(){
        System.out.println("------------>afterAll");
    }

    //@BeforeEach、@AfterEach是每个测试前、后执行。
    @BeforeEach
    public void beforeEach(){
        System.out.println("---->beforeEach");
    }
    @AfterEach
    public void afterEach(){
        System.out.println("---->afterEach");
    }


    @Test
    public void testAdd(){
        Demo01 demo01 = new Demo01();
        Assertions.assertEquals(4,demo01.add(2,2));
    }

    @Test
    public void testSub(){
        Demo01 demo01 = new Demo01();
        Assertions.assertEquals(2,demo01.sub(4,2));
    }


}
