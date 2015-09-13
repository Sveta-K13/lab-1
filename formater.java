import java.io.*;
public class formater {
    /**
     * 
     * @param args massive with input and output files` names
     * @throws IOException 
     */
    public static void main(String args[]) throws IOException {
        int a=0;
        int levelLine = 0;
        final int enter = (int)'\n';
        final int tab=(int)'\t';
        final int probel=(int)' ';
        final int openBlock=(int)'{';
        final int closeBlock=(int)'}';
        final int operEnd=(int)';';

        boolean isNewLine=false;      //need \n
        boolean isNeedSeparator=false;     //need some separator

        try (FileInputStream fA = new FileInputStream(args[0]); FileOutputStream fB = new FileOutputStream(args[1])) {
            a = fA.read();
            while (a != -1) {    
                switch (a){
                    case tab:
                    case enter:
                    case probel: {
                        if (!isNewLine && isNeedSeparator) { //cut double separating && unneeded enters\tabs
                            fB.write(probel); 
                            isNeedSeparator=false;
                        }
                        break;
                    }
                    case operEnd: {
                        fB.write(a);
                        isNewLine=true;                                                      
                        break;
                    }
                    case openBlock : {
                        levelLine++;
                        if (isNeedSeparator) {
                            fB.write(probel);
                        }
                        fB.write(a);
                        isNewLine=true;
                        break;
                    }
                    case closeBlock: {
                        levelLine--;
                        fB.write(enter);
                        for (int i=1;i<levelLine;i++)    fB.write(tab);
                        fB.write(a);
                        isNewLine=true;
                        break;
                    }

                    default: {
                        if (isNewLine){             
                            fB.write(enter);
                            for (int i=1;i<levelLine;i++)    fB.write(tab);
                            isNewLine=false;
                        }

                        fB.write(a);
                        isNeedSeparator=true;
                    }
                }
                a=fA.read();                   
            }            
        } catch (FileNotFoundException e) {
            System.out.println("Can't do it " + e);
        }
    if (levelLine!=0)    System.out.println("Code is bad");

    }
    
}