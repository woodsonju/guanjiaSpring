<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>

<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>FAQ</title>
<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script
	src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" type="text/css" href="resources/css/faq.css" />
</head>

<body>
	<br>
	<section id="section8">

		<br> <br> <br>

		<div class="titre">
			<h1 align="center">Foire aux questions</h1>
		</div>

		<br> <br>

		<div class="container">

			<div>
				<h3>
					<b><u>Qui sont les Guanjias ?</u></b>
				</h3>
				<p
					class="align-middle justify-content-center row align-items-center">
					Les guanjias sont des coursiers indépendants connectés à notre
					plate-forme. Ce sont des particuliers avec du temps libre, leur
					propre véhicule et un smartphone, et qui s'appliquent au maximum
					afin de vous aider à résoudre vos besoins d'une manière rapide et
					efficace. Vous souhaitez devenir guanjias ? Super ! Il vous suffit
					de cliquer sur le lien "devenir coursier" au bas de la page
			</div>

			<br>

			<div>
				<h3>
					<b><u>Comment effectuer une commande ?</u></b>
				</h3>
				<p
					class="align-middle justify-content-center row align-items-center">Rien
					n'est plus simple que passer votre première commande avec Guanjia.
					Suivez simplement ces étapes: (1) Allez dans la section « Gérer les
					moyens de paiement » de votre profil et ajoutez une carte de crédit
					ou une carte bancaire. (2) Retournez sur l'écran principal et
					paramétrez l'adresse de livraison.Sélectionnez la bonne ville dans
					le menu déroulant. Vous avez ensuite 3 possibilités : (1) Acheter
					quelque chose dans un restaurant ou une boutique. Choisissez l'un
					de nos partenaires dans la catégorie de votre choix. (2) Envoyer
					quelque chose. En renseignant simplement un point de collecte et un
					point de livraison, vous pouvez envoyer n'importe quoi par
					coursier. Suivez les étapes nécessaires pour chaque option. Lorsque
					vous aurez fini, un coursier acceptera votre commande et vous la
					livrera en quelques minutes. Si vous souhaitez spécifier plus d'une
					adresse de livraison, vous devrez passer votre commande depuis
					notre site Internet, glovoapp.com.
			</div>

			<br>

			<div>
				<h3>
					<b><u>Quel est le coût de la livraison ?</u></b>
				</h3>
				<p
					class="align-middle justify-content-center row align-items-center">Le
					prix de notre service est optimisé par rapport à la distance. De
					cette façon, plus c'est près, moins c'est cher. Si vous demandez un
					service de type « Coursier », l'application calcule la distance
					entre le point de collecte et l'adresse de livraison et affiche le
					coût total de la livraison. Si vous commandez auprès d'une des
					boutiques disponibles dans l'application, vous connaîtrez le prix
					des produits à l'avance et vous verrez un prix de livraison
					pré-établi en fonction de nos accords avec la boutique en question
					que vous pouvez vérifier en cliquant sur la boutique. De cette
					manière, vous connaissez le prix total du service au moment où vous
					confirmez la commande. Il peut arriver occasionnellement que le
					prix du produit diffère de ce qui est affiché dans l'application.
					Si la différence de prix est inférieure à 30 %, Guanjia continuera
					automatiquement l'achat pour vous et la différence sera reportée en
					conséquence vers votre moyen de paiement. Cependant, si la
					différence de prix dépasse 30 %, le coursier vous contactera pour
					vous demander si vous souhaitez toujours continuer l'achat. (Pour
					les livraisons de nuit, un supplément de prix peut être a jouté à
					chaque produit. Les montants appliqués dépendent de la ville et de
					la boutique. Vous verrez cette surcharge au moment de régler vos
					achats dans l'application.)
			</div>

			<br>

			<div>
				<h3>
					<b><u>Guanjia est-il disponible dans mon quartier ?</u></b>
				</h3>
				<p
					class="align-middle justify-content-center row align-items-center">Guanjia
					est pour l'instant uniquement disponible sur Toulouse et sa
					banlieue. Vérifier les zones de couverture sur la carte :
					guanjiaapp.com/fr/map.
			</div>

			<br>

			<div>
				<h3>
					<b><u>Quelles sont les horaires d'ouverture de Guanjia ?</u></b>
				</h3>
				<p
					class="align-middle justify-content-center row align-items-center">Avec
					Guanjia, vous aurez un service 24h/24 et 7j/7. Cependant, toutes
					les boutiques ont leur planning et peuvent être fermées même si
					Gunajia est disponible. Pour vous guider, la photo des boutiques
					ouverte est en couleurs alors que celle des boutiques fermées
					s’affiche en gris.
			</div>

			<br>

			<div>
				<h3>
					<b><u>Comment programmer une commande et modifier des
							informations d'une commande programmée ?</u></b>
				</h3>
				<p
					class="align-middle justify-content-center row align-items-center">La
					planification des commandes n'a jamais été aussi simple ! Vous
					pouvez programmer votre commande et choisir l'heure de livraison.
					De cette manière, vous la recevrez au moment qui vous convient le
					mieux. Si vous souhaitez modifier les informations d'une commande
					déjà programmée ou que vous voulez simplement l'annuler, il faut
					aller dans votre commande et cliquer sur « Annuler la commande ».
					L'annulation n'est pas facturée. Après annulation de la commande,
					passez-en une nouvelle avec les produits que vous voulez et les
					informations de livraison.
			</div>

			<br>

			<div>
				<h3>
					<b><u>Que puis-je commander ?</u></b>
				</h3>
				<p
					class="align-middle justify-content-center row align-items-center">Confiez-nous
					l'achat de n'importe quel produit près de chez vous ou alors
					réaliser vos envois et commissions express en ville. Nous allons à
					la pharmacie pour vous, nous achetons votre paire de chaussures,
					nous vous livrons votre repas, nous transportons vos colis, nous
					récupérons vos clefs ? Tout ce que vous désirez ! On se charge de
					tout.
			</div>

			<br>

			<div>
				<h3>
					<b><u>Quelle est la taille maximale que mes commandes
							peuvent avoir ?</u></b>
				</h3>
				<p
					class="align-middle justify-content-center row align-items-center">Nos
					coursiers sont à vélo, ils peuvents transporter tout ce que vous
					voulez tant que votre objet ne pèse pas plus de 9 kg (équivalent à
					3 à 4 sacs à courses de volume) et qu'il tient dans une boîte de
					dimensions 40 x 40 x 30 cm.
			</div>

			<br>

			<div>
				<h3>
					<b><u>Comment modifier mes informations ? adresse,
							téléphone, email, mot de passe, moyen de paiement</u></b>
				</h3>
				<p
					class="align-middle justify-content-center row align-items-center">Vous
					pouvez modifier les informations associés à votre compte dans les
					informations de compte. Après la modification, vous recevrez un
					message de vérification. Le mot de passe sera modifié dès réception
					de la confirmation.
			</div>

			<br>

			<div>
				<h3>
					<b><u>Produits de commande manquante, incorrecte ou abimée</u></b>
				</h3>
				<p
					class="align-middle justify-content-center row align-items-center">Si
					vous avez reçu une commande incomplète, incorrecte ou abimée,
					rendez-vous sur votre profil dans l'application et cliquez sur
					"aide". Nous vous contacterons dès que possible pour vous proposer
					une solution.
			</div>

			<br>

			<div>
				<h3>
					<b><u>Je veux annuler ma commande. L'annulation est-elle
							facturée ?</u></b>
				</h3>
				<p
					class="align-middle justify-content-center row align-items-center">
					En cas d'annulation de votre part, des frais d'annulation peuvent
					être appliqués. Pour les commandes de produits alimentaires, le
					montant vous sera facturé en fonction des critères suivants. (1) Si
					la boutique avait déjà accepté votre commande et commencé à la
					préparer, le prix des produits vous sera facturé. (2) Si un
					coursier avait déjà été affecté à votre commande, un forfait
					annulation vous sera facturé. (3) Si la boutique avait déjà accepté
					votre commande et commencé à la préparer et qu'un coursier avait
					déjà été affecté pour la livrer, le prix des produits et le forfait
					annulation vous seront facturés. (4) Si le coursier atteint la zone
					de livraison et finalise la commande, le prix des produits et les
					frais de livraison vous seront facturés. Gardez à l'esprit que les
					commandes alimentaires ne peuvent pas être reprises. Pour les
					commandes non alimentaires, vous pouvez annuler une commande sans
					frais jusqu'à ce qu'un coursier accepte votre demande. Cependant,
					si vous annulez après qu'un coursier a été affecté à votre
					commande, le montant total du service de livraison de base vous
					sera facturé. Si le coursier avait déjà récupéré votre commande ou
					est en course lors de votre annulation, vous pouvez demander au
					coursier s'il peut retourner les produits. Dans ce cas, vous devrez
					tout de même régler le montant total des produits et des frais de
					livraison, ainsi que le coût du service de retour. Si le coursier
					est en mesure de retourner le produit, le montant du produit vous
					sera remboursé. Pour clarifier : le coût total du service de
					livraison vous sera facturé, y compris le prix des produits et le
					service de retour.
			</div>

			<br>

			<div
				class="align-middle justify-content-center row align-items-center">
				<h4>Si vous avez une autre question, n'hésitez pas à nous
					envoyer un email à : guanjia.service-client@gmail.com</h4>
			</div>

			<br>
		</div>

		<br> <br>



	</section>
	<br>
	<br>
	<br>
</body>
</html>