/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import factories.CarFactory;
import hatchcar.Hatch;
import sedancar.Sedan;

/**
 *
 *
 * Os usuários da fábrica não se importam com qual fábrica de concreto eles usam, pois trabalham com
 * fábricas e produtos através de interfaces abstratas.
 */
public class Application {
    private Hatch hatch;
    private Sedan sedan;

    public Application(CarFactory factory) {
        hatch = factory.buldHathcar();
        sedan = factory.buildSedancar();
    }

    public void showInformation() {
        hatch.showHatchInformation();
        sedan.showSedanInformation();
    }
}