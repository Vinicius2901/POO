from Pessoa import Pessoa

class Aluno(Pessoa):
    def __init__(self, nome: str, notas: list):
        super().__init__(nome)
        self.notas = notas

    def calcularMedia(self):
        soma = sum(self.notas)
        media = soma / len(self.notas)
        return media
    
    def __repr__(self):
        aluno = "{}: Notas: {} Media: {} ".format(self.nome,self.notas,self.calcularMedia())
        if( self.calcularMedia() >= 7 ):
            aluno += "Aprovado.\n"
        else:
            aluno += "Em exame.\n"
        return aluno
