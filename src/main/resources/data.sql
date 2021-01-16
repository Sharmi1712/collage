DROP TABLE IF EXISTS student;

CREATE TABLE student (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  first_name VARCHAR(250) NOT NULL,
  last_name VARCHAR(250) NOT NULL,
  course VARCHAR(250) DEFAULT NULL
);

INSERT INTO student (first_name, last_name, course) VALUES
  ('Aliko', 'Dangote', 'Gradutation');
  
 INSERT INTO student (first_name, last_name, course) VALUES
  ('Bill', 'Gates', 'SSC');
  
 INSERT INTO student (first_name, last_name, course) VALUES
  ('Folrunsho', 'Alakija', 'HSC');