@echo off
setlocal

:: ====== CONFIGURAÇÃO (troque este nome apenas!) ======
set MAINCLASS=SegundoPrograma
:: =====================================================

set SRCDIR=src
set BINDIR=bin
set JARNAME=%MAINCLASS%.jar

:: Limpa e recria a pasta bin
if exist %BINDIR% (
    rd /s /q %BINDIR%
)
mkdir %BINDIR%

:: Compila os arquivos
javac -d %BINDIR% %SRCDIR%\*.java

:: Se der erro, para tudo
if %errorlevel% neq 0 exit /b

:: Cria o manifest
echo Main-Class: %MAINCLASS% > manifest.txt
echo. >> manifest.txt

:: Cria o JAR
jar cfm %JARNAME% manifest.txt -C %BINDIR% .

:: Executa o programa
java -jar %JARNAME%

endlocal
pause

