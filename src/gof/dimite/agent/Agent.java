package gof.dimite.agent;

import gof.dimite.character.Company;
import gof.dimite.character.Fans;
import gof.dimite.character.Star;

/**
 * 经纪人代理类
 */
public class Agent {

    private Star star;

    private Fans fans;

    private Company company;

    public void setStar(Star star) {
        this.star = star;
    }

    public void setFans(Fans fans) {
        this.fans = fans;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    //和粉丝见面的方法
    public void meet(){
        System.out.println(star.getName()+"与"+fans.getName()+"见面了");
    }

    //和公司合作
    public void business(){
        System.out.println(star.getName()+"与"+company.getName()+"合作了");
    }
}
