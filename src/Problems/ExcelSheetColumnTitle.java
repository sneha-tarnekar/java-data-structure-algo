package Problems;

//  Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.
public class ExcelSheetColumnTitle {

    public static String findExcelSheetColumnTitle(int columnNumber) {
        String result = "";
        while (columnNumber > 0) {
            columnNumber--;
            result = (char) ((columnNumber % 26) + 'A') + result;
            columnNumber = columnNumber / 26;
        }
        return result;
    }

    public static void main(String[] args) {
        String output = findExcelSheetColumnTitle(701);
        System.out.println("Column Title : " + output);
    }
}
