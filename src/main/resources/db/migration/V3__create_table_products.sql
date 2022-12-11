CREATE TABLE products
(
    product_id     SERIAL PRIMARY KEY,
    product_name   VARCHAR(30)   NOT NULL,
    manufacture_id INT           NOT NULL,
    type_id        INT           NOT NULL,
    product_price  DECIMAL(7, 2) NOT NULL,
    CONSTRAINT fk_manufacture FOREIGN KEY (manufacture_id) REFERENCES manufactures (manufacture_id),
    CONSTRAINT fk_type FOREIGN KEY (type_id) REFERENCES types (type_id)
);