<%-- 
    Document   : ListStyle_byMateriel
    Created on : 19 déc. 2023, 16:15:43
    Author     : Kyle
--%>

<%@page import="model.*"%>
<%@page import="java.util.List"%>
<jsp:include page="Home/Header.jsp" />

<% List<V_prix_materiel> list = (List<V_prix_materiel>)request.getAttribute("List_style");%>
        <div style="width:500px; text-align: center; margin-top: 100px; margin-left: 350px; border-radius: 15px; border: none; box-shadow: 5px 5px 20px 1px gray; ">
            <table class="table">
                <tr>
                    <th>Style</th>
                    <th>Volume</th>
                    <th>Prix</th>
                </tr>
                <%for(int i=0; i<list.size(); i++){%>
                    <tr>
                        <td><% out.print(list.get(i).getNom_style()); %></td>
                        <td><% out.print(list.get(i).getType_volume()); %></td>
                        <td><% out.print(list.get(i).getPrix_total()); %></td>
                    </tr>
                <% } %>
            </table>
        </div>
            
<jsp:include page="Home/Footer.jsp" />
