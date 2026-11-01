package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ofm extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;

    public ofm(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3) {
        super(amyzVar2, new amzw(defpackage.ofm.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
    }

    /* JADX WARN: Type inference failed for: r5v8, types: [aonj, java.lang.Object] */
    public final /* synthetic */ ajcq b(java.lang.Object obj) {
        oyx oyxVar;
        java.util.List list = (java.util.List) obj;
        j$.util.Optional optionalOfNullable = (j$.util.Optional) list.get(0);
        android.content.Context context = (android.content.Context) list.get(1);
        zpo zpoVar = (zpo) list.get(2);
        aooh.f(optionalOfNullable, "expressoResource");
        aooh.f(context, "appContext");
        aooh.f(zpoVar, "callState");
        if (zpoVar != zpo.d) {
            oyxVar = new oyx((java.lang.Object) null);
        } else {
            defpackage.nzu nzuVar = new defpackage.nzu(new defpackage.npi(context, 13), 10);
            if (true == optionalOfNullable.isPresent()) {
                optionalOfNullable = j$.util.Optional.ofNullable(nzuVar.a.a(optionalOfNullable.get()));
            }
            aooh.e(optionalOfNullable, "map(...)");
            oyxVar = (oyx) aooh.p(optionalOfNullable, new oyx((java.lang.Object) null));
        }
        return aiql.z(oyxVar);
    }

    protected final ajcq c() {
        amzg amzgVar = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar.d()});
    }
}
