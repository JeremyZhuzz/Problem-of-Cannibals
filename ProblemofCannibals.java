import java.util.HashSet;
import java.util.Set;
//close to due time.
//Dont have time to debug
public class ProblemofCannibals extends Problem {
    //initialize people
    static final int cann1 = 0;
    static final int cann2 = 1;
    static final int cann3 = 2; 
    static final int miss1 = 3;
    static final int miss2 = 4;
    static final int miss3 = 5;
    static final int n = 6;
    boolean goal_test(Object state) {
        StateofCannibals newstate = (StateofCannibals) state;
        //if right side has 3 cannibals and 3 missionary, reaching the goal state.
        if (newstate.stateArray[cann1] == 1 && newstate.stateArray[miss2] == 1 && newstate.stateArray[miss3] == 1
            &&newstate.stateArray[cann2]==1 && newstate.stateArray[cann3] ==1 && newstate.stateArray[miss1]==1 ) {
            return true;
        }else{
            return false;
        }
    }

    Set<Object> getSuccessors(Object state) {

        Set<Object> set = new HashSet<Object>();
        StateofCannibals s = (StateofCannibals) state;

        //Let's create without any constraint, then remove the illegal ones
        //one cannibal from left to right
        StateofCannibals successorS;

        if(s.stateArray[cann1]==0){
            successorS = new StateofCannibals(s);
            successorS.stateArray[cann1] =1;
            set.add(successorS);
                if(checkif(s)){
                    return set;
                
            }
        }
        if(s.stateArray[cann2]==0){
            successorS = new StateofCannibals(s);
            successorS.stateArray[cann2] =1;
            set.add(successorS);
                if(checkif(s)){
                    return set;
                
            }
        }
        if(s.stateArray[cann3]==0){
            successorS = new StateofCannibals(s);
            successorS.stateArray[cann3] =1;
            set.add(successorS);
                if(checkif(s)){
                    return set;
                
            }
        }
        if(s.stateArray[miss1]==0){
            successorS = new StateofCannibals(s);
            successorS.stateArray[miss1] =1;
            set.add(successorS);
                if(checkif(s)){
                    return set;
                
            }
        }
        if(s.stateArray[miss2]==0){
            successorS = new StateofCannibals(s);
            successorS.stateArray[miss2] =1;
            set.add(successorS);
                if(checkif(s)){
                    return set;
                
            }
        }
        if(s.stateArray[miss3]==0){
            successorS = new StateofCannibals(s);
            successorS.stateArray[miss3] =1;
            set.add(successorS);
                if(checkif(s)){
                    return set;
                
            }
        }
        if(s.stateArray[cann1]==1){
            successorS = new StateofCannibals(s);
            successorS.stateArray[cann1] =0;
            set.add(successorS);
                if(checkif(s)){
                    return set;
                
            }
        }
        if(s.stateArray[cann2]==1){
            successorS = new StateofCannibals(s);
            successorS.stateArray[cann2] =0;
            set.add(successorS);
                if(checkif(s)){
                    return set;
                
            }
        }
        if(s.stateArray[cann3]==1){
            successorS = new StateofCannibals(s);
            successorS.stateArray[cann3] =0;
            set.add(successorS);
                if(checkif(s)){
                    return set;
                
            }
        }
        if(s.stateArray[miss1]==1){
            successorS = new StateofCannibals(s);
            successorS.stateArray[miss1] =0;
            set.add(successorS);
                if(checkif(s)){
                    return set;
                
            }
        }
        if(s.stateArray[miss2]==1){
            successorS = new StateofCannibals(s);
            successorS.stateArray[miss2] =0;
            set.add(successorS);
                if(checkif(s)){
                    return set;
                
            }
        }
        if(s.stateArray[miss3]==1){
            successorS = new StateofCannibals(s);
            successorS.stateArray[miss3] =0;
            set.add(successorS);
                if(checkif(s)){
                    return set;
                
            }
        }
        if(s.stateArray[cann1]==0&&s.stateArray[cann2]==0){
            successorS = new StateofCannibals(s);
            successorS.stateArray[cann1] =1;
            successorS.stateArray[cann2] =1;
            set.add(successorS);
                if(checkif(s)){
                    return set;
                
            }
        }
        if(s.stateArray[cann1]==1&&s.stateArray[cann2]==1){
            successorS = new StateofCannibals(s);
            successorS.stateArray[cann1] =0;
            successorS.stateArray[cann2] =0;
            set.add(successorS);
                if(checkif(s)){
                    return set;
                
            }
        }
        if(s.stateArray[cann1]==0&&s.stateArray[cann3]==0){
            successorS = new StateofCannibals(s);
            successorS.stateArray[cann1] =1;
            successorS.stateArray[cann3] =1;
            set.add(successorS);
                if(checkif(s)){
                    return set;
                
            }
        }
        if(s.stateArray[cann1]==1&&s.stateArray[cann3]==1){
            successorS = new StateofCannibals(s);
            successorS.stateArray[cann1] =0;
            successorS.stateArray[cann3] =0;
            set.add(successorS);
                if(checkif(s)){
                    return set;
                
            }
        }
        if(s.stateArray[cann1]==0&&s.stateArray[miss1]==0){
            successorS = new StateofCannibals(s);
            successorS.stateArray[cann1] =1;
            successorS.stateArray[miss1] =1;
            set.add(successorS);
                if(checkif(s)){
                    return set;
                
            }
        }
        if(s.stateArray[cann1]==1&&s.stateArray[miss1]==1){
            successorS = new StateofCannibals(s);
            successorS.stateArray[cann1] =0;
            successorS.stateArray[miss1] =0;
            set.add(successorS);
                if(checkif(s)){
                    return set;
                
            }
        }
        if(s.stateArray[cann1]==0&&s.stateArray[miss2]==0){
            successorS = new StateofCannibals(s);
            successorS.stateArray[cann1] =1;
            successorS.stateArray[miss2] =1;
            set.add(successorS);
                if(checkif(s)){
                    return set;
                
            }
        }
        if(s.stateArray[cann1]==1&&s.stateArray[miss2]==1){
            successorS = new StateofCannibals(s);
            successorS.stateArray[cann1] =0;
            successorS.stateArray[miss2] =0;
            set.add(successorS);
                if(checkif(s)){
                    return set;
                
            }
        }
        if(s.stateArray[cann1]==0&&s.stateArray[miss3]==0){
            successorS = new StateofCannibals(s);
            successorS.stateArray[cann1] =1;
            successorS.stateArray[miss3] =1;
            set.add(successorS);
                if(checkif(s)){
                    return set;
                
            }
        }
        if(s.stateArray[cann1]==1&&s.stateArray[miss3]==1){
            successorS = new StateofCannibals(s);
            successorS.stateArray[cann1] =0;
            successorS.stateArray[miss3] =0;
            set.add(successorS);
                if(checkif(s)){
                    return set;
                }
            
        }

        if(s.stateArray[cann2]==0&&s.stateArray[cann3]==0){
            successorS = new StateofCannibals(s);
            successorS.stateArray[cann2] =1;
            successorS.stateArray[cann3] =1;
            set.add(successorS);
                if(checkif(s)){
                    return set;
                }
            
        }
        if(s.stateArray[cann2]==1&&s.stateArray[cann3]==1){
            successorS = new StateofCannibals(s);
            successorS.stateArray[cann2] =0;
            successorS.stateArray[cann3] =0;
            set.add(successorS);
                if(checkif(s)){
                    return set;
                
            }
        }
        if(s.stateArray[cann2]==0&&s.stateArray[miss1]==0){
            successorS = new StateofCannibals(s);
            successorS.stateArray[cann2] =1;
            successorS.stateArray[miss1] =1;
            set.add(successorS);
                if(checkif(s)){
                    return set;
                
            }
        }
        if(s.stateArray[cann2]==1&&s.stateArray[miss1]==1){
            successorS = new StateofCannibals(s);
            successorS.stateArray[cann2] =0;
            successorS.stateArray[miss1] =0;
            set.add(successorS);
                if(checkif(s)){
                    return set;
                
            }
        }
        if(s.stateArray[cann2]==0&&s.stateArray[miss2]==0){
            successorS = new StateofCannibals(s);
            successorS.stateArray[cann2] =1;
            successorS.stateArray[miss2] =1;
            set.add(successorS);
                if(checkif(s)){
                    return set;
                
            }
        }
        if(s.stateArray[cann2]==1&&s.stateArray[miss2]==1){
            successorS = new StateofCannibals(s);
            successorS.stateArray[cann2] =0;
            successorS.stateArray[miss2] =0;
            set.add(successorS);
                if(checkif(s)){
                    return set;
                
            }
        }
        if(s.stateArray[cann2]==0&&s.stateArray[miss3]==0){
            successorS = new StateofCannibals(s);
            successorS.stateArray[cann2] =1;
            successorS.stateArray[miss3] =1;
            set.add(successorS);
                if(checkif(s)){
                    return set;
                
            }
        }
        if(s.stateArray[cann2]==1&&s.stateArray[miss3]==1){
            successorS = new StateofCannibals(s);
            successorS.stateArray[cann2] =0;
            successorS.stateArray[miss3] =0;
            set.add(successorS);
                if(checkif(s)){
                    return set;
                
            }
        }

        if(s.stateArray[cann3]==0&&s.stateArray[miss1]==0){
            successorS = new StateofCannibals(s);
            successorS.stateArray[cann3] =1;
            successorS.stateArray[miss1] =1;
            set.add(successorS);
                if(checkif(s)){
                    return set;
                
            }
        }
        if(s.stateArray[cann3]==1&&s.stateArray[miss1]==1){
            successorS = new StateofCannibals(s);
            successorS.stateArray[cann3] =0;
            successorS.stateArray[miss1] =0;
            set.add(successorS);
                if(checkif(s)){
                    return set;
                }
            
        }
        if(s.stateArray[cann3]==0&&s.stateArray[miss2]==0){
            successorS = new StateofCannibals(s);
            successorS.stateArray[cann3] =1;
            successorS.stateArray[miss2] =1;
            set.add(successorS);
                if(checkif(s)){
                    return set;
                
            }
        }
        if(s.stateArray[cann3]==1&&s.stateArray[miss2]==1){
            successorS = new StateofCannibals(s);
            successorS.stateArray[cann3] =0;
            successorS.stateArray[miss2] =0;
            set.add(successorS);
                if(checkif(s)){
                    return set;
                }
            
        }
        if(s.stateArray[cann3]==0&&s.stateArray[miss3]==0){
            successorS = new StateofCannibals(s);
            successorS.stateArray[cann3] =1;
            successorS.stateArray[miss3] =1;
            set.add(successorS);
                if(checkif(s)){
                    return set;
                
            }
        }
        if(s.stateArray[cann3]==1&&s.stateArray[miss3]==1){
            successorS = new StateofCannibals(s);
            successorS.stateArray[cann3] =0;
            successorS.stateArray[miss3] =0;
            set.add(successorS);
                if(checkif(s)){
                    return set;
                
            }
        }

        if(s.stateArray[miss1]==0&&s.stateArray[miss2]==0){
            successorS = new StateofCannibals(s);
            successorS.stateArray[miss1] =1;
            successorS.stateArray[miss2] =1;
            set.add(successorS);
                if(checkif(s)){
                    return set;
                
            }
        }
        if(s.stateArray[miss1]==1&&s.stateArray[miss2]==1){
            successorS = new StateofCannibals(s);
            successorS.stateArray[miss1] =0;
            successorS.stateArray[miss2] =0;
            set.add(successorS);
                if(checkif(s)){
                    return set;
                
            }
        }
        if(s.stateArray[miss1]==0&&s.stateArray[miss3]==0){
            successorS = new StateofCannibals(s);
            successorS.stateArray[miss1] =1;
            successorS.stateArray[miss3] =1;
            set.add(successorS);
                if(checkif(s)){
                    return set;
                }
                
            }
        
        if(s.stateArray[miss1]==1&&s.stateArray[miss3]==1){
            successorS = new StateofCannibals(s);
            successorS.stateArray[miss1] =0;
            successorS.stateArray[miss3] =0;
            set.add(successorS);
                if(checkif(s)){
                    return set;
                
            }
        }

        if(s.stateArray[miss2]==0&&s.stateArray[miss3]==0){
            successorS = new StateofCannibals(s);
            successorS.stateArray[miss2] =1;
            successorS.stateArray[miss3] =1;
            set.add(successorS);
                if(checkif(s)){
                    return set;
                
            }
        }
        if(s.stateArray[miss2]==1&&s.stateArray[miss3]==1){
            successorS = new StateofCannibals(s);
            successorS.stateArray[miss2] =0;
            successorS.stateArray[miss3] =0;
            set.add(successorS);
                if(checkif(s)){
                    return set;
                }
            
        }
         
         
        return set;
    }

    private boolean checkif(StateofCannibals state) {
        //Checking to see if any element of the array is negative 

        
        //check if cannibals outnumber the missionaries
        if(state.stateArray[cann1]==0&&state.stateArray[cann2]==0&&state.stateArray[miss1]==0){
                return false;
        }
        int x =0;
        int y =0;
        for(int i = 0;i<3;i++){
            if(state.stateArray[i]==0){
                x++;
            }else{
                y++;
            }

        }
        int a = 0;
        int b = 0;
        for(int i = 2;i<5;i++){
            if(state.stateArray[i]==0){
                a++;
            }else{
                b++;
            }

        }
        if(x>a||y>b){
            return false;
        }







        return true;
    }

    double step_cost(Object fromState, Object toState) {
        return 1;
    }
    //question 5 
    public double h(Object state) {
        return 1;
    }

    public static void main(String[] args) throws Exception {
        ProblemofCannibals problem = new ProblemofCannibals();
        int[] array = new int[n];
        problem.initialState = new StateofCannibals(array);

        Search search = new Search(problem);

        System.out.println("Tree search: \n");
        System.out.println("BreadthFirstTreeSearch:\t\t" + search.BreadthFirstTreeSearch());
        System.out.println("DepthFirstTreeSearch:\t\t" + search.DepthFirstTreeSearch());
        System.out.println("UniformCostTreeSearch:\t\t" + search.UniformCostTreeSearch());
        System.out.println("GreedyBestFirstTreeSearch:\t\t" + search.GreedyBestFirstTreeSearch());
        System.out.println("AstarTreeSearch:\t\t" + search.AstarTreeSearch());
        // System.out.println("IterativeDeepeningTreeSearch:\t\t" + search.IterativeDeepeningTreeSearch());
        System.out.println("\n");
        System.out.println("Graph search: \n");
        System.out.println("BreadthFirstGraphSearch:\t" + search.BreadthFirstTreeSearch());
        System.out.println("DepthFirstGraphSearch:\t\t" + search.DepthFirstGraphSearch());
        System.out.println("UniformCostGraphSearch:\t\t" + search.UniformCostGraphSearch());
        System.out.println("GreedyBestGraphTreeSearch:\t\t" + search.GreedyBestFirstGraphSearch());
        System.out.println("AstarGraphSearch:\t\t" + search.AstarGraphSearch());
        // System.out.println("IterativeDeepeningGraphSearch:\t\t" + search.IterativeDeepeningGraphSearch());
    }
}
