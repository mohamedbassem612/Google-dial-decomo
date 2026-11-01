package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pck extends amzm {
    private final amzg b;
    private final amzg c;

    public pck(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2) {
        super(amyzVar2, new defpackage.amzw(defpackage.pck.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002a  */
    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        defpackage.zmw zmwVar = (defpackage.zmw) list.get(0);
        int i = 2131231670;
        if (((java.lang.Boolean) list.get(1)).booleanValue()) {
            if (zmwVar == null) {
                i = 2131231546;
            } else {
                int iOrdinal = zmwVar.ordinal();
                if (iOrdinal == 1) {
                    i = 2131231320;
                } else if (iOrdinal == 2) {
                    i = 2131231451;
                } else if (iOrdinal != 3) {
                    i = 2131231546;
                }
            }
        }
        return aiql.z(java.lang.Integer.valueOf(i));
    }

    protected final ajcq c() {
        return aiql.w(new ajcq[]{this.b.d(), this.c.d()});
    }
}
