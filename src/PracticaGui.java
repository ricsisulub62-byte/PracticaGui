import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PracticaGui extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PracticaGui frame = new PracticaGui();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PracticaGui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnMaster = new JButton("Botón Master");
		btnMaster.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(btnMaster, "Hola desde el master");
			}
			
		});
		btnMaster.setBounds(65, 55, 131, 23);
		contentPane.add(btnMaster);
		
		JButton btnRama_R = new JButton("Botón Ricsi");
		btnRama_R.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(btnMaster, "Hola desde la rama de ricsi");
			}
		});
		btnRama_R.setBounds(82, 109, 89, 23);
		contentPane.add(btnRama_R);
		

		JButton btnNewButton = new JButton("Botón de Mich");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(btnMaster, "Hola desde la rama de mich");
				
			}
		});
		btnNewButton.setBounds(82, 143, 114, 22);
		contentPane.add(btnNewButton);

		JButton btnBotonLuz = new JButton("Boton Luz");
		btnBotonLuz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(btnMaster, "Hola desde la rama de luz");
			}
		});
		btnBotonLuz.setBounds(82, 161, 89, 23);
		contentPane.add(btnBotonLuz);
 master

	}
}
