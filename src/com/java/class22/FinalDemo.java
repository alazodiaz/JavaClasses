package com.java.class22;

public class FinalDemo {
}

// using word final before a variable locks in their value, they cannot be changed
class Phone{
    final int RAM=12;
    void takePics(){
        final int number=10;

    }
}

class Iphone extends Phone{
    @Override
    void takePics() {
        super.takePics();
    }
}
