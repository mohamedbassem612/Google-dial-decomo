package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pcr extends amzm {
    private final amzg b;
    private final amzg c;

    public pcr(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2) {
        super(amyzVar2, new defpackage.amzw(defpackage.pcr.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
    }

    public final /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        aify aifyVar = (aify) list.get(0);
        java.lang.String str = (java.lang.String) list.get(1);
        aooh.f(aifyVar, "callAudioDevices");
        aooh.f(str, "callId");
        defpackage.whl whlVar = new defpackage.whl();
        whlVar.k(aifyVar);
        whlVar.l(str);
        j$.util.Optional optionalOf = j$.util.Optional.of(whlVar.j());
        aooh.e(optionalOf, "of(...)");
        return aiql.z(optionalOf);
    }

    protected final ajcq c() {
        return aiql.w(new ajcq[]{this.b.d(), this.c.d()});
    }
}
