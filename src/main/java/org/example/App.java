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
        System.out.println( "Hello World!" );
       /*
       This is depricated one so using ApplicationContext
       BeanFactory factory = new XmlBeanFactory(new FileSystemResource("springconfig.xml"));
        Alien obj = (Alien) factory.getBean("alien");
        obj.code();*/

        ApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");
       /*
       though u dont write a code here to create an object of any class , the objects for the classes which
       are mentioned in springconfig.xml will get craeted themselves by spring
       Alien obj = (Alien) context.getBean("alien");
        obj.code();*/

        Alien obj1 = (Alien) context.getBean("alien");
        obj1.code();
        obj1.age = 15;
        System.out.println(obj1.age);

        /*Here though you are trying to craete a new obj of alien , spring gives you a same obj as obj1 because spring beans are singleton by default
        and a singleton class wil have only 1 object*/
        Alien obj2 = (Alien) context.getBean("alien");
        obj2.code();
        System.out.println(obj2.age);// Print 15 as this is pointing to same object.

    }
}
