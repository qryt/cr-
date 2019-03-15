


import java.awt.BorderLayout;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.URL;
import java.net.URLEncoder;

import javax.swing.JApplet;
import javax.swing.JOptionPane;

import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.swing.JRViewer;

public class PrintGjdApplet extends JApplet {

	/**
	 * Constructor of the applet.
	 *
	 * @exception HeadlessException if GraphicsEnvironment.isHeadless()
	 * returns true.
	 */
	public PrintGjdApplet() {
		initComponents();
	}
	private javax.swing.JPanel pnlMain; 
	/**
	 * Called by the browser or applet viewer to inform
	 * this applet that it is being reclaimed and that it should destroy
	 * any resources that it has allocated. The <code>stop</code> method
	 * will always be called before <code>destroy</code>. <p>
	 *
	 * A subclass of <code>Applet</code> should override this method if
	 * it has any operation that it wants to perform before it is
	 * destroyed. For example, an applet with threads would use the
	 * <code>init</code> method to create the threads and the
	 * <code>destroy</code> method to kill them. <p>
	 */
	public void destroy() {
		// Put your code here
	}

	/**
	 * Returns information about this applet. An applet should override
	 * this method to return a <code>String</code> containing information
	 * about the author, version, and copyright of the applet. <p>
	 *
	 * @return  a string containing information about the author, version, and
	 * copyright of the applet.
	 */
	public String getAppletInfo() {
		return "This is my default applet created by Eclipse";
	}

	/**
	 * Called by the browser or applet viewer to inform
	 * this applet that it has been loaded into the system. It is always
	 * called before the first time that the <code>start</code> method is
	 * called. <p>
	 *
	 * A subclass of <code>Applet</code> should override this method if
	 * it has initialization to perform. For example, an applet with
	 * threads would use the <code>init</code> method to create the
	 * threads and the <code>destroy</code> method to kill them. <p>
	 */
	public void init() {
		// Put your code here
		try {   
            //获取viewer.jsp的sql参数   
            String bh = getParameter("bh");   
            String chk=getParameter("chk");   
            //使用URLEncoder对sql语句进行encode   
            bh = URLEncoder.encode(bh, "UTF-8");   
            //提交到servlet，使用servlet访问服务器端数据   
            URL url = new URL(getCodeBase(), "../servlet/Printgjd?bh="  
                    + bh+"&chk="+chk);   
            
            if (url != null) {   
                //获取服务器的传递过来的JasperPrint对象   
                JasperPrint jasperPrint = (JasperPrint) JRLoader   
                        .loadObject(url);
              JasperPrintManager.printReport(jasperPrint,false);
             //创建一个JRViewer   
            //  JRViewer viewer = new JRViewer(jasperPrint); 
         
           // this.pnlMain.add(viewer, BorderLayout.CENTER);   
            }   
        } catch (Exception e) {   
            StringWriter swriter = new StringWriter();   
            PrintWriter pwriter = new PrintWriter(swriter);   
            e.printStackTrace(pwriter);   
            JOptionPane.showMessageDialog(this, swriter.toString());   
        }   

	}
	private void initComponents() {// GEN-BEGIN:initComponents   
        pnlMain = new javax.swing.JPanel();   
        pnlMain.setLayout(new java.awt.BorderLayout());   
        getContentPane().add(pnlMain, java.awt.BorderLayout.CENTER);   
    }   
	/**
	 * Called by the browser or applet viewer to inform
	 * this applet that it should start its execution. It is called after
	 * the <code>init</code> method and each time the applet is revisited
	 * in a Web page. <p>
	 *
	 * A subclass of <code>Applet</code> should override this method if
	 * it has any operation that it wants to perform each time the Web
	 * page containing it is visited. For example, an applet with
	 * animation might want to use the <code>start</code> method to
	 * resume animation, and the <code>stop</code> method to suspend the
	 * animation. <p>
	 */
	public void start() {
		// Put your code here
	}

	/**
	 * Called by the browser or applet viewer to inform
	 * this applet that it should stop its execution. It is called when
	 * the Web page that contains this applet has been replaced by
	 * another page, and also just before the applet is to be destroyed. <p>
	 *
	 * A subclass of <code>Applet</code> should override this method if
	 * it has any operation that it wants to perform each time the Web
	 * page containing it is no longer visible. For example, an applet
	 * with animation might want to use the <code>start</code> method to
	 * resume animation, and the <code>stop</code> method to suspend the
	 * animation. <p>
	 */
	public void stop() {
		// Put your code here
	}

}
