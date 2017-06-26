package es.upm.miw.apiArchitectureSports.wrappers;

import java.util.ArrayList;
import java.util.List;

    public class SportListWrapper {
        List<SportWrapper> sportList;

        
        public SportListWrapper() {
            sportList = new ArrayList<>();
        }

        public List<SportWrapper> getsportList() {
            return sportList;
        }

        public void addSportWrapper(SportWrapper SportWrapper){
            sportList.add(SportWrapper);
        }

        @Override
        public String toString() {
            return "SportListWrapper [sportList=" + sportList + "]";
        }
}