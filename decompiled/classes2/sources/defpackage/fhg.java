package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fhg {
    public static final defpackage.fhg a = new defpackage.fhg(new defpackage.ern[0]);
    public final int b;
    public final aify c;
    private int d;

    static {
        java.lang.String str = eum.a;
    }

    public fhg(defpackage.ern... ernVarArr) {
        this.c = aify.o(ernVarArr);
        this.b = ernVarArr.length;
        int i = 0;
        while (i < this.c.d) {
            int i2 = i + 1;
            int i3 = i2;
            while (true) {
                aike aikeVar = this.c;
                if (i3 < aikeVar.d) {
                    if (((defpackage.ern) aikeVar.get(i)).equals(this.c.get(i3))) {
                        defpackage.etr.d("TrackGroupArray", "", new java.lang.IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                    }
                    i3++;
                }
            }
            i = i2;
        }
    }

    public final int a(defpackage.ern ernVar) {
        int iIndexOf = this.c.indexOf(ernVar);
        if (iIndexOf < 0) {
            return -1;
        }
        return iIndexOf;
    }

    public final defpackage.ern b(int i) {
        return (defpackage.ern) this.c.get(i);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            defpackage.fhg fhgVar = (defpackage.fhg) obj;
            if (this.b == fhgVar.b && ahvr.aP(this.c, fhgVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.d;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.c.hashCode();
        this.d = iHashCode;
        return iHashCode;
    }

    public final java.lang.String toString() {
        return this.c.toString();
    }
}
