package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lfm extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;
    private final amzg f;

    public lfm(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4, amzg amzgVar5) {
        super(amyzVar2, new amzw(defpackage.lfm.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amzs.b(amzgVar4);
        this.f = amzs.b(amzgVar5);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        defpackage.lll lllVar;
        java.util.List list = (java.util.List) obj;
        boolean zBooleanValue = ((java.lang.Boolean) list.get(0)).booleanValue();
        boolean zBooleanValue2 = ((java.lang.Boolean) list.get(1)).booleanValue();
        boolean zBooleanValue3 = ((java.lang.Boolean) list.get(2)).booleanValue();
        boolean zBooleanValue4 = ((java.lang.Boolean) list.get(3)).booleanValue();
        rmt rmtVar = (rmt) list.get(4);
        if (zBooleanValue) {
            lllVar = defpackage.lll.SPAM;
        } else if (zBooleanValue2) {
            lllVar = defpackage.lll.FAVORITE;
        } else if (zBooleanValue3) {
            lllVar = defpackage.lll.LOCAL_CONTACT;
        } else if (zBooleanValue4) {
            lllVar = defpackage.lll.BUSINESS;
        } else {
            lllVar = rmtVar != rmt.a ? defpackage.lll.OTHER_CONTACT : defpackage.lll.UNKNOWN;
        }
        return aiql.z(lllVar);
    }

    protected final ajcq c() {
        amzg amzgVar = this.f;
        amzg amzgVar2 = this.e;
        amzg amzgVar3 = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar3.d(), amzgVar2.d(), amzgVar.d()});
    }
}
