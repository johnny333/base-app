import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {MaterialComponentsModule} from './material-components/material-components.module' 
import { ServicesModule } from "./services/services.module";

@NgModule({
  imports: [
    CommonModule, MaterialComponentsModule, ServicesModule
  ],
  declarations: []
})
export class SharedModule { }
