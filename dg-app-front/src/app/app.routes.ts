import { Routes } from '@angular/router';
import { OwnerListComponent } from './features/owner/owner-list/owner-list.component';
import { PropertyListComponent } from './features/property/property-list/property-list.component';

export const routes: Routes = [
    { path: 'owners', component: OwnerListComponent },
    { path: 'properties', component: PropertyListComponent }
];
