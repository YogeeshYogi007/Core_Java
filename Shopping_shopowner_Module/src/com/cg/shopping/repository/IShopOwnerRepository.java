package com.cg.shopping.repository;

import com.cg.shopping.entities.ShopOwner;

public interface IShopOwnerRepository 
{
		public ShopOwner addShopOwner(ShopOwner shopowner);
		public ShopOwner updateShopOwner(ShopOwner shopowner);
		public ShopOwner searchShopOwnerByid(int id);
		public ShopOwner deleteShopOwnerByid(int id);
		
}
