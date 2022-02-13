package Minggu2;

class Soal5
{
 static short methodOne(long l)
    {
        int i = (int) l;
        return (short)i;
    }
    public static void main(String[] args)
    {
        double d = 10.25;
        System.out.println("Nilai d : " + d);
        float f = (float) d;
        byte b = (byte) methodOne((long) f);
        System.out.println("Nilai b : " + b);
    }
}