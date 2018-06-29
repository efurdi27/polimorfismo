public class Entrenador extends SelecionFutbol{
  private int idFederacion;
  
  //constructor, getter y setter
  @Override 
  public void entrenamiento(){
    System.out.println("Dirige un entrenamiento (Clase Entrenador)");
   }
   @Override
   public void partidoFutbol() {
    System.out.println("Dirige un Partdio (Clase Entrenador)");
   }
   public void planificarEntrenamiento(){
   System.out.println("Planificar un Entrenamiento");
   }
}
  
