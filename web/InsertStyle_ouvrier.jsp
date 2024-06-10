<%-- 
    Document   : InsertMateriel
    Created on : 12 déc. 2023, 15:48:02
    Author     : Kyle
--%>
<%@page import="model.Ouvrier"%>
<%@page import="model.Style"%>
<%@page import="java.util.ArrayList"%>
<jsp:include page="Home/Header.jsp" />
<% ArrayList listeStyle = (ArrayList<Object>)request.getAttribute("ListStyle");%>
<% ArrayList listeOuvrier = (ArrayList<Object>)request.getAttribute("ListOuvrier");%>
    <!-- Header Start -->
    <div class="container-fluid page-header">
        <div class="container">
            <div class="d-flex flex-column align-items-center justify-content-center" style="min-height: 400px">
                <h3 class="display-4 text-white text-uppercase">STYLE-OUVRIER</h3>
                <div class="d-inline-flex text-white">
                    <p class="m-0 text-uppercase"><a class="text-white" href="">Inserer plus d'ouvrier</a></p>
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
                <form action="Insert_style_ouvrier_servlet" method="post">
                <div class="row align-items-center" style="min-height: 60px;">
                    <div class="col-md-10">
                        <div class="row">
                            <div class="col-md-12">
                                <div class="mb-3 mb-md-0">
                                    <div class="materiel" id="materiel" data-target-input="nearest">
                                        
                                        <select class="custom-select px-4" name="style" style="height: 47px;">
                                            <%for(int i=0; i<listeStyle.size(); i++){%>
                                            <option value="<%out.print(((Style)listeStyle.get(i)).getId_style());%>"><%out.print(((Style)listeStyle.get(i)).getNom());%></option>
                                            <% } %>
                                        </select>
                                    </div>
                                </div>
                            </div>
                            <div class="col-md-12">
                                <div class="mb-3 mb-md-0">
                                    <div class="materiel" id="materiel" data-target-input="nearest">
                                        
                                        <select class="custom-select px-4" name="ouvrier" style="height: 47px;">
                                            <%for(int i=0; i<listeOuvrier.size(); i++){%>
                                            <option value="<%out.print(((Ouvrier)listeOuvrier.get(i)).getId_ouvrier());%>"><%out.print(((Ouvrier)listeOuvrier.get(i)).getFonction());%></option>
                                            <% } %>
                                        </select>
                                    </div>
                                </div>
                            </div>
                            <div class="col-md-12">
                                <div class="mb-3 mb-md-0">
                                    <div class="date" id="date1" data-target-input="nearest">
                                        <input type="number" class="form-control p-4 datetimepicker-input" placeholder="Horaire" name="horaire" data-target="#date1" data-toggle="datetimepicker"/>
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