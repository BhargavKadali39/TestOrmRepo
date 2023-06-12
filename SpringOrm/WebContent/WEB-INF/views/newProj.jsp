
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>New Project Form</title>
</head>
<body>
	  <h1>Project Add Form</h1>
  <form action="savenewproj" method="post">
		<div>
			<div class="mb-3">
				<label for="id">Enter Id:</label><input type="number"
					class="form-control" id="id" name="id" placeholder="Enter Id"
					required="true" autofocus="true">
			</div>
			<div class="mb-3">
				<label for="pname">Enter Name:</label><input type="text"
					class="form-control" id="pname" name="pname"
					placeholder="Enter Name">
			</div>
			<div class="mb-3">
				<label for="stdate">Start Date:</label><input type="date"
					class="form-control" id="stdate" name="stdate">
			</div>
			<div class="mb-3">
				<label for="mgr">Project Manager:</label><input type="number"
					class="form-control" id="mgr" name="mgr"
					placeholder="Enter Project Manager">
			</div>
			<div class="mb-3">
				<label for="status">Status:</label><label for="status">Active</label><input
					type="radio" class="form-control" id="status" value="Active"
					name="stat"><label for="status1">Inactive</label><input
					type="radio" class="form-control" id="status1" value="Inactive"
					name="stat">
			</div>
			<div class="mb-3">
				<label for="ludate">Last Update Date:</label><input type="date"
					class="form-control" id="ludate" name="ludate">
			</div>
			<div>
				<input type="submit" class="form-control" id="buttonsu"
					name="buttonsu" value="Add Modules">
			</div>
		</div>
	</form>
</body>
<script>

document.getElementById('stdate').valueAsDate = new Date();
function createModule(){
}

</script>
</html>