<html>
	<head>
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
	</head>
	
	<body>
		<main>
			<div class="container">
				<section>
					<h1>Alta</h1>
					<!--  jsp para que sea dinamico, cambio el index.html por index.jsp-->
					<form method="POST"
						action="<%=request.getContextPath()%>/CreateController">
						<div class="mb-3">
						  <label for="nombre" class="form-label">Nombre</label>
						  <input type="text" class="form-control" id="nombre" placeholder="Nombre" maxlength="50">
						</div>
						<div class="mb-3">
						  <label for="precio" class="form-label">Precio</label>
						  <input type="number" class="form-control" id="precio" >
						</div>
						<div class="mb-3">
						  <label for="imagen" class="form-label">Im&aacute;gen</label>
						  <input type="file" class="form-control" id="imagen">
						</div>
						<div class="mb-3">
						  <label for="codigo" class="form-label">C&oacute;digo</label>
						  <input type="text" class="form-control" id="codigo" maxlength="7">
						</div>
						<button class="btn btn-primary">
							Dar de alta
						</button>
					</form>
				</section>
			</div>
		</main>
	</body>	
</html>