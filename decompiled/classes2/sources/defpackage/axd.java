package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class axd extends defpackage.axe {
    private final cmn a;

    public axd(cmn cmnVar) {
        this.a = cmnVar;
    }

    @Override // defpackage.axe
    public final int a(int i, int i2, dpq dpqVar) {
        return this.a.a(i2, i);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.axd) && aooh.n(this.a, ((defpackage.axd) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "VerticalCrossAxisAlignment(vertical=" + this.a + ')';
    }
}
