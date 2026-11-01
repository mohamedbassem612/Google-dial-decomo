package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class faw {
    public final int a;
    public final int b;
    public final int c;
    public final boolean d;
    public final int e;
    public final defpackage.epu f;
    public final int g;
    public final int h;

    public faw(defpackage.fav favVar) {
        this.a = favVar.a;
        this.b = favVar.b;
        this.c = favVar.c;
        this.d = favVar.d;
        this.e = favVar.e;
        this.f = favVar.f;
        this.g = favVar.g;
        this.h = favVar.h;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            defpackage.faw fawVar = (defpackage.faw) obj;
            if (this.a == fawVar.a && this.b == fawVar.b && this.c == fawVar.c && this.d == fawVar.d && this.e == fawVar.e && this.g == fawVar.g && this.h == fawVar.h && this.f.equals(fawVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(this.a);
        java.lang.Integer numValueOf2 = java.lang.Integer.valueOf(this.b);
        java.lang.Integer numValueOf3 = java.lang.Integer.valueOf(this.c);
        java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(this.d);
        java.lang.Integer numValueOf4 = java.lang.Integer.valueOf(this.e);
        defpackage.epu epuVar = this.f;
        java.lang.Integer numValueOf5 = java.lang.Integer.valueOf(this.g);
        java.lang.Integer numValueOf6 = java.lang.Integer.valueOf(this.h);
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        return j$.util.Objects.hash(new java.lang.Object[]{numValueOf, numValueOf2, numValueOf3, bool, boolValueOf, numValueOf4, epuVar, numValueOf5, numValueOf6, bool, bool});
    }
}
