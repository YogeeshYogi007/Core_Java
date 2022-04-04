package com.cg.shopping.client;

import com.cg.shopping.entities.ShopOwner;
import com.cg.shopping.repository.IShopOwnerRepository;
import com.cg.shopping.repository.IShopOwnerRepositoryImpl;

public class Client {
	
	public static void main(String[] args) {
		ShopOwner so = new ShopOwner();
		IShopOwnerRepository isr = new IShopOwnerRepositoryImpl();
	
	}

}
