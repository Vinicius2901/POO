class Livro:
    def __init__(self):
        self.nome = ""
        self.autor = ""
        self.genero = ""

    def __str__(self):
        return "\nNome : {} \nAutor: {} \nGenero: {}".format( self.nome, self.autor, self.genero )