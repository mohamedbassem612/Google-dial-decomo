package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jqf extends amzm {
    private final amzg b;
    private final amzg c;

    public jqf(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2) {
        super(amyzVar2, new amzw(defpackage.jqf.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
    }

    /* JADX WARN: Type inference failed for: r3v8, types: [aonj, java.lang.Object] */
    public final /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        java.util.Set set = defpackage.jpk.a;
        android.telecom.Call.Details details = (android.telecom.Call.Details) list.get(0);
        j$.util.Optional optionalOfNullable = (j$.util.Optional) list.get(1);
        aooh.f(details, "details");
        aooh.f(optionalOfNullable, "callDisconnectTimeMillis");
        defpackage.hvd hvdVar = new defpackage.hvd(new defpackage.izj(details, 20), 15);
        if (true == optionalOfNullable.isPresent()) {
            optionalOfNullable = j$.util.Optional.ofNullable(hvdVar.a.a(optionalOfNullable.get()));
        }
        aooh.e(optionalOfNullable, "map(...)");
        return aiql.z(optionalOfNullable);
    }

    protected final ajcq c() {
        return aiql.w(new ajcq[]{this.b.d(), this.c.d()});
    }
}
