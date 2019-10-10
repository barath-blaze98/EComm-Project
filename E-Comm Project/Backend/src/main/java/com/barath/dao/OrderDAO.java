package com.barath.dao;

import com.barath.model.OrderDetail;

public interface OrderDAO 
{
	public boolean payment(OrderDetail orderDetail);
	public boolean updateCartItemStatus(String username,int orderId);
}
