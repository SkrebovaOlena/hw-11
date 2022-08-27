public class Main {

    public static void main(String[] args) {

        Converter converter = new Converter(new RomanNumber());
        System.out.println(converter.showArabicNumbers("XXV"));

        ProxyService proxyService = new RomanNumber();
        proxyService.convertToArabicNumbers("XXXIII");
    }
}
