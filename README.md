# AulasPCII

Repositorio pra abrigar os códigos das aulas de PCII

Projeto específico para aulas de PC2. 
Alunos, como a gente ainda tá no basicão esse projeto não se preocupa ainda com padrões de projeto nem utiliza as necessárias boas práticas. Mas pra começar dá pra gente estudar um pouco.
Em sala de aula a gente conversa sobre ele.


O Jeferson preparou essa aula de EGit, que é usar o github sem precisar sair do Eclipse e ter que ir no diretório do projeto e dar aqueles comandos do git na mão.

Pra quem vai contiuar usando o gitportable segue os comandinhos que a gente usa em sala de aula


#git clone <url_do_seu_repositorio>
Esse comando pega o seu repositório que está no github e cria uma pasta pra ele no seu disco rígido. A partir de então, pra trabalhar no seu projeto você trabalha nessa pasta que o git clone criou pra vc.

#git status
Com o git status você vê o status dessa sua pasta.
Por exemplo. Incluiu alguma coisa nessa pasta e dá um git status, o que você inseriu aparece como "untracked" ou seja, o o controle da pasta percebeu que você colocou alguma coisa lá mas não tá fazendo o controle disso pra efeitos do github. 
Mas se você incluiu foi um código ou algo relativo ao projeto, óbvio que você vai querer que o git controle isso pra que você isso esteja incluso no no próximo git push pro github. 
Então pra você indicar que o git deve controler o que você incluiu você precisar dar um git add <arquivo_ou_pasta_que_vc_incluiu_no_projeto>
Depois que você deu um git add você adicionou ao controle e dando um git status de novo o controle da pasta vai indicar que isso que você incluiu é um "new file". Ou seja, o git entende que tem coisa nova sendo controlada agora.
Diante disso não queira dar git push porque antes do git push tem que commitar, lembra?
Então dê um git commit -am "mensagem de commit"
Depois do commit aí sim, vc dá um git push.
Só mais um pequeno detalhe. Pode ser que o controle da pasta (o git) peça pra vc se identificar. Obviamente isso faz sentido porque se alguém está mechendo no projeto o git vai querer saber quem é não é? Então é só seguir a orientação dando aqueles comandos recomedados.

$ git config --global user.name "John Doe"
$ git config --global user.email johndoe@example.com

na dúvida pode mandar um email ou a gente conversa na sala de aula....
