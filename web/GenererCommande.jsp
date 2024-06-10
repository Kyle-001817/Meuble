<%-- 
    Document   : InsertFabrication
    Created on : 12 déc. 2023, 16:10:13
    Author     : Kyle
--%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.*"%>
<jsp:include page="Home/Header.jsp" />

<% ArrayList listStyle = (ArrayList<Object>)request.getAttribute("ListStyle");%>
<% ArrayList listVolume = (ArrayList<Object>)request.getAttribute("ListVolume");%>
<% ArrayList id_style = (ArrayList<Object>)request.getAttribute("id_style");%>
<% ArrayList id_volume = (ArrayList<Object>)request.getAttribute("id_volume");%>
<% ArrayList listeTemp = (ArrayList<Object>)request.getAttribute("listeTemp");%>
<% String erreur = (String)request.getAttribute("erreur"); %>
    <!-- Header Start -->
    <div class="container-fluid page-header">
        <div class="container">
            <div class="d-flex flex-column align-items-center justify-content-center" style="min-height: 400px">
                <h3 class="display-4 text-white text-uppercase">FABRICATION MEUBLES</h3>
                <div class="d-inline-flex text-white">
                    <p class="m-0 text-uppercase"><a class="text-white" href="">Fabrication des meubles</a></p>
                    <i class="fa fa-angle-double-right pt-1 px-3"></i>
                </div>
            </div>
        </div>
    </div>
    <!-- Header End -->


    <!-- Booking Start -->
    <div class="container-fluid booking mt-5 pb-5">
        <div class="container pb-5">
            <div class="bg-light shadow" style="padding: 30px;">
                <div class="row align-items-center" style="min-height: 60px;">
                    <form action="Commande_selon_formule_servlet" method="post">
                    <div class="col-md-10">
                        <div class="row">
                            <%out.print(erreur); %>
                            <div class="col-md-12">
                                <div class="col-md-3">
                                    <div class="mb-3 mb-md-0">
                                        <select class="custom-select px-4" name="style" style="float: left; height: 47px; width: 500px;">
                                            <%for(int i=0; i<listStyle.size(); i++){%>
                                            <option value="<%out.print((id_style.get(i)));%>"><%out.print((listStyle.get(i)));%></option>
                                            <% } %>
                                        </select>
                                    </div>
                                </div>
                                
                                <div class="col-md-3">
                                    <div class="mb-3 mb-md-0">
                                        <select class="custom-select px-4" name="volume" style="float: left; height: 47px; width: 500px; margin-top: 50px;">
                                            <%for(int i=0; i<listVolume.size(); i++){%>
                                            <option value="<%out.print((id_volume.get(i)));%>"><%out.print((listVolume.get(i)));%></option>
                                            <% } %>
                                        </select>
                                    </div>
                                </div>
                                <div class="col-md-3">
                                    <div class="mb-3 mb-md-0">
                                        <div class="date" style="float: left; height: 47px; width: 500px; margin-top: 50px;" id="date1" data-target-input="nearest">
                                            <input type="number" class="form-control p-4 datetimepicker-input" placeholder="Quantite" name="quantite" data-target="#date1" data-toggle="datetimepicker"/>
                                        </div>
                                    </div>
                                </div>                                 
                            </div>
                        </div>
                    </div>
                     <div class="col-md-5">
                        <button class="btn btn-primary btn-block" type="submit" style="height: 47px; margin-top: -2px;">Valider</button>
                    </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
        <div style="width:500px; text-align: center; margin-top: 100px; margin-left: 350px; border-radius: 15px; border: none; box-shadow: 5px 5px 20px 1px gray; ">
            <table class="table">
                <tr>
                    <th>Style</th>
                    <th>Volume</th>
                    <th>Quantite</th>
                </tr>
                <% if (listeTemp == null){ %>
                    <td></td>
                <% } else { %>
                    <%for(int i=0; i<listeTemp.size(); i++){%>
                        <tr>
                            <td><% out.print(((Commande_a_Fabrique)(listeTemp.get(i))).getId_style()); %></td>
                        </tr>
                    <% } %>
                <% } %>
            </table>
        </div>
    <!-- Booking End -->
    <jsp:include page="Home/Footer.jsp" />
