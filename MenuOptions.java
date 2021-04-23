package posSystem;

public class MenuOptions {
	//will display the options selected 
	private String ingredients;
	private String recipe;
	private double price;
	private String nutritionalInfo;
	
	MenuOptions next;
	private Integer num;
	
	public MenuOptions(String ingredients, String recipe, double price, String nutritionalInfo) {
		super();
		this.ingredients = ingredients;
		this.recipe = recipe;
		this.price = price;
		this.nutritionalInfo = nutritionalInfo;
	}
	
	public MenuOptions(Integer num, String ingredients, String recipe, double price, String nutritionalInfo) {
		super();
		this.num = num;
		this.ingredients = ingredients;
		this.recipe = recipe;
		this.price = price;
		this.nutritionalInfo = nutritionalInfo;
	}
	
public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

@Override
	public String toString() {
		return "\nIngredients " + ingredients + ", recipe name: " + recipe + ", price: " + price + ", nutritionalInfo: " + nutritionalInfo + ".\n";
	}

	public String getIngredients() {
		return ingredients;
	}

	public void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	}

	public String getRecipe() {
		return recipe;
	}

	public void setRecipe(String recipe) {
		this.recipe = recipe;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getNutritionalInfo() {
		return nutritionalInfo;
	}

	public void setNutritionalInfo(String nutritionalInfo) {
		this.nutritionalInfo = nutritionalInfo;
	}

	public MenuOptions getNext() {
		return next;
	}
	
	public void setNext(MenuOptions nextOp) {
		this.next = nextOp;
	}
	
	public MenuOptions clone() {
		return new MenuOptions(ingredients, recipe, price, nutritionalInfo);
	}
	
	public String toCSV() {
		return new String(ingredients + "\n" + recipe + "\n" + price + "\n" + nutritionalInfo);
	}
	

	
	
}
