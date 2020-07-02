package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Importedproduct;
import entities.Product;
import entities.UsedProduct;

public class ProductApp {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Enter number of products: ");
		int num = sc.nextInt();
		List<Product> products = new ArrayList<>();

		for (int i = 1; i <= num; i++) {
			System.out.println("PRODUCT " + i + " DATA: ");
			System.out.print("Commom , used or imported? (c / u / i): ");
			String type = sc.next();

			if (type.equalsIgnoreCase("C")) {

				System.out.print("Name: ");
				String name = sc.next();
				System.out.print("Price: ");
				double price = sc.nextDouble();

				Product prod = new Product(name, price);
				products.add(prod);

			} else if (type.equalsIgnoreCase("U")) {

				System.out.print("Name: ");
				String name = sc.next();
				System.out.print("Price: ");
				double price = sc.nextDouble();
				System.out.print("Manufacture Date (DD/MM/YYYY): ");

				Date manufactureDate = sdf.parse(sc.next());
				UsedProduct used = new UsedProduct(name, price, manufactureDate);
				products.add(used);

			} else if (type.equalsIgnoreCase("I")) {

				System.out.print("Name: ");
				String name = sc.next();
				System.out.print("Price: ");
				double price = sc.nextDouble();
				System.out.print("Customs fee: ");
				double customsFee = sc.nextDouble();

				Importedproduct imported = new Importedproduct(name, price, customsFee);
				products.add(imported);

			} else {
				System.out.println("Opção inválida!");
				i--;
			}

		}
		System.out.println("PRICE TAGS: ");

		for (Product prod : products) {
			System.out.println(prod.priceTag());
		}

		sc.close();
	}

}
