package demo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class LoggingAspect {
        @Before("execution(* demo.ShoppingCart.cart1())")
        public void logger(JoinPoint jp){
            System.out.println(jp.getSignature());
            System.out.println("Logger is running");
        }
        @After("execution(* *.*.*(..))")
        public void logger1(JoinPoint jp){
            System.out.println(jp.getSignature());
            System.out.println("Logger1 is running");
        }

        @Pointcut("execution(* demo.*.value())")
        public void afterReturning(){}

        @AfterReturning(pointcut = "afterReturning()",returning = "val")
        public void afterReturnValue(int val){
            System.out.println("After Returning ");
            System.out.println(val);
        }

}
