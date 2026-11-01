package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class bwy {
    private final boolean a;
    private final java.util.List b;

    public bwy(boolean z, java.util.List list) {
        this.a = z;
        this.b = list;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.bwy) {
            defpackage.bwy bwyVar = (defpackage.bwy) obj;
            if (this.a == bwyVar.a && aooh.n(this.b, bwyVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (anty.L(this.a) * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "Posture(isTabletop=" + this.a + ", hinges=[" + ajsz.cr(this.b, ", ", (java.lang.CharSequence) null, (java.lang.CharSequence) null, (aonj) null, 62) + "])";
    }

    public bwy() {
        this(false, aokc.a);
    }
}
