package lr;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Stack;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;

public class LR extends javax.swing.JFrame {
      String dlim=" ";
      Gram gram;
      int bflag=0;
      String start="",term="",nonterm="",produ="";
    public LR() {
       
        initComponents();
        setTitle("SLR Parser");
        dtext.setText(dlim);
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        starttext = new javax.swing.JTextPane();
        jScrollPane6 = new javax.swing.JScrollPane();
        nontermtext = new javax.swing.JTextPane();
        jScrollPane7 = new javax.swing.JScrollPane();
        termtext = new javax.swing.JTextPane();
        jScrollPane8 = new javax.swing.JScrollPane();
        prodtext = new javax.swing.JTextPane();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        itemtext = new javax.swing.JTextPane();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        inputtext = new javax.swing.JTextPane();
        jLabel7 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        stab = new javax.swing.JTable();
        jScrollPane9 = new javax.swing.JScrollPane();
        dtext = new javax.swing.JTextPane();
        jLabel10 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1050, 1050));

        jLabel1.setText("Start Symbol");

        jLabel2.setText("Non Terminal (Seperated By ,)");

        jLabel3.setText("Terminals (Seperated By ,)");

        jLabel4.setText("Productions");

        jButton1.setText("Parse It!");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTable1.setCellSelectionEnabled(true);
        jScrollPane1.setViewportView(jTable1);

        jScrollPane5.setViewportView(starttext);

        jScrollPane6.setViewportView(nontermtext);

        jScrollPane7.setViewportView(termtext);

        jScrollPane8.setViewportView(prodtext);

        jButton2.setText("Choose File");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        itemtext.setEditable(false);
        jScrollPane2.setViewportView(itemtext);

        jLabel5.setLabelFor(itemtext);
        jLabel5.setText("Items");

        jLabel6.setLabelFor(inputtext);
        jLabel6.setText("Input String");

        jScrollPane3.setViewportView(inputtext);

        jLabel7.setText("Stack Input Action");

        jButton3.setText("Check the String!");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel8.setText("Made By ------------------------------------------------------------------------------------------------------------------   Parth Gupta(2013UCP1341) ------------- Pankaj Jangid(2013UCP1424)----------------------------------------------------------------------------------------------------------------------");

        jLabel9.setText("LR Table");

        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);

        stab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Stack", "Input", "Action"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        stab.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jScrollPane4.setViewportView(stab);

        jScrollPane9.setViewportView(dtext);

        jLabel10.setText("Delimiter");

        jButton5.setText("Set");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jScrollPane8)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addGap(0, 87, Short.MAX_VALUE))
                                            .addComponent(jScrollPane6))))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel10)
                                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jScrollPane9))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel6)
                                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 33, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 638, Short.MAX_VALUE))
                                .addGap(27, 27, 27)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(456, 456, 456))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane4)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(11, 11, 11)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                            .addComponent(jScrollPane5)
                            .addComponent(jScrollPane6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton1)
                                    .addComponent(jButton2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane9)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(3, 3, 3)
                        .addComponent(jLabel9)
                        .addGap(1, 1, 1)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4))
                .addGap(22, 22, 22)
                .addComponent(jLabel8))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        itemtext.setText("");
        DefaultTableModel dm = (DefaultTableModel)jTable1.getModel();
        dm.setColumnCount(0);
        dm.setRowCount(0);
        gram = new Gram();
        Input(gram);
        bflag=0;
        gram.first();
        gram.follow();
        createTable();
        printTable();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        FileReader fr = null;
          try {
              JFileChooser d = new JFileChooser();
              d.showOpenDialog(jLabel1);
              String path;
              if((path = d.getSelectedFile().getAbsolutePath())!=null){
                bflag = 1;
                File f = new File(path);
                fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);
                term  = br.readLine();
                nonterm = br.readLine();
                start = br.readLine();
                produ = br.readLine();
                termtext.setText(term);
                nontermtext.setText(nonterm);
                starttext.setText(start);
                prodtext.setText(produ);
               }
          } catch (FileNotFoundException ex) {
              Logger.getLogger(LR.class.getName()).log(Level.SEVERE, null, ex);
          } catch (IOException ex) {
              Logger.getLogger(LR.class.getName()).log(Level.SEVERE, null, ex);
          } finally {
              try {
                  fr.close();
              } catch (IOException ex) {
                  Logger.getLogger(LR.class.getName()).log(Level.SEVERE, null, ex);
              }
          }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        DefaultTableModel sm = new DefaultTableModel();
        sm = (DefaultTableModel)stab.getModel();
        sm.setRowCount(0);
        String inp = inputtext.getText();
        inp = inp + dlim+"$";
        Stack<Sitem> stack = new Stack();
        Sitem si = new Sitem(null,0);
        stack.push(si);
        String str[] = inp.split("\\"+dlim);
        int state;
        int is=0;
        String rw[] = new String[3];
        while(true){
            while(str[is].contentEquals(""))
                is++;
            String s = str[is];
            state = stack.peek().state;
            String sp = "0";
            for(int j=1;j<stack.size();j++){
                sp = sp + stack.get(j).gsym.sym + stack.get(j).state;
            }
            rw[0] = sp;
            String pr="";
            for(int i=is;i<str.length;i++){
                pr = pr + str[i];
            }
            rw[1]=pr;
            int pos=-1;
            ArrayList<String>[] st = gram.table.get(state);
            for(Gsym g : gram.term){
                if(g.sym.contentEquals(s)){
                    pos = gram.term.indexOf(g);
                    break;
                }
            }
            if(s.equals("$"))
                pos = gram.term.size();
            if(pos==-1){
                rw[2] = "Invalid Terminal";
                sm.addRow(rw);
                return;
            }else{
                if(st[pos].size() < 1){
                    rw[2] = "Error";
                    sm.addRow(rw);
                    return;
                }
                else if(st[pos].size() > 1){
                    rw[2] = "Conflict";
                    sm.addRow(rw);
                    return;
                }
                String act = st[pos].get(0);
                if(act.charAt(0)=='A'){
                    if(stack.size()==2&&stack.peek().gsym==gram.productions.get(0).right.get(0))
                        rw[2]="Accept";
                    else
                        rw[2]="Error";
                    sm.addRow(rw);
                    return;
                }
                else if(act.charAt(0)=='s'){
                   int nexts = Integer.parseInt(act.substring(1));
                   if(s.equals("$"))
                       si = new Sitem(gram.Dol,nexts);
                   else
                        si = new Sitem(gram.term.get(pos),nexts);
                   stack.push(si);
                   rw[2]="Shift "+nexts;
                   sm.addRow(rw);
                   is++;
                }
                else{
                    int nexts = Integer.parseInt(act.substring(1));
                    Prod pro = gram.productions.get(nexts);
                    for (int x = pro.right.size() - 1; x >= 0; x--) {
                        if(pro.right.get(0) == gram.Null)
                            break;
                        si = stack.pop();
                        if(si.gsym != pro.right.get(x) || stack.size() < 1) {
                            rw[2] = "Error";
                            sm.addRow(rw);
                            return;
                        }
                    }
                    int pk = stack.peek().state;
                    int pl = gram.nonterm.indexOf(pro.left);
                    si = new Sitem(pro.left, Integer.parseInt(gram.table.get(pk)[pl + gram.term.size() + 1].get(0)));
                    stack.push(si);
                    rw[2] = "Replace(" + pro.left.sym + "->";
                    for(Gsym g:pro.right){
                        rw[2] += g.sym;
                    }
                    rw[2] += ")";
                    sm.addRow(rw);
                }
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        dlim = dtext.getText();
    }//GEN-LAST:event_jButton5ActionPerformed
   
    public void printTable(){
        String s[] = new String[gram.nonterm.size() + gram.term.size()+2];
        int ii=0;
        int tableCols = gram.nonterm.size() + gram.term.size() +1;
        DefaultTableModel ym = (DefaultTableModel)jTable1.getModel();
        ym.addColumn("State");
        for(Gsym g:gram.term){
            ym = (DefaultTableModel)jTable1.getModel();
            ym.addColumn(g.sym);
        }
        ym = (DefaultTableModel)jTable1.getModel();
        ym.addColumn(gram.Dol.sym);
        for(Gsym g:gram.nonterm){
            ym = (DefaultTableModel)jTable1.getModel();
            ym.addColumn(g.sym);
        }
        for(ArrayList<String>[] row:gram.table){
            s[ii++] = gram.table.indexOf(row)+"";
            for(int i=0;i<tableCols;i++){
                for(String str:row[i])
                    if(s[ii]!=null)
                        s[ii] = s[ii] + " , "+str;
                    else
                        s[ii] = str+"";
                    ii++;
            }
            
            ym.addRow(s);
            ii=0;
            s = new String[gram.nonterm.size() + gram.term.size()+2];
        }
    }
   
    public void printItemSet(HashSet<Item> I){
        
        Object[] arr = I.toArray();
        itemtext.setText(itemtext.getText() + "{\n");
        for (Object o : arr) {
            Item i = (Item) o;
            itemtext.setText(itemtext.getText() + "    " + i.p.left.sym + " -> ");
            for (int j = 0; j < i.p.right.size(); j++) {
                if (i.p.right.get(j).equals(gram.Null))
                    break;
                if (j == i.pos) {
                    itemtext.setText(itemtext.getText() + ".");
                }
                itemtext.setText(itemtext.getText() + i.p.right.get(j).sym);
            }
            if (i.pos == i.p.right.size()) {
                itemtext.setText(itemtext.getText() + ".");
            }
            itemtext.setText(itemtext.getText() + "\n");
        }
        itemtext.setText(itemtext.getText() + "}\n\n");
    }
   
    public void createTable(){
        
        Gram G = new Gram();
        G.term = gram.term;
        G.nonterm = gram.nonterm;
        G.Null = gram.Null;
        G.Dol = gram.Dol;
        G.first = gram.first;
        G.follow = gram.follow;
        G.productions = new <Prod>ArrayList();
        Gsym X = new Gsym(gram.start.sym + "'", 1);
        G.start = X;
        Prod p = new Prod();
        p.left = X;
        p.right.add(gram.start);
        p.item = new Item[p.right.size() + 1];
        for (int cnt = 0; cnt <= p.right.size(); cnt++) {
            Item i = new Item();
            i.p = p;
            i.pos = cnt;
            p.item[cnt] = i;
        }
        G.productions.add(p);
        G.productions.addAll(gram.productions);
        ArrayList<HashSet<Item>> C = new <HashSet<Item>>ArrayList();
        HashSet<Item> I = new <Item>HashSet();
        HashSet<Item> temp;
        I.add(p.item[0]);
        I = G.closure(I);
        C.add(I);
        int terms = G.term.size();
        int tableCols = G.nonterm.size() + terms + 1;
        for (int ind = 0; ind < C.size(); ind++) {
            HashSet<Item> i = C.get(ind);
            ArrayList<String>[] row = new ArrayList[tableCols];
            for (int col = 0; col < tableCols; col++) {
                row[col] = new ArrayList<String>();
            }
            itemtext.setText(itemtext.getText() + "I" + ind);
            printItemSet(i);
            for (Gsym g : G.nonterm) {
                temp = G.gotofunc(i, g);
                if (temp.isEmpty() == false) {
                    int check = 0;
                    int a = G.nonterm.indexOf(g);
                    int j;
                    for (HashSet<Item> itt : C) {
                        if (itt.containsAll(temp) == true && temp.containsAll(itt)==true) {
                            check = 1;
                            j = C.indexOf(itt);
                            row[terms + a + 1].add("" + j);
                        }
                    }
                    if (check == 0) {
                        C.add(temp);
                        j = C.indexOf(temp);
                        row[terms + a + 1].add("" + j);
                    }
                }
            }
            for (Gsym g : G.term) {
                temp = G.gotofunc(i, g);
                if (temp.isEmpty() == false) {
                    int check = 0;
                    int a = G.term.indexOf(g);
                    int j;
                    for (HashSet<Item> itt : C) {
                        if (itt.containsAll(temp) == true && temp.containsAll(itt) == true) {
                            check = 1;
                            j = C.indexOf(itt);
                            row[a].add("s" + j);
                        }
                    }
                    if (check == 0) {
                        C.add(temp);
                        j = C.indexOf(temp);
                        row[a].add("s" + j);
                    }
                }
            }
            Object[] arr = i.toArray();
            for (Object o : arr) {
                Item item = (Item) o;
                if (item.pos == item.p.right.size()) {
                    int a = G.nonterm.indexOf(item.p.left);
                    if (item.p.left == G.start) {
                        row[terms].add("Accept");
                    } else {
                        HashSet<Gsym> set = G.follow[a];
                        Object[] arr1 = set.toArray();
                        for (Object o1 : arr1) {
                            Gsym sym = (Gsym) o1;
                            int b = G.term.indexOf(sym);
                            if (sym.equals(G.Dol)) {
                                b = terms;
                            }
                            row[b].add("r" + G.productions.indexOf(item.p));
                        }
                    }
                }
            }
            G.table.add(row);
        }
        gram = G;
    }
    
    public static void main(String args[]) {

        try {
            try {
                for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                    if ("Nimbus".equals(info.getName())) {
                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                        break;
                    }
                }
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
                java.util.logging.Logger.getLogger(LR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            java.awt.EventQueue.invokeLater(new Runnable() {
                @Override
                public void run() {
                    new LR().setVisible(true);
                }
            });

        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(LR.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
    public void Input(Gram gram){
        
        String str;
        if (bflag != 1) {
            str = termtext.getText();
        } else {
            str = term;
        }
        String s1[] = str.split(",");
        Gsym gsym;
        for (String loop : s1) {
            gsym = new Gsym(loop, 0);
            gram.term.add(gsym);
        }
        if (bflag != 1) {
            str = nontermtext.getText();
        } else {
            str = nonterm;
        }
        String s2[] = str.split(",");
        for (String loop : s2) {
            gsym = new Gsym(loop, 1);
            gram.nonterm.add(gsym);
        }
        if (bflag != 1) {
            str = starttext.getText();
        } else {
            str = start;
        }
        gsym = new Gsym(str, 1);
        for (int i = 0; i < gram.nonterm.size(); i++) {
            if (gram.nonterm.get(i).sym.contentEquals(gsym.sym)) {
                gram.start = gram.nonterm.get(i);
            }
        }
        if (bflag != 1) {
            str = prodtext.getText();
        } else {
            str = produ;
        }
        String s3[] = str.split("\\,");

        for (String loop : s3) {
            Prod prod = new Prod();
            String x[] = loop.split("\\->");
            gsym = new Gsym(x[0], 1);
            for (int i = 0; i < gram.nonterm.size(); i++) {
                if (gram.nonterm.get(i).sym.contentEquals(gsym.sym)) {
                    prod.left = gram.nonterm.get(i);
                }
            }
            if (x[1].contentEquals("^")) {
                prod.right.add(gram.Null);
            } else {
                String xx[] = x[1].split("\\" + dlim);
                for (String loo : xx) {
                    gsym = new Gsym(loo, 0);
                    for (int i = 0; i < gram.nonterm.size(); i++) {
                        if (gram.nonterm.get(i).sym.contentEquals(gsym.sym)) {
                            prod.right.add(gram.nonterm.get(i));
                        }
                    }
                    for (int i = 0; i < gram.term.size(); i++) {
                        if (gram.term.get(i).sym.contentEquals(gsym.sym)) {
                            prod.right.add(gram.term.get(i));
                        }
                    }
                }
            }
            gram.productions.add(prod);
        }
        for (Prod p : gram.productions) {
            p.item = new Item[p.right.size() + 1];
            if (p.right.get(0).equals(gram.Null)) {
                Item i = new Item();
                i.p = p;
                i.pos = 1;
                p.item[0] = i;
                p.item[1] = i;
            }
            else
                for (int cnt = 0; cnt <= p.right.size(); cnt++) {
                    Item i = new Item();
                    i.p = p;
                    i.pos = cnt;
                    p.item[cnt] = i;
                }
        }
        int nont = gram.nonterm.size();
        gram.first = new HashSet[nont];
        gram.follow = new HashSet[nont];
        for (int a = 0; a < nont; a++) {
            gram.first[a] = new <Gsym>HashSet();
            gram.follow[a] = new <Gsym>HashSet();
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane dtext;
    private javax.swing.JTextPane inputtext;
    private javax.swing.JTextPane itemtext;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextPane nontermtext;
    private javax.swing.JTextPane prodtext;
    private javax.swing.JTable stab;
    private javax.swing.JTextPane starttext;
    private javax.swing.JTextPane termtext;
    // End of variables declaration//GEN-END:variables
}

