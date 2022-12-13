package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PrincipalEstudiante {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrincipalEstudiante window = new PrincipalEstudiante();
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
	public PrincipalEstudiante() {
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
		btnDatosPersonales.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DatosPersonalesEst newframe = new DatosPersonalesEst();
				
				newframe.setVisible(true);
				
				this.dispose();				
			}

			private void dispose() {

			}
		});
		btnDatosPersonales.setFont(new Font("SquareFont", Font.PLAIN, 20));
		btnDatosPersonales.setBounds(2, 196, 359, 106);
		frame.getContentPane().add(btnDatosPersonales);
		
		JButton btnReclamos = new JButton("Reclamos");
		btnReclamos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ReclamoEst newframe = new ReclamoEst();
				
				newframe.setVisible(true);
				
				this.dispose();				
			}

			private void dispose() {

			}
		});
		btnReclamos.setFont(new Font("SquareFont", Font.PLAIN, 20));
		btnReclamos.setBounds(2, 310, 359, 106);
		frame.getContentPane().add(btnReclamos);
		
		JButton btnInasistencias = new JButton("Inasistencias");
		btnInasistencias.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				InasistenciaEst newframe = new InasistenciaEst();
				
				newframe.setVisible(true);
				
				this.dispose();				
			}

			private void dispose() {

			}
		});
		btnInasistencias.setFont(new Font("SquareFont", Font.PLAIN, 20));
		btnInasistencias.setBounds(2, 424, 359, 106);
		frame.getContentPane().add(btnInasistencias);
		
		JButton btnHome = new JButton("");
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				PrincipalEstudiante newframe = new PrincipalEstudiante();
				
				newframe.setVisible(true);
				
				this.dispose();				
			}

			private void dispose() {

			}
		});
		btnHome.setIcon(new ImageIcon("C:\\Users\\UTEC\\Desktop\\iconos\\home.png"));
		btnHome.setBounds(8, 127, 60, 60);
		frame.getContentPane().add(btnHome);
		
		JButton btnLogout = new JButton("");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Login newframe = new Login();
				
				newframe.setVisible(true);
				
				this.dispose();				
			}

			private void dispose() {

			}
		});
		btnLogout.setIcon(new ImageIcon("C:\\Users\\UTEC\\Desktop\\iconos\\logout.png"));
		btnLogout.setBounds(1198, 127, 60, 60);
		frame.getContentPane().add(btnLogout);
		
		JLabel lblPantallaEstudiante = new JLabel("New label");
		lblPantallaEstudiante.setIcon(new ImageIcon("C:\\Users\\UTEC\\Desktop\\interfaces\\PrincipalEstudiante.png"));
		lblPantallaEstudiante.setBounds(0, 0, 1280, 720);
		frame.getContentPane().add(lblPantallaEstudiante);		
		

	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
}
