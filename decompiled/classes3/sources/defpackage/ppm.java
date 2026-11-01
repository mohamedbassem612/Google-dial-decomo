package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ppm extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;

    public ppm(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3) {
        super(amyzVar2, new defpackage.amzw(defpackage.ppm.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        j$.util.Optional optionalOf;
        java.util.List list = (java.util.List) obj;
        defpackage.ptx ptxVar = (defpackage.ptx) list.get(0);
        android.content.Context context = (android.content.Context) list.get(1);
        java.lang.CharSequence charSequence = (java.lang.CharSequence) list.get(2);
        if (ptxVar.t()) {
            optionalOf = j$.util.Optional.of(charSequence);
        } else {
            optionalOf = ptxVar.u() ? j$.util.Optional.of(context.getString(2132019107)) : j$.util.Optional.empty();
        }
        return aiql.z(optionalOf);
    }

    protected final ajcq c() {
        amzg amzgVar = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar.d()});
    }
}
