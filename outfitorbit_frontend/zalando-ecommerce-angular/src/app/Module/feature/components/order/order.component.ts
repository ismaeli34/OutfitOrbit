
import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-order',
  templateUrl: './order.component.html',
  styleUrls: ['./order.component.css']
})
export class OrderComponent {
  orders =[[1,1],[1,1,1]]
  orderFilter =[
    {value:"on_the_way",label:"On The Way"},
    {value:"delivered",label:"Delivered"},
    {value:"cancelled",label:"Cancelled"},
    {value:"returned",label:"Returned"}
  ]

  constructor(private router:Router){}


  navigateToOrderDetails =(id:Number)=>{
    this.router.navigate([`order/${id}`])

  }

}
