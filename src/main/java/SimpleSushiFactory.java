public class SimpleSushiFactory extends Sushi {
    public Sushi createSushi(SushiType type) {
        Sushi sushi = null;
        switch (type) {
            case HOT_SUSHI:
                sushi = new HotSushi();
                break;
            case COLD_SUSHI:
                sushi = new ColdSushi();
                break;
            case WARM_SUSHI:
                sushi = new WarmSushi();
                break;
        }
        return sushi;
    }
}
