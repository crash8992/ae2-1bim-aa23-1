class Universidad:

    def __init__(self, name, n_profesores, n_alumnos):
        self.nombre = name
        self.profesores = n_profesores
        self.alumnos = n_alumnos

    def establecer_nombre(self, n):
        self.nombre = n

    def establecer_profesores(self, n):
        self.profesores = n

    def establecer_alumnos(self, n):
        self.alumnos = n

    def obtener_nombre(self):
        return self.nombre

    def obtener_profesores(self):
        return self.profesores

    def obtener_alumnos(self):
        return self.alumnos

    def __str__(self):
        return "Universidad: %s, Número de profesores: %d, Número de alumnos: %d\n" \
            % (self.nombre, self.profesores, self.alumnos)