/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan2;

/**
 *
 * @author Helmy Krisdin Garcia
 */
public class Bingo {
    public Bingo() {
        String bingo = "B-I-N-G-O";
        String clap = "(clap)";
        StringBuilder sb;
        
        for (int i = 0; i <= 5; i++) {
            printVerse();

            sb = new StringBuilder();
            for (int j = 0; j < i; j++) {
                sb.append(clap).append("-");
            }
            for (int k = i; k < 5; k++) {
                sb.append(bingo.charAt(k * 2)); // Mengambil huruf dari "B-I-N-G-O"
                if (k < 4) sb.append("-");
            }

            // Menampilkan bagian dengan "clap"
            printChorus(sb.toString());
        }
    }
    
    private void printVerse() {
        System.out.println("There was a farmer who had a dog,");
        System.out.println("And Bingo was his name-o.");
        System.out.println("B-I-N-G-O");
        System.out.println("B-I-N-G-O");
        System.out.println("B-I-N-G-O");
        System.out.println("And Bingo was his name-o.");
    }

    // Method untuk mencetak bagian chorus dengan 'clap'
    private void printChorus(String chorus) {
        System.out.println("There was a farmer who had a dog,");
        System.out.println("And Bingo was his name-o.");
        System.out.println(chorus);
        System.out.println(chorus);
        System.out.println(chorus);
        System.out.println("And Bingo was his name-o.");
    }
}
