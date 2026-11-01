package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class thb {
    public final defpackage.tep a;
    public final java.util.List b;

    public thb(defpackage.tep tepVar, java.util.List list) {
        aooh.f(list, "subsections");
        this.a = tepVar;
        this.b = list;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.thb) {
            defpackage.thb thbVar = (defpackage.thb) obj;
            if (aooh.n(this.a, thbVar.a) && aooh.n(this.b, thbVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "SearchSectionState(sectionKey=" + this.a + ", subsections=" + this.b + ')';
    }
}
