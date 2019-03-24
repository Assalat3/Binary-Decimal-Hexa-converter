import javafx.scene.control.TextField;

class converter {

    static void convertBinary(String binary, TextField base10, TextField hexa){
        try{

            int decimalValue = Integer.parseInt(binary, 2);

            String hexaValue = Integer.toHexString(decimalValue);

            base10.setText(Integer.toString(decimalValue));
            hexa.setText(hexaValue);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void convertDecimal(int decimal, TextField binary, TextField hexa){
        try{

            String binaryValue = Integer.toBinaryString(decimal);

            String hexaValue = Integer.toHexString(decimal);

            binary.setText(binaryValue);
            hexa.setText(hexaValue);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void convertHexa(String hexa, TextField binary, TextField decimal){
        try{

            int convertedHexa = Integer.parseInt(hexa, 16);

            String binaryValue = Integer.toBinaryString(convertedHexa);

            String decimalValue = Integer.toString(convertedHexa);

            binary.setText(binaryValue);
            decimal.setText(decimalValue);

        }catch (Exception e) {
            e.printStackTrace();
        }
    }

}
