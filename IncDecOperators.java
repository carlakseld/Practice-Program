class IncDecOperators{
    public static void main(String aksel[]){

        int a=5, b=10, c=3, ans=0;

        ans = a++ + --b + c++;
        System.out.println(ans);
        ans = ++a + b-- + ++c;
        System.out.println(ans);
        ans = a++ + --b + c--;
        System.out.println(ans);
        
            System.out.println(a + " " + b + " " + c);
	}
}