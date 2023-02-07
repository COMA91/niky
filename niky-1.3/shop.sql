create table tbl_customer (
id varchar2(20) not null,
pw varchar2(20) not null,
name varchar2(20) not null,
birth date not null,
age number,
sex char(1),
email varchar2(60),
phone number(11) not null,
address varchar2(100),
grade char(1) default 'C',
point number default 0,
joiningdate date default SYSDATE,
constraint pk_customer_id primary key(id)
);



create table tbl_manager (
id varchar2(20) not null,
pw varchar2(20) not null,
name varchar2(20) not null,
email varchar2(60) not null,
phone number(11) not null,
address varchar2(100),
grade char(1) default 'M',
department varchar2(30) not null,
position varchar2(30) not null,
joiningdate date default SYSDATE,
constraint pk_manager_id primary key(id)
);
select * from TBL_MANAGER


create table tbl_product (
manufacturer varchar2(30) not null,
production varchar2(30) not null,
proname varchar2(30) not null,
pronum number not null,
category varchar2(30) not null,
sex char(1),
price number not null,
warranty number not null,
stock number not null,
constraint pk_product_pronum primary key(pronum)
);



create sequence seq_product_pronum;



create table tbl_review(
proname varchar2(30) not null,
pronum number not null,
category varchar2(30) not null,
id varchar2(20) not null,
rscore number(1) not null,
content varchar2(500)
);



create table tbl_order (
id varchar2(20) not null,
name varchar2(20) not null,
birth date not null,
email varchar2(60),
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
);



create table tbl_refund(
id varchar2(20) not null,
ordernum number not null,
orderdate date default sysdate,
proname varchar2(30) not null,
pronum number not null,
pickedcount number default 1,
indieprice number,
totalprice number,
askdate date default sysdate,
isaccepted char(1),
acceptdate date,
content varchar2(500)
);


SELECT * FROM tbl_manager

select count(id) from tbl_customer
		where upper (id) like upper ('')

create table tbl_deletedmember (
id varchar2(20) not null,
name varchar2(20) not null,
email varchar2(60),
grade char(1),
reason varchar2(500),
joiningdate date,
deletedate date default sysdate
);



create table tbl_deletedproduct (
proname varchar2(30) not null,
pronum number not null,
manufacturer varchar2(30) not null,
production varchar2(30) not null,
category varchar2(30) not null,
price number,
reason varchar2(500),
deleteddate date default sysdate
);

SELECT * FROM TBL_NOTICE

create table tbl_notice (
bno number,
id varchar2(20) not null,
criteria varchar2(30) not null,
title varchar2(30) not null,
content varchar2(3000) not null,
writedate date default sysdate
);

CREATE SEQUENCE seq_notice_bno 

SELECT * FROM tbl_qna

create table tbl_qna (
bno number,
cid varchar2(20) not null,
pw varchar2(20) not null,
title varchar2(30) not null,
content varchar2(3000) not null,
writedate date default sysdate,
answer char(1) default 'F'
)

create sequence seq_qna_bno;

create table tbl_reply(
id number not null,
content varchar2(500) not null,
writedate date default sysdate
);



create table tbl_err (
id varchar2(20) not null,
msg varchar2(300) not null,
generatetime date default sysdate,
staff varchar2(20),
status varchar2(300)
);



create sequence seq_product_pronum;



create table tbl_upload (
id number,
pronum number not null,
filename varchar2(300) not null,
uploaddate date default sysdate,
constraint fk_upload_pronum foreign key(pronum) references tbl_product(pronum) on delete cascade
);



create sequence seq_upload_id;


