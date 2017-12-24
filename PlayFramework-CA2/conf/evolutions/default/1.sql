# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table flight (
  id                            bigint auto_increment not null,
  boarding                      varchar(255),
  arrival                       varchar(255),
  date                          varchar(255),
  price                         double not null,
  constraint pk_flight primary key (id)
);

create table user (
  email                         varchar(255) not null,
  role                          varchar(255),
  name                          varchar(255),
  password                      varchar(255),
  constraint pk_user primary key (email)
);


# --- !Downs

drop table if exists flight;

drop table if exists user;

