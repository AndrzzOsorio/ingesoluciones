/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
var cont = 1;
var cont1 = 1;
var cont2 = 1;
var cont3 = 1; 
$( document ).ready(function() {
    $("#contadortin1").val(0)
    $("#contadortin2").val(0)
    $("#contadormaterial").val(0)
    $("#contadormontaje").val(0)
});


$(function()
{
	$("#btn_tint").button().on("click", function(event)
    {
         
	$("#divtint").append("<p class="+cont+">Tinta "+cont+"<INPUT type=text name='tin"+cont+"'></p>");
	    $("#contadortin1").empty()
            $("#contadortin1").val(cont)
            cont++;
         
    });
    
     $("#btn_tint_d").button().on("click", function(event)
    {  
        
        cont--;
        
         $("#divtint ."+cont).remove();
         if(cont <= 1){
             cont=1; 
             $("#contadortin1").empty()
             $("#contadortin1").val(0)
         }else{
             $("#contadortin1").empty()
             $("#contadortin1").val(cont-1)
         }
        
         
    });
    
    	$("#btn_tint2").button().on("click", function(event)
    {
         
	$("#divtint2").append("<p class="+cont1+">Tinta "+cont1+"<INPUT type=text name='tin2"+cont1+"'></p>");
            $("#contadortin2").empty()	 
            $("#contadortin2").val(cont1)
            cont1++;
         
         
    });
    
    $("#btn_tint2_d").button().on("click", function(event)
    {    
        cont1--;
        
         $("#divtint2 ."+cont1).remove();
         if(cont1 <= 1){
             cont1=1;
             $("#contadortin2").empty()
             $("#contadortin2").val(0)
         }else{
              $("#contadortin2").empty()
              $("#contadortin2").val(cont1-1)
         }
             
         
         
    });
    
     	$("#btn_montaje").button().on("click", function(event)
    {
         
	$("#divmontaje").append("<p class="+cont2+">Montaje "+cont2+"<INPUT type=text name='montaje"+cont2+"'> Corte Inicial <INPUT type=text name='cinical"+cont2+"'></p>");
	    $("#contadormontaje").empty()
            $("#contadormontaje").val(cont2)
            cont2++;
         
    });
    
         $("#btn_montaje_d").button().on("click", function(event)
    {    
        cont2--;
        
         $("#divmontaje ."+cont2).remove();
         if(cont2 <= 1){
             cont2=1;
             $("#contadormontaje").empty()
             $("#contadormontaje").val(0)
         }else{
              $("#contadormontaje").empty()
             $("#contadormontaje").val(cont2-1)
         }
         
         
    });
    
    $("#btn_material").button().on("click", function(event)
    {
         
	$("#divmaterial").append("<p class="+cont3+">Material "+cont3+"<INPUT type=text name='material"+cont3+"'> Numero de pliegos <INPUT type=text name='numpliegos"+cont3+"'></p>");
	   $("#contadormaterial").empty()
           $("#contadormaterial").val(cont3)
           cont3++;
           
           
         
    });
    
   
    
    $("#btn_material_d").button().on("click", function(event)
    {    
         cont3--;
        
         $("#divmaterial ."+cont3).remove();
         if(cont3 <= 1){
             cont3=1;
             $("#contadormaterial").empty()
             $("#contadormaterial").val(0)
         }else{ 
              $("#contadormaterial").empty()
              $("#contadormaterial").val(cont3-1)
              
         }
        
         
         
    });
    
   


    
	
});
    


