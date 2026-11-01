package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pcj extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;
    private final amzg f;

    public pcj(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4, amzg amzgVar5) {
        super(amyzVar2, new defpackage.amzw(defpackage.pcj.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amzs.b(amzgVar4);
        this.f = amzs.b(amzgVar5);
    }

    /* JADX WARN: Type inference failed for: r8v8, types: [aonj, java.lang.Object] */
    public final /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        android.content.Context context = (android.content.Context) list.get(0);
        defpackage.zmw zmwVar = (defpackage.zmw) list.get(1);
        ((java.lang.Boolean) list.get(2)).booleanValue();
        j$.util.Optional optionalOfNullable = (j$.util.Optional) list.get(3);
        java.lang.String str = (java.lang.String) list.get(4);
        aooh.f(context, "appContext");
        aooh.f(zmwVar, "callAudioRoute");
        aooh.f(optionalOfNullable, "bluetoothDeviceAliasName");
        aooh.f(str, "audioRouteLabel");
        nzu nzuVar = new nzu(new mkm(zmwVar, context, str, 3, (char[]) null), 17);
        if (true == optionalOfNullable.isPresent()) {
            optionalOfNullable = j$.util.Optional.ofNullable(a.l((aonj) nzuVar.a, optionalOfNullable.get()));
        }
        aooh.e(optionalOfNullable, "map(...)");
        return aiql.z((java.lang.String) aooh.p(optionalOfNullable, str));
    }

    protected final ajcq c() {
        amzg amzgVar = this.f;
        amzg amzgVar2 = this.e;
        amzg amzgVar3 = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar3.d(), amzgVar2.d(), amzgVar.d()});
    }
}
