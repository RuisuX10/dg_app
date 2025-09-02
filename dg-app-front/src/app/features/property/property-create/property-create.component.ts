import { Component } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { PropertyService } from '../../../core/services/property.service';
import { ReactiveFormsModule } from '@angular/forms';

import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-property-create',
  templateUrl: './property-create.component.html',
  styleUrls: ['./property-create.component.css']
})
export class PropertyCreateComponent {
  propertyForm: FormGroup;

  constructor(private fb: FormBuilder, private propertyService: PropertyService) {
    this.propertyForm = this.fb.group({
      address: [''],
      rooms: [''],
      price: [''],
      type: [''],
      owner: ['']
    });
  }

  onSubmit() {
    if (this.propertyForm.valid) {
      this.propertyService.createProperty(this.propertyForm.value).subscribe({
        next: (res) => {
          // Maneja éxito
        },
        error: (err) => {
          // Maneja error
        }
      });
    }
  }
}

@NgModule({
  declarations: [PropertyCreateComponent],
  imports: [
    CommonModule,
    ReactiveFormsModule
  ]
})
export class PropertyCreateModule { }
