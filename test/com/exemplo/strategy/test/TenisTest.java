package com.exemplo.strategy.test;

import java.util.ArrayList;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import com.exemplo.concreteStrategy.TenisCasual;
import com.exemplo.concreteStrategy.TenisEcologico;
import com.exemplo.concreteStrategy.TenisExportivo;
import com.exemplo.context.Venda;

import static org.junit.Assert.*;

public class TenisTest {
	
	private Venda cadastraVenda;
	private ArrayList<String> dadosTenis;
	
	@Before
	public void inicia(){
		cadastraVenda = new Venda();
		cadastraVenda.cadastraProduto("marca: nike");
		cadastraVenda.cadastraProduto("cor: preto");
		cadastraVenda.cadastraProduto("número: 39");
	}
	
		
	@Test
	public void propriedadesTenisCasual(){
						
		dadosTenis = cadastraVenda.emissorDeVenda(new TenisCasual());
		
		assertTrue(dadosTenis.get(0).equals("Tenis Casual"));
		assertTrue(dadosTenis.get(1).equals("Ideal para usar na balada, ou para momentos de lazer e diversão"));
		assertTrue(dadosTenis.get(2).equals("Preco: "+70.50));
		assertTrue(dadosTenis.get(3).equals("Desconto a Vista: "+50.50));
		
		//propriedades padrão
		assertTrue(dadosTenis.get(4).equals("marca: nike"));
		assertTrue(dadosTenis.get(5).equals("cor: preto"));
		assertTrue(dadosTenis.get(6).equals("número: 39"));								
	}
	
	@Test
	public void propriedadesTenisExportivo(){
						
		dadosTenis = cadastraVenda.emissorDeVenda(new TenisExportivo());
		
		assertTrue(dadosTenis.get(0).equals("Tenis Exportivo"));
		assertTrue(dadosTenis.get(1).equals("Prátique o seu exporte favorito com conforto e segurança"));
		assertTrue(dadosTenis.get(2).equals("Preco: "+150.25));
		assertTrue(dadosTenis.get(3).equals("Desconto a Vista: "+140.00));
		
		//propriedades padrão
		assertTrue(dadosTenis.get(4).equals("marca: nike"));
		assertTrue(dadosTenis.get(5).equals("cor: preto"));
		assertTrue(dadosTenis.get(6).equals("número: 39"));
						
	}
	
	@Test
	public void propriedadesTenisEcologico(){
						
		dadosTenis = cadastraVenda.emissorDeVenda(new TenisEcologico());
		
		assertTrue(dadosTenis.get(0).equals("Tenis Ecológico"));
		assertTrue(dadosTenis.get(1).equals("Proteja o meio ambiente! Utilize um calçado biodegradável"));
		assertTrue(dadosTenis.get(2).equals("Preco: "+50.00));
		assertTrue(dadosTenis.get(3).equals("Desconto a Vista: "+45.00));
		
		//propriedades padrão
		assertTrue(dadosTenis.get(4).equals("marca: nike"));
		assertTrue(dadosTenis.get(5).equals("cor: preto"));
		assertTrue(dadosTenis.get(6).equals("número: 39"));
						
	}
	
	
	
	
	


}
