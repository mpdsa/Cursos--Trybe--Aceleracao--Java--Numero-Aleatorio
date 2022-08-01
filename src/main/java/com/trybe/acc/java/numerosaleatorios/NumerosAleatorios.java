package com.trybe.acc.java.numerosaleatorios;

import java.util.Random;

/** Classe Números Aleatórios. */
public class NumerosAleatorios {
  
  /** Método principal para a execução do código. */
  public static void main(String[] args) {
    int resultado = numeroAleatorio(); 
    
    while (resultado != 4) {
      imprime(resultado);
      
      resultado = numeroAleatorio(); 
    }
    
    if (resultado == 4) {
      imprime(resultado);
    }
    
  }

  // Chame a função escrevendo `imprime()`.
  static void imprime(int numero) {
    System.out.println(numero);
  }

  // Chame a função escrevendo `numeroAleatorio()`.
  static int numeroAleatorio() {
    return numerosAleatorios.entreUmECinco();
  }

  static NumerosAleatorios numerosAleatorios = new NumerosAleatorios();

  int entreUmECinco() {
    return new Random().nextInt(5) + 1;
  }
  
}
