/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gyam.Reporte;
import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JInternalFrame;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
/**
 *
 * @author DELL
 */
public class GestionReporte extends JInternalFrame {
    
    
    public void ReporteAsistencias() throws SQLException, JRException 
    {      
        Connection cn;
        cn = DriverManager.getConnection("jdbc:sqlserver://localhost\\SQLEXPRESS:1433;databaseName=GYAM;user=usuarioSQL;password=321;");
        JasperReport reporte = null;
        reporte = (JasperReport)JRLoader.loadObjectFromFile("ReporteAsistencias.jasper");
        JasperPrint imp = JasperFillManager.fillReport(reporte, null, cn);
        
        JasperViewer ver = new JasperViewer(imp);
        ver.setTitle("Asistencias");
        ver.setVisible(true);   
        
    }

    
}
