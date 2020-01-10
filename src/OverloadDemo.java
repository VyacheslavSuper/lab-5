public class OverloadDemo {
    void test() {
        System.out.println("Пapaмeтpы отсутствуют");
    }

    void test(int а) {
        System.out.println("a: " + а);
    }

    void test(int а, int Ь) {
        System.out.println("a и b: " + а + " " + Ь);
    }

    double test(double а) {
        System.out.println("double а: " + а);
        return а * а;
    }


}