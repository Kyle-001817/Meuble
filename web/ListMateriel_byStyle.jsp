<%@page import="java.util.List"%>
<%@page import="model.V_Fabrication"%>
<%@page import="java.util.ArrayList"%>
<jsp:include page="Home/Header.jsp" />

        <% List<V_Fabrication> listFabrication = (List<V_Fabrication>)request.getAttribute("ListStyle");%>
        <div style="width:500px; text-align: center; margin-top: 100px; margin-left: 350px; border-radius: 15px; border: none; box-shadow: 5px 5px 20px 1px gray; ">
            <table class="table">
                <%for(int i=0; i<listFabrication.size(); i++){%>
                    <tr>
                        <td><% out.print(listFabrication.get(i).getNom_materiel()); %></td>
                    </tr>
                <% } %>
            </table>
        </div>
            
<jsp:include page="Home/Footer.jsp" />