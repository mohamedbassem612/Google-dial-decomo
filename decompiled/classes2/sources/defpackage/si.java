package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class si extends defpackage.rm {
    public final int a;
    public final int b;

    public si(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.si) {
            defpackage.si siVar = (defpackage.si) obj;
            if (this.a == siVar.a && j$.util.Objects.equals(java.lang.Integer.valueOf(this.b), java.lang.Integer.valueOf(siVar.b))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{java.lang.Integer.valueOf(this.a), java.lang.Integer.valueOf(this.b)});
    }

    public final java.lang.String toString() {
        return "{indexingType: " + this.a + ", tokenizerType: " + this.b + '}';
    }
}
