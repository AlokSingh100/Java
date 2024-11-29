package mvc.Assiment.Youtuber;

import java.util.ArrayList;
import java.util.List;

public class Youtuber implements youtubes{
    private String youtuber;
    Youtuber(String youtuber){
        this.youtuber=youtuber;
    }

private List<subcribe>view1=new ArrayList<>();
    @Override
    public void new_sub(subcribe view) {
        view1.add(view);
    }

    @Override
    public void removes(subcribe view) {
        view1.remove(view);

    }

    @Override
    public void notifyVideo(String subcribe) {
for (subcribe vie:view1){
vie.update(subcribe);
}
    }
    public void setSubcrid(String view1){
        System.out.println();
    }


}
