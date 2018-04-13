import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JScrollBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import java.awt.Toolkit;

public class HelpWindow extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			HelpWindow dialog = new HelpWindow();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public HelpWindow() {
		setTitle("Help");
		setIconImage(Toolkit.getDefaultToolkit().getImage(HelpWindow.class.getResource("/Rot1/zg.png")));
		setBounds(100, 100, 450, 372);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(Color.DARK_GRAY);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JButton okButton = new JButton("Ok");
			okButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			okButton.setBounds(156, 299, 133, 23);
			contentPanel.add(okButton);
		}
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 11, 414, 277);
		contentPanel.add(scrollPane_1);
		
		JTextPane textHelp = new JTextPane();
		textHelp.setBorder(null);
		textHelp.setEditable(false);
		scrollPane_1.setViewportView(textHelp);
		textHelp.setFont(new Font("RuneScape UF", Font.PLAIN, 18));
		textHelp.setForeground(Color.WHITE);
		textHelp.setBackground(Color.DARK_GRAY);
		textHelp.setText("This tool helps you learn zulrah rotations by displaying the rotation during your encounter.\r\n\r\nHOW IT WORKS:\r\n- Zulrah will always spawn as depicted in the top left of the app, in RANGE (GREEN) form\r\n\r\n- As the fight progresses, click on the respective form Zulrah takes to see which rotation you are currently encountering.\r\n\r\nNOTE: The rotation that contains MELEE (RED) Zulrah first requires one extra click depending on where the RANGED (GREEN) Zulrah spawns.");
	}
}
