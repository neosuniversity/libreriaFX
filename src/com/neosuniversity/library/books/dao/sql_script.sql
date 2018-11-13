select * from libros;
insert into libros ( nombrelibro, autor, editorial) values ("JAVA EN 21 DIAS","DEITEL","OMEGA") ;
insert into libros ( nombrelibro, autor, editorial) values ("MONGODB","KARLA","WESLEY") ;
select   id_libro, nombrelibro, autor, editorial from libros;

CREATE SCHEMA library;

create table libros
(
  id_libro    int auto_increment
    primary key,
  nombrelibro varchar(50) null,
  autor       varchar(50) null,
  editorial   varchar(50) null
);


INSERT INTO libros ( nombrelibro, autor, editorial) values (?, ? , ?) ;
