package data;

public class ObserverTest {
	public static void main(String[] args) {
        StockMarket market = new StockMarket();
        Observer mobileUser = new MobileApp("Alan");
        Observer webUser = new WebApp("Rose");
        market.registerObserver(mobileUser);
        market.registerObserver(webUser);
        market.setStock("TCS", 3725.50);
        System.out.println();

        market.setStock("Infosys", 1480.00);
        System.out.println();

        market.removeObserver(webUser);
        market.setStock("Reliance", 2890.25);
    }
}
