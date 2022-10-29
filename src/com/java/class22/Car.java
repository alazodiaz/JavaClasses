package com.java.class22;

public class Car {
    void start(){
        System.out.println("Use the key to start me");
    }
    void stop() {
        System.out.println("Use brakes to stop me");
    }
    void park(){
        System.out.println("Park me manually");
    }
}
class BMW extends Car{

    void start(){
        System.out.println("Use Push Start to start me");
    }

    void stop() {
        super.stop(); //lets you use both methods so in test class it will print line 8 and line 22
        System.out.println("you can also use auto-breaking to stop me");
    }
}

class Toyota extends Car{
    void start(){
        System.out.println("push me to start");
    }
}

class Tesla extends Car{

    void start(){
        System.out.println("Use the app to start me");
    }

    void stop(){
        System.out.println("Use AI and AutoBreaking to stop me");
    }
    void park(){
        System.out.println("I can auto park myself");
    }

}