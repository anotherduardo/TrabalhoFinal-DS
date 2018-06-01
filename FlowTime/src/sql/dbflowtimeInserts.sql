


/* ---------------------------------
TABELA DE PESQUISADORES
------------------------------------*/

INSERT INTO `tb_researcher`(`CD_RESEARCHER`, `NM_INST`, `RS_NAME`, `NM_NACIONAL`) VALUES (1,"AVALANCHE","Cloud Strife","Nibelheim");
INSERT INTO `tb_researcher`(`CD_RESEARCHER`, `NM_INST`, `RS_NAME`, `NM_NACIONAL`) VALUES (2,"AVALANCHE","Barret Wallace","Corel Mines");
INSERT INTO `tb_researcher`(`CD_RESEARCHER`, `NM_INST`, `RS_NAME`, `NM_NACIONAL`) VALUES (3,"AVALANCHE","Tifa Lockhart","Midgar");
INSERT INTO `tb_researcher`(`CD_RESEARCHER`, `NM_INST`, `RS_NAME`, `NM_NACIONAL`) VALUES (4,"CRYSTAL ORTHODOXY","Agnes Oblige","Anchein");
INSERT INTO `tb_researcher`(`CD_RESEARCHER`, `NM_INST`, `RS_NAME`, `NM_NACIONAL`) VALUES (5,"CALDISLA","Tiz Warrior","Norende");
INSERT INTO `tb_researcher`(`CD_RESEARCHER`, `NM_INST`, `RS_NAME`, `NM_NACIONAL`) VALUES (6,"BAAL","Magnolia Arch","Moon");
INSERT INTO `tb_researcher`(`CD_RESEARCHER`, `NM_INST`, `RS_NAME`, `NM_NACIONAL`) VALUES (7,"DUTCHY","Alternis Din","Florem");
INSERT INTO `tb_researcher`(`CD_RESEARCHER`, `NM_INST`, `RS_NAME`, `NM_NACIONAL`) VALUES (8,"SHEIKAH","Zelda of Hyrule","Hyrule");
INSERT INTO `tb_researcher`(`CD_RESEARCHER`, `NM_INST`, `RS_NAME`, `NM_NACIONAL`) VALUES (9,"SHINRA","Sephiroth","Nibelheim");
INSERT INTO `tb_researcher`(`CD_RESEARCHER`, `NM_INST`, `RS_NAME`, `NM_NACIONAL`) VALUES (10,"DUTCHY","Edea Lee","Eternia");

/* ---------------------------------
TABELA DE ARTIGOS
------------------------------------*/

INSERT INTO `tb_article`(`CD_ARTICLE`, `DT_DATE`, `COD_DOI`, `NM_PUBLISHER`, `TL_ARTICLE`) VALUES (1,'2008-7-04',"NOT DOI","ELSEVIER","Genetic Algorithm: New operators");
INSERT INTO `tb_article`(`CD_ARTICLE`, `DT_DATE`, `COD_DOI`, `NM_PUBLISHER`, `TL_ARTICLE`) VALUES (2,'2008-7-04',"NOT DOI","IEEE","Ant Colony");
INSERT INTO `tb_article`(`CD_ARTICLE`, `DT_DATE`, `COD_DOI`, `NM_PUBLISHER`, `TL_ARTICLE`) VALUES (3,'2008-7-04',"NOT DOI","ELSEVIER","Bat Otimization");
INSERT INTO `tb_article`(`CD_ARTICLE`, `DT_DATE`, `COD_DOI`, `NM_PUBLISHER`, `TL_ARTICLE`) VALUES (4,'2008-7-04',"NOT DOI","IEEE","NSGA II");
INSERT INTO `tb_article`(`CD_ARTICLE`, `DT_DATE`, `COD_DOI`, `NM_PUBLISHER`, `TL_ARTICLE`) VALUES (5,'2008-7-04',"NOT DOI","IEEE","NSGA III");
INSERT INTO `tb_article`(`CD_ARTICLE`, `DT_DATE`, `COD_DOI`, `NM_PUBLISHER`, `TL_ARTICLE`) VALUES (6,'2008-7-04',"NOT DOI","ACM","Memetic Techniques");
INSERT INTO `tb_article`(`CD_ARTICLE`, `DT_DATE`, `COD_DOI`, `NM_PUBLISHER`, `TL_ARTICLE`) VALUES (7,'2008-7-04',"NOT DOI","ACM","Energy aware Survey");
INSERT INTO `tb_article`(`CD_ARTICLE`, `DT_DATE`, `COD_DOI`, `NM_PUBLISHER`, `TL_ARTICLE`) VALUES (8,'2008-7-04',"NOT DOI","ELSEVIER","Evolutionary Techines Survey");
INSERT INTO `tb_article`(`CD_ARTICLE`, `DT_DATE`, `COD_DOI`, `NM_PUBLISHER`, `TL_ARTICLE`) VALUES (9,'2008-7-04',"NOT DOI","ELSEVIER","Cellular Automata applied on games");
INSERT INTO `tb_article`(`CD_ARTICLE`, `DT_DATE`, `COD_DOI`, `NM_PUBLISHER`, `TL_ARTICLE`) VALUES (10,'2008-7-04',"NOT DOI","ACM","Deep Learning");
INSERT INTO `tb_article`(`CD_ARTICLE`, `DT_DATE`, `COD_DOI`, `NM_PUBLISHER`, `TL_ARTICLE`) VALUES (11,'2008-7-04',"NOT DOI","IEEE","ACs on Criptography");

/* ---------------------------------
TABELA DE CONQUISTAS ACAD�MICAS
------------------------------------*/

INSERT INTO `tb_achievements`(`CD_ACHIEVEMENT`, `DESC_ACHIEVEMENT`, `LV_IMPACT`, `CD_REFPAPER`) VALUES (1,"Criacao de novos operadores",5,1);
INSERT INTO `tb_achievements`(`CD_ACHIEVEMENT`, `DESC_ACHIEVEMENT`, `LV_IMPACT`, `CD_REFPAPER`) VALUES (2,"Padronizacao dos operadores antigos",4,1);
INSERT INTO `tb_achievements`(`CD_ACHIEVEMENT`, `DESC_ACHIEVEMENT`, `LV_IMPACT`, `CD_REFPAPER`) VALUES (3,"Nova T�cnica evolutiva para problemas de otimizacao",5,2);
INSERT INTO `tb_achievements`(`CD_ACHIEVEMENT`, `DESC_ACHIEVEMENT`, `LV_IMPACT`, `CD_REFPAPER`) VALUES (4,"Nova meta-heuristica",5,3);
INSERT INTO `tb_achievements`(`CD_ACHIEVEMENT`, `DESC_ACHIEVEMENT`, `LV_IMPACT`, `CD_REFPAPER`) VALUES (5,"Algoritmo Evolutivo Multi Objetive",5,4);
INSERT INTO `tb_achievements`(`CD_ACHIEVEMENT`, `DESC_ACHIEVEMENT`, `LV_IMPACT`, `CD_REFPAPER`) VALUES (6,"Algoritmo Evolutivo Manny Objetive",5,5);
INSERT INTO `tb_achievements`(`CD_ACHIEVEMENT`, `DESC_ACHIEVEMENT`, `LV_IMPACT`, `CD_REFPAPER`) VALUES (7,"Combinacoes Hibridas de Algoritmos Evolutivos",5,6);
INSERT INTO `tb_achievements`(`CD_ACHIEVEMENT`, `DESC_ACHIEVEMENT`, `LV_IMPACT`, `CD_REFPAPER`) VALUES (8,"IA aplicado em cenarios verdes",5,7);
INSERT INTO `tb_achievements`(`CD_ACHIEVEMENT`, `DESC_ACHIEVEMENT`, `LV_IMPACT`, `CD_REFPAPER`) VALUES (9,"Taxonomia de Tecnicas Evolutivas",3,8);
INSERT INTO `tb_achievements`(`CD_ACHIEVEMENT`, `DESC_ACHIEVEMENT`, `LV_IMPACT`, `CD_REFPAPER`) VALUES (10,"Aplicacao de ACs em jogos inteligentes",5,9);
INSERT INTO `tb_achievements`(`CD_ACHIEVEMENT`, `DESC_ACHIEVEMENT`, `LV_IMPACT`, `CD_REFPAPER`) VALUES (11,"Expansao do uso das redes neurais",5,10);

/* ---------------------------------
TABELA COM RELA��O ENTRE PESQUISADORES E ARTIGOS
------------------------------------*/

INSERT INTO `tb_researcher_papers`(`CD_RESEARCHER`, `CD_ARTICLE`) VALUES (1,1);
INSERT INTO `tb_researcher_papers`(`CD_RESEARCHER`, `CD_ARTICLE`) VALUES (2,1);
INSERT INTO `tb_researcher_papers`(`CD_RESEARCHER`, `CD_ARTICLE`) VALUES (3,2);
INSERT INTO `tb_researcher_papers`(`CD_RESEARCHER`, `CD_ARTICLE`) VALUES (4,3);
INSERT INTO `tb_researcher_papers`(`CD_RESEARCHER`, `CD_ARTICLE`) VALUES (5,4);
INSERT INTO `tb_researcher_papers`(`CD_RESEARCHER`, `CD_ARTICLE`) VALUES (6,5);
INSERT INTO `tb_researcher_papers`(`CD_RESEARCHER`, `CD_ARTICLE`) VALUES (7,6);
INSERT INTO `tb_researcher_papers`(`CD_RESEARCHER`, `CD_ARTICLE`) VALUES (8,7);
INSERT INTO `tb_researcher_papers`(`CD_RESEARCHER`, `CD_ARTICLE`) VALUES (9,8);
INSERT INTO `tb_researcher_papers`(`CD_RESEARCHER`, `CD_ARTICLE`) VALUES (10,9);
INSERT INTO `tb_researcher_papers`(`CD_RESEARCHER`, `CD_ARTICLE`) VALUES (10,10);


