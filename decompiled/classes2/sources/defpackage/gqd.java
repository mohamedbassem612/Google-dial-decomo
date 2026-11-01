package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class gqd {
    public final java.util.List a;
    private final java.util.Set b;

    public /* synthetic */ gqd(java.util.List list) {
        this(list, ajsz.cW(new defpackage.gqc[]{defpackage.gqc.a, defpackage.gqc.b}));
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.gqd) {
            defpackage.gqd gqdVar = (defpackage.gqd) obj;
            if (aooh.n(this.a, gqdVar.a) && aooh.n(this.b, gqdVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "WindowLayoutInfo{ DisplayFeatures[" + ajsz.cr(this.a, (java.lang.CharSequence) null, (java.lang.CharSequence) null, (java.lang.CharSequence) null, (aonj) null, 63) + "], engagementModes=" + this.b + " }";
    }

    public gqd(java.util.List list, java.util.Set set) {
        aooh.f(set, "engagementModes");
        this.a = list;
        this.b = set;
    }
}
