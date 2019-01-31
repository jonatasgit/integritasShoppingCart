CREATE TABLE products (
  id bigint(20) NOT NULL AUTO_INCREMENT,
  name varchar(50) NOT NULL,
  price DECIMAL NOT NULL,
  PRIMARY KEY (id),
  UNIQUE KEY UK_username (name)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;