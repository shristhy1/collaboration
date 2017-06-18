<?php

class Product {

	protected $title,
	protected $price

	public function __construct($title, $price) {
		$this->title = $title;
		$this->price = $price;
	}

	public function info() {
		return 'The price of ' . $this->title . ' is ' . $this->price;
	}
}

$product = new Product('Mac Pro');

echo $product->info();