create table tbl_customer (
id varchar2(20) not null,
pw varchar2(20) not null,
name varchar2(20) not null,
birth date not null,
age number,
sex char(1),
email varchar2(30),
phone number(11) not null,
address varchar2(100),
grade char(1) default 'C',
point number default 0,
constraint pk_customer_id primary key(id)
);



create table tbl_manager (
id varchar2(20) not null,
name varchar2(20) not null,
email varchar2(30) not null,
phone number(11) not null,
address varchar2(100),
grade char(1) default 'M',
department varchar2(30) not null,
position varchar2(30) not null,
constraint pk_manager_id primary key(id)
);



create table tbl_product (
manufacturer varchar2(30) not null,
production varchar2(30) not null,
proname varchar2(30) not null,
pronum number not null,
category varchar2(30) not null,
price number not null,
warranty number not null,
stock number not null,
constraint pk_product_pronum primary key(pronum)
);



create table tbl_review(
proname varchar2(30) not null,
pronum number not null,
category varchar2(30) not null,
id varchar2(20) not null,
rscore number(1) not null,
comment varchar2(500),
);



create table tbl_order (
id varchar2(20) not null,
name varchar2(20) not null,
birth date not null,
email varchar2(30),
phone number(11) not null,
address varchar2(100),
ordernum number not null,
orderdate date default sysdate,
proname varchar2(30) not null,
pronum number not null,
pickedcount number default 1,
indieprice number,
totalprice number,
savingpoint number,
status varchar2(20) default 'ordered',
ispaid char(1) default 'F',
isrefunded char(1),
constraint pk_order_oerdernum primary key(ordernum)
);



create table tbl_deliverstatus(
ordernum number not null,
orderdate date not null,
pronum number not null,
proname varchar2(30) not null,
id varchar2(20) not null,
name varchar2(20) not null,
phone number(11) not null,
address varchar2(100),
hdc varchar2(30) not null,
status varchar2(20) not null,
requiredday number default 3
)



create table tbl_refund(
oid varchar2(20) not null,
ordernum number not null,
orderdate date default sysdate,
product varchar2(30) not null,
pronum number not null,
pickedcount number default 1,
indieprice number,
totalprice number,
askdate date default sysdate,
isaccepted char(1),
acceptdate date,
comment varchar2(500)
)



create table tbl_deletedmember (
id varchar2(20) not null,
name varchar2(20) not null,
email varchar2(30),
grade char(1),
deletedate date default sysdate
);



create table tbl_deletedproduct (
proname varchar2(30) not null,
pronum number not null,
manufacturer varchar2(30) not null,
production varchar2(30) not null,
category varchar2(30) not null,
price number,
deleteddate date default sysdate
);



create table tbl_notice (
bno number,
id varchar2(20) not null,
grade char(1) not null,
criteria varchar2(30) not null,
title varchar2(30) not null,
content varchar2(3000) not null,
writedate date default sysdate
);



create table tbl_qna (
bno number,
cid varchar2(20) not null,
grade char(1) not null,
criteria varchar2(30) not null,
title varchar2(30) not null,
content varchar2(3000) not null,
writedate date default sysdate,
mid varchar2(20) not null,
answerdate date,
answer char(1) default 'F'
);



create table tbl_reply(
id number not null,
comment varchar2(500) not null,
writedate date default sysdate
)
