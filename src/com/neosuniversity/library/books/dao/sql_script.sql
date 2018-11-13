select * from libros;
insert into libros ( nombreLibro, autor, editorial) values ("JAVA EN 21 DIAS","DEITEL","OMEGA") ;
insert into libros ( nombreLibro, autor, editorial) values ("MONGODB","KARLA","WESLEY") ;
select   id_libro, nombreLibro, autor, editorial from libros;

create table libros
(
  id_libro    int auto_increment
    primary key,
  nombreLibro varchar(50) not null,
  autor       varchar(50) not null,
  editorial   varchar(50) null
);