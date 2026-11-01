package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xwn implements defpackage.ygf {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;

    public xwn(akbx akbxVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(akbxVar);
        this.a = akbxVar;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, xwv] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, xwx] */
    /* JADX WARN: Type inference failed for: r6v0, types: [dxz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v4, types: [dxz, java.lang.Object] */
    @Override // defpackage.ygf
    public final /* synthetic */ java.lang.Object a() {
        int i = this.$cid;
        java.lang.Object obj = this.a;
        if (i != 0) {
            akbx akbxVar = (akbx) obj;
            return new defpackage.xwf((defpackage.xwo) akbxVar.c, akbxVar.a);
        }
        defpackage.uss ussVar = (defpackage.uss) obj;
        java.lang.Object obj2 = ussVar.c;
        java.lang.Object obj3 = ussVar.a;
        return new defpackage.xwu((defpackage.xyn) obj2, (defpackage.xyn) obj3, (defpackage.xyn) ussVar.e, ussVar.f, ussVar.d, ussVar.b);
    }

    public xwn(defpackage.uss ussVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(ussVar);
        this.a = ussVar;
    }
}
