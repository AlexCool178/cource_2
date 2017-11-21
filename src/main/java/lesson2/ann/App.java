package lesson2.ann;

public class App {
    public static void main(String[] args) throws IllegalAccessException {
        RandomIntTest test = new RandomIntTest();
        RandomIntProcessor.startProcess(test);
        System.out.println(test.getNumber());
    }
}
