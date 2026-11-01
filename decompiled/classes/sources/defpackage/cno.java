package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class cno {
    public final int a;
    public final int b;
    public final defpackage.kaw c;
    private final long d;

    public cno(int i, long j, int i2, defpackage.kaw kawVar) {
        this.a = i;
        this.d = j;
        this.b = i2;
        this.c = kawVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.cno) {
            defpackage.cno cnoVar = (defpackage.cno) obj;
            if (this.a == cnoVar.a && this.d == cnoVar.d && this.b == cnoVar.b && defpackage.aooh.n(this.c, cnoVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        defpackage.kaw kawVar = this.c;
        int iHashCode = kawVar == null ? 0 : kawVar.hashCode();
        long j = this.d;
        return (((((this.a * 31) + defpackage.anty.M(j)) * 31) + this.b) * 31) + iHashCode;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ContentCaptureEvent(id=");
        sb.append(this.a);
        sb.append(", timestamp=");
        sb.append(this.d);
        sb.append(", type=");
        sb.append((java.lang.Object) (this.b != 1 ? "VIEW_DISAPPEAR" : "VIEW_APPEAR"));
        sb.append(", structureCompat=");
        sb.append(this.c);
        sb.append(')');
        return sb.toString();
    }
}
