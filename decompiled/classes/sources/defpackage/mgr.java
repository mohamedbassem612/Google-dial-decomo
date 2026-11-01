package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class mgr {
    final /* synthetic */ defpackage.mgu a;
    private final java.lang.Object b;

    public mgr(defpackage.mgu mguVar, java.lang.Object obj) {
        j$.util.Objects.requireNonNull(mguVar);
        this.a = mguVar;
        this.b = obj;
    }

    public final defpackage.mgq a(java.lang.Object obj) {
        java.lang.Object obj2 = this.b;
        return new defpackage.mgq(this.a, obj, obj2, (j$.util.Optional) obj2);
    }

    public final defpackage.mgd b(java.lang.Object obj) {
        java.lang.Object obj2 = this.b;
        return new defpackage.mgd(this.a, obj, obj2, obj2, null);
    }

    public mgr(defpackage.mgu mguVar, j$.util.Optional optional) {
        j$.util.Objects.requireNonNull(mguVar);
        this.a = mguVar;
        this.b = optional;
    }
}
