package br.com.i18n.resource;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourcesI18n {

    public static void main( String[] args ) {

        String key = "mano";
        String baseName = "MessagesBoundle";

        Locale l1 = Locale.ENGLISH;
        ResourceBundle rb = ResourceBundle.getBundle( baseName, l1 );
        System.out.println( rb.getString( key ) );

        Locale l2 = Locale.getDefault();
        ResourceBundle rb2 = ResourceBundle.getBundle( baseName, l2 );
        System.out.println( rb2.getString( key ) );

    }

}