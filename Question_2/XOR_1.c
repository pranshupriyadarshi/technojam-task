

int xorOperation(int n, int start){

    int arr[n];
    for(int i= 0; i<n; i++)
    {
        arr[i] = start + 2*i;
    }
    int a = 0;
    for(int i= 0; i<n; i++)
    {
        a = (a^arr[i]);
    }
    return a;
}
