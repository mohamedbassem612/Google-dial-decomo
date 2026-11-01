package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class egy {
    private final java.lang.Object a;
    private final int b;

    public egy(java.lang.Object obj, int i) {
        this.a = obj;
        this.b = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.egy)) {
            return false;
        }
        defpackage.egy egyVar = (defpackage.egy) obj;
        return this.a == egyVar.a && this.b == egyVar.b;
    }

    public final int hashCode() {
        return (java.lang.System.identityHashCode(this.a) * 65535) + this.b;
    }
}
