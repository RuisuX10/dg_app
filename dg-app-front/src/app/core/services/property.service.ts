import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Property } from '../models/property.model';
import { toSignal } from '@angular/core/rxjs-interop'; // Importa toSignal correctamente

@Injectable({
  providedIn: 'root'
})
export class PropertyService {
  private apiUrl = 'http://localhost:8080/api/property';

  constructor(private http: HttpClient) { }

  properties = toSignal(this.http.get<Property[]>(this.apiUrl), { initialValue: [] });

  createProperty(property: Property) {
    return this.http.post<Property>(this.apiUrl, property);
  }
}

