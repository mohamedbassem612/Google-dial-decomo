package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class qo extends defpackage.rm {
    public final int a;
    public final int b;

    public qo(int i, int i2) {
        if (i > i2) {
            throw new java.lang.IllegalArgumentException("Start point must be less than or equal to end point");
        }
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.qo) {
            defpackage.qo qoVar = (defpackage.qo) obj;
            if (this.a == qoVar.a && this.b == qoVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{java.lang.Integer.valueOf(this.a), java.lang.Integer.valueOf(this.b)});
    }

    public final java.lang.String toString() {
        return "MatchRange { start: " + this.a + " , end: " + this.b + '}';
    }
}
