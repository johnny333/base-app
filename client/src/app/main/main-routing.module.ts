import {NgModule} from "@angular/core";
import {RouterModule, Routes} from "@angular/router";
import {MainComponent} from "./main.component";
import {AuthGuard} from "../guards/auth/auth.guard";

const routes: Routes = [
  {
    path: '',
    component: MainComponent,
    canActivate: [AuthGuard],
    children: [
      {path: '', loadChildren: 'app/main/pages/home/home.module#HomeModule'},
      {path: '', loadChildren: 'app/main/pages/login/login.module#LoginModule'},
      {path: '', loadChildren: 'app/main/pages/logout/logout.module#LogoutModule'}
    ]
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class MainRoutingModule {
}
