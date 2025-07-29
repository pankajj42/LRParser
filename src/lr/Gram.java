package lr;

import java.util.ArrayList;
import java.util.HashSet;

public class Gram {
    public ArrayList<Gsym> term;
    public ArrayList<Gsym> nonterm;
    public Gsym start ,Null=null , Dol=null;
    public ArrayList<Prod> productions;
    public HashSet<Gsym>[] follow,first;
    public ArrayList<ArrayList<String>[]> table;
    
    public Gram(){
        this.term = new <Gsym>ArrayList();
        this.nonterm = new <Gsym>ArrayList();
        this.productions = new <Prod>ArrayList();
        this.Null = new Gsym("^",0);
        this.Dol = new Gsym("$",0);
        this.table = new <ArrayList<String>[]>ArrayList();
    }
    
    public void first(){
        int flag;
        do{
            flag = 0;
            for(Gsym A : this.nonterm){
                int ind = this.nonterm.indexOf(A);
                int size = this.first[ind].size();
                for(Prod p:this.productions){
                    if(p.left.equals(A)){
                        if(p.right.get(0).flag==0){
                            this.first[ind].add(p.right.get(0));
                        }
                        else{
                            for(Gsym g: p.right){
                                if(g.flag == 0){
                                    this.first[ind].add(g);
                                    break;
                                }
                                int index = this.nonterm.indexOf(g);
                                this.first[ind].addAll(this.first[index]);
                                if(this.first[index].contains(this.Null)){
                                    if(g!=p.right.get(p.right.size()-1))
                                        this.first[ind].remove(this.Null);
                                }else{
                                    break;
                                }
                            }
                        }
                    }
                }
                if(size < this.first[ind].size())
                    flag =1;
            }
        }while(flag == 1);
    }
    
    public HashSet firstAlpha(ArrayList<Gsym> gsym){
        HashSet set = new HashSet();
        for(Gsym g : gsym){
            if(g.flag == 0){
                set.add(g);
                break;
            }
            int ind = this.nonterm.indexOf(g);
            HashSet h = this.first[ind];
            set.addAll(h);
            if(!h.contains(this.Null))
               break;
            else{
                if(g == gsym.get(gsym.size()-1)){
                    set.add(this.Null);
                }
            }
        }
        return set;
    }
    
    public void follow(){
        int ind = this.nonterm.indexOf(this.start);
        this.follow[ind].add(this.Dol);
        int flag;
        do{
            flag=0;
            for(Gsym nt : this.nonterm){
                ind = this.nonterm.indexOf(nt);
                int size = this.follow[ind].size();
                for(Prod p : this.productions){
                    int j = p.right.indexOf(nt);
                    if(j!=-1){
                        if(j < p.right.size()-1){
                            ArrayList<Gsym> newarr = new <Gsym>ArrayList();
                            for(int k=j+1 ; k < p.right.size() ; k++){
                                newarr.add(p.right.get(k));
                            }
                            HashSet h = firstAlpha(newarr);
                            this.follow[ind].addAll(h);
                            this.follow[ind].remove(this.Null);
                            if(h.contains(this.Null)){
                                this.follow[ind].addAll(this.follow[this.nonterm.indexOf(p.left)]);
                            }
                        }
                        else{
                            this.follow[ind].addAll(this.follow[this.nonterm.indexOf(p.left)]);
                        }
                    }
                }
                if(size < this.follow[ind].size())
                    flag=1;
            }
        }while(flag==1);
    }
    
    public HashSet closure(HashSet<Item> I){
        HashSet<Item> h = new <Item>HashSet();
        h.addAll(I);
        int flag;
        do{
            flag = 0;
            int size = h.size();
            Object[] obj = h.toArray();
            for(Object o : obj){
                Item item = (Item)o;
                if(item.p.right.get(0) != this.Null  &&  item.pos < item.p.right.size()  && 
                        item.p.right.get(item.pos).flag == 1){
                    Gsym g=item.p.right.get(item.pos);
                    for(Prod p:this.productions)
                        if(p.left.equals(g))
                            h.add(p.item[0]);
                }
            }
            if(size < h.size())
                flag=1;
        }while(flag == 1);
        return h;
    }
    
    public HashSet gotofunc(HashSet<Item> I,Gsym X){
        HashSet<Item> h =new <Item>HashSet();
        Object[] obj = I.toArray();
        for(Object o : obj){
            Item item = (Item)o;
            if(item.p.right.get(0) != this.Null  &&  item.pos < item.p.right.size()  && 
                    item.p.right.get(item.pos) == X){
                h.add(item.p.item[item.pos + 1]);
            }
        }
        h = closure(h);
        return h;
    }

}
