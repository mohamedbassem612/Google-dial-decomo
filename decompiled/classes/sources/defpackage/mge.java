package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class mge extends defpackage.mgd {
    final /* synthetic */ defpackage.mgu e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mge(defpackage.mgu mguVar, java.lang.Object obj, java.lang.Object obj2, boolean z) {
        super(mguVar, obj, obj2, java.lang.Boolean.valueOf(z));
        j$.util.Objects.requireNonNull(mguVar);
        this.e = mguVar;
    }

    public final java.lang.Object f() {
        java.lang.Boolean bool = (java.lang.Boolean) this.c;
        defpackage.mgh mghVar = new defpackage.mgh(1);
        this.e.f(bool, this.a, mghVar);
        return this.b;
    }
}
