#CSID "%Z%SCCS Id Info:%M% v%I%;%Q%;Modified %E%."
#        APPL    : IWMS
#        FILE    : iwms_Create_File_Copies.ksh
#        AUTHOR  : Exilant
#        DATE    : June-17-2016
#        LAST MODIFIED DATE: April-07-2017
#        PURPOSE: To transfer tab files from IWMS to DS
#
#        FIELDS PASSED IN:
#        RETURN VALUES:
#        Executing status
#
#set -x

#Directory Structure i
Source=/ngs/app/iwmst/shared
Archive=/ngs/app/iwmst/REDS-DIS/FTPJOB/TABFILES/ARCHIVE
DateFormat=$(date +%m%d%Y%H:%M:%S)
#CurrentTime=$(date +"%Y.%m.%d.%H.%M")
currentTime=$(date +%Y-%m-%d-%H-%M-%S  -d "1 min ago")
folderstoCopy=( "/ngs/app/iwmst/REDS-DIS/FTPJOB/TABFILES/FORDS"  "/ngs/app/iwmst/REDS-DIS/FTPJOB/TABFILES/FORIFORMS")
exclude_for_iForm=("move_tririga_nontririga")
formFolder=FORIFORMS
#Declaration is completed 



echo "*****************************************************************************************" 
echo Beginning the iwms_Create_File_Copies.ksh process at `date`
echo "*****************************************************************************************" 

files=$(ls $Source//*.tab  2> /dev/null | wc -l)
if [ "$files" != "0" ]
#if [ -e /$Source/*.tab ]
then
echo "tab files exist: will continue further"
else
echo "No tab files..."
exit 0
fi

for i in "${folderstoCopy[@]}"
do	

echo "directories: $i"
done
#echo "*****************************************************************************************" 
#echo duplicate files to local  folders  
#echo "*****************************************************************************************" 

#for i in "${folderstoCopy[@]}"
#do
#	echo $i
#find $Source/*.tab  -type f -mmin +1  -exec cp -pf {} $i  \;
	
#	cp  $Source/*.tab $i/.

#find $Source/*.tab  -type f -mmin $CurrentTime -exec cp {} $i/.  \;

# if [ -f $Source]; then


# fi
#SourceToWorkStatus=$?

#if [ $SourceToWorkStatus -ne 0 ]
#then
#    echo "Failed while moving files from source to the directory" $i/ 
#    exit   1
#fi
	
#done

echo "*****************************************************************************************" 
echo copy and  move file from shared folder to different directories 
echo "*****************************************************************************************" 

cd $Source
echo "currentTime-1 date is: $currentTime"
curTime=$(echo $currentTime | sed 's/-//g')
for file in *.tab; do
filedate=$(stat -c%y $file | cut -d'.' -f1)
format=$(echo $filedate | sed 's/:/-/g')
formatedate=$(echo $format | sed 's/ /-/g')
value=$(echo $formatedate | sed 's/-//g')
if [ $value  -lt  $curTime ]; then

chmod 770 $file

for i in "${folderstoCopy[@]}"
do	
for k in "${exclude_for_iForm[@]}";do
# if file name starts with 'move_tririga_nontririga' and target folder path contains 'FORIFORMS', then dont copy the file to this folder
if [[ $file == $k*.* && $i == *$formFolder* ]]
then
echo $file "Skipping moving from source to the directory" $i/ 
else
cp --preserve=ownership  $Source/$file  $i
SourceToWorkStatus=$?
fi
done

if [ $SourceToWorkStatus -ne 0 ]
then
    echo "Failed while moving files from source to the directory" $i/ 
    exit   1
fi
done
#moving files to Archive directory
filename=$(basename "$file")
    fname="${filename%.*}"
    ext="${filename##*.}"
    mv $file $Archive/$fname'_'$DateFormat.$ext
fi
done
WorkToArchiveStatus=$?
if [ $WorkToArchiveStatus -ne 0 ]
then
    echo "Failed while archiving the files" 
    exit 1

fi
echo "*****************************************************************************************"
echo Finished executing iwms_Create_File_Copies.ksh at `date`
echo "*****************************************************************************************"

