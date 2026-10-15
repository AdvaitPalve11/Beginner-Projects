#include <random>

class Random{

    private:
        int min = 1;
        int max = 100;

    public:

        void setRange(int mi , int ma ){
            if(mi <= ma){
                this->min = mi;
                this->max = ma;
                }
        }

        std::pair <int,int> getRange(){
            return {this->min , this->max};
        }


        int generator(){
            static std::mt19937 gen(std::random_device{}());

            std::uniform_int_distribution<> distrib(min, max);

            return distrib(gen);
        }

};