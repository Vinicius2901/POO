print ("Hello World\n\n")

class Veiculo:

    def __init__(self):
        self.__nome = ""
        self.marca = ""
        self.modelo = ""
        self.ano = 0

    def setNome(self, nome):
        self.nome = nome

    def getNome(self):
        return self.nome

    def __str__(self):
        return "Nome: {} \nMarca: {} \nModelo: {} \nAno: {}".format(self.nome, self.marca, self.modelo, self.ano)
    
c = Veiculo()
c.nome = "Corsa"
c.marca = "GM"
c.modelo = "GT"
c.ano = 2000

print (c)