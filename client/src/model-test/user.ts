/**
 * Created by jakubkolecki on 08.09.2017.
 */
let user = {
  id: '1',
  name: 'Jakub',
  lastName: 'Kołecki',
  type: 'USER',
  role: 'ADMIN',
  password: 'admin',
  email: 'jakubkolecki93@gmail.com'
};

let roles = { // user roles
  1: 'ADMIN',
  2: 'USER'
};

let possiblePermissions = { // pages with user can see if has a role - TABLICA ZŁĄCZENIOWA   role - pages
  1: [1, 2],
  2: [1]
};

let allPermissionsCategories = { // pages on system tablica page
  1: 'Login',
  2: 'Home',
};

let permissionForRoleAndPage = { // tablica złączeniowa roles -> pages -> selected permissions
  1: {
    1: [1, 2],
    2: [1]
  },
  2: {
    1: [1]
  }
};

let allPossiblePermissionForPage = { // tablica złączeniowa  page => possible privileges
  1: {
    1: 'SEE_RESET_PASSWORD_BUTTON',
    2: 'SEE_WELCOME_MESSAGE'
  },
  2: {
    1: 'SEE_LOGOUT_BUTTON'
  }
};

