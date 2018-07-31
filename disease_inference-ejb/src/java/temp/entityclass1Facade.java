/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temp;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author santosh
 */
@Stateless
public class entityclass1Facade extends AbstractFacade<entityclass1> implements entityclass1FacadeLocal {

    @PersistenceContext(unitName = "disease_inference-ejbPU")
    private EntityManager em;
    entityclass1 e = new entityclass1();
    String name1[] = new String[100]; 
    String sym[] = new String[100]; 
    String cause[] = new String[100]; 
    String test[] = new String[100]; 
    int i=12;
    String weight[]=new String[100];
    String temp1[];
    String temp10="";
    int counter=0;
    String merge="";
    int counter1=0;
    String s="";
    float maxth[] = new float[100];
    float minth[] = new float[100];
    int catalyst[] = new int[100];
    
    
    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
    public entityclass1Facade() {
        super(entityclass1.class);
    }
    
    @Override
    public String register_user(String name, int age, String gender, String password) {
        e.setName(name);
        e.setAge(age);
        e.setGender(gender);
        e.setPassword(password);
        
        this.create(e);
        return "<a href=\"index2.html\">\n" +
"            click here to continue\n" +
"        </a>";
    }

    @Override
    public String intial1(String symptoms1) {
        
        
        
name1[0]="FABRY DISEASE";   
        sym[0]="burning sensation,hot weather,fever,seating problem"; 
        cause[0]=" Fabry disease occurs from your parents. It's passed down through genes. When we have Fabry disease, you either were born without that enzyme or it doesn’t work right."; test[0]="Enzyme replacement may be effective in slowing the progression of the disease.";
        weight[0]="0.6,0.3,0.6,0.5";
        catalyst[0]=0;
        maxth[0]=3.2f;
        minth[0]=0.2f;
        
        name1[1]="Thyroid";
        sym[1]="Weight loss,increased appetite,Increased heart rate,higher blood pressure,Muscle weakness,neck enlargement"; 
        cause[1]="All types of hyperthyroidism are due to an overproduction of thyroid hormones, but the condition can occur in several ways:Graves' disease: The production of too much thyroid hormone.\n" +
                "Toxic adenomas: Nodules develop in the thyroid gland and begin to secrete thyroid hormones, upsetting the body's chemical balance; some goiters may contain several of these nodules.\n" +
                "Subacute thyroiditis: Inflammation of the thyroid that causes the gland to \"leak\" excess hormones, resulting in temporary hyperthyroidism that generally lasts a few weeks but may persist for months.\n" +
                "Pituitary gland malfunctions or cancerous growths in the thyroid gland: Although rare, hyperthyroidism can also develop from these causes.";
        test[1]="Thyroid-stimulating hormone (TSH) test. This is a blood test to see how well your thyroid gland is working.Fine-needle aspiration guided by ultrasound. Material that is removed from the nodule is checked for cancer cells. This is a simple procedure that can be done in your doctor's office.";
        weight[1]="0.4,0.8,0.6,0.5,0.5,0.6";
        catalyst[1]=0;
        maxth[1]=4.2f;
        minth[1]=0.2f;
        
        name1[2]="DEMENTIA"; 
        sym[2]="simple forgetfulness,losing items,problems performing tasks"; 
        cause[2]=" This damage interferes with the ability of brain cells to communicate with each other. When brain cells cannot communicate normally, thinking, behavior and feelings can be affected.";
        test[2]="Treatment options for Alzheimer's disease and other dementias are limited. Physical exercise has been shown to be of some benefit in helping to maintain cognition. ";
        weight[2]="0.6,0.5,0.4";
        catalyst[2]=0;
        maxth[2]=3.2f;
        minth[2]=0.2f;
        
        name1[3]="JOINT DISORDER"; 
        sym[3]="Joint redness,joint swelling,joint locking"; 
        cause[3]="Arthritis-inflammation of joint. it causes pain,swelling etc.";
        test[3]="Bone x-rays(radiography),MRI of the musculoskeletal system.";
        weight[3]="0.4,0.7,0.7";
        catalyst[3]=0;
        maxth[3]=3.2f;
        minth[3]=0.2f;
        
        
        name1[4]="URINARY TRACT INFECTION"; 
        sym[4]="Pain or burning when you urinate,back pain,pain in sidebelow the ribs"; 
        cause[4]="Imaging of the urinary tract,other causes of painful urination.";
        test[4]="Antibiotics are the recommended treatment ";
        weight[4]="0.7,0.4,0.3";
        catalyst[4]=0;
        maxth[4]=2.8f;
        minth[4]=0.2f;
        
        
        name1[5]="RABIES";
        sym[5]="weakness,fever,headaches"; 
        cause[5]="Rabies infection is caused by the rabies virus. The virus is spread through the saliva of infected animals.";
        test[5]="Wound care involving soap and a virus-killing cleanser (this should always be done for any animal bite)A onetime injection of human rabies (or HRIG). ";
        weight[5]="0.6,0.5,0.3";
        catalyst[5]=0;
        maxth[5]=3.0f;
        minth[5]=0.2f;
        
        
        name1[6]="DEPRESSION"; 
        sym[6]="Sadness,loss of interest or pleasure in activities,change in weight"; 
        cause[6]="Genetic environment,psychological and biomedical facts.";
        test[6]="Brain strimulation therapies,execise,medicines for treating mental health conditions.";
        weight[6]="0.7,0.3,0.3";
        catalyst[6]=4;
        maxth[6]=3.2f;
        minth[6]=0.2f;
        
        
        name1[7]="TYPHOID FEVER"; 
        sym[7]="poor appetite,headaches,body pain,fever,diarrhea";
        cause[7]="drinking or eating  the bacteria in contamniated food or water caused by Salmonella typhi bacteria";
        test[7]="Cured using antibiotics which kills salmonella bacteria.";
        weight[7]="0.6,0.6,0.4,0.6,0.3";
        catalyst[7]=0;
        maxth[7]=3.2f;
        minth[7]=0.2f;
        
        name1[8]="SPEECH IMPAIRMENTS"; 
        sym[8]="Repeating sound,adding extra sounds and words,enlongating words"; 
        cause[8]="Vocal cords,muscle nerves";
        test[8]="Test on early language milestone scale2,vocabulary test.";
        weight[8]="0.6,0.7,0.65";
        catalyst[8]=0;
        maxth[8]=3.2f;
        minth[8]=0.2f;
        
        name1[9]="MALARIA";
        sym[9]="high fever,profuse sweating,headache,vomiting"; 
        cause[9]="Malaria can occur if a mosquito infected with the Plasmodium parasite bites you. An infected mother can also pass the disease to her baby at birth. ";
        test[9]="Blood tests to confirm your diagnosis-what type of malaria you have,if your infection is caused by a parasite that’s resistant to certain types of drugs,if the disease has caused anemia.";
        weight[9]="0.6,0.7,0.3,0.3";
        catalyst[9]=0;
        maxth[9]=3.6f;
        minth[9]=0.2f;
        
        name1[10]="ASTHAMA";
        sym[10]="cough,chest pain,wheezing noise,short breathe";
        cause[10]="Airborne allergens, such as pollen, animal dander, mold, cockroaches and dust mites.Respiratory infections, such as the common cold.";
        test[10]="Lung Function Tests,Chest X-Ray,Evaluation for Heartburn and GERD to manage your asthma and prevent asthma attacks.";
        weight[10]="0.9,0.2,0.9,0.6";
        catalyst[10]=4;
        maxth[10]=3.3f;
        minth[10]=0.2f;
        
        name1[11]="Pneumonia";
        sym[11]="dry cough,fever,chest pain";
        cause[11]="There are five cause of Pneumonia:Bacyeria,Viruses,Mycoplasma,Other infectious agents such as fungi and various chemicals.";
        test[11]="Chest X-rays can be used to determine if infection is present in your lungs.Blood test to determine type of Pneumonia and to see  if the infection is in your bloodstream.";
        weight[11]="0.5,0.1,0.3";
        catalyst[11]=0;
        maxth[11]=3.6f;
        minth[11]=0.2f;

        
        int indicator[] = new int[i];
        
        for(int temp=0;temp<indicator.length;temp++)
        {
         indicator[temp]=-1;
        }
        
            for(int incr1=0;incr1<i;incr1++)
        {
            String s1[] = sym[incr1].split(",");
            String s2[] = symptoms1.split(",");
            int counter=0;
            for(int incr2=0;incr2<s1.length;incr2++)
            {
                for(int incr3=0;incr3<s2.length;incr3++)
                {
                    if(s2[incr3].equalsIgnoreCase(s1[incr2]))
                    {
                        counter++;
                        indicator[incr1]=incr1;
                        //System.out.println("incr1-->"+incr1+"   incr2-->"+incr2+"   incr3-->"+incr3);
                        break;
                    }
                    
                }
               
            
            }
            
      }// end incr1
    
    for(int temp=0;temp<indicator.length;temp++)
            {
                if((indicator[temp]>=0))
                {
                    //for(int temp1=0;temp1<sym[temp].)
                    //temp1=temp1+temp+" ";
                    counter1++;
                    temp10=temp10+temp+" ";
                    //s=sym[temp]+"<br>"+s;
                    //System.out.println("Symptoms match are-->"+sym[temp]);
                }
            }
        
    // CALCULATIONS BEGIN
    
        //System.out.println("\n\n\n");
            String temp2[]=temp10.split(" ");
          //  System.out.println("INDEX-->"+temp10);
            float prob[] = new float[temp2.length];
            int variable1=0;
            
                         //String temp4[];
            for(int temp=0;temp<temp2.length;temp++)    // ENTERING THE DISEASE 
            {
                variable1 = Integer.parseInt(temp2[temp]);
               String temp4[] = weight[variable1].split(",");
                
                float temp3[] = new float[temp4.length];    //WEIGHTS
                String s3[] = sym[variable1].split(",");
                String s4[] = symptoms1.split(",");;
                float summation=0.0f;
                
                for(int incr1=0;incr1<temp3.length;incr1++)
                {
                    temp3[incr1]= Float.parseFloat(temp4[incr1]);
                    summation = summation+temp3[incr1];
                }
        
        
                           prob[temp]=summation;
    
                    
                    float summation1=0.0f;
                for(int incr2=0;incr2<s3.length;incr2++)
                {
                    for(int incr3=0;incr3<s4.length;incr3++)
                    {
                        if(s4[incr3].equalsIgnoreCase(s3[incr2]))
                        {
                            summation1=summation1+temp3[incr2];
                         }    
                    
                    }   
                    
                
                }
    
                prob[temp]=((summation-(summation-summation1))-minth[variable1])/(maxth[variable1]-minth[variable1]);
                prob[temp]=(prob[temp]*100)+catalyst[variable1];
                merge=merge+variable1+" ";
    
    }//END OF CALCULATION

        
            for(int temp=0;temp<prob.length;temp++)
            {
                //System.out.print(prob[temp]+"   ");
            }
            int index=0;
            float max=prob[0];
            for(int temp=1;temp<prob.length;temp++)
            {
                if(max<prob[temp])
                {
                    max=prob[temp];
                    index=temp;
                }
            }
            String merge1[]=merge.split(" ");
            int temp=Integer.parseInt(merge1[index]);
            //System.out.println(sym[temp]+"\n"+prob[index]);
   
    
    
        return "<table border=\"1\">\n" +
"            <thead>\n" +
"                <tr>\n" +
"                    <th>DISEASE</th>\n" +
"                    <th>SYMPTOMS</th>\n" +
"                    <th>PROBABILITY</th>\n" +
"                    <th>CAUSES</th>\n" +
"                    <th>TEST TO BE CONDUCTED</th>\n" +
"                </tr>\n" +
"            </thead>\n" +
"            <tbody>\n" +
"                <tr>\n" +
"                    <td>"+name1[temp]+"</td>\n" +
"                    <td>"+sym[temp]+"</td>\n" +
"                    <td>"+prob[index]+"</td>\n" +               
"                    <td>"+cause[temp]+"</td>\n" +
"                    <td>"+test[temp]+"</td>\n" +
"                </tr>\n" +
"                \n" +
"            </tbody>\n" +
"        </table>\n" +
""+"<br><br>"+"<br><a href=\"index2.html\">\n" +
"            click here to go back to the previous page\n" +
"        </a>";
        
    }//END OF FUNCTION

    @Override
    public String insert_disease_data(String name, String symtpms, String cause1, String test1,String w,int m,int n,int c) {
        name1[i]=name;
        sym[i]=symtpms;
        cause[i]=cause1;
        test[i]=test1;
        weight[i]=w;
        catalyst[i]=c;
        maxth[i]=m;
        minth[i]=n;
        i++;
        return "data added successfully for "+i+"disease"+"<br><a href=\"disease_database.html\">\n" +
"            continue\n" +
"        </a>"+"<a href=\"index.html\">\n" +
"            logout\n" +
"        </a>";
        
    }

    @Override
    public String question_answer(String question) {
        int q2;
        name1[0]="FABRY DISEASE";sym[0]="burning sensation,hot weather,fever,seating problem"; cause[0]=" Fabry disease occurs from your parents. It's passed down through genes. When we have Fabry disease, you either were born without that enzyme or it doesn’t work right."; 
        name1[1]="Thyroid";sym[1]="Weight loss,increased appetite,Increased heart rate,higher blood pressure,Muscle weakness,neck enlargement"; cause[1]="All types of hyperthyroidism are due to an overproduction of thyroid hormones, but the condition can occur in several ways:Graves' disease: The production of too much thyroid hormone.\n" +
                "Toxic adenomas: Nodules develop in the thyroid gland and begin to secrete thyroid hormones, upsetting the body's chemical balance; some goiters may contain several of these nodules.\n" +
                "Subacute thyroiditis: Inflammation of the thyroid that causes the gland to \"leak\" excess hormones, resulting in temporary hyperthyroidism that generally lasts a few weeks but may persist for months.\n" +
                "Pituitary gland malfunctions or cancerous growths in the thyroid gland: Although rare, hyperthyroidism can also develop from these causes.";
        name1[2]="DEMENTIA"; sym[2]="simple forgetfulness,losing items,problems performing tasks"; cause[2]=" This damage interferes with the ability of brain cells to communicate with each other. When brain cells cannot communicate normally, thinking, behavior and feelings can be affected.";
        name1[3]="JOINT DISORDER"; sym[3]="Joint redness,joint swelling,joint locking"; cause[3]="Arthritis-inflammation of joint. it causes pain,swelling etc.";
        name1[4]="URINARY TRACT INFECTION";sym[4]="Pain or burning when you urinate,back pain,pain in sidebelow the ribs"; cause[4]="Imaging of the urinary tract,other causes of painful urination.";
        name1[5]="RABIES";sym[5]="weakness,fever,headaches"; cause[5]="Rabies infection is caused by the rabies virus. The virus is spread through the saliva of infected animals.";
        name1[6]="DEPRESSION"; sym[6]="Sadness,loss of interest or pleasure in activities,change in weight"; cause[6]="Genetic environment,psychological and biomedical facts.";
        name1[7]="TYPHOID FEVER"; sym[7]="poor appetite,headaches,body pain,fever,diarrhea";cause[7]="drinking or eating  the bacteria in contamniated food or water caused by Salmonella typhi bacteria";
        name1[8]="SPEECH IMPAIRMENTS";sym[8]="Repeating sound,adding extra sounds and words,enlongating words"; cause[8]="Vocal cords,muscle nerves";
        name1[9]="MALARIA";sym[9]="high fever,profuse sweating,headache,vomiting"; cause[9]="Malaria can occur if a mosquito infected with the Plasmodium parasite bites you. An infected mother can also pass the disease to her baby at birth. ";
        name1[10]="ASTHAMA";sym[10]="cough,chest pain,wheezing noise,short breathe";cause[10]="Airborne allergens, such as pollen, animal dander, mold, cockroaches and dust mites.Respiratory infections, such as the common cold.";
        name1[11]="Pneumonia";sym[11]="dry cough,fever,chest pain";cause[11]="There are five cause of Pneumonia:Bacyeria,Viruses,Mycoplasma,Other infectious agents such as fungi and various chemicals.";

        
        
        String q1[]=question.split(" ");
        q2 = Integer.parseInt(q1[0]);
        if(q1[1].equalsIgnoreCase("Causes"))
        {
         
           return "<table border=\"1\">\n" +
"            <thead>\n" +
"                <tr>\n" +
"                    <th>DISEASE</th>\n" +
"                    <th>SYMPTOMS</th>\n" +                   
"                </tr>\n" +
"            </thead>\n" +
"            <tbody>\n" +
"                <tr>\n" +
"                    <td>"+name1[q2]+"</td>\n"+
"                    <td>"+cause[q2]+"</td>\n" +
"                </tr>\n" +
"                \n" +
"            </tbody>\n" +
"        </table>\n" +
""+"<br><br>"+"<br><a href=\"index4.html\">\n" +
"            click here to go back to the previous page\n" +
"        </a>";
        }//end of IF CONDITION
        
        
        
        
           return "<table border=\"1\">\n" +
"            <thead>\n" +
"                <tr>\n" +
"                    <th>DISEASE</th>\n" +
"                    <th>SYMPTOMS</th>\n" +                   
"                </tr>\n" +
"            </thead>\n" +
"            <tbody>\n" +
"                <tr>\n" +
"                    <td>"+name1[q2]+"</td>\n"+
"                    <td>"+sym[q2]+"</td>\n" +
"                </tr>\n" +
"                \n" +
"            </tbody>\n" +
"        </table>\n" +
""+"<br><br>"+"<br><a href=\"index4.html\">\n" +
"            click here to go back to the previous page\n" +
"        </a>";
    }
    
    
    
    
}
