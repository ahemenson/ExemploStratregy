package com.exemplo.context;

import java.util.ArrayList;
import java.util.List;

import com.exemplo.strategy.Tenis;



public class Venda {
	
	private ArrayList<String> dadosProduto;
	
	public Venda() {
		this.dadosProduto = new ArrayList<String>();
	}
	
	public void cadastraProduto(String dado){
			dadosProduto.add(dado);
	}
	
	
		
	public ArrayList<String> emissorDeVenda(Tenis tenis){
				
				return tenis.propriedadesProduto(dadosProduto);
	} 
	
	
	

}
