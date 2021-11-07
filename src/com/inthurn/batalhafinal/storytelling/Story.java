package com.inthurn.batalhafinal.storytelling;

import com.inthurn.batalhafinal.character.*;
import com.inthurn.batalhafinal.combatsystem.Combat;
import com.inthurn.batalhafinal.combatsystem.Difficulty;
import com.inthurn.batalhafinal.utils.DiceRoll;
import com.inthurn.batalhafinal.utils.GameLogo;
import com.inthurn.batalhafinal.utils.Keyboard;

public record Story(Hero hero,
                    Difficulty difficulty) {


    public void tell() {
        Integer option;
        boolean done = false;
        Villain warOrc = new Villain(VillainClass.WAR_ORC.getVillainName(), VillainClass.WAR_ORC);
        Villain scientistOrc = new Villain(VillainClass.CIENTIST_ORC.getVillainName(), VillainClass.CIENTIST_ORC);
        Villain boss = new Villain(VillainClass.BOSS.getVillainName(), VillainClass.BOSS);


        System.out.println("\n \n \n \n \n \n \n \n \n \n");
        System.out.println("A noite se aproxima, a lua já surge no céu, estrelas vão se acendendo, e sob a luz do crepúsculo você está prestes a entrar na fase final da sua missão.");

        System.out.println("Você olha para o portal à sua frente, e sabe que a partir desse ponto, sua vida mudará para sempre.");

        Keyboard.pressEnterToContinue();

        System.out.println("Memórias do caminho percorrido para chegar até aqui invadem sua mente." +
                           "\nVocê se lembra de todos os inimigos já derrotados para alcançar o covil do líder maligno.");

        System.out.println("Olha para seu equipamento de combate, já danificado e desgastado depois de tantas lutas." +
                           "\nVocê está a um passo de encerrar para sempre esse mal.");

        Keyboard.pressEnterToContinue();

        System.out.println("Buscando uma injeção de ânimo, você se força a lembrar o que te trouxe até aqui...");
        System.out.println();
        System.out.println("Escolha sua motivação para invadir a caverna do inimigo e derrotá-lo: ");

        while (!done) {
            System.out.println("1 - Vingança");
            System.out.println("2 - Glória");
            option = Keyboard.scanInteger();
            PathType pathChoice;
            switch (option) {
                case 1 -> pathChoice = PathType.VENGEANCE;
                case 2 -> pathChoice = PathType.GLORY;
                default -> {
                    System.out.println("Seu destino depende de uma das opções, escolha novamente!");
                    continue;
                }
            }
            if (pathChoice.equals(PathType.VENGEANCE)) {
                System.out.println("""
                        Imagens daquela noite trágica invadem sua mente. Você nem precisa se esforçar
                        para lembrar, pois essas memórias estão sempre presentes, mesmo que de pano de fundo,
                        quando você tem outros pensamentos em foco, elas nunca o deixaram.
                        Elas são o combustível que te fizeram chegar até aqui.
                        E você sabe que não irá desistir até ter vingado a morte daqueles
                        que foram - e pra sempre serão - sua fonte de amor e desejo de continuar vivo.""");

                System.out.println("O maldito líder finalmente pagará por tanto mal causado na vida de tantos (e principalmente na sua).");

            } else {
                System.out.println("""
                        Você já consegue visualizar na sua mente o povo da cidade te recebendo de braços
                        abertos, bardos criando canções sobre seus feitos heróicos, nobres te presenteando com jóias e
                        diversas riquezas, taberneiros se recusando a cobrar por suas bebedeiras e comilanças. Desde
                        já, você sente o amor do público, te louvando a cada passo que dá pelas ruas, depois de destruir
                        o vilão que tanto assombrou a paz de todos. Porém, você sabe que ainda falta o último ato dessa
                        história.""");
                System.out.println("Você se concentra na missão. A glória o aguarda, mas não antes da última batalha.");

            }
            Keyboard.pressEnterToContinue();
            done = true;
            this.hero.setPath(pathChoice);
        }

        System.out.println("""
                Inspirado pelo motivo que te trouxe até aqui, você sente seu coração ardendo em chamas, suas
                mãos formigarem em volta da sua arma. Você a segura com firmeza. Seu foco está renovado.""");

        System.out.println("Você avança pelo portal.");
        Keyboard.pressEnterToContinue();

        System.out.println("""
                A escuridão te envolve. Uma iluminação muito fraca entra pelo portal às suas costas. À sua
                frente, só é possível perceber que você se encontra em um corredor extenso.""");

        System.out.println("Você só pode ir à frente, ou desistir.");
        Keyboard.pressEnterToContinue();

        done = false;
        while (!done) {
            System.out.println("Seguir em frente ou desistir?");
            System.out.println("1 - Seguir em frente!");
            System.out.println("2 - Desistir...");
            option = Keyboard.scanInteger();
            switch (option) {
                case 1 -> {
                    System.out.println("""
                            Você caminha, atento a todos os seus sentidos, por vários metros, até visualizar a frente
                            uma fonte de luz, que você imagina ser a chama de uma tocha, vindo de dentro de uma porta
                            aberta.""");
                    Keyboard.pressEnterToContinue();
                }
                case 2 -> {
                    System.out.println("O medo invade o seu coração e você sente que ainda não está à altura do desafio.\n" +
                            "Você se volta para a noite lá fora e corre em direção à segurança.");
                    GameLogo.gameOver();
                    return;
                }
                default -> {
                    System.out.println();
                    System.out.println("Seu destino conta com sua ação...");
                    continue;
                }
            }
            done = true;
        }

        System.out.println("Você se pergunta se dentro dessa sala pode haver inimigos, ou alguma armadilha, e pondera\n" +
                "sobre como passar pela porta.");
        done = false;
        while (!done) {
            System.out.println("1 - Andar cuidadosamente, não quero chamar atenção...");
            System.out.println("2 - Saltando! é a maneira mais rápida de passar pela sala...");
            System.out.println("3 - Correndo! não quero nem ver o que tem ali dentro....");
            option = Keyboard.scanInteger();
            switch (option) {
                case 1 -> {
                    System.out.println("""
                            Você toma cuidado e vai caminhando vagarosamente em direção à luz. Quando você
                            pisa exatamente embaixo da porta, você sente o chão ceder levemente, como se tivesse pisado
                            em uma pedra solta. Você ouve um ruído de mecanismos se movimentando, e uma escotilha se
                            abre no teto atrás de você, no corredor. Flechas voam da escotilha em sua direção, e você salta
                            para dentro da sala, porém uma delas te acerta na perna.""");
                    Keyboard.pressEnterToContinue();
                    Combat.scenarioAttack(this.hero);
                    System.out.println("Você tem " + this.hero.getLifePoints() + " pontos de vida restantes... ");
                    Keyboard.pressEnterToContinue();
                }
                case 2 -> {
                    System.out.println("Você se concentra e pula em direção à luz, saltando de antes da porta até o interior\n" +
                            "da sala.");
                    Keyboard.pressEnterToContinue();
                }
                case 3 -> {
                    System.out.println("""
                            Você respira fundo e desata a correr em direção à sala. Quando passa pela porta,
                            sente que pisou em uma pedra solta, mas não dá muita importância e segue para dentro da sala,
                            olhando ao redor à procura de inimigos. Não tem ninguém, mas você ouve sons de flechas
                            batendo na pedra atrás de você, e quando se vira, vê várias flechas no chão. Espiando pela porta,
                            você entende que pisou em uma armadilha que soltou flechas de uma escotilha aberta no teto,
                            mas por sorte você entrou correndo e conseguiu escapar desse ataque surpresa.""");
                    Keyboard.pressEnterToContinue();
                }
                default -> {
                    System.out.println("Seja forte! você precisa tomar uma decisão....");
                    continue;
                }
            }
            done = true;
        }
        System.out.println("""
                Você se encontra sozinho em uma sala quadrada, contendo uma porta em cada parede. Uma
                delas foi aquela pela qual você entrou, que estava aberta, e as outras três estão fechadas. A
                porta à sua frente é a maior das quatro, com inscrições em seu entorno em uma língua que você
                não sabe ler, mas reconhece como sendo a língua antiga utilizada pelo inimigo. Você se aproxima
                da porta e percebe que ela está trancada por duas fechaduras douradas, e você entende que
                precisará primeiro derrotar o que estiver nas outras duas portas laterais, antes de conseguir
                enfrentar o líder.""");
        Keyboard.pressEnterToContinue();

        System.out.println("Você se dirige para a porta à direita.");
        Keyboard.pressEnterToContinue();


        System.out.println("""
                Você se aproxima, tentando ouvir o que acontece porta adentro, mas não
                escuta nada. Segura com mais força sua arma com uma mão, enquanto empurra a porta com a
                outra. Ao entrar, você se depara com uma sala espaçosa, com vários equipamentos de batalha
                pendurados nas paredes e dispostos em armários e mesas. Você imagina que este seja o arsenal
                do inimigo, onde estão guardados os equipamentos que seus soldados utilizam quando saem
                para espalhar o terror nas cidades e vilas da região.""");
        Keyboard.pressEnterToContinue();

        System.out.println("""
                Enquanto seu olhar percorre a sala, você ouve a porta se fechando e gira rapidamente para olhar
                para trás. Ali, de pé entre você e a porta fechada, bloqueando o caminho do seu destino, está um
                dos capitães do inimigo. Um orque horrendo, de armadura, capacete e espada em punho, em
                posição de combate. Ele avança em sua direção....""");
        Keyboard.pressEnterToContinue();


        Combat warOrcFight = new Combat(this.hero, warOrc, this.difficulty);
        warOrcFight.villainAttack(DiceRoll.roll());
        warOrcFight.battle();

        System.out.println("\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
        System.out.println("Após derrotar o Armeiro, você percebe que seus equipamentos estão muito danificados, e olha\n" +
                "em volta, encarando todas aquelas peças de armaduras resistentes e em ótimo estado.");
        System.out.println("Pegar equipamentos? ");
        done = false;
        while (!done) {
            System.out.println("1 - Sim!");
            System.out.println("2 - Não acho uma boa ideia...");
            option = Keyboard.scanInteger();
            switch (option) {
                case 1 -> {
                    System.out.println("""
                            Você resolve usar os equipamentos do
                            inimigo contra ele, e trocar algumas peças suas, que estavam danificadas, pelas peças de
                            armaduras existentes na sala. De armadura nova, você se sente mais protegido para os desafios
                            à sua frente.""");
                    System.out.println();
                    this.hero.setDefensePoints(this.hero.getDefensePoints() + 5);
                    System.out.println("Você ganhou +5 pontos de armadura, e agora sua defesa é de: " + this.hero.getDefensePoints());
                    Keyboard.pressEnterToContinue();
                }
                case 2 -> {
                    System.out.println("Você decide que não precisa utilizar\n" +
                            "nada que venha das mãos do inimigo.”");
                    Keyboard.pressEnterToContinue();
                }
                default -> {
                    System.out.println("Seja forte! você precisa tomar uma decisão....");
                    Keyboard.pressEnterToContinue();
                    continue;
                }
            }
            done = true;
        }
        System.out.println("""
                Em uma mesa, você encontra uma chave dourada, e sabe que aquela chave abre uma das
                fechaduras da porta do líder inimigo. Você pega a chave e guarda numa pequena bolsa que leva
                presa ao cinto.""");
        Keyboard.pressEnterToContinue();

        System.out.println("""
                Você retorna à sala anterior e se dirige à porta da esquerda. Você se
                aproxima, tentando ouvir o que acontece porta adentro, mas não escuta nada. Segura com mais
                força sua arma com uma mão, enquanto empurra a porta com a outra. Ao entrar, você se depara
                com uma sala parecida com a do arsenal, mas em vez de armaduras, existem vários potes e
                garrafas de vidro com conteúdos misteriosos e de cores diversas, e você entende que o capitão
                que vive ali, realiza experimentos com diversos ingredientes, criando poções utilizadas pelos
                soldados para aterrorizar a região.""");
        Keyboard.pressEnterToContinue();

        System.out.println("No fundo da sala, olhando em sua direção, está outro dos capitães do inimigo. Um orque\n" +
                "horrendo, de armadura, cajado em punho, em posição de combate. Ele avança em sua direção.");
        Keyboard.pressEnterToContinue();


        Combat scientstOrcFight = new Combat(this.hero, scientistOrc, this.difficulty);
        scientstOrcFight.villainAttack(DiceRoll.roll());
        scientstOrcFight.battle();

        System.out.println("\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
        System.out.println("""
                Após derrotar o Alquimista, você olha em volta, tentando reconhecer alguma poção do estoque
                do inimigo. Em uma mesa, você reconhece uma pequena garrafa de vidro contendo um líquido
                levemente rosado, pega a garrafa e pondera se deve beber um gole.""");
        System.out.println();
        System.out.println("Beber?");

        done = false;
        while (!done) {
            System.out.println("1 - Beber!");
            System.out.println("2 - Não quero arriscar....");
            option = Keyboard.scanInteger();
            switch (option) {
                case 1 -> {
                    if (this.hero.getLifePoints() > this.hero.getCharClass().getLifePoints()) {
                        System.out.println("Os seus pontos de vida são maior do que quando começou, deseja guardar esta poção para mais tarde?");
                        System.out.println("1 - Sim");
                        System.out.println("2 - Não");

                        Integer choice = Keyboard.scanInteger();
                        if (choice == 1) {
                            this.hero.setItems();
                            System.out.println("Você aproveitou e repôs seus items");
                            Keyboard.pressEnterToContinue();
                            break;
                        }
                    }
                    System.out.println("Você se sente revigorado para seguir adiante!");
                    System.out.println();
                    System.out.println("Seus pontos de vida foram recuperados!");
                    Keyboard.pressEnterToContinue();
                }
                case 2 -> {
                    System.out.println("Você fica receoso de beber algo produzido pelo inimigo");
                    Keyboard.pressEnterToContinue();
                }
                default -> {
                    System.out.println("Seja forte! você precisa tomar uma decisão....");
                    Keyboard.pressEnterToContinue();
                    continue;
                }
            }
            done = true;
        }
        System.out.println("""
                Ao lado da porta, você vê uma chave dourada em cima de uma mesa, e sabe que aquela chave
                abre a outra fechadura da porta do líder inimigo. Você pega a chave e guarda na pequena bolsa
                que leva presa ao cinto.""");
        Keyboard.pressEnterToContinue();

        System.out.println("""
                De volta à sala das portas, você se dirige à porta final. Coloca as chaves nas fechaduras, e a
                porta se abre. Seu coração acelera, memórias de toda a sua vida passam pela sua mente, e você
                percebe que está muito próximo do seu objetivo final. Segura sua arma com mais firmeza, foca
                no combate que você sabe que irá se seguir, e adentra a porta.""");
        Keyboard.pressEnterToContinue();

        System.out.println("Lá dentro, você vê o líder sentado em uma poltrona dourada, com duas fogueiras de cada lado, e\n" +
                "prisioneiros acorrentados às paredes.");
        Keyboard.pressEnterToContinue();

        System.out.println("Ele percebe sua chegada e se levanta com um salto, apanhando seu machado de guerra de\n" +
                "lâmina dupla.");

        System.out.println("1 - Tomar iniciativa e atacar!");
        System.out.println("2 - Esperar ele agir....");
        Combat bossFight = new Combat(this.hero, boss, this.difficulty);
        option = Keyboard.scanInteger();

        if (option != 1) {
            System.out.println("Você demorou demias e o inimigo foi mais rápido!");
            bossFight.villainAttack(DiceRoll.roll());
        }
        bossFight.battle();

        System.out.println("Você conseguiu...");
        Keyboard.pressEnterToContinue();
        switch (this.hero.getPath()) {
            case GLORY -> {
                System.out.println("""
                        Você obteve sua vingança. Você se ajoelha e cai no choro, invadido por uma
                        sensação de alívio e felicidade. Você se vingou, tudo que sempre quis, está feito. Agora você
                        pode seguir sua vida.""");
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
