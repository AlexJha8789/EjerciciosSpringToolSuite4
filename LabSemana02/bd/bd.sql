-- borra la bd si existe
DROP DATABASE IF EXISTS bd_semana02;
-- creamos la bd
CREATE DATABASE bd_semana02;
-- activamos la bd
USE bd_semana02;

create table tb_departamento(
id_Departamento		int not null  auto_increment primary key,
nom_Departamento  varchar(100)
);

create table tb_empleado(
id_Empleado      int not null  auto_increment primary key,
nombre  varchar(100),
ape_pat varchar(100),
ape_mat varchar(100),
direccion  varchar(100),
id_Departamento	int not null,
foreign key (id_Departamento) references tb_departamento(id_Departamento)
);

create table tb_capacitacion(
id_Capacitacion		int not null  auto_increment primary key,
nom_capacitacion    varchar(100),
fec_inicio			date,
fec_fin				date
);

create table tb_emp_capa(
id_Emp_Cap			int not null  auto_increment primary key,
id_Empleado   		int  ,
id_Capacitacion		int  , 
CONSTRAINT fk_empleado FOREIGN KEY (id_Empleado) REFERENCES tb_empleado(id_Empleado),
CONSTRAINT fk_capacitacion FOREIGN KEY (id_Capacitacion) REFERENCES tb_capacitacion(id_Capacitacion)
);

 

insert into tb_departamento values (null,'SISTEMAS'); 
insert into tb_departamento values (null,'MARKETING');
insert into tb_departamento values (null,'CONTABILIDAD');


insert into tb_empleado values (null,'Jose','Trujillo','Vargas','Jr. Tacna nro. 388',1);
insert into tb_empleado values (null,'Alison','Mendez','Guzman','Av. Larco nro. 854',2);
insert into tb_empleado values (null,'Ximena','Ayala','Mayta','Psj. Los destellos nro. 123',3);
insert into tb_empleado values (null,'Patricia','Torres','Porras','Jr. Lima nro 985',1);
insert into tb_empleado values (null,'Miluska','Mino','Palomino','Av. Larco nro 652',2);
insert into tb_empleado values (null,'Juan','Rau','Paredes','Av. Miroquesada nro 985',3);
insert into tb_empleado values (null,'Marcos','Mamani','Cortez','Jr. Bermudez nro 541',1);
insert into tb_empleado values (null,'Mario','Gutarra','Vilchez','Av. Tacna nro 365',2);
insert into tb_empleado values (null,'Emilio','Tinoco','Roman','Jr. Javier Prado nro 452',3);
insert into tb_empleado values (null,'Lizzeth','Medina','Rivera','Jr. Pasco nro 541',1);
insert into tb_empleado values (null,'Juana','Torres','Jimenez','Av. Arequipa nro 365',2);
insert into tb_empleado values (null,'Magaly','Flores','Law','Jr. Huánuco nro 987',3);
 
 
insert into tb_capacitacion values (null,'Habilidades Blandas','2022-09-01',' 2022-09-05'); 
insert into tb_capacitacion values (null,'Liderazgo de Equipos','2022-09-10','2022-09-15'); 
insert into tb_capacitacion values (null,'Inteligencia Emocional','2022-09-20','2022-09-25'); 
 
 
insert into tb_emp_capa values (null,1,1); 
insert into tb_emp_capa values (null,2,1);
insert into tb_emp_capa values (null,3,1);
insert into tb_emp_capa values (null,4,1); 
insert into tb_emp_capa values (null,5,1);
insert into tb_emp_capa values (null,6,1);
insert into tb_emp_capa values (null,7,1); 
insert into tb_emp_capa values (null,8,1);
insert into tb_emp_capa values (null,9,1);
insert into tb_emp_capa values (null,10,1); 
insert into tb_emp_capa values (null,11,1);
insert into tb_emp_capa values (null,12,1);






 
