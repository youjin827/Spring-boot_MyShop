package mini01team02.user.controller;


import java.sql.SQLException;
import java.util.List;

import mini01team02.user.model.CartVO;

public interface CartService {

	public int InsertList(CartVO cartVO) throws SQLException;
	public List<CartVO> CartList() throws SQLException;
	public int CartDelete(int productId) throws SQLException;


}
