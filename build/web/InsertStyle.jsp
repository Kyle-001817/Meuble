<%-- 
    Document   : InsertMateriel
    Created on : 12 déc. 2023, 15:48:02
    Author     : Kyle
--%>
<jsp:include page="Home/Header.jsp" />
    <!-- Header Start -->
    <div class="container-fluid page-header">
        <div class="container">
            <div class="d-flex flex-column align-items-center justify-content-center" style="min-height: 400px">
                <h3 class="display-4 text-white text-uppercase">STYLE</h3>
                <div class="d-inline-flex text-white">
                    <p class="m-0 text-uppercase"><a class="text-white" href="">Inserer plus de style</a></p>
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
                            <form action="InsertStyle_servlet" method="post">
                            <div class="col-md-12">
                                <div class="mb-3 mb-md-0">
                                    <div class="date" id="date1" data-target-input="nearest">
                                        <input type="text" class="form-control p-4 datetimepicker-input" placeholder="Nom du Style" name="style" data-target="#date1" data-toggle="datetimepicker"/>
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