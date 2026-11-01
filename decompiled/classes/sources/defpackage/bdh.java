package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class bdh {
    public final int a;
    public final int b;

    public bdh(int i, int i2) {
        this.a = i;
        this.b = i2;
        if (i < 0) {
            avo.c("negative start index");
        }
        if (i2 < i) {
            avo.c("end index greater than start");
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.bdh) {
            defpackage.bdh bdhVar = (defpackage.bdh) obj;
            if (this.a == bdhVar.a && this.b == bdhVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final java.lang.String toString() {
        return "Interval(start=" + this.a + ", end=" + this.b + ')';
    }
}
