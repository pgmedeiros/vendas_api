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
)


CREATE TABLE cart(
    cart_id integer NOT NULL,
    product integer NOT NULL,
    amount integer NOT NULL,
    PRIMARY KEY(cart_id),
    CONSTRAINT fk_product
        FOREIGN KEY(product)
            REFERENCES product(product_id)
);

CREATE TABLE order_ (
    order_id integer,
    client_id integer NOT NULL,
    cart_id integer NOT NULL,
    PRIMARY KEY (order_id),
    CONSTRAINT fk_client
        FOREIGN KEY (client_id)
            REFERENCES client(client_id),
    CONSTRAINT fk_cart
        FOREIGN KEY (cart_id)
            REFERENCES cart(cart_id)

);

CREATE TABLE paymentProcess (
    payment_id integer,
    order_id integer NOT NULL,
    status varchar(3) NOT NULL,
    PRIMARY KEY (payment_id),
    CONSTRAINT fk_order
        FOREIGN KEY (order_id)
            REFERENCES order_(order_id)
);
