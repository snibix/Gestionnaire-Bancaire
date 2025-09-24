# Mini Gestionnaire Bancaire

## 📌 Concept
Une application console en Java pour gérer plusieurs comptes bancaires.  
Elle permet de créer des clients, gérer leurs comptes, effectuer des transactions et consulter l’historique des opérations.

---

## 🛠 Classes principales

### `model/`
- **Client** : nom, email, liste de comptes
- **Compte** : numéro de compte, solde, historique des transactions
- **Transaction** : type (dépôt/retrait), montant, date

### `service/`
- **BankService** : 
  - Ajouter un client
  - Créer un compte
  - Dépôt, retrait, transfert
  - Vérifier le solde
  - Lister comptes et historique des transactions

---

## ⚙ Fonctionnalités

- Créer des comptes et ajouter des clients
- Dépôt et retrait
- Transfert entre comptes
- Afficher le solde et l’historique des transactions
- Vérification du solde avant toute opération

---




