package cz.mendelu;

import cz.mendelu.config.EshopConfig;
import cz.mendelu.service.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
public static void main( String[] args )
        {

        ApplicationContext context =
        new AnnotationConfigApplicationContext(EshopConfig.class);
        System.out.println(context.getBean(CustomerService.class).findAll());
        }
        }