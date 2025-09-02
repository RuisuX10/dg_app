import { Component, Signal, computed } from '@angular/core';
import { MatTableModule } from '@angular/material/table';
import { PropertyService } from '../../../core/services/property.service';
import { Property } from '../../../core/models/property.model';
import {MatButtonModule} from '@angular/material/button';

@Component({
  selector: 'app-property-list',
  templateUrl: 'property-list.component.html',
  styleUrl: 'property-list.component.css',
  standalone: true,
  imports: [MatTableModule, MatButtonModule],
})
export class PropertyListComponent {
  displayedColumns: string[] = ['id', 'address', 'rooms', 'price', 'type', 'owner', 'actions'];
  properties: Signal<Property[]>;

  constructor(private propertyService: PropertyService) {
    this.properties = this.propertyService.properties;
  }

  // Si quieres mostrar el nombre del tipo y del dueño, puedes usar métodos en el template
}
