<%-- 
    Document   : InsertFabrication
    Created on : 12 déc. 2023, 16:10:13
    Author     : Kyle
--%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.*"%>
<jsp:include page="Home/Header.jsp" />

<% ArrayList listMateriel = (ArrayList<Object>)request.getAttribute("ListMateriel");%>
<% ArrayList listStyle = (ArrayList<Object>)request.getAttribute("ListStyle");%>
<% ArrayList listVolume = (ArrayList<Object>)request.getAttribute("ListeVolume");%>
<% ArrayList listUnite = (ArrayList<Object>)request.getAttribute("ListeUnite");%>
<% ArrayList listVM = (ArrayList<Object>)request.getAttribute("ListeVM");%>
    <!-- Header Start -->
    <div class="container-fluid page-header">
        <div class="container">
            <div class="d-flex flex-column align-items-center justify-content-center" style="min-height: 400px">
                <h3 class="display-4 text-white text-uppercase">CLASSEMENT DES MATERIELS</h3>
                <div class="d-inline-flex text-white">
                    <p class="m-0 text-uppercase"><a class="text-white" href="">Insertion des classements materiels</a></p>
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
                    <div class="col-md-10">
                        <div class="row">
                            <form action="Charge_Insert_materiel_Fabrication" method="post">
                            <div class="col-md-12">
                                <div class="col-md-3">
                                    <div class="mb-3 mb-md-0">
                                        <select class="custom-select px-4" name="style" style="float: left; height: 47px; width: 500px;">
                                            <option selected>Style</option>
                                            <%for(int i=0; i<listStyle.size(); i++){%>
                                            <option value="<%out.print(((Style)listStyle.get(i)).getId_style());%>"><%out.print(((Style)listStyle.get(i)).getNom());%></option>
                                            <% } %>
                                        </select>
                                    </div>
                                </div>
                                <div class="col-md-3">
                                    <div class="mb-3 mb-md-0">
                                        <select class="custom-select px-4" name="materiel" style="float: left; height: 47px; width: 500px; margin-top: 50px;">
                                            <option selected>Materiel</option>
                                            <%for(int i=0; i<listMateriel.size(); i++){%>
                                            <option value="<%out.print(((Materiel)listMateriel.get(i)).getId_mat());%>"><%out.print(((Materiel)listMateriel.get(i)).getNom());%></option>
                                            <% }%>
                                        </select>
                                    </div>
                                </div>
                                <div class="col-md-3">
                                    <div class="mb-3 mb-md-0">
                                        <select class="custom-select px-4" name="volume" style="float: left; height: 47px; width: 500px; margin-top: 50px;">
                                            <%for(int i=0; i<listVolume.size(); i++){%>
                                            <option value="<%out.print(((Volume)listVolume.get(i)).getId_volume());%>"><%out.print(((Volume)listVolume.get(i)).getTypes());%></option>
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
                                <div class="col-md-3">
                                    <div class="mb-3 mb-md-0">
                                        <select class="custom-select px-4" name="unite" style="float: left; height: 47px; width: 500px; margin-top: 50px;">
                                            <%for(int i=0; i<listUnite.size(); i++){%>
                                            <option value="<%out.print(((Unites)listUnite.get(i)).getId_unite());%>"><%out.print(((Unites)listUnite.get(i)).getNom());%></option>
                                            <% } %>
                                        </select>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-2">
                        <button class="btn btn-primary btn-block" type="submit" style="height: 47px; margin-top: -2px;">Valider</button>
                    </div>
                </div>
                </form>
            </div>
        </div>
    </div>
    <!-- Booking End -->
    <jsp:include page="Home/Footer.jsp" />