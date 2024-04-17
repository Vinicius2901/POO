from Filme import Filme
import json

a = open('C:/Users/vinic/OneDrive/Documents/UDESC/POO/Lista2/Exercicio5/filmes.json')
myJson = json.load(a)

listaFilmes = []

for filme_data in myJson:
    #listaFilmes.append(filme_data['titulo'], flme_data['ano'], filme_data['classificacao'], filme_data['nota'])
    filme = Filme.from_dict(filme_data)
    listaFilmes.append(filme)

listaFilmes_ordenada = sorted(listaFilmes, key=lambda filme: filme.nota)

for filme in listaFilmes_ordenada:
    print(filme)
