/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan2;

/**
 *
 * @author Helmy Krisdin Garcia
 */
public class Mathinterface implements MatematikaInterface{
    @Override
    public void pertambahan(int a, int b){
        int tambah = a+b;
        System.out.println("Pertambahan:  "+ a + "+" + b + "="+tambah);
    }
    @Override
    public void pengurangan(int a, int b){
        int kurang = a-b;
        System.out.println("Pengurangan: "+ a + "-" + b + "="+kurang);
    }
    @Override
    public void perkalian(int a, int b){
        int kali = a*b;
        System.out.println("Perkalian: "+ a + "x" + b + "="+kali);
    }
    @Override
    public void pembagian(int a, int b){
        float bagi = (float) a/b;
        System.out.println("Pembagian: "+ a + "/" + b + "="+bagi);
    }
}
