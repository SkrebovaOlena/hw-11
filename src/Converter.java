import java.util.List;

public class Converter implements NumberService, ProxyService {

    private NumberService numberService;

    public Converter(NumberService numberService) {
        this.numberService = numberService;
    }

    public Converter() {
    }

    public int showArabicNumbers(String input){
        String romanNumeral = input.toUpperCase();
        int result = 0;

        List<RomanNumber.RomanNumeral> romanNumbers = RomanNumber.RomanNumeral.getReverseSortedValues();
        int i = 0;

        while ((romanNumeral.length() > 0) && (i < romanNumbers.size())) {
            RomanNumber.RomanNumeral symbol = romanNumbers.get(i);
            if (romanNumeral.startsWith(symbol.name())) {
                result += symbol.getValue();
                romanNumeral = romanNumeral.substring(symbol.name().length());
            } else {
                i++;
            }
        }

        if (romanNumeral.length() > 0) {
            throw new IllegalArgumentException(input + " cannot be converted to a Roman Numeral");
        }
        return result;
    }

    @Override
    public void convertToArabicNumbers(String number) {

    }
}
