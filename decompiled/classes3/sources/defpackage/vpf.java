package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vpf extends defpackage.xhp {
    public final int a;
    public final int b;

    public vpf(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.vpf) {
            defpackage.vpf vpfVar = (defpackage.vpf) obj;
            if (this.a == vpfVar.a && this.b == vpfVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final java.lang.String toString() {
        return "GreetingSpecification(maxGreetingDurationSeconds=" + this.a + ", maxNumberOfCustomGreetings=" + this.b + ')';
    }

    public vpf() {
        throw null;
    }
}
