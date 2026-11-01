package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class axc extends defpackage.axe {
    private final cmi a;

    public axc(cmi cmiVar) {
        this.a = cmiVar;
    }

    @Override // defpackage.axe
    public final int a(int i, int i2, dpq dpqVar) {
        return this.a.a(i2, i, dpqVar);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.axc) && aooh.n(this.a, ((defpackage.axc) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "HorizontalCrossAxisAlignment(horizontal=" + this.a + ')';
    }
}
