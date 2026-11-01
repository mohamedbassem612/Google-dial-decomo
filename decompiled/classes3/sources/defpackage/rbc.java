package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class rbc extends amzm {
    private final amzg b;
    private final amzg c;

    public rbc(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2) {
        super(amyzVar2, new defpackage.amzw(defpackage.rbc.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        boolean z = false;
        defpackage.rce rceVar = (defpackage.rce) list.get(0);
        defpackage.rce rceVar2 = (defpackage.rce) list.get(1);
        defpackage.rcd rcdVarB = defpackage.rcd.b(rceVar.c);
        if (rcdVarB == null) {
            rcdVarB = defpackage.rcd.EMPTY;
        }
        if (rcdVarB != defpackage.rcd.EMPTY && !rceVar.equals(rceVar2)) {
            z = true;
        }
        return aiql.z(java.lang.Boolean.valueOf(z));
    }

    protected final ajcq c() {
        return aiql.w(new ajcq[]{this.b.d(), this.c.d()});
    }
}
