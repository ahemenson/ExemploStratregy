package com.exemplo.concreteStrategy;

import java.util.ArrayList;
import java.util.List;

import com.exemplo.strategy.Tenis;

public class TenisEcologico implements Tenis {
	
	private List<String> propriedadesTenisEcologico;
	private float DescontoAVista;	
	private float preco;
	
	
	public TenisEcologico(){
		propriedadesTenisEcologico = new ArrayList<String>();
		setDescontoAVista(5.00f);
		setPreco(50.00f);
		
		incrementa();
	}
		
		
	@Override
	public ArrayList<String> propriedadesProduto(ArrayList<String> dadosProduto) {
		for(String d : propriedadesTenisEcologico){
			dadosProduto.add(0, d);
		}
		return dadosProduto;
	}
	
	public void incrementa(){
	
		propriedadesTenisEcologico.add("Desconto a Vista: "+(getPreco() - getDescontoAVista()));
		propriedadesTenisEcologico.add("Preco: "+getPreco());
		propriedadesTenisEcologico.add("Proteja o meio ambiente! Utilize um calçado biodegradável");
		propriedadesTenisEcologico.add("Tenis Ecológico");
		
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
