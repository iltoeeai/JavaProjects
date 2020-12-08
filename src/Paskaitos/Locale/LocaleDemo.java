package Paskaitos.Locale;

import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Currency;
import java.util.Locale;

public class LocaleDemo {
    public static void main(String[] args) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);

        Locale locale = Locale.getDefault();
        System.out.println(locale);

        System.out.println(dateTimeFormatter.format(LocalDateTime.now()));

        locale = Locale.JAPAN;
        System.out.println(locale);
        Locale.setDefault(locale);

        dateTimeFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        System.out.println(dateTimeFormatter.format(LocalDateTime.now()));


//        Paskaitos.Locale.setDefault(locale);

//        Paskaitos.Locale [] locales = Paskaitos.Locale.getAvailableLocales();
//        System.out.println(Arrays.asList(locales));
//
        locale = Locale.forLanguageTag("lt");
        System.out.println(locale);
        locale.setDefault(locale);

        dateTimeFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        System.out.println(dateTimeFormatter.format(LocalDateTime.now()));

        NumberFormat numberFormatter = NumberFormat.getNumberInstance();
        System.out.println(numberFormatter.format(1234567.12));

        numberFormatter = NumberFormat.getNumberInstance(Locale.JAPAN);
        System.out.println(numberFormatter.format(1234567.12));

        numberFormatter = NumberFormat.getNumberInstance(Locale.GERMANY);
        System.out.println(numberFormatter.format(1234567.12));

        //PINIGAI

        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
        currencyFormatter.setCurrency((Currency.getInstance("USD")));
        currencyFormatter.setGroupingUsed(false); //nebus tarpu tarp tukst.
        System.out.println(currencyFormatter.format(1234567.12));
        System.out.println(currencyFormatter.format(-1234567.12));


        currencyFormatter = NumberFormat.getCurrencyInstance(Locale.JAPAN);
        System.out.println(currencyFormatter.format(1234567.12));
        System.out.println(currencyFormatter.format(-1234567.12));

        currencyFormatter = NumberFormat.getCurrencyInstance(Locale.GERMANY);
        System.out.println(currencyFormatter.format(1234567.12));
        System.out.println(currencyFormatter.format(-1234567.12));

        currencyFormatter = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println(currencyFormatter.format(1234567.12));
        System.out.println(currencyFormatter.format(-1234567.12));






    }
}
