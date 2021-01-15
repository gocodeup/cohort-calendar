use cohort_calendar_db;

-- passwords = pass
INSERT INTO users(email, first_name, is_admin, last_name, password, username)
VALUES ('dimitri@codeup.com', 'Dimitri', true, 'Antoniou', '$2a$10$3Ffh4PsLPljCXNKhhpqpEezCp92GjDIT3oVJghWvbqPF5hW3oBXw.', 'dimitri'),
       ('liz@codeup.com', 'Liz', true, 'Maya', '$2a$10$3Ffh4PsLPljCXNKhhpqpEezCp92GjDIT3oVJghWvbqPF5hW3oBXw.', 'liz'),
       ('jason@codeup.com', 'Jason', true, 'Straughan', '$2a$10$3Ffh4PsLPljCXNKhhpqpEezCp92GjDIT3oVJghWvbqPF5hW3oBXw.', 'jason'),
       ('katie@codeup.com', 'Katie', false, 'Facemire', '$2a$10$3Ffh4PsLPljCXNKhhpqpEezCp92GjDIT3oVJghWvbqPF5hW3oBXw.', 'katie'),
       ('fernando@codeup.com', 'fer', true, 'Mendoza', '$2a$10$3Ffh4PsLPljCXNKhhpqpEezCp92GjDIT3oVJghWvbqPF5hW3oBXw.', 'fer');
