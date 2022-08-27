
public class ArabicNumber implements NumberService, ProxyService {
    @Override
    public void convertToArabicNumbers(String number) {
        Converter converter = new Converter();
        System.out.println(converter.showArabicNumbers(number));
    }
}
