/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.chiriboga.business;

import java.util.Random;

/**
 *
 * @author Alexander Chiriboga
 */
public class BaseAlgorithms {
    
    public long countHalves(long size){
        long count = 0;
        while(size > 1){
           size /= 2;
           count++;
        }
        return count;
    }
    
    public int buildMatrix(long size)
    {
        int matrizSize = (int) size;
        long [][] matriz = new long[matrizSize][matrizSize];
        Random randValue = new Random();
        int sum = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = randValue.nextInt(matrizSize) + 1;
                sum +=matriz[i][j];
                
            }
        }
        return sum;
    }

    public long totalSumLoopAlg(long size) {
        System.out.println("Size: " + size);
        long sum = 0;
        for (long i = 1; i <= size; i++) {
            sum += i;
        }
        return sum;
    }
   
    public long algebraicSumAlg(long num){
        long total = 0;
        total = (num * (num + 1)) / 2;
        return total;
    }
    
    public String CountBottomToTop(long point){
        for (long i = 0; i < point; i++) {
            System.out.println("Valor: " + i);
        }
        for (long j = point; j >= 0; j--) {
            System.out.println("Valor: " + j);
        }
        return "¡Algoritmo terminado! 🔥 \n He contado desde el incio hasta el final y viceversa.";
    }
    
    
    public void showMatrixIndices(int index) {
        for(int i = 0; i < index; i++){
            for(int j = 0; j < index; j++){
                System.out.println("Posiciones de la matriz:\t" + i + " " + j);
            }
        }
    }
    
    
    public String getTotalSumLoopAlg(){
        return """
               public int SumaConBucle(int size) {
                    int sum = 0;
                    for (int i = 1; i < size; i++) {
                        sum += i;
                    }
                    return sum;
                }
               """;
    }
    
    public String getTotalSumAlgebraicAlg(){
        return """
               public int SumaAlgebraica(int num){
                    int total = 0;
                    total = (num * (num + 1)) / 2;
                    return total;
                }
               """;
    }
    
    public String getDoubleLoopAlg(){
        return """
               public String CountBottomToTop(long point){
                       for (long i = 0; i < point; i++) {
                           System.out.println("Valor: " + i);
                       }
                       for (long j = point; j >= 0; j--) {
                           System.out.println("Valor: " + j);
                       }
                       return "¡Algoritmo terminado! 🔥 He contado desde el incio hasta el final y viceversa ";
                }
               """;
    }
    
    
    public String getSumMatrix() {
        return """
               public int buildMatrix(long size)
                   {
                       int matrizSize = (int) size;
                       long [][] matriz = new long[matrizSize][matrizSize];
                       Random randValue = new Random();
                       int sum = 0;
                       for (int i = 0; i < matriz.length; i++) {
                           for (int j = 0; j < matriz.length; j++) {
                               matriz[i][j] = randValue.nextInt(matrizSize) + 1;
                               sum +=matriz[i][j];
                               
                           }
                       }
                       return sum;
                   }
               """;
    }
}
