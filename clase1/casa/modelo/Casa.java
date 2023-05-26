package clase1.casa.modelo;

class Casa {
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

    // getters...

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

    public static Builder Builder() {
        return new Builder();
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

        private Builder() {}

        public Builder cimientos(String cimientos) {
            this.cimientos = cimientos;
            return this;
        }

        public Builder estructura(String estructura) {
            this.estructura = estructura;
            return this;
        }

        public Builder techo(String techo) {
            this.techo = techo;
            return this;
        }

        public Builder interior(String interior) {
            this.interior = interior;
            return this;
        }

        public Builder habitaciones(int habitaciones) {
            this.habitaciones = habitaciones;
            return this;
        }

        public Builder tieneCocina(boolean tieneCocina) {
            this.tieneCocina = tieneCocina;
            return this;
        }

        public Builder pais(String pais) {
            this.pais = pais;
            return this;
        }

        public Builder provincia(String provincia) {
            this.provincia = provincia;
            return this;
        }

        public Builder direccion(String direccion) {
            this.direccion = direccion;
            return this;
        }

        public Builder tienePatio(boolean tienePatio) {
            this.tienePatio = tienePatio;
            return this;
        }

        public Builder tieneCochera(boolean tieneCochera) {
            this.tieneCochera = tieneCochera;
            return this;
        }

        public Casa construir() {
            return new Casa(this);
        }
    }
}