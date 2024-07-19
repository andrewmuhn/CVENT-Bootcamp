interface Mountain {
    name:string,
    height:number
}

let mountains:Mountain[] = [
    {
        name: "Kilimanjaro",
        height: 19341
    },
    {
        name: "Everest",
        height: 29029
    },
    {
        name: "Denali",
        height: 20310
    }
]


const findNameOfTallestMountain = (mountainsArr:Mountain[]): string => {
    let tallestMountain:Mountain = mountainsArr[0];
    mountainsArr.forEach(mountain => {
        if (mountain.height > tallestMountain.height) {
            tallestMountain = mountain
        }
    });
    return tallestMountain.name;
}


export let tallestMountain = findNameOfTallestMountain(mountains);



