package br.com.alura.leilao.bids;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LancesPage {

    private static final String URL_LANCES = "http://localhost:8080/leilao/2";

    private WebDriver browser;

    public LancesPage() {
        this.browser = new ChromeDriver();
        this.browser.navigate().to(URL_LANCES);
    }

    public boolean isPaginaAtual() {
        return browser.getCurrentUrl().contains(URL_LANCES);
    }

    public boolean isTituloLeilaoVisivel() {
        return browser.getPageSource().contains("Dados do Leilão");
    }

    public void fechar() {
        this.browser.quit();
    }

}
