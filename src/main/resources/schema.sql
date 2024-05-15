/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */

DROP TABLE IF EXISTS person;
CREATE TABLE person(
    id int auto_increment,
    firstname varchar(255) not null,
    lastname varchar(255) not null
);

INSERT INTO person(firstname, lastname) VALUES ('Jean', 'Dupont');
INSERT INTO person(firstname, lastname) VALUES ('Bill', 'Gates');
INSERT INTO person(firstname, lastname) VALUES ('Sébastien', 'Legrand');
INSERT INTO person(firstname, lastname) VALUES ('Alain', 'Dupont');