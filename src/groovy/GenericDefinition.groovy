package groovy

class GenericDefinition {
    static void main(def args) {
        ListType<String> lstStr = new ListType<>();
        lstStr.setLocalt("First String");
        println lstStr.getLocalt();
    }
    
    
   static class ListType<T> {
        private T localt;
        
        public T getLocalt() {
            return localt;
        }
        
        public void setLocalt(T localt) {
            this.localt = localt;
        }
    }
}
