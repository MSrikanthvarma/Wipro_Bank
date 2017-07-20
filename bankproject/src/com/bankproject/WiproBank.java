package com.bankproject;

public class WiproBank {
	public static final int min_balance = 1000;
	public int avail_balance, age;
	public String name, address;

	public WiproBank(String name, String address, int age) {
		this.name = name;
		this.address = address;
		this.age = age;
	}

	public static void main(String[] args) {
		WiproBank customer1 = new WiproBank("Customer1", "address1", 21);
		WiproBank customer2 = new WiproBank("Customer2", "address2", 25);
		customer1.deposite(2000);
		System.out.println(customer1.balanceEnquiry());
		customer1.withdrawal(500);
		System.out.println(customer1.balanceEnquiry());
		customer2.deposite(3000);
		System.out.println(customer2.balanceEnquiry());
		customer2.withdrawal(600);
		System.out.println(customer2.balanceEnquiry());
	}

	void deposite(int amount) {
		avail_balance += amount;
	}

	void withdrawal(int amount) {
		if (avail_balance - amount > min_balance)
			avail_balance -= amount;
		else
			System.out.println("Insufficient balance");
	}

	int balanceEnquiry() {
		return avail_balance;
	}
}