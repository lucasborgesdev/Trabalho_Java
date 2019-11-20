/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhodejava;
import java.io.*;
import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class TrabalhoDeJava {
    
    static void criaPasta(){
        
        //
        Scanner teclado = new Scanner(System.in);
        int menu2;
        String nomePasta = "";       
        String diretorio = "C:\\lucas\\java\\"; 
        System.out.println("Voce deseja criar uma pasta local");
        System.out.println("Qual vai ser  nome da pasta");
        nomePasta = teclado.next();
        //Dar nome ao diretorio da pasta
        File file = new File(diretorio,nomePasta);
        //para criar a pasta 
        file.mkdir();
        System.out.println("Pasta criada com sucesso");
        System.out.println("Deseja apagar a pasta 1 para sim e 2 para não");
        menu2 = teclado.nextInt();
        if (menu2 == 1 ) {
            file.delete();            
        }
                
    }
    static void deletarPasta(){
        //tirar duvida com o provessor
        //File.delete();
    }
   
    
    static void criarArquivo(){
        Scanner teclado = new Scanner(System.in);
        String nomeArq;
        int menu3;
        String pontotxt = ".txt";
        String diretorio = "C:\\lucas\\java\\"; 
        System.out.println("1- Voce deseja criar um arquivo");
        System.out.println("2- Qual vai ser  nome do arquivo");
        nomeArq = teclado.next();
        //diretorio += nomeArq;
        System.out.println("diretorio");
        File arquivo = new File(diretorio,nomeArq);
        try {
            arquivo.createNewFile();
            System.out.println("Arquivo criado com sucesso!");
        } catch (Exception ex) {
            System.out.println("Erro");
        }
        System.out.println("Deseja apagar o arquivo 1 para sim e 2 para não");
        menu3 = teclado.nextInt();
        if (menu3 == 1) {
            arquivo.delete();
            
        }    
      
    }  
    
    static void LerArquivo(){
        File arquivo = new File("lucas.txt");
        
        try {
            FileReader ler = new FileReader(arquivo);
            BufferedReader lerb = new BufferedReader(ler);
            String linha = lerb.readLine();
            while (linha != null) {
                System.out.println(linha);
                linha = lerb.readLine();                
            }
                      
        } catch (Exception ex) {
            System.out.println("Não deu!");
        }
        
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int  menu;
        
        String nomePasta = " ";
        
        do { 
                System.out.println("Bem vindo");
                System.out.println("digite a opção");
                System.out.println("1- Criar pasta");
                System.out.println("2- Apagar pasta");
                System.out.println("3- Criar um arquivo");
                System.out.println("4- Ler um arquivo");
                menu = teclado.nextInt();
                if (menu == 1) {
                    criaPasta();
                
                }
                if(menu == 2){
                    
                }
                if(menu == 3){
                    criarArquivo();
                    
                }
                if (menu == 4) {
                    LerArquivo();
                    
                
            }
                
            
        } while (menu >5);
    }
    
}
