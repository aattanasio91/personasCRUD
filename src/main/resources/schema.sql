DROP TABLE IF EXISTS public.relation;
DROP TABLE IF EXISTS public.relation_type;
DROP TABLE IF EXISTS public.person;
DROP TABLE IF EXISTS public.country;

CREATE TABLE public.country (
     id serial4 NOT NULL,
     name varchar(80),
     CONSTRAINT country_pkey PRIMARY KEY (id)
);

CREATE TABLE public.person (
    id serial4 NOT NULL,
    birth_date date NULL,
    country_id int4 NULL,
    doc_number varchar(255) NULL,
    doc_type varchar(255) NULL,
    email varchar(255) NULL,
    last_name varchar(255) NULL,
    "name" varchar(255) NULL,
    phone_number varchar(255) NULL,
    CONSTRAINT person_pkey PRIMARY KEY (id),
    CONSTRAINT fk_person_country FOREIGN KEY (country_id) REFERENCES public.country(id)
);

CREATE TABLE public.relation_type (
      id serial4 NOT NULL,
      relation_type varchar(255) NULL,
      CONSTRAINT relation_type_pkey PRIMARY KEY (id)
);

CREATE TABLE public.relation (
     id serial4 NOT NULL,
     id_person1 int4 NULL,
     id_person2 int4 NULL,
     relation_type_id int4 NULL,
    CONSTRAINT relation_pkey PRIMARY KEY (id),
    CONSTRAINT FK_RELATION_RELATION_TYPE FOREIGN KEY (relation_type_id) REFERENCES public.relation_type(id)
);