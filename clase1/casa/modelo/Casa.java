package clase1.casa.modelo;

public class Casa {
    private String cimientos;
    private String estructura;
    private String techo;
    private String interior;
    private int habitaciones;
    private boolean tieneCocina;
    private String pais;
    private String provincia;
    private String direccion;
    private boolean tienePatio;
    private boolean tieneCochera;

    private Casa(Builder builder) {
        this.cimientos = builder.cimientos;
        this.estructura = builder.estructura;
        this.techo = builder.techo;
        this.interior = builder.interior;
        this.habitaciones = builder.habitaciones;
        this.tieneCocina = builder.tieneCocina;
        this.pais = builder.pais;
        this.provincia = builder.provincia;
        this.direccion = builder.direccion;
        this.tienePatio = builder.tienePatio;
        this.tieneCochera = builder.tieneCochera;
    }

    public String getCimientos() {
        return cimientos;
    }

    public String getEstructura() {
        return estructura;
    }

    public String getTecho() {
        return techo;
    }

    public String getInterior() {
        return interior;
    }

    public int getHabitaciones() {
        return habitaciones;
    }

    public boolean isTieneCocina() {
        return tieneCocina;
    }

    public String getPais() {
        return pais;
    }

    public String getProvincia() {
        return provincia;
    }

    public String getDireccion() {
        return direccion;
    }

    public boolean isTienePatio() {
        return tienePatio;
    }

    public boolean isTieneCochera() {
        return tieneCochera;
    }

    @Override
    public String toString() {
        return "Casa{" +
                "cimientos='" + cimientos + '\'' +
                ", estructura='" + estructura + '\'' +
                ", techo='" + techo + '\'' +
                ", interior='" + interior + '\'' +
                ", habitaciones=" + habitaciones +
                ", tieneCocina=" + tieneCocina +
                ", pais='" + pais + '\'' +
                ", provincia='" + provincia + '\'' +
                ", direccion='" + direccion + '\'' +
                ", tienePatio=" + tienePatio +
                ", tieneCochera=" + tieneCochera +
                '}';
    }

    public static class Builder {
        private String cimientos;
        private String estructura;
        private String techo;
        private String interior;
        private int habitaciones;
        private boolean tieneCocina;
        private String pais;
        private String provincia;
        private String direccion;
        private boolean tienePatio;
        private boolean tieneCochera;

        public Builder() {
        }

        public Builder setCimientos(String cimientos) {
            this.cimientos = cimientos;
            return this;
        }

        public Builder setEstructura(String estructura) {
            this.estructura = estructura;
            return this;
        }

        public Builder setTecho(String techo) {
            this.techo = techo;
            return this;
        }

        public Builder setInterior(String interior) {
            this.interior = interior;
            return this;
        }

        public Builder setHabitaciones(int habitaciones) {
            this.habitaciones = habitaciones;
            return this;
        }

        public Builder setTieneCocina(boolean tieneCocina) {
            this.tieneCocina = tieneCocina;
            return this;
        }

        public Builder setPais(String pais) {
            this.pais = pais;
            return this;
        }

        public Builder setProvincia(String provincia) {
            this.provincia = provincia;
            return this;
        }

        public Builder setDireccion(String direccion) {
            this.direccion = direccion;
            return this;
        }

        public Builder setTienePatio(boolean tienePatio) {
            this.tienePatio = tienePatio;
            return this;
        }

        public Builder setTieneCochera(boolean tieneCochera) {
            this.tieneCochera = tieneCochera;
            return this;
        }

        public Casa construir() {
            return new Casa(this);
        }
    }
}