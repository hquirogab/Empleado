package poo29ago;

public class POO29AGO {

    public static void main(String[] args) {
            Fecha fIngreso = new Fecha(29, 8, 2018);
            Fecha fNacimiento = new Fecha(5, 9, 1999);
            Empleado empleado1 = new Empleado("Jose", "Perez", fNacimiento);
            empleado1.setfIngreso(fIngreso);
            
            System.out.print("Nombre: ");
            System.out.println(empleado1.getNombre() + " " + empleado1.getApellido());
            System.out.print("Fecha de nacimiento: ");
            System.out.println(empleado1.getfNacimiento().getDia() + "/" + empleado1.getfNacimiento().getMes() + "/" + empleado1.getfNacimiento().getAño());
            System.out.print("Fecha de ingreso: ");
            System.out.println(empleado1.getfIngreso().getDia() + "/" + empleado1.getfIngreso().getMes() + "/" + empleado1.getfIngreso().getAño());
            
    }
}
