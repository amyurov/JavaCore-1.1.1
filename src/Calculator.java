import java.util.function.*;

public class Calculator {

    /* Объект instance, анонимного класса, содержит реализацию метода get() Ф.И. Supplier
     метод get() реализован ссылкой на конструктор.
     Так же, для реализации get(), можно использовать лямбда выражение (() -> new Calculator();)
     */
    static Supplier<Calculator> instance = Calculator::new;

    BinaryOperator<Integer> plus = Integer::sum;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;

    /* В примере из ДЗ делитель равен нулю, а при делении на ноль Java падает
    с ошибкой ArithmeticException. Для избежания этого в методе ниже написана проверка делителя.
    */
    BinaryOperator<Integer> devide = (x, y) -> {
        if (y != 0) {
            return x / y;
        }
        System.out.println("Делитель = 0");
        return 0;
    };

    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : -x;

    Predicate<Integer> isPositive = x -> x > 0;

    Consumer<Integer> println = System.out::println;

}

