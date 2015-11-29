var cont = 1;
var cont1 = 1;

$(document).ready(function () {
    $("#contadortinta0").val(0)
    $("#contadortinta00").val(0)

});


$(function ()
{
    $("#btn_tint").button().on("click", function (event)
    {

        $("#divtint").append("<p class=" + cont + ">Tinta " + cont + "<INPUT type=text name='tintas" + cont + "'></p>");
        $("#contadortinta0").empty()
        $("#contadortinta0").val(cont)
        cont++;

    });

    $("#btn_tint_d").button().on("click", function (event)
    {

        cont--;

        $("#divtint ." + cont).remove();
        if (cont <= 1) {
            cont = 1;
            $("#contadortinta0").empty()
            $("#contadortinta0").val(0)
        } else {
            $("#contadortinta0").empty()
            $("#contadortinta0").val(cont - 1)
        }


    });

    $("#btn_tint2").button().on("click", function (event)
    {

        $("#divtint2").append("<p class=" + cont1 + ">Tinta " + cont1 + "<INPUT type=text name='tintas0" + cont1 + "'></p>");
        $("#contadortinta00").empty()
        $("#contadortinta00").val(cont1)
        cont1++;


    });

    $("#btn_tint2_d").button().on("click", function (event)
    {
        cont1--;

        $("#divtint2 ." + cont1).remove();
        if (cont1 <= 1) {
            cont1 = 1;
            $("#contadortinta00").empty()
            $("#contadortinta00").val(0)
        } else {
            $("#contadortinta00").empty()
            $("#contadortinta00").val(cont1 - 1)
        }

    });
});
$(function ()
{
    $("#nit2").button().on("change", function (event)
    {
        var patron = /^\d*$/;
        var numero = $("#nit2").val();
        if (!patron.test(numero)) {
            alert("un numero de NIT no puede ser negativo");
            $("#nit2").val(0);
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
    $("#fechaen1").button().on("change", function (event)
    {

        var fechael = $("#fechael1").val();
        if (fechael === null || fechael === "") {
            alert("debe diligenciar primero la fecha de creación");
            $("#fechaen1").val("");

        }
        else {

        }
    });
});

$(function ()
{
    $("#fechaen1").button().on("change", function (event)
    {
        var fechaen = $("#fechaen1").val();
        var fechael = $("#fechael1").val();
        if (Date.parse(fechaen) >= Date.parse(fechael)) {

        }
        else {
            alert("La fecha de entrega debe ser mayor o igual a la fecha de elaboracion");
            $("#fechaen1").val(fechael);
        }

    });


});