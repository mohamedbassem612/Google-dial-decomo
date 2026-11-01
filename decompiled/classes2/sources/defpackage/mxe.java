package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mxe extends amzm {
    private final amzg b;
    private final amzg c;

    public mxe(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2) {
        super(amyzVar2, new amzw(defpackage.mxe.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0032 A[FALL_THROUGH] */
    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        int i;
        java.util.List list = (java.util.List) obj;
        defpackage.nmo nmoVar = (defpackage.nmo) list.get(0);
        boolean zBooleanValue = ((java.lang.Boolean) list.get(1)).booleanValue();
        aooh.f(nmoVar, "lifecycleState");
        int iOrdinal = nmoVar.ordinal();
        if (iOrdinal != 10 && iOrdinal != 14 && iOrdinal != 15) {
            i = 2132019494;
            switch (iOrdinal) {
                case 5:
                    if (zBooleanValue) {
                    }
                case 3:
                case 4:
                case 6:
                case 7:
                case 8:
                    i = 2132019493;
                    break;
            }
        } else {
            i = 2132019493;
        }
        return aiql.z(java.lang.Integer.valueOf(i));
    }

    protected final ajcq c() {
        return aiql.w(new ajcq[]{this.b.d(), this.c.d()});
    }
}
