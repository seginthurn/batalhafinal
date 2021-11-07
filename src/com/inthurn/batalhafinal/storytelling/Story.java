package com.inthurn.batalhafinal.storytelling;

import com.inthurn.batalhafinal.character.*;
import com.inthurn.batalhafinal.combatsystem.Combat;
import com.inthurn.batalhafinal.combatsystem.Difficulty;
import com.inthurn.batalhafinal.utils.DiceRoll;
import com.inthurn.batalhafinal.utils.Keyboard;

public class Story {
    private PathType pathChoice;
    private Difficulty difficulty;

    public Story(Difficulty difficulty) {
        this.difficulty = difficulty;
    }

    public void tell() {
        Integer option;
        Boolean done = false;
        Hero hero = new Hero("Mar", CharClass.ARCHER, SexType.MALE, WeaponType.WARHAMMER);
        Villain warOrc = new Villain(VillainClass.WAR_ORC.getVillainName(), VillainClass.WAR_ORC);


        System.out.println("\n \n \n \n \n \n \n \n \n \n");
        System.out.println("A noite se aproxima, a lua já surge no céu, estrelas vão se acendendo, e sob a luz do crepúsculo\n" +
                "você está prestes a entrar na fase final da sua missão. Você olha para o portal à sua frente, e\n" +
                "sabe que a partir desse ponto, sua vida mudará para sempre.");
        System.out.println("");

        System.out.println(" Memórias do caminho percorrido para chegar até aqui invadem sua mente. Você se lembra de\n" +
                "todos os inimigos já derrotados para alcançar o covil do líder maligno. Olha para seu\n" +
                "equipamento de combate, já danificado e desgastado depois de tantas lutas. Você está a um\n" +
                "passo de encerrar para sempre esse mal.");
        System.out.println("");
        Keyboard.pressEnterToContinue();

        System.out.println("Buscando uma injeção de ânimo, você se força a lembrar o que te trouxe até aqui...");
        System.out.println("[Escolha sua motivação para invadir a caverna do inimigo e derrotá-lo: VINGANÇA ou GLÓRIA");

        while (!done) {
            System.out.println("1 - Vingança");
            System.out.println("2 - Glória");
            option = Keyboard.scanInteger();
            switch (option) {
                case 1:
                    this.pathChoice = PathType.VENGEANCE;
                    break;
                case 2:
                    this.pathChoice = PathType.GLORY;
                    break;
                default:
                    System.out.println("Seu destino depende de uma das opções, escolha novamente!");
                    continue;
            }
            if (this.pathChoice.equals(PathType.VENGEANCE)) {
                System.out.println("Imagens daquela noite trágica invadem sua mente. Você nem precisa se esforçar\n" +
                        "para lembrar, pois essas memórias estão sempre presentes, mesmo que de pano de fundo,\n" +
                        "quando você tem outros pensamentos em foco, elas nunca o deixaram. Elas são o combustível\n" +
                        "que te fizeram chegar até aqui. E você sabe que não irá desistir até ter vingado a morte daqueles\n" +
                        "que foram - e pra sempre serão - sua fonte de amor e desejo de continuar vivo. O maldito líder\n" +
                        "finalmente pagará por tanto mal causado na vida de tantos (e principalmente na sua).");
                System.out.println("");
                Keyboard.pressEnterToContinue();

            } else if (this.pathChoice.equals(PathType.GLORY)) {
                System.out.println("Você já consegue visualizar na sua mente o povo da cidade te recebendo de braços\n" +
                        "abertos, bardos criando canções sobre seus feitos heróicos, nobres te presenteando com jóias e\n" +
                        "diversas riquezas, taberneiros se recusando a cobrar por suas bebedeiras e comilanças. Desde\n" +
                        "já, você sente o amor do público, te louvando a cada passo que dá pelas ruas, depois de destruir\n" +
                        "o vilão que tanto assombrou a paz de todos. Porém, você sabe que ainda falta o último ato dessa\n" +
                        "história. Você se concentra na missão. A glória o aguarda, mas não antes da última batalha.");
                System.out.println("");
                Keyboard.pressEnterToContinue();

            }
            done = true;
            hero.setPath(this.pathChoice);
        }

        System.out.println("Inspirado pelo motivo que te trouxe até aqui, você sente seu coração ardendo em chamas, suas\n" +
                "mãos formigarem em volta da sua arma. Você a segura com firmeza. Seu foco está renovado.\n" +
                "Você avança pelo portal.");
        System.out.println("");

        System.out.println("A escuridão te envolve. Uma iluminação muito fraca entra pelo portal às suas costas. À sua\n" +
                "frente, só é possível perceber que você se encontra em um corredor extenso. Você só pode ir à\n" +
                "frente, ou desistir.");
        System.out.println("");
        done = false;
        while (!done) {
            System.out.println("Seguir em frente ou desistir?");
            System.out.println("1 - Seguir em frente!");
            System.out.println("2 - Desistir...");
            option = Keyboard.scanInteger();
            switch (option) {
                case 1:
                    System.out.println("Você caminha, atento a todos os seus sentidos, por vários metros, até visualizar a frente\n" +
                            "uma fonte de luz, que você imagina ser a chama de uma tocha, vindo de dentro de uma porta\n" +
                            "aberta.");
                    break;
                case 2:
                    System.out.println("O medo invade o seu coração e você sente que ainda não está à altura do desafio.\n" +
                            "Você se volta para a noite lá fora e corre em direção à segurança.");
                    return;
                default:
                    System.out.println("");
                    System.out.println("Seu destino conta com sua ação...");
                    continue;
            }
            done = true;
        }

        System.out.println("Você se pergunta se dentro dessa sala pode haver inimigos, ou alguma armadilha, e pondera\n" +
                "sobre como passar pela porta.");
        done = false;
        while (done == false) {
            System.out.println("1 - Andar cuidadosamente, não quero chamar atenção...");
            System.out.println("2 - Saltando! é a maneira mais rápida de passar pela sala...");
            System.out.println("3 - Correndo! não quero nem ver o que tem ali dentro....");
            option = Keyboard.scanInteger();
            switch (option) {
                case 1:
                    System.out.println("Você toma cuidado e vai caminhando vagarosamente em direção à luz. Quando você\n" +
                            "pisa exatamente embaixo da porta, você sente o chão ceder levemente, como se tivesse pisado\n" +
                            "em uma pedra solta. Você ouve um ruído de mecanismos se movimentando, e uma escotilha se\n" +
                            "abre no teto atrás de você, no corredor. Flechas voam da escotilha em sua direção, e você salta\n" +
                            "para dentro da sala, porém uma delas te acerta na perna.");
                    System.out.println("");
                    Combat.scenarioAttack(hero);
                    System.out.println("Você tem " + hero.getLifePoints() + " pontos de vida restantes... ");
                    Keyboard.pressEnterToContinue();
                    break;
                case 2:
                    System.out.println("Você se concentra e pula em direção à luz, saltando de antes da porta até o interior\n" +
                            "da sala.");
                    Keyboard.pressEnterToContinue();
                    break;
                case 3:
                    System.out.println("Você respira fundo e desata a correr em direção à sala. Quando passa pela porta,\n" +
                            "sente que pisou em uma pedra solta, mas não dá muita importância e segue para dentro da sala,\n" +
                            "olhando ao redor à procura de inimigos. Não tem ninguém, mas você ouve sons de flechas\n" +
                            "batendo na pedra atrás de você, e quando se vira, vê várias flechas no chão. Espiando pela porta,\n" +
                            "você entende que pisou em uma armadilha que soltou flechas de uma escotilha aberta no teto,\n" +
                            "mas por sorte você entrou correndo e conseguiu escapar desse ataque surpresa.");
                    Keyboard.pressEnterToContinue();
                    break;
                default:
                    System.out.println("Seja forte! você precisa tomar uma decisão....");
                    continue;
            }
            done = true;
        }
        System.out.println("\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
        System.out.println("Você se encontra sozinho em uma sala quadrada, contendo uma porta em cada parede. Uma\n" +
                "delas foi aquela pela qual você entrou, que estava aberta, e as outras três estão fechadas. A\n" +
                "porta à sua frente é a maior das quatro, com inscrições em seu entorno em uma língua que você\n" +
                "não sabe ler, mas reconhece como sendo a língua antiga utilizada pelo inimigo. Você se aproxima\n" +
                "da porta e percebe que ela está trancada por duas fechaduras douradas, e você entende que\n" +
                "precisará primeiro derrotar o que estiver nas outras duas portas laterais, antes de conseguir\n" +
                "enfrentar o líder.");
        System.out.println("Você se dirige para a porta à direita.");
        Keyboard.pressEnterToContinue();


        System.out.println("Você se aproxima, tentando ouvir o que acontece porta adentro, mas não\n" +
                "escuta nada. Segura com mais força sua arma com uma mão, enquanto empurra a porta com a\n" +
                "outra. Ao entrar, você se depara com uma sala espaçosa, com vários equipamentos de batalha\n" +
                "pendurados nas paredes e dispostos em armários e mesas. Você imagina que este seja o arsenal\n" +
                "do inimigo, onde estão guardados os equipamentos que seus soldados utilizam quando saem\n" +
                "para espalhar o terror nas cidades e vilas da região.");

        System.out.println("\n \n \n \n \n \n \n \n \n \n");
        System.out.println("Enquanto seu olhar percorre a sala, você ouve a porta se fechando e gira rapidamente para olhar\n" +
                "para trás. Ali, de pé entre você e a porta fechada, bloqueando o caminho do seu destino, está um\n" +
                "dos capitães do inimigo. Um orque horrendo, de armadura, capacete e espada em punho, em\n" +
                "posição de combate. Ele avança em sua direção....");


        Combat warOrcFight = new Combat(hero, warOrc, this.difficulty);
        warOrcFight.attack(warOrc, DiceRoll.roll());
        warOrcFight.battle();

        System.out.println("Após derrotar o Armeiro, você percebe que seus equipamentos estão muito danificados, e olha\n" +
                "em volta, encarando todas aquelas peças de armaduras resistentes e em ótimo estado.");
        System.out.println("Pegar equipamentos? ");
        done = false;
        while (done == false) {
            System.out.println("1 - Sim!");
            System.out.println("2 - Não acho uma boa ideia...");
            option = Keyboard.scanInteger();
            switch (option) {
                case 1:
                    System.out.println("VVocê resolve usar os equipamentos do\n" +
                            "inimigo contra ele, e trocar algumas peças suas, que estavam danificadas, pelas peças de\n" +
                            "armaduras existentes na sala. De armadura nova, você se sente mais protegido para os desafios\n" +
                            "à sua frente.");
                    System.out.println("");
                    hero.setDefensePoints(hero.getDefensePoints() + 5);
                    System.out.println("Você ganhou +5 pontos de armadura, e agora sua defesa é de: " + hero.getDefensePoints());
                    Keyboard.pressEnterToContinue();
                    break;
                case 2:
                    System.out.println("Você decide que não precisa utilizar\n" +
                            "nada que venha das mãos do inimigo.”");
                    Keyboard.pressEnterToContinue();
                    break;
                default:
                    System.out.println("Seja forte! você precisa tomar uma decisão....");
                    continue;
            }
            done = true;
        }
        System.out.println("Em uma mesa, você encontra uma chave dourada, e sabe que aquela chave abre uma das\n" +
                "fechaduras da porta do líder inimigo. Você pega a chave e guarda numa pequena bolsa que leva\n" +
                "presa ao cinto.");
        Keyboard.pressEnterToContinue();

        System.out.println("Você retorna à sala anterior e se dirige à porta da esquerda. Você se\n" +
                "aproxima, tentando ouvir o que acontece porta adentro, mas não escuta nada. Segura com mais\n" +
                "força sua arma com uma mão, enquanto empurra a porta com a outra. Ao entrar, você se depara\n" +
                "com uma sala parecida com a do arsenal, mas em vez de armaduras, existem vários potes e\n" +
                "garrafas de vidro com conteúdos misteriosos e de cores diversas, e você entende que o capitão\n" +
                "que vive ali, realiza experimentos com diversos ingredientes, criando poções utilizadas pelos\n" +
                "soldados para aterrorizar a região.");
        Keyboard.pressEnterToContinue();

        System.out.println("No fundo da sala, olhando em sua direção, está outro dos capitães do inimigo. Um orque\n" +
                "horrendo, de armadura, cajado em punho, em posição de combate. Ele avança em sua direção.");

        Villain scientistOrc = new Villain(VillainClass.CIENTIST_ORC.getVillainName(), VillainClass.CIENTIST_ORC);
        Combat scientstOrcFight = new Combat(hero, scientistOrc, this.difficulty);

        System.out.println("Após derrotar o Alquimista, você olha em volta, tentando reconhecer alguma poção do estoque\n" +
                "do inimigo. Em uma mesa, você reconhece uma pequena garrafa de vidro contendo um líquido\n" +
                "levemente rosado, pega a garrafa e pondera se deve beber um gole.");
        System.out.println("Beber?");

        done = false;
        while (done == false) {
            System.out.println("1 - Beber!");
            System.out.println("2 - Não quero arriscar....");
            option = Keyboard.scanInteger();
            switch (option) {
                case 1:
                    System.out.println("“Você se sente revigorado para seguir adiante!");
                    System.out.println("");
                    hero.setLifePoints(hero.getHeroClass().getLifePoints());
                    System.out.println("Seus pontos de vida foram recuperados!");
                    Keyboard.pressEnterToContinue();
                    break;
                case 2:
                    System.out.println("Você fica receoso de beber algo produzido pelo inimigo");
                    Keyboard.pressEnterToContinue();
                    break;
                default:
                    System.out.println("Seja forte! você precisa tomar uma decisão....");
                    continue;
            }
            done = true;
        }
        System.out.println("Ao lado da porta, você vê uma chave dourada em cima de uma mesa, e sabe que aquela chave\n" +
                "abre a outra fechadura da porta do líder inimigo. Você pega a chave e guarda na pequena bolsa\n" +
                "que leva presa ao cinto.");
        Keyboard.pressEnterToContinue();

        System.out.println("De volta à sala das portas, você se dirige à porta final. Coloca as chaves nas fechaduras, e a\n" +
                "porta se abre. Seu coração acelera, memórias de toda a sua vida passam pela sua mente, e você\n" +
                "percebe que está muito próximo do seu objetivo final. Segura sua arma com mais firmeza, foca\n" +
                "no combate que você sabe que irá se seguir, e adentra a porta.");
        Keyboard.pressEnterToContinue();

        System.out.println("Lá dentro, você vê o líder sentado em uma poltrona dourada, com duas fogueiras de cada lado, e\n" +
                "prisioneiros acorrentados às paredes.");

        System.out.println("Ele percebe sua chegada e se levanta com um salto, apanhando seu machado de guerra de\n" +
                "lâmina dupla.");

        System.out.println("1 - Tomar iniciativa e atacar!");
        System.out.println("2 - Esperar ele agir....");
        Villain boss = new Villain(VillainClass.BOSS.getVillainName(), VillainClass.BOSS);
        Combat bossFight = new Combat(hero, boss, this.difficulty);
        option = Keyboard.scanInteger();

        if(option == 1){
            bossFight.battle();
        }else {
            System.out.println("Você demorou demias e o inimigo foi mais rápido!");
            bossFight.attack(boss, DiceRoll.roll());
            bossFight.battle();
        }

        System.out.println("Você conseguiu...");
        Keyboard.pressEnterToContinue();
        switch (hero.getPath()){
            case GLORY -> {
                System.out.println("Você obteve sua vingança. Você se ajoelha e cai no choro, invadido por uma\n" +
                        "sensação de alívio e felicidade. Você se vingou, tudo que sempre quis, está feito. Agora você\n" +
                        "pode seguir sua vida.");
                Keyboard.pressEnterToContinue();
            }
            case VENGEANCE -> {
                System.out.println("O êxtase em que você se encontra não cabe dentro de si. Você se ajoelha e grita de\n" +
                        "alegria. A glória o aguarda, você a conquistou");
                Keyboard.pressEnterToContinue();
            }
        }

        System.out.println("Você se levanta, olha para os prisioneiros, vai de um em um e os liberta, e todos vocês saem em\n" +
                "direção à noite, retornando à cidade. Seu dever está cumprido.");
        Keyboard.pressEnterToContinue();
        System.out.println("FIM");
    }

}
