public abstract class SeleccionFutbol{

protected int id;
protected String nombre;
protected String apellidos;
protected int edad;

//constructores,getter y setter

   public void viajar(){
   System.out.println("Viajar (Clase Padre)");
}
   public void concentrarse(){
   System.out.println("Concentrarse (Clase Padre)");
}
     public abstract void entrenamiento();

     public void partidoFutbol(){
     System.out.println("Asiste al Partido de Futbol(Clase Padre)");
 }

}
