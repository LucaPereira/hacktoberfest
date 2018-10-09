String[] opcoes = {"pedra", "papel", "tesoura"};
        int numero = new Random().nextInt(3);
        String escolhaApp = opcoes[numero];

        switch (escolhaApp){
            case "pedra":
                imagemResultado.setImageResource(R.drawable.pedra);
                break;
            case "papel":
                imagemResultado.setImageResource(R.drawable.papel);
                break;
            case "tesoura":
                imagemResultado.setImageResource(R.drawable.tesoura);
                break;
        }
        if (    (escolhaApp == "pedra" && escolhaUsuario == "tesoura") ||
                (escolhaApp == "tesoura" && escolhaUsuario == "papel") ||
                (escolhaApp == "papel" && escolhaUsuario == "pedra"))
        {//App ganhador
            TextView textoResultado = findViewById(R.id.resultadoSorteio);
            textoResultado.setText("Você perdeu :(");
        }else if (  (escolhaUsuario == "pedra" && escolhaApp == "tesoura") ||
                    (escolhaUsuario == "tesoura" && escolhaApp == "papel") ||
                    (escolhaUsuario == "papel" && escolhaApp == "pedra"))
        {//usuário ganhador
            TextView textoResultado = findViewById(R.id.resultadoSorteio);
            textoResultado.setText("Você ganhou :)");
        }else{//empate
            TextView textoResultado = findViewById(R.id.resultadoSorteio);
            textoResultado.setText("Empate!!! jogue novamente");
        }
    }
}