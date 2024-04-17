class Filme():
    def __init__(self, titulo : str, ano : int, classificacao : str, nota : float):
        self.titulo = titulo
        self.ano = ano
        self.classificacao = classificacao
        self.nota = nota

    @classmethod
    def from_dict(self, data: dict):
        return self(data["titulo"], data["ano"], data["classificacao"], data["nota"])
        
    def __str__(self) -> str:
        return "Titulo: {}\nAno: {}\nClassificacao: {}\nNota: {}\n".format(self.titulo, self.ano, self.classificacao, self.nota)
