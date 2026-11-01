package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class anvu {
    public java.lang.String a = "unknown-authority";
    public defpackage.anlw b = defpackage.anlw.a;
    public java.lang.String c;
    public defpackage.annj d;

    public anvu() {
        new defpackage.anvt(this, 0);
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.anvu)) {
            return false;
        }
        defpackage.anvu anvuVar = (defpackage.anvu) obj;
        return this.a.equals(anvuVar.a) && this.b.equals(anvuVar.b) && j$.util.Objects.equals(this.c, anvuVar.c) && j$.util.Objects.equals(this.d, anvuVar.d);
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.a, this.b, this.c, this.d});
    }
}
