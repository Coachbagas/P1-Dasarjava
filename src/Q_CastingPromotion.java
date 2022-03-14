public class Q_CastingPromotion {
    public static void main(String[] args) {
        long varlong =1000000l;
        int varint=23456;
        varint=(int)varint;
        System.out.println("nilai varlong =" + varlong);
        System.out.println("nilai varint =" + varint);
        char varChar='a';
        varint = (int) varChar;
        System.out.println("nilai varint('a')=" + varint);
        varChar =(char) (varint+1);
        System.out.println("nilai varchar=" + varChar);
        byte varbyte=127;
        System.out.println("nilai varint(127)=" + varint);
        short varshort=(short) varint;
        System.out.println(" nilai varshort=" + varshort);
        varshort= varbyte;
        System.out.println("nilai var short" +varshort);
        double varDouble=3.145256718992022;
        float varfloat= (float) varDouble;
        System.out.println("nilai var double=" +varDouble);
        System.out.println("nilai varfloat=" + varfloat);


    }
}
