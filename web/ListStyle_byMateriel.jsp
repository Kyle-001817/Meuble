<%-- 
    Document   : ListStyle_byMateriel
    Created on : 19 déc. 2023, 16:15:43
    Author     : Kyle
--%>

<%@page import="model.V_Volume_materiel"%>
<%@page import="java.util.List"%>
<jsp:include page="Home/Header.jsp" />

<% List<V_Volume_materiel> listFabrication = (List<V_Volume_materiel>)request.getAttribute("ListMateriel");%>
        <div style="width:500px; text-align: center; margin-top: 100px; margin-left: 350px; border-radius: 15px; border: none; box-shadow: 5px 5px 20px 1px gray; ">
            <table class="table">
                <tr>
                    <th>Style</th>
                    <th>Quantite</th>
                    <th>Unite</th>
                    <th>Volume</th>
                </tr>
                <%for(int i=0; i<listFabrication.size(); i++){%>
                    <tr>
                        <td><% out.print(listFabrication.get(i).getNom_style()); %></td>
                        <td><% out.print(listFabrication.get(i).getQuantite()); %></td>
                        <td><% out.print(listFabrication.get(i).getNom_unite()); %></td>
                        <td><% out.print(listFabrication.get(i).getType_volume()); %></td>
                    </tr>
                <% } %>
            </table>
        </div>
            
<jsp:include page="Home/Footer.jsp" />
