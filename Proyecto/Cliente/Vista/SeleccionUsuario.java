package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SeleccionUsuario {

	private JFrame frame;
	private final JLabel lblNewLabel = new JLabel("New label");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SeleccionUsuario window = new SeleccionUsuario();
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
	public SeleccionUsuario() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		JButton btnEstudiante = new JButton("ESTUDIANTE");
		btnEstudiante.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				PrincipalEstudiante newframe = new PrincipalEstudiante();
				
				newframe.setVisible(true);
				
				this.dispose();				
			}

			private void dispose() {

			}
		});
		btnEstudiante.setFont(new Font("SquareFont", Font.PLAIN, 20));
		btnEstudiante.setBounds(65, 123, 253, 65);
		frame.getContentPane().add(btnEstudiante);
		
		JButton btnDocente = new JButton("DOCENTE");
		btnDocente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				PrincipalDocente docente = new PrincipalDocente();
				
				docente.setVisible(true);
				this.setVisible(false);
			
			}

			private void setVisible(boolean b) {

				
			}


		});
		btnDocente.setFont(new Font("SquareFont", Font.PLAIN, 20));
		btnDocente.setBounds(65, 212, 253, 65);
		
		JButton btnAnalista = new JButton("ANALISTA");
		btnAnalista.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				PrincipalAnalista newframe = new PrincipalAnalista();
				
				newframe.setVisible(true);
				
				this.dispose();				
			}

			private void dispose() {

			}
		});
		btnAnalista.setFont(new Font("SquareFont", Font.PLAIN, 20));
		btnAnalista.setBounds(65, 290, 253, 65);
		frame.getContentPane().add(btnAnalista);
		
		frame.getContentPane().add(btnDocente);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\UTEC\\Desktop\\interfaces\\TipoDeUsuario.png"));
		lblNewLabel.setBounds(0, 0, 400, 400);
		frame.getContentPane().add(lblNewLabel);
	
	}

	public void setVisible(boolean b) {
		
	}


}
