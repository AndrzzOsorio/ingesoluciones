
package DB;

//necesita el archivo jodbc
import java.sql.*;  
import oracle.jdbc.OracleTypes;
public class OracleConnection{  
    
    private String connectionString = "jdbc:oracle:thin:@localhost:1521:xe";
    private String user = "hr";
    private String password =  "ucaldashr";
    protected Connection con;

    public OracleConnection() {
        
    }
    
    public void connect(){
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");  
            con = DriverManager.getConnection(connectionString,user,password);
            } catch (Exception e) {
               System.out.println("error1");
            } 
    }
    //ejecucion de un sql.
    public void  consultarTalonarios(){
       
      try {
       
        Statement stmt=con.createStatement();  
        
        
 
       ResultSet rs=stmt.executeQuery("SELECT * FROM EMPLOYEES");  
       while(rs.next())  
       System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
        con.close(); 
            
        } catch (Exception e) {
            System.out.println("error2");
      }
 
    }
    
/*Procedimiento de EJEMPLO
    
 create or replace Procedure ProGetPrueba1(prfCursor out Sys_Refcursor,pnNumber  In Number)  Is
  voCursor  Sys_Refcursor:=null;
Begin
     --Valor 1: funciona OK, Valor diferente a 1 retorna error.
     if  pnNumber = 1 then
             Open voCursor For
             Select 1 as CODIGO,'Vortexbird' as NOMBRE
             From   DUAL;
             prfCursor:=voCursor;
     else
          RAISE_APPLICATION_ERROR (-20000, 'El valor no puede ser negativo'); --voCursor;
     end if;
End ProGetPrueba1;
   */
     
    public void muestraProcedimiento(){
        
        try {
       
        Statement stmt=con.createStatement();  
        
        // se define el procedimiento almacenado a llamar (estili PL/SQL)
        String sql="begin ProGetPrueba1(?,?); end;"; 
        
        CallableStatement ca = con.prepareCall(sql);
        
        //parametros de entrada
        /*
        se introduce el indice del parametro en la firma del procedimiento
        y sutipo correspondiente en oracle*/
        
        // se define cursor de salida
        ca.registerOutParameter(1, OracleTypes.CURSOR);
        
        /*se definen el resto de valores de entrada con set dependiendo de su tipo
        de dato y recibe el indice en la firma del procedimiento y el valor para el
        parametro*/
        ca.setLong(2, 1L);
        
        //se ejecuta el procedimiento
        ca.execute();
        
 
       //Se obtienen los valores que se retornan en el cursor en forma de ResultSe
        ResultSet rs = (ResultSet)ca.getObject(1);
	while (rs.next()){
		System.out.println(rs.getLong("CODIGO"));
		System.out.println(rs.getString("NOMBRE"));
		}
	rs.close();
	ca.close();
	con.close();
            
        } catch (Exception e) {
            System.out.println("error2");
      }
 
    }
        
    
   
   
}  
