package com.pln;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Count_Words {
public static void main(String[] args) {
	//Daclara o mapa que vai conter as palavras chaves com suas quantidades
	Map<String,Integer> palavrasContar = new HashMap<String,Integer>();

    try
    {
    	// Lê o arquivo no diretório
    	File f = new File("words.txt");
		Scanner br = new Scanner(f);
    	
    	String string  = "";
    	while ( br.hasNext()) {
    		string = br.next();
    		// parada quando não tem mais palavras no arquivo
    		if(string == "^z" || string == "^Z" || string == null){break;}
    		//Insere no map a chave e atualiza a quantidade
    		else if(!palavrasContar.containsKey(string)){
    			palavrasContar.put(string,1);    			
    		}else{
    			palavrasContar.put(string,palavrasContar.get(string)+1);
    		}

    	}
    	
    }catch(IOException e1){
        System.out.println(e1);
    }
    
    // imprime as chaves e suas quantidades
    // print keys and your counts
    for(String key : palavrasContar.keySet()) {
    	System.out.println(key+" "+palavrasContar.get(key));
    }
    
    
  }
}