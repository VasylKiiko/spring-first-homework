package com.Kiiko.springcourse;

import com.Kiiko.springcourse.book_beans.BookShell;
import com.Kiiko.springcourse.book_beans.BooksConfig;
import com.Kiiko.springcourse.book_beans.BooksPresent;
import com.Kiiko.springcourse.config.AppConfig1;
import com.Kiiko.springcourse.config.AppConfig2;
import com.Kiiko.springcourse.config.DIExampleConfig;
import com.Kiiko.springcourse.di_beans.ConstructorDIBean;
import com.Kiiko.springcourse.di_beans.FieldDIBean;
import com.Kiiko.springcourse.di_beans.SetterDIBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext ctx1 = new AnnotationConfigApplicationContext(AppConfig1.class);
        System.out.println("Task 3. First config file scan all components in package beans1");
        for (String name : ctx1.getBeanDefinitionNames()) {
            System.out.println(name);
        }

        System.out.println("---------------------------------------------");
        ApplicationContext ctx2 = new AnnotationConfigApplicationContext(AppConfig2.class);
        System.out.println("Task 4. Second config file scan all components in package beans2 and only BeanD and BeanF from package beans3");
        for (String name : ctx2.getBeanDefinitionNames()) {
            System.out.println(name);
        }

        System.out.println("---------------------------------------------");
        ApplicationContext ctx3 = new AnnotationConfigApplicationContext(DIExampleConfig.class);
        System.out.println("Task 6. Example of using @Autowired with Constructor-based, setter-based and field-based DIs");
        ctx3.getBean(ConstructorDIBean.class).printValue();
        ctx3.getBean(SetterDIBean.class).printValue();
        ctx3.getBean(FieldDIBean.class).printValue();

        System.out.println("---------------------------------------------");
        ApplicationContext ctx4 = new AnnotationConfigApplicationContext(BooksConfig.class);
        System.out.println("Task 7. BookShell bean contains collection with book beans (using @Ordered)");
        ctx4.getBean(BookShell.class).printBooks();
        System.out.println("Task 8. Injected Book beans into BookPresent bean using @Qualifier");
        ctx4.getBean(BooksPresent.class).printPresents();
    }
}
