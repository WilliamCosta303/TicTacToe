package com.github.williamcosta303.utilitarios;

import java.io.*;

public class Arquivo {

    
    public Arquivo() {
        /*File pasta = new File("estat");
        if(!pasta.isDirectory()){
            pasta.mkdir();
        }*/
    }
    
    public void salvarArquivo(String conteudo){
        try{
            PrintWriter writer = new PrintWriter("estat.dat", "ISO-8859-1");
            writer.println(conteudo);
            writer.close();
        }catch (FileNotFoundException | UnsupportedEncodingException erro){
            erro.printStackTrace();
        }
    }
    
    public String lerArquivo(){
        String resultado = null;
        try(BufferedReader BR = new BufferedReader(new FileReader("estat.dat"))){
            resultado = BR.readLine();
        }catch(IOException IOE){
            resultado = "ERRO";
        }
        return resultado;
    }
    
}
