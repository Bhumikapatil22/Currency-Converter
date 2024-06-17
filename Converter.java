import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class CurrencyConverter extends JFrame {
    private JComboBox<String> fromCurrency;
    private JComboBox<String> toCurrency;
    private JTextField amountField;
    private JLabel resultLabel;

    private TreeMap<String, Double> exchangeRates;

    public CurrencyConverter() {
        setTitle("Currency Converter");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2, 10, 10));

        initializeExchangeRates();

        add(new JLabel("From:"));
        fromCurrency = new JComboBox<>(exchangeRates.keySet().toArray(new String[0]));
        add(fromCurrency);

        add(new JLabel("To:"));
        toCurrency = new JComboBox<>(exchangeRates.keySet().toArray(new String[0]));
        add(toCurrency);

        add(new JLabel("Amount:"));
        amountField = new JTextField();
        add(amountField);

        JButton convertButton = new JButton("Convert");
        convertButton.addActionListener(new ConvertAction());
        add(convertButton);

        resultLabel = new JLabel();
        add(resultLabel);

        setVisible(true);
    }

    private void initializeExchangeRates() {
        exchangeRates = new TreeMap<>();
        // Add exchange rates for all 195 countries here
        exchangeRates.put("Argentine Peso (ARS)", 98.50);
        exchangeRates.put("Australian Dollar (AUD)", 1.35);
        exchangeRates.put("Brazilian Real (BRL)", 5.25);
        exchangeRates.put("British Pound (GBP)", 0.75);
        exchangeRates.put("Canadian Dollar (CAD)", 1.25);
        exchangeRates.put("Chilean Peso (CLP)", 800.0);
        exchangeRates.put("Chinese Yuan (CNY)", 6.45);
        exchangeRates.put("Colombian Peso (COP)", 3800.0);
        exchangeRates.put("Danish Krone (DKK)", 6.34);
        exchangeRates.put("Egyptian Pound (EGP)", 15.60);
        exchangeRates.put("Euro (EUR)", 0.85);
        exchangeRates.put("Hong Kong Dollar (HKD)", 7.76);
        exchangeRates.put("Indian Rupee (INR)", 74.0);
        exchangeRates.put("Indonesian Rupiah (IDR)", 14000.0);
        exchangeRates.put("Israeli Shekel (ILS)", 3.28);
        exchangeRates.put("Japanese Yen (JPY)", 110.0);
        exchangeRates.put("Kazakhstani Tenge (KZT)", 420.0);
        exchangeRates.put("Korean Won (KRW)", 1165.0); // Corrected from "South Korean Won (KRW)"
        // Add more exchange rates here

    }

    private class ConvertAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                double amount = Double.parseDouble(amountField.getText());
                String from = (String) fromCurrency.getSelectedItem();
                String to = (String) toCurrency.getSelectedItem();

                double result = convertCurrency(amount, from, to);
                resultLabel.setText(String.format("Converted Amount: %.2f %s", result, to));
            } catch (NumberFormatException ex) {
                resultLabel.setText("Invalid amount entered");
            }
        }

        private double convertCurrency(double amount, String from, String to) {
            double fromRate = exchangeRates.get(from);
            double toRate = exchangeRates.get(to);
            return amount * (toRate / fromRate);
        }
    }

    public static void main(String[] args) {
        new CurrencyConverter();
    }
}
