INSERT INTO USER(name, email, nick_name, password, admin) VALUES ('Gabriel Carvalho', 'adm@master.com', 'gab123', '1234', true);
INSERT INTO USER(name, email, nick_name, password, admin) VALUES  ('Dileigo Rusgay', 'adm@min.com', 'didi', '1234', false);

INSERT INTO MENU(prato_principal, guarnicao1, guarnicao2, opcao1, opcao2, salada, sobremesa, date) values ( 'Pernil defumado', 'arroz', 'farofa', 'flango', 'peixe', 'alface', 'abacaxi', '2019-11-11' );
INSERT INTO MENU(prato_principal, guarnicao1, guarnicao2, opcao1, opcao2, salada, sobremesa, date) values ( 'Pernil defumado', 'arroz', 'farofa', 'flango', 'peixe', 'alface', 'abacaxi', '2019-11-12' );
INSERT INTO MENU(prato_principal, guarnicao1, guarnicao2, opcao1, opcao2, salada, sobremesa, date) values ( 'Pernil defumado', 'arroz', 'farofa', 'flango', 'peixe', 'alface', 'abacaxi', '2019-11-13' );
INSERT INTO MENU(prato_principal, guarnicao1, guarnicao2, opcao1, opcao2, salada, sobremesa, date) values ( 'Pernil defumado', 'arroz', 'farofa', 'flango', 'peixe', 'alface', 'abacaxi', '2019-11-14' );
INSERT INTO MENU(prato_principal, guarnicao1, guarnicao2, opcao1, opcao2, salada, sobremesa, date) values ( 'Pernil defumado', 'arroz', 'farofa', 'flango', 'peixe', 'alface', 'abacaxi', '2019-11-15' );

INSERT INTO CHANGE_ORDER(user_id, menu_id, created_at, updated_at, prato_principal) values ( 1, 2, '2019-11-11', '2019-11-11', 'teste 1');
INSERT INTO CHANGE_ORDER(user_id, menu_id, created_at, updated_at, prato_principal) values ( 1, 1, '2019-11-11', '2019-11-11', 'teste 2');
INSERT INTO CHANGE_ORDER(user_id, menu_id, created_at, updated_at, prato_principal) values ( 1, 3, '2019-11-11', '2019-11-11', 'teste 3');
INSERT INTO CHANGE_ORDER(user_id, menu_id, created_at, updated_at, prato_principal) values ( 2, 3, '2019-11-11', '2019-11-11', 'teste 4');
INSERT INTO CHANGE_ORDER(user_id, menu_id, created_at, updated_at, prato_principal) values ( 2, 4, '2019-11-11', '2019-11-11', 'teste 5');
INSERT INTO CHANGE_ORDER(user_id, menu_id, created_at, updated_at, prato_principal) values ( 2, 5, '2019-11-11', '2019-11-11', 'teste 6');

INSERT INTO FEEDBACK(feedback, created_at) values ( 'Muito bom', '2019-11-11' );
INSERT INTO FEEDBACK(feedback, created_at) values ( 'Muito bom', '2019-11-11' );
INSERT INTO FEEDBACK(feedback, created_at) values ( 'Muito bom', '2019-11-11' );