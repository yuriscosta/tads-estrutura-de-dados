/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arvore;

/**
 *
 * @author yuri
 */
public class Arvore implements IArvore {

    private No root;
    private int length;

    public void Arvore() {
        
    }

    @Override
    public int size() {
        return length;
    }

    /*@Override
    public int heigth(No no) {
        if (isExternal(no)) {
            return 0;
        }
        
        int h = 0;
        for(No node : no.getChild()) {
            
        }
    }*/

    @Override
    public boolean isEmpty() {
        return root() == null;
    }

    @Override
    public void elements() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void nos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public No root() {
        return root;
    }

    @Override
    public No parent(No no) {
        return no.getParent();
    }

    public No children(No no) {
        Object children[] = (Object[]) no.getChildren();
        for (Object c : children) {
            return (No) c;
        }
        
        return null;
    }

    @Override
    public boolean isInternal(No no) {
        return no.getLeftSon() != null || no.getRightSon() != null;
    }

    @Override
    public boolean isExternal(No no) {
        return no.getLeftSon() == null && no.getRightSon() == null;
    }

    @Override
    public boolean isRoot(No no) {
        return root() == no;
    }

    @Override
    public int depth(No no) {
        if (isRoot(no)) {
            return 0;
        }

        return 1 + depth(parent(no));
    }

    @Override
    public Object replace(No no, Object obj) {
        Object aux = no.getElement();
        no.setElement(obj);

        return aux;
    }
    
    public void setRoot(No no) {
        root = no;
    }
    
    public No getRoot() {
        return root;
    }

}