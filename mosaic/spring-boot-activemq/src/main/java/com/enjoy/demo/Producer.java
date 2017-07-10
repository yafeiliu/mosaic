package com.enjoy.demo;

import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Component;
import sun.security.krb5.internal.PAData;

import javax.jms.*;
import javax.jms.Queue;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 生产消费者
 * Created by 刘亚飞 on 2017/6/26.
 */
@Component
@EnableScheduling
public class Producer {

    //ActiveMq的默认用户名
    private static final String USERNAME = ActiveMQConnection.DEFAULT_USER;
    //ActiveMq的默认登陆密码
    private static final String PASSWORD = ActiveMQConnection.DEFAULT_PASSWORD;
    //ActiveMq默认链接地址
    private static final String BROKEN_URL = ActiveMQConnection.DEFAULT_BROKER_URL;

    AtomicInteger count = new AtomicInteger(0);
    //链接工厂
    ConnectionFactory connectionFactory;
    //连接对象
    Connection connection;
    //事务管理
    Session session;
    ThreadLocal<MessageProducer> threadLocal = new ThreadLocal<>();

    public void init(){
        try {
            //创建一个连接工厂
            connectionFactory = new ActiveMQConnectionFactory(USERNAME, PASSWORD,BROKEN_URL);
            //从工厂中创建一个连接
            connection = connectionFactory.createConnection();
            connection.start();
            session = connection.createSession(true,Session.SESSION_TRANSACTED);
        }catch(JMSException e){
            e.printStackTrace();
        }
    }

    public void sendMessage(String disname){
        try{
        //创建一个消息队列
        Queue queue = session.createQueue(disname);
        //消息生产者
        MessageProducer messageProducer = null;
        if(threadLocal.get()!=null){
            messageProducer=threadLocal.get();
        }else {
            messageProducer=session.createProducer(queue);
            threadLocal.set(messageProducer);
        }
        while(true){
            Thread.sleep(1000);
            int num = count.getAndIncrement();
            //创建一条消息
            TextMessage msg = session.createTextMessage(Thread.currentThread().getName()+"productor:我是大帅哥，我现在正在生产东西!,count:"+num);
            System.out.println(Thread.currentThread().getName()+"productor:我是大帅哥，我现在正在生产东西!,count:"+num);
            //发送消息
            messageProducer.send(msg);
            //提交事务
            session.commit();
        }
        }catch (JMSException e){
            e.printStackTrace();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
