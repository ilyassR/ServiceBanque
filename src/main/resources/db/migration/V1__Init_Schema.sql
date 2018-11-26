--
-- Base de données :  `service_banque_db`
--

-- --------------------------------------------------------

--
-- Structure de la table `clients`
--

DROP TABLE IF EXISTS `clients`;
CREATE TABLE IF NOT EXISTS `clients` (
  `code_cli` bigint(20) NOT NULL,
  `nom_cli` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`code_cli`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Structure de la table `compte`
--

DROP TABLE IF EXISTS `compte`;
CREATE TABLE IF NOT EXISTS `compte` (
  `type_compte` varchar(2) COLLATE utf8_unicode_ci NOT NULL,
  `num_compte` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `date_creation` datetime DEFAULT NULL,
  `solde` double NOT NULL,
  `decouvert` double DEFAULT NULL,
  `taux` double DEFAULT NULL,
  `code_cli` bigint(20) DEFAULT NULL,
  `num_emp` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`num_compte`),
  KEY `FKa8l2at3oxclvmce52td0vsabn` (`code_cli`),
  KEY `FKmfg6ym6dftlsml0vysje51ixi` (`num_emp`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Structure de la table `employe`
--

DROP TABLE IF EXISTS `employe`;
CREATE TABLE IF NOT EXISTS `employe` (
  `code_employe` bigint(20) NOT NULL,
  `nom_employe` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `salaire` double NOT NULL,
  PRIMARY KEY (`code_employe`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Structure de la table `emp_groupes`
--

DROP TABLE IF EXISTS `emp_groupes`;
CREATE TABLE IF NOT EXISTS `emp_groupes` (
  `num_emp` bigint(20) NOT NULL,
  `num_groupe` bigint(20) NOT NULL,
  KEY `FKg68vp1gy7u35brekp2voxadau` (`num_groupe`),
  KEY `FKllj14o4ne5u9xrr2rixounm38` (`num_emp`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Structure de la table `groupe`
--

DROP TABLE IF EXISTS `groupe`;
CREATE TABLE IF NOT EXISTS `groupe` (
  `num_groupe` bigint(20) NOT NULL,
  `nom_groupe` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`num_groupe`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Structure de la table `hibernate_sequence`
--

DROP TABLE IF EXISTS `hibernate_sequence`;
CREATE TABLE IF NOT EXISTS `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Déchargement des données de la table `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(1),
(1),
(1),
(1),
(1);

-- --------------------------------------------------------

--
-- Structure de la table `num_emp_sup`
--

DROP TABLE IF EXISTS `num_emp_sup`;
CREATE TABLE IF NOT EXISTS `num_emp_sup` (
  `sup_hierarchique_code_employe` bigint(20) DEFAULT NULL,
  `code_employe` bigint(20) NOT NULL,
  PRIMARY KEY (`code_employe`),
  KEY `FK9trtc6222oj227nafe9glf0ff` (`sup_hierarchique_code_employe`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Structure de la table `operation`
--

DROP TABLE IF EXISTS `operation`;
CREATE TABLE IF NOT EXISTS `operation` (
  `type_op` varchar(1) COLLATE utf8_unicode_ci NOT NULL,
  `num_operation` bigint(20) NOT NULL,
  `date_operation` datetime DEFAULT NULL,
  `montant` double NOT NULL,
  `num_cpte` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `num_emp` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`num_operation`),
  KEY `FK9jt166qhsp6om2sa8e1unlxax` (`num_cpte`),
  KEY `FKb3gkrja2vm8nywbgi8x64g7oi` (`num_emp`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
COMMIT;