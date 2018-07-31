/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temp;

import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author santosh
 */
@Local
public interface entityclass1FacadeLocal {

    void create(entityclass1 entityclass1);

    void edit(entityclass1 entityclass1);

    void remove(entityclass1 entityclass1);

    entityclass1 find(Object id);

    List<entityclass1> findAll();

    List<entityclass1> findRange(int[] range);

    int count();

    String register_user(String name, int age, String gender, String password);

    String intial1(String symptoms1);

    String insert_disease_data(String name, String symtpms, String cause1, String test1,String w,int m,int n,int c);

    String question_answer(String question);
    
}
