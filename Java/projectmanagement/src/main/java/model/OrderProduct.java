package model;

import io.ebean.Model;
import io.ebean.annotation.NotNull;
import utils.ApplicationException;
import utils.DateTimeUtils;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Date;


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

	public void setProductId(Integer productId){
		this.productId = productId;
	}

	public void setOrderId(OrderProduct orderProduct){
		this.orderId = OrderProduct.getOrderId();
	}

	//gets
	public Integer getProductCount(){
		return this.productCount;
	}

	public Integer getProductId(){
		return this.productId;
	}

	public Integer getOrderId(){
		return this.orderId;
	}
}