@REM #########################################################  
@REM  Name: �ݹ�ɾ��ָ�����ļ�����Ѵ��ļ�������ϣ��ִ�е��Ǹ�Ŀ¼  
@REM  Desciption:   
@REM  Author: amosryan  
@REM  Date: 2010-11-01  
@REM  Version: 1.0  
@REM  Copyright: Up to you.  
@REM #########################################################  
  
@echo on  
@REM setlocal enabledelayedexpansion  
  
@REM ��������ɾ�����ļ�  
set WHAT_SHOULD_BE_DELETED=vssver.scc  
  
for /f %%f in ('dir /b /a-d /s "%WHAT_SHOULD_BE_DELETED%"') do (  
  echo %%f  
  del %%f  /q /f  
)  
pause  