
/**
 * Write a description of class DisplayFechayHora here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DisplayFechayHora
{
    // instance variables - replace the example below with your own
    private NumberDisplay minutos;
    private NumberDisplay horas;
    private DisplayDosDigitos dia;
    private DisplayDosDigitos mes;
    private DisplayDosDigitos anyo;
    private String displayString;

    /**
     * Constructor for objects of class DisplayFechayHora
     */
    public DisplayFechayHora()
    {
        // initialise instance variables
        minutos = new NumberDisplay(60);
        horas = new NumberDisplay(24);
        dia = new DisplayDosDigitos(31);
        mes = new DisplayDosDigitos(13);
        anyo = new DisplayDosDigitos(100);
        updateDisplay();
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    
   
   public void fijarHorayFecha(int nuevaHora, int nuevoMinuto, int nuevoDia, int nuevoMes, int nuevoAnyo)
    {
        horas.setValue(nuevaHora);
        minutos.setValue(nuevoMinuto);
        dia.setValor(nuevoDia);
        mes.setValor(nuevoMes);
        anyo.setValor(nuevoAnyo);
        updateDisplay(); 
        
    }
  
   public void avanzarMomento()
   {
       minutos.increment();
       if(minutos.getValue() == 0){
           horas.increment();
           if(horas.getValue() == 0){
               dia.incrementaValor();
               if(dia.getValor() == 1){
            //Si estamos aqui es que hay que hacer avanzar al mes
                    mes.incrementaValor();
                    if(mes.getValor() == 1){
                //Si estamos aqui es que hay que hacer avanzar el aÃ±o
                        anyo.incrementaValor();
                    }   
               }
           }
       }
        
       updateDisplay(); 
        
   }
    
   
   public String getMomento()
   {
       return displayString;
   }
    
   private void updateDisplay()

    {
        displayString = horas.getDisplayValue() + ":" + minutos.getDisplayValue() + " " + dia.getValorDelDisplay() + "/" + mes.getValorDelDisplay() + "/" + anyo.getValorDelDisplay();

    }
}
