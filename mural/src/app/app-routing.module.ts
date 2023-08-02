import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './componentes/usuario/login/login.component';
import { CadastroComponent } from './componentes/usuario/cadastro/cadastro.component';
import { MainComponent } from './componentes/main/main.component';

const routes: Routes = [
  {
    path: 'loginUsuario', component: LoginComponent
  },
  {
    path: 'cadastroUsuario', component: CadastroComponent
  },
  {
    path: '', component: MainComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
