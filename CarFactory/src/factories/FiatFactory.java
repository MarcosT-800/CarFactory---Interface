/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factories;

import hatchcar.Hatch;
import hatchcar.Palio;
import sedancar.Sedan;
import sedancar.Siena;

/**
 * Cada fábrica de concreto amplia a fábrica básica e é responsável pela criação
 *produtos de uma única variedade.
 * @author FATEC ZONA LESTE
 */
public class FiatFactory implements CarFactory {

    @Override
    public Sedan buildSedancar() {
        return new Siena();
    }

    @Override
    public Hatch buldHathcar() {
        return new Palio();
    }
}
