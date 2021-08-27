package ufjf.dcc025.trabalho.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

import ufjf.dcc025.trabalho.model.BankAccount;

/*
  @autores: Antônio Marcos Souza Pereira - 202065245A
            Pedro Barbosa Chaves - 202065236A
            Rafaela Fernandes Horta - 202065182A
            Vinícius de Oliveira Corbelli - 202065093A
 */

public class clients extends javax.swing.JFrame {

	public clients(BankAccount bank) {
		initComponents(bank);
	}

	public void close() {
		WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
		Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
	}

	@SuppressWarnings("unchecked")
	private void initComponents(BankAccount bank) {

		jLabel6 = new javax.swing.JLabel();
		jPanel5 = new javax.swing.JPanel();
		jLabel15 = new javax.swing.JLabel();
		jLabel16 = new javax.swing.JLabel();
		jLabel17 = new javax.swing.JLabel();
		jLabel18 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jLabel7 = new javax.swing.JLabel();
		jPanel1 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jLabel8 = new javax.swing.JLabel();
		jPanel3 = new javax.swing.JPanel();
		jLabel10 = new javax.swing.JLabel();
		jLabel11 = new javax.swing.JLabel();
		jLabel12 = new javax.swing.JLabel();
		jScrollPane1 = new javax.swing.JScrollPane();

		jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
		jLabel6.setForeground(new java.awt.Color(140, 92, 242));
		jLabel6.setText("Banco XXXXX");

		jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

		jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
		jLabel15.setText("10");

		jLabel16.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
		jLabel16.setText("JUL");

		jLabel17.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
		jLabel17.setText("R$ 00,00");

		jLabel18.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		jLabel18.setText("Pix");

		javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
		jPanel5.setLayout(jPanel5Layout);
		jPanel5Layout.setHorizontalGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel5Layout.createSequentialGroup().addGap(18, 18, 18)
						.addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jLabel15).addComponent(jLabel16))
						.addGap(52, 52, 52)
						.addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jLabel18).addComponent(jLabel17))
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		jPanel5Layout.setVerticalGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel5Layout.createSequentialGroup()
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING)
								.addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(jLabel15)))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel16).addComponent(jLabel18))
						.addContainerGap()));

		jLabel2.setText("jLabel2");

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

		jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		jLabel4.setForeground(new java.awt.Color(140, 92, 242));
		jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
		jLabel4.setText("Voltar");
		jLabel4.addAncestorListener(new javax.swing.event.AncestorListener() {
			public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
				jLabel4AncestorAdded(evt);
			}

			public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
			}

			public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
			}
		});
		jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jLabel4MouseClicked(evt, bank);
			}
		});

		jLabel7.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
		jLabel7.setForeground(new java.awt.Color(140, 92, 242));
		jLabel7.setText("XBANK");

		jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

		jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		jLabel1.setText("Lista de clientes");

		jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		jLabel8.setText("******");

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(jLabel1)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 295, Short.MAX_VALUE)
						.addComponent(jLabel8).addGap(20, 20, 20)));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						jPanel1Layout.createSequentialGroup()
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(jLabel1).addComponent(jLabel8))
								.addContainerGap()));

		JPanel innerPanel = new JPanel();
		innerPanel.setLayout(new GridLayout(0, 1, 0, 1));

		String line = new String();
		String fileName = "bankAccount.txt";
		File file = new File(fileName);
		
		int i = 0;
		String email = "", branch = "", account = "", statement = "";

		if (file.exists()) {
			try {
				FileReader fileReader = new FileReader(fileName);
				BufferedReader bufferFile = new BufferedReader(fileReader);

				while (true) {
					line = bufferFile.readLine();
					if (line == null) {
						break;
					}

					if (line.startsWith("Email: ")) {
						email = line.substring(7);
					}
					
					if (line.startsWith("Branch: ")) {
						branch = line.substring(8);
					}
					
					if (line.startsWith("Account: ")) {
						account = line.substring(9);
					}

					if (line.startsWith("Statement: ")) {
						i++;
						statement = line.substring(11);

						JPanel rowPanel = new JPanel();
						rowPanel.setPreferredSize(new Dimension(250, 80));
						rowPanel.setBackground(new java.awt.Color(220, 220, 220));
						innerPanel.add(rowPanel);
						rowPanel.setLayout(null);

						JLabel jlabel1 = new JLabel(email);
						jlabel1.setBounds(20, 10, 200, 40);
						rowPanel.add(jlabel1);

						JLabel jlabel2 = new JLabel("R$ " + statement);
						jlabel2.setBounds(400, 10, 160, 40);
						rowPanel.add(jlabel2);

						JLabel jlabel3 = new JLabel("Agencia: " + branch);
						jlabel3.setBounds(20, 40, 300, 40);
						rowPanel.add(jlabel3);

						
						JLabel jlabel4 = new JLabel("Nº da conta: " + account);
						jlabel4.setBounds(20, 60, 300, 40);
						rowPanel.add(jlabel4);
						
						if (i % 2 == 0)
							rowPanel.setBackground(new java.awt.Color(230, 230, 230));
					}

				}
				bufferFile.close();
			} catch (Exception e) {
			}
		}

		JScrollPane scrollPane_1 = new JScrollPane(innerPanel);
		scrollPane_1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane_1.setBounds(0, 95, 490, 400);
		this.getContentPane().add(scrollPane_1);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup()
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
						.addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(layout.createSequentialGroup().addGap(10, 10, 10).addComponent(
												jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 134,
												javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(layout.createSequentialGroup().addContainerGap().addComponent(jLabel4,
												javax.swing.GroupLayout.PREFERRED_SIZE, 64,
												javax.swing.GroupLayout.PREFERRED_SIZE)))
								.addGap(0, 0, Short.MAX_VALUE))
						.addGroup(javax.swing.GroupLayout.Alignment.LEADING,
								layout.createSequentialGroup().addContainerGap()
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addGroup(layout.createSequentialGroup()
														.addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGap(0, 0, Short.MAX_VALUE)))))
				.addContainerGap()).addComponent(jScrollPane1));

		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addGap(11, 11, 11)
						.addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 380,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(18, 18, 18).addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap()));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void jLabel4MouseClicked(java.awt.event.MouseEvent evt, BankAccount bank) {// GEN-FIRST:event_jLabel4MouseClicked
		close();
		index menu = new index(bank);
		menu.setVisible(true);
	}// GEN-LAST:event_jLabel4MouseClicked

	private void jLabel4AncestorAdded(javax.swing.event.AncestorEvent evt) {// GEN-FIRST:event_jLabel4AncestorAdded

	}// GEN-LAST:event_jLabel4AncestorAdded

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel11;
	private javax.swing.JLabel jLabel12;
	private javax.swing.JLabel jLabel15;
	private javax.swing.JLabel jLabel16;
	private javax.swing.JLabel jLabel17;
	private javax.swing.JLabel jLabel18;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JPanel jPanel5;
	private javax.swing.JScrollPane jScrollPane1;
	// End of variables declaration//GEN-END:variables
}
