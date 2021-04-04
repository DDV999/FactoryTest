public class WarmSushi extends Sushi {
    @Override
    public void getProducts() {
        System.out.println("Взять продукты для ТЕПЛОГО суши");
    }

    @Override
    public void packegeSushi() {
        System.out.println("Упаковать ТЕПЛЫЙ суши!");
    }
}
