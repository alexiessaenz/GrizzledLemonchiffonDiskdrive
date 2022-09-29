class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
  }
}

class Persona {
  int edad;
  String nombre;
  String telefono;

  public void setEdad(int edad){
    this.edad = edad;
  }

  public void setNombre(String nombre){
   this.nombre = nombre;
  }

  public void setTelefono(String telefono){
    this.telefono = telefono;
  }

  public int getEdad(){
    return edad;
  }
}