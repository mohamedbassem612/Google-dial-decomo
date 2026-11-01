package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xcz extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;
    private final amzg f;

    public xcz(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4, amzg amzgVar5) {
        super(amyzVar2, new defpackage.amzw(defpackage.xcz.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amzs.b(amzgVar4);
        this.f = amzs.b(amzgVar5);
    }

    public final /* synthetic */ ajcq b(java.lang.Object obj) {
        j$.util.Optional optionalOf;
        java.util.List list = (java.util.List) obj;
        xtq xtqVar = (xtq) list.get(0);
        defpackage.xdh xdhVar = (defpackage.xdh) list.get(1);
        xtq xtqVar2 = (xtq) list.get(2);
        defpackage.qix qixVar = (defpackage.qix) list.get(3);
        defpackage.qin qinVar = (defpackage.qin) list.get(4);
        if (!xtqVar.d()) {
            optionalOf = j$.util.Optional.empty();
        } else if (qixVar == defpackage.qix.c || qixVar == defpackage.qix.d) {
            java.lang.Object obj2 = xtqVar2.a;
            defpackage.qig qigVar = new defpackage.qig();
            qigVar.b(((android.content.Context) obj2).getText(2132017426));
            qigVar.c(defpackage.qio.ATLAS);
            qigVar.d(qinVar.a());
            qigVar.e(qinVar.b());
            optionalOf = j$.util.Optional.of(qigVar.a());
        } else if (qixVar == defpackage.qix.b && wsc.j(xdhVar.c.c) == 3) {
            java.lang.Object obj3 = xtqVar2.a;
            defpackage.qig qigVar2 = new defpackage.qig();
            qigVar2.b(((android.content.Context) obj3).getText(2132017412));
            qigVar2.c(defpackage.qio.ATLAS);
            qigVar2.d(qinVar.a());
            qigVar2.e(qinVar.b());
            optionalOf = j$.util.Optional.of(qigVar2.a());
        } else {
            optionalOf = j$.util.Optional.empty();
        }
        return aiql.z(optionalOf);
    }

    protected final ajcq c() {
        amzg amzgVar = this.f;
        amzg amzgVar2 = this.e;
        amzg amzgVar3 = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar3.d(), amzgVar2.d(), amzgVar.d()});
    }
}
