# --- Sample dataset

# --- !Ups
INSERT INTO Flight (id, boarding, arrival, date, price) VALUES (1, 'Dublin', 'Ottawa', '15-JUN-17', 523.17);
INSERT INTO Flight (id, boarding, arrival, date, price) VALUES (2, 'Bangkok', 'Madrid', '22-JUL-17', 739);
INSERT INTO Flight (id, boarding, arrival, date, price) VALUES (3, 'Manila', 'Istanbul', '09-AUG-17', 654.17);
INSERT INTO Flight (id, boarding, arrival, date, price) VALUES (4, 'London', 'Dublin', '02-NOV-17', 74.2);
INSERT INTO Flight (id, boarding, arrival, date, price) VALUES (5, 'Dubai', 'Tokyo', '25-AUG-17', 658);
INSERT INTO Flight (id, boarding, arrival, date, price) VALUES (6, 'Amsterdam', 'Rome', '01-MAY-17', 90);
INSERT INTO Flight (id, boarding, arrival, date, price) VALUES (7, 'Nice', 'Milan', '18-MAR-17', 129.3);
INSERT INTO Flight (id, boarding, arrival, date, price) VALUES (8, 'Washington', 'Paris', '14-APR-17', 447.7);
INSERT INTO Flight (id, boarding, arrival, date, price) VALUES (9, 'Moscow', 'Rio De Janeiro', '01-MAR-17', 790);
INSERT INTO Flight (id, boarding, arrival, date, price) VALUES (10, 'Orlando', 'Manchester', '04-JUL-17', 645);

INSERT INTO user (email,name,password,role) values ('user@flights.com', 'Alice Byrne', 'password', 'user');
INSERT INTO user (email,name,password,role) values ('user2@flights.com', 'Emily Apil', 'password', 'user');
INSERT INTO user (email,name,password,role) values ('user3@flights.com', 'Mila Gorger', 'password', 'user');
insert into user (email,name,password,role) values ( 'admin@flights.com', 'Yanika Khamkliang ', 'admin', 'admin');