/*
 * ClassInfoInsert.java
 *
 * Created on __DATE__, __TIME__
 */

package UI;

import javax.swing.JOptionPane;

import util.StringUtil;

import JDBC.ArrangeImpl;

/**
 *
 * @author  __USER__
 */
public class ClassInfoInsert extends javax.swing.JFrame {

	/** Creates new form ClassInfoInsert */
	private int insertNum = 0;

	public ClassInfoInsert() {
		initComponents();
		setLocation(300, 150);
	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jLabel1 = new javax.swing.JLabel();
		jButton1 = new javax.swing.JButton();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTable1 = new javax.swing.JTable();
		jTextField1 = new javax.swing.JTextField();
		jLabel2 = new javax.swing.JLabel();
		jTextField2 = new javax.swing.JTextField();
		jButton2 = new javax.swing.JButton();
		jButton3 = new javax.swing.JButton();
		jLabel3 = new javax.swing.JLabel();
		jButton4 = new javax.swing.JButton();
		jButton5 = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setTitle("\u73ed\u7ea7\u4fe1\u606f\u5f55\u5165");

		jLabel1.setText("\u73ed\u7ea7\uff1a");

		jButton1.setIcon(new javax.swing.ImageIcon(
				"..\\AutomaticCourse\\images\\add.png")); // NOI18N
		jButton1.setText("\u6dfb\u52a0");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jTable1.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] { { null, null }, { null, null },
						{ null, null }, { null, null }, { null, null },
						{ null, null }, { null, null }, { null, null },
						{ null, null }, { null, null }, { null, null },
						{ null, null }, { null, null }, { null, null },
						{ null, null }, { null, null }, { null, null },
						{ null, null }, { null, null }, { null, null },
						{ null, null }, { null, null }, { null, null },
						{ null, null }, { null, null }, { null, null },
						{ null, null }, { null, null }, { null, null },
						{ null, null }, { null, null }, { null, null },
						{ null, null }, { null, null }, { null, null },
						{ null, null }, { null, null }, { null, null },
						{ null, null }, { null, null }, { null, null },
						{ null, null }, { null, null }, { null, null },
						{ null, null }, { null, null }, { null, null },
						{ null, null }, { null, null }, { null, null } },
				new String[] { "班级", "人数" }) {
			Class[] types = new Class[] { java.lang.String.class,
					java.lang.String.class };

			public Class getColumnClass(int columnIndex) {
				return types[columnIndex];
			}
		});
		jScrollPane1.setViewportView(jTable1);

		jLabel2.setText("\u4eba\u6570\uff1a");

		jButton2.setIcon(new javax.swing.ImageIcon(
				"..\\AutomaticCourse\\images\\reset.png")); // NOI18N
		jButton2.setText("\u91cd\u7f6e");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		jButton3.setIcon(new javax.swing.ImageIcon(
				"..\\AutomaticCourse\\images\\exit.png")); // NOI18N
		jButton3.setText("\u8fd4\u56de");
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});

		jLabel3.setFont(new java.awt.Font("微软雅黑", 1, 24));
		jLabel3.setText("\u73ed\u7ea7\u4fe1\u606f\u5f55\u5165");

		jButton4.setIcon(new javax.swing.ImageIcon(
				"..\\AutomaticCourse\\images\\add.png")); // NOI18N
		jButton4.setText("\u6279\u91cf\u6dfb\u52a0");
		jButton4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton4ActionPerformed(evt);
			}
		});

		jButton5.setIcon(new javax.swing.ImageIcon(
				"..\\AutomaticCourse\\images\\delete.png")); // NOI18N
		jButton5.setText("\u6e05\u7a7a\u8868\u683c");
		jButton5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton5ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														javax.swing.GroupLayout.Alignment.TRAILING,
														layout.createSequentialGroup()
																.addGap(89, 89,
																		89)
																.addComponent(
																		jButton5)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																.addComponent(
																		jButton4))
												.addGroup(
														layout.createSequentialGroup()
																.addContainerGap()
																.addComponent(
																		jScrollPane1,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		291,
																		Short.MAX_VALUE))
												.addGroup(
														layout.createSequentialGroup()
																.addGap(19, 19,
																		19)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addGroup(
																						javax.swing.GroupLayout.Alignment.TRAILING,
																						layout.createSequentialGroup()
																								.addComponent(
																										jButton1)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																										13,
																										Short.MAX_VALUE)
																								.addComponent(
																										jButton2)
																								.addGap(40,
																										40,
																										40)
																								.addComponent(
																										jButton3))
																				.addGroup(
																						layout.createSequentialGroup()
																								.addGroup(
																										layout.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.LEADING)
																												.addComponent(
																														jLabel2)
																												.addComponent(
																														jLabel1))
																								.addGap(31,
																										31,
																										31)
																								.addGroup(
																										layout.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.LEADING)
																												.addComponent(
																														jTextField1,
																														javax.swing.GroupLayout.DEFAULT_SIZE,
																														217,
																														Short.MAX_VALUE)
																												.addComponent(
																														jTextField2,
																														javax.swing.GroupLayout.DEFAULT_SIZE,
																														217,
																														Short.MAX_VALUE))))))
								.addContainerGap())
				.addGroup(
						javax.swing.GroupLayout.Alignment.TRAILING,
						layout.createSequentialGroup()
								.addContainerGap(92, Short.MAX_VALUE)
								.addComponent(jLabel3).addGap(79, 79, 79)));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addGap(25, 25, 25)
								.addComponent(jLabel3)
								.addGap(41, 41, 41)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel1)
												.addComponent(
														jTextField1,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel2)
												.addComponent(
														jTextField2,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jButton3)
												.addComponent(jButton1)
												.addComponent(jButton2))
								.addGap(18, 18, 18)
								.addComponent(jScrollPane1,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										180,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jButton4)
												.addComponent(jButton5))
								.addContainerGap(19, Short.MAX_VALUE)));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		this.dispose(); //退出界面
	}

	private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		try {
			for (int i = 0; i < insertNum; i++) { //清空表格
				jTable1.setValueAt(null, i, 0);
				jTable1.setValueAt(null, i, 1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		System.out.println("insertNum = " + insertNum); //批量添加
		ArrangeImpl ai = new ArrangeImpl();
		try {
			for (int i = 0; i < insertNum; i++) {
				String classinfo[] = { (String) jTable1.getValueAt(i, 0),
						(String) jTable1.getValueAt(i, 1), };
				if (!ai.insertClassInfo(classinfo)) {
					System.out.println("条目" + i + ", 插入失败!!!");
				}
			}
			JOptionPane.showMessageDialog(null,
					"        		插入成功!!!                    ",
					"AutoCourseArrangement", JOptionPane.PLAIN_MESSAGE);
		} catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null,
					"        		插入失败!!!                    ",
					"AutoCourseArrangement", JOptionPane.PLAIN_MESSAGE);
		}
	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		jTextField1.setText(null); //清空输入数据
		jTextField2.setText(null);
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		String className = jTextField1.getText();
		String classNum = jTextField2.getText();

		if (StringUtil.isEmpty(className)) {
			JOptionPane.showMessageDialog(null, "课程名称不能为空！");
			return;
		}

		if (!(StringUtil.isNumber(classNum))) {
			JOptionPane.showMessageDialog(null, "班级人数输入不规范！");
			return;
		}

		int a = 0;
		jTable1.setValueAt(className, a + insertNum, 0); //insertNum全局变量，统计插入的条数
		jTable1.setValueAt(classNum, a + insertNum, 1);
		insertNum++;
	}

	/**
	 * @param args the command line arguments
	 */
	//	public static void main(String args[]) {
	//		java.awt.EventQueue.invokeLater(new Runnable() {
	//			public void run() {
	//				new ClassInfoInsert().setVisible(true);
	//			}
	//		});
	//	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JButton jButton4;
	private javax.swing.JButton jButton5;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTable jTable1;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField2;
	// End of variables declaration//GEN-END:variables

}