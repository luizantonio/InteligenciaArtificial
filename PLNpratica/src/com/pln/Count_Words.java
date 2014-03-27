package com.pln;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

class Count_Words {
	List<ObjectWord> quantidades = new ArrayList<ObjectWord>();// armazena objetos e quantidades
	//Daclara o mapa que vai conter as palavras chaves com suas quantidades
	Map<String,Integer> palavrasContar = new HashMap<String,Integer>();// armazena palavras e quantidades
	int Totalwords = 0;
    public  void lerArquivo(){
    	try
    	{
    		// Lê o arquivo no diretório
    		File f = new File("words.txt");
			Scanner br = new Scanner(f);
			// inicializa a variavel
    		String string  = "";
    		while ( br.hasNext()) {
    			string = br.next();
    			// parada quando não tem mais palavras no arquivo
    			if(string == "^z" || string == "^Z" || string == null){break;}
    			//Insere no map a chave e atualiza a quantidade
    			else if(!palavrasContar.containsKey(string)){
    				palavrasContar.put(string, 1);    			
    			}else{
    				palavrasContar.put(string, palavrasContar.get(string)+1);
    			}
    		}    	
    	}catch(IOException e1){
    		System.out.println(e1);
    	}
    }
    public void armazenarObjeto(){
    	ObjectWord words;
    	// imprime as chaves e suas quantidades
    	// print keys and your counts
    	for(String key : palavrasContar.keySet()) {
    	System.out.println(key+" "+palavrasContar.get(key));
    		words = new ObjectWord(key, palavrasContar.get(key));
    		quantidades.add(words);
    	}
    }
    public void imprimir(){
    	ObjectWord wordsIt;
    	// Tem que ordenar os objetos
    	// para descobrir qual o maior
    	Iterator it = quantidades.iterator();
    	while(it.hasNext()){
    		wordsIt = (ObjectWord) it.next();
    		System.out.println(wordsIt.getKey() + " // " + wordsIt.getValue());
    	}
    }
    public void totalWords(){
    	ObjectWord wordsIt;
    	// Tem que ordenar os objetos
    	// para descobrir qual o maior
    	Iterator it = quantidades.iterator();
    	while(it.hasNext()){
    		wordsIt = (ObjectWord) it.next();
    		Totalwords += wordsIt.getValue();    		
    	}
    	System.out.println("#Total:  " + Totalwords);
    }
    
    public void percorreQTDE(){
    	List<ObjectWord> percorreQ = new ArrayList<ObjectWord>();
    	percorreQ = quantidades;
    	ObjectWord wordsQ;
    	int numero = (int) ( 1 + Math.random()*Totalwords);
    	System.out.println("#Número:  " + numero );
    	int cotagem = 1;
    	
    	Iterator it = quantidades.iterator();
    	for(int i = 0 ; i < Totalwords; i++){
    		while(it.hasNext()){
        		//wordsQ = (ObjectWord) it.next();
        		
        	}
    	}
    	
    	/*while(it.hasNext()){
    		wordsQ = (ObjectWord) it.next();	
    	}*/
    	
    }
}