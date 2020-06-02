package bogdan;

public class Main {

    public static void main(String[] args) {
        // вариант 7
        Formula test = new Formula();
        test.set(0.1722 ,6.33,3.25*Math.pow(10, -4));
        test.run();
        test.print();

    }
}
class Formula {
    double x, y, z, result;

    void set(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    void run() {
        double result = 5*Math.atan(x)-1/4*Math.acos(x)*(x+3+Math.abs(x-y)+Math.pow(x, 2))/Math.abs(x-y)*z+Math.pow(x, 2);
        this.result = result;
    }


    void print() {
        System.out.print(result);
    }
}