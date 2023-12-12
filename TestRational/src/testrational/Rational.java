package testrational;

public class Rational extends Number implements Comparable<Rational> {

    //instance vaariables
    private long numerator;
    private long denominator;

    public Rational() {
        this(0, 1);
    }

    public Rational(long numerator, long denominator) {
        this.numerator = numerator;
        if (denominator != 0) {
            this.denominator = denominator;
        } else {
            throw new ArithmeticException();
        }
        this.reduce();
    }

    @Override
    public String toString() {
        return getNumerator() + "/" + getDenominator();
    }

    public Rational add(Rational that) {

        long newNumerator = this.numerator * that.denominator + this.denominator * that.numerator;
        long newDenominator = this.denominator * that.denominator;

        return new Rational(newNumerator, newDenominator);
    }

    public Rational subtract(Rational that) {
        long newNumerator = this.numerator * that.denominator - this.denominator * that.numerator;
        long newDenominator = this.denominator * that.denominator;

        return new Rational(newNumerator, newDenominator);
    }

    public Rational multiply(Rational that) {
        long newNumerator = this.numerator * that.numerator;
        long newDenominator = this.denominator * that.denominator;
        return new Rational(newNumerator, newDenominator);
    }

    public Rational divide(Rational that) {
        long newNumerator = this.numerator * that.denominator;
        long newDenominator = this.denominator * that.numerator;
        return new Rational(newNumerator, newDenominator);
    }

    public long getNumerator() {
        return numerator;
    }

    public void setNumerator(long numerator) {
        this.numerator = numerator;
    }

    public long getDenominator() {
        return denominator;
    }

    public void setDenominator(long denominator) {
        this.denominator = denominator;
    }

    private void reduce() {
        long n1 = Math.abs(this.numerator);
        long n2 = Math.abs(this.denominator);

        int gcd = 1;

        for (int k = 1; k <= n1 && k <= n2; k++) {
            if (n1 % k == 0 && n2 % k == 0) {
                gcd = k;
            }
        }

        this.numerator /= gcd;
        this.denominator /= gcd;

    }

    @Override
    public int intValue() {
        return (int) doubleValue();
    }

    @Override
    public long longValue() {
        return (long) doubleValue();
    }

    @Override
    public float floatValue() {
        return (float) doubleValue();
    }

    @Override
    public double doubleValue() {
        return this.numerator * 1.0 / this.denominator;
    }

    @Override
    public int compareTo(Rational that) {
        if (this.subtract(that).getNumerator() > 0) {
            return 1;
        } else if (this.subtract(that).getNumerator() < 0) {
            return -1;
        } else {
            return 0;
        }
    }
}
