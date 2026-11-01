package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class acht {
    public final int a;
    public final int b;
    public final java.lang.String c;
    public final long d;

    public acht(int i, int i2, java.lang.String str, long j) {
        this.a = i;
        this.b = i2;
        if (str == null) {
            throw new java.lang.NullPointerException("Null packageName");
        }
        this.c = str;
        this.d = j;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.acht) {
            defpackage.acht achtVar = (defpackage.acht) obj;
            if (this.a == achtVar.a && this.b == achtVar.b && this.c.equals(achtVar.c) && this.d == achtVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((this.a ^ (-721379959)) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode();
        long j = this.d;
        return (iHashCode * 1000003) ^ ((int) ((j >>> 32) ^ j));
    }

    public final java.lang.String toString() {
        return "ClearcutEventRecord{account=null, logSource=" + this.a + ", eventCode=" + this.b + ", packageName=" + this.c + ", timestampMs=" + this.d + '}';
    }

    public acht() {
        throw null;
    }
}
