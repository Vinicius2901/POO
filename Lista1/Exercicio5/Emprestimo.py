from Livro import Livro
class Emprestimo:
    def __init__(self):
        self.livro = Livro()
        self.inicio = ""
        self.fim = ""

    def __str__(self):
        return "Livro: {} \nData de inicio: {} \nData de fim: {}".format( self.livro, self.inicio, self.fim )