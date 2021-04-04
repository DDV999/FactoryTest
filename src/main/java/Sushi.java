public class Sushi {
    public enum SushiType{
        COLD_SUSHI,
        HOT_SUSHI,
        WARM_SUSHI
    }

    public void getProducts() {
        System.out.println("Взять продукты");
    }
    public void makeSushi(){
        System.out.println("Сделать суши");
    }
    public void packegeSushi(){
        System.out.println("Упаковать суши");
    }
}
