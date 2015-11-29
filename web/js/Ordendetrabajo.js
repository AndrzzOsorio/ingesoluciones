/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
var cont = 1;
var cont1 = 1;
var cont2 = 1;
var cont3 = 1;





$(document).ready(function () {
    $("#contadortin1").val(0)
    $("#contadortin2").val(0)
    $("#contadormaterial").val(0)
    $("#contadormontaje").val(0)
});




$(function ()
{
    $("#btn_tint").button().on("click", function (event)
    {

        $("#divtint").append("<p class=" + cont + ">Tinta " + cont + "<INPUT type=text name='tin" + cont + "'></p>");
        $("#contadortin1").empty()
        $("#contadortin1").val(cont)
        cont++;

    });

    $("#btn_tint_d").button().on("click", function (event)
    {

        cont--;

        $("#divtint ." + cont).remove();
        if (cont <= 1) {
            cont = 1;
            $("#contadortin1").empty()
            $("#contadortin1").val(0)
        } else {
            $("#contadortin1").empty()
            $("#contadortin1").val(cont - 1)
        }


    });

    $("#btn_tint2").button().on("click", function (event)
    {

        $("#divtint2").append("<p class=" + cont1 + ">Tinta " + cont1 + "<INPUT type=text name='tin2" + cont1 + "'></p>");
        $("#contadortin2").empty()
        $("#contadortin2").val(cont1)
        cont1++;


    });

    $("#btn_tint2_d").button().on("click", function (event)
    {
        cont1--;

        $("#divtint2 ." + cont1).remove();
        if (cont1 <= 1) {
            cont1 = 1;
            $("#contadortin2").empty()
            $("#contadortin2").val(0)
        } else {
            $("#contadortin2").empty()
            $("#contadortin2").val(cont1 - 1)
        }



    });

    $("#btn_montaje").button().on("click", function (event)
    {

        $("#divmontaje").append("<p class=" + cont2 + ">Montaje " + cont2 + "<INPUT type=text name='montaje" + cont2 + "'> Corte Inicial <INPUT type=text name='cinical" + cont2 + "'></p>");
        $("#contadormontaje").empty()
        $("#contadormontaje").val(cont2)
        cont2++;

    });

    $("#btn_montaje_d").button().on("click", function (event)
    {
        cont2--;

        $("#divmontaje ." + cont2).remove();
        if (cont2 <= 1) {
            cont2 = 1;
            $("#contadormontaje").empty()
            $("#contadormontaje").val(0)
        } else {
            $("#contadormontaje").empty()
            $("#contadormontaje").val(cont2 - 1)
        }


    });

    $("#btn_material").button().on("click", function (event)
    {

        $("#divmaterial").append("<p class=" + cont3 + ">Material " + cont3 + "<INPUT type=text name='material" + cont3 + "'> Numero de pliegos <INPUT type=text name='numpliegos" + cont3 + "'></p>");
        $("#contadormaterial").empty()
        $("#contadormaterial").val(cont3)
        cont3++;



    });



    $("#btn_material_d").button().on("click", function (event)
    {
        cont3--;

        $("#divmaterial ." + cont3).remove();
        if (cont3 <= 1) {
            cont3 = 1;
            $("#contadormaterial").empty()
            $("#contadormaterial").val(0)
        } else {
            $("#contadormaterial").empty()
            $("#contadormaterial").val(cont3 - 1)

        }
    });
});
$(function ()
{
    $("#nit").button().on("change", function (event)
    {
        var patron = /^\d*$/;
        var numero = $("#nit").val();
        if (!patron.test(numero)) {
            alert("un numero de NIT no puede ser negativo");
            $("#nit").val(0);
        } else {

        }


    });

});

$(function ()
{
    $("#cant1").button().on("change", function (event)
    {
        var patron = /^\d*$/;
        var numero = $("#cant1").val();
        if (!patron.test(numero)) {
            alert("solo se admiten valores positivos en las cantidades");
            $("#cant1").val(0);
        } else {

        }


    });

});



$(function ()
{
    $("#cant2").button().on("change", function (event)
    {
        var patron = /^\d*$/;
        var numero = $("#cant2").val();
        if (!patron.test(numero)) {
            alert("solo se admiten valores positivos en las cantidades");
            $("#cant2").val(0);
        } else {

        }


    });

});
$(function ()
{
    $("#numpliegos").button().on("change", function (event)
    {
        var patron = /^\d*$/;
        var numero = $("#numpliegos").val();
        if (!patron.test(numero)) {
            alert("solo se admiten valores positivos en el numero de pliegos");
            $("#numpliegos").val(0);
        } else {

        }


    });

});
$(function ()
{
    $("#planchas").button().on("change", function (event)
    {
        var patron = /^\d*$/;
        var numero = $("#planchas").val();
        if (!patron.test(numero)) {
            alert("solo se admiten valores positivos en el numero de planchas");
            $("#planchas").val(0);
        } else {

        }


    });

});
$(function ()
{
    $("#talonario").button().on("change", function (event)
    {
        var patron = /^\d*$/;
        var numero = $("#talonario").val();
        if (!patron.test(numero)) {
            alert("solo se admiten valores positivos en el numero de talonario");
            $("#talonario").val(0);
        } else {

        }


    });

});
$(function ()
{
    $("#del").button().on("change", function (event)
    {
        var patron = /^\d*$/;
        var numero = $("#del").val();
        if (!patron.test(numero)) {
            alert("formato de numeración de talonario incorrecto");
            $("#del").val(0);
        } else {

        }


    });

});
$(function ()
{
    $("#al").button().on("change", function (event)
    {
        var patron = /^\d*$/;
        var numero = $("#al").val();
        if (!patron.test(numero)) {
            alert("formato de numeración de talonario incorrecto");
            $("#al").val(0);
        } else {

        }


    });

});
$(function ()
{
    $("#planchas2").button().on("change", function (event)
    {
        var patron = /^\d*$/;
        var numero = $("#planchas2").val();
        if (!patron.test(numero)) {
            alert("solo se admiten valores positivos en el numero de planchas");
            $("#planchas2").val(0);
        } else {

        }


    });

});
$(function ()
{
    $("#cc").button().on("change", function (event)
    {
        var patron = /^\d*$/;
        var numero = $("#cc").val();
        if (!patron.test(numero)) {
            alert("un numero de cedula no puede ser negativo");
            $("#cc").val(0);
        } else {

        }


    });

});

$(function ()
{
    $("#fechaen").button().on("change", function (event)
    {

        var fechael = $("#fechael").val();
        if (fechael === null || fechael === "") {
            alert("debe diligenciar primero la fecha de elaboracion");
            $("#fechaen").val("");

        }
        else {

        }
    });
});

$(function ()
{
    $("#fechaen").button().on("change", function (event)
    {
        var fechaen = $("#fechaen").val();
        var fechael = $("#fechael").val();
        if (Date.parse(fechaen) >= Date.parse(fechael)) {

        }
        else {
            alert("La fecha de entrega debe ser mayor o igual a la fecha de elaboracion");
            $("#fechaen").val(fechael);
        }

    });


});



