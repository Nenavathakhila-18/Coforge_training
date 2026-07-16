package com.coforge.pms.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.coforge.pms.model.Product;

@Service
public class ProductService {
	private Map<Integer, Product> map = new HashMap<>();

	public boolean createProduct(Product product) {
		if (map.containsKey(product.getPid())) {
			return false;
		} else {
		map.put(product.getPid(), product);
		}
		return true;
	}

	public boolean updateProduct(Product product) {

		if (map.containsKey(product.getPid())) {
			map.put(product.getPid(), product);
			return true;
		}
		return false;
	}

	public boolean deleteProduct(int pid) {
		if (map.containsKey(pid)) {
			map.remove(pid);
			return true;
		}
		return false;
	}

	public Product findProductByID(int pid) {
		return map.get(pid);
	}

	public List<Product> findAllProducts() {
		return new ArrayList<>(map.values());
	}

}
