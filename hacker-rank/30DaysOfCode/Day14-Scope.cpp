#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>

using namespace std;

class Difference {
    private:
    vector<int> elements;
  
  	public:
  	int maximumDifference;
    Difference(vector<int> elements){
        this -> elements = elements;
    }
	// Add your code here
    void computeDifference(){
        int i = 0, j = 0, tmp;
        for(i = 0; i < this -> elements.size(); i++){
            for(j = i + 1; j < this -> elements.size(); j++){
                if(this -> elements[i] > this -> elements[j]){
                    tmp = this -> elements[i];
                    this -> elements[i] = this -> elements[j];
                    this -> elements[j] = tmp;
                }
            }
        }
        maximumDifference = this -> elements[this -> elements.size() - 1] - this -> elements[0];
    }

}; // End of Difference class

int main() {
    int N;
    cin >> N;
    
    vector<int> a;
    
    for (int i = 0; i < N; i++) {
        int e;
        cin >> e;
        
        a.push_back(e);
    }
    
    Difference d(a);
    
    d.computeDifference();
    
    cout << d.maximumDifference;
    
    return 0;
}
