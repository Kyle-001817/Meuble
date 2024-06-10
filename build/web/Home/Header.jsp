<%-- 
    Document   : Header
    Created on : 18 déc. 2023, 08:21:16
    Author     : Kyle
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
    <title>MEUBLE-Fabrication</title>
    <meta content="width=device-width, initial-scale=1.0" name="viewport">
    <link href="img/favicon.ico" rel="icon">
    <link href="Assets/css/style.css" rel="stylesheet">
    </head>
    
    <body>
    <!-- Topbar Start -->
    <div class="container-fluid bg-light pt-3 d-none d-lg-block">
        <div class="container">
            <div class="row">
                <div class="col-lg-6 text-center text-lg-right">
                    <div class="d-inline-flex align-items-center">
                        <a class="text-primary px-3" href="">
                            <i class="fab fa-facebook-f"></i>
                        </a>
                        <a class="text-primary px-3" href="">
                            <i class="fab fa-twitter"></i>
                        </a>
                        <a class="text-primary px-3" href="">
                            <i class="fab fa-linkedin-in"></i>
                        </a>
                        <a class="text-primary px-3" href="">
                            <i class="fab fa-instagram"></i>
                        </a>
                        <a class="text-primary pl-3" href="">
                            <i class="fab fa-youtube"></i>
                        </a>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- Topbar End -->


    <!-- Navbar Start -->
    <div class="container-fluid position-relative nav-bar p-0">
        <div class="container-lg position-relative p-0 px-lg-3" style="z-index: 9;">
            <nav class="navbar navbar-expand-lg bg-light navbar-light shadow-lg py-3 py-lg-0 pl-3 pl-lg-5">
                <a href="" class="navbar-brand">
                    <h1 class="m-0 text-primary"><span class="text-dark">MEUBLE</span>-FAB</h1>
                </a>
                <button type="button" class="navbar-toggler" data-toggle="collapse" data-target="#navbarCollapse">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse justify-content-between px-3" id="navbarCollapse">
                    <div class="navbar-nav ml-auto py-0">
                        <a href="index.jsp" class="nav-item nav-link active">Accueil</a>
                        <a href="InsertMateriel.jsp" class="nav-item nav-link">Materiel</a>
                        <a href="InsertStyle.jsp" class="nav-item nav-link">Style</a>
                        <a href="InsertPrix_servlet" class="nav-item nav-link">Prix</a>
                        <a href="Charge_Insert_materiel_Fabrication" class="nav-item nav-link">Classements</a>
                        <a href="Choix_style_servlet" class="nav-item nav-link">Choix du style</a>
                        <a href="Choix_materiel_servlet" class="nav-item nav-link">Choix du materiel</a>
                        <a href="Argent.jsp" class="nav-item nav-link">Acheter du meuble</a>
                    </div>
                </div>
            </nav>
        </div>
    </div>
    <!-- Navbar End -->


