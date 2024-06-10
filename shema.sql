DROP DATABASE meuble;
CREATE DATABASE meuble;
\c meuble;
create sequence seq_mat; -- sequence materiel
create table materiel (
    id_mat varchar (20) default 'MAT' || nextval('seq_mat') primary key,
    nom varchar (50)
);

create sequence seq_style; -- sequence style 
create table style (
    id_style varchar (20) default 'STYLE' || nextval('seq_style') primary key,
    nom varchar (50)
); 

create sequence seq_fab; 
create table fabrication (
    id_fab varchar (20) default 'FAB' || nextval('seq_fab') primary key,
    id_style varchar (20) references style (id_style), 
    id_mat varchar (20) references materiel (id_mat)
);
create sequence seq_unite;
create table unites(
    id_unite varchar(20) default 'UNIT' || nextval('seq_unite') primary key,
    nom varchar(20)
);
INSERT INTO unites(nom) values('mettre');
INSERT INTO unites(nom) values('piece');
create sequence seq_vol;
create table volume(
    id_volume varchar(20) default 'VOL' || nextval('seq_vol') primary key,
    types varchar(20)
);
INSERT INTO volume(types) VALUES('PM');
INSERT INTO volume(types) VALUES('GM');

create table volume_materiel(
    id_mat varchar(20) references materiel(id_mat),
    id_style varchar(20) references style(id_style),
    id_volume varchar(20) references volume(id_volume),
    id_unite varchar(20) references unites(id_unite),
    quantite real
);
CREATE SEQUENCE seq_pm;
create table prix_materiel(
    id_prix_materiel VARCHAR(20) default 'PM' || nextval('seq_pm') primary key,
    id_materiel VARCHAR(20) references materiel(id_mat),
    prix REAL
);
CREATE SEQUENCE seq_ps;
create table prix_style(
    id_prix_style VARCHAR(20) default 'PS' || nextval('seq_ps') primary key,
    id_style VARCHAR(20) references style(id_style),
    id_volume VARCHAR(20) references volume(id_volume),
    prix REAL
);
CREATE SEQUENCE seq_stock;
create table stock(
    id_stock VARCHAR(20) default 'STOCK' || nextval('seq_stock') primary key,
    id_materiel VARCHAR(20) references materiel(id_mat),
    quantite REAL,
    id_unite VARCHAR(20) references unites(id_unite)
);
CREATE SEQUENCE seq_caf;
create table commande_a_fabriquer (
    id_commande VARCHAR(20) default 'CAF' || nextval('seq_caf') primary key,
    id_style varchar(20) references style(id_style),
    id_volume varchar(20) references volume(id_volume),
    quantite real
);
CREATE SEQUENCE ouvrier_seq;
CREATE TABLE ouvrier(
    id_ouvrier VARCHAR(20) default 'OUVRIER' || nextval('ouvrier_seq') primary key,
    fonction VARCHAR(200),
    karama real
);
CREATE SEQUENCE seq_so;
CREATE TABLE style_ouvrier(
    id_style_ouvrier VARCHAR(20) default 'SO' || nextval('seq_so') primary key,
    id_style VARCHAR(20) references style(id_style),
    id_ouvrier VARCHAR(20) references ouvrier(id_ouvrier),
    horaire real
);
CREATE SEQUENCE seq_ots;
CREATE TABLE ouvrier_travail_sur_un_style(
    id_ouvrier_travail_sur_un_style VARCHAR(20) default 'OTS' || nextval('seq_ots') primary key,
    id_style VARCHAR(20) references style(id_style),
    id_volume VARCHAR(20) references volume(id_volume),
    id_ouvrier VARCHAR(20) references ouvrier(id_ouvrier),
    nombre int
);
CREATE TABLE 
-- prix 2 --> meuble manana anireo benefice
-- BENEFICE: prix de vente - prix de revient
-- prix de revient = (charge personne + charge matiere)


CREATE OR REPLACE VIEW v_fabrication as select fabrication.*,materiel.nom as nom_materiel,style.nom as nom_style from fabrication join materiel on materiel.id_mat = fabrication.id_mat join style on style.id_style = fabrication.id_style;
create or replace view v_volume_matiere as select volume_materiel.*,materiel.nom as nom_materiel,style.nom as nom_style,volume.types as type_volume,unites.nom as nom_unite from volume_materiel join materiel on materiel.id_mat = volume_materiel.id_mat join style on style.id_style = volume_materiel.id_style join volume on volume.id_volume = volume_materiel.id_volume join unites on unites.id_unite = volume_materiel.id_unite;
create or replace view v_prix_materiel as 
select v_volume_matiere.nom_style,v_volume_matiere.nom_materiel,v_volume_matiere.type_volume,v_volume_matiere.quantite,prix_materiel.prix,(v_volume_matiere.quantite * prix_materiel.prix) as prix_total 
from v_volume_matiere 
join prix_materiel on prix_materiel.id_materiel = v_volume_matiere.id_mat;

create or replace view V_commande_a_fabriquer as select commande_a_fabriquer.*,style.nom as style,volume.types as volume from commande_a_fabriquer join style on style.id_style = commande_a_fabriquer.id_style join volume on volume.id_volume = commande_a_fabriquer.id_volume;


SELECT nom_style, type_volume FROM v_prix_materiel GROUP BY nom_style, type_volume HAVING SUM(prix_total) BETWEEN 150000 AND 200000;

select nom_materiel,nom_style,sum(quantite) from v_volume_matiere group by nom_materiel,nom_style;

-- Prix_olona_miasa
