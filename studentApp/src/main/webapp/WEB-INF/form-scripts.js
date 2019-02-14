function submit() {
	$.ajax({
		url : 'saveOrUpdate',
		type : 'POST',
		data : {
			studentid : $("#studentid").val(),
			studentName : $('#studentName').val(),
			branch : $('#branch').val()
		},
		success : function(response) {
			alert(response.message);
			load();
		}
	});
}

function delete_(id) {
	$.ajax({
		url : 'delete',
		type : 'POST',
		data : {
			studentid : id
		},
		success : function(response) {
			alert(response.message);
			load();
		}
	});
}

function edit(index) {
	$("#studentid").val(data[index].studentid);
	$("#studentName").val(data[index].studentName);
	$("#branch").val(data[index].branch);

}

window.load = function load() {
	$.ajax({
				url : 'list',
				type : 'POST',
				success : function(response) {
					data = response.data;
					$('.tr').remove();
					for (i = 0; i < response.data.length; i++) {
						$("#table")
								.append(
										"<tr class='tr'> <td> "
												+ response.data[i].studentName
												+ " </td> <td> "
												+ response.data[i].branch
												+ " </td> <td> <a href='#' onclick= edit("
												+ i
												+ ");> Edit </a>  </td> </td> <td> <a href='#' onclick='delete_("
												+ response.data[i].studentid
												+ ");'> Delete </a>  </td> </tr>");
					}
				}
			});

}