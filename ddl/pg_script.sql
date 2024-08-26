CREATE USER pet_user WITH PASSWORD 'username';

GRANT ALL PRIVILEGES ON DATABASE petapidb TO pet_user;
GRANT ALL PRIVILEGES ON TABLE petapi.pets TO pet_user;
GRANT ALL PRIVILEGES ON TABLE petapi.allergens TO pet_user;

GRANT USAGE, SELECT, UPDATE ON SEQUENCE petapi.allergens_allergy_id_seq TO pet_user;
GRANT USAGE, SELECT, UPDATE ON SEQUENCE petapi.pets_id_seq TO pet_user;


GRANT ALL PRIVILEGES ON SCHEMA petapi TO pet_user;
GRANT ALL PRIVILEGES ON ALL TABLES IN SCHEMA petapi TO pet_user;

GRANT pg_write_all_data TO pet_user;


INSERT INTO petapi.allergens (substance, severity) VALUES
('Pollen', 3),
('Dust', 2),
('Grass', 4),
('Chicken', 3),
('Beef', 2),
('Dairy', 5),
('Fish', 4),
('Wheat', 3),
('Soy', 2),
('Eggs', 4);

INSERT INTO petapi.pets (name, breed, allergy_id_list) VALUES
('Max', 'Labrador Retriever', '1,3,5'),
('Bella', 'Siamese Cat', '2,7'),
('Charlie', 'Golden Retriever', '4,6,8'),
('Lucy', 'Beagle', '1,9'),
('Cooper', 'Persian Cat', '3,5,10'),
('Luna', 'German Shepherd', '2,4,7'),
('Rocky', 'French Bulldog', '6,8'),
('Daisy', 'Poodle', '1,3,9'),
('Milo', 'Maine Coon', '5,7,10'),
('Molly', 'Dachshund', '2,4,6');

