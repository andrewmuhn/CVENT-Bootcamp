export interface Product {
    name: string;
    price: number;
}

const products: Product[] = [
    { name: "Trailblazer", price: 12.99 },
    { name: "Summit Rider", price: 189.99 },
    { name: "Alpine Explorer", price: 21.99 },
    { name: "Ridge Runner", price: 1499.00 },
    { name: "Peak Pro", price: 24.54 }
];

const calcAverageProductPrice = (productsArr: Product[]): number => {
    if (productsArr.length === 0) {
        return 0;
    }

    const total = productsArr.reduce((sum, product) => sum + product.price, 0);
    return total / productsArr.length;
}


export let averageProductPrice = calcAverageProductPrice(products);


