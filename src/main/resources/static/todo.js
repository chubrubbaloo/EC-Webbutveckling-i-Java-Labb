const handleDelete = (id) => fetch('/todo/' + id, {method:'DELETE'})
.then(response=>window.location.href = response.url);


function handleEdit(element){
    parent = element.parentElement
    let e = document.createElement("TEXTAREA")
    e.textContent = element.textContent
    parent.replaceChild(e, element)
    console.log(element.textContent)
    let button;
    for(button of parent.children){
        if (button.tagName === "BUTTON"){
            break
        }
    }
    const saveButton = document.createElement("BUTTON")
    saveButton.innerText = "Spara Ändring"
    parent.replaceChild(saveButton, button)
    saveButton.addEventListener("click", () => saveEdit(element, e, button, saveButton))

}

function saveEdit(element, e, button, saveButton){
    const id = element.getAttribute("data-id")

    fetch('/todo/' + id, {
        method:'PUT',
        headers:{"Content-Type": "text/plain"},
        body:e.value
    }).then(response=>window.location.href = response.url);

}