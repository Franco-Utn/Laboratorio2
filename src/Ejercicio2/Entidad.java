package Ejercicio2;

    public abstract class Entidad {

        protected int idEntidad;
        protected String nombre;
        protected String descripcion;

        public Entidad(int idEntidad, String nombre, String descripcion) {
            this.idEntidad = idEntidad;
            this.nombre = nombre;
            this.descripcion = descripcion;
        }

        public int getIdEntidad() {
            return idEntidad;
        }

        public void setIdEntidad(int idEntidad) {
            this.idEntidad = idEntidad;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getDescripcion() {
            return descripcion;
        }

        public void setDescripcion(String descripcion) {
            this.descripcion = descripcion;
        }

        @Override
        public String toString() {
            return "Entidad{" +
                    "idEntidad=" + idEntidad +
                    ", nombre='" + nombre + '\'' +
                    ", descripcion='" + descripcion + '\'' +
                    '}';
        }

        public abstract String obtenerInformacionAdicional();
    }

