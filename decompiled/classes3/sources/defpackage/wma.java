package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wma extends amzm {
    private final amzg b;
    private final amzg c;

    public wma(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2) {
        super(amyzVar2, new defpackage.amzw(defpackage.wma.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        defpackage.wkj wkjVar = (defpackage.wkj) list.get(0);
        defpackage.wkf wkfVar = (defpackage.wkf) list.get(1);
        akzx akzxVarM = defpackage.wki.a.m();
        akzxVarM.u();
        defpackage.wki wkiVar = (defpackage.wki) akzxVarM.b;
        j$.util.Objects.requireNonNull(wkjVar);
        wkiVar.c = wkjVar;
        wkiVar.b |= 1;
        akzxVarM.u();
        defpackage.wki wkiVar2 = (defpackage.wki) akzxVarM.b;
        j$.util.Objects.requireNonNull(wkfVar);
        wkiVar2.d = wkfVar;
        wkiVar2.b |= 2;
        return aiql.z((defpackage.wki) akzxVarM.p());
    }

    protected final ajcq c() {
        return aiql.w(new ajcq[]{this.b.d(), this.c.d()});
    }
}
