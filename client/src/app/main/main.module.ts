import {NgModule} from "@angular/core";
import {CommonModule} from "@angular/common";

import {MainRoutingModule} from "./main-routing.module";
import {MainComponent} from "./main.component";
import {AuthGuard} from "../guards/auth/auth.guard";

@NgModule({
  imports: [
    CommonModule,
    MainRoutingModule
  ],
  declarations: [MainComponent],
  providers: [AuthGuard]
})
export class MainModule {
}
