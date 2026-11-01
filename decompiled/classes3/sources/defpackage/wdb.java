package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wdb extends amzm {
    private final amzg b;
    private final amzg c;

    public wdb(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2) {
        super(amyzVar2, new defpackage.amzw(defpackage.wdb.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.lang.Boolean boolValueOf;
        java.util.List list = (java.util.List) obj;
        defpackage.zmy zmyVar = (defpackage.zmy) list.get(0);
        defpackage.sql sqlVar = (defpackage.sql) list.get(1);
        if (zmyVar == defpackage.zmy.b) {
            boolValueOf = java.lang.Boolean.FALSE;
        } else {
            boolValueOf = java.lang.Boolean.valueOf(sqlVar.c() == udj.c);
        }
        return aiql.z(boolValueOf);
    }

    protected final ajcq c() {
        return aiql.w(new ajcq[]{this.b.d(), this.c.d()});
    }
}
