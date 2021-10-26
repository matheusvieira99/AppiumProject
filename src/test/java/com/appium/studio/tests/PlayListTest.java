package com.appium.studio.tests;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PlayListTest extends BaseTest{

	@Test
	public void test() throws IOException {
		homePage.irParaPaginaSearch();
		searchPage.selecionarCampoDePesquisa();
		searchPage.escreverPesquisa("dark and gothic");
		searchPage.pressionarEnter();
		searchPage.clicarNaPlaylist();
		searchPage.acionarBtnPlay();
		searchPage.tirarScreenshot();
		searchPage.resultadoEsperadoPlaylist();
	}

}
