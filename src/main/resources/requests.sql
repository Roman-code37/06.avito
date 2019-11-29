create table houses (
    id integer primary key autoincrement,
    price integer check ( price > 0 ),
    district text not null,
    underground text
);

insert into houses values (1,3000000, 'Приволжсий', 'Горки');
insert into houses values (2,2800000, 'Вахитовский', 'Суконная слобода');
insert into houses values (3,3150000, 'Советский', 'Горки');
insert into houses values (4,3000000, 'Приволжсий', 'Проспект победы');
insert into houses values (5,2750000, 'Приволжсий', 'Горки');
insert into houses values (6,3280000, 'Авиастроительный', 'Авиастроительная');
