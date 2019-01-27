package io.jmlim.java.traning.java8.defaultmethod;

/**
 * https://medium.com/@pyeonjy97/%EC%9E%90%EB%B0%94-8-%ED%8A%9C%ED%86%A0%EB%A6%AC%EC%96%BC-5d05f0f55fe1
 */
public class FormulaTest {
    public static void main(String[] args) {

        Formula formula = new Formula() {
            @Override
            public double calculate(int a) {
                return sqrt(a*100);
            }
        };
        System.out.println(formula.calculate(200));
        System.out.println(formula.sqrt(16));


    }
}
