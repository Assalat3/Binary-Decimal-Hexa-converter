package BinHexaConverter;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class gui extends Application {

    public static void main(String[] args) {

        launch(args);

    }

    @Override
    public void start(Stage primaryStage) {

        //Windowsize
        final int WINDOWWIDTH = 200;
        final int WINDOWHEIGHT = 350;
        //Windowsize done

        //Setup
        primaryStage.setTitle("Binary-Hexadecimal-Base10 converter");
        VBox layout = new VBox(5);
        layout.setAlignment(Pos.BASELINE_CENTER);
        Scene primaryScene = new Scene(layout, WINDOWWIDTH, WINDOWHEIGHT);
        //Setup done

        //Labels, Textfields for input, buttons
        ToggleGroup conversionType = new ToggleGroup();

        RadioButton rbnBin = new RadioButton("Binary");
        rbnBin.setToggleGroup(conversionType);
        RadioButton rbnBase10 = new RadioButton("Decimal");
        rbnBase10.setToggleGroup(conversionType);
        RadioButton rbnHexa = new RadioButton("Hexadecimal");
        rbnHexa.setToggleGroup(conversionType);

        Label lblType = new Label("Conversion from:");
        Label lblBin = new Label("Binary value:");
        Label lblBase10 = new Label("Decimal value:");
        Label lblHexa = new Label("Hexadecimal value:");

        TextField txfBin = new TextField();
        txfBin.setEditable(false);
        TextField txfBase10 = new TextField();
        txfBase10.setEditable(false);
        TextField txfHexa = new TextField();
        txfHexa.setEditable(false);

        Button btnConvert = new Button("Convert");
        Button btnClear = new Button("Clear");
        Button btnClose = new Button("Close");

        rbnBin.setOnAction(e -> binaryConversion(txfBin, txfBase10, txfHexa));
        rbnBase10.setOnAction(e -> decimalConversion(txfBin, txfBase10, txfHexa));
        rbnHexa.setOnAction(e -> hexaConversion(txfBin, txfBase10, txfHexa));

        //Textfield size
        final int textFieldWidth = 185;
        txfBin.setMaxWidth(textFieldWidth);
        txfBase10.setMaxWidth(textFieldWidth);
        txfHexa.setMaxWidth(textFieldWidth);

        //Button size
        final int buttonWidth = 100;
        btnConvert.setMaxWidth(buttonWidth);
        btnConvert.setOnAction(e ->{
            if (conversionType.getSelectedToggle() == rbnBin){
                converter.convertBinary(txfBin.getText());
            } else if (conversionType.getSelectedToggle() == rbnBase10){
                converter.convertDecimal(Integer.parseInt(txfBase10.getText()));
            } else if (conversionType.getSelectedToggle() == rbnHexa){
                converter.convertHexa(txfHexa.getText());
            }
        });

        btnClear.setMaxWidth(buttonWidth);


        btnClose.setMaxWidth(buttonWidth);
        btnClose.setOnAction(e -> primaryStage.close());

        //Labels, Textfields for input, buttons done


        //add labels, textfields and buttons to layout
        layout.getChildren().addAll(
                lblType, rbnBin, rbnBase10, rbnHexa,
                lblBin, txfBin,
                lblBase10, txfBase10,
                lblHexa, txfHexa,
                btnConvert, btnClear, btnClose
        );

        //Setup
        primaryStage.setScene(primaryScene);
        primaryStage.show();
        //Setup done

    }

    private static void binaryConversion(TextField bin, TextField base10, TextField hexa){
        bin.setDisable(false);
        bin.setEditable(true);
        base10.setDisable(true);
        base10.setEditable(false);
        base10.setText("");
        hexa.setDisable(true);
        hexa.setEditable(false);
        hexa.setText("");
    }

    private static void decimalConversion(TextField bin, TextField base10, TextField hexa){
        bin.setDisable(true);
        bin.setEditable(false);
        bin.setText("");
        base10.setDisable(false);
        base10.setEditable(true);
        hexa.setDisable(true);
        hexa.setEditable(false);
        hexa.setText("");
    }

    private static void hexaConversion(TextField bin, TextField base10, TextField hexa){
        bin.setDisable(true);
        bin.setEditable(false);
        bin.setText("");
        base10.setDisable(true);
        base10.setEditable(false);
        base10.setText("");
        hexa.setDisable(false);
        hexa.setEditable(true);
    }

}
