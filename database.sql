CREATE DATABASE hostel;
USE hostel;

CREATE TABLE rooms (
    room_no INT PRIMARY KEY,
    capacity INT,
    occupied INT DEFAULT 0
) ENGINE=InnoDB;

CREATE TABLE students (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(50),
    room_no INT,
    FOREIGN KEY (room_no) REFERENCES rooms(room_no)
) ENGINE=InnoDB;

CREATE TABLE payments (
    pay_id INT PRIMARY KEY AUTO_INCREMENT,
    student_id INT,
    amount INT,
    FOREIGN KEY (student_id) REFERENCES students(id)
) ENGINE=InnoDB;

INSERT INTO rooms VALUES (101,2,0);
INSERT INTO rooms VALUES (102,3,0);

CREATE INDEX idx_room ON students(room_no);
CREATE INDEX idx_student ON payments(student_id);