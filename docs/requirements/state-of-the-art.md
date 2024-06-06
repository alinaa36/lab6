# Аналіз предметної області

## Вступ

Цей документ містить аналіз основних аспектів систем управління відкритими даними. Він включає основні терміни, методи 
та підходи до вирішення завдань, а також порівняння існуючих інструментів для вирішення цих завдань. В документі 
представлені висновки та посилання на відповідні джерела. Крім того, в ньому демонструються вже існуючі системи з їх 
перевагами та недоліками, щоб мати поняття, як можна вдосконалити такі системи.

Зміст документу:
- [Основні визначення](#основні-визначення)
- [Підходи та способи вирішення завдання](#підходи-та-способи-вирішення-завдання)
- [Порівняльна характеристика існуючих засобів вирішення завдання](#порівняльна-характеристика-існуючих-засобів-вирішення-завдання)
- [Висновки](#висновки)
- [Посилання](#посилання)

## Основні визначення

[Відкриті дані](https://uk.wikipedia.org/wiki/%D0%92%D1%96%D0%B4%D0%BA%D1%80%D0%B8%D1%82%D1%96_%D0%B4%D0%B0%D0%BD%D1%96) -
це концепція, за якою певні дані мають бути вільними для використання та розповсюдження будь-якою особою з будь-якою 
метою.

[Стандарти відкритих даних](https://uk.wikipedia.org/wiki/%D0%9C%D1%96%D0%B6%D0%BD%D0%B0%D1%80%D0%BE%D0%B4%D0%BD%D0%B0_%D1%85%D0%B0%D1%80%D1%82%D1%96%D1%8F_%D0%B2%D1%96%D0%B4%D0%BA%D1%80%D0%B8%D1%82%D0%B8%D1%85_%D0%B4%D0%B0%D0%BD%D0%B8%D1%85) -
це набір правил, специфікацій та методів, які визначають формати, структури та принципи доступу до даних з метою їх відкритості, інтероперабельності та використання у широкому спектрі застосувань

[Open Data Portal](https://se.diia.gov.ua/en/opendata) -
це платформа, яка призначена для зберігання, публікації та розповсюдження відкритих даних. Портали зазвичай надають користувачам можливість шукати, переглядати, завантажувати та аналізувати набори даних, які були опубліковані відповідно до принципів відкритості

[База Даних](https://uk.wikipedia.org/wiki/%D0%91%D0%B0%D0%B7%D0%B0_%D0%B4%D0%B0%D0%BD%D0%B8%D1%85) -
це сукупність даних, організованих відповідно до концепції, яка описує характеристику цих даних і взаємозв'язки між їх елементами

[Система управління базами даних](https://uk.wikipedia.org/wiki/%D0%A1%D0%B8%D1%81%D1%82%D0%B5%D0%BC%D0%B0_%D0%BA%D0%B5%D1%80%D1%83%D0%B2%D0%B0%D0%BD%D0%BD%D1%8F_%D0%B1%D0%B0%D0%B7%D0%B0%D0%BC%D0%B8_%D0%B4%D0%B0%D0%BD%D0%B8%D1%85) -
це набір взаємопов'язаних даних і програм для доступу до цих даних. Надає можливості створення, збереження, 
оновлення та пошуку інформації в базах даних з контролем доступу до даних.

[Модель даних](https://uk.wikipedia.org/wiki/%D0%9C%D0%BE%D0%B4%D0%B5%D0%BB%D1%8C_%D0%B4%D0%B0%D0%BD%D0%B8%D1%85) -
це це абстрактне представлення, яке визначає, як дані будуть організовані, зберігатися, оброблятися та взаємодіяти між собою в рамках бази даних або інформаційної системи

[API(Application Programming Interface)](https://en.wikipedia.org/wiki/API) -
це набір правил, які дозволяють різним програмним компонентам взаємодіяти між собою. API визначає, які функції чи сервіси можуть бути використані, а також яким чином взаємодіяти з ними

[XML(Extensible Markup Language)](https://en.wikipedia.org/wiki/XML) -
це мова розмітки, яка використовується для представлення та обміну структурованими даними у текстовому форматі. XML створений для опрацювання документів як програмами, так і людиною, з акцентом на використання в Інтернеті

[SQL(Structured Query Language)](https://en.wikipedia.org/wiki/SQL) -
це декларативна мова програмування, яку застосовують для створення, модифікації та управління даними в реляційній базі даних, керованій відповідною системою управління базами даних.

[Хмарні технології](https://business.diia.gov.ua/cases/tehnologii/so-take-hmarni-tehnologii-i-ak-voni-mozut-dopomogti-vasomu-pidpriemstvu) -
це можливість використання обчислювальних ресурсів і пам’яті спільного пулу віддалених серверів

[Ролева модель доступу](https://en.wikipedia.org/wiki/Role-based_access_control) -
це модель управління доступом, в якій доступ до ресурсів контролюється на основі ролей, які призначені користувачам. В цій моделі кожному користувачеві присвоюється одна або декілька ролей, а доступ до ресурсів визначається на основі цих ролей.

[Data Security](https://en.wikipedia.org/wiki/Data_security) -
це процес захисту інформації від несанкціонованого доступу, використання, зміни або розголошення. Заходи з безпеки даних включають у себе різноманітні технології, політики, процедури та контрольні механізми, які призначені для захисту конфіденційності, цілісності та доступності даних

[Data Visualization](https://www.tableau.com/learn/articles/data-visualization#:~:text=Data%20visualization%20is%20the%20graphical,outliers%2C%20and%20patterns%20in%20data.) -
це графічне представлення інформації та даних. Використовуючи візуальні елементи, такі як діаграми, графіки та карти, інструменти візуалізації даних надають доступний спосіб побачити та зрозуміти тенденції, відхилення та закономірності в даних.

[Data Publishing](https://en.wikipedia.org/wiki/Data_publishing) -
це процес розміщення та розповсюдження даних з метою зробити їх доступними для використання широким колом користувачів. Це може включати оприлюднення даних в різних форматах та на різних платформах, таких як веб-сайти, відкриті портали даних, API тощо

## Підходи та способи вирішення завдання

### Методи збору відкритих даних

[Веб-скрапінг](https://en.wikipedia.org/wiki/Web_scraping) - це процес автоматичного витягування даних з веб-сторінок 
за допомогою спеціального програмного забезпечення. Цей процес може включати сканування веб-сторінки, витягування 
потрібних даних і їх подальше збереження для аналізу або інших цілей.
- Переваги: Веб-скрапінг дозволяє отримувати великі обсяги даних з Інтернету, що може бути корисним для моніторингу 
ринку, відстеження конкуренції, збору відгуків користувачів та інших цілей
- Недоліки: Веб-скрапінг може бути складним процесом, що вимагає певних технічних знань і навичок. Наприклад, 
веб-сторінки часто змінюються, що може зламати скрапери, які були розроблені для конкретної структури сторінки.

[Веб-краулінг](https://en.wikipedia.org/wiki/Web_crawler) - це процес автоматичного обходу Інтернету для збору інформації з веб-сторінок.
Веб-краулери (або веб-павуки) автоматично переходять з однієї веб-сторінки на іншу, індексуючи контент та збираючи дані для подальшого використання
- Переваги: Можливість автоматизувати процес збору даних дозволяє використовувати веб-краулери для постійного моніторингу веб-ресурсів 
без необхідності постійного втручання користувача
- Недоліки: Веб-краулінг може бути менш ефективним при зборі даних з веб-сторінок, які містять динамічний контент, такий як інтерактивні елементи або анімація.
Також деякі веб-сайти можуть використовувати методи захисту від роботів, які можуть ускладнити або зробити неможливим збір даних

[API](https://en.wikipedia.org/wiki/API) - це набір правил, протоколів та інструментів, які дозволяють різним програмним компонентам взаємодіяти між собою. 
API дозволяє автоматизувати та спрощувати процес отримання даних з відкритих джерел
- Переваги: API надають структурований доступ до даних з відкритих джерел, що спрощує процес збору інформації та забезпечує стабільність у взаємодії з джерелом даних.
Також API дозволяє автоматизувати процес збору даних, що зменшує необхідність в ручній роботі та ресурсозатрати
- Недоліки: API можуть мати обмежену функціональність або обмежену кількість доступної інформації, що може ускладнити отримання потрібних даних.

[Краудсорсинг](https://en.wikipedia.org/wiki/Crowdsourcing) - це процес використання відкритої маси людей (зазвичай через Інтернет) для вирішення завдань, зокрема збору даних або інформації. Краудсорсинг може бути ефективним способом залучення широкої аудиторії до збору, аналізу та розширення наборів даних.
- Переваги: Залучення великої кількості учасників дозволяє швидко та ефективно збирати великі обсяги даних. Також кожен учасник може вносити унікальну інформацію або відповідати на різноманітні питання, що дозволяє отримати різноманітність даних та точніші результати.
- Недоліки: Збір відкритих даних за допомогою краудсорсингу може ставити питання щодо конфіденційності та приватності інформації, особливо у випадку зі збором особистих даних. Також краудсорсинг може потребувати значних зусиль управління та координації для ефективного залучення та контролю дій учасників.

### Методи зберігання даних

[Хмарні зберігальні системи](https://blog.colobridge.net/uk/2023/12/what-is-cloud-storage-ua/) - це сервіси, які дозволяють зберігати та керувати даними в хмарі, надаючи можливість 
резервного копіювання, синхронізації та спільного використання файлів1. Вони використовують сервери та системи 
зберігання даних, які фізично знаходяться у географічно віддаленому від клієнта дата-центрі.
Деякі з найпопулярніших хмарних зберігальних систем включають Google Диск, Dropbox, Microsoft OneDrive, iCloud, Amazon 
Drive, Mega, pCloud, iDrive, SpiderOak, Box.

- Переваги: Хмарні зберігальні системи дозволяють легко збільшувати або зменшувати обсяг зберігання в залежності від 
потреб користувача. Дані можуть бути доступні з будь-якого пристрою. Багато хмарних зберігальних систем надають захист 
даних за допомогою шифрування.
- Недоліки: Якщо у вас немає доступу до Інтернету, ви не зможете отримати доступ до своїх даних. Ваші дані можуть стати 
ціллю для хакерів, особливо якщо ви використовуєте популярні хмарні зберігальні системи.

[Бази даних](https://uk.wikipedia.org/wiki/%D0%91%D0%B0%D0%B7%D0%B0_%D0%B4%D0%B0%D0%BD%D0%B8%D1%85) - це організована колекція даних, яка зберігається та управляється в електронному форматі з можливістю швидкого доступу, оновлення та аналізу. Бази даних використовуються для зберігання інформації у впорядкованому та структурованому вигляді, що сприяє ефективному управлінню даними.
Деякі з найпопулярніших баз даних включають MySQL, Microsoft SQL Server, Oracle Database, PostgreSQL, SQLite, MongoDB, Redis, Amazon DynamoDB.
- Переваги: Дані в базах даних організовані у структурований та логічний спосіб, що полегшує їхнє зберігання, оновлення та пошук.
Бази даних забезпечують швидкий доступ до інформації завдяки використанню індексів та оптимізованих запитів
- Недоліки: Розробка та підтримка баз даних може бути складним завданням, особливо для великих та складних систем. Несанкціонований доступ, помилки в програмному забезпеченні або технічні неполадки можуть призвести до втрати даних в базі даних

### Аналіз та обробка даних

**Мови програмування** -
- Переваги:
  Гнучкість: Мови програмування дозволяють створювати різноманітні програми для вирішення різних завдань.<br>
  Швидкодія: Деякі мови програмування, такі як C++ або Rust, відомі своєю високою швидкодією в порівнянні з іншими 
  засобами розробки.<br>
  Велика спільнота: Популярні мови програмування, наприклад Python або JavaScript, мають велику спільноту розробників, 
  що сприяє обміну знаннями та розвитку.<br>
- Недоліки:
  Складність: Деякі мови програмування можуть бути складними для вивчення та розуміння, особливо для початківців.<br>
  Витрати часу: Написання програм може займати багато часу, особливо якщо вони потребують великого обсягу коду.<br>

**Машинне навчання** -
- Переваги:
  Автоматизація: Машинне навчання дозволяє автоматизувати процес аналізу великих обсягів даних та здійснювати 
  прогнозування на їх основі.<br>
  Висока точність: Деякі моделі машинного навчання можуть досягати вражаючої точності в передбаченнях, що робить їх 
  корисними для різних завдань.<br>
  Адаптивність: Моделі машинного навчання можуть навчатися на нових даних та адаптуватися до змінних умов.
- Недоліки:
  Вимоги до даних: Машинне навчання потребує великої кількості даних для навчання, а в деяких випадках якість даних може 
  впливати на результат.<br>
  Інтерпретованість: Деякі моделі машинного навчання, зокрема нейронні мережі, можуть бути складними для інтерпретації, 
  що ускладнює їх застосування в деяких областях.<br>

**Табличні процесори** -
- Переваги:
  Простота використання: Табличні процесори, такі як Microsoft Excel або Google Sheets, мають інтуїтивний інтерфейс, що 
  дозволяє швидко обробляти дані.<br>
  Можливості візуалізації: Вони надають широкі можливості для візуалізації даних у вигляді графіків та діаграм.<br>
  Можливість роботи з формулами: Табличні процесори мають потужні можливості для роботи з формулами, що дозволяє 
  автоматизувати обчислення та аналіз даних.<br>
- Недоліки:
  Обмежена потужність: В порівнянні з програмуванням або машинним навчанням, табличні процесори можуть бути обмежені у 
  розмірах оброблюваних даних та складності завдань.<br>
  Втрата точності: При обробці великих обсягів даних та складних операцій точність обчислень може знижуватися, особливо 
  при використанні складних формул.<br>

### Доступ до даних та їх захист

[Дискреційне (виборче) управління](https://worldvision.com.ua/modeli-i-metody-kontrolya-dostupa-chto-vam-podkhodit/) -
власник або адміністратор об’єкта визначає та контролює всіх, хто має доступ до системи або ресурсів, ґрунтуючись на 
ідентифікаційну інформацію про суб’єктів.
- Переваги: Забезпечує точний контроль власникові або адміністратору над доступом до системи чи ресурсів. Також легко налаштовується для індивідуального призначення рівнів доступу користувачам з урахуванням їхньої ідентифікаційної інформації.
- Недоліки: Існує ризик помилок, так як є можливість власника або адміністратора неправильно встановити або управляти правами доступу може призвести до серйозних проблем з безпекою. Крім того, відсутність чітких стандартів та процедур може призвести до хаотичного управління доступом та важкості у забезпеченні однакового рівня безпеки для всіх користувачів. 

[Обов’язковий (мандатний) метод управління](https://uk.wikipedia.org/wiki/%D0%9A%D0%BE%D0%BD%D1%82%D1%80%D0%BE%D0%BB%D1%8C_%D0%B4%D0%BE%D1%81%D1%82%D1%83%D0%BF%D1%83_%28%D1%96%D0%BD%D1%84%D0%BE%D1%80%D0%BC%D0%B0%D1%82%D0%B8%D0%BA%D0%B0%29) -
цей метод є найбільш обмежувальною формою доступу, оскільки він надає контроль та управління системою й точками доступу 
тільки власнику об’єкта або адміністратору системи.
- Переваги: По-перше, максимальний рівень безпеки, тому що лише власник об'єкта або адміністратор системи мають доступ, що запобігає несанкціонованому втручанню. По-друге, зменшення ризику витоку даних, бо обмежений доступ зменшує ймовірність витоку конфіденційної інформації. 
- Недоліки: Існує обмеженість гнучкості, тому що власнику або адміністратору необхідно постійно керувати доступом, що може бути важко в умовах великої організації зі значною кількістю користувачів. І також необхідність постійного моніторингу і адміністрування доступу може вимагати значних ресурсів і часу, через що можуть бути високі витрати на управління.

[Рольова модель управління](https://en.wikipedia.org/wiki/Role-based_access_control) - передбачає розподіл функцій персоналу з урахуванням виду діяльності організації в цілому 
або роботи конкретного підрозділу, або при виконанні судових проектів. При використанні рольового методу немає потреби 
визначати тип доступу для кожного окремого користувача ресурсом.
- Переваги: Рольова модель управління є ефективним способом розподілу функцій персоналу з урахуванням їхніх ролей в організації. Вона спрощує управління доступом, оскільки не потрібно визначати тип доступу для кожного окремого користувача. Це особливо важливо у великих організаціях зі складною структурою персоналу.
- Недоліки: Може бути складною у випадку, коли користувачі мають різні ролі в різних контекстах, або коли потрібно швидко змінювати права доступу. І також може бути обмеженою у випадках, коли потрібно деталізувати права доступу для окремих користувачів.

[Управління доступом на основі правил]() - В цій моделі, права доступу визначаються на основі набору правил, які 
визначають, які дії дозволені для різних користувачів.
- Переваги: Ця модель надає можливість встановлення різних правил для різних користувачів або груп користувачів дозволяє гнучко адаптувати доступ до потреб конкретних ситуацій. Крім того, правила можуть бути сконструйовані для вирішення різних сценаріїв доступу, що дозволяє ефективно керувати доступом в ускладнених умовах.
- Недоліки: Велика кількість правил може зробити систему складною для адміністрування та розуміння. І є ризик конфліктів, так як неправильне або неясне формулювання правил може призвести до конфліктів в правах доступу або несправедливого обмеження доступу. 


### Візуалізація даних

[Графіки](https://uk.wikipedia.org/wiki/%D0%93%D1%80%D0%B0%D1%84%D1%96%D0%BA) - це ефективний спосіб візуалізації даних, оскільки вони можуть бути лінійними, стовпчиковими, круговими (секторними) та іншими. Їх використання дозволяє легко спостерігати за змінами значень за певний період часу або порівнювати значення між різними групами. Наприклад, лінійні графіки можуть допомогти відслідковувати тенденції у часі, стовпчикові графіки - визначати рівень доходу або витрат у різних групах, а кругові графіки - показати відносну частку кожної категорії у загальній сумі. Вони дозволяють легко виявити закономірності та тренди у даних, що допомагає в прийнятті обґрунтованих рішень. 

[Діаграми](https://uk.wikipedia.org/wiki/%D0%94%D1%96%D0%B0%D0%B3%D1%80%D0%B0%D0%BC%D0%B0) - це інше потужне засоби візуалізації даних. Діаграми розсіювання дозволяють відобразити взаємозв'язок між двома або більше змінними, що допомагає виявити кореляції або взаємозв'язки між ними. Діаграми "ящик з вусами" показують розподіл значень у наборі даних, включаючи мінімальне та максимальне значення, медіану, квартилі та викиди. Вони дозволяють аналізувати розподіл даних та виявляти викиди чи аномалії в них.

[Інфографіка](https://uk.wikipedia.org/wiki/%D0%86%D0%BD%D1%84%D0%BE%D0%B3%D1%80%D0%B0%D1%84%D1%96%D0%BA%D0%B0) - це важливий інструмент для візуалізації даних та інформації у легко зрозумілій формі. Вона допомагає перетворити складні дані на зрозумілі графічні зображення, що полегшує їхнє сприйняття та аналіз. Інфографіка може включати різноманітні елементи, такі як діаграми, графіки, мапи, інфографічні ілюстрації та інші візуальні елементи. Вона широко використовується у засобах масової інформації, наукових дослідженнях, навчальних матеріалах та бізнес-презентаціях для представлення даних у доступній формі. 

[Схеми](https://uk.wikipedia.org/wiki/%D0%A1%D1%85%D0%B5%D0%BC%D0%B0) - це також важливий інструмент для візуалізації структури даних або процесів. Вони допомагають зрозуміти взаємозв'язки та логіку процесів або структур, а також відображають ієрархію даних чи рішень. Наприклад, дерево рішень - це тип схеми, який відображає послідовність рішень та їхні можливі наслідки. Використання схем дозволяє структурувати інформацію та упорядковувати процеси для кращого їх розуміння та аналізу. 

[Бізнес-аналітика](https://en.wikipedia.org/wiki/Business_analysis) - це стратегічний підхід до аналізу даних, спрямований на вдосконалення прийняття рішень у бізнесі. Це включає в себе використання різних інструментів, таких як панелі приладів, для візуалізації ключових показників ефективності (KPI) та інших важливих метрик. Бізнес-аналітика допомагає компаніям виявляти тенденції, прогнозувати результати та приймати обгрунтовані рішення на основі даних. Вона є важливим інструментом для управління та розвитку бізнесу, сприяючи підвищенню ефективності та конкурентоспроможності компанії.

## Порівняльна характеристика існуючих засобів вирішення завдання

- [Gapminder](https://www.gapminder.org/) – це некомерційний проект, заснований Гансом Рослінгом, Олофом Рослінгом та Анною Рослінг Роннлунд, який ставить своєю метою візуалізацію та аналіз світових статистичних даних. Використовуючи інтерактивні графіки та інструменти, Gapminder намагається зробити дані про соціально-економічний розвиток доступними та зрозумілими для всіх. Їхні інструменти, такі як "Gapminder World", дозволяють відстежувати та порівнювати показники розвитку країн у часі, що допомагає у розумінні глобальних тенденцій та прийнятті обґрунтованих рішень.

- [The World Bank DataBank](https://databank.worldbank.org/) - це онлайн-ресурс, розроблений Світовим банком, який надає доступ до широкого спектру статистичних даних про розвиток країн у всьому світі. Цей інструмент дозволяє користувачам шукати, відфільтровувати та візуалізувати дані з різних галузей, таких як економіка, соціальні показники, здоров'я, освіта та багато інших. DataBank є важливим джерелом інформації для дослідників, урядових органів та організацій громадянського суспільства для вивчення та аналізу глобальних тенденцій та проблем. 

- [OpenDataSoft](https://www.opendatasoft.com/en/all-in-one/) - це інструмент для управління проектами та відстеження проблем, 
розроблений компанією Atlassian. Це програмне забезпечення №1 для високопродуктивних команд, яке гнучке для роботи, 
яку ви виконуєте, і підключене до всього. Jira використовується командами для планування, відстеження, випуску та 
підтримки програмного забезпечення світового класу з впевненістю. Вона є єдиним джерелом правди для всього життєвого 
циклу розробки, що дозволяє автономним командам швидко працювати, залишаючись пов’язаними з більшою бізнес-метою.

- [Socrata](https://dev.socrata.com/) - це платформа для управління даними, яка дозволяє організаціям публікувати та аналізувати дані відкритого доступу. За допомогою Socrata, урядові організації, місцеві влади та комерційні підприємства можуть легко створювати онлайн-каталоги даних, візуалізувати інформацію за допомогою інтерактивних графіків та таблиць, а також забезпечувати громадський доступ до важливих даних. Socrata допомагає зробити дані більш доступними та зрозумілими для громадськості, сприяючи прозорості та відкритості в управлінні державними та місцевими ресурсами. 

- [Eurostat](https://ec.europa.eu/eurostat) - це статистичне агентство Європейського союзу, яке забезпечує збір, обробку та публікацію статистичної інформації про різні аспекти соціального та економічного розвитку країн-членів ЄС та інших країн. Eurostat надає широкий спектр даних про демографію, економіку, торгівлю, соціальні умови та інші сфери життя, що дозволяє аналізувати та порівнювати статистику між країнами та регіонами. 

- [Dataverse](https://dataverse.org/) - це відкрита платформа для зберігання, керування та поширення дослідницьких даних. Вона надає інструменти для організації та публікації даних досліджень, що сприяє збільшенню доступності та використання даних у наукових дослідженнях. Dataverse дозволяє дослідникам зберігати та ділитися своїми даними, забезпечуючи прозорість та відкритість в процесі наукового 


Основні категорії:
- *Functionality (функціональні вимоги)*
- *Usability (вимоги до зручності роботи)*
- *Reliability (вимоги до надійності)*
- *Performance (вимоги до продуктивності)*
- *Supportability (вимоги до підтримки)*

Оцінювання:
- 🟢 - функція реалізована
- 🟡 - функція реалізована, проте має недоліки
- 🔴 - функція не реалізована, або реалізована погано

|     Вимоги     |                Критерії                 | Наш проєкт | Gapminder | DataBank | OpenDataSoft | Socrata | Eurostat | Dataverse |
|:--------------:|:---------------------------------------:|:----------:|:---------:|:--------:|:------------:|:-------:|:--------:|-----------|
| Functionality  |           Каталогізація даних           |     🟢     |    🟢     |    🟢    |      🟡      |   🟡    |    🟢    | 🟡        |
|                |       Додавання/редагування даних       |     🟢     |    🔴     |    🟢    |      🟢      |   🟢    |    🔴    | 🟢        |
|                |              Наявність API              |     🟢     |    🟢     |    🟢    |      🟢      |   🟢    |    🟢    | 🟡        |
|                |           Пошук та фільтрація           |     🟢     |    🟡     |    🟡    |      🟢      |   🟢    |    🟢    | 🟢        |
|                |           Візуалізація даних            |     🟢     |    🟢     |    🟢    |      🟢      |   🟢    |    🟢    | 🔴        |
|                |          API доступу до даних           |     🟢     |    🟡     |    🟢    |      🟢      |   🟢    |    🟡    | 🟡        |
|                |     Підтримка різних форматів даних     |     🟢     |    🟢     |    🟢    |      🟡      |   🟢    |    🟢    | 🟡        |
|   Usability    |          Інтуїтивний інтерфейс          |     🟢     |    🟢     |    🟢    |      🟡      |   🟢    |    🟢    | 🟡        |
|                |                Навігація                |     🟢     |    🟢     |    🟢    |      🟢      |   🟢    |    🟢    | 🟢        |
|                |      Зручність завантаження даних       |     🟢     |    🟢     |    🟢    |      🟡      |   🟢    |    🟢    | 🟢        |
|                |             Персоналізація              |     🟢     |    🟢     |    🟢    |      🟡      |   🟢    |    🟡    | 🟡        |
|                |       Підтримка різних пристроїв        |     🟢     |    🟢     |    🟢    |      🟢      |   🟢    |    🟡    | 🟢        |
|                |           Підтримка інших мов           |     🟢     |    🟡     |    🟡    |      🟢      |   🟢    |    🟢    | 🔴        |
|  Reliability   |         Відновлення після збоїв         |     🟢     |    🟡     |    🟢    |      🟡      |   🟢    |    🟢    | 🟢        |
|                | Резервне копіювання і відновлення даних |     🟢     |    🟢     |    🟢    |      🟡      |   🟢    |    🟢    | 🟢        |
|                |          Захист від вторгнень           |     🟢     |    🟢     |    🟢    |      🟡      |   🟡    |    🟢    | 🟢        |
|                |        Стійкість до навантаження        |     🟢     |    🟡     |    🟢    |      🟡      |   🟡    |    🟢    | 🟢        |
|                |          Аварійне відключення           |     🟢     |    🟢     |    🟢    |      🟡      |   🟡    |    🟢    | 🟢        |
|  Performance   |       Ефективність обробки даних        |     🟢     |    🟡     |    🟢    |      🟡      |   🟢    |    🟡    | 🟡        |
|                |             Кешування даних             |     🟢     |    🟢     |    🟢    |      🟢      |   🟢    |    🟢    | 🟡        |
|                |          Мінімізація затримок           |     🟢     |    🟢     |    🟢    |      🟢      |   🟢    |    🟡    | 🟢        |
|                |       Пропускна спроможність API        |     🟢     |    🟢     |    🟢    |      🟢      |   🟢    |    🟡    | 🟡        |
|                |             Масштабованість             |     🟢     |    🟢     |    🟢    |      🟢      |   🟢    |    🟢    | 🟡        |
| Supportability |              Документація               |     🟢     |    🟡     |    🟡    |      🟢      |   🟢    |    🟢    | 🟢        |
|                |            Служба підтримки             |     🟢     |    🟡     |    🟢    |      🟡      |   🟢    |    🟡    | 🟡        |
|                |           Оновлення та патчі            |     🟢     |    🟢     |    🟢    |      🟢      |   🟢    |    🟢    | 🟢        |

## Висновки

Здавалося б, всі розглянуті системи управління відкритими даними мають базовий набір функцій, необхідних для 
каталогізації, завантаження, пошуку та візуалізації даних. Багато з них також пропонують API доступу, підтримку різних 
форматів даних, а також можливості забезпечення захисту та надійності даних.<br>

Однак варто врахувати, що гнучкість інструментів може стати перевагою, але в той же час може вимагати додаткового часу 
та ресурсів для створення власних рішень, особливо в обробці великих обсягів даних та ефективній їх візуалізації.<br>

У результаті, може виявитися, що спеціалізована система, яка надає кінцеві інструменти для користувача та фокусується на 
конкретних завданнях, може бути більш вигідною. Такий підхід дозволить користувачам максимально використовувати 
потенціал своїх даних та ефективно взаємодіяти з ними, що робить систему конкурентоспроможною на ринку управління 
відкритими даними.<br>

Ось додатковий аналіз деяких конкретних систем управління відкритими даними:
- **Socrata**: Socrata відзначається своєю широкою функціональністю, включаючи потужність візуалізації даних та можливості 
роботи з великими обсягами даних. Його API доступу, а також інтуїтивний інтерфейс роблять його популярним в урядових та 
комерційних секторах.
- **Gapminder** відомий своїми інтерактивними візуалізаціями, які дозволяють користувачам досліджувати та порівнювати дані з 
різних країн і регіонів. Це цінний інструмент для освіти та досліджень у сфері глобального розвитку.

## Посилання

- [Бази даних](https://sites.google.com/view/ddkbmta-info/%D0%BB%D0%B5%D0%BA%D1%86%D1%96%D1%97/%D1%81%D0%B8%D1%81%D1%82%D0%B5%D0%BC%D0%B8-%D0%BA%D0%B5%D1%80%D1%83%D0%B2%D0%B0%D0%BD%D0%BD%D1%8F-%D0%B1%D0%B0%D0%B7%D0%B0%D0%BC%D0%B8-%D0%B4%D0%B0%D0%BD%D0%B8%D1%85-microsoft-access/%D0%BE%D1%81%D0%BD%D0%BE%D0%B2%D0%BD%D1%96-%D0%BF%D0%BE%D0%BD%D1%8F%D1%82%D1%82%D1%8F-%D0%B1%D0%B0%D0%B7-%D0%B4%D0%B0%D0%BD%D0%B8%D1%85)
- [Хмарні технології](https://edin.ua/shho-take-xmarni-texnologi%D1%97-i-navishho-voni-potribni/)
- [Візуалізація даних](https://goit.global/ua/articles/vizualizatsiia-danykh-pryntsypy-sposoby-ta-korysni-instrumenty/)
- [Захист даних та контроль доступу](https://uk.wikipedia.org/wiki/%D0%9F%D1%80%D0%BE%D0%B3%D1%80%D0%B0%D0%BC%D0%BD%D1%96_%D0%B7%D0%B0%D1%81%D0%BE%D0%B1%D0%B8_%D0%B7%D0%B0%D1%85%D0%B8%D1%81%D1%82%D1%83_%D1%96%D0%BD%D1%84%D0%BE%D1%80%D0%BC%D0%B0%D1%86%D1%96%D1%97)
- [GRAPMINDER](https://www.gapminder.org/)
- [The World Bank DataBank](https://databank.worldbank.org/home.aspx)
- [OpenDataSoft](https://www.opendatasoft.com/en/)
- [Socrata](https://dev.socrata.com/)
- [Eurostat](https://ec.europa.eu/eurostat/data/database)
- [Dataverse](https://learn.microsoft.com/en-us/power-apps/maker/data-platform/data-platform-intro)