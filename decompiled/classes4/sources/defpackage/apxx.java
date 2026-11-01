package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class apxx {
    private final java.lang.Object a;
    private final int b;

    public apxx(java.lang.Object obj, int i) {
        this.a = obj;
        this.b = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.apxx)) {
            return false;
        }
        defpackage.apxx apxxVar = (defpackage.apxx) obj;
        return this.a == apxxVar.a && this.b == apxxVar.b;
    }

    public final int hashCode() {
        return (java.lang.System.identityHashCode(this.a) * 65535) + this.b;
    }
}
