/*
 * TeacherJudge.java
 *
 * Created on __DATE__, __TIME__
 */

package UI;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import JDBC.ArrangeImpl;

/**
 *
 * @author  __USER__
 */
public class TeacherJudge extends javax.swing.JFrame {

	/** Creates new form TeacherJudge */
	public TeacherJudge() {
		initComponents();
		this.fillTeacherNmae();
		setLocation(200, 100);
	}

	private void fillTeacherNmae() {
		List<String> teacherNameList = new ArrayList<String>();
		ArrangeImpl ai = new ArrangeImpl();
		teacherNameList = ai.getTeacherName();
		for (String string : teacherNameList) {
			this.jComboBox1.addItem(string);
		}
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
		jButton4 = new javax.swing.JButton();
		jLabel3 = new javax.swing.JLabel();
		jScrollPane2 = new javax.swing.JScrollPane();
		jTable2 = new javax.swing.JTable();
		jButton5 = new javax.swing.JButton();
		jButton6 = new javax.swing.JButton();
		jButton7 = new javax.swing.JButton();
		jComboBox1 = new javax.swing.JComboBox();

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setTitle("\u6559\u5e08\u5360\u7528\u5b89\u6392");

		jLabel1.setText("\u6559\u5e08\u540d\u5b57\uff1a");

		jButton4.setIcon(new javax.swing.ImageIcon(
				"..\\AutomaticCourse\\images\\modify.png")); // NOI18N
		jButton4.setText("\u5f55\u5165");
		jButton4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton4ActionPerformed(evt);
			}
		});

		jLabel3.setFont(new java.awt.Font("微软雅黑", 1, 24));
		jLabel3.setText("\u6559\u5e08\u7a7a\u95f2\u5b89\u6392");

		jTable2.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] { { null, "1", "0", "0" },
						{ null, "1", "1", "0" }, { null, "1", "2", "0" },
						{ null, "1", "3", "0" }, { null, "1", "4", "0" },
						{ null, "1", "5", "0" }, { null, "1", "6", "0" },
						{ null, "1", "7", "0" }, { null, "1", "8", "0" },
						{ null, "1", "9", "0" }, { null, "1", "10", "0" },
						{ null, "2", "0", "0" }, { null, "2", "1", "0" },
						{ null, "2", "2", "0" }, { null, "2", "3", "0" },
						{ null, "2", "4", "0" }, { null, "2", "5", "0" },
						{ null, "2", "6", "0" }, { null, "2", "7", "0" },
						{ null, "2", "8", "0" }, { null, "2", "9", "0" },
						{ null, "2", "10", "0" }, { null, "3", "0", "0" },
						{ null, "3", "1", "0" }, { null, "3", "2", "0" },
						{ null, "3", "3", "0" }, { null, "3", "4", "0" },
						{ null, "3", "5", "0" }, { null, "3", "6", "0" },
						{ null, "3", "7", "0" }, { null, "3", "8", "0" },
						{ null, "3", "9", "0" }, { null, "3", "10", "0" },
						{ null, "4", "0", "0" }, { null, "4", "1", "0" },
						{ null, "4", "2", "0" }, { null, "4", "3", "0" },
						{ null, "4", "4", "0" }, { null, "4", "5", "0" },
						{ null, "4", "6", "0" }, { null, "4", "7", "0" },
						{ null, "4", "8", "0" }, { null, "4", "9", "0" },
						{ null, "4", "10", "0" }, { null, "5", "0", "0" },
						{ null, "5", "1", "0" }, { null, "5", "2", "0" },
						{ null, "5", "3", "0" }, { null, "5", "4", "0" },
						{ null, "5", "5", "0" }, { null, "5", "6", "0" },
						{ null, "5", "7", "0" }, { null, "5", "8", "0" },
						{ null, "5", "9", "0" }, { null, "5", "10", "0" } },
				new String[] { "教师名字", "星期数(周几)", "节数(第几节)", "是否占用(置1占用)" }) {
			Class[] types = new Class[] { java.lang.String.class,
					java.lang.String.class, java.lang.String.class,
					java.lang.String.class };
			boolean[] canEdit = new boolean[] { true, false, false, true };

			public Class getColumnClass(int columnIndex) {
				return types[columnIndex];
			}

			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return canEdit[columnIndex];
			}
		});
		jScrollPane2.setViewportView(jTable2);

		jButton5.setIcon(new javax.swing.ImageIcon(
				"..\\AutomaticCourse\\images\\exit.png")); // NOI18N
		jButton5.setText("\u8fd4\u56de");
		jButton5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton5ActionPerformed(evt);
			}
		});

		jButton6.setIcon(new javax.swing.ImageIcon(
				"..\\AutomaticCourse\\images\\add.png")); // NOI18N
		jButton6.setText("\u6dfb\u52a0");
		jButton6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton6ActionPerformed(evt);
			}
		});

		jButton7.setIcon(new javax.swing.ImageIcon(
				"..\\AutomaticCourse\\images\\reset.png")); // NOI18N
		jButton7.setText("\u91cd\u7f6e");
		jButton7.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton7ActionPerformed(evt);
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
												.addGroup(
														layout.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addGroup(
																						layout.createSequentialGroup()
																								.addGroup(
																										layout.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.LEADING)
																												.addGroup(
																														layout.createSequentialGroup()
																																.addGap(3,
																																		3,
																																		3)
																																.addComponent(
																																		jLabel1)
																																.addPreferredGap(
																																		javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																																.addComponent(
																																		jComboBox1,
																																		0,
																																		371,
																																		Short.MAX_VALUE)
																																.addPreferredGap(
																																		javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																																.addComponent(
																																		jButton6,
																																		javax.swing.GroupLayout.PREFERRED_SIZE,
																																		105,
																																		javax.swing.GroupLayout.PREFERRED_SIZE))
																												.addComponent(
																														jScrollPane2,
																														javax.swing.GroupLayout.Alignment.TRAILING,
																														javax.swing.GroupLayout.DEFAULT_SIZE,
																														563,
																														Short.MAX_VALUE))
																								.addContainerGap())
																				.addGroup(
																						javax.swing.GroupLayout.Alignment.TRAILING,
																						layout.createSequentialGroup()
																								.addComponent(
																										jLabel3)
																								.addGap(224,
																										224,
																										224)))
																.addGroup(
																		javax.swing.GroupLayout.Alignment.TRAILING,
																		layout.createSequentialGroup()
																				.addComponent(
																						jButton7,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						105,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addGap(353,
																						353,
																						353)
																				.addComponent(
																						jButton4,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						105,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addContainerGap()))
												.addGroup(
														javax.swing.GroupLayout.Alignment.TRAILING,
														layout.createSequentialGroup()
																.addComponent(
																		jButton5,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		105,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addContainerGap()))));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addGap(30, 30, 30)
								.addComponent(jLabel3)
								.addGap(28, 28, 28)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel1)
												.addComponent(jButton6)
												.addComponent(
														jComboBox1,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(19, 19, 19)
								.addComponent(jScrollPane2,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										290,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(18, 18, 18)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jButton4)
												.addComponent(jButton7))
								.addGap(18, 18, 18).addComponent(jButton5)
								.addContainerGap(25, Short.MAX_VALUE)));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		ArrangeImpl ai = new ArrangeImpl();
		try {
			for (int i = 0; i < 55; i++) {
				String teacherjudge[] = { (String) jTable2.getValueAt(i, 0),
						(String) jTable2.getValueAt(i, 1),
						(String) jTable2.getValueAt(i, 2),
						(String) jTable2.getValueAt(i, 3) };
				if (!ai.insertTeacherJudge(teacherjudge)) {
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

	private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		this.dispose(); //退出界面
	}

	private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		try {
			for (int i = 0; i < 55; i++) { //清空row = 0
				jTable2.setValueAt(null, i, 0);
				jTable2.setValueAt(0, i, 3);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		String teacherName = (String) jComboBox1.getSelectedItem();
		for (int i = 0; i < 55; i++) {
			jTable2.setValueAt(teacherName, i, 0);
		}
	}

	/**
	 * @param args the command line arguments
	 */
	//	public static void main(String args[]) {
	//		java.awt.EventQueue.invokeLater(new Runnable() {
	//			public void run() {
	//				new TeacherJudge().setVisible(true);
	//			}
	//		});
	//	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton4;
	private javax.swing.JButton jButton5;
	private javax.swing.JButton jButton6;
	private javax.swing.JButton jButton7;
	private javax.swing.JComboBox jComboBox1;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JTable jTable2;
	// End of variables declaration//GEN-END:variables

}