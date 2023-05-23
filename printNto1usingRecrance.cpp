
#include <iostream>
using namespace std;

void reverse(int n)
{
    if (n == 0)
    {
        cout << "1";
        return;
    }
    else
    {
        cout<<n<< endl;
        reverse(n-1) ;
        
    }
}
int main()
{
    int num;

    cout << "Enter a number";
    cin >> num;

    reverse(num);
    return 0;
}