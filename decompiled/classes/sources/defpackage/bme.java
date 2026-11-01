package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class bme {
    public final long a;
    public final long b;

    public bme(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.bme) {
            defpackage.bme bmeVar = (defpackage.bme) obj;
            if (this.a == bmeVar.a && this.b == bmeVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        return (((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final java.lang.String toString() {
        long j = this.b;
        return "SelectionColors(selectionHandleColor=" + defpackage.cqg.g(this.a) + ", selectionBackgroundColor=" + defpackage.cqg.g(j) + ')';
    }
}
