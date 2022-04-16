<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <title>uploadImages</title>
  </head>
  <body>
   	
   	<!-- ${pageContext.request.contextPath}/upload , enctype= "multipart/form-data" -->
   	
   	<div class="container">
   		<div class="row justify-content-center offset-2" style="margin-top: 350px;">
   			<div class="col-md-6">
   				<div class="card text-white bg-secondary mb-3" style="max-width: 19rem;">
   					<div class="card-header">Upload Image : </div>
   					<div class="card-body">
   						<form action="uploadImage" method="post" enctype="multipart/form-data">
   							<div class="mb-3">
   								<label for="formFile" class="form-label">Select File to Upload : </label>
   								<input class="form-control" name="profile" type="file" id="formFile">
   							</div>
   							<div class="text-center">
   								<button class="btn btn-success">Upload</button>
   							</div>
   						</form>
   					</div>
   				</div>
   			</div>
   		</div>
   	</div>
   	
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
  </body>
</html>