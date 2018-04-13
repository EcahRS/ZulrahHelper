import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JSplitPane;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JSeparator;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JToolBar;
import javax.swing.JLayeredPane;
import javax.swing.SpringLayout;
import javax.swing.JTable;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Component;
import javax.swing.border.EtchedBorder;
import java.awt.Toolkit;

public class RotationWindow {

	private JFrame frmZulrahHelperby;
	private JLabel lblNewLabel;
	private JButton MeleePhaseButton;
	private JButton RangePhaseButton;
	private JButton MagePhaseButton;
	private JLabel MeleeMagePic;
	private JButton rangeTop;
	private JButton rangeBot;
	private JPanel panel;
	private JButton resetButton;
	private JLabel Rotation1;
	private JLabel Rotation2;
	private JLabel Rotation3;
	private JLabel Rotation4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RotationWindow window = new RotationWindow();
					window.frmZulrahHelperby.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public RotationWindow() {
		initialize();
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmZulrahHelperby = new JFrame();
		frmZulrahHelperby.setIconImage(Toolkit.getDefaultToolkit().getImage(RotationWindow.class.getResource("/Rot1/zg.png")));
		frmZulrahHelperby.setTitle("Zulrah Helper [Created by Ecah]");
		frmZulrahHelperby.getContentPane().setBackground(Color.DARK_GRAY);
		frmZulrahHelperby.setBackground(Color.DARK_GRAY);
		frmZulrahHelperby.setBounds(100, 100, 692, 443);
		frmZulrahHelperby.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmZulrahHelperby.getContentPane().setLayout(null);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(68, 11, 122, 106);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		frmZulrahHelperby.getContentPane().add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon(RotationWindow.class.getResource("/Rot1/START.png")));
		
		resetButton = new JButton("Reset");
		resetButton.setBorderPainted(false);
		resetButton.setForeground(Color.WHITE);
		resetButton.setBackground(Color.DARK_GRAY);
		resetButton.setFont(new Font("RuneScape UF", Font.PLAIN, 48));
		resetButton.setBounds(200, 11, 477, 106);
		resetButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmZulrahHelperby.dispose();
				RotationWindow window = new RotationWindow();
				window.frmZulrahHelperby.setVisible(true);

			}
		});
		frmZulrahHelperby.getContentPane().add(resetButton);
		
		panel = new JPanel();
		panel.setBounds(10, 117, 1257, 605);
		panel.setBackground(Color.DARK_GRAY);
		panel.setLayout(null);
		frmZulrahHelperby.getContentPane().add(panel);
		
		MeleePhaseButton = new JButton("");
		MeleePhaseButton.setBorderPainted(false);
		MeleePhaseButton.setBackground(Color.DARK_GRAY);
		MeleePhaseButton.setBounds(64, 11, 135, 156);
		panel.add(MeleePhaseButton);
		MeleePhaseButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JButton mFC = new JButton("");
				mFC.setIcon(new ImageIcon(RotationWindow.class.getResource("/Rot1/2.png")));
				MeleePhaseButton.setVisible(false);
				RangePhaseButton.setVisible(false);
				MagePhaseButton.setVisible(false);
				MeleeMagePic.setVisible(true);
				rangeTop.setVisible(true);
				rangeBot.setVisible(true);
				
			
			}
		});
		
		
		MeleePhaseButton.setIcon(new ImageIcon(RotationWindow.class.getResource("/Rot1/1.png")));
		
		RangePhaseButton = new JButton("");
		RangePhaseButton.setBorderPainted(false);
		RangePhaseButton.setBackground(Color.DARK_GRAY);
		RangePhaseButton.setBounds(247, 11, 151, 156);
		panel.add(RangePhaseButton);
		RangePhaseButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MeleePhaseButton.setVisible(false);
				RangePhaseButton.setVisible(false);
				MagePhaseButton.setVisible(false);
				Rotation3.setVisible(true);
			}
		});
		RangePhaseButton.setIcon(new ImageIcon(RotationWindow.class.getResource("/Rot3/1.png")));
		
		MagePhaseButton = new JButton("");
		MagePhaseButton.setBorderPainted(false);
		MagePhaseButton.setBackground(Color.DARK_GRAY);
		MagePhaseButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MeleePhaseButton.setVisible(false);
				MagePhaseButton.setVisible(false);
				RangePhaseButton.setVisible(false);
				Rotation4.setVisible(true);
			}
		});
		MagePhaseButton.setBounds(439, 11, 163, 156);
		panel.add(MagePhaseButton);
		MagePhaseButton.setIcon(new ImageIcon(RotationWindow.class.getResource("/Rot4/1.png")));
		
		MeleeMagePic = new JLabel("");
		MeleeMagePic.setBounds(64, 11, 135, 156);
		MeleeMagePic.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(MeleeMagePic);
		MeleeMagePic.setVisible(false);
		MeleeMagePic.setIcon(new ImageIcon(RotationWindow.class.getResource("/Rot1/2.png")));
		
		rangeTop = new JButton("");
		rangeTop.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		rangeTop.setBackground(Color.DARK_GRAY);
		rangeTop.setBounds(247, 11, 151, 156);
		panel.add(rangeTop);
		rangeTop.setVisible(false);
		rangeTop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MeleeMagePic.setVisible(false);
				rangeBot.setVisible(false);
				Rotation1.setVisible(true);
				rangeTop.setVisible(false);
			}
		});
		rangeTop.setIcon(new ImageIcon(RotationWindow.class.getResource("/Rot1/3.png")));
		
		rangeBot = new JButton("");
		rangeBot.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		rangeBot.setBackground(Color.DARK_GRAY);
		rangeBot.setBounds(439, 11, 163, 156);
		panel.add(rangeBot);
		rangeBot.setVisible(false);
		rangeBot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MeleeMagePic.setVisible(false);
				rangeBot.setVisible(false);
				Rotation2.setVisible(true);
				rangeTop.setVisible(false);
			}
		});
		rangeBot.setIcon(new ImageIcon(RotationWindow.class.getResource("/Rot2/3.png")));
		
		JButton btnHowDoesThis = new JButton("Help");
		HelpWindow help = new HelpWindow();
		help.setVisible(false);
		btnHowDoesThis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(help.isVisible()) {
					
				}
				else {
				help.setVisible(true);
				}
				
			}
		});
		
		Rotation4 = new JLabel("");
		Rotation4.setHorizontalAlignment(SwingConstants.CENTER);
		Rotation4.setBounds(0, -35, 655, 349);
		panel.add(Rotation4);
		Rotation4.setVisible(false);
		Rotation4.setIcon(new ImageIcon(RotationWindow.class.getResource("/Rot4/GmMGLkh.png")));
		
		Rotation1 = new JLabel("");
		Rotation1.setHorizontalAlignment(SwingConstants.CENTER);
		Rotation1.setBounds(0, 0, 506, 271);
		panel.add(Rotation1);
		Rotation1.setVisible(false);
		Rotation1.setIcon(new ImageIcon(RotationWindow.class.getResource("/Rot1/smallTest.png")));
		
		Rotation2 = new JLabel("");
		Rotation2.setHorizontalAlignment(SwingConstants.CENTER);
		Rotation2.setBounds(0, 0, 519, 303);
		panel.add(Rotation2);
		Rotation2.setVisible(false);
		Rotation2.setIcon(new ImageIcon(RotationWindow.class.getResource("/Rot2/bNcLMA9.png")));
		
		Rotation3 = new JLabel("");
		Rotation3.setAlignmentY(Component.TOP_ALIGNMENT);
		Rotation3.setHorizontalTextPosition(SwingConstants.CENTER);
		Rotation3.setBounds(0, 0, 527, 345);
		panel.add(Rotation3);
		Rotation3.setVisible(false);
		Rotation3.setIcon(new ImageIcon(RotationWindow.class.getResource("/Rot3/rota3.png")));
		btnHowDoesThis.setBounds(560, 254, 95, 23);
		panel.add(btnHowDoesThis);
	}
}
