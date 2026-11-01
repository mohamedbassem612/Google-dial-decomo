package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ulc extends amzm {
    private final amzg b;
    private final amzg c;

    public ulc(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2) {
        super(amyzVar2, new defpackage.amzw(defpackage.ulc.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [aonj, java.lang.Object] */
    public final /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        android.content.Context context = (android.content.Context) list.get(0);
        j$.util.Optional optionalOfNullable = (j$.util.Optional) list.get(1);
        aooh.f(context, "appContext");
        aooh.f(optionalOfNullable, "displayNumber");
        defpackage.taj tajVar = new defpackage.taj(new ukw(1), 7);
        if (true == optionalOfNullable.isPresent()) {
            optionalOfNullable = j$.util.Optional.ofNullable(tajVar.a.a(optionalOfNullable.get()));
        }
        aooh.e(optionalOfNullable, "map(...)");
        defpackage.vqu vquVarBQ = wsc.bQ(defpackage.uje.a.m());
        java.lang.String string = context.getString(2132020211);
        aooh.e(string, "getString(...)");
        aooh.f(string, "value");
        akzx akzxVar = (akzx) vquVarBQ.a;
        akzxVar.u();
        defpackage.uje ujeVar = (defpackage.uje) akzxVar.b;
        j$.util.Objects.requireNonNull(string);
        ujeVar.b = 2;
        ujeVar.c = string;
        return aiql.z((defpackage.uje) aooh.p(optionalOfNullable, vquVarBQ.U()));
    }

    protected final ajcq c() {
        return aiql.w(new ajcq[]{this.b.d(), this.c.d()});
    }
}
