public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1);
        try {
            int c = calc.devide.apply(a, b);
            calc.println.accept(c);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка");
        }
        /* на 0 делить нельзя.
        Способы решения:
        1. Поменять метод minus на какой-либо другой
        2. Изменить значение одного из параметров
        */
    }
}