<%-- 
    Document   : Choix_matiere
    Created on : 19 déc. 2023, 15:57:52
    Author     : Kyle
--%>

<%@page import="model.Materiel"%>
<%@page import="java.util.ArrayList"%>
<jsp:include page="Home/Header.jsp" />
<!-- Header Start -->
    <div class="container-fluid page-header">
        <div class="container">
            <div class="d-flex flex-column align-items-center justify-content-center" style="min-height: 400px">
                <h3 class="display-4 text-white text-uppercase">Choix du materiel</h3>
                <div class="d-inline-flex text-white">
                    <p class="m-0 text-uppercase"><a class="text-white" href="">Veuillez Choisir le materiel</a></p>
                    <i class="fa fa-angle-double-right pt-1 px-3"></i>
                </div>
            </div>
        </div>
    </div>
    <!-- Header End -->

    <% ArrayList listMateriel = (ArrayList<Object>)request.getAttribute("ListMateriel");%>
    <!-- Booking Start -->
    <div class="container-fluid booking mt-5 pb-5">
        <div class="container pb-5">
            <div class="bg-light shadow" style="padding: 30px;">
                <form action="Style_byMateriel_servlet" method="post">
                    <div class="row align-items-center" style="min-height: 60px;">
                        <div class="col-md-10">
                            <div class="row">
                                <div class="col-md-12">
                                    <div class="mb-3 mb-md-0">
                                        <select class="custom-select px-4" name="materiel" style="height: 47px;">
                                            <%for(int i=0; i<listMateriel.size(); i++){%>
                                            <option value="<%out.print(((Materiel)listMateriel.get(i)).getId_mat());%>"><%out.print(((Materiel)listMateriel.get(i)).getNom());%></option>
                                            <% } %>
                                        </select>
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

<jsp:include page="Home/Footer.jsp" />
