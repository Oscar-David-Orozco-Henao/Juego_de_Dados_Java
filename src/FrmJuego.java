import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
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
        lblTitulo1.setHorizontalAlignment(SwingConstants.CENTER);
        getContentPane().add(lblTitulo1); // Show titulo

        JLabel lblTitulo2 = new JLabel("Cenas");
        // Mostrar imagen (ubicación imagen - alto y ancho de la imagen)
        lblTitulo2.setBounds(160 + 2 * Imagen.getIconWidth(), 10, 100, 25);
        lblTitulo2.setHorizontalAlignment(SwingConstants.CENTER);
        getContentPane().add(lblTitulo2); // Show titulo

        JLabel lblLanzamientos = new JLabel();
        lblLanzamientos.setBounds(50 + 2 * Imagen.getIconWidth(), 40, 100, 100);
        lblLanzamientos.setBackground(new Color(0, 0, 0));
        lblLanzamientos.setForeground(new Color(51, 255, 0));
        lblLanzamientos.setFont(new Font("Tahoma", 1, 72));
        lblLanzamientos.setText("0");
        lblLanzamientos.setHorizontalAlignment(SwingConstants.RIGHT);
        lblLanzamientos.setOpaque(true);
        getContentPane().add(lblLanzamientos);

        JLabel lblCenas = new JLabel();
        lblCenas.setBounds(160 + 2 * Imagen.getIconWidth(), 40, 100, 100);
        lblCenas.setBackground(new Color(0, 0, 0));
        lblCenas.setForeground(new Color(51, 255, 0));
        lblCenas.setFont(new Font("Tahoma", 1, 72));
        lblCenas.setText("0");
        lblCenas.setHorizontalAlignment(SwingConstants.RIGHT);
        lblCenas.setOpaque(true);
        getContentPane().add(lblCenas);

        JButton btnIniciar = new JButton("iniciar");
        btnIniciar.setBounds(10, 15 + Imagen.getIconHeight(), 100, 25);
        getContentPane().add(btnIniciar);

        JButton btnLanzar = new JButton("Lanzar");
        btnLanzar.setBounds(10, 15 + Imagen.getIconHeight(), 100, 25);
        getContentPane().add(btnLanzar);

    }
}
