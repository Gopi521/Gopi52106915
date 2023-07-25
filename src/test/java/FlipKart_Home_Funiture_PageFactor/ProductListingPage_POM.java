package FlipKart_Home_Funiture_PageFactor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class ProductListingPage_POM {
    WebDriver driver;
    @FindBy(xpath = ".//div[contains(text(),'Home')]")
    WebElement MouseHover_HomeCategory;
    @FindBy(xpath = ".//a[contains(text(),'Home Furnishings')]")
    WebElement Home_Furnishings;
    @FindBy(xpath = ".//a[contains(text(),'Bed Linens')]")
    WebElement Bed_Linens;
    @FindBy(xpath = "(//div[@class='_3FPh42'])[1]")
    WebElement CustomerRating;
    @FindBy(xpath = "(//div[@class='_2d0we9'])[1]")
    WebElement Offers;
    @FindBy(xpath = "(//div[@class='_24_Dny'])[1]")
    WebElement Rating_4;
    @FindBy(xpath = "(//div[@class='_24_Dny'])[2]")
    WebElement Rating_3;
    @FindBy(xpath = "(//div[@class='_24_Dny'])[3]")
    WebElement Rating_2;
    @FindBy(xpath = "(//div[@class='_24_Dny'])[4]")
    WebElement Rating_1;
    @FindBy(xpath = ".//div[contains(text(),'Buy More, Save More')]")
    WebElement BuyMore_SaveMore_CheckBox;
    @FindBy(xpath = "(//div[@class='_24_Dny'])[6]")
    WebElement No_Cost_EMI_CheckBox;
    @FindBy(xpath = "(//div[@class='_24_Dny'])[7]")
    WebElement Special_Price_CheckBox;

    @FindBy(xpath = "//section[@class='_167Mu3 _2hbLCH'][4]")
    WebElement Availability;
    @FindBy(xpath = ".//div[contains(text(),'Include Out of Stock')]")
    WebElement Select_out_of_Stock;
    @FindBy(xpath = "//section[@class='_167Mu3 _2hbLCH'][5]")
    WebElement Discount;
    @FindBy(xpath = ".//div[contains(text(),'80% or more')]")
    WebElement discountField;
    @FindBy(xpath = ".//div[contains(text(),'70% or more')]")
    WebElement discountField1;
    @FindBy(xpath = ".//div[contains(text(),'60% or more')]")
    WebElement discountField2;
    @FindBy(xpath = ".//div[contains(text(),'50% or more')]")
    WebElement discountField3;
    @FindBy(xpath = ".//div[contains(text(),'40% or more')]")
    WebElement discountField4;
    @FindBy(xpath = "//section[@class='_167Mu3 _2hbLCH'][6]")
    WebElement GST_Invoice;
    @FindBy(xpath = "(.//div[contains(text(),'GST Invoice Available')])[2]")
    WebElement GSTInvoiceAvailable;
    @FindBy(xpath = "//section[@class='_167Mu3 _2hbLCH'][7]")
    WebElement ValuePack;
    //@FindBy(xpath = "(.//div[contains(text(),'Value Pack')])[2]")
    @FindBy(xpath = "(//div[@class='_24_Dny'])[8]")
    WebElement ValuePackCheckBox;
    @FindBy(xpath = "//section[@class='_167Mu3 _2hbLCH'][8]")
    WebElement Color;
    @FindBy(xpath = ".//div[contains(text(),'Black')]")
    WebElement BlackColor;
    @FindBy(xpath = ".//div[contains(text(),'Blue')]")
    WebElement BlueColor;
    @FindBy(xpath = "//div[@class='_24_Dny _3tCU7L']")
    WebElement FlipkartAssured;
    @FindBy(xpath = ".//span[contains(text(),'Clear all')]")
    WebElement ClearAll;

    public ProductListingPage_POM(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements (driver, this);
    }

    public void ValidateHomeAndFurnitureCategory() {
        Actions actions = new Actions (driver);
        WebElement menuOption = MouseHover_HomeCategory;
        actions.moveToElement (menuOption).build ().perform ();

    }

    public void ValidateHome_FurnishingsSubcategory() {
        Actions actions = new Actions (driver);
        WebElement subMenuOption = Home_Furnishings;
        actions.moveToElement (subMenuOption).build ().perform ();
        actions.moveToElement (subMenuOption).pause (Duration.ofSeconds (10));
    }

    public void ValidateBed_LinensSubcategory() {
        Actions actions = new Actions (driver);
        //WebElement ProductListingPage = Bed_Linens;
        actions.moveToElement (Bed_Linens).build ().perform ();
        Bed_Linens.click ();
    }

    public void ValidateFlipkartAssField(){
        Actions actions=new Actions (driver);
        WebElement AssField=FlipkartAssured;
        actions.scrollToElement (CustomerRating).build ().perform ();
        driver.manage ().timeouts ().implicitlyWait (Duration.ofSeconds (10));
        AssField.click ();
    }

    public void ValidateCustomer4StarRatingCheckBoxField() {
        Actions actions = new Actions (driver);
        WebElement Rating = Rating_4;
        actions.scrollToElement (Offers).build ().perform ();
        driver.manage ().timeouts ().implicitlyWait (Duration.ofSeconds (10));
        Rating.click ();
    }

    public void ValidateCustomer3StarRatingCheckBoxField() {
        Actions actions = new Actions (driver);
        WebElement Rating = Rating_3;
        actions.scrollToElement (Offers).build ().perform ();
        driver.manage ().timeouts ().implicitlyWait (Duration.ofSeconds (10));
        Rating.click ();
    }

    public void ValidateCustomer2starRatingCheckBoxField() {
        Actions actions = new Actions (driver);
        WebElement Rating = Rating_2;
        actions.scrollToElement (Offers).build ().perform ();
        driver.manage ().timeouts ().implicitlyWait (Duration.ofSeconds (10));
        Rating.click ();
    }
    public void ValidateCustomer1StarRatingCheckBoxField() {
        Actions actions = new Actions (driver);
        WebElement Rating = Rating_1;
        actions.scrollToElement (Offers).build ().perform ();
        driver.manage ().timeouts ().implicitlyWait (Duration.ofSeconds (10));
        Rating.click ();
    }
    public void ValidateCustomerClearAllFilters() {
        Actions actions = new Actions (driver);
        WebElement Filters = ClearAll;
        actions.scrollToElement (Filters).build ().perform ();
        driver.manage ().timeouts ().implicitlyWait (Duration.ofSeconds (10));
        Filters.click ();
    }

    public void ValidateBuyMore_SaveMore_CheckBoxField() {
        Actions actions = new Actions (driver);
        WebElement CheckBoxField = BuyMore_SaveMore_CheckBox;
        actions.scrollToElement (CheckBoxField).build ().perform ();
        driver.manage ().timeouts ().implicitlyWait (Duration.ofSeconds (10));
        CheckBoxField.click ();
    }

    public void ValidateNo_Cost_EMI_CheckBoxField() {
        Actions actions = new Actions (driver);
        WebElement CheckBoxField = No_Cost_EMI_CheckBox;
        actions.scrollToElement (CheckBoxField).build ().perform ();
        driver.manage ().timeouts ().implicitlyWait (Duration.ofSeconds (10));
        CheckBoxField.click ();
    }

    public void ValidateSpecial_Price_CheckBoxField() {
        Actions actions = new Actions (driver);
        WebElement CheckBoxField = Special_Price_CheckBox;
        actions.scrollToElement (CheckBoxField).build ().perform ();
        driver.manage ().timeouts ().implicitlyWait (Duration.ofSeconds (10));
        CheckBoxField.click ();
    }
    public void Validate_AvailabilityDropdownField(){
        Actions actions=new Actions (driver);
        WebElement DropdownField = Availability;
        actions.scrollToElement (DropdownField).build ().perform ();
        driver.manage ().timeouts ().implicitlyWait (Duration.ofSeconds (10));
        DropdownField.click ();
    }
    public void ValidateAvailability_CheckboxField(){
        Actions actions=new Actions (driver);
        WebElement DropdownField = Select_out_of_Stock;
        actions.scrollToElement (DropdownField).build ().perform ();
        driver.manage ().timeouts ().implicitlyWait (Duration.ofSeconds (10));
        DropdownField.click ();
    }
    public void Validate_DiscountDropdownField(){
        Actions actions=new Actions (driver);
        WebElement DropdownField = Discount;
        actions.scrollToElement (DropdownField).build ().perform ();
        driver.manage ().timeouts ().implicitlyWait (Duration.ofSeconds (10));
        DropdownField.click ();
    }
    public void Validate_Click80PCTDiscountField(){
        Actions actions=new Actions (driver);
        WebElement DiscountField = discountField;
        actions.scrollToElement (DiscountField).build ().perform ();
        driver.manage ().timeouts ().implicitlyWait (Duration.ofSeconds (10));
        DiscountField.click ();
    }
    public void Validate_Click70PCTDiscountField(){
        Actions actions=new Actions (driver);
        WebElement DiscountField = discountField1;
        actions.scrollToElement (DiscountField).build ().perform ();
        driver.manage ().timeouts ().implicitlyWait (Duration.ofSeconds (10));
        DiscountField.click ();
    }
    public void Validate_Click60PCTDiscountField(){
        Actions actions=new Actions (driver);
        WebElement DiscountField = discountField2;
        actions.scrollToElement (DiscountField).build ().perform ();
        driver.manage ().timeouts ().implicitlyWait (Duration.ofSeconds (10));
        DiscountField.click ();
    }
    public void Validate_Click50PCTDiscountField(){
        Actions actions=new Actions (driver);
        WebElement DiscountField = discountField3;
        actions.scrollToElement (DiscountField).build ().perform ();
        driver.manage ().timeouts ().implicitlyWait (Duration.ofSeconds (10));
        DiscountField.click ();
    }
    public void Validate_Click40PCTDiscountField(){
        Actions actions=new Actions (driver);
        WebElement DiscountField = discountField4;
        actions.scrollToElement (DiscountField).build ().perform ();
        driver.manage ().timeouts ().implicitlyWait (Duration.ofSeconds (10));
        DiscountField.click ();
    }
    public void Validate_GST_InvoiceDropdownField(){
        Actions actions=new Actions (driver);
        WebElement DropdownField = GST_Invoice;
        actions.scrollToElement (DropdownField).build ().perform ();
        driver.manage ().timeouts ().implicitlyWait (Duration.ofSeconds (10));
        DropdownField.click ();
    }
    public void Validate_GST_InvoiceCheckboxField(){
        Actions actions=new Actions (driver);
        WebElement CheckBoxField = GSTInvoiceAvailable;
        actions.scrollToElement (CheckBoxField).build ().perform ();
        driver.manage ().timeouts ().implicitlyWait (Duration.ofSeconds (10));
        CheckBoxField.click ();
    }
    public void Validate_ValuePackDropdownField(){
        Actions actions=new Actions (driver);
        WebElement DropdownField = ValuePack;
        actions.scrollToElement (DropdownField).build ().perform ();
        driver.manage ().timeouts ().implicitlyWait (Duration.ofSeconds (10));
        DropdownField.click ();
    }
    public void Validate_ValuePackCheckboxField(){
        Actions actions=new Actions (driver);
        WebElement CheckboxField = ValuePackCheckBox;
        actions.scrollToElement (CheckboxField).build ().perform ();
        driver.manage ().timeouts ().implicitlyWait (Duration.ofSeconds (10));
        CheckboxField.click ();
    }
    public void Validate_ColourDropdownField(){
        Actions actions=new Actions (driver);
        WebElement DropdownField = Color;
        actions.scrollToElement (DropdownField).build ().perform ();
        driver.manage ().timeouts ().implicitlyWait (Duration.ofSeconds (10));
        DropdownField.click ();
    }
    public void Validate_BlackColourCheckBoxField(){
        Actions actions=new Actions (driver);
        WebElement CheckBoxField = BlackColor;
        actions.scrollToElement (CheckBoxField).build ().perform ();
        driver.manage ().timeouts ().implicitlyWait (Duration.ofSeconds (10));
        CheckBoxField.click ();
    }
    public void Validate_BlueColourCheckBoxField(){
        Actions actions=new Actions (driver);
        WebElement CheckBoxField = BlueColor;
        actions.scrollToElement (CheckBoxField).build ().perform ();
        driver.manage ().timeouts ().implicitlyWait (Duration.ofSeconds (10));
        CheckBoxField.click ();
    }
}
