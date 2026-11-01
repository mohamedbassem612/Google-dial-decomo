package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ngd extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;
    private final amzg f;
    private final amzg g;

    public ngd(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4, amzg amzgVar5, amzg amzgVar6) {
        super(amyzVar2, new amzw(defpackage.ngd.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amzs.b(amzgVar4);
        this.f = amzs.b(amzgVar5);
        this.g = amzs.b(amzgVar6);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        defpackage.mzv mzvVar;
        java.util.List list = (java.util.List) obj;
        boolean zBooleanValue = ((java.lang.Boolean) list.get(0)).booleanValue();
        boolean zBooleanValue2 = ((java.lang.Boolean) list.get(1)).booleanValue();
        boolean zBooleanValue3 = ((java.lang.Boolean) list.get(2)).booleanValue();
        boolean zBooleanValue4 = ((java.lang.Boolean) list.get(3)).booleanValue();
        boolean zBooleanValue5 = ((java.lang.Boolean) list.get(4)).booleanValue();
        boolean zBooleanValue6 = ((java.lang.Boolean) list.get(5)).booleanValue();
        if (zBooleanValue) {
            mzvVar = defpackage.mzv.TYPE_SPAM;
        } else if (zBooleanValue2) {
            mzvVar = defpackage.mzv.TYPE_FAVORITE;
        } else if (zBooleanValue3) {
            mzvVar = defpackage.mzv.TYPE_WORK;
        } else if (zBooleanValue4) {
            mzvVar = defpackage.mzv.TYPE_LOCAL_CONTACT;
        } else if (zBooleanValue5) {
            mzvVar = defpackage.mzv.TYPE_BUSINESS;
        } else {
            mzvVar = zBooleanValue6 ? defpackage.mzv.TYPE_HIDDEN_NUMBER : defpackage.mzv.TYPE_UNKNOWN;
        }
        return aiql.z(mzvVar);
    }

    protected final ajcq c() {
        amzg amzgVar = this.g;
        amzg amzgVar2 = this.f;
        amzg amzgVar3 = this.e;
        amzg amzgVar4 = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar4.d(), amzgVar3.d(), amzgVar2.d(), amzgVar.d()});
    }
}
