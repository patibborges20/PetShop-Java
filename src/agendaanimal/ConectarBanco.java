package agendaanimal;
import java.sql.*;
import javax.swing.JOptionPane;

public class ConectarBanco
{   
   
    final private String driver = "com.mysql.jdbc.Driver";
    final private String caminho = "jdbc:mysql://localhost/agendaanimal";
    final private String usuario = "root";
    final private String senha = "janela01";
    private Connection conn;
    public Statement stm;    // abrir caminho até o local do banco de dados
    public ResultSet rs;     // armazena no result set os dados
   
    
   
    
    public boolean conectar()
    {
        boolean result = true;
        try 
        {
            Class.forName(driver);
            conn = DriverManager.getConnection(caminho, usuario, senha);
            //JOptionPane.showMessageDialog(null, "Conexão realizada!!!"); ja esta ok! Não precisa de retorno para o usuario
        }   
        catch(ClassNotFoundException driver)
        {
            JOptionPane.showMessageDialog(null, "Driver Não Localizado!!!\n" + driver.getMessage()); //ok
            result = false;
        }
        catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null, "Erro de conexão!!!\n" + ex.getMessage()); //ok
            result = false;
        }
      return result;
    }
    
    public void desconectar()
    {
        boolean result = true;
        try
        {
            conn.close();
            JOptionPane.showMessageDialog(null, "Desconectado!!!");    
        } 
        catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null, "Erro de conexão!!!\n" + ex.getMessage());
            result = false;
        }
    }  
    
    public void executeSQL(String sql)
    {
        try
        {
            stm = conn.createStatement(
                   ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
                    rs= stm.executeQuery(sql); 
        }
        catch(SQLException sqlex)
        {
            JOptionPane.showMessageDialog(null,"Não foi possível executar o comando sql"+sqlex.getMessage());
        }
    }
    
}
