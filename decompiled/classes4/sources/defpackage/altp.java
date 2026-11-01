package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class altp implements java.lang.Comparable {
    public static final /* synthetic */ int c = 0;
    public final int a;
    public final int b;

    static {
        alto altoVar = new alto();
        altoVar.c(0);
        altoVar.b(0);
        altoVar.a();
    }

    public altp(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public static defpackage.altp b(int i, int i2) {
        alto altoVar = new alto();
        altoVar.c(i);
        altoVar.b(i2);
        return altoVar.a();
    }

    public final defpackage.altp a(int i) {
        alto altoVar = new alto();
        altoVar.c(this.a + i);
        altoVar.b(this.b + i);
        return altoVar.a();
    }

    public final defpackage.altp c(int i) {
        alto altoVar = new alto();
        altoVar.c(this.a);
        altoVar.b(this.b + i);
        return altoVar.a();
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(java.lang.Object obj) {
        defpackage.altp altpVar = (defpackage.altp) obj;
        int i = altpVar.a;
        int i2 = this.a;
        return i == i2 ? this.b - altpVar.b : i2 - i;
    }

    public final defpackage.altp d(int i) {
        alto altoVar = new alto();
        altoVar.c(this.a + i);
        altoVar.b(this.b);
        return altoVar.a();
    }

    public final defpackage.altp e(defpackage.altp altpVar) {
        int i = altpVar.b;
        int i2 = this.b;
        ahvr.bT(i <= i2, "Start: %s must be less than end: %s", i, i2);
        alto altoVar = new alto();
        altoVar.c(i);
        altoVar.b(i2);
        return altoVar.a();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.altp) {
            defpackage.altp altpVar = (defpackage.altp) obj;
            if (this.a == altpVar.a && this.b == altpVar.b) {
                return true;
            }
        }
        return false;
    }

    public final defpackage.altp f(java.lang.String str) {
        java.util.regex.Matcher matcher = java.util.regex.Pattern.compile("^([.,\\s]*)(.*?)([.,\\s]*)$").matcher(h(str));
        matcher.find();
        java.lang.String strGroup = matcher.group(2);
        int length = strGroup == null ? 0 : strGroup.length();
        alto altoVar = new alto();
        int i = this.a;
        altoVar.c(matcher.end(1) + i);
        altoVar.b(i + matcher.end(1) + length);
        return altoVar.a();
    }

    public final j$.util.Optional g(defpackage.altp altpVar) {
        return j(altpVar) ? j$.util.Optional.ofNullable(new vfs(this, altpVar, 15).get()) : j$.util.Optional.empty();
    }

    public final java.lang.String h(java.lang.String str) {
        return str.substring(this.a, this.b);
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b;
    }

    public final boolean i(int i) {
        return i >= this.a && i < this.b;
    }

    public final boolean j(defpackage.altp altpVar) {
        int i = this.a;
        int i2 = altpVar.a;
        if (i < i2) {
            if (this.b > i2) {
                return true;
            }
        } else if (i < altpVar.b) {
            return true;
        }
        return false;
    }

    public final java.lang.String toString() {
        return "Span{start=" + this.a + ", end=" + this.b + '}';
    }

    public altp() {
        throw null;
    }
}
