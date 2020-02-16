insert into lep.notes (lep_name, lep_description)
values ('note 1', 'description 1'),
       ('note 2', 'description 2'),
       ('note 3', 'description 3'),
       ('note 4', 'description 4');

insert into lep.chemical_profile (lep_vla_ec, lep_vla_ed)
values (1, 1),
       (2, 2),
       (3, 3),
       (4, 4);

insert into lep.composes(lep_name, lep_description, lep_ncas, lep_nce, lep_chemical_profile_id)
values ('compose 1', 'description 1', 'ncas 1', 'nce 1', 1),
       ('compose 2', 'description 2', 'ncas 2', 'nce 2', null),
       ('compose 3', 'description 3', 'ncas 3', 'nce 3', 1);

insert into lep.compose_note(lep_compose_id, lep_note_id)
values (1, 1),
       (1, 2),
       (1, 3),
       (1, 4),
       (2, 3),
       (2, 4);