<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">

<form class="row g-3" action="handleform" method="post">
<div class="alert alert-danger" role="alert">
  <form:errors path="student.*" />
</div>
  <div class="col-md-6">
    <label for="inputEmail4" class="form-label">Email</label>
    <input type="email" class="form-control" id="inputEmail4" name="email">
  </div>
  <div class="col-md-6">
    <label for="inputPassword4" class="form-label">Password</label>
    <input type="password" class="form-control" id="inputPassword4" name="password">
  </div>
  <div class="col-12">
    <label for="inputAddress" class="form-label">Address</label>
    <input type="text" class="form-control" id="inputAddress" placeholder="1234 Main St" name="address">
  </div>

  <div class="col-md-6">
    <label for="inputCity" class="form-label">City</label>
    <input type="text" class="form-control" id="inputCity">
  </div>


	<div class="form-group">
		<label for="exampleFormControlSelect1">Select Courses</label> <select
			name="courses" class="form-control" id="exampleFormControlSelect1"
			multiple>
			<option>Java</option>
			<option>Python</option>
			<option>C++</option>
			<option>Django</option>
			<option>Spring Framework</option>
		</select>
	</div>

	<div class="form-group">
		<label for="">Select Type</label>
		<select class="form-control" name="type">
			<option value="oldstudent">Old Student</option>
			<option value="normalstudent">Normal Student</option>
		</select>
	</div>
  
  <div class="card">
  	<div class="card-body">
  		<p>Your address</p>
  		
  		<div class="form-group">
  			<input 
  			name="address.street"
  			type="text" class="form-control"
  			placeholder="Enter street" />
  		</div>
  		
  		<div class="form-group">
  			<input 
  			name="address.city"
  			type="text" class="form-control"
  			placeholder="Enter city" />
  		</div>
  		
  	</div>
  </div> 
  
  <div class="col-12">
    <button type="submit" class="btn btn-primary">Sign in</button>
  </div>
</form>