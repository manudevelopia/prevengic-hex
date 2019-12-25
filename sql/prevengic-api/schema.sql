create schema prevengic;

create table prevengic.notes
(
    id          serial primary key,
    name        varchar(50) not null,
    description varchar
);

create table prevengic.chemical_profile
(
    id     serial primary key,
    vla_ec numeric,
    vla_ed numeric
);

create table prevengic.composes
(
    id                  serial primary key,
    name                varchar(50) not null,
    description         varchar,
    ncas                varchar(25),
    nce                 varchar(25),
    chemical_profile_id int REFERENCES prevengic.chemical_profile (id) on UPDATE cascade
);

create table prevengic.compose_note
(
    compose_id int references prevengic.composes (id) on UPDATE cascade,
    note_id    int references prevengic.notes (id) on update cascade,
    constraint compose_note_pkey primary key (compose_id, note_id)
);

