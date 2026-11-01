package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pge extends amzm {
    private final amzg b;
    private final amzg c;

    public pge(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2) {
        super(amyzVar2, new defpackage.amzw(defpackage.pge.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        hkw hkwVar = (hkw) list.get(0);
        android.content.Context context = (android.content.Context) list.get(1);
        return aiql.z(java.lang.Integer.valueOf(hkwVar == hkw.b ? context.getResources().getDisplayMetrics().heightPixels / 2 : context.getResources().getDimensionPixelOffset(2131167317)));
    }

    protected final ajcq c() {
        return aiql.w(new ajcq[]{this.b.d(), this.c.d()});
    }
}
