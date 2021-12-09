package ru.samsung.itschool.mdev;

public class Main {

    public static void main(String[] args)  {

        // throws - указывается в сигнатуре метода (как метод потенц. выбр. исключение)
        // throw new - выбрасываем исключение искусственно


        int[] x = new int[5]; // 0 0 0 0 0
        try {
            int a = 100;
            int b = 0;
            //x[10] = 800;
            //System.out.println(a / b);
            System.out.println("После вычисления!");
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e2) {
            System.out.println(e2.toString());

        } finally {
            System.out.println("Я буду выполняться всегда!");
        }

        // какой-то плохой код
        System.out.println("Код после try!");


        try {
            throw new Exception("Ура!");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("123123");

        try {
            toDo();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void toDo() throws Exception {
        // что-то с исключением
    }
}
