#include<iostream>
using namespace std;

class HomoSapience
    {

        public:

        double lefthandSum()
            {
                double x,y;
                cin>>x>>y;
                return x+y;
            }

    };

int main()
{
    HomoSapience samin;

    double sum = samin.lefthandSum();
    cout<<sum<<endl;
}