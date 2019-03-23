package com.compilsoft.generics;

public class TypeErasure {

    /*
     * In order to implement generics , Java uses type erasure
     *  This is how generic Java code is handled !!!
     *
     *   - replace all type parameters in generic types with their bounds or Object
     *      if the type parameters are unbounded
     *         So the final bytecode will contain plain java objects/classes
     *
     *   - uses type casts if necessary
     *
     *   - sometimes it generates extra methods : the so called bridge methods
     *         on order to maintain polymorphism with generics types
     *
     *
     *   In the bytecode the following code is equivalent
     *
     *      List<Integer> list = new ArrayList<>();
     *      list.add(3);
     *      Integer num = list.get(0)
     *  -------------------------------------------------
     *      List list = new ArrayList();
     *      list.add(3);
     *      Integer num = (Integer)list.get(0)
     *
     *    ------------------------------------
     *      public class FirstStore<T>{

                 private T item;

               public T getItem() {
                  return item;
                }

            public void setItem(T item) {
              this.item = item;
                }
            }

            In the bytecode

            public class FirstStore{

                 private Object item;

               public Object getItem() {
                  return item;
                }

            public void setItem(Object item) {
              this.item = item;
                }
            }


            If bound is specified
            public class FirstStore<T extends Serializable>{

                 private Serializable item;

               public Serializable getItem() {
                  return item;
                }

            public void setItem(Serializable item) {
              this.item = item;
                }
            }

            public class FirstStore{

                 private Serializable item;

               public Serializable getItem() {
                  return item;
                }

            public void setItem(Serializable item) {
              this.item = item;
                }
            }

     *
     */

    public static void main(String[] args) {

        FirstStore<Integer> firstStore = new FirstStore<>();
    }

}

