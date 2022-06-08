/**********************************VIGNESH 31-05-2022****************************************/
/*create database "ewallet" and execute the following script*/

CREATE TABLE bank_master
(
   id SERIAL,
   bank_name VARCHAR (150)
);
ALTER TABLE bank_master ADD CONSTRAINT bank_master_id_pk PRIMARY KEY (id);
alter table users add constraint bank_id_fk foreign key (bank_id) references bank_master(id);

INSERT into bank_master values(default,'State Bank of India'); 
INSERT into bank_master values(default,'ICICI'); 
INSERT into bank_master values(default,'Canara Bank'); 
INSERT into bank_master values(default,'Syndicate Bank'); 
INSERT into bank_master values(default,'Vijaya Bank'); 
INSERT into bank_master values(default,'Corporation Bank'); 
INSERT into bank_master values(default,'Bank of Baroda');
INSERT into bank_master values(default,'Bank of India');
INSERT into bank_master values(default,'Bank of Maharashtra');
INSERT into bank_master values(default,'Central Bank of India');
INSERT into bank_master values(default,'Dena Bank');
INSERT into bank_master values(default,'Indian Bank');
INSERT into bank_master values(default,'Indian Overseas Bank');
INSERT into bank_master values(default,'IDBI Bank');
INSERT into bank_master values(default,'Oriental Bank of Commerce');
INSERT into bank_master values(default,'Punjab & Sindh Bank');
INSERT into bank_master values(default,'Punjab National Bank');
INSERT into bank_master values(default,'UCO Bank');
INSERT into bank_master values(default,'Union Bank of India');
INSERT into bank_master values(default,'United Bank of India');
INSERT into bank_master values(default,'Axis Bank');
INSERT into bank_master values(default,'Bandhan Bank');
INSERT into bank_master values(default,'Catholic Syrian Bank');
INSERT into bank_master values(default,'City Union Bank');
INSERT into bank_master values(default,'DCB Bank');
INSERT into bank_master values(default,'Dhanlaxmi Bank');
INSERT into bank_master values(default,'Federal Bank');
INSERT into bank_master values(default,'HDFC Bank');
INSERT into bank_master values(default,'IDFC Bank');
INSERT into bank_master values(default,'IndusInd Bank');
INSERT into bank_master values(default,'Jammu and Kashmir Bank');
INSERT into bank_master values(default,'Karnataka Bank');
INSERT into bank_master values(default,'Karur Vysya Bank');
INSERT into bank_master values(default,'Kotak Mahindra Bank');
INSERT into bank_master values(default,'Lakshmi Vilas Bank');
INSERT into bank_master values(default,'Nainital Bank');
INSERT into bank_master values(default,'RBL Bank');
INSERT into bank_master values(default,'South Indian Bank');
INSERT into bank_master values(default,'Tamilnad Mercantile Bank');
INSERT into bank_master values(default,'YES Bank');

create table users(
	id SERIAL,
	login_id VARCHAR(20) unique,
	password VARCHAR(150) not null,
	ewallet_id VARCHAR(8) unique,
	user_type INTEGER not null,
	individual_or_company_name VARCHAR(150),
	email_id VARCHAR(50) not null,
	mobile_number VARCHAR(20) not null,
	pan_number VARCHAR(10) null,
	adhar_number VARCHAR(14) null,
	account_number VARCHAR(18) null,
	account_holder_name VARCHAR(150) null,
	ifsc VARCHAR(11) null,
	bank_id INTEGER null,
	branch_name VARCHAR(150) null,
	created_date TIMESTAMP not null,
	status character not null,
	wallet_balance numeric(20,2)
);	

ALTER TABLE users ADD CONSTRAINT users_id_pk PRIMARY KEY(id);
alter table users add constraint bank_id_fk foreign key (bank_id) references bank_master(id);

CREATE TABLE ewallet_logs(
	id SERIAL,
	activity_user_id VARCHAR(20),
	ewallet_id VARCHAR(8),
	ewallet_user_name VARCHAR(50),
	user_type INTEGER,
	log_date_time TIMESTAMP,
	log_subject VARCHAR(200),
	log_matter VARCHAR(4000),
	ip VARCHAR(100),
	browser VARCHAR(50),
	os VARCHAR(50),
	session_id VARCHAR(50)
);

alter table ewallet_logs add constraint ewallet_logs_id_pk primary key(id);