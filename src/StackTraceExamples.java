public class StackTraceExamples {
    public static void main(String[] args) {
        StackTraceExamples stackTraceExamples = new StackTraceExamples();
        stackTraceExamples.method1();
    }


    public void method1(){
        method2();
    }

    public void method2(){
        method3();
    }

    public void method3(){
        throw new RuntimeException("BUM");
    }

}
