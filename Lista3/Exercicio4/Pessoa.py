from abc import ABC, abstractmethod

class Pessoa(ABC):
    def __init__(self, nome: str):
        self.nome = nome