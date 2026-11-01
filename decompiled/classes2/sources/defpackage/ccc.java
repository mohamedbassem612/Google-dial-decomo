package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ccc {
    public final java.lang.Object a;
    public final java.lang.Object b;

    public ccc(java.lang.Object obj, java.lang.Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    private static final int a(java.lang.Object obj) {
        if (obj instanceof java.lang.Enum) {
            return ((java.lang.Enum) obj).ordinal();
        }
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.ccc) {
            defpackage.ccc cccVar = (defpackage.ccc) obj;
            if (aooh.n(this.a, cccVar.a) && aooh.n(this.b, cccVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (a(this.a) * 31) + a(this.b);
    }

    public final java.lang.String toString() {
        return "JoinedKey(left=" + this.a + ", right=" + this.b + ')';
    }
}
