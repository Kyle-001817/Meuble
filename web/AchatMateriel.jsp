<%-- 
    Document   : InsertFabrication
    Created on : 12 déc. 2023, 16:10:13
    Author     : Kyle
--%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.*"%>

<% List<Materiel> list = (List<Materiel>)request.getAttribute("ListMateriel");%>
<% List<Unites> liste = (List<Unites>)request.getAttribute("ListeUnite");%>
<jsp:include page="Home/Header.jsp" />
    <!-- Header Start -->
    <div class="container-fluid page-header">
        <div class="container">
            <div class="d-flex flex-column align-items-center justify-content-center" style="min-height: 400px">
                <h3 class="display-4 text-white text-uppercase">ACHAT MATERIEL</h3>
                <div class="d-inline-flex text-white">
                    <p class="m-0 text-uppercase"><a class="text-white" href="">Insertion Achat materiels</a></p>
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
                            <form action="Achat_materiel_servlet" method="post">
                            <div class="col-md-12">
                                <div class="col-md-3">
                                    <div class="mb-3 mb-md-0">
                                        <select class="custom-select px-4" name="materiel" style="float: left; height: 47px; width: 500px;">
                                            <%for(int i=0; i<list.size(); i++){%>
                                            <option value="<%out.print(((Materiel)list.get(i)).getId_mat());%>"><%out.print(((Materiel)list.get(i)).getNom());%></option>
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
                                            <%for(int i=0; i<liste.size(); i++){%>
                                            <option value="<%out.print(((Unites)liste.get(i)).getId_unite());%>"><%out.print(((Unites)liste.get(i)).getNom());%></option>
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