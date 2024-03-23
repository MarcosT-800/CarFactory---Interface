/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factories;

import hatchcar.Gol;
import hatchcar.Hatch;
import sedancar.Sedan;
import sedancar.Voyage;

/**
* Cada fábrica de concreto amplia a fábrica básica e é responsável pela criação
* produtos de uma única variedade.
 */
public class VolksFactory implements CarFactory {

    @Override
    public Sedan buildSedancar() {
        return new Voyage();
    }

    @Override
    public Hatch buldHathcar() {
        return new Gol();
    }
}