const numbers = [99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0];

const bubbleSort = (array) => {
  array.forEach((element, indexI) => {
    array.forEach((element, indexJ) => {
      if (array[indexJ] > array[indexJ + 1]) {
        const temp = array[indexJ];
        array[indexJ] = array[indexJ + 1];
        array[indexJ + 1] = temp;
      }
    })
  })
}

bubbleSort(numbers);

console.log(numbers);