package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class esf {
    public static final defpackage.esf a = new defpackage.esf(-1, -1, -1);
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public esf(int i, int i2, int i3) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = eum.U(i3) ? eum.j(i3) * i2 : -1;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.esf) {
            defpackage.esf esfVar = (defpackage.esf) obj;
            if (this.b == esfVar.b && this.c == esfVar.c && this.d == esfVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{java.lang.Integer.valueOf(this.b), java.lang.Integer.valueOf(this.c), java.lang.Integer.valueOf(this.d)});
    }

    public final java.lang.String toString() {
        return "AudioFormat[sampleRate=" + this.b + ", channelCount=" + this.c + ", encoding=" + this.d + ']';
    }

    public esf(defpackage.eqg eqgVar) {
        this(eqgVar.J, eqgVar.H, eqgVar.K);
    }
}
