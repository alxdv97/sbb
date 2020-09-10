--ROLES
insert into roles (name) values ('user');
insert into roles (name) values ('admin');

--USERS
insert into users (email, password, role_id) values ('user1@email.com', 'qwerty1', (select role_id from roles where roles.name = 'user'));
insert into users (email, password, role_id) values ('user2@email.com', 'qwerty2', (select role_id from roles where roles.name = 'user'));
insert into users (email, password, role_id) values ('user3@email.com', 'qwerty3', (select role_id from roles where roles.name = 'user'));
insert into users (email, password, role_id) values ('user4@email.com', 'qwerty4', (select role_id from roles where roles.name = 'user'));
insert into users (email, password, role_id) values ('user5@email.com', 'qwerty5', (select role_id from roles where roles.name = 'user'));
insert into users (email, password, role_id) values ('userAdmin@email.com', 'qwertyAdmin', (select role_id from roles where roles.name = 'admin'));

--STATIONS
insert into stations (name) values ('Lugano');
insert into stations (name) values ('Zurich HB');
insert into stations (name) values ('Bern');
insert into stations (name) values ('Basel SBB');
insert into stations (name) values ('Lausanne');
insert into stations (name) values ('Winterthur');
insert into stations (name) values ('Lucerne');
insert into stations (name) values ('Zurich Oerlikon');
insert into stations (name) values ('Zurich Stadelhofen');
insert into stations (name) values ('Geneva');
insert into stations (name) values ('Zurich Hardbrucke');
insert into stations (name) values ('St. Gallen');
insert into stations (name) values ('Zurich Airport');
insert into stations (name) values ('Biel/Bienne');
insert into stations (name) values ('Zug');
insert into stations (name) values ('Baden');
insert into stations (name) values ('Zurich Altstetten');
insert into stations (name) values ('Thun');
insert into stations (name) values ('Neuchatel');
insert into stations (name) values ('Chur');
insert into stations (name) values ('Uster');
insert into stations (name) values ('Rapperswil');
insert into stations (name) values ('Fribourg');
insert into stations (name) values ('Brugg AG');
insert into stations (name) values ('Vevey');
insert into stations (name) values ('Stettbach');
insert into stations (name) values ('Dietikon');
insert into stations (name) values ('Visp');
insert into stations (name) values ('Renens CFF');
insert into stations (name) values ('Thalwil');
insert into stations (name) values ('Schaffhausen');
insert into stations (name) values ('Bulach');
insert into stations (name) values ('Nyon');
insert into stations (name) values ('Effretikon');
insert into stations (name) values ('Liestal');
insert into stations (name) values ('Brig');
insert into stations (name) values ('Montreux');
insert into stations (name) values ('Morges');
insert into stations (name) values ('Solothurn');
insert into stations (name) values ('Burgdorf');
insert into stations (name) values ('Geneva Airport');
insert into stations (name) values ('Bellinzona');
