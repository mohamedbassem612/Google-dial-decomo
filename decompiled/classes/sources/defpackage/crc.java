package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class crc {
    public static final defpackage.crc a = new defpackage.crc(-72057594037927936L, 0, 0.0f);
    public final long b;
    public final long c;
    public final float d;

    public crc(long j, long j2, float f) {
        this.b = j;
        this.c = j2;
        this.d = f;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.crc) {
            defpackage.crc crcVar = (defpackage.crc) obj;
            if (this.b == crcVar.b && this.c == crcVar.c && this.d == crcVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.b;
        long j2 = this.c;
        return (((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + java.lang.Float.floatToIntBits(this.d);
    }

    public final java.lang.String toString() {
        long j = this.c;
        return "Shadow(color=" + defpackage.cqg.g(this.b) + ", offset=" + defpackage.cpm.c(j) + ", blurRadius=" + this.d + ')';
    }

    public crc() {
        this(-72057594037927936L, 0L, 0.0f);
    }
}
