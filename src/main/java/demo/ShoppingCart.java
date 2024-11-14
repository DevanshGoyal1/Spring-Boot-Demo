package demo;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {
    public void cart(String cartName){
        System.out.println("Put items in shopping Cart "+cartName);
    }

    public void cart1(){
        System.out.println("Put items in shopping Cart 1");
    }

    public int value(){
        return 2;
    }


}
