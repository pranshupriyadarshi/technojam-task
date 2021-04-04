

int minTimeToVisitAllPoints(int** points, int pointsSize, int* pointsColSize){

    int res = 0;
    int i = 0;
    int xoffset = 0;
    int yoffset = 0;

    for(i = 1; i < pointsSize;i++){
        xoffset = abs(points[i][0] - points[i - 1][0]); 
        yoffset = abs(points[i][1] - points[i - 1][1]); 

        if(xoffset < yoffset){
            res += yoffset;
        }
        else{
            res += xoffset;
        }
    }

    return res;
}
