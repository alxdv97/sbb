insert into roles (name) values ('user');
insert into roles (name) values ('admin');

insert into users (email, password, role_id) values ('user1@email.com', 'qwerty1', (select role_id from roles where roles.name = 'user'));
insert into users (email, password, role_id) values ('user2@email.com', 'qwerty2', (select role_id from roles where roles.name = 'user'));
insert into users (email, password, role_id) values ('user3@email.com', 'qwerty3', (select role_id from roles where roles.name = 'user'));
insert into users (email, password, role_id) values ('user4@email.com', 'qwerty4', (select role_id from roles where roles.name = 'user'));
insert into users (email, password, role_id) values ('user5@email.com', 'qwerty5', (select role_id from roles where roles.name = 'user'));
insert into users (email, password, role_id) values ('userAdmin@email.com', 'qwertyAdmin', (select role_id from roles where roles.name = 'admin'));

