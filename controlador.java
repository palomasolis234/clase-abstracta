public class controlador {
    public static void main(String[] args) {
        // Ejecuta Reloj y Ejecutor en hilos separados
        new Thread(new Reloj()).start();
        new Thread(new Ejecutor("calc", 0)).start();
    }
}
