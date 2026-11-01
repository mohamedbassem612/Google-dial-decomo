package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ahkw {
    public final long a;
    public final long b;
    public final java.util.Map c;
    public final boolean d;

    public ahkw(long j, long j2, java.util.Map map) {
        this.a = j;
        this.b = j2;
        this.c = map;
        this.d = false;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.ahkw) {
            defpackage.ahkw ahkwVar = (defpackage.ahkw) obj;
            if (this.a == ahkwVar.a && this.b == ahkwVar.b && defpackage.ahvr.aJ(this.c, ahkwVar.c)) {
                boolean z = ahkwVar.d;
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.b;
        long j2 = this.a;
        return ((((((((int) ((j2 >>> 32) ^ j2)) ^ 1000003) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ this.c.hashCode()) * 1000003) ^ 1237;
    }

    public final java.lang.String toString() {
        return "SyncConfig{minSyncInterval=" + this.a + ", timeout=" + this.b + ", constraints=" + defpackage.ahvr.aF(this.c) + ", allowMultiprocess=false}";
    }

    public ahkw() {
        throw null;
    }
}
