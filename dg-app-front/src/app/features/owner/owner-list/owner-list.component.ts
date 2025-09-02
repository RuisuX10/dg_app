import { Component, Signal } from '@angular/core';
import { MatTableModule } from '@angular/material/table';
import { OwnerService } from '../../../core/services/owner.service';
import { Owner } from '../../../core/models/owner';
import {MatButtonModule} from '@angular/material/button';


@Component({
  selector: 'app-owner-list',
  templateUrl: './owner-list.component.html',
  styleUrl: './owner-list.component.css',
  standalone: true,
  imports: [MatTableModule, MatButtonModule],
})
export class OwnerListComponent {
  displayedColumns: string[] = ['id', 'name', 'last_name', 'dni', 'cuit', 'email', 'phone', 'address', 'actions'];
  owners: Signal<Owner[]>;

  constructor(private ownerService: OwnerService) {
    this.owners = this.ownerService.owners;
  }
}
