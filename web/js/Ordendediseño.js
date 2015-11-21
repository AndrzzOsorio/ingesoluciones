var cont = 1;
var cont1 = 1;
 
$( document ).ready(function() {
    $("#contadortin0").val(0)
    $("#contadortin00").val(0)
    
});


$(function()
{
	$("#btn_tint").button().on("click", function(event)
    {
         
	$("#divtint").append("<p class="+cont+">Tinta "+cont+"<INPUT type=text name='tintas"+cont+"'></p>");
	    $("#contadortin0").empty()
            $("#contadortin0").val(cont)
            cont++;
         
    });
    
     $("#btn_tint_d").button().on("click", function(event)
    {  
        
        cont--;
        
         $("#divtint ."+cont).remove();
         if(cont <= 1){
             cont=1; 
             $("#contadortin0").empty()
             $("#contadortin0").val(0)
         }else{
             $("#contadortin0").empty()
             $("#contadortin0").val(cont-1)
         }
        
         
    });
    
    	$("#btn_tint2").button().on("click", function(event)
    {
         
	$("#divtint2").append("<p class="+cont1+">Tinta "+cont1+"<INPUT type=text name='tintas0"+cont1+"'></p>");
            $("#contadortin00").empty()	 
            $("#contadortin00").val(cont1)
            cont1++;
         
         
    });
    
    $("#btn_tint2_d").button().on("click", function(event)
    {    
        cont1--;
        
         $("#divtint2 ."+cont1).remove();
         if(cont1 <= 1){
             cont1=1;
             $("#contadortin00").empty()
             $("#contadortin00").val(0)
         }else{
              $("#contadortin00").empty()
              $("#contadortin00").val(cont1-1)
         }
             
         
         
    });
    
   
    
   


    
	
});