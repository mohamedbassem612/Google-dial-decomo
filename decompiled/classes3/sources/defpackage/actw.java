package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class actw {
    public final dnd a;
    public final int b;

    public /* synthetic */ actw(byte[] bArr) {
        dnd dndVar = dnd.e;
        aooh.f(dndVar, "weight");
        this.a = dndVar;
        this.b = 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.actw) {
            defpackage.actw actwVar = (defpackage.actw) obj;
            if (aooh.n(this.a, actwVar.a)) {
                int i = actwVar.b;
                if (a.x(0, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.h * 31;
    }

    public final java.lang.String toString() {
        return "GoogleSansConfig(weight=" + this.a + ", style=" + dmw.a(0) + ')';
    }

    public actw() {
        this(null);
    }
}
