package br.ufpb.dcx.laurindo.cleyton.Atividade11;

public class Praia extends AtrativoTuristico {

    // 1. Atributos da classe (devem ficar aqui, fora dos métodos)
    private boolean propriaParaBanho;
    private boolean perigoTubarao;
    private String tipoOrla;

    // 2. Constantes públicas e estáticas
    public static final String TIPO_PISCINAS_NATURAIS = "Piscinas Naturais";
    public static final String TIPO_ONDAS_FORTES = "Ondas Fortes";
    public static final String TIPO_ONDAS_MEDIAS = "Ondas Médias";

    // 3. Construtor padrão (sem argumentos)
    public Praia() {
        super();
    }

    // 4. Construtor completo (ajustado o tipo do perigoTubarao para boolean e removido perigoOrla)
    public Praia(String nome, double latitude, double longitude, String comoChegar,
                 String cidade, String estado, boolean propriaParaBanho,
                 boolean perigoTubarao, String tipoOrla) {
        super(nome, latitude, longitude, comoChegar, cidade, estado);
        this.propriaParaBanho = propriaParaBanho;
        this.perigoTubarao = perigoTubarao;
        this.tipoOrla = tipoOrla;
    }

    // Métodos específicos
    public boolean ehPropriaParaBanho() {
        return this.propriaParaBanho;
    }

    public void setPropriaParaBanho(boolean ehPropria) {
        this.propriaParaBanho = ehPropria;
    }

    public boolean temPerigoTubarao() {
        return this.perigoTubarao;
    }

    public void setPerigoTubarao(boolean temPerigo) {
        this.perigoTubarao = temPerigo;
    }

    public String getTipoOrla() {
        return this.tipoOrla;
    }

    public void setTipoOrla(String tipoOrla) {
        this.tipoOrla = tipoOrla;
    }
}