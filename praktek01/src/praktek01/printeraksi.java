/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktek01;

/**
 *
 * @author USER
 */
public class printeraksi {
   public static void main(String[] args){
        printer led = new printer();
        printer laserjet = new printer();
        printer plotter = new printer();
        
        led.merk="canon";
        led.harga=650.000;
        led.jenis="ink jet";
        led.kualitas="baik";
        led.type="ip2770";
        
       
        laserjet.merk="epson";
        laserjet.harga=1000.000;
        laserjet.jenis="dot matrix";
        laserjet.kualitas="sangat baik";
        laserjet.type="epsonl30";
        
        plotter.merk="hp";
        plotter.harga=1.500;
        plotter.jenis="ink jet";
        plotter.kualitas="baik";
        plotter.type="hp230";
   }
      
}
