insert into t_user (user_id, login_name, password, name, enabled)
  values (1, 'admin', 'admin', '管理者', true);
insert into t_user (user_id, login_name, password, name, enabled)
  values (2, 'staff', 'staff', '员工', true);
insert into t_user (user_id, login_name, password, name, enabled)
  values (3, 'guest', 'guest', '客人', true);

insert into t_user_role_map (id, user_id, role_id)
  values (1, 1, 1);
insert into t_user_role_map (id, user_id, role_id)
  values (2, 2, 2);
insert into t_user_role_map (id, user_id, role_id)
  values (3, 3, 3);

insert into t_role (role_id, name) values (1, 'ROLE_ADMIN');
insert into t_role (role_id, name) values (2, 'ROLE_STAFF');
insert into t_role (role_id, name) values (3, 'ROLE_GUEST');

