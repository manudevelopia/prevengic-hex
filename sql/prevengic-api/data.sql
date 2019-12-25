insert into prevengic.notes (name, description)
values ('note 1', 'description 1'),
       ('note 2', 'description 2'),
       ('note 3', 'description 3'),
       ('note 4', 'description 4');

insert into prevengic.chemical_profile (vla_ec, vla_ed)
values (1, 1),
       (2, 2),
       (3, 3),
       (4, 4);

insert into prevengic.composes(name, description, ncas, nce, chemical_profile_id)
values ('compose 1', 'description 1', 'ncas 1', 'nce 1', 1),
       ('compose 2', 'description 2', 'ncas 2', 'nce 2', null),
       ('compose 3', 'description 3', 'ncas 3', 'nce 3', 1);

insert into prevengic.compose_note(compose_id, note_id)
values (1, 1),
       (1, 2),
       (1, 3),
       (1, 4),
       (2, 3),
       (2, 4);