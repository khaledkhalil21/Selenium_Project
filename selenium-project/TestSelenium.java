import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelenium {
    public static void main(String[] args) {
        // Définir le chemin vers le ChromeDriver
        System.setProperty("webdriver.chrome.driver", "chemin/vers/ton/chromedriver");

        // Créer une instance du WebDriver (ici, Chrome)
        WebDriver driver = new ChromeDriver();

        // Ouvrir une page Web
        driver.get("https://www.google.com");

        // Afficher le titre de la page
        System.out.println("Titre de la page: " + driver.getTitle());

        // Fermer le navigateur
        driver.quit();
    }
}
