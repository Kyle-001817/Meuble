<%-- 
    Document   : InsertMateriel
    Created on : 12 déc. 2023, 15:48:02
    Author     : Kyle
--%>
<%@page import="model.Volume"%>
<%@page import="model.Style"%>
<%@page import="model.*"%>
<%@page import="java.util.ArrayList"%>
<jsp:include page="Home/Header.jsp" />

<% ArrayList listeMateriel = (ArrayList<Object>)request.getAttribute("ListStyle");%>
<% ArrayList listeOuvrier = (ArrayList<Object>)request.getAttribute("ListOuvrier");%>
<% ArrayList listeVolume = (ArrayList<Object>)request.getAttribute("ListVolume");%>
    <!-- Header Start -->
    <div class="container-fluid page-header">
        <div class="container">
            <div class="d-flex flex-column align-items-center justify-content-center" style="min-height: 400px">
                <h3 class="display-4 text-white text-uppercase">PRIX STYLE</h3>
                <div class="d-inline-flex text-white">
                    <p class="m-0 text-uppercase"><a class="text-white" href="">Inserer prix style</a></p>
                    <i class="fa fa-angle-double-right pt-1 px-3"></i>
                </div>
            </div>
        </div>
    </div>
    <!-- Header End -->


    <!-- Booking Start -->
    <div class="container-fluid booking mt-5 pb-5">
        <div class="container pb-5">
            <form action="Ouvrier_travail_sur_un_style_servlet" method="post">
            <div class="bg-light shadow" style="padding: 30px;">
                <div class="row align-items-center" style="min-height: 60px;">
                    <div class="col-md-10">
                        <div class="row">
                            
                            <div class="col-md-12">
                                <div class="mb-3 mb-md-0">
                                    <div class="materiel" id="materiel" data-target-input="nearest">
                                        
                                        <select class="custom-select px-4" name="style" style="height: 47px;">
                                            <%for(int i=0; i<listeMateriel.size(); i++){%>
                                            <option value="<%out.print(((Style)listeMateriel.get(i)).getId_style());%>"><%out.print(((Style)listeMateriel.get(i)).getNom());%></option>
                                            <% } %>
                                        </select>
                                    </div>
                                    <div class="volume" id="volume" data-target-input="nearest">
                                        
                                        <select class="custom-select px-4" name="volume" style="height: 47px;">
                                            <%for(int i=0; i<listeVolume.size(); i++){%>
                                            <option value="<%out.print(((Volume)listeVolume.get(i)).getId_volume());%>"><%out.print(((Volume)listeVolume.get(i)).getTypes());%></option>
                                            <% } %>
                                        </select>
                                    </div>
                                    <div class="volume" id="volume" data-target-input="nearest">
                                        <select class="custom-select px-4" name="ouvrier" style="height: 47px;">
                                            <%for(int i=0; i<listeOuvrier.size(); i++){%>
                                            <option value="<%out.print(((Ouvrier)listeOuvrier.get(i)).getId_ouvrier());%>"><%out.print(((Ouvrier)listeOuvrier.get(i)).getFonction());%></option>
                                            <% } %>
                                        </select>
                                    </div>
                                    <div class="date mt-5" id="date1" data-target-input="nearest" >
                                        <input type="number" class="form-control p-4 datetimepicker-input" placeholder="Nombre" name="ouvrier" data-target="#date1" data-toggle="datetimepicker"/>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-2">
                        <button class="btn btn-primary btn-block" type="submit" style="height: 47px; margin-top: -2px;">Valider</button>
                    </div>
                </div>
                
            </div>
            </form>
        </div>
    </div>
    <!-- Booking End -->
   <jsp:include page="Home/Footer.jsp" />