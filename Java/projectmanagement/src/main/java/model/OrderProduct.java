package model;

import io.ebean.Model;

import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.math.BigInteger;


public class OrderProduct extends Model {
	@Id
	private BigInteger orderProduct; // auto increment
	private Integer productCount;
	@ManyToOne
	private Integer productId;
	@ManyToOne
	private Integer orderId;

	public OrderProduct() {}

	public OrderProduct(Integer productCount) {
		this.productCount = productCount;
	}

	//sets
	public void setProductCount(Integer productCount){
		this.productCount = productCount;
	}

	// public void setProductId(Product productId){
	// 	this.productId = productId;
	// }

	/*public void setOrderId(Orders orders){
		this.orderId = OrderProduct.getOrderId();
	}*/

	//gets
	public Integer getProductCount(){
		return this.productCount;
	}

	public Integer getProductId(){
		return this.productId;
	}

}