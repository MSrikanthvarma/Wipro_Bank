package com.bankproject;

public class MiniStatement {

	public static void main(String[] args) {
		WiproBank customer1 = new WiproBank("Customer1", "address1", 21);
		WiproBank customer2 = new WiproBank("Customer2", "address2", 25);
		customer1.deposite(2000);
		customer1.withdrawal(500);
		customer2.deposite(1800);
		customer2.withdrawal(400);
		MiniStatement statement = new MiniStatement();
		statement.getMiniStatement(customer1);
		statement.getMiniStatement(customer2);
	}

	public void getMiniStatement(WiproBank customer) {
		System.out.println("name : " + customer.name);
		System.out.println("address : " + customer.address);
		System.out.println("age : " + customer.age);
		System.out.println("avail_balance : " + customer.avail_balance);

	}
}
