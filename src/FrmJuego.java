import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

//extends es para Heredar
public class FrmJuego extends JFrame {

    public FrmJuego() {
        setSize(500, 300);
        setTitle("Juguemos a los dados");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);// Cuando cierre la ventana, salga del programa
        setLayout(null); // anula la distribuión por defecto de la ventana

        // Declarando objeto de la clase JLbale y se está instanciando
        JLabel lblDado1 = new JLabel();
        // Variable imagen
        String nombreImagen = "/Imagenes/1.jpg";
        // cargar imagen
        ImageIcon Imagen = new ImageIcon(getClass().getResource(nombreImagen));
        // Asignar imagen
        lblDado1.setIcon(Imagen);
        // Mostrar imagen (ubicación imagen - alto y ancho de la imagen)
        lblDado1.setBounds(10, 10, Imagen.getIconWidth(), Imagen.getIconHeight());
        getContentPane().add(lblDado1); // Show dado

        JLabel lblDado2 = new JLabel();
        // Asignar imagen
        lblDado2.setIcon(Imagen);
        // Mostrar imagen (ubicación imagen - alto y ancho de la imagen)
        lblDado2.setBounds(10 + Imagen.getIconWidth(), 10, Imagen.getIconWidth(), Imagen.getIconHeight());
        getContentPane().add(lblDado2); // Show dado

        JLabel lblTitulo1 = new JLabel("Lanzamientos");
        // Mostrar imagen (ubicación imagen - alto y ancho de la imagen)
        lblTitulo1.setBounds(50 + 2 * Imagen.getIconWidth(), 10, 100, 25);
        getContentPane().add(lblTitulo1); // Show dado

        JLabel lblTitulo2 = new JLabel("Cenas");
        // Mostrar imagen (ubicación imagen - alto y ancho de la imagen)
        lblTitulo2.setBounds(160 + 2 * Imagen.getIconWidth(), 10, 100, 25);
        getContentPane().add(lblTitulo2); // Show dado

    }
}
