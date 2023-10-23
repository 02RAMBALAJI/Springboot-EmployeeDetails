function addStudent()
{
    
    var stuname= document.getElementById("stuname").value;
    var stuSection = document.getElementById("stuSection").value;
    var stuDepartment= document.getElementById("stuDepartment").value;
    $.ajax({
        url:`http://localhost:8080/createStudent/${stuname}/${stuSection}/${stuDepartment}`,
        method:"GET",
        success:function(response)
        {
            const myJson =JSON.stringify(response); 
            alert(myJson);
        },
        error:function(error)
        {
            alert(error);
        }
    });
}

function postStudent()
{
    
    var stuname= document.getElementById("stuname").value;
    var stuSection = document.getElementById("stuSection").value;
    var stuDepartment= document.getElementById("stuDepartment").value;
    $.ajax({
        url:`http://localhost:8080/postStudent`,
        method:"POST",
        success:function(response)
        {
            const myJson =JSON.stringify(response);
            alert(myJson);
        },
        error:function(error)
        {
            alert(error);
        }
    });
}

