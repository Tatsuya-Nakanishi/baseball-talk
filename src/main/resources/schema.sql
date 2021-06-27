DROP TABLE IF EXISTS comment;
DROP TABLE IF EXISTS team;



CREATE TABLE comment
(
    id   INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(20) NOT NULL,
    message VARCHAR(140) NOT NULL,
    team_id        INT         NOT NULL,
    like_point INT DEFAULT 0,
    user_id INT
);
CREATE TABLE team
(
    team_id INT PRIMARY KEY,
    team_name VARCHAR(20) NOT NULL,
    team_image VARCHAR(256) NOT NULL
);

