/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factories;

import hatchcar.Hatch;
import sedancar.Sedan;

/**
 * A fábrica abstrata conhece todos os tipos de produtos (abstratos).
 * @author FATEC ZONA LESTE
 */
public interface CarFactory {
    Hatch buldHathcar();
    Sedan buildSedancar();
}