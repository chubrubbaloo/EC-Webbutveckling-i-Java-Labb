const handleDelete = (id) => fetch('/todo/' + id, {method:'DELETE'})
.then(response=>window.location.href = response.url);