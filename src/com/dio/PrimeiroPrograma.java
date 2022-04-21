package com.dio;

import com.dio.model.Gato;
public class PrimeiroPrograma {
    public static void main(String[] args){
        Gato gato = new Gato();
        System.out.println(gato);

        Livro livro1 = new Livro("O problema dos três corpos", 300);
        System.out.println(livro1);

        /*System.out.println("Hello World!")*/
    }
 }

   class Livro {
   private String name;
   private Integer numberpag;
       private Object livro1;


       public Livro(String name, Integer numberpag) {
           this.name = name;
           this.numberpag = numberpag;
       }

       public String getName() {
           return name;
       }

       public void setName(String name) {
           this.name = name;
       }

       public Integer getNumberpag() {
           return numberpag;
       }

       public void setNumberpag(Integer numberpag) {
           this.numberpag = numberpag;
       }

       @Override
       public String toString() {
           return "Livro{" +
                   "name='" + name + '\'' +
                   ", numberpag=" + numberpag +
                   '}';
       }

       public Object getLivro1() {
           return livro1;
       }

       public void setLivro1(Livro livro) {
           this.livro1 = livro1;
       }
   }
