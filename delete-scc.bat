@REM #########################################################  
@REM  Name: 递归删除指定的文件，请把此文件放在你希望执行的那个目录  
@REM  Desciption:   
@REM  Author: amosryan  
@REM  Date: 2010-11-01  
@REM  Version: 1.0  
@REM  Copyright: Up to you.  
@REM #########################################################  
  
@echo on  
@REM setlocal enabledelayedexpansion  
  
@REM 设置你想删除的文件  
set WHAT_SHOULD_BE_DELETED=vssver.scc  
  
for /f %%f in ('dir /b /a-d /s "%WHAT_SHOULD_BE_DELETED%"') do (  
  echo %%f  
  del %%f  /q /f  
)  
pause  