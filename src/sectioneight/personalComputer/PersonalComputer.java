package sectioneight.personalComputer;

public class PersonalComputer extends Product{
   private ComputerCase  computerCase;
   private Monitor monitor;
   private Motherboard motherboard;

    public PersonalComputer(String model, String manufacturer, ComputerCase computerCase,
                            Monitor monitor, Motherboard motherboard) {
        super(model, manufacturer);
        this.computerCase = computerCase;
        this.monitor = monitor;
        this.motherboard = motherboard;

    }
    private void drawLogo(){
        monitor.drawPixelAt(1200,50,"yellow");
    }
    void powerUp(){
        computerCase.pressPowerButton();
    }
}
