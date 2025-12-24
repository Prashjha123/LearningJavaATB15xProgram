package ex_05_TypeCasting;

public class Lab059_TypeCasting_Narrowing {
    static void main(String[] args) {

        int val = 300;
//        byte b = val; // Implicit Narrowing - this is not possible

        byte b2 = (byte)val; // Explicit Narrowing
        // Byte can store max 128

        System.out.println(b2);

//        Java will first convert 300 Decimal into Binary number
//     0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 0 0 1 0 1 1 0 0
//        Only 8 bits will be considered in Java 0 0 1 0 1 1 0 0
//       Calculation:  00101100₂
//          = (0×128) + (0×64) + (1×32) + (0×16) + (1×8) + (1×4) + (0×2) + (0×1)
//          = 32 + 8 + 4
//          = 44₁₀



    }
}
