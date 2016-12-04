/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mpeso;

import java.io.IOException;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

/**
 *
 * @author Reymundo Tenorio
 */
public class MPeso {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {

//        Connection.Response loginForm = Jsoup.connect("https://www.mpeso.net/datos/consulta.php")
//                .method(Connection.Method.POST)
//                .execute();

        Document document = Jsoup.connect("https://www.mpeso.net/datos/consulta.php")
                .data("_funcion", "1") //Funcion 1
                .data("_captcha", "5b39df") // Captcha introducido
                .data("_terminal", "01252143") // No. TUC
                .data("_codigo", "5b39df") //Codio del captcha
//                .cookies(loginForm.cookies())
                .post();
        
        

        System.out.println((Jsoup.parse(document.toString()).text()));

    }

// TODO code application logic here
}
