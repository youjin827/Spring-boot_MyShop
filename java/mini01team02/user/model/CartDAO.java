package mini01team02.user.model;


import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Repository
@Mapper
public interface CartDAO {
	public int InsertList(CartVO cartVO) throws SQLException;
	public List<CartVO> CartList() throws SQLException;
	public CartVO totalPrice() throws SQLException;
	public int CartDelete(int productId) throws SQLException;

}
