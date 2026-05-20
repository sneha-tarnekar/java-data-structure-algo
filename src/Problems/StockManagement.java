package Problems;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StockManagement {

    private static class Stock {
        String symbol;
        String name;


        public Stock(String symbol, String name) {
            this.symbol=symbol;
            this.name=name;
        }
    }

    private static class PriceRecord {
        Stock stock;
        Double price;
        String date;

        public PriceRecord(Stock stock, double price, String date) {
            this.stock=stock;
            this.price=price;
            this.date=date;
        }
    }

    public static void main(String[] args) {
        Stock stock = new Stock("RVNL", "Rail Vikas Nigam Limited");
        List<PriceRecord> priceRecords = new ArrayList<>();
        priceRecords.add(new PriceRecord(stock, 110,"2023-06-29"));
        priceRecords.add(new PriceRecord(stock, 112,"2023-07-01"));
        priceRecords.add(new PriceRecord(stock, 90,"2023-06-25"));
        priceRecords.add(new PriceRecord(stock, 105,"2023-07-06"));

        getBiggestChange(priceRecords);
    }

   private static void getBiggestChange(List<PriceRecord> priceRecords) {
        priceRecords.sort(Comparator.comparing(priceRecord -> priceRecord.date));

        List<Object> result = new ArrayList<>();

        if(priceRecords == null || priceRecords.size() < 1) {
            result.add(0.0);
            result.add("");
            result.add("");
        }

        Double maxPriceChange = 0.0;
        String startDate = "";
        String endDate = "";

        for(int i=1; i<priceRecords.size(); i++) {
            PriceRecord start = priceRecords.get(i-1);
            PriceRecord end = priceRecords.get(i);
            Double change =  end.price - start.price;

            if(change > maxPriceChange) {
                maxPriceChange = change;
                startDate = start.date;
                endDate = end.date;
            }
        }

       System.out.println("" + maxPriceChange + ", " +startDate +", "+ endDate);

    }

}


