package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;


public class PrincipalDocente {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrincipalDocente window = new PrincipalDocente();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PrincipalDocente() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1280, 720);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnDatosPersonales = new JButton("Datos personales");
		btnDatosPersonales.setFont(new Font("SquareFont", Font.PLAIN, 20));
		btnDatosPersonales.setBounds(2, 196, 359, 106);
		frame.getContentPane().add(btnDatosPersonales);
		
		JButton btnReclamos = new JButton("Reclamos");
		btnReclamos.setFont(new Font("SquareFont", Font.PLAIN, 20));
		btnReclamos.setBounds(2, 310, 359, 106);
		frame.getContentPane().add(btnReclamos);
		
		JButton btnInasistencias = new JButton("Inasistencias");
		btnInasistencias.setFont(new Font("SquareFont", Font.PLAIN, 20));
		btnInasistencias.setBounds(2, 424, 359, 106);
		frame.getContentPane().add(btnInasistencias);
		
		JButton btnHome = new JButton("");
		btnHome.setIcon(new ImageIcon("C:\\Users\\UTEC\\Desktop\\iconos\\home.png"));
		btnHome.setBounds(8, 128, 60, 60);
		frame.getContentPane().add(btnHome);
		
		JButton btnLogout = new JButton("");
		btnLogout.setIcon(new ImageIcon("C:\\Users\\UTEC\\Desktop\\iconos\\logout.png"));
		btnLogout.setBounds(1198, 127, 60, 60);
		frame.getContentPane().add(btnLogout);
		
		JLabel lblPantallaDocente = new JLabel("New label");
		lblPantallaDocente.setIcon(new ImageIcon("C:\\Users\\UTEC\\Desktop\\interfaces\\Docente.png"));
		lblPantallaDocente.setBounds(0, 0, 1280, 720);
		frame.getContentPane().add(lblPantallaDocente);		

	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
}
