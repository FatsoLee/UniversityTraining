/*
 * MainInterface.java
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
public class Input extends javax.swing.JFrame {

	/** Creates new form MainInterface */
	private int insertNum = 0;

	public Input() {
		initComponents();
		setLocation(300, 150);
	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jLabel1 = new javax.swing.JLabel();
		jTextField1 = new javax.swing.JTextField();
		jLabel2 = new javax.swing.JLabel();
		jTextField2 = new javax.swing.JTextField();
		jTextField3 = new javax.swing.JTextField();
		jLabel3 = new javax.swing.JLabel();
		jButton1 = new javax.swing.JButton();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTable1 = new javax.swing.JTable();
		jButton2 = new javax.swing.JButton();
		jLabel4 = new javax.swing.JLabel();
		jTextField4 = new javax.swing.JTextField();
		jLabel5 = new javax.swing.JLabel();
		jComboBox1 = new javax.swing.JComboBox();
		jButton3 = new javax.swing.JButton();
		jLabel6 = new javax.swing.JLabel();
		jButton4 = new javax.swing.JButton();
		jButton5 = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setTitle("\u6392\u8bfe\u4fe1\u606f\u5f55\u5165");

		jLabel1.setText("\u73ed\u7ea7\u540d\u79f0\uff1a");

		jTextField1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField1ActionPerformed(evt);
			}
		});

		jLabel2.setText("\u8bfe\u7a0b\u540d\u79f0\uff1a");

		jTextField2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField2ActionPerformed(evt);
			}
		});

		jTextField3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField3ActionPerformed(evt);
			}
		});

		jLabel3.setText("\u6559\u5e08\u540d\u5b57\uff1a");

		jButton1.setIcon(new javax.swing.ImageIcon(
				"..\\AutomaticCourse\\images\\add.png")); // NOI18N
		jButton1.setText("\u6dfb\u52a0");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jTable1.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] { { null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null } }, new String[] {
						"班级名称", "课程名称", "教师名字", "上课节数", "课室类型" }) {
			Class[] types = new Class[] { java.lang.String.class,
					java.lang.String.class, java.lang.String.class,
					java.lang.String.class, java.lang.String.class };

			public Class getColumnClass(int columnIndex) {
				return types[columnIndex];
			}
		});
		jScrollPane1.setViewportView(jTable1);

		jButton2.setIcon(new javax.swing.ImageIcon(
				"..\\AutomaticCourse\\images\\reset.png")); // NOI18N
		jButton2.setText("\u91cd\u7f6e");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		jLabel4.setText("\u4e0a\u8bfe\u8282\u6570\uff1a");

		jTextField4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField4ActionPerformed(evt);
			}
		});

		jLabel5.setText("\u8bfe\u5ba4\u7c7b\u578b\uff1a");

		jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
				"多媒体", "机房", "普通课室" }));

		jButton3.setIcon(new javax.swing.ImageIcon(
				"..\\AutomaticCourse\\images\\exit.png")); // NOI18N
		jButton3.setText("\u8fd4\u56de");
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});

		jLabel6.setFont(new java.awt.Font("微软雅黑", 1, 24));
		jLabel6.setText("\u6392\u8bfe\u4fe1\u606f\u5f55\u5165");

		jButton4.setIcon(new javax.swing.ImageIcon(
				"..\\AutomaticCourse\\images\\add.png")); // NOI18N
		jButton4.setText("\u6279\u91cf\u5f55\u5165");
		jButton4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton4ActionPerformed(evt);
			}
		});

		jButton5.setIcon(new javax.swing.ImageIcon(
				"..\\AutomaticCourse\\images\\reset.png")); // NOI18N
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
								.addContainerGap()
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(
														jScrollPane1,
														javax.swing.GroupLayout.Alignment.TRAILING,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														508, Short.MAX_VALUE)
												.addGroup(
														javax.swing.GroupLayout.Alignment.TRAILING,
														layout.createSequentialGroup()
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addGroup(
																						javax.swing.GroupLayout.Alignment.TRAILING,
																						layout.createSequentialGroup()
																								.addGroup(
																										layout.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.TRAILING)
																												.addComponent(
																														jLabel3)
																												.addComponent(
																														jLabel2)
																												.addComponent(
																														jLabel1))
																								.addGap(28,
																										28,
																										28))
																				.addGroup(
																						layout.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																								.addGroup(
																										javax.swing.GroupLayout.Alignment.TRAILING,
																										layout.createSequentialGroup()
																												.addComponent(
																														jLabel4)
																												.addGap(28,
																														28,
																														28))
																								.addGroup(
																										layout.createSequentialGroup()
																												.addComponent(
																														jLabel5)
																												.addGap(28,
																														28,
																														28))))
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addGroup(
																						javax.swing.GroupLayout.Alignment.TRAILING,
																						layout.createSequentialGroup()
																								.addComponent(
																										jTextField1,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										219,
																										Short.MAX_VALUE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED))
																				.addComponent(
																						jTextField2,
																						javax.swing.GroupLayout.Alignment.TRAILING,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						219,
																						Short.MAX_VALUE)
																				.addComponent(
																						jTextField3,
																						javax.swing.GroupLayout.Alignment.TRAILING,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						219,
																						Short.MAX_VALUE)
																				.addComponent(
																						jComboBox1,
																						javax.swing.GroupLayout.Alignment.TRAILING,
																						0,
																						219,
																						Short.MAX_VALUE)
																				.addComponent(
																						jTextField4,
																						javax.swing.GroupLayout.Alignment.TRAILING,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						219,
																						Short.MAX_VALUE))
																.addGap(95, 95,
																		95)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.TRAILING,
																				false)
																				.addComponent(
																						jButton3,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						106,
																						Short.MAX_VALUE)
																				.addComponent(
																						jButton2,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						Short.MAX_VALUE)
																				.addComponent(
																						jButton1,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						Short.MAX_VALUE)))
												.addGroup(
														layout.createSequentialGroup()
																.addGap(180,
																		180,
																		180)
																.addComponent(
																		jLabel6))
												.addGroup(
														javax.swing.GroupLayout.Alignment.TRAILING,
														layout.createSequentialGroup()
																.addComponent(
																		jButton5,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		115,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(
																		jButton4,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		110,
																		javax.swing.GroupLayout.PREFERRED_SIZE)))
								.addContainerGap()));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						javax.swing.GroupLayout.Alignment.TRAILING,
						layout.createSequentialGroup()
								.addGap(30, 30, 30)
								.addComponent(jLabel6)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED,
										38, Short.MAX_VALUE)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.TRAILING)
												.addGroup(
														layout.createSequentialGroup()
																.addComponent(
																		jButton1)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(
																		jButton2)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(
																		jButton3))
												.addGroup(
														layout.createSequentialGroup()
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.BASELINE)
																				.addComponent(
																						jLabel1)
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
																				.addComponent(
																						jLabel2)
																				.addComponent(
																						jTextField2,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE))
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.BASELINE)
																				.addComponent(
																						jLabel3)
																				.addComponent(
																						jTextField3,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE))
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.BASELINE)
																				.addComponent(
																						jLabel4)
																				.addComponent(
																						jTextField4,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE))
																.addGap(19, 19,
																		19)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.BASELINE)
																				.addComponent(
																						jLabel5)
																				.addComponent(
																						jComboBox1,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE))))
								.addGap(22, 22, 22)
								.addComponent(jScrollPane1,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										208,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jButton5)
												.addComponent(jButton4))
								.addGap(9, 9, 9)));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		try {
			for (int i = 0; i < insertNum; i++) { //清空表格
				jTable1.setValueAt(null, i, 0);
				jTable1.setValueAt(null, i, 1);
				jTable1.setValueAt(null, i, 2);
				jTable1.setValueAt(null, i, 3);
				jTable1.setValueAt(null, i, 4);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		System.out.println("insertNum = " + insertNum); //批量录入
		ArrangeImpl ai = new ArrangeImpl();
		try {
			for (int i = 0; i < insertNum; i++) {
				String arrange[] = { (String) jTable1.getValueAt(i, 0),
						(String) jTable1.getValueAt(i, 1),
						(String) jTable1.getValueAt(i, 2),
						(String) jTable1.getValueAt(i, 3),
						(String) jTable1.getValueAt(i, 4) };
				if (!ai.insertInfo(arrange)) {
					System.out.println("条目" + i + ", 录入失败!!!");
				}
			}
			JOptionPane.showMessageDialog(null,
					"        		录入成功!!!                    ",
					"AutoCourseArrangement", JOptionPane.PLAIN_MESSAGE);
		} catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null,
					"        		录入失败!!!                    ",
					"AutoCourseArrangement", JOptionPane.PLAIN_MESSAGE);
		}
	}

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		this.dispose(); //退出界面
	}

	private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		jTextField1.setText(null); //清空输入数据
		jTextField2.setText(null);
		jTextField3.setText(null);
		jTextField4.setText(null);
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		String className = jTextField1.getText();
		String courseName = jTextField2.getText();
		String teacherName = jTextField3.getText();
		String courseNum = jTextField4.getText();
		String classroomType = (String) jComboBox1.getSelectedItem();

		if (StringUtil.isEmpty(className)) {
			JOptionPane.showMessageDialog(null, "班级名称不能为空！");
			return;
		}
		if (StringUtil.isEmpty(courseName)) {
			JOptionPane.showMessageDialog(null, "课程名称不能为空！");
			return;
		}
		if (StringUtil.isEmpty(teacherName)) {
			JOptionPane.showMessageDialog(null, "老师名称不能为空！");
			return;
		}
		if (StringUtil.isNotZeroToTen(courseNum)) {
			JOptionPane.showMessageDialog(null, "课程节数范围在0~10！");
			return;
		}

		int a = 0;
		jTable1.setValueAt(className, a + insertNum, 0); //insertNum全局变量，统计插入的条数
		jTable1.setValueAt(courseName, a + insertNum, 1);
		jTable1.setValueAt(teacherName, a + insertNum, 2);
		jTable1.setValueAt(courseNum, a + insertNum, 3);
		jTable1.setValueAt(classroomType, a + insertNum, 4);
		insertNum++;
	}

	private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	/**
	 * @param args the command line arguments
	 */
	//	public static void main(String args[]) {
	//		java.awt.EventQueue.invokeLater(new Runnable() {
	//			public void run() {
	//				new Input().setVisible(true);
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
	private javax.swing.JComboBox jComboBox1;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTable jTable1;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField2;
	private javax.swing.JTextField jTextField3;
	private javax.swing.JTextField jTextField4;
	// End of variables declaration//GEN-END:variables

}