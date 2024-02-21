package pages;

public class GooglePage extends BasePage{

    private String searchButton = "//input[@value='Buscar con Google']";
    private String rechazarCookie = "//button[@id='W0wltc']";
    private String searchTextField = "//textarea[@id='APjFqb']";
    private String firstResult = "";

    public GooglePage(){
        super(driver);
    }

    public void navigateToGoogle(){

        navigateTo("https://www.google.com");
    }

    public void clickGoogleSearch(){
        clickElement(searchButton);
    }

    public void enterSearchCriteria(String criteria){
        clickElement(rechazarCookie);
        write(searchTextField, criteria);
    }

    public String firstResult(){
        return textFromElement(firstResult);
    }
}

