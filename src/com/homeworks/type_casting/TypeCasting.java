package com.homeworks.type_casting;

public class TypeCasting {
    public static void main(String[] args) {
        byte a = 126;
        System.out.println("byte " + a);
        short b = a;
        System.out.println("byte " + a + " casts to " + "short " + b);
        int c = a;
        System.out.println("byte " + a + " casts to " + "int " + c);
        float d = a;
        System.out.println("byte " + a + " casts to " + "float " + d);
        double e = a;
        System.out.println("byte " + a + " casts to " + "double " + e);
        long f = a;
        System.out.println("byte " + a + " casts to " + "long " + f);
        char r = 'A';
        int g = r;
        System.out.println("char " + r + " casts to " + "int " + g);

        //Далее сделаем преобразование с потерей точности
        System.out.println("-----------");
        int h = 564368679;
        System.out.println(h);
        float v = h;
        System.out.println("int " + h + " casts to " + "float " + v + " - not accuracy");
        double w = h;
        System.out.println("int " + h + " casts to " + "double " + w + " - not accuracy");

        long j = 1340583628987893278L;
        System.out.println(j);
        double q = j;
        System.out.println("long " + j + " casts to " + "double " + q + " - not accuracy");
        float t = j;
        System.out.println("long " + j + " casts to " + "float " + t + " - not accuracy");

    }
}
