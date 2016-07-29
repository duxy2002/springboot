insert into t_user (user_id, login_name, password, name, enabled)
  values (1, 'admin', '$2a$04$ni8rQ08fJAjy/999FXR7pu6GA8jbnRP.e64Yn4oRvfZRodwgNo2CK', '管理者', true);
insert into t_user (user_id, login_name, password, name, enabled)
  values (2, 'staff', '$2a$04$Q7bFpqt/7hCYA/NOwMyCue5T/ZDipG5JT70Glm1bVhI8cLbICImYu', '员工', true);
insert into t_user (user_id, login_name, password, name, enabled)
  values (3, 'guest', '$2a$04$z00lkO9QqJEMH48NFQKJPO4TYA0wVSLFLsU3UUOL6WJwCWv3N3YVa', '客人', true);

insert into t_user_role_map (id, user_id, role_id)
  values (1, 1, 1);
insert into t_user_role_map (id, user_id, role_id)
  values (2, 2, 2);
insert into t_user_role_map (id, user_id, role_id)
  values (3, 3, 3);

insert into t_role (role_id, name) values (1, 'ROLE_ADMIN');
insert into t_role (role_id, name) values (2, 'ROLE_STAFF');
insert into t_role (role_id, name) values (3, 'ROLE_GUEST');

