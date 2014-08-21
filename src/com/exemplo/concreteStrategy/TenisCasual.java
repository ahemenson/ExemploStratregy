package com.exemplo.concreteStrategy;

import java.util.ArrayList;
import java.util.List;

import com.exemplo.strategy.Tenis;

public class TenisCasual implements Tenis{
	
	private List<String> propriedadesTenisCasual ;
	private float DescontoAVista;	
	private float preco;
	
	
	public TenisCasual(){
		propriedadesTenisCasual = new ArrayList<String>();
		setDescontoAVista(20.00f);
		setPreco(70.50f);
		
		incrementa();
	}
		
		
	@Override
	public ArrayList<String> propriedadesProduto(ArrayList<String> dadosProduto) {
		for(String d : propriedadesTenisCasual){
			dadosProduto.add(0, d);
		}
		return dadosProduto;
	}
	
	public void incrementa(){
	
		propriedadesTenisCasual.add("Desconto a Vista: "+(getPreco() - getDescontoAVista()));
		propriedadesTenisCasual.add("Preco: "+getPreco());
		propriedadesTenisCasual.add("Ideal para usar na balada, ou para momentos de lazer e diversão");
		propriedadesTenisCasual.add("Tenis Casual");
		
	}
	
	public float getDescontoAVista() {
		return DescontoAVista;
	}

	public void setDescontoAVista(float descontoAVista) {
		DescontoAVista = descontoAVista;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}
	

}
