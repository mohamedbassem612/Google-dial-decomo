package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class mgf {
    final /* synthetic */ defpackage.mgu a;
    private final boolean b;

    public mgf(defpackage.mgu mguVar, boolean z) {
        j$.util.Objects.requireNonNull(mguVar);
        this.a = mguVar;
        this.b = z;
    }

    public final defpackage.mge a(java.lang.Object obj) {
        defpackage.mgu mguVar = this.a;
        boolean z = this.b;
        return new defpackage.mge(mguVar, obj, java.lang.Boolean.valueOf(z), z);
    }
}
