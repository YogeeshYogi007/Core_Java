package com.cg.shopping.repository;

import javax.persistence.EntityManager;

import com.cg.shopping.entities.ShopOwner;

public class IShopOwnerRepositoryImpl implements IShopOwnerRepository 
{
	//step: 1 Start JPA Lifecycle
	private EntityManager entitymanager;
	public IShopOwnerRepositoryImpl()
	{
		entitymanager = JPAUtil.getEntityManager();
	}

	
	//create operation 
	@Override
	public ShopOwner addShopOwner(ShopOwner shopowner)
	{
		
		entitymanager.persist(shopowner);
		return shopowner;
	}

	@Override
	public ShopOwner updateShopOwner(ShopOwner shopowner) {
		entitymanager.merge(shopowner);
		return shopowner;
	}

	@Override
	public ShopOwner searchShopOwnerByid(int id) {
		ShopOwner shopowner = entitymanager.find(ShopOwner.class, id);
		return shopowner;
	}

	@Override
	public ShopOwner deleteShopOwnerByid(int id) {
		ShopOwner shopowner = entitymanager.find(ShopOwner.class, id);
		entitymanager.merge(shopowner);
		return shopowner;
	}

}
