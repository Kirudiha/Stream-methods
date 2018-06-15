package com.kgfsl;

interface Printer {
    void print(String val);
}

class LambdaDemo {

    public void printSomething(String something, Printer printer) {
        //System.out.println(something);
        printer.print(something);
    }

    public static void main(String[] args) {
        LambdaDemo lambdaDemo = new LambdaDemo();
        Printer printer = new Printer() {
            @Override
            public void print(String toPrint) {
                System.out.println(toPrint);
            }
        };
        String something = "Learning Lambda";
        lambdaDemo.printSomething(something, printer);
    }
}