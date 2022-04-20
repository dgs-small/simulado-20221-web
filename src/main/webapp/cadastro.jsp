<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Cadastro de Usuário</title>
	<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
	
</head>
<body>
	<div class="px-4 py-5 my-5 text-center">
		<h1 class="display-5 fw-bold">CADASTRO</h1>
		<div class="col-lg-6 mx-auto">
			<form method="post" action="/cadastro">
				<div class="lead mb-4">
					<div class="form-floating mb-3">
						<input type="text" class="form-control" name="login" id="login"
							placeholder="login"> <label for="login">Login</label>
					</div>
					<div class="form-floating">
						<input type="password" class="form-control" name="senha"
							id="senha" placeholder="senha"> <label for="senha">Senha</label>
					</div>

				</div>
				<div class="d-grid gap-2 d-sm-flex justify-content-sm-center">
					<button type="submit" class="btn btn-primary btn-lg px-4 gap-3">Enviar</button>
				</div>
			</form>

		</div>
	</div>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
	
</body>
</html>