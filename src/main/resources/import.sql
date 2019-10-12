insert into Foods (title, description, category, price, is_available, created_at, updated_at) values ('Gulyásleves', 'Klasszikus magyar gulyásleves, sertéskarajból, sárgaburgonyából.', 'Leves', 1190, true, CURRENT_TIMESTAMP(),  CURRENT_TIMESTAMP());
insert into Foods (title, description, category, price, is_available, created_at, updated_at) values ('Cordon blue hasábburgyonával', 'Rántott pulykamell sajttal és sonkával töltve, egyedi fűszerezéssel.', 'Szárnyas', 2390, false, CURRENT_TIMESTAMP(),  CURRENT_TIMESTAMP());
insert into Foods (title, description, category, price, is_available, created_at, updated_at) values ('Kereszti Krisztián Kalácsa', 'Híres informatikai különlegesség, melyet a kedvenc fejlesztői környezetünk - a NetBeans - használata közben ajánlunk fogyasztani.', 'Desszert', 790, true, CURRENT_TIMESTAMP(),  CURRENT_TIMESTAMP());
insert into Foods (title, description, category, price, is_available, created_at, updated_at) values ('Tömlőssajtos rántot párizsi', 'A magyar youtube legnépszerűbb étele, melyet minden igaz magyarnak kikell próbálnia legalább egyszer.', '990', 100, true, CURRENT_TIMESTAMP(),  CURRENT_TIMESTAMP());
insert into Foods (title, description, category, price, is_available, created_at, updated_at) values ('Déli büfé szendvics', 'Klasszikus mirelithúsos csoda, melyet 3 napja készítettünk vacsorára, de ránk maradt.', '9990', 100, true, CURRENT_TIMESTAMP(),  CURRENT_TIMESTAMP());

-- insert into Drinks (title, description, category, price, size_of_drink, alcohol, is_available, created_at, updated_at) values ('Staropramen', null, 'Sör', 690, 5, 5,  true, CURRENT_TIMESTAMP(),  CURRENT_TIMESTAMP());
-- insert into Drinks (title, description, category, price, size_of_drink, alcohol, is_available, created_at, updated_at) values ('Bartos ezerjó', 'A híres magyar youtuber, Bartos Cs. István után elnevezett 100% gyümölcstartalmú, bió és vegán termelői bor.', 'Bor', 2990, 100, 10, true, CURRENT_TIMESTAMP(),  CURRENT_TIMESTAMP());
-- insert into Drinks (title, description, category, price, size_of_drink, alcohol, is_available, created_at, updated_at) values ('Cola', null, 'Üdítő', 390, 2,25, null, true, CURRENT_TIMESTAMP(),  CURRENT_TIMESTAMP());
-- insert into Drinks (title, description, category, price, size_of_drink, alcohol, is_available, created_at, updated_at) values ('Whisky', 'Jim Beam/Ballentines', 'Tömény', 890, 0.5, 40, true, CURRENT_TIMESTAMP(),  CURRENT_TIMESTAMP());
-- insert into Drinks (title, description, category, price, size_of_drink, alcohol, is_available, created_at, updated_at) values ('LafiKobra', 'A bajnokok napindítója.', 'Kevert', 590, 5, 8, true, CURRENT_TIMESTAMP(),  CURRENT_TIMESTAMP());

insert into Guests (bill,code) values (8765, null);
insert into Guests (bill,code) values (3650, null);
insert into Guests (bill,code) values (8765, 'aezakmi');

insert into Employees (_name, pos) values ('Krisztian', 'Vezerigazgato');
insert into Employees (_name, pos) values ('Peti', 'mosogato');
insert into Employees (_name, pos) values ('Elek Zoltan', 'fo-szakacs');
insert into Employees (_name, pos) values ('Gordon Ramsey', 'kukta');
-- 
insert into Orders (title, price, created_at, updated_at) ( 'Staropramen', 690, CURRENT_TIMESTAMP(),  CURRENT_TIMESTAMP());
insert into Orders (title, price, created_at, updated_at) ( 'Gulyásleves', 1190, CURRENT_TIMESTAMP(),  CURRENT_TIMESTAMP());
insert into Orders (title, price, created_at, updated_at) ( 'Cordon Blue', 2390, CURRENT_TIMESTAMP(),  CURRENT_TIMESTAMP());