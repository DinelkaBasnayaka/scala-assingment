#include <iostream>
#include<string>
using namespace std;
int main(){
	
	string x,y; int b,choice; char c,d; int key=3;
	cout<<"1.Encryption\n";
    cout<<"2.Decryption\n";	
	cout<<"What is your choice(1,2):";
	cin>>choice;
	
	if(choice==1){
		
		cout<<"\nEnter the text:";
		cin>>x;
		cout<<"\n      Enctyption:";
		
		for(int i=0;i<x.length();i++){
		
		b=x[i];
		b=b-97+key;
		b=b%26;
		b=b+97;
		
		c=b;
		cout<<c;
    	}
	}else{
	
       cout<<"\nEnter the text:";
       cin>>y;
	   cout<<"\n      DEcryption:";	
	for(int i=0;i<y.length();i++){
		
		b=y[i];
		b=b-97-key+26;
		b=b%26;
		b=b+97;
		
		d=b;
		cout<<d; 
	  }
    }
 return 0;
}

