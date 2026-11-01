package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class psw extends amzm {
    private final amzg b;
    private final amzg c;

    public psw(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2) {
        super(amyzVar2, new defpackage.amzw(defpackage.psw.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        j$.util.Optional optional = (j$.util.Optional) list.get(0);
        defpackage.zmn zmnVar = (defpackage.zmn) list.get(1);
        return aiql.z((j$.util.Optional) j$.util.concurrent.ConcurrentMap.-EL.computeIfAbsent(zmnVar.f, optional, new defpackage.phs(zmnVar, zmnVar.a(optional), optional, 12, (byte[]) null)));
    }

    protected final ajcq c() {
        return aiql.w(new ajcq[]{this.b.d(), this.c.d()});
    }
}
