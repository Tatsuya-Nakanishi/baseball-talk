DROP TABLE IF EXISTS comment;


CREATE TABLE comment
(
    id   INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(20) NOT NULL,
    message VARCHAR(140) NOT NULL,
    team_id        INT         NOT NULL,
    like_point INT DEFAULT 0,
    user_id INT
);

