package mini01team02.user.model;

import lombok.Getter;
import lombok.Setter;
import mini01team02.user.model.UserVO;

@Getter
@Setter
public class CartVO {

	private int cartId;
	private String email;
	private int productId;
	private int count;
	private int user_t_userId;
	private int product_productId;

	private int total;
	private int price;
	private int money;
	private String title;
	private String size;
	private String color;


}
