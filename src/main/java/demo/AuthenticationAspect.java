package demo;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AuthenticationAspect {

    @Pointcut("within(demo..*)")
    public void authenticationRequest(){

    }

    @Pointcut("within(demo..*)")
    public void authorizationRequest(){

    }

    @Before("authenticationRequest() && authorizationRequest()")
    public void authenticate(){
        System.out.println("Authentication is happening");
    }
}
