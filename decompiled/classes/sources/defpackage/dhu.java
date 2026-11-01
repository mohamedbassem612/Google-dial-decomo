package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dhu {
    public final int a;
    public final int b;

    public dhu(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.dhu) {
            defpackage.dhu dhuVar = (defpackage.dhu) obj;
            if (this.a == dhuVar.a && this.b == dhuVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final java.lang.String toString() {
        return "CollectionInfo(rowCount=" + this.a + ", columnCount=" + this.b + ')';
    }
}
