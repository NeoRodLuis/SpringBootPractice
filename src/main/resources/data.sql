CREATE TABLE IF NOT EXISTS item (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(255) NOT NULL
);
INSERT INTO item (nombre) VALUES ('Israel');
INSERT INTO item (nombre) VALUES ('Luis');
INSERT INTO item (nombre) VALUES ('Felipe');
