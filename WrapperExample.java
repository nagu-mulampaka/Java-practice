// Program to demonstrate Wrapper Classes in Java
public class WrapperExample {
    public static void main(String[] args) {

        // Primitive Data Types
        byte b = 10;
        short s = 20;
        int i = 30;
        long l = 40000L;
        float f = 25.75f;
        double d = 123.456;
        char c = 'A';
        boolean bool = true;

        // Boxing (Primitive → Object)
        Byte byteObj = Byte.valueOf(b);
        Short shortObj = Short.valueOf(s);
        Integer intObj = Integer.valueOf(i);
        Long longObj = Long.valueOf(l);
        Float floatObj = Float.valueOf(f);
        Double doubleObj = Double.valueOf(d);
        Character charObj = Character.valueOf(c);
        Boolean boolObj = Boolean.valueOf(bool);

        System.out.println("--- Boxing (Primitive → Object) ---");
        System.out.println("Byte object: " + byteObj);
        System.out.println("Short object: " + shortObj);
        System.out.println("Integer object: " + intObj);
        System.out.println("Long object: " + longObj);
        System.out.println("Float object: " + floatObj);
        System.out.println("Double object: " + doubleObj);
        System.out.println("Character object: " + charObj);
        System.out.println("Boolean object: " + boolObj);

        // Unboxing (Object → Primitive)
        byte b1 = byteObj.byteValue();
        short s1 = shortObj.shortValue();
        int i1 = intObj.intValue();
        long l1 = longObj.longValue();
        float f1 = floatObj.floatValue();
        double d1 = doubleObj.doubleValue();
        char c1 = charObj.charValue();
        boolean bool1 = boolObj.booleanValue();

        System.out.println("--- Unboxing (Object → Primitive) ---");
        System.out.println("byte value: " + b1);
        System.out.println("short value: " + s1);
        System.out.println("int value: " + i1);
        System.out.println("long value: " + l1);
        System.out.println("float value: " + f1);
        System.out.println("double value: " + d1);
        System.out.println("char value: " + c1);
        System.out.println("boolean value: " + bool1);

        // Auto Boxing and Auto Unboxing
        Integer num = 100;   // Auto Boxing
        int num2 = num;      // Auto Unboxing

        System.out.println("--- Auto Boxing and Auto Unboxing ---");
        System.out.println("Integer object: " + num);
        System.out.println("int value: " + num2);
    }
}
