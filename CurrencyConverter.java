import java.util.HashMap;
import java.util.Scanner;

public class CurrencyConverter {
    private HashMap<String, HashMap<String, Double>> exchangeRates;

    public CurrencyConverter() {
        exchangeRates = new HashMap<>();
        initializeRates();
    }

    private void initializeRates() {
        HashMap<String, Double> usdRates = new HashMap<>();
        usdRates.put("USD", 1.0);
        usdRates.put("EUR", 0.92);
        usdRates.put("INR", 83.50);
        usdRates.put("GBP", 0.78);
        exchangeRates.put("USD", usdRates);

        HashMap<String, Double> eurRates = new HashMap<>();
        eurRates.put("EUR", 1.0);
        eurRates.put("USD", 1.09);
        eurRates.put("INR", 90.75);
        eurRates.put("GBP", 0.85);
        exchangeRates.put("EUR", eurRates);

        HashMap<String, Double> inrRates = new HashMap<>();
        inrRates.put("INR", 1.0);
        inrRates.put("USD", 0.012);
        inrRates.put("EUR", 0.011);
        inrRates.put("GBP", 0.0094);
        exchangeRates.put("INR", inrRates);

        HashMap<String, Double> gbpRates = new HashMap<>();
        gbpRates.put("GBP", 1.0);
        gbpRates.put("USD", 1.28);
        gbpRates.put("EUR", 1.18);
        gbpRates.put("INR", 107.05);
        exchangeRates.put("GBP", gbpRates);
    }

    public void startConverter() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== CURRENCY CONVERTER ===");
        System.out.println("Supported: USD, EUR, INR, GBP");
        
        System.out.print("Enter base currency: ");
        String baseCurrency = scanner.next().toUpperCase();

        System.out.print("Enter target currency: ");
        String targetCurrency = scanner.next().toUpperCase();

        if (!exchangeRates.containsKey(baseCurrency) || !exchangeRates.get(baseCurrency).containsKey(targetCurrency)) {
            System.out.println("\nError: Unsupported currency selection.");
            scanner.close();
            return;
        }

        System.out.print("Enter amount to convert: ");
        double amount = scanner.nextDouble();

        if (amount < 0) {
            System.out.println("\nError: Amount cannot be negative.");
            scanner.close();
            return;
        }

        double rate = exchangeRates.get(baseCurrency).get(targetCurrency);
        double convertedAmount = amount * rate;

        System.out.println("\n--- CONVERSION RESULT ---");
        System.out.printf("%.2f %s = %.2f %s\n", amount, baseCurrency, convertedAmount, targetCurrency);
        System.out.printf("Exchange Rate (1 %s): %.4f %s\n", baseCurrency, rate, targetCurrency);

        scanner.close();
    }

    public static void main(String[] args) {
        CurrencyConverter converter = new CurrencyConverter();
        converter.startConverter();
    }
}