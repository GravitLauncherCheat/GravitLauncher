# Чит для проектов с лаунчером [GravitLauncher](https://launcher.gravit.pro) [v4.5.0](https://github.com/GravitLauncher/Launcher/releases/tag/v4.5.0)

Текущие функции:
- Частично вырезано авто обновление (но чтобы лаунчер работал надо кинуть рядом с ним оригинал лаунчер и переименовать в `Launcher-original.jar`)
- Вырезана проверка модов
- Вырезана проверка текстурпаков шейдер паков `minecraft.jar` и `forge.jar`
- Вырезана проверка runtime (можно закинуть свой)

Туториал:
1. Скачайте чит в releases
2. Положите чит рядом с оригинальным лаунчером и переименуйте оригинальный в `Launcher-original.jar`
3. Измените адресс и порт лаунчсервера в `config.json`
4. Запустите лаунчер
5. Если у вас бан по hwid редактируйте `Launcher_HWID.txt`

Если вы боитесь вирусов можете скомпилить лаунчер из исходного кода (`./gradlew build`)

Лаунчер работат со всеми проектами у которых версия лаунчера `4.5.0`

В %appdata% найдите папку `gravitlauncher-cheat` и поместите туда оригинальный клиент, и наслаждайтесь!

ЧИТ РАБОТАЕТ ТОЛЬКО С ПРОЕКТАМИ ГДЕ ВЕРСИЯ ЛАУНЧЕРА 4.5.0 это можно проверить запустив лаунчер через `java -jar Launcher-original.jar`

При возникновении ошибок: запустите лаунчер через `java -Dlauncher.debug=true -jar Launcher.jar`.
