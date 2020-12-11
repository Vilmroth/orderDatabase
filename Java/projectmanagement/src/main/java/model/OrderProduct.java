package model;

import io.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.math.BigInteger;

@Entity
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

	public void setProductId(Product product){
		this.productId = product.getProductId();
	}

	public void setOrderId(Orders orders){
		orderId = orders.getOrderId();
	}

	//gets
	public Integer getProductCount(){
		return this.productCount;
	}

	public Integer getProductId(){
		return this.productId;
	}

}