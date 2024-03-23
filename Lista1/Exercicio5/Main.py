from Emprestimo import Emprestimo
from Livro import Livro

livro1 = Livro()
livro2 = Livro()

emprestimo1 = Emprestimo()
emprestimo2 = Emprestimo()

livro1.nome = "Harry Potter e o prisioneiro de Azkaban"
livro1.autor = "J.K. Rowlling"
livro1.genero = "Fantasia"

livro2.nome = "Trono de Vidro"
livro2.autor = "Sarah J. Maas"
livro2.genero = "Fantasia, Romance"

emprestimo1.livro = livro1
emprestimo1.inicio = "23/03/2024"
emprestimo1.fim = "30/03/2024"

emprestimo2.livro = livro2
emprestimo2.inicio = "25/03/2024"
emprestimo2.inicio = "15/04/2024"

print("\nEmprestimo 1:\n" )
print( emprestimo1 )

print("\nEmprestimo 2:\n")
print( emprestimo2 )
