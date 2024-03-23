/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemplojava;

import app.Application;
import factories.VolksFactory;
import factories.CarFactory;
import factories.FiatFactory;
import javax.swing.JOptionPane;

/**
 * O aplicativo escolhe o tipo de fábrica e o cria em tempo de execução (geralmente em
 * estágio de inicialização), dependendo da configuração ou ambiente
 *variáveis.
 * @author FATEC ZONA LESTE
 */
public class ExemploJava {

     private static Application configureApplication() {
//        Application app;
//        CarFactory factory;
//        String osName = System.getProperty("os.name").toLowerCase();
//        if (osName.contains("mac")) {
//            factory = new FiatFactory();
//        } else {
//            factory = new VolksFactory();
//        }
//        app = new Application(factory);
//        return app;
//    }

   int choose = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha o tipo de da marca: \n1 - Fiat\n2 - Volks")); 
   
    CarFactory factory;
    Application app;


   if(choose == 1) {
        factory = new FiatFactory();
   } else {
       factory = new VolksFactory();
   }
   
    app = new Application(factory);
    return app;
  }
     
    public static void main(String[] args) {
        Application app = configureApplication();
        app.showInformation();
    }
}
