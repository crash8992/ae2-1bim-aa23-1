from modelo import Universidad, Ciudad

# Universidad u = new Universidad("UTPL", 450, 15000)

u = Universidad("UTPL", 450, 15000)
# print(u)
u.establecer_nombre("ESPE")
# print(u)
print(u.obtener_alumnos())