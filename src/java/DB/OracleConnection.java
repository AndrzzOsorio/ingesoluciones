
package DB;

//necesita el archivo jodbc
import java.sql.*;  
import oracle.jdbc.OracleTypes;
public class OracleConnection{  
    
    private String connectionString = "jdbc:oracle:thin:@localhost:1521:xe";
    private String user = "USERUNIVERSO";
    private String password =  "1234";
    private Connection con;

    public OracleConnection() {
        
    }
    
    
    public void connect(){
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver"); 
          } catch(ClassNotFoundException e) {
            System.err.println (e) ;
            System.exit (-1) ;
        }
        try {
             con = DriverManager.getConnection(connectionString,user,password);
        } catch (java.sql.SQLException e) {
            System.err.println (e) ;
            System.exit (-1) ;
        }
           
          
    }
    //ejecucion de un sql.
    public void  consultarTalonarios(){
       
      
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
       
        String [] ar = { "10022", "02110", "07399" };
        Array arreglo = con.createArrayOf("VARCHAR2", ar);
       
        
       
          
        // se define el procedimiento almacenado a llamar (estili PL/SQL)
        String sql="begin PRUEBA_ARRAY(?); end;"; 
        
        CallableStatement ca = con.prepareCall(sql);
        
        //parametros de entrada
        /*
        se introduce el indice del parametro en la firma del procedimiento
        y sutipo correspondiente en oracle*/
        
        // se define cursor de salida
        //ca.registerOutParameter(1, OracleTypes.CURSOR);
        
        /*se definen el resto de valores de entrada con set dependiendo de su tipo
        de dato y recibe el indice en la firma del procedimiento y el valor para el
        parametro*/
        ca.setArray(1, arreglo);
        
        
        
        //se ejecuta el procedimiento
        ca.execute();
        
 
       //Se obtienen los valores que se retornan en el cursor en forma de ResultSe
        /*
        ResultSet rs = (ResultSet)ca.getObject(1);
	while (rs.next()){
		System.out.println(rs.getLong("CODIGO"));
		System.out.println(rs.getString("NOMBRE"));
		}
	rs.close();*/
	ca.close();
	con.close();
            
        } catch (java.sql.SQLException e) {
            System.err.println (e) ;
            System.exit (-1) ;
        }
 
    }
    
    public void cerrar(){
        try {
             con.close();
        } catch (java.sql.SQLException e) {
            System.err.println (e) ;
            System.exit (-1) ;
        }
  
       
    }

    public Connection getCon() {
        return con;
    }
        
    
   
   
}  
