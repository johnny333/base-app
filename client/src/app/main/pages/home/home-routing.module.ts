import {NgModule} from "@angular/core";
import {RouterModule, Routes} from "@angular/router";
import {HomeComponent} from "./home.component";

const routes: Routes = [
  {
    path: 'home',
    component: HomeComponent,
    children: [
      {path: '', component: HomeComponent},
      {path: ':id', component: HomeComponent}
    ]
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class HomeRoutingModule {
}
