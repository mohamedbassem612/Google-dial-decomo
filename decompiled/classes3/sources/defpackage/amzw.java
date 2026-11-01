package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class amzw {
    private final java.lang.Class a;
    private final java.lang.String b = null;

    public amzw(java.lang.Class cls) {
        this.a = cls;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.amzw) {
            defpackage.amzw amzwVar = (defpackage.amzw) obj;
            if (j$.util.Objects.equals(this.a, amzwVar.a)) {
                java.lang.String str = amzwVar.b;
                if (j$.util.Objects.equals((java.lang.Object) null, (java.lang.Object) null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((j$.util.Objects.hashCode(this.a) ^ 1000003) * 1000003) ^ j$.util.Objects.hashCode((java.lang.Object) null);
    }

    public final java.lang.String toString() {
        return this.a.getCanonicalName();
    }
}
