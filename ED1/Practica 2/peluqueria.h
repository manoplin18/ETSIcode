#ifndef PELUQUERIA_H_INCLUDED
#define PELUQUERIA_H_INCLUDED

#include "listaDinamica.h"
#include "colaDinamica.h"

struct peluquerof{
    int Codigo;
    cadena Apellidos;
    cadena Nombre;
    int TipoServicio;
};

class peluqueria{
    lista L; //lista de los t�cnicos que est�n atendiendo
public:
    void AbrirPeluqueria(char *nombrefichero);
    void IncorporarPeluquero(peluquerof t);
    bool RetirarPeluquero(int codigo);
    bool EliminarCliente(cadena Nombre, cadena Apelllidos);
    bool IncorporarCliente(cliente cli);
    void Mostrar();
    bool AtenderCliente(int CodigoPeluquero);
    void VolcarPeluqueria(char *nombrefichero);
};

#endif // PELUQUERIA_H_INCLUDED