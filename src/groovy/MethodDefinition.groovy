package groovy

class MethodDefinition
{
    static int sum(int a, int b = 5)
    {
        return a+b;
    }
    
    static void main(def args)
    {
        print(sum(1));
    }
}


