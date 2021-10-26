package com.appium.studio.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PesquisaTest extends BaseTest {

	@Test
	public void test() {
		homePage.irParaPaginaSearch();
		searchPage.selecionarCampoDePesquisa();
		searchPage.escreverPesquisa("blink182");
		searchPage.pressionarEnter();
		searchPage.resultadoEsperadoPesquisa();
	}

}
