package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class gds {
    public final int c;
    public final int d;
    public final int e;
    public final int f;

    public gds(int i, int i2, int i3, int i4) {
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
    }

    public final int a(defpackage.gac gacVar) {
        defpackage.aooh.f(gacVar, "loadType");
        int iOrdinal = gacVar.ordinal();
        if (iOrdinal == 0) {
            throw new java.lang.IllegalArgumentException("Cannot get presentedItems for loadType: REFRESH");
        }
        if (iOrdinal == 1) {
            return this.c;
        }
        if (iOrdinal == 2) {
            return this.d;
        }
        throw new defpackage.aois();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.gds) {
            defpackage.gds gdsVar = (defpackage.gds) obj;
            if (this.c == gdsVar.c && this.d == gdsVar.d && this.e == gdsVar.e && this.f == gdsVar.f) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.c + this.d + this.e + this.f;
    }
}
