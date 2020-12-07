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

	public OrderProduct(Integer productCount, Integer productId, Integer orderId) {
		this.productCount = productCount;
		this.productId = productId;
	}

	//sets
	public void setProductCount(Integer productCount){
		this.productCount = productCount;
	}

	public void setProductId(Product product){
		this.productId = product.productId;
	}

	public void setOrderId(Orders orders){
		this.orderId = Orders.getOrderId();
	}

	//gets
	public Integer getProductCount(){
		return this.productCount;
	}

	public Integer getProductId(){
		return this.productId;
	}

}