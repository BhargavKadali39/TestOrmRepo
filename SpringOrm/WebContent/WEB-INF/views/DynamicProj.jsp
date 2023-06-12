<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="mb-3">
    	<label for="buttonsub" class="form-label"></label>
    	<input type="submit" class="form-control" id="buttonsu" name="buttonsu" value="Add Project" onclick="createProject()">
</div> 
<!-- <div class="mb-3">
    	<label for="buttonsub" class="form-label"></label>
    	<input type="submit" class="form-control" id="buttonsu" name="buttonsu" value="Add Modules" onclick="createModule()">
</div> --> 
<!-- <div class="mb-3">
    	<label for="buttonsub" class="form-label"></label>
    	<input type="submit" class="form-control" id="buttonsu" name="buttonsub" value="Add Tasks" onclick="createTask()">
</div>  -->
</body>
<script>
function createProject() {
	  // Create the form element
	  var formDiv = document.createElement('div');

	  // Create the ID input field
	  var idLabel = document.createElement('label');
	  idLabel.setAttribute('for', 'id');
	  idLabel.textContent = 'Enter Id:';

	  var idInput = document.createElement('input');
	  idInput.setAttribute('type', 'number');
	  idInput.setAttribute('class', 'form-control');
	  idInput.setAttribute('id', 'id');
	  idInput.setAttribute('name', 'id');
	  idInput.setAttribute('placeholder', 'Enter Id');
	  idInput.setAttribute('required', 'true');
	  idInput.setAttribute('autofocus', 'true');

	  var idDiv = document.createElement('div');
	  idDiv.setAttribute('class', 'mb-3');
	  idDiv.appendChild(idLabel);
	  idDiv.appendChild(idInput);
	  formDiv.appendChild(idDiv);

	  // Create the Name input field
	  var nameLabel = document.createElement('label');
	  nameLabel.setAttribute('for', 'pname');
	  nameLabel.textContent = 'Enter Name:';

	  var nameInput = document.createElement('input');
	  nameInput.setAttribute('type', 'text');
	  nameInput.setAttribute('class', 'form-control');
	  nameInput.setAttribute('id', 'pname');
	  nameInput.setAttribute('name', 'pname');
	  nameInput.setAttribute('placeholder', 'Enter Name');

	  var nameDiv = document.createElement('div');
	  nameDiv.setAttribute('class', 'mb-3');
	  nameDiv.appendChild(nameLabel);
	  nameDiv.appendChild(nameInput);
	  formDiv.appendChild(nameDiv);

	  // Create the Password input field
	  var passLabel = document.createElement('label');
	  passLabel.setAttribute('for', 'pass');
	  passLabel.textContent = 'Enter Password:';

	  var passInput = document.createElement('input');
	  passInput.setAttribute('type', 'password');
	  passInput.setAttribute('class', 'form-control');
	  passInput.setAttribute('id', 'pass');
	  passInput.setAttribute('name', 'pass');
	  passInput.setAttribute('placeholder', 'Enter Password');

	  var passDiv = document.createElement('div');
	  passDiv.setAttribute('class', 'mb-3');
	  passDiv.appendChild(passLabel);
	  passDiv.appendChild(passInput);
	  formDiv.appendChild(passDiv);

	  // Create the Start Date input field
	  var stdateLabel = document.createElement('label');
	  stdateLabel.setAttribute('for', 'stdate');
	  stdateLabel.textContent = 'Start Date:';

	  var stdateInput = document.createElement('input');
	  stdateInput.setAttribute('type', 'date');
	  stdateInput.setAttribute('class', 'form-control');
	  stdateInput.setAttribute('id', 'stdate');
	  stdateInput.setAttribute('name', 'stdate');

	  var stdateDiv = document.createElement('div');
	  stdateDiv.setAttribute('class', 'mb-3');
	  stdateDiv.appendChild(stdateLabel);
	  stdateDiv.appendChild(stdateInput);
	  formDiv.appendChild(stdateDiv);

	  // Create the Project Manager input field
	  var mgrLabel = document.createElement('label');
	  mgrLabel.setAttribute('for', 'mgr');
	  mgrLabel.textContent = 'Project Manager:';

	  var mgrInput = document.createElement('input');
	  mgrInput.setAttribute('type', 'number');
	  mgrInput.setAttribute('class', 'form-control');
	  mgrInput.setAttribute('id', 'mgr');
	  mgrInput.setAttribute('name', 'mgr');
	  mgrInput.setAttribute('placeholder', 'Enter Project Manager');

	  var mgrDiv = document.createElement('div');
	  mgrDiv.setAttribute('class', 'mb-3');
	  mgrDiv.appendChild(mgrLabel);
	  mgrDiv.appendChild(mgrInput);
	  formDiv.appendChild(mgrDiv);

	  // Create the Status input field
	  var statusLabel = document.createElement('label');
	  statusLabel.setAttribute('for', 'status');
	  statusLabel.textContent = 'Status:';

	  var activeLabel = document.createElement('label');
	  activeLabel.setAttribute('for', 'status');
	  activeLabel.textContent = 'Active';

	  var activeInput = document.createElement('input');
	  activeInput.setAttribute('type', 'radio');
	  activeInput.setAttribute('class', 'form-control');
	  activeInput.setAttribute('id', 'status');
	  activeInput.setAttribute('value', 'Active');
	  activeInput.setAttribute('name', 'stat');

	  var inactiveLabel = document.createElement('label');
	  inactiveLabel.setAttribute('for', 'status1');
	  inactiveLabel.textContent = 'Inactive';

	  var inactiveInput = document.createElement('input');
	  inactiveInput.setAttribute('type', 'radio');
	  inactiveInput.setAttribute('class', 'form-control');
	  inactiveInput.setAttribute('id', 'status1');
	  inactiveInput.setAttribute('value', 'Inactive');
	  inactiveInput.setAttribute('name', 'stat');

	  var statusDiv = document.createElement('div');
	  statusDiv.setAttribute('class', 'mb-3');
	  statusDiv.appendChild(statusLabel);
	  statusDiv.appendChild(activeLabel);
	  statusDiv.appendChild(activeInput);
	  statusDiv.appendChild(inactiveLabel);
	  statusDiv.appendChild(inactiveInput);
	  formDiv.appendChild(statusDiv);

	  // Create the Last Update Date input field
	  var ludateLabel = document.createElement('label');
	  ludateLabel.setAttribute('for', 'ludate');
	  ludateLabel.textContent = 'Last Update Date:';

	  var ludateInput = document.createElement('input');
	  ludateInput.setAttribute('type', 'date');
	  ludateInput.setAttribute('class', 'form-control');
	  ludateInput.setAttribute('id', 'ludate');
	  ludateInput.setAttribute('name', 'ludate');
	  
	  var submitInput = document.createElement('input');
	  submitInput.setAttribute('type', 'submit');
	  submitInput.className = 'form-control';
	  submitInput.setAttribute('id', 'buttonsu');
	  submitInput.setAttribute('name', 'buttonsu');
	  submitInput.setAttribute('value', 'Add Modules');
	  submitInput.setAttribute('onclick', 'createModule()');

	  var ludateDiv = document.createElement('div');
	  ludateDiv.setAttribute('class', 'mb-3');
	  ludateDiv.appendChild(ludateLabel);
	  ludateDiv.appendChild(ludateInput);
	  formDiv.appendChild(ludateDiv);
	  
	  var submitDiv = document.createElement('div');
	  submitDiv.appendChild(submitInput);
	  formDiv.appendChild(submitDiv);

	  // Append the form to the body or any other desired container
	  document.body.appendChild(formDiv);
	}

	// Call the createForm function to create the form dynamically

function createModule() {
	  // Create the main div element
	  var formDiv = document.createElement('div');

	  // Create the first input field for module ID
	  var idLabel = document.createElement('label');
	  idLabel.setAttribute('for', 'id');
	  idLabel.className = 'form-label';
	  idLabel.textContent = 'Enter Module Id';

	  var idInput = document.createElement('input');
	  idInput.setAttribute('type', 'number');
	  idInput.className = 'form-control';
	  idInput.setAttribute('id', 'id');
	  idInput.setAttribute('name', 'id');
	  idInput.setAttribute('placeholder', 'Enter Id');
	  idInput.setAttribute('required', 'true');
	  idInput.setAttribute('autofocus', 'true');

	  var idDiv = document.createElement('div');
	  idDiv.className = 'mb-3';
	  idDiv.appendChild(idLabel);
	  idDiv.appendChild(idInput);
	  formDiv.appendChild(idDiv);

	  // Create the second input field for module name
	  var nameLabel = document.createElement('label');
	  nameLabel.setAttribute('for', 'name');
	  nameLabel.className = 'form-label';
	  nameLabel.textContent = 'Enter Module Name';

	  var nameInput = document.createElement('input');
	  nameInput.setAttribute('type', 'text');
	  nameInput.className = 'form-control';
	  nameInput.setAttribute('id', 'name');
	  nameInput.setAttribute('name', 'name');
	  nameInput.setAttribute('placeholder', 'Enter Name');
	  nameInput.setAttribute('required', 'true');
	  nameInput.setAttribute('autofocus', 'true');

	  var nameDiv = document.createElement('div');
	  nameDiv.className = 'mb-3';
	  nameDiv.appendChild(nameLabel);
	  nameDiv.appendChild(nameInput);
	  formDiv.appendChild(nameDiv);

	  // Create the third input field for description
	  var descLabel = document.createElement('label');
	  descLabel.setAttribute('for', 'description');
	  descLabel.className = 'form-label';
	  descLabel.textContent = 'Enter Description';

	  var descInput = document.createElement('input');
	  descInput.setAttribute('type', 'text');
	  descInput.className = 'form-control';
	  descInput.setAttribute('id', 'description');
	  descInput.setAttribute('name', 'description');
	  descInput.setAttribute('placeholder', 'Enter Description');
	  descInput.setAttribute('required', 'true');
	  descInput.setAttribute('autofocus', 'true');

	  var descDiv = document.createElement('div');
	  descDiv.className = 'mb-3';
	  descDiv.appendChild(descLabel);
	  descDiv.appendChild(descInput);
	  formDiv.appendChild(descDiv);

	  // Create the fourth input field for projectId
	  var projIdLabel = document.createElement('label');
	  projIdLabel.setAttribute('for', 'projectId');
	  projIdLabel.className = 'form-label';
	  projIdLabel.textContent = 'Enter projectId';

	  var projIdInput = document.createElement('input');
	  projIdInput.setAttribute('type', 'number');
	  projIdInput.className = 'form-control';
	  projIdInput.setAttribute('id', 'projectId');
	  projIdInput.setAttribute('name', 'projectId');
	  projIdInput.setAttribute('placeholder', 'Enter projectId');
	  projIdInput.setAttribute('required', 'true');
	  projIdInput.setAttribute('autofocus', 'true');

	  var projIdDiv = document.createElement('div');
	  projIdDiv.className = 'mb-3';
	  projIdDiv.appendChild(projIdLabel);
	  projIdDiv.appendChild(projIdInput);
	  formDiv.appendChild(projIdDiv);

	  // Create the submit button
	  var submitInput = document.createElement('input');
	  submitInput.setAttribute('type', 'submit');
	  submitInput.className = 'form-control';
	  submitInput.setAttribute('id', 'buttonsub');
	  submitInput.setAttribute('name', 'buttonsub');
	  submitInput.setAttribute('value', 'Add tasks');
	  submitInput.setAttribute('onclick', 'createTask()');

	  var submitDiv = document.createElement('div');
	  submitDiv.className = 'mb-3';
	  submitDiv.appendChild(submitInput);
	  formDiv.appendChild(submitDiv);

	  // Append the form to the body or any other desired container
	  document.body.appendChild(formDiv);
	}


	function createTask() {
		  // Create the main div element
		  var formDiv = document.createElement('div');

		  // Create the task name input field
		  var nameLabel = document.createElement('label');
		  nameLabel.setAttribute('for', 'task-name');
		  nameLabel.textContent = 'Task Name:';

		  var nameInput = document.createElement('input');
		  nameInput.setAttribute('type', 'text');
		  nameInput.setAttribute('id', 'task-name');
		  nameInput.setAttribute('name', 'task-name');

		  var nameDiv = document.createElement('div');
		  nameDiv.appendChild(nameLabel);
		  nameDiv.appendChild(nameInput);
		  formDiv.appendChild(nameDiv);

		  // Create the creation date and time input field
		  var cdatetimeLabel = document.createElement('label');
		  cdatetimeLabel.setAttribute('for', 'task-cdatetime');
		  cdatetimeLabel.textContent = 'Creation Date and Time:';

		  var cdatetimeInput = document.createElement('input');
		  cdatetimeInput.setAttribute('type', 'datetime-local');
		  cdatetimeInput.setAttribute('id', 'task-cdatetime');
		  cdatetimeInput.setAttribute('name', 'task-cdatetime');

		  var cdatetimeDiv = document.createElement('div');
		  cdatetimeDiv.appendChild(cdatetimeLabel);
		  cdatetimeDiv.appendChild(cdatetimeInput);
		  formDiv.appendChild(cdatetimeDiv);

		  // Create the task type input field
		  var typeLabel = document.createElement('label');
		  typeLabel.setAttribute('for', 'task-type');
		  typeLabel.textContent = 'Task Type:';

		  var typeInput = document.createElement('input');
		  typeInput.setAttribute('type', 'text');
		  typeInput.setAttribute('id', 'task-type');
		  typeInput.setAttribute('name', 'task-type');

		  var typeDiv = document.createElement('div');
		  typeDiv.appendChild(typeLabel);
		  typeDiv.appendChild(typeInput);
		  formDiv.appendChild(typeDiv);

		  // Create the reference task ID input field
		  var refTaskIdLabel = document.createElement('label');
		  refTaskIdLabel.setAttribute('for', 'task-ref-task-id');
		  refTaskIdLabel.textContent = 'Reference Task ID:';

		  var refTaskIdInput = document.createElement('input');
		  refTaskIdInput.setAttribute('type', 'text');
		  refTaskIdInput.setAttribute('id', 'task-ref-task-id');
		  refTaskIdInput.setAttribute('name', 'task-ref-task-id');

		  var refTaskIdDiv = document.createElement('div');
		  refTaskIdDiv.appendChild(refTaskIdLabel);
		  refTaskIdDiv.appendChild(refTaskIdInput);
		  formDiv.appendChild(refTaskIdDiv);

		  // Create the task category input field
		  var categoryLabel = document.createElement('label');
		  categoryLabel.setAttribute('for', 'task-category');
		  categoryLabel.textContent = 'Task Category:';

		  var categoryInput = document.createElement('input');
		  categoryInput.setAttribute('type', 'text');
		  categoryInput.setAttribute('id', 'task-category');
		  categoryInput.setAttribute('name', 'task-category');

		  var categoryDiv = document.createElement('div');
		  categoryDiv.appendChild(categoryLabel);
		  categoryDiv.appendChild(categoryInput);
		  formDiv.appendChild(categoryDiv);

		  // Create the task description input field
		  var descLabel = document.createElement('label');
		  descLabel.setAttribute('for', 'task-desc');
		  descLabel.textContent = 'Task Description:';

		  var descInput = document.createElement('input');
		  descInput.setAttribute('type', 'text');
		  descInput.setAttribute('id', 'task-desc');
		  descInput.setAttribute('name', 'task-desc');

		  var descDiv = document.createElement('div');
		  descDiv.appendChild(descLabel);
		  descDiv.appendChild(descInput);
		  formDiv.appendChild(descDiv);

		  // Create the task creator select field
		  var creatorLabel = document.createElement('label');
		  creatorLabel.setAttribute('for', 'task-creator');
		  creatorLabel.textContent = 'Task Creator:';

		  var creatorSelect = document.createElement('select');
		  creatorSelect.setAttribute('id', 'task-creator');
		  creatorSelect.setAttribute('name', 'task-creator');

		  var creatorDiv = document.createElement('div');
		  creatorDiv.appendChild(creatorLabel);
		  creatorDiv.appendChild(creatorSelect);
		  formDiv.appendChild(creatorDiv);

		  // Create the number of hours required input field
		  var nohReqdLabel = document.createElement('label');
		  nohReqdLabel.setAttribute('for', 'task-noh-reqd');
		  nohReqdLabel.textContent = 'Number of Hours Required:';

		  var nohReqdInput = document.createElement('input');
		  nohReqdInput.setAttribute('type', 'number');
		  nohReqdInput.setAttribute('id', 'task-noh-reqd');
		  nohReqdInput.setAttribute('name', 'task-noh-reqd');

		  var nohReqdDiv = document.createElement('div');
		  nohReqdDiv.appendChild(nohReqdLabel);
		  nohReqdDiv.appendChild(nohReqdInput);
		  formDiv.appendChild(nohReqdDiv);

		  // Create the expected completion date and time input field
		  var expDatetimeLabel = document.createElement('label');
		  expDatetimeLabel.setAttribute('for', 'task-exp-datetime');
		  expDatetimeLabel.textContent = 'Expected Completion Date and Time:';

		  var expDatetimeInput = document.createElement('input');
		  expDatetimeInput.setAttribute('type', 'datetime-local');
		  expDatetimeInput.setAttribute('id', 'task-exp-datetime');
		  expDatetimeInput.setAttribute('name', 'task-exp-datetime');

		  var expDatetimeDiv = document.createElement('div');
		  expDatetimeDiv.appendChild(expDatetimeLabel);
		  expDatetimeDiv.appendChild(expDatetimeInput);
		  formDiv.appendChild(expDatetimeDiv);

		  // Create the actual completion date and time input field
		  var cmpDatetimeLabel = document.createElement('label');
		  cmpDatetimeLabel.setAttribute('for', 'task-cmp-datetime');
		  cmpDatetimeLabel.textContent = 'Actual Completion Date and Time:';

		  var cmpDatetimeInput = document.createElement('input');
		  cmpDatetimeInput.setAttribute('type', 'datetime-local');
		  cmpDatetimeInput.setAttribute('id', 'task-cmp-datetime');
		  cmpDatetimeInput.setAttribute('name', 'task-cmp-datetime');

		  var cmpDatetimeDiv = document.createElement('div');
		  cmpDatetimeDiv.appendChild(cmpDatetimeLabel);
		  cmpDatetimeDiv.appendChild(cmpDatetimeInput);
		  formDiv.appendChild(cmpDatetimeDiv);

		  // Create the task supervisor select field
		  var supervisorLabel = document.createElement('label');
		  supervisorLabel.setAttribute('for', 'task-supervisor');
		  supervisorLabel.textContent = 'Task Supervisor:';

		  var supervisorSelect = document.createElement('select');
		  supervisorSelect.setAttribute('id', 'task-supervisor');
		  supervisorSelect.setAttribute('name', 'task-supervisor');

		  var supervisorDiv = document.createElement('div');
		  supervisorDiv.appendChild(supervisorLabel);
		  supervisorDiv.appendChild(supervisorSelect);
		  formDiv.appendChild(supervisorDiv);

		  // Create the task remarks input field
		  var remarksLabel = document.createElement('label');
		  remarksLabel.setAttribute('for', 'task-remarks');
		  remarksLabel.textContent = 'Task Remarks:';

		  var remarksInput = document.createElement('input');
		  remarksInput.setAttribute('type', 'text');
		  remarksInput.setAttribute('id', 'task-remarks');
		  remarksInput.setAttribute('name', 'task-remarks');

		  var remarksDiv = document.createElement('div');
		  remarksDiv.appendChild(remarksLabel);
		  remarksDiv.appendChild(remarksInput);
		  formDiv.appendChild(remarksDiv);

		  // Create the task status input field
		  var statusLabel = document.createElement('label');
		  statusLabel.setAttribute('for', 'task-status');
		  statusLabel.textContent = 'Task Status:';

		  var statusInput = document.createElement('input');
		  statusInput.setAttribute('type', 'text');
		  statusInput.setAttribute('id', 'task-status');
		  statusInput.setAttribute('name', 'task-status');

		  var statusDiv = document.createElement('div');
		  statusDiv.appendChild(statusLabel);
		  statusDiv.appendChild(statusInput);
		  formDiv.appendChild(statusDiv);

		  // Create the project ID input field
		  var projIdLabel = document.createElement('label');
		  projIdLabel.setAttribute('for', 'proj-id');
		  projIdLabel.textContent = 'Project ID:';

		  var projIdInput = document.createElement('input');
		  projIdInput.setAttribute('type', 'text');
		  projIdInput.setAttribute('id', 'proj-id');
		  projIdInput.setAttribute('name', 'proj-id');

		  var projIdDiv = document.createElement('div');
		  projIdDiv.appendChild(projIdLabel);
		  projIdDiv.appendChild(projIdInput);
		  formDiv.appendChild(projIdDiv);

		  // Create the module ID input field
		  var modlIdLabel = document.createElement('label');
		  modlIdLabel.setAttribute('for', 'modl-id');
		  modlIdLabel.textContent = 'Module ID:';

		  var modlIdInput = document.createElement('input');
		  modlIdInput.setAttribute('type', 'text');
		  modlIdInput.setAttribute('id', 'modl-id');
		  modlIdInput.setAttribute('name', 'modl-id');

		  var modlIdDiv = document.createElement('div');
		  modlIdDiv.appendChild(modlIdLabel);
		  modlIdDiv.appendChild(modlIdInput);
		  formDiv.appendChild(modlIdDiv);

		  // Create the submit button
		  var submitInput = document.createElement('input');
		  submitInput.setAttribute('type', 'submit');
		  submitInput.setAttribute('value', 'Submit');

		  var submitDiv = document.createElement('div');
		  submitDiv.appendChild(submitInput);
		  formDiv.appendChild(submitDiv);

		  // Append the form to the body or any other desired container
		  document.body.appendChild(formDiv);
		}

		// Call the createForm function to create the form dynamically
</script>
</html>