package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ahau {
    public final aify a;
    public final boolean b;
    public final long c;
    private final int d;

    public ahau(aify aifyVar, boolean z, long j, int i) {
        this.a = aifyVar;
        this.b = z;
        this.c = j;
        this.d = i;
    }

    public final boolean a() {
        return this.c == 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.ahau) {
            defpackage.ahau ahauVar = (defpackage.ahau) obj;
            if (ahvr.aP(this.a, ahauVar.a) && this.b == ahauVar.b && this.c == ahauVar.c) {
                int i = this.d;
                int i2 = ahauVar.d;
                if (i == 0) {
                    throw null;
                }
                if (i == i2) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        int i = this.d;
        anty.aJ(i);
        int i2 = ((iHashCode * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003;
        long j = this.c;
        return ((i2 ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ i;
    }

    public final java.lang.String toString() {
        java.lang.String str;
        java.lang.String strValueOf = java.lang.String.valueOf(this.a);
        int i = this.d;
        if (i != 1) {
            str = i != 2 ? "null" : "NORMAL";
        } else {
            str = "MINI";
        }
        long j = this.c;
        return "DebugDataRequest{acceptTypes=" + strValueOf + ", allowPii=" + this.b + ", timeLimitMs=" + j + ", size=" + str + '}';
    }

    public ahau() {
        throw null;
    }
}
