package Task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scannerFile1 = new Scanner(new File(args[0]));
        Scanner scannerFile2 = new Scanner(new File(args[1]));
        BigDecimal centerX = new BigDecimal(scannerFile1.findInLine("[-]?[0-9]*\\.?[0-9]+"));
        BigDecimal centerY = new BigDecimal(scannerFile1.findInLine("[-]?[0-9]*\\.?[0-9]+"));
        scannerFile1.nextLine();
        BigDecimal radius = new BigDecimal(scannerFile1.findInLine("[-]?[0-9]*\\.?[0-9]+"));
        BigDecimal radiusSqrt = radius.pow(2);
        while (scannerFile2.hasNextLine()) {
            BigDecimal x = new BigDecimal(scannerFile2.findInLine("[-]?[0-9]*\\.?[0-9]+"));
            BigDecimal y = new BigDecimal(scannerFile2.findInLine("[-]?[0-9]*\\.?[0-9]+"));
            BigDecimal result = (x.subtract(centerX)).pow(2).add(y.subtract(centerY).pow(2));
            if (result.compareTo(radiusSqrt) == 0) {
                System.out.println(0);
            } else if (result.compareTo(radiusSqrt) < 0) {
                System.out.println(1);
            } else if (result.compareTo(radiusSqrt) > 0) {
                System.out.println(2);
            }
            if (scannerFile2.hasNextLine()) {
                scannerFile2.nextLine();
            }
        }
    }
}
