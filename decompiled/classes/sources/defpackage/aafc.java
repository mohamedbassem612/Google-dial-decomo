package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aafc {
    public final java.lang.Object a;
    private final java.lang.String b;

    public aafc(java.lang.Object obj, java.lang.String str) {
        this.a = obj;
        this.b = str;
    }

    public final java.lang.String a() {
        return this.b + '@' + java.lang.System.identityHashCode(this.a);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.aafc) {
            defpackage.aafc aafcVar = (defpackage.aafc) obj;
            if (this.a == aafcVar.a && this.b.equals(aafcVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (java.lang.System.identityHashCode(this.a) * 31) + this.b.hashCode();
    }
}
