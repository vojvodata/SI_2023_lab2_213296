# SI_2023_lab2_213296

Дионис Минев 213296

2. Control Flow Graph-от го цртав со помош на онлајн алатката diagrams.net.
   Првиот јазел ми го содржи првиот if statement и почетокот на функцијата.
   5-тиот јазел содржи иницијализацијата на same = 1 и if-statement-от.
   8-миот јазел ми содржи User existingUser = allUsers.get(i); и if-от што следува.
   12-тиот јазел ми ги содржи String-овите бидејќи се извршуваат секако и плус if-statement-от.
   ![cfg](https://res.cloudinary.com/dxwujkowj/image/upload/v1685098319/CFG_gm0r9e.jpg)

3. Цикломатската комплексност на дадената функција е 11. Вредноста 11 се добива на 3 начини. Едниот начин е со броење на регионите на графот.
   Следниот начин е со броење на for циклусите и if statements и додаваме 1, додека третиот начин е кога бројот на гранки ќе ги одземеме од 
   бројот на јазли и додаваме 2. 32-23+2 = 11.

4. Прво тестирав со user==null за да го обележам делот со exception. Следно тестирање ми беше со изминување на првиот for loop и неговите 
   if statements, така што при секое изминување да имам по некој if statement true и false. Трето тестирање ми беше лозинката да има спец. 
   карактер со што изминував низ вториот циклус. Потоа тестирав со тоа во лозинката да имам празно место(space) па го скокам вториот 
   циклус и одам на предпоследната линија и се враќа false. Крајно тестирав да нема празно место во лозинката и да нема специјален карактер. 
   https://res.cloudinary.com/dxwujkowj/raw/upload/v1685105326/si_lab_baranje_4_i_5_kwqyzs.ods

5. Првично само user ни е null, следно имаме user да не е null а password да е null, потоа имаме user не е null и password не е null
   но email е null и крајно имаме ниту едно да е null и не фрла exception, додека во другите случаи фрла nullPointerException.
