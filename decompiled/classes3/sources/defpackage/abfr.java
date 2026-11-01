package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abfr {
    public final java.lang.String a;
    public final java.util.List b;

    public abfr(java.lang.String str, java.util.List list) {
        aooh.f(str, "text");
        aooh.f(list, "annotations");
        this.a = str;
        this.b = list;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.abfr) {
            defpackage.abfr abfrVar = (defpackage.abfr) obj;
            if (aooh.n(this.a, abfrVar.a) && aooh.n(this.b, abfrVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "TextAnnotationUiData(text=" + this.a + ", annotations=" + this.b + ')';
    }
}
