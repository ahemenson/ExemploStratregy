package com.exemplo.concreteStrategy;

import java.util.ArrayList;
import java.util.List;

import com.exemplo.strategy.Tenis;

public class TenisExportivo implements Tenis{

	
	private List<String> propriedadesTenisExportivo;
	private float DescontoAVista;	
	private float preco;
	
	
	public TenisExportivo(){
		propriedadesTenisExportivo = new ArrayList<String>();
		setDescontoAVista(10.25f);
		setPreco(150.25f);
		
		incrementa();
	}
		
		
	@Override
	public ArrayList<String> propriedadesProduto(ArrayList<String> dadosProduto) {
		for(String d : propriedadesTenisExportivo){
			dadosProduto.add(0, d);
		}
		return dadosProduto;
	}
	
	public void incrementa(){
	
		propriedadesTenisExportivo.add("Desconto a Vista: "+(getPreco() - getDescontoAVista()));
		propriedadesTenisExportivo.add("Preco: "+getPreco());
		propriedadesTenisExportivo.add("Prátique o seu exporte favorito com conforto e segurança");
		propriedadesTenisExportivo.add("Tenis Exportivo");
		
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
