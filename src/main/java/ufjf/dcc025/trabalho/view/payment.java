package ufjf.dcc025.trabalho.view;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;

import javax.swing.JOptionPane;

import ufjf.dcc025.trabalho.model.BankAccount;
import ufjf.dcc025.trabalho.model.Movement;
import ufjf.dcc025.trabalho.model.Payment;

/*
  @autores: Ant�nio Marcos Souza Pereira - 202065245A
            Pedro Barbosa Chaves - 202065236A
            Rafaela Fernandes Horta - 202065182A
            Vin�cius de Oliveira Corbelli - 202065093A
 */

public class payment extends javax.swing.JFrame {

	public payment(BankAccount bank) {
		initComponents(bank);
	}

	public void close() {
		WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
		Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
	}

	@SuppressWarnings("unchecked")
	private void initComponents(BankAccount bank) {

		jLabel6 = new javax.swing.JLabel();
		jButton1 = new javax.swing.JButton();
		jLabel4 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		jLabel9 = new javax.swing.JLabel();
		jPasswordField4 = new javax.swing.JPasswordField();
		jLabel7 = new javax.swing.JLabel();
		jPanel1 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jLabel8 = new javax.swing.JLabel();
		jTextCodigo = new javax.swing.JFormattedTextField();
		jTextField5 = new javax.swing.JTextField();
		jLabel10 = new javax.swing.JLabel();

		jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
		jLabel6.setForeground(new java.awt.Color(140, 92, 242));
		jLabel6.setText("XBANK");

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

		jButton1.setBackground(new java.awt.Color(140, 92, 242));
		jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		jButton1.setForeground(new java.awt.Color(240, 240, 240));
		jButton1.setText("Confirmar Pagamento");
		jButton1.setBorderPainted(false);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt, bank);
            }
        });

		jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		jLabel4.setForeground(new java.awt.Color(140, 92, 242));
		jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
		jLabel4.setText("Voltar");
		jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jLabel4MouseClicked(evt, bank);
			}
		});

		jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
		jLabel5.setText("Codigo de barras");

		jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
		jLabel9.setText("Senha");

		jLabel7.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
		jLabel7.setForeground(new java.awt.Color(140, 92, 242));
		jLabel7.setText("XBANK");

		jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

		jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		jLabel1.setText("Saldo em conta");

		jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		jLabel8.setText("R$ " + bank.getStatement());

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(jLabel1)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(jLabel8).addGap(20, 20, 20)));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						jPanel1Layout.createSequentialGroup()
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(jLabel1).addComponent(jLabel8))
								.addContainerGap()));

		try {
			jTextCodigo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(
					new javax.swing.text.MaskFormatter("#####.##### #####.###### #####.###### # ##############")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}

		jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
		jLabel10.setText("Informe o valor");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addGap(10, 10, 10).addComponent(jPanel1,
						javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(layout.createSequentialGroup().addGroup(layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup().addGap(10, 10, 10).addComponent(jLabel7,
								javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(layout.createSequentialGroup().addGap(10, 10, 10).addComponent(jLabel4,
								javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(layout.createSequentialGroup().addGap(137, 137, 137).addComponent(jButton1,
								javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(layout.createSequentialGroup().addContainerGap()
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(layout.createSequentialGroup().addGap(66, 66, 66)
												.addComponent(jLabel9).addGap(18, 18, 18).addComponent(
														jPasswordField4, javax.swing.GroupLayout.PREFERRED_SIZE, 244,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
												layout.createSequentialGroup().addComponent(jLabel10).addGap(18, 18, 18)
														.addComponent(jTextField5,
																javax.swing.GroupLayout.PREFERRED_SIZE, 245,
																javax.swing.GroupLayout.PREFERRED_SIZE))))
						.addGroup(layout.createSequentialGroup().addGap(45, 45, 45).addComponent(jTextCodigo,
								javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(45, Short.MAX_VALUE))
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
						.addGap(0, 0, Short.MAX_VALUE).addComponent(jLabel5).addGap(186, 186, 186)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup().addGap(11, 11, 11)
				.addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28,
						javax.swing.GroupLayout.PREFERRED_SIZE)
				.addGap(18, 18, 18)
				.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
						javax.swing.GroupLayout.PREFERRED_SIZE)
				.addGap(53, 53, 53).addComponent(jLabel5)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addComponent(
						jTextCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
				.addGap(44, 44, 44)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 39,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(jLabel10))
				.addGap(29, 29, 29)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(jPasswordField4, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(jLabel9))
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
				.addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45,
						javax.swing.GroupLayout.PREFERRED_SIZE)
				.addGap(40, 40, 40).addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
						javax.swing.GroupLayout.PREFERRED_SIZE)
				.addContainerGap()));

		pack();
	}

	private void jLabel4MouseClicked(java.awt.event.MouseEvent evt, BankAccount bank) {
		close();
		index menu = new index(bank);
		menu.setVisible(true);
	}

	private void jButton1MouseClicked(java.awt.event.MouseEvent evt, BankAccount bank) {
		
		if (!(jTextCodigo.getText().equals("") || jTextField5.getText().equals("")
				|| jPasswordField4.getText().equals(""))) {
			if (jPasswordField4.getText().equals(bank.getClient().getPassword())) {

				Movement moviment = new Payment();
				moviment.setValue(Double.parseDouble(jTextField5.getText()));

				JOptionPane.showMessageDialog(null,
						moviment.transfer(bank, Double.parseDouble(jTextField5.getText()), "pagamento", false));
				bank.updateFile();

				close();
				payment menu = new payment(bank);
				menu.setVisible(true);
			} else {
				JOptionPane.showMessageDialog(null, "Senha incorreta!");
			}
		} else {
			JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
		}
	}

	private javax.swing.JButton jButton1;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPasswordField jPasswordField4;
	private javax.swing.JFormattedTextField jTextCodigo;
	private javax.swing.JTextField jTextField5;
}
