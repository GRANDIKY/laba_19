public class Main {

    public static void main(String[] args) {
        Singleton expr = Singleton.getInstance();
        System.out.println(expr.expression(12432, 410324));
        Singleton expr2 = Singleton.getInstance();
        System.out.println(expr2.expression(213213, 421214));
    }
}
