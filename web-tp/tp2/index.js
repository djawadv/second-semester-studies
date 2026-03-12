let list=[];
for (let i=200;i<=210;i++){
    list.push(i);
}

for(let i=0;i<=10;i++){
    console.log(list[i]);
}
let container=document.getElementById("second-table-row");

for (let j = 0; j <=10; j++) {
    const tdElement=document.createElement("td");
    tdElement.textContent=list[j];
    container.appendChild(tdElement);

}