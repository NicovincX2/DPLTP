# DPLTP

From [Design Patterns: Tête la Première](http://bliaudet.free.fr/IMG/pdf/DPTLP.pdf)

La seule et l'unique constante du développement: le changement.

## Base de l'OO

 - Abstraction,
 - Encapsulation,
 - Polymorphisme, _ou comment organiser les classes_
 - Héritage, _une sorte de conception par contrat_

## Principes OO

 - **Encapsulez** ce qui varie,
    - Identifiez les aspects de votre application qui varient et séparez-les de ceux qui demeurent constants. 
    - Extraire les parties variables et les encapsuler vous permettra plus tard de les modifier ou de les augmenter sans affecter celles qui ne varient pas.
 - Préférez la composition à l'héritage,
    - Non seulement cela vous permet d’encapsuler une famille d’algorithmes dans leur propre ensemble de classes, mais vous pouvez également modifier le comportement au moment de l’exécution tant que l’objet avec lequel vous composez implémente la bonne interface comportementale.
 - Programmez des interfaces, non des implémentations,
 - Efforcez-vous de coupler faiblement les objets qui interagissent,
    - Les conceptions faiblement couplées nous permettent de construire des systèmes OO souples, capables de faire face aux changements parce qu’ils minimisent l’interdépendance entre les objets.
 - Les classes doivent être ouvertes à l’extension, mais fermées à la modification.
 - **Inversion des dépendances** Dépendez d’abstractions. Ne dépendez pas de classes concrètes.
    - Il suggère que nos composants de haut niveau ne doivent pas dépendre des composants de bas niveau, mais que les deux doivent dépendre d’abstractions.
    - _Aucune variable ne doit contenir une référence à une classe concrète_. (Pas de `new` !!)
    - _Aucune classe ne doit dériver d’une classe concrète_.
    - _Aucune classe ne doit redéfinir une méthode implémentée dans une classe de base._

## Patterns OO

 - _Stratégie_, définit une famille d’algorithmes, encapsule chacun d’eux et les rend interchangeables. Stratégie permet à l’algorithme de varier indépendamment des clients qui l’utilisent.
 - _Singleton_, garantit qu'une classe n'a qu'une seule instance et fournit un point d'accès de type global à cette instance,
 - _Observateur_, définit une relation entre objets de type un-à-plusieurs, de façon que, lorsque un objet change d’état, tous ceux qui en dépendent en soient notifiés et soient mis à jour automatiquement. Le pattern Observateur permet une conception dans laquelle le couplage entre sujets et observateurs est faible. Les éléments qui varient dans le pattern Observateur sont l’état du Sujet et le nombre et le type des Observateurs. Ce pattern vous permet de faire varier les objets qui dépendent de l’état du Sujet, sans devoir modifier de Sujet.
    - **Le sujet ne sait qu’une chose à propos de l’observateur : il implémente une certaine interface** (l’interface Observateur). Il n’a pas besoin de connaître, ni la classe concrète de l’observateur, ni ce qu’il fait ni quoi que ce soit d’autre. 
    - **Nous pouvons ajouter des observateurs à tout moment.** Comme le sujet dépend uniquement d’une liste d’objets qui implémentent l’interface Observateur, nous pouvons ajouter des observateurs à volonté. En fait, nous pouvons remplacer n’importe quel observateur par un autre au moment de l’exécution : le sujet continuera à ronronner comme si de rien n’était. De même, nous pouvons supprimer des observateurs n’importe quand. 
    - **Nous n’avons jamais besoin de modifier le sujet pour ajouter de nouveaux types d’observateurs.** Disons que se présente une nouvelle classe concrète qui a besoin d’être un observateur. Nous n’avons pas besoin d’ajouter quoi que ce soit au sujet pour gérer ce nouveau type. Il suffit d’implémenter l’interface Observateur dans la nouvelle classe et de l’enregistrer en tant qu’observateur. Le sujet ne s’en soucie aucunement : il continuera à diffuser des notifications à tous les objets qui implémentent l’interface Observateur.
    - **Nous pouvons réutiliser les objets et les sujets indépendamment les uns des autres.** Si nous avons un autre emploi d’un sujet ou d’un observateur, nous pouvons les réutiliser sans problème parce qu’ils sont faiblement couplés.
    - **Les modifications des sujets n’affectent pas les observateurs et inversement.** Comme ils sont faiblement couplés, nous sommes libres de les modifier à notre guise tant que les objets continuent à remplir leurs obligations : implémenter les interfaces.
 - _Décorateur_, attache dynamiquement des responsabilités supplémentaires à un objet. Il fournit une alternative souple à la dérivation, pour étendre les fonctionnalités.
    - Les décorateurs ont le **même supertype que les objets qu’ils décorent**. Nous pouvons donc transmettre un objet décoré à la place de l’objet original (enveloppé).
    - Le décorateur ajoute son propre comportement soit avant soit après avoir délégué le reste du travail à l’objet qu’il décore.
    - Les objets pouvant être décorés à tout moment, nous pouvons les décorer dynamiquement au moment de l’exécution avec autant de décorateurs que nous en avons envie.
 - _Fabrique_,  définit une interface pour la création d’un objet, mais en laissant aux sous-classes le choix des classes à instancier. Fabrication permet à une classe de déléguer l’instanciation à des sous-classes.
    - Le Créateur est une classe qui contient les implémentations de toutes les méthodes destinées à manipuler les produits, excepté la méthode de fabrication. La méthode abstraite fabrication() est celle que toutes les sous-classes du Créateur doivent implémenter.
    - Le CréateurConcret implémente la méthode fabrication(), la méthode qui crée réellement les produits.
    - Le CréateurConcret a la responsabilité de créer un ou plusieurs produits concrets. C’est la seule classe qui sache comment créer ces produits.
    - Tous les produits doivent implémenter la même interface, pour que les classes qui utilisent les produits puissent se référer à l’interface, non à la classe concrète.

## Applications

### SuperCanard

Application du pattern **Stratégie**.

Pensez chaque ensemble de comportements comme une famille d'algorithmes. Le client utilise une famille d'algorithmes encapsulée pour voler et cancaner.

### MeteoExpress

Application du pattern **Observateur**.

### MeteoExpressOO

Application du pattern **Observateur** avec la classe _Observable_ et l'interface _Observer_.

Dans `java.util.Observable`, la méthode `notifyObservers()` est implémentée de telle façon que les observateurs sont notifiés dans un autre ordre que dans votre propre implémentation. Qui a raison ?`Ni l’un ni l’autre ; nous avons simplement choisi de procéder différemment. Ce qui serait incorrect, en revanche, ce serait d’écrire un programme qui dépende d’une ordre de notification spécifique. Pourquoi ? Parce que si vous devez modifier les implémentations d’Observable/Observer, cet ordre pourrait changer et votre application produirait des résultats erronés. Ce n’est pas précisément ce que l’on considère comme un couplage faible.

---

Malheureusement, l’implémentation de `java.util.Observable` présente un certain nombre de problèmes qui limitent son utilité et ses possibilités de réutilisation.

Tout d’abord, comme _Observable_ est une classe, vous devez la sous-classer. Autrement dit, vous ne pouvez pas ajouter le comportement d’Observable à une classe existante qui étend déjà une autre superclasse. Cela limite son potentiel de réutilisation (la principale raison a priori pour laquelle nous utilisons des patterns).

Deuxièmement, comme il n’y a pas d’interface _Observable_, vous ne pouvez même pas créer vous-même une implémentation qui fonctionne correctement avec l’API Observer Java intégrée. Pas plus que vous ne pouvez remplacer l’implémentation de `java.util` par une autre (par exemple une nouvelle implémentation multithread).

Si vous observez l’API Observable, vous constatez que la méthode `setChanged()` est protégée. Et alors ? Eh bien, cela signifie que vous ne pouvez pas appeler `setChanged()` tant que vous n’avez pas sous-classé Observable. Autrement dit, vous ne pouvez même pas créer une instance de la classe Observable et composer avec vos propres objets : vous êtes obligé de sous-classer. Cette façon de procéder viole un deuxième principe de conception... préférer la composition à l’héritage.

### MeteoExpressPCL

Application du pattern **Observateur** avec `java.beans.PropertyChangeListener` et `java.beans.PropertyChangeSupport`.

Attention. `PropertyChangeSupport.firePropertyChange` ne change que si la valeur de l'attribut est modifiée. On utilise un test avant l'appel de cette fonction pour passer outre. Il pourrait être amélioré avec un objet `Float` auquel l'on pourrait donner la valeur `null`.

L'affichage se fait maintenant dans le `main`.

On peut se passer de l'attribut `DonneesMeteo donneesMeteo` dans les classes Affichage.

### StarbuzzCoffee

Application du pattern **Décorateur**.