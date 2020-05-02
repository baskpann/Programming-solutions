#include <iostream>
#include <vector>

using namespace std;


class Person{
	protected:
		string firstName;
		string lastName;
		int id;
	public:
		Person(string firstName, string lastName, int identification){
			this->firstName = firstName;
			this->lastName = lastName;
			this->id = identification;
		}
		void printPerson(){
			cout<< "Name: "<< lastName << ", "<< firstName <<"\nID: "<< id << "\n"; 
		}
	
};

class Student :  public Person{
	private:
		vector<int> testScores;  
	public:
        /*	
        *   Class Constructor
        *   
        *   Parameters:
        *   firstName - A string denoting the Person's first name.
        *   lastName - A string denoting the Person's last name.
        *   id - An integer denoting the Person's ID number.
        *   scores - An array of integers denoting the Person's test scores.
        */
        // Write your constructor here
        Student(string firstName, string lastName, int identification, vector<int> testScores) : Person(firstName, lastName, identification), testScores(testScores){
            
        }
        /*	
        *   Function Name: calculate
        *   Return: A character denoting the grade.
        */
        // Write your function here
        float calcAvg(vector<int> arr){
            //int n = sizeof(arr)/sizeof(arr[0]), i;
            int sum = 0;
            for(int i : arr)
                sum += i;
            return sum / arr.size();
        }
        char calculate(){
            char grade;
            float avg = calcAvg(this -> testScores);
            if(avg >= 90 && avg <= 100)
                grade = 'O';
            else if(avg >= 80 && avg < 90)
                grade = 'E';
            else if(avg >= 70 && avg < 80)
                grade = 'A';
            else if(avg >= 55 && avg < 70)
                grade = 'P';
            else if(avg >= 40 && avg < 55)
                grade = 'D';
            else
                grade = 'T';
            return grade;
        }
};

int main() {
	string firstName;
  	string lastName;
	int id;
  	int numScores;
	cin >> firstName >> lastName >> id >> numScores;
  	vector<int> scores;
  	for(int i = 0; i < numScores; i++){
	  	int tmpScore;
	  	cin >> tmpScore;
		scores.push_back(tmpScore);
	}
	Student* s = new Student(firstName, lastName, id, scores);
	s->printPerson();
	cout << "Grade: " << s->calculate() << "\n";
	return 0;
}
