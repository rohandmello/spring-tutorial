package com.rohan.core.sequence;

/**
 * Created by IntelliJ IDEA.
 * User: Rohan.Dmello
 * Date: 7/28/13
 * Time: 9:53 PM
 * To change this template use File | Settings | File Templates.
 */

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Sequence {
    public static void main(String[] args) {
        ApplicationContext context =
        new ClassPathXmlApplicationContext("beans.xml");
        SequenceGenerator generator =
        (SequenceGenerator) context.getBean("sequenceGenerator");
        System.out.println(generator.getSequence());
        SequenceGenerator generator2 =
        (SequenceGenerator) context.getBean("sequenceGenerator2");
        System.out.println(generator2.getSequence());
    }
}
