package e2;

public class StockMarketAdapter implements StockMarketReport{
   private StockMarket stockMarket;
   public StockMarketAdapter(){
       stockMarket = new StockMarket();
   }

    @Override
    public String dowload() {
        String xml = stockMarket.dowload();
        return convertToJson(xml);
    }
    public String convertToJson(String xml){
       String json = "";
        System.out.println("Convirtiendo la informacion del XML a Json");
       return json;
    }

}
