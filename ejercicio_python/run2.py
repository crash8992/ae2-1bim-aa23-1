from modelo import Universidad

contador = 1

while(contador<=3):
    nombre_universidad = input("Ingrese nombre de universidad: ")
    num_profesores = input("Ingrese número de profesores: ")
    num_profesores = int(num_profesores)
    num_alumnos = input("Ingrese número de alumnos: ")
    num_alumnos = int(num_alumnos)
    # se crea el objeto
    u = Universidad(nombre_universidad, num_profesores, num_alumnos)
    print(u)
    # se incrementa el contador
    contador = contador + 1