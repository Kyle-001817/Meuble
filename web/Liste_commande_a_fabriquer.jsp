<%-- 
    Document   : ListStyle_byMateriel
    Created on : 19 déc. 2023, 16:15:43
    Author     : Kyle
--%>

<%@page import="model.V_commande_a_fabriquer"%>
<%@page import="model.Commande_a_Fabrique"%>
<%@page import="model.V_Volume_materiel"%>
<%@page import="java.util.List"%>
<jsp:include page="Home/Header.jsp" />

<% List<V_commande_a_fabriquer> listFabrication = (List<V_commande_a_fabriquer>)request.getAttribute("Liste_commande_a_fabriquer");%>
        <div style="width:500px; text-align: center; margin-top: 100px; margin-left: 350px; border-radius: 15px; border: none; box-shadow: 5px 5px 20px 1px gray; ">
            <table class="table">
                <tr>
                    <th>Style</th>
                    <th>Quantite</th>
                    <th>Volume</th>
                </tr>
                <%for(int i=0; i<listFabrication.size(); i++){%>
                    <tr>
                        <td><% out.print(listFabrication.get(i).getStyle()); %></td>
                        <td><% out.print(listFabrication.get(i).getQuantite()); %></td>
                        <td><% out.print(listFabrication.get(i).getVolume()); %></td>
                    </tr>
                <% } %>
            </table>
        </div>
            
<jsp:include page="Home/Footer.jsp" />

