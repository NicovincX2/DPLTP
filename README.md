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

## Patterns OO

 - _Stratégie_, définit une famille d’algorithmes, encapsule chacun d’eux et les rend interchangeables. Stratégie permet à l’algorithme de varier indépendamment des clients qui l’utilisent.
 - _Singleton_, garantit qu'une classe n'a qu'une seule instance et fournit un point d'accès de type global à cette instance,
 - _Observateur_, définit une relation entre objets de type un-à-plusieurs, de façon que, lorsque un objet change d’état, tous ceux qui en dépendent en soient notifiés et soient mis à jour automatiquement. Le pattern Observateur permet une conception dans laquelle le couplage entre sujets et observateurs est faible.
    - **Le sujet ne sait qu’une chose à propos de l’observateur : il implémente une certaine interface** (l’interface Observateur). Il n’a pas besoin de connaître, ni la classe concrète de l’observateur, ni ce qu’il fait ni quoi que ce soit d’autre. 
    - **Nous pouvons ajouter des observateurs à tout moment.** Comme le sujet dépend uniquement d’une liste d’objets qui implémentent l’interface Observateur, nous pouvons ajouter des observateurs à volonté. En fait, nous pouvons remplacer n’importe quel observateur par un autre au moment de l’exécution : le sujet continuera à ronronner comme si de rien n’était. De même, nous pouvons supprimer des observateurs n’importe quand. 
    - **Nous n’avons jamais besoin de modifier le sujet pour ajouter de nouveaux types d’observateurs.** Disons que se présente une nouvelle classe concrète qui a besoin d’être un observateur. Nous n’avons pas besoin d’ajouter quoi que ce soit au sujet pour gérer ce nouveau type. Il suffit d’implémenter l’interface Observateur dans la nouvelle classe et de l’enregistrer en tant qu’observateur. Le sujet ne s’en soucie aucunement : il continuera à diffuser des notifications à tous les objets qui implémentent l’interface Observateur.
    - **Nous pouvons réutiliser les objets et les sujets indépendamment les uns des autres.** Si nous avons un autre emploi d’un sujet ou d’un observateur, nous pouvons les réutiliser sans problème parce qu’ils sont faiblement couplés.
    - **Les modifications des sujets n’affectent pas les observateurs et inversement.** Comme ils sont faiblement couplés, nous sommes libres de les modifier à notre guise tant que les objets continuent à remplir leurs obligations : implémenter les interfaces.

## Applications

### SuperCanard

Application du pattern **Stratégie**.

Pensez chaque ensemble de comportements comme une famille d'algorithmes. Le client utilise une famille d'algorithmes encapsulée pour voler et cancaner.