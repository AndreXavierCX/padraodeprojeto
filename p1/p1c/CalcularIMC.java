package p1c;
public class CalcularIMC {
    public static void main (String [] args){
        IMC calculador = new IMC();
        
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(calculador);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(calculador);
        IMCDisplay forecastDisplay = new IMCDisplay(calculador);
        
        calculador.setMeasurements(12, 250, 70.0f);
        calculador.setMeasurements(85, 100, 26.7f);
        calculador.setMeasurements(54, 120, 85.5f);
        
        
        
    }
}
