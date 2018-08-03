package juegoacciones;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;

public class Entrada extends JFrame {

	private JPanel contentPane;
	private JTextField nom1;
	private JTextField nom2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Entrada frame = new Entrada();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public static String texto1="";
	public static String texto2="";
	public Entrada() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Harlericho\\eclipse-workspace\\Juegos\\tres-en-raya.jpg"));
		setTitle("Tres en Raya");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 295, 270);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnAcercaDe = new JMenu("Opcion");
		menuBar.add(mnAcercaDe);
		
		JMenuItem limpiarmenu = new JMenuItem("Limpiar");
		limpiarmenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nom1.setText("");
				nom2.setText("");
			}
		});
		
		mnAcercaDe.add(limpiarmenu);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel l1 = new JLabel("");
		l1.setIcon(new ImageIcon("C:\\Users\\Harlericho\\eclipse-workspace\\Juegos\\12.png"));
		l1.setBounds(83, 61, 32, 42);
		contentPane.add(l1);
		
		JLabel l2 = new JLabel("");
		l2.setIcon(new ImageIcon("C:\\Users\\Harlericho\\eclipse-workspace\\Juegos\\23.png"));
		l2.setBounds(83, 103, 32, 42);
		contentPane.add(l2);
		
		nom1 = new JTextField();
		nom1.setBounds(116, 75, 86, 20);
		contentPane.add(nom1);
		nom1.setColumns(10);
		
		nom2 = new JTextField();
		nom2.setColumns(10);
		nom2.setBounds(116, 114, 86, 20);
		contentPane.add(nom2);
		
		JButton jugar = new JButton("");
		jugar.setIcon(new ImageIcon("C:\\Users\\Harlericho\\eclipse-workspace\\Juegos\\flecha.png"));
		jugar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(nom1.getText().equals("") || nom2.getText().equals("")) {
					System.out.println("error");
					JOptionPane.showMessageDialog(null, "Debe ingresar nombres de usuarios\npara empezar el juego", "Juego tres en raya", JOptionPane.WARNING_MESSAGE);
				}else {
					System.out.println("no error");
					texto1=nom1.getText();
					texto2=nom2.getText();
					Tresenraya tres=new Tresenraya();
					tres.setVisible(true);
					tres.setLocationRelativeTo(null);
					dispose();
				}
			}
		});
		jugar.setBounds(120, 162, 54, 33);
		contentPane.add(jugar);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Harlericho\\eclipse-workspace\\Juegos\\3.png"));
		lblNewLabel.setBounds(83, 8, 32, 42);
		contentPane.add(lblNewLabel);
		
		JLabel lblEnRaya = new JLabel("3 EN RAYA");
		lblEnRaya.setForeground(Color.GRAY);
		lblEnRaya.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblEnRaya.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnRaya.setBounds(103, 21, 103, 25);
		contentPane.add(lblEnRaya);
	}
}
