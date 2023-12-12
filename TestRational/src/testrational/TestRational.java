package testrational;

import java.util.Arrays;

public class TestRational {

    public static void main(String[] args) {
        Rational rational = new Rational(3, 5);

        Rational rational2 = new Rational(1, 2);

        Rational answer = rational.subtract(rational2);

        Rational[] rationalArray = new Rational[3];

        rationalArray[0] = new Rational(3, 4);
        rationalArray[1] = new Rational(3, 7);
        rationalArray[2] = new Rational(1, 2);

        Arrays.sort(rationalArray);

        for (Rational rationals : rationalArray) {
            System.out.println(rationals);
        }

        System.out.println(rational.compareTo(rational2));
        System.out.println(answer);

    }

}
