/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import beans.Traductor;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author GerlinOTorresS
 */
public class Main {
    public static void main(String[] org){
        BeanFactory bf=new ClassPathXmlApplicationContext("applicationContext.xml");
        Traductor t1=(Traductor)bf.getBean("traductorEspanol");
        t1.hablar();
        Traductor t2=(Traductor)bf.getBean("traductorIngles");
        t2.hablar();
    }
}
