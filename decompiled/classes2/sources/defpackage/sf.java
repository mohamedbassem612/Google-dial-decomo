package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class sf extends defpackage.rm {
    private final int a;
    private final int b;

    public sf(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.sf) {
            defpackage.sf sfVar = (defpackage.sf) obj;
            if (this.a == sfVar.a && this.b == sfVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{java.lang.Integer.valueOf(this.a), java.lang.Integer.valueOf(this.b)});
    }

    public final java.lang.String toString() {
        return "{indexingType: " + this.a + ", quantizationType: " + this.b + '}';
    }
}
