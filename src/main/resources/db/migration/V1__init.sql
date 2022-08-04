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

INSERT INTO relation_type (relation_type) VALUES ('HERMAN@');
INSERT INTO relation_type (relation_type) VALUES ('PRIM@');
INSERT INTO relation_type (relation_type) VALUES ('TI@');

INSERT INTO country (name) VALUES('Afganistán');
INSERT INTO country (name) VALUES('Islas Gland');
INSERT INTO country (name) VALUES('Albania');
INSERT INTO country (name) VALUES('Alemania');
INSERT INTO country (name) VALUES('Andorra');
INSERT INTO country (name) VALUES('Angola');
INSERT INTO country (name) VALUES('Anguilla');
INSERT INTO country (name) VALUES('Antártida');
INSERT INTO country (name) VALUES('Antigua y Barbuda');
INSERT INTO country (name) VALUES('Antillas Holandesas');
INSERT INTO country (name) VALUES('Arabia Saudí');
INSERT INTO country (name) VALUES('Argelia');
INSERT INTO country (name) VALUES('Argentina');
INSERT INTO country (name) VALUES('Armenia');
INSERT INTO country (name) VALUES('Aruba');
INSERT INTO country (name) VALUES('Australia');
INSERT INTO country (name) VALUES('Austria');
INSERT INTO country (name) VALUES('Azerbaiyán');
INSERT INTO country (name) VALUES('Bahamas');
INSERT INTO country (name) VALUES('Bahréin');
INSERT INTO country (name) VALUES('Bangladesh');
INSERT INTO country (name) VALUES('Barbados');
INSERT INTO country (name) VALUES('Bielorrusia');
INSERT INTO country (name) VALUES('Bélgica');
INSERT INTO country (name) VALUES('Belice');
INSERT INTO country (name) VALUES('Benin');
INSERT INTO country (name) VALUES('Bermudas');
INSERT INTO country (name) VALUES('Bhután');
INSERT INTO country (name) VALUES('Bolivia');
INSERT INTO country (name) VALUES('Bosnia y Herzegovina');
INSERT INTO country (name) VALUES('Botsuana');
INSERT INTO country (name) VALUES('Isla Bouvet');
INSERT INTO country (name) VALUES('Brasil');
INSERT INTO country (name) VALUES('Brunéi');
INSERT INTO country (name) VALUES('Bulgaria');
INSERT INTO country (name) VALUES('Burkina Faso');
INSERT INTO country (name) VALUES('Burundi');
INSERT INTO country (name) VALUES('Cabo Verde');
INSERT INTO country (name) VALUES('Islas Caimán');
INSERT INTO country (name) VALUES('Camboya');
INSERT INTO country (name) VALUES('Camerún');
INSERT INTO country (name) VALUES('Canadá');
INSERT INTO country (name) VALUES('República Centroafricana');
INSERT INTO country (name) VALUES('Chad');
INSERT INTO country (name) VALUES('República Checa');
INSERT INTO country (name) VALUES('Chile');
INSERT INTO country (name) VALUES('China');
INSERT INTO country (name) VALUES('Chipre');
INSERT INTO country (name) VALUES('Isla de Navidad');
INSERT INTO country (name) VALUES('Ciudad del Vaticano');
INSERT INTO country (name) VALUES('Islas Cocos');
INSERT INTO country (name) VALUES('Colombia');
INSERT INTO country (name) VALUES('Comoras');
INSERT INTO country (name) VALUES('República Democrática del Congo');
INSERT INTO country (name) VALUES('Congo');
INSERT INTO country (name) VALUES('Islas Cook');
INSERT INTO country (name) VALUES('Corea del Norte');
INSERT INTO country (name) VALUES('Corea del Sur');
INSERT INTO country (name) VALUES('Costa de Marfil');
INSERT INTO country (name) VALUES('Costa Rica');
INSERT INTO country (name) VALUES('Croacia');
INSERT INTO country (name) VALUES('Cuba');
INSERT INTO country (name) VALUES('Dinamarca');
INSERT INTO country (name) VALUES('Dominica');
INSERT INTO country (name) VALUES('República Dominicana');
INSERT INTO country (name) VALUES('Ecuador');
INSERT INTO country (name) VALUES('Egipto');
INSERT INTO country (name) VALUES('El Salvador');
INSERT INTO country (name) VALUES('Emiratos Árabes Unidos');
INSERT INTO country (name) VALUES('Eritrea');
INSERT INTO country (name) VALUES('Eslovaquia');
INSERT INTO country (name) VALUES('Eslovenia');
INSERT INTO country (name) VALUES('España');
INSERT INTO country (name) VALUES('Islas ultramarinas de Estados Unidos');
INSERT INTO country (name) VALUES('Estados Unidos');
INSERT INTO country (name) VALUES('Estonia');
INSERT INTO country (name) VALUES('Etiopía');
INSERT INTO country (name) VALUES('Inglaterra');
INSERT INTO country (name) VALUES('Islas Feroe');
INSERT INTO country (name) VALUES('Filipinas');
INSERT INTO country (name) VALUES('Finlandia');
INSERT INTO country (name) VALUES('Fiyi');
INSERT INTO country (name) VALUES('Francia');
INSERT INTO country (name) VALUES('Gabón');
INSERT INTO country (name) VALUES('Gambia');
INSERT INTO country (name) VALUES('Georgia');
INSERT INTO country (name) VALUES('Islas Georgias del Sur y Sandwich del Sur');
INSERT INTO country (name) VALUES('Ghana');
INSERT INTO country (name) VALUES('Gibraltar');
INSERT INTO country (name) VALUES('Granada');
INSERT INTO country (name) VALUES('Grecia');
INSERT INTO country (name) VALUES('Groenlandia');
INSERT INTO country (name) VALUES('Guadalupe');
INSERT INTO country (name) VALUES('Guam');
INSERT INTO country (name) VALUES('Guatemala');
INSERT INTO country (name) VALUES('Guayana Francesa');
INSERT INTO country (name) VALUES('Guinea');
INSERT INTO country (name) VALUES('Guinea Ecuatorial');
INSERT INTO country (name) VALUES('Guinea-Bissau');
INSERT INTO country (name) VALUES('Guyana');
INSERT INTO country (name) VALUES('Haití');
INSERT INTO country (name) VALUES('Islas Heard y McDonald');
INSERT INTO country (name) VALUES('Honduras');
INSERT INTO country (name) VALUES('Hong Kong');
INSERT INTO country (name) VALUES('Hungría');
INSERT INTO country (name) VALUES('India');
INSERT INTO country (name) VALUES('Indonesia');
INSERT INTO country (name) VALUES('Irán');
INSERT INTO country (name) VALUES('Iraq');
INSERT INTO country (name) VALUES('Irlanda');
INSERT INTO country (name) VALUES('Islandia');
INSERT INTO country (name) VALUES('Israel');
INSERT INTO country (name) VALUES('Italia');
INSERT INTO country (name) VALUES('Jamaica');
INSERT INTO country (name) VALUES('Japón');
INSERT INTO country (name) VALUES('Jordania');
INSERT INTO country (name) VALUES('Kazajstán');
INSERT INTO country (name) VALUES('Kenia');
INSERT INTO country (name) VALUES('Kirguistán');
INSERT INTO country (name) VALUES('Kiribati');
INSERT INTO country (name) VALUES('Kuwait');
INSERT INTO country (name) VALUES('Laos');
INSERT INTO country (name) VALUES('Lesotho');
INSERT INTO country (name) VALUES('Letonia');
INSERT INTO country (name) VALUES('Líbano');
INSERT INTO country (name) VALUES('Liberia');
INSERT INTO country (name) VALUES('Libia');
INSERT INTO country (name) VALUES('Liechtenstein');
INSERT INTO country (name) VALUES('Lituania');
INSERT INTO country (name) VALUES('Luxemburgo');
INSERT INTO country (name) VALUES('Macao');
INSERT INTO country (name) VALUES('ARY Macedonia');
INSERT INTO country (name) VALUES('Madagascar');
INSERT INTO country (name) VALUES('Malasia');
INSERT INTO country (name) VALUES('Malawi');
INSERT INTO country (name) VALUES('Maldivas');
INSERT INTO country (name) VALUES('Malí');
INSERT INTO country (name) VALUES('Malta');
INSERT INTO country (name) VALUES('Islas Malvinas');
INSERT INTO country (name) VALUES('Islas Marianas del Norte');
INSERT INTO country (name) VALUES('Marruecos');
INSERT INTO country (name) VALUES('Islas Marshall');
INSERT INTO country (name) VALUES('Martinica');
INSERT INTO country (name) VALUES('Mauricio');
INSERT INTO country (name) VALUES('Mauritania');
INSERT INTO country (name) VALUES('Mayotte');
INSERT INTO country (name) VALUES('México');
INSERT INTO country (name) VALUES('Micronesia');
INSERT INTO country (name) VALUES('Moldavia');
INSERT INTO country (name) VALUES('Mónaco');
INSERT INTO country (name) VALUES('Mongolia');
INSERT INTO country (name) VALUES('Montserrat');
INSERT INTO country (name) VALUES('Mozambique');
INSERT INTO country (name) VALUES('Myanmar');
INSERT INTO country (name) VALUES('Namibia');
INSERT INTO country (name) VALUES('Nauru');
INSERT INTO country (name) VALUES('Nepal');
INSERT INTO country (name) VALUES('Nicaragua');
INSERT INTO country (name) VALUES('Níger');
INSERT INTO country (name) VALUES('Nigeria');
INSERT INTO country (name) VALUES('Niue');
INSERT INTO country (name) VALUES('Isla Norfolk');
INSERT INTO country (name) VALUES('Noruega');
INSERT INTO country (name) VALUES('Nueva Caledonia');
INSERT INTO country (name) VALUES('Nueva Zelanda');
INSERT INTO country (name) VALUES('Omán');
INSERT INTO country (name) VALUES('Países Bajos');
INSERT INTO country (name) VALUES('Pakistán');
INSERT INTO country (name) VALUES('Palau');
INSERT INTO country (name) VALUES('Palestina');
INSERT INTO country (name) VALUES('Panamá');
INSERT INTO country (name) VALUES('Papúa Nueva Guinea');
INSERT INTO country (name) VALUES('Paraguay');
INSERT INTO country (name) VALUES('Perú');
INSERT INTO country (name) VALUES('Islas Pitcairn');
INSERT INTO country (name) VALUES('Polinesia Francesa');
INSERT INTO country (name) VALUES('Polonia');
INSERT INTO country (name) VALUES('Portugal');
INSERT INTO country (name) VALUES('Puerto Rico');
INSERT INTO country (name) VALUES('Qatar');
INSERT INTO country (name) VALUES('Reunión');
INSERT INTO country (name) VALUES('Ruanda');
INSERT INTO country (name) VALUES('Rumania');
INSERT INTO country (name) VALUES('Rusia');
INSERT INTO country (name) VALUES('Sahara Occidental');
INSERT INTO country (name) VALUES('Islas Salomón');
INSERT INTO country (name) VALUES('Samoa');
INSERT INTO country (name) VALUES('Samoa Americana');
INSERT INTO country (name) VALUES('San Cristóbal y Nevis');
INSERT INTO country (name) VALUES('San Marino');
INSERT INTO country (name) VALUES('San Pedro y Miquelón');
INSERT INTO country (name) VALUES('San Vicente y las Granadinas');
INSERT INTO country (name) VALUES('Santa Helena');
INSERT INTO country (name) VALUES('Santa Lucía');
INSERT INTO country (name) VALUES('Santo Tomé y Príncipe');
INSERT INTO country (name) VALUES('Senegal');
INSERT INTO country (name) VALUES('Serbia y Montenegro');
INSERT INTO country (name) VALUES('Seychelles');
INSERT INTO country (name) VALUES('Sierra Leona');
INSERT INTO country (name) VALUES('Singapur');
INSERT INTO country (name) VALUES('Siria');
INSERT INTO country (name) VALUES('Somalia');
INSERT INTO country (name) VALUES('Sri Lanka');
INSERT INTO country (name) VALUES('Suazilandia');
INSERT INTO country (name) VALUES('Sudáfrica');
INSERT INTO country (name) VALUES('Sudán');
INSERT INTO country (name) VALUES('Suecia');
INSERT INTO country (name) VALUES('Suiza');
INSERT INTO country (name) VALUES('Surinam');
INSERT INTO country (name) VALUES('Svalbard y Jan Mayen');
INSERT INTO country (name) VALUES('Tailandia');
INSERT INTO country (name) VALUES('Taiwán');
INSERT INTO country (name) VALUES('Tanzania');
INSERT INTO country (name) VALUES('Tayikistán');
INSERT INTO country (name) VALUES('Territorio Británico del Océano Índico');
INSERT INTO country (name) VALUES('Territorios Australes Franceses');
INSERT INTO country (name) VALUES('Timor Oriental');
INSERT INTO country (name) VALUES('Togo');
INSERT INTO country (name) VALUES('Tokelau');
INSERT INTO country (name) VALUES('Tonga');
INSERT INTO country (name) VALUES('Trinidad y Tobago');
INSERT INTO country (name) VALUES('Túnez');
INSERT INTO country (name) VALUES('Islas Turcas y Caicos');
INSERT INTO country (name) VALUES('Turkmenistán');
INSERT INTO country (name) VALUES('Turquía');
INSERT INTO country (name) VALUES('Tuvalu');
INSERT INTO country (name) VALUES('Ucrania');
INSERT INTO country (name) VALUES('Uganda');
INSERT INTO country (name) VALUES('Uruguay');
INSERT INTO country (name) VALUES('Uzbekistán');
INSERT INTO country (name) VALUES('Vanuatu');
INSERT INTO country (name) VALUES('Venezuela');
INSERT INTO country (name) VALUES('Vietnam');
INSERT INTO country (name) VALUES('Islas Vírgenes Británicas');
INSERT INTO country (name) VALUES('Islas Vírgenes de los Estados Unidos');
INSERT INTO country (name) VALUES('Wallis y Futuna');
INSERT INTO country (name) VALUES('Yemen');
INSERT INTO country (name) VALUES('Yibuti');
INSERT INTO country (name) VALUES('Zambia');
INSERT INTO country (name) VALUES('Zimbabue');