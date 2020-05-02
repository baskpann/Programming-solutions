#include <bits/stdc++.h>

using namespace std;

void hourglassSum(vector<vector<int>> arr){
    int i, j, sum = 0, maxSum = -999;
    for(i = 0; i < 4; i++){
        for(j = 0; j < 4; j++){
            sum = (arr[i][j] + arr[i][j + 1] + arr[i][j + 2]) + arr[i + 1][j + 1] + (arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2]);
            if(sum > maxSum)
                maxSum = sum;
        }
    }
    cout << maxSum;
}

int main()
{
    vector<vector<int>> arr(6);
    for (int i = 0; i < 6; i++) {
        arr[i].resize(6);
        for (int j = 0; j < 6; j++)
            cin >> arr[i][j];
        cin.ignore(numeric_limits<streamsize>::max(), n);
    }
    hourglassSum(arr);
    return 0;
}

