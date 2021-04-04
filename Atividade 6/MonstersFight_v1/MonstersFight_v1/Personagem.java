/**
 * Esta classe representa um personagem do jogo, o qual poderá participar de lutas.
 * Cada personagem eh conectado a outros indicando as possiveis transformacoes.
 * A principio as transformacoes sao lobisomen, mumia, vampiro e zumbi. Para
 * cada transformacao possivel, o personagem guarda uma referencia para o outro
 * personagem ou null se nao for possivel aquela transformacao.
 * @author Luiz Merschmann
 * @version 29/11/2020
 */
public class Personagem {
    public String identificacao;
    public int forcaAtaque;
    public int forcaDefesa;
    public Personagem lobisomen;
    public Personagem mumia;
    public Personagem vampiro;
    public Personagem zumbi;
    
    /**
     * Cria um personagem com a "descricao" e habilidades (forca
     * de ataque e defesa) passadas. Inicialmente ele não pode
     * sofrer transformacoes.
     * @param descricao A descricao do personagem.
     * @param forcaAtaque A forca de ataque daquele personagem.
     * @param forcaDefesa A forca de defesa daquele personagem.
     */
    public Personagem(String descricao,int forcaAtaque, int forcaDefesa) {
        this.identificacao = descricao;
        this.forcaAtaque = forcaAtaque;
        this.forcaDefesa = forcaDefesa;
    }
    /**
     * Define as transformacoes possiveis. Cada transformacao leva a um
     * outro personagem ou eh null (transformacao impossivel).
     * @param t1 Transformar em lobisomen.
     * @param t2 Transformar em mumia.
     * @param t3 Transformar em vampiro.
     * @param t4 Transformar em zumbi.
     */
    public void definirTransformacoes(Personagem t1, Personagem t2, Personagem t3, Personagem t4){
        if(t1 != null)
            lobisomen = t1;
        if(t2 != null)
            mumia = t2;
        if(t3 != null)
            vampiro = t3;
        if(t4 != null)
            zumbi = t4;
    }
    /**
     * @return A descricao do personagem.
     */
    public String getDescricao() {
        return identificacao + "\t--> Força de ataque = " + forcaAtaque+ "\tForça de defesa = " + forcaDefesa;
    }
}
