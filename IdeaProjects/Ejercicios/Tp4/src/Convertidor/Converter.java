package Convertidor;

public class Converter {
    private static final float pulgada_centimetro = 2.54f;
    private static final float libra_kilo = 0.453592f;
    private static final float galon_litro = 3.78541f;

    public static float libraKilo(float v1){
        return v1*libra_kilo;
    }
    public static float galonLitro(float v1){
        return v1*galon_litro;
    }
    public static float pulgadaCentrimetro(float v1){
        return v1*pulgada_centimetro;
    }
    public static float kiloLibra(float v1){
        return v1/libra_kilo;
    }
    public static float litroGalon(float v1){
        return v1/galon_litro;
    }
    public static float centimetroPulgada(float v1){
        return v1/pulgada_centimetro;
    }
}
