package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
//        EatableFruit eat=context.getBean(EatableFruit.class);
//        eat.eatableFruit();

                ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");

                // First bean (Apple)
                EatableFruit appleObj = context.getBean("eat", EatableFruit.class);
                appleObj.eatableFruit();

                // Second bean (Orange)
//                EatableFruit orangeObj = context.getBean("eatable", EatableFruit.class);
//                orangeObj.eatableFruit();


    }
}
