package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class rer {
    public final int a;
    public final int b;
    public final j$.util.OptionalInt c;
    public final int d;

    public rer(int i, int i2, j$.util.OptionalInt optionalInt, int i3) {
        this.a = i;
        this.b = i2;
        this.c = optionalInt;
        this.d = i3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.rer) {
            defpackage.rer rerVar = (defpackage.rer) obj;
            if (this.a == rerVar.a && this.b == rerVar.b && this.c.equals(rerVar.c) && this.d == rerVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d;
    }

    public final java.lang.String toString() {
        return "MaterialSpec{titleRes=" + this.a + ", messageRes=" + this.b + ", positiveButtonTextRes=" + java.lang.String.valueOf(this.c) + ", negativeButtonTextRes=" + this.d + '}';
    }

    public rer() {
        throw null;
    }
}
