package BinHexaConverter;

class converter {

    static void convertBinary(String binary){
        try{

            int decimalValue = Integer.parseInt(binary, 2);

            String hexaValue = Integer.toHexString(decimalValue);

            System.out.println(decimalValue + " " + hexaValue);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void convertDecimal(int decimal){
        try{

            String binaryValue = Integer.toBinaryString(decimal);

            String hexaValue = Integer.toHexString(decimal);

            System.out.println(binaryValue + " " + hexaValue);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void convertHexa(String hexa){
        try{

            int convertedHexa = Integer.parseInt(hexa, 16);

            String binaryValue = Integer.toBinaryString(convertedHexa);

            String decimalValue = Integer.toString(convertedHexa);

            System.out.println(binaryValue + " " + decimalValue);

        }catch (Exception e) {
            e.printStackTrace();
        }
    }

}
