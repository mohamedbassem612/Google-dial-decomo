package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class psf extends amzm {
    private final amzg b;
    private final amzg c;

    public psf(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2) {
        super(amyzVar2, new defpackage.amzw(defpackage.psf.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        defpackage.zmn zmnVar = (defpackage.zmn) list.get(0);
        mgu mguVar = (mgu) list.get(1);
        j$.util.Objects.requireNonNull(zmnVar);
        java.lang.Boolean bool = (java.lang.Boolean) mguVar.a(new ljc(zmnVar, 9)).a(mfy.ap).f();
        bool.booleanValue();
        return aiql.z(bool);
    }

    protected final ajcq c() {
        return aiql.w(new ajcq[]{this.b.d(), this.c.d()});
    }
}
