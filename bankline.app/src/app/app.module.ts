import { LOCALE_ID, NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { MovimentacaoListComponent } from './components/movimentacao-list/movimentacao-list.component';
import { MovimentacaoNewComponent } from './components/movimentacao-new/movimentacao-new.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';

import { CorrentistaComponent } from './components/correntista/correntista.component';
import { CurrencyMaskModule } from "ng2-currency-mask";





@NgModule({
  declarations: [
    AppComponent,
    MovimentacaoListComponent,
    MovimentacaoNewComponent,
    CorrentistaComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    NgbModule,
    FormsModule,
    HttpClientModule,
    CurrencyMaskModule
  ],
  providers: [{provide: LOCALE_ID, useValue: 'pt-BR'}],
  bootstrap: [AppComponent]
})
export class AppModule { }

