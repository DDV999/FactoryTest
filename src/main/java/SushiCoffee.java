public class SushiCoffee extends Sushi {
    public static Sushi orderSushi(SushiType type) {
        Sushi sushi = new SimpleSushiFactory().createSushi(type);
        sushi.getProducts();
        sushi.makeSushi();
        sushi.packegeSushi();

        System.out.println("Спасибо зазаказ, приходите еще!");
        return sushi;
    }

    public static void main(String[] args) {
        orderSushi(SushiType.HOT_SUSHI);
        orderSushi(SushiType.COLD_SUSHI);
        orderSushi(SushiType.WARM_SUSHI);
    }
}
