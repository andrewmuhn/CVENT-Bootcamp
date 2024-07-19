import { Product } from "./product.ts";

interface InventoryItem {
    product: Product,
    quantity: number
}

let inventory:InventoryItem[] = [
    {
        product : {
            name: "motor",
            price: 10.00
        },
        quantity: 10
    },
    {
        product : {
            name: "sensor",
            price: 12.50
        },
        quantity: 4
    },
    {
        product : {
            name: "LED",
            price: 1.00
        },
        quantity: 20
    }
]
const calcInvetoryValue = (inventory:InventoryItem[]):number => {

    let total = inventory.reduce((sum, inventoryItem) => sum += inventoryItem.product.price * inventoryItem.quantity, 0)
    return total;
}

export let inventoryValue = calcInvetoryValue(inventory);

