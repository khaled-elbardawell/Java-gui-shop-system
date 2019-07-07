package testjava;



import java.util.*;


public class store {
    
         // arrays >> list
         public static ArrayList<Customer> cc = new ArrayList<>();
         public static ArrayList<Product> pp = new ArrayList<>();
         public static ArrayList <Dep> dd = new ArrayList<>();
         
         // set >> للتجقق من عدم التكرار 
         public static  Collection <String> xx=new HashSet();
         public static  Collection <String> xx1=new HashSet();
         public static  Collection <String> xx2=new HashSet();
           
   
           // دوال البحث       
                   
            // دالة البحث عن اسم القسم (التكرار)        
        public static boolean serchDep(String x){
            for(int i=0;i<dd.size();i++){
                xx.add(dd.get(i).d_name); 
            }
            if(xx.add(x)==true){
                return true;
            }
            return false;
           
        }
               
            
        // دالة البحث عن اسم المنتج ( التكرار) 
        public static boolean serchPro(String x){
            for(int i=0;i<pp.size();i++){
                xx1.add(pp.get(i).P_name); 
            }
            if(xx1.add(x)==true){
                return true;
            }
            return false;
        }
             
        // دالة البحث عن اسم المستخدم (التكرار)
        public static boolean serchCust(String x){
            if(x==null || x==""){
                return false;
            }
            for(int i=0;i<cc.size();i++){
                xx2.add(cc.get(i).getC_username()+"");  
            }
            if(xx2.add(x)==true){
                return true;
            }       
            return false;
        }

        // دالة فحص النص (لا يقبل ارقام)   
        // لا يقبل نص فارغ
        public static boolean checkName(String name){
            int i =0; 
            if(name.length()!=i){
	        while(i<name.length()){
	            char x=  name.charAt(i);
	            if(((x>=65 && x<=91) || (x>=97 && x<=123)) && (name!=null))
		        ++i;
	            else{
	                return false;
	            }
		}
	        return true;
	    }
            return false;
        }
           
        public static boolean checkUserName(Object Username){
            String s=Username+"";
            int i =0; 
                if(s.length()!=i){
                   return true; 
                }
            return false;
        }

        // فحص الاشعارات
             
        public static boolean checkNof(String Nof){
            for (int i=0;i<store.cc.size();i++){
                if( (LoginWindow.un.equals(store.cc.get(i).c_username))){ 
                    for(int g=0;g<store.cc.get(i).b.size();g++){
                       if(Nof.equals(store.cc.get(i).b.get(g).x)){
                           return true;
                       } 
                    } 
                }
            }
            return false;
        }
                          
                          
        public static boolean checkFivourites(String fiv){
            for (int i=0;i<store.cc.size();i++){
                if( (LoginWindow.un.equals(store.cc.get(i).c_username))){ 
                    for(int g=0;g<store.cc.get(i).favourites.size();g++){
                       if(fiv.equals(store.cc.get(i).favourites.get(g).x)){
                           return true;
                       } 
                    }
                }
            }
            return false;
        }
                      
}              
                        

