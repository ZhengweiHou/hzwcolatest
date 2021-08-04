-- create table user
CREATE TABLE
    hzw_user
    (
        id INT(5) NOT NULL AUTO_INCREMENT,
        name VARCHAR(50) NOT NULL,
        display_name VARCHAR(50),
        fcd datetime NOT NULL,
        fcu VARCHAR(50) NOT NULL,
        lcd datetime NOT NULL,
        lcu VARCHAR(50) NOT NULL,
        PRIMARY KEY (id)
    )

