create table yb.customer(
    id int,
    name char(500)
);
grant connect on database postgres to yb;
grant usage on schema yb to yb;
grant all on all tables in schema yb to yb;

create sequence yb.customer_seq;