package com.everis.Api2.Enun;

public enum ETipoConta {

    PESSOA_FISICA("pessoa fisica", 5, 10),
    PESSOA_JURIDICA("pessoa juridica", 50, 10),
    GOVERNAMENTAL("governamental", 250, 20);

    private String descricao;

    private int quantidadeSaque;

    private double taxa;

    ETipoConta(String descricao, int quantidadeSaque, double taxa) {
        this.descricao = descricao;
        this.quantidadeSaque = quantidadeSaque;
        this.taxa = taxa;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getQuantidadeSaque() {
        return quantidadeSaque;
    }

    public double getTaxa() {
        return taxa;
    }

    public void verificarTipoConta(){
//        if (conta.getTipoDaConta() == ETipoConta.PESSOA_FISICA){
//            conta.setQuantidadeSaquesGratuitos(5);
//        }else if (conta.getTipoDaConta() == ETipoConta.PESSOA_JURIDICA){
//            conta.setQuantidadeSaquesGratuitos(50);
//        }else if (conta.getTipoDaConta() == ETipoConta.GOVERNAMENTAL){
//            conta.setQuantidadeSaquesGratuitos(250);
//        }
    }
}
