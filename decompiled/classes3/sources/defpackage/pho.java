package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pho extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;

    public pho(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4) {
        super(amyzVar2, new defpackage.amzw(defpackage.pho.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amzs.b(amzgVar4);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        android.os.Bundle bundle = (android.os.Bundle) list.get(0);
        boolean zBooleanValue = ((java.lang.Boolean) list.get(1)).booleanValue();
        defpackage.zmy zmyVar = (defpackage.zmy) list.get(2);
        mgu mguVar = (mgu) list.get(3);
        aooh.f(bundle, "callIntentExtras");
        aooh.f(zmyVar, "direction");
        aooh.f(mguVar, "recorder");
        java.lang.Object objC = mguVar.h(new defpackage.pqt(zmyVar, zBooleanValue, bundle, 1)).b(mfy.aw).c(new old(17));
        aooh.e(objC, "asStringUserdata(...)");
        return aiql.z((hkw) objC);
    }

    protected final ajcq c() {
        amzg amzgVar = this.e;
        amzg amzgVar2 = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar2.d(), amzgVar.d()});
    }
}
