# UserApp - Lab 4

### Опис
Проєкт демонструє архітектуру MVVM, Clean Architecture та використання Hilt для впровадження залежностей.

### Технології
- Kotlin, Jetpack Compose
- Hilt (Dependency Injection)
- Clean Architecture (Data, Domain, Presentation)
- StateFlow, ViewModel

### Контрольні питання
1. **У чому полягає різниця між MVVM і MVC?**
   - У MVVM View підписується на зміни у ViewModel (через Observable/StateFlow), тоді як у MVC Controller безпосередньо маніпулює View. ViewModel не знає про View, що полегшує тестування.
2. **Які переваги Clean Architecture?**
   - Незалежність від фреймворків, баз даних та UI. Легкість тестування бізнес-логіки та масштабованість.
3. **Для чого потрібен Hilt?**
   - Hilt автоматизує процес впровадження залежностей в Android-компоненти, зменшуючи кількість шаблонного коду (boilerplate) та спрощуючи керування життєвим циклом залежностей.
4. **Чому StateFlow кращий за LiveData у Compose?**
   - StateFlow є частиною Kotlin Coroutines, він більш нативно працює з Compose, завжди має початкове значення та пропонує багатий набір операторів для трансформації даних.
5. **Як реалізується зв’язок між ViewModel і UI?**
   - Через спостереження за станом (StateFlow/State) у UI. Коли стан у ViewModel змінюється, UI автоматично перемальовується (recomposition).
