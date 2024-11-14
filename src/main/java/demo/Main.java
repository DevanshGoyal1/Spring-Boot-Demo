package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//My learning
/*
    so basically in aspect logger before and after annotation in before it runs before the method
    we mention in execution of it..and that method must be called in main method than only it will run
    and in after everything is same except that it runs after that method.
    Now see in execution we write @After("execution(* *.*.*(..))")  here first * means any return type
    second means any package and third means any class and fourth means any method and .. means any
    number of parameters.
    So if any method has no parameter we do not need to mention .. but we have to use () in last
    because for method it is mandatory and if any method has parameter than .. is mandatory

    Now if I do not mention method name than it's better we use .. because even if one method has
    parameter this annotation will not run for any method because it will be an error and if no method
    has any parameter even than using .. is not wrong because basically .. means any no. of parameters
    including zero parameter.

    so if I write demo..*.*(..) here after demo .. is their which means from 0 subpackages to any number
    of subpackages it is for classname because in our folder structure after package demo their is direct
    class..
    Now in within it is package..className where package is demo and than .. means any number of
    subpackages
    and than * which means className and their is no star for methodname that's why no (..) or
     () and no star
    in front as their is no return type.

    So writing demo..* means inside demo any class and we can write demo.* too because
    in our structure after demo package
    their is no subpackage direct class is their.

    .. means any depth from 0 to any specific number but * means 1 specific.
*/
public class Main {
    public static void main(String args[]){
        System.out.println("Main method is running");
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanPackage.class);
        ShoppingCart shoppingCart = context.getBean(ShoppingCart.class);
        shoppingCart.cart1();
        shoppingCart.cart("Clothes");
        shoppingCart.value();
    }
}
