package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hoh extends amzm {
    private final amzg b;
    private final amzg c;

    public hoh(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2) {
        super(amyzVar2, new amzw(defpackage.hoh.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7, types: [aonj, java.lang.Object] */
    public final /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        android.content.Context context = (android.content.Context) list.get(0);
        j$.util.Optional optionalOfNullable = (j$.util.Optional) list.get(1);
        aooh.f(context, "appContext");
        aooh.f(optionalOfNullable, "disconnectCauseOptional");
        defpackage.ida idaVar = new defpackage.ida(new defpackage.guv(8), 1);
        if (true == optionalOfNullable.isPresent()) {
            if (true != a.w((aonj) idaVar.a, optionalOfNullable.get())) {
                optionalOfNullable = j$.util.Optional.empty();
            }
        }
        defpackage.hvd hvdVar = new defpackage.hvd(new defpackage.fxs(context, 18), 1);
        if (true == optionalOfNullable.isPresent()) {
            optionalOfNullable = j$.util.Optional.ofNullable(a.l((aonj) hvdVar.a, optionalOfNullable.get()));
        }
        aooh.e(optionalOfNullable, "map(...)");
        return aiql.z(optionalOfNullable);
    }

    protected final ajcq c() {
        return aiql.w(new ajcq[]{this.b.d(), this.c.d()});
    }
}
