package com.homeworks.type_casting;

public class OperationTypeCasting {
    public static void main(String[] args) {
        byte a = 23,
                b = 112;
//        byte c = a + b; ERROR!
        int c = a + b;
        byte d = (byte) (a + b);
        char aSymbol = 'A';
        char bSymbol = 'B';
//        char result = aSymbol + bSymbol; ERROR!
        char result = (char) (aSymbol + bSymbol);
        System.out.println(result);
        int resultCode = aSymbol + bSymbol;
        System.out.println(resultCode);
    }
}
