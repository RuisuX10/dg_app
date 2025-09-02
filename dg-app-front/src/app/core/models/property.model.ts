export interface Property {
  id: number;
  address: string;
  rooms: number;
  lot: number;
  covered: number;
  semi_covered: number;
  price: number;
  owner?: {
    id: number;
    name: string;
    // otros campos del owner
  };
  propertyType?: {
    id: number;
    name: string;
    // otros campos del tipo
  };
  // otros campos según tu backend
}