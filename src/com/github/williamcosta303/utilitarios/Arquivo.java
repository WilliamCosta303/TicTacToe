package com.github.williamcosta303.utilitarios;

import java.io.*;

/*
    Copyright (c) 2016, William A. Costa
    All rights reserved.

    Redistribution and use in source and binary forms, with or without
    modification, are permitted provided that the following conditions are met:
        * Redistributions of source code must retain the above copyright
          notice, this list of conditions and the following disclaimer.
        * Redistributions in binary form must reproduce the above copyright
          notice, this list of conditions and the following disclaimer in the
          documentation and/or other materials provided with the distribution.
        * Neither the name of the William A. Costa nor the
          names of its contributors may be used to endorse or promote products
          derived from this software without specific prior written permission.

    THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
    ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
    WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
    DISCLAIMED. IN NO EVENT SHALL WILLIAM A. COSTA BE LIABLE FOR ANY
    DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
    (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
    LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
    ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
    (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
    SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/

public class Arquivo {
    
    public void salvarArquivo(String conteudo){
        try(PrintWriter writer = new PrintWriter("estat.dat", "UTF-8")){
            writer.println(conteudo);
            writer.close();
        }catch (FileNotFoundException | UnsupportedEncodingException erro){
            System.out.println("Erro gerando arquivo");
        }
    }
    
    public String lerArquivo(){
        String resultado;
        try(BufferedReader BR = new BufferedReader(new FileReader("estat.dat"))){
            resultado = BR.readLine();
        }catch(IOException IOE){
            resultado = "ERRO";
        }
        return resultado;
    }
    
}
