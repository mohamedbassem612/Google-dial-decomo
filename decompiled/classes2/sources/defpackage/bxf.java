package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class bxf implements defpackage.byr {
    private final cmn a;
    private final cmn b;

    public bxf(cmn cmnVar, cmn cmnVar2) {
        this.a = cmnVar;
        this.b = cmnVar2;
    }

    @Override // defpackage.byr
    public final int a(dpo dpoVar, long j, int i) {
        int iA = this.b.a(0, dpoVar.a());
        return dpoVar.c + iA + (-this.a.a(0, i));
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.bxf) {
            defpackage.bxf bxfVar = (defpackage.bxf) obj;
            if (aooh.n(this.a, bxfVar.a) && aooh.n(this.b, bxfVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "Vertical(menuAlignment=" + this.a + ", anchorAlignment=" + this.b + ')';
    }
}
