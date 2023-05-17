// 
// 
// 

package com.shop.test;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import java.io.IOException;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import java.io.Reader;

public class MybatisUtil
{
    private static String config;
    static Reader reader;
    private static SqlSessionFactory factory;
    
    static {
        MybatisUtil.config = "mybatis/mybatis.xml";
        try {
            MybatisUtil.reader = Resources.getResourceAsReader(MybatisUtil.config);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        MybatisUtil.factory = new SqlSessionFactoryBuilder().build(MybatisUtil.reader);
    }
    
    public static SqlSessionFactory getSqlSessionFactory() {
        return MybatisUtil.factory;
    }
    
    public static SqlSession getSession() throws IOException {
        final SqlSession session = MybatisUtil.factory.openSession();
        return session;
    }
}
