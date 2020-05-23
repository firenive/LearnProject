package additionalInformation.GitHub;

public class GitAlias {
    // https://youtu.be/__GVBVv9Erg
    //  Алиасы в git это пользовательские сокращенные команды, которые позволяют выполнять стандартные команды git но
    //  использовать при это выбранные нами сокращения.

    // Алиасы настраиваются в файле .gitconfig , который по умолчанию лежит в папке пользователя
    // "C:\Users\User"
    // "C:\Users\User\.gitconfig"

    // Пример настройки  Алиасов. Добавляем в файл указанный выше раздел [alias]
    // s = status --short    Теперь достаточто использовать команду git s для вызова сокращенного статуса
    // st = status  git st = вызов статуса
    // l = log --oneline --graph --decorate --all = log file всех коммитов в декоррированном виде. Команда ниже делает тоже
    // g = log --graph --abbrev-commit --decorate --all --format=format:'%C(bold blue)%h%C(reset) - %C(bold cyan)%aD%C
    // (dim white) - %an%C(reset) %C(bold green)(%ar)%C(reset)%C(bold yellow)%d%C(reset)%n %C(white)%s%C(reset)'
    // br = branch  git br  проверка в какой ветке сейчас находимся
    // co = checkout
}
