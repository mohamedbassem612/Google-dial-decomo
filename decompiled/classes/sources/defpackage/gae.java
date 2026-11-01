package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gae extends defpackage.dzn {
    public final defpackage.gac a;
    public final int b;
    public final int c;
    public final int d;

    public gae(defpackage.gac gacVar, int i, int i2, int i3) {
        defpackage.aooh.f(gacVar, "loadType");
        this.a = gacVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
        if (gacVar == defpackage.gac.a) {
            throw new java.lang.IllegalArgumentException("Drop load type must be PREPEND or APPEND");
        }
        if (q() > 0) {
            if (i3 < 0) {
                throw new java.lang.IllegalArgumentException(defpackage.a.bj(i3, "Invalid placeholdersRemaining "));
            }
        } else {
            throw new java.lang.IllegalArgumentException("Drop count must be > 0, but was " + q());
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.gae) {
            defpackage.gae gaeVar = (defpackage.gae) obj;
            if (this.a == gaeVar.a && this.b == gaeVar.b && this.c == gaeVar.c && this.d == gaeVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final int q() {
        return (this.c - this.b) + 1;
    }

    public final java.lang.String toString() {
        java.lang.String str;
        int iOrdinal = this.a.ordinal();
        if (iOrdinal == 1) {
            str = "front";
        } else {
            if (iOrdinal != 2) {
                throw new java.lang.IllegalArgumentException("Drop load type must be PREPEND or APPEND");
            }
            str = "end";
        }
        return defpackage.aoov.n("PageEvent.Drop from the " + str + " (\n                    |   minPageOffset: " + this.b + "\n                    |   maxPageOffset: " + this.c + "\n                    |   placeholdersRemaining: " + this.d + "\n                    |)");
    }
}
