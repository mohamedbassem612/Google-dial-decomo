package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pgd extends amzm {
    private final amzg b;
    private final amzg c;

    public pgd(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2) {
        super(amyzVar2, new defpackage.amzw(defpackage.pgd.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        zms zmsVar = (zms) list.get(0);
        boolean zBooleanValue = ((java.lang.Boolean) list.get(1)).booleanValue();
        int iOrdinal = zmsVar.a().ordinal();
        int i = 2132017470;
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                i = 2132017465;
            } else if (iOrdinal == 2) {
                i = 2132017466;
            }
        } else if (zBooleanValue) {
            i = 2132017467;
        }
        return aiql.z(java.lang.Integer.valueOf(i));
    }

    protected final ajcq c() {
        return aiql.w(new ajcq[]{this.b.d(), this.c.d()});
    }
}
