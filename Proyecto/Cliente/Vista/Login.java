package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login {

	private JFrame frame;
	private JTextField UsuarioLoginField;
	private JTextField RegNombreField;
	private JTextField RegContraField;
	private JTextField RegUserField;
	private JTextField RegITRField;
	private JTextField RegTelefonoField;
	private JTextField RegLocalidadField;
	private JTextField RegDepartamentoField;
	private JTextField RegDocumentoField;
	private JTextField RegMaikField;
	private JTextField RegNacimientoField;
	private JTextField RegApellidoField;
	private JPasswordField passwordLoginField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
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
	public Login() {
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
		
		RegNombreField = new JTextField();
		RegNombreField.setBounds(175, 270, 151, 23);
		frame.getContentPane().add(RegNombreField);
		RegNombreField.setColumns(10);
		
		RegApellidoField = new JTextField();
		RegApellidoField.setBounds(175, 301, 151, 23);
		frame.getContentPane().add(RegApellidoField);
		RegApellidoField.setColumns(10);
		
		RegNacimientoField = new JTextField();
		RegNacimientoField.setBounds(175, 332, 151, 23);
		frame.getContentPane().add(RegNacimientoField);
		RegNacimientoField.setColumns(10);
		
		RegMaikField = new JTextField();
		RegMaikField.setBounds(175, 363, 151, 23);
		frame.getContentPane().add(RegMaikField);
		RegMaikField.setColumns(10);
		
		RegDocumentoField = new JTextField();
		RegDocumentoField.setBounds(175, 394, 151, 23);
		frame.getContentPane().add(RegDocumentoField);
		RegDocumentoField.setColumns(10);
		
		RegDepartamentoField = new JTextField();
		RegDepartamentoField.setBounds(175, 425, 151, 23);
		frame.getContentPane().add(RegDepartamentoField);
		RegDepartamentoField.setColumns(10);
		
		RegLocalidadField = new JTextField();
		RegLocalidadField.setBounds(175, 456, 151, 23);
		frame.getContentPane().add(RegLocalidadField);
		RegLocalidadField.setColumns(10);
		
		RegTelefonoField = new JTextField();
		RegTelefonoField.setBounds(175, 487, 151, 23);
		frame.getContentPane().add(RegTelefonoField);
		RegTelefonoField.setColumns(10);
		
		RegITRField = new JTextField();
		RegITRField.setBounds(175, 518, 151, 23);
		frame.getContentPane().add(RegITRField);
		RegITRField.setColumns(10);
		
		RegUserField = new JTextField();
		RegUserField.setBounds(175, 549, 151, 23);
		frame.getContentPane().add(RegUserField);
		RegUserField.setColumns(10);
		
		RegContraField = new JTextField();
		RegContraField.setBounds(175, 580, 151, 23);
		frame.getContentPane().add(RegContraField);
		RegContraField.setColumns(10);
		
		UsuarioLoginField = new JTextField();
		UsuarioLoginField.setBounds(551, 141, 180, 31);
		frame.getContentPane().add(UsuarioLoginField);
		UsuarioLoginField.setColumns(10);
		
	
		
		
		passwordLoginField = new JPasswordField();
		passwordLoginField.setBounds(823, 141, 180, 31);
		frame.getContentPane().add(passwordLoginField);
		
		JButton btnIngresar = new JButton(">");
		btnIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SeleccionUsuario ingresar = new SeleccionUsuario();
				ingresar.setVisible(true);
				this.setVisible(false);
				
			
			}

			private void setVisible(boolean b) {
				
			}

		});
		btnIngresar.setForeground(new Color(0, 0, 0));
		btnIngresar.setBackground(new Color(51, 204, 255));
		btnIngresar.setBounds(1011, 141, 48, 31);
		frame.getContentPane().add(btnIngresar);
		
		JButton btnRegistrar = new JButton("Registrarte");
		btnRegistrar.setFont(new Font("SquareFont", Font.PLAIN, 15));
		btnRegistrar.setBounds(66, 621, 215, 40);
		frame.getContentPane().add(btnRegistrar);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\UTEC\\Desktop\\interfaces\\login.png"));
		lblNewLabel.setBounds(0, 0, 1280, 720);
		frame.getContentPane().add(lblNewLabel);		
			
	}

	public void setVisible(boolean b) {
		
	}
}