/*
 * MainInterface.java
 *
 * Created on __DATE__, __TIME__
 */

package UI;

import java.awt.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.table.TableModel;

import util.StringUtil;

import JDBC.ArrangeImpl;

/**
 *
 * @author  __USER__
 */
public class MainInterface extends javax.swing.JFrame {

	/** Creates new form MainInterface */
	private List<Integer> recordWeekNum = new ArrayList<Integer>(); //全局变量，用于防止不同课程&不同任课教师出现在已经出现的时间段
	private List<Integer> recordSectionNum = new ArrayList<Integer>();
	private int count = 0;

	public MainInterface() {
		initComponents();
		setSize(800, 420);
		setLocation(150, 100);
	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jMenuBar1 = new javax.swing.JMenuBar();
		jMenu1 = new javax.swing.JMenu();
		jMenuItem1 = new javax.swing.JMenuItem();
		jMenuItem2 = new javax.swing.JMenuItem();
		jMenuItem3 = new javax.swing.JMenuItem();
		jMenuItem4 = new javax.swing.JMenuItem();
		jMenuItem5 = new javax.swing.JMenuItem();
		jMenu2 = new javax.swing.JMenu();
		jMenuItem6 = new javax.swing.JMenuItem();
		jMenu3 = new javax.swing.JMenu();
		jMenuItem7 = new javax.swing.JMenuItem();
		jMenuItem8 = new javax.swing.JMenuItem();
		jMenu4 = new javax.swing.JMenu();
		jMenuItem9 = new javax.swing.JMenuItem();

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setTitle("\u81ea\u52a8\u6392\u8bfe\u7cfb\u7edf");

		jLabel1.setFont(new java.awt.Font("宋体", 0, 24));
		jLabel1.setForeground(new java.awt.Color(255, 0, 0));
		jLabel1.setIcon(new javax.swing.ImageIcon(
				"..\\AutomaticCourse\\images\\welcome.jpg")); // NOI18N

		jLabel2.setText("14\u8ba1\u672c666\u5c0f\u7ec4");

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(
				jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						jPanel1Layout.createSequentialGroup()
								.addGap(146, 146, 146).addComponent(jLabel1)
								.addContainerGap(287, Short.MAX_VALUE))
				.addGroup(
						javax.swing.GroupLayout.Alignment.TRAILING,
						jPanel1Layout
								.createSequentialGroup()
								.addContainerGap(644, Short.MAX_VALUE)
								.addComponent(jLabel2,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										106,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(36, 36, 36)));
		jPanel1Layout
				.setVerticalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								jPanel1Layout
										.createSequentialGroup()
										.addContainerGap()
										.addComponent(
												jLabel1,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												291, Short.MAX_VALUE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jLabel2)
										.addContainerGap()));

		jMenuBar1.setInheritsPopupMenu(true);

		jMenu1.setText("\u5f55\u5165 ");

		jMenuItem1.setText("\u8bfe\u5ba4\u4fe1\u606f\u5f55\u5165");
		jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem1ActionPerformed(evt);
			}
		});
		jMenu1.add(jMenuItem1);

		jMenuItem2.setText("\u73ed\u7ea7\u4fe1\u606f\u5f55\u5165");
		jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem2ActionPerformed(evt);
			}
		});
		jMenu1.add(jMenuItem2);

		jMenuItem3.setText("\u6392\u8bfe\u4fe1\u606f\u5f55\u5165");
		jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem3ActionPerformed(evt);
			}
		});
		jMenu1.add(jMenuItem3);

		jMenuItem4.setText("\u8bfe\u5ba4\u5360\u7528\u5b89\u6392");
		jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem4ActionPerformed(evt);
			}
		});
		jMenu1.add(jMenuItem4);

		jMenuItem5.setText("\u6559\u5e08\u5360\u7528\u5b89\u6392");
		jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem5ActionPerformed(evt);
			}
		});
		jMenu1.add(jMenuItem5);

		jMenuBar1.add(jMenu1);

		jMenu2.setText("\u4e00\u952e\u6392\u8bfe ");
		jMenu2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenu2ActionPerformed(evt);
			}
		});

		jMenuItem6.setText("\u4e00\u952e\u6392\u8bfe");
		jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem6ActionPerformed(evt);
			}
		});
		jMenu2.add(jMenuItem6);

		jMenuBar1.add(jMenu2);

		jMenu3.setText("\u67e5\u8be2");

		jMenuItem7.setText("\u6559\u5e08\u8bfe\u8868\u67e5\u8be2");
		jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem7ActionPerformed(evt);
			}
		});
		jMenu3.add(jMenuItem7);

		jMenuItem8.setText("\u8bfe\u5ba4\u8bfe\u8868\u67e5\u8be2");
		jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem8ActionPerformed(evt);
			}
		});
		jMenu3.add(jMenuItem8);

		jMenuBar1.add(jMenu3);

		jMenu4.setText("\u5173\u4e8e");

		jMenuItem9.setText("\u5173\u4e8e\u6211\u4eec");
		jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem9ActionPerformed(evt);
			}
		});
		jMenu4.add(jMenuItem9);

		jMenuBar1.add(jMenu4);

		setJMenuBar(jMenuBar1);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				layout.createSequentialGroup()
						.addGap(20, 20, 20)
						.addComponent(jPanel1,
								javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(100, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				layout.createSequentialGroup()
						.addComponent(jPanel1,
								javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE).addContainerGap()));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		Container container = getContentPane();
		container.removeAll();
		container.setLayout(new BorderLayout());
		add(new About(), BorderLayout.CENTER);
		((javax.swing.JComponent) container).updateUI();
	}

	private boolean compareTo(int weekNum, int sectionNum, int courseNum) { //用于比较weekNum与recordWeekNum[]
		boolean isSuccess = true; //用于比较sectionNum与recordSectionNum[]
		outer: for (int i = 0; i < recordWeekNum.size(); i++) {
			for (int j = 0; j < courseNum; j++) {
				if (recordWeekNum.get(i) == weekNum
						&& recordSectionNum.get(i) == (sectionNum + j)) {
					isSuccess = false;
					break outer;
				}
			}
		}
		return isSuccess;
	}

	private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		Container container = getContentPane();
		container.removeAll();
		container.setLayout(new BorderLayout());
		add(new Classroomshow(), BorderLayout.CENTER);
		((javax.swing.JComponent) container).updateUI();
	}

	private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		Container container = getContentPane();
		container.removeAll();
		container.setLayout(new BorderLayout());
		add(new Teachershow(), BorderLayout.CENTER);
		((javax.swing.JComponent) container).updateUI();
	}

	private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		new TeacherJudge().setVisible(true);

	}

	private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		new ClassroomJudge().setVisible(true);
	
	}

	private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		new Input().setVisible(true);
		
	}

	private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		new ClassInfoInsert().setVisible(true);
		
	}

	private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		new ClassroomInfoInsert().setVisible(true);
		
	}

	private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		Container container = getContentPane();
		container.removeAll();
		container.setLayout(new BorderLayout());
		add(new AutoCourse(), BorderLayout.CENTER);
		((javax.swing.JComponent) container).updateUI();
	}

	/**
	 * @param args the command line arguments
	 */
	//	public static void main(String args[]) {
	//		java.awt.EventQueue.invokeLater(new Runnable() {
	//			public void run() {
	//				new MainInterface().setVisible(true);
	//			}
	//		});
	//	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JMenu jMenu1;
	private javax.swing.JMenu jMenu2;
	private javax.swing.JMenu jMenu3;
	private javax.swing.JMenu jMenu4;
	private javax.swing.JMenuBar jMenuBar1;
	private javax.swing.JMenuItem jMenuItem1;
	private javax.swing.JMenuItem jMenuItem2;
	private javax.swing.JMenuItem jMenuItem3;
	private javax.swing.JMenuItem jMenuItem4;
	private javax.swing.JMenuItem jMenuItem5;
	private javax.swing.JMenuItem jMenuItem6;
	private javax.swing.JMenuItem jMenuItem7;
	private javax.swing.JMenuItem jMenuItem8;
	private javax.swing.JMenuItem jMenuItem9;
	private javax.swing.JPanel jPanel1;
	// End of variables declaration//GEN-END:variables

}