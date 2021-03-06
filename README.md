# Чит для проектов с лаунчером [GravitLauncher](https://launcher.gravit.pro) [v4.5.0](https://github.com/GravitLauncher/Launcher/releases/tag/v4.5.0)

Текущие функции:
  - Вырезано авто обновление.
  - Вырезана проверка клиентов.


Информация:
  - Лаунчер работат со всеми проектами у которых версия лаунчера `4.5.0`.
  - Чит сам подтягивает папку оригинального лаунчера в `%APPDATA%`.
 

При возникновении ошибок:
  - Запустите лаунчер через `java -Dlauncher.debug=true -jar Launcher.jar`.
  - Измените параметр `env` в `config.json`.


Туториал:
  - Скачайте чит в [releases](https://github.com/gravitlauncher-cheat/gravitlauncher-cheat/releases) (стабильные) или [Actions](https://github.com/gravitlauncher-cheat/gravitlauncher-cheat/actions) (не стабильные).
  - Положите рядом с читом оригинальный лаунчер и переименуйте в `Launcher-original.jar`.
  - Измените адресс и порт лаунчсервера в `config.json`.
  - Если у вас бан по hwid редактируйте `Launcher_HWID.txt`.
  - Запустите лаунчер.


Про `env` в `config.json`:
  - 0 Dev (дебаг включен по умолчанию, все сообщения).
  - 1 Debug (дебаг включен по умолчанию, основные сообщения).
  - 2 Std (дебаг выключен по умолчанию, основные сообщения).
  - 3 Production (дебаг выключен, минимальный объем сообщений, stacktrace не выводится).


Ветка [test](https://github.com/gravitlauncher-cheat/gravitlauncher-cheat/tree/test)

Теперь вместо devMode несколько обычных режимов

- configMode
- runtimeMode

У них есть 3 значения `project` `custom` и `integral`

`project` - рантайм или конфиг берется из оригинального лаунчера (Launcher-original.jar)
`custom` - рядом с Launcher.jar
`integral` - из Launcher.jar
