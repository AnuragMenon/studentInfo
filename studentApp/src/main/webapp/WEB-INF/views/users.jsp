<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Users</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
</head>
<body onload="load();">

		<input type="hidden" id="studentid">
		StudentName: <input type="text" id="studentName" required="required" name="studentName"><br>
		Branch: <input type="text" id="branch" required="required" name="branch"><br>
		<button onclick="submit();">Submit</button>
	
		<table id="table" border=1>
			<tr> <th> StudentName </th> <th> Branch </th> <th> Edit </th> <th> Delete </th> </tr>
		
		</table>
				
	<script type="text/javascript">
	data = "";
	submit = function(){
		 
			$.ajax({
				url:'saveOrUpdate',
				type:'POST',
				data:{studentid:$("#studentid").val(),studentName:$('#studentName').val(),branch:$('#branch').val()},
				success: function(response){
						alert(response.message);
						load();		
				}				
			});			
	}
	
	delete_ = function(id){		 
		 $.ajax({
			url:'delete',
			type:'POST',
			data:{studentid:id},
			success: function(response){
					alert(response.message);
					load();
			}				
		});
}
	

	edit = function (index){
		$("#studentid").val(data[index].studentid);
		$("#studentName").val(data[index].studentName);
		$("#branch").val(data[index].branch);
		
	}

	load = function(){	
		$.ajax({
			url:'list',
			type:'POST',
			success: function(response){
					data = response.data;
					$('.tr').remove();
					for(i=0; i<response.data.length; i++){					
						$("#table").append("<tr class='tr'> <td> "+response.data[i].studentName+" </td> <td> "+response.data[i].branch+" </td> <td> <a href='#' onclick= edit("+i+");> Edit </a>  </td> </td> <td> <a href='#' onclick='delete_("+response.data[i].studentid+");'> Delete </a>  </td> </tr>");
					}			
			}				
		});
		
	}
		
	</script>
	
</body>
</html>
