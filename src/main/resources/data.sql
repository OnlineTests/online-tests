USE `online_tests`;

INSERT INTO `Category`(name) VALUES('istorie')
INSERT INTO `Category`(name) VALUES('geografie')
INSERT INTO `Category`(name) VALUES('muzica')

INSERT INTO `Question`(categoryId, question, answerA, answerB, answerC, answerD, correctAnswer) VALUES(1, 'Cand s-a nascut Andra Dragomir?', '1992', '1988', '1990', '1998', 'A')
INSERT INTO `Question`(categoryId, question, answerA, answerB, answerC, answerD, correctAnswer) VALUES(1, 'Cand s-a nascut Paula Oprea?', '1992', '1988', '1993', '1998', 'C')
INSERT INTO `Question`(categoryId, question, answerA, answerB, answerC, answerD, correctAnswer) VALUES(1, 'Cand s-a nascut Arnold Szederjesi?', '1992', '1988', '1990', '1993', 'D')

INSERT INTO `Question`(categoryId, question, answerA, answerB, answerC, answerD, correctAnswer) VALUES(2, 'In ce continent este situata Romania?', 'Asia', 'America', 'Europa', 'Africa', 'C')
INSERT INTO `Question`(categoryId, question, answerA, answerB, answerC, answerD, correctAnswer) VALUES(2, 'Ce este Romania?', 'o tara', 'un oras', 'un fluviu', 'un tip de copac', 'A')

INSERT INTO `Question`(categoryId, question, answerA, answerB, answerC, answerD, correctAnswer) VALUES(3, 'Ce este cornul?', 'un instrument muzical', 'un cantec', 'o trupa', 'o nota muzicala', 'A')
INSERT INTO `Question`(categoryId, question, answerA, answerB, answerC, answerD, correctAnswer) VALUES(3, 'Care sunt notele muzicale?', 're fa do si', 'do mi sol', 'do re mi fa sol la si', 'mi fa sol la si', 'C')

INSERT INTO `User`(username, password, name, age, email, gender) VALUES('Arnold', '12345', 'Szederjesi Arnold', 22, 'szederjesiarnold@yahoo.com', 'M')
INSERT INTO `User`(username, password, name, age, email, gender) VALUES('Andra', '12345', 'Dragomir Andra', 23, 'green@yahoo.com', 'F')
INSERT INTO `User`(username, password, name, age, email, gender) VALUES('Paula', '12345', 'Oprea Paula', 22, 'paula_oprea08@yahoo.com', 'F')