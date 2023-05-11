package gof.dimite;

import gof.dimite.agent.Agent;
import gof.dimite.character.Company;
import gof.dimite.character.Fans;
import gof.dimite.character.Star;

/**
 * 迪米特法则又叫最少知识原则。
 * 只和你的直接朋友交谈，不跟"陌生人"说话(Talk only to your immediate friends and not to strangers)。
 * 其含义是:如果两个软件实体无须直接通信，那么就不应当发生直接的相互调用，可以通过第三方转发该调用。其目的是降低类之间的耦合度，提高模块的相对独立性。
 * 迪米特法则中的"朋友""是指:当前对象本身、当前对象的成员对象、当前对象所创建的对象、当前对象的方法参数等，这些对象同当前对象存在关联、聚合或组合关系，可以直接访问这些对象的方法。
 */
public class Client {
    public static void main(String[] args) {
        Agent agent = new Agent();

        Star star = new Star("裴橘");
        Fans fans = new Fans("粉丝");
        Company company = new Company("超级大公司");

        agent.setCompany(company);
        agent.setFans(fans);
        agent.setStar(star);

        agent.business();
        agent.meet();
    }
}
