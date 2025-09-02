import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { toSignal } from '@angular/core/rxjs-interop';
import { Owner } from '../models/owner';

@Injectable({
  providedIn: 'root'
})
export class OwnerService {
  private ownerUrl = 'http://localhost:8080/api/owner';



  constructor(private http: HttpClient) { }

  owners = toSignal(this.http.get<Owner[]>(this.ownerUrl), { initialValue: [] });
  
}
