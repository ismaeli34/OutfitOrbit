import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { lehngacholiPage2 } from 'src/Data/Saree/lenghaCholiPage2';

@Component({
  selector: 'app-product-details',
  templateUrl: './product-details.component.html',
  styleUrls: ['./product-details.component.css']
})
export class ProductDetailsComponent {

  constructor(private router: Router){

  }

  selectedSize:any;

  reviews=[1,1,1,1];

  relatedProducts:any;

  handleAddtoCart(){
    console.log("selected size",this.selectedSize);
    this.router.navigate(['cart'])
    
  }

  ngOnInit(){
    this.relatedProducts = lehngacholiPage2;
  }

}
