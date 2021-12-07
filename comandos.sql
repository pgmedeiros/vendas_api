CREATE TABLE adress(
    adress_id integer NOT NULL,
    street varchar(80) NOT NULL,
    number integer NOT NULL,
    district varchar(80) NOT NULL,
    city varchar(80) NOT NULL,
    country varchar(80) NOT NULL,
    PRIMARY KEY(adress_id)
);

CREATE TABLE client(
    client_id integer NOT NULL,
    name varchar(80) NOT NULL,
    email varchar(80) NOT NULL UNIQUE,
    adress_id integer NOT NULL,
    PRIMARY KEY(client_id),
    CONSTRAINT fk_adress
        FOREIGN KEY(adress_id)
            REFERENCES adress(adress_id)
);

CREATE TABLE product(
    product_id integer NOT NULL,
    name varchar(80) NOT NULL,
    price decimal NOT NULL,
    PRIMARY KEY(product_id)
);

CREATE TABLE orders (
    order_id INTEGER NOT NULL,
    order_cod VARCHAR(80) NOT NULL,
    client_id INTEGER NOT NULL,
    product_id INTEGER NOT NULL,
    amount INTEGER NOT NULL,
    PRIMARY KEY(order_id),
    CONSTRAINT fk_client
        FOREIGN KEY(client_id)
            REFERENCES client(client_id),
    CONSTRAINT fk_product
            FOREIGN KEY(product_id)
                REFERENCES product(product_id)
);