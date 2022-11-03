CREATE TABLE accounts (user_id serial PRIMARY KEY, username VARCHAR ( 50 ), email VARCHAR ( 255 ) );

INSERT INTO accounts (user_id, username, email) VALUES (1, 'tutorial', 'tutorial@example.com');
INSERT INTO accounts (user_id, username, email) VALUES (2, 'spot', 'spot@example.com');
