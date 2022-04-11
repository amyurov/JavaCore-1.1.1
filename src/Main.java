import java.util.function.*;

public class Main {

    public static void main(String[] args) {

        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(2, 4);
        int b = calc.minus.apply(1, 1);
        //Деление на ноль:
        int c = calc.devide.apply(a, b);

        b = calc.minus.apply(5, 1);
        int d = calc.multiply.apply(a, b);
        int e = calc.pow.apply(a);

        calc.println.accept(c);
        calc.println.accept(d);
        calc.println.accept(e);

        //Положим в b отрицательное значение:
        b = calc.minus.apply(1, 4);
        int f = calc.abs.apply(b);
        calc.println.accept(f);
        System.out.println(calc.isPositive.test(b));
    }
}
