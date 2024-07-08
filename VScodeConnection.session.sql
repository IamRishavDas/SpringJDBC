
-- @block
CREATE database student;

-- @block
use student;

-- @block
CREATE TABLE student(
    rollNo INT,
    name VARCHAR(30),
    marks Float(2)
)

-- @block
INSERT INTO student (rollNo, name, marks) 
VALUES 
    (1, 'Ram Roy', 4.55),
    (2, 'Archi Kundu', 6.75),
    (3, 'Rathin Koley', 3.18);
