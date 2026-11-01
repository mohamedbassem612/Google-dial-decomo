package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class akzp {
    private final java.lang.Object a;
    private final int b;

    public akzp(java.lang.Object obj, int i) {
        this.a = obj;
        this.b = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.akzp)) {
            return false;
        }
        defpackage.akzp akzpVar = (defpackage.akzp) obj;
        return this.a == akzpVar.a && this.b == akzpVar.b;
    }

    public final int hashCode() {
        return (java.lang.System.identityHashCode(this.a) * 65535) + this.b;
    }
}
