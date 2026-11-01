package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class oie {
    public final java.lang.String a;
    public final java.lang.String b;
    public final defpackage.oid c;

    public oie(java.lang.String str, java.lang.String str2, defpackage.oid oidVar) {
        aooh.f(str, "title");
        aooh.f(str2, "description");
        this.a = str;
        this.b = str2;
        this.c = oidVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.oie) {
            defpackage.oie oieVar = (defpackage.oie) obj;
            if (aooh.n(this.a, oieVar.a) && aooh.n(this.b, oieVar.b) && aooh.n(this.c, oieVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final java.lang.String toString() {
        return "ExpressoGridComposableUiModel(title=" + this.a + ", description=" + this.b + ", button=" + this.c + ')';
    }
}
