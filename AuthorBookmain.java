 class Author{
    String aname,aemail;
    char agender;
    Author(String an,String ae,char ag){
        aname = an;
        aemail = ae;
        agender = ag; 

    }
    public String tostring(){
        return"Author name = "+aname+"Author email="+aemail+"Author gender="+agender;
    }
 }
 class Book{
    String bname;
    Author author;
    double bprice;
    int bqty;
    Book(String bn,Author auth,double bp,int bq){
        bname = bn;
        author = auth;
        bprice = bp;
        bqty = bq;
    }
        public String toString(){
            return"Book name = "+bname+" Book Author ="+author+"Book price="+bprice+"Book quantity="+bqty;

        }
    
 
    }
    class AuthorBookmain{
        public static void main(String []args){
            Author a1 =new Author("Lucky","lucky@gmail.com",'M');
            Book b1 = new Book("java",a1,111.11,101);
        }

    }