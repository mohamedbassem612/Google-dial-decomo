package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hoi extends amzm {
    private final amzg b;

    public hoi(amyz amyzVar, amyz amyzVar2, amzg amzgVar) {
        super(amyzVar2, new amzw(defpackage.hoi.class), amyzVar);
        this.b = amzs.b(amzgVar);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        zms zmsVar = (zms) obj;
        aooh.f(zmsVar, "audioModelProvider");
        int iOrdinal = zmsVar.a().ordinal();
        int i = 2131231544;
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                i = 2131231321;
            } else if (iOrdinal == 2) {
                i = 2131231403;
            } else if (iOrdinal == 3) {
                i = 2131231620;
            }
        }
        return aiql.z(java.lang.Integer.valueOf(i));
    }

    protected final ajcq c() {
        return this.b.d();
    }
}
