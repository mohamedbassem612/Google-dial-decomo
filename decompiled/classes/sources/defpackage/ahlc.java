package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ahlc {
    public static final defpackage.ahlc a = new defpackage.ahlc(false, null, null);
    public final boolean b;
    public final defpackage.aoin c;
    private final defpackage.ahkw d;

    public ahlc(boolean z, defpackage.ahkw ahkwVar, defpackage.aoin aoinVar) {
        this.b = z;
        this.d = ahkwVar;
        this.c = aoinVar;
    }

    public final defpackage.ahkw a() {
        defpackage.ahvr.bZ(this.b, "Synclet binding must be enabled to have a SyncConfig");
        defpackage.ahkw ahkwVar = this.d;
        defpackage.ahvr.ci(ahkwVar);
        return ahkwVar;
    }

    public final boolean equals(java.lang.Object obj) {
        defpackage.ahkw ahkwVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.ahlc) {
            defpackage.ahlc ahlcVar = (defpackage.ahlc) obj;
            if (this.b == ahlcVar.b && ((ahkwVar = this.d) != null ? ahkwVar.equals(ahlcVar.d) : ahlcVar.d == null)) {
                defpackage.aoin aoinVar = this.c;
                if (aoinVar == null) {
                    if (ahlcVar.c == null) {
                        return true;
                    }
                } else if (aoinVar.equals(ahlcVar.c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        defpackage.ahkw ahkwVar = this.d;
        int iHashCode = (((true != this.b ? 1237 : 1231) ^ 1000003) * 1000003) ^ (ahkwVar == null ? 0 : ahkwVar.hashCode());
        defpackage.aoin aoinVar = this.c;
        return (iHashCode * 1000003) ^ (aoinVar != null ? aoinVar.hashCode() : 0);
    }

    public final java.lang.String toString() {
        defpackage.aoin aoinVar = this.c;
        return "SyncletBinding{enabled=" + this.b + ", syncConfig=" + java.lang.String.valueOf(this.d) + ", syncletProvider=" + java.lang.String.valueOf(aoinVar) + '}';
    }

    public ahlc() {
        throw null;
    }
}
