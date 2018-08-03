package juegoacciones;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.Color;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.SystemColor;

public class Tresenraya extends JFrame {

	private JPanel contentPane;
	private int jug;
	private int bandera;
	public int estado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tresenraya frame = new Tresenraya();
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	//metodos
	public int getJug() {
		return jug;
	}
	public void setJug(int jug){
		this.jug=jug;
	}
	
	//bandera
	public int getBandera() {
		return bandera;
	}
	public void setBandera(int ban){
		this.bandera=ban;
	}
	
	
	///
public int comprobarEstado() {
        
        AbstractButton b1 = null;
		AbstractButton b2 = null;
		if(b1.getText().equals("X"))
            return 1;
        
        else if(b1.getText().equals("O") && b2.getText().equals("O"))
            return 2;
        
        if (b1.getText().isEmpty() || b2.getText().isEmpty() )
            return 0;
        
        return 3;
    }

	/**
	 * Create the frame.
	 */
	public Tresenraya() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Harlericho\\eclipse-workspace\\Juegos\\tres-en-raya.jpg"));
		setResizable(false);
		setTitle("Juego 3 en raya");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 326, 410);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		jug=1;
	    bandera=1;
		
		JButton b2 = new JButton("");
		b2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(b2.getText().isEmpty()){
					
					if(getJug()==1){
						b2.setForeground(Color.black);
						b2.setText("X");
						if(getBandera()==2){
							setJug(2);
							System.out.println("turno: O");
						}
					}else {
					b2.setForeground(Color.red);
					b2.setText("O");
					setJug(1);
					System.out.println("turno: X");
				}
					bandera=comprobarEstado();
				
				}
			}
		});
		b2.setFont(new Font("Tahoma", Font.BOLD, 34));
		b2.setBounds(108, 48, 107, 91);
		contentPane.add(b2);
		
		JButton b1 = new JButton("");
		b1.setFont(new Font("Tahoma", Font.BOLD, 34));
		b1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(b1.getText().isEmpty()){
			
					if(getJug()==1){
						b1.setForeground(Color.black);
						b1.setText("X");
						if(getBandera()==2){
							setJug(2);
							System.out.println("turno: O");
						}
					}else {
					b1.setForeground(Color.red);
					b1.setText("O");
					setJug(1);
					System.out.println("turno: X");
				}
				
				}
			}
		});
		b1.setBounds(0, 48, 107, 91);
		contentPane.add(b1);
		
		JButton b3 = new JButton("3");
		b3.setFont(new Font("Tahoma", Font.BOLD, 34));
		b3.setBounds(217, 48, 107, 91);
		contentPane.add(b3);
		
		JButton b5 = new JButton("5");
		b5.setFont(new Font("Tahoma", Font.BOLD, 34));
		b5.setBounds(108, 139, 107, 91);
		contentPane.add(b5);
		
		JButton b6 = new JButton("6");
		b6.setFont(new Font("Tahoma", Font.BOLD, 34));
		b6.setBounds(217, 139, 107, 91);
		contentPane.add(b6);
		
		JButton b4 = new JButton("4");
		b4.setFont(new Font("Tahoma", Font.BOLD, 34));
		b4.setBounds(0, 139, 107, 91);
		contentPane.add(b4);
		
		JButton b8 = new JButton("8");
		b8.setFont(new Font("Tahoma", Font.BOLD, 34));
		b8.setBounds(108, 231, 107, 91);
		contentPane.add(b8);
		
		JButton b9 = new JButton("9");
		b9.setFont(new Font("Tahoma", Font.BOLD, 34));
		b9.setBounds(217, 231, 107, 91);
		contentPane.add(b9);
		
		JButton b7 = new JButton("7");
		b7.setFont(new Font("Tahoma", Font.BOLD, 34));
		b7.setBounds(0, 231, 107, 91);
		contentPane.add(b7);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 323, 320, 52);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel label1 = new JLabel("");
		label1.setIcon(new ImageIcon("C:\\Users\\Harlericho\\eclipse-workspace\\Juegos\\12.png"));
		label1.setBounds(51, 11, 32, 32);
		panel.add(label1);
		
		JLabel label2 = new JLabel("");
		label2.setIcon(new ImageIcon("C:\\Users\\Harlericho\\eclipse-workspace\\Juegos\\23.png"));
		label2.setBounds(180, 11, 32, 32);
		panel.add(label2);
		
		JLabel j1 = new JLabel("");
		j1.setBackground(Color.WHITE);
		j1.setBounds(81, 11, 66, 21);
		panel.add(j1);
		
		JLabel j2 = new JLabel("");
		j2.setBounds(206, 11, 72, 21);
		panel.add(j2);
		
		Entrada ent=new Entrada();
		j1.setText(ent.texto1);
		j2.setText(ent.texto2);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\Harlericho\\eclipse-workspace\\Juegos\\turn-notifications-on-button_icon-icons.com_72507.png"));
		label.setBounds(80, -1, 38, 38);
		contentPane.add(label);
		
		JLabel pant = new JLabel("New label");
		pant.setBounds(116, 11, 135, 25);
		contentPane.add(pant);
	}
}
