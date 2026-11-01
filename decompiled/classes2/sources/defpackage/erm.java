package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public abstract class erm {
    public static final defpackage.erm a = new defpackage.erj();

    static {
        java.lang.String str = eum.a;
    }

    protected erm() {
    }

    public abstract int a(java.lang.Object obj);

    public abstract int b();

    public abstract int c();

    public abstract defpackage.erk d(int i, defpackage.erk erkVar, boolean z);

    public abstract defpackage.erl e(int i, defpackage.erl erlVar, long j);

    public final boolean equals(java.lang.Object obj) {
        int iH;
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.erm) {
            defpackage.erm ermVar = (defpackage.erm) obj;
            if (ermVar.c() == c() && ermVar.b() == b()) {
                defpackage.erl erlVar = new defpackage.erl();
                defpackage.erk erkVar = new defpackage.erk();
                defpackage.erl erlVar2 = new defpackage.erl();
                defpackage.erk erkVar2 = new defpackage.erk();
                for (int i = 0; i < c(); i++) {
                    if (e(i, erlVar, 0L).equals(ermVar.e(i, erlVar2, 0L))) {
                    }
                }
                for (int i2 = 0; i2 < b(); i2++) {
                    if (d(i2, erkVar, true).equals(ermVar.d(i2, erkVar2, true))) {
                    }
                }
                int iG = g(true);
                if (iG == ermVar.g(true) && (iH = h(true)) == ermVar.h(true)) {
                    while (iG != iH) {
                        int iJ = j(iG, 0, true);
                        if (iJ == ermVar.j(iG, 0, true)) {
                            iG = iJ;
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public abstract java.lang.Object f(int i);

    public int g(boolean z) {
        return n() ? -1 : 0;
    }

    public int h(boolean z) {
        if (n()) {
            return -1;
        }
        return (-1) + c();
    }

    public final int hashCode() {
        int i;
        defpackage.erl erlVar = new defpackage.erl();
        defpackage.erk erkVar = new defpackage.erk();
        int iC = c() + 217;
        int i2 = 0;
        while (true) {
            i = iC * 31;
            if (i2 >= c()) {
                break;
            }
            iC = i + e(i2, erlVar, 0L).hashCode();
            i2++;
        }
        int iB = i + b();
        for (int i3 = 0; i3 < b(); i3++) {
            iB = (iB * 31) + d(i3, erkVar, true).hashCode();
        }
        int iG = g(true);
        while (iG != -1) {
            iB = (iB * 31) + iG;
            iG = j(iG, 0, true);
        }
        return iB;
    }

    public final int i(int i, defpackage.erk erkVar, defpackage.erl erlVar, int i2, boolean z) {
        int i3 = d(i, erkVar, false).c;
        if (e(i3, erlVar, 0L).o != i) {
            return i + 1;
        }
        int iJ = j(i3, i2, z);
        if (iJ != -1) {
            return e(iJ, erlVar, 0L).n;
        }
        return -1;
    }

    public int j(int i, int i2, boolean z) {
        if (i2 != 0) {
            if (i2 == 1) {
                return i;
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException();
            }
            if (i == h(z)) {
                return g(z);
            }
        } else if (i == h(z)) {
            return -1;
        }
        return i + 1;
    }

    public final android.util.Pair k(defpackage.erl erlVar, defpackage.erk erkVar, int i, long j) {
        android.util.Pair pairL = l(erlVar, erkVar, i, j, 0L);
        ahvr.ci(pairL);
        return pairL;
    }

    public final android.util.Pair l(defpackage.erl erlVar, defpackage.erk erkVar, int i, long j, long j2) {
        ahvr.ch(i, c());
        e(i, erlVar, j2);
        if (j == -9223372036854775807L) {
            long j3 = erlVar.l;
            j = 0;
        }
        int i2 = erlVar.n;
        d(i2, erkVar, false);
        while (i2 < erlVar.o) {
            long j4 = erkVar.f;
            if (j == 0) {
                break;
            }
            int i3 = i2 + 1;
            long j5 = d(i3, erkVar, false).f;
            if (j < 0) {
                break;
            }
            i2 = i3;
        }
        d(i2, erkVar, true);
        long j6 = erkVar.f;
        long j7 = erkVar.d;
        if (j7 != -9223372036854775807L) {
            j = java.lang.Math.min(j, j7 - 1);
        }
        long jMax = java.lang.Math.max(0L, j);
        java.lang.Object obj = erkVar.b;
        ahvr.ci(obj);
        return android.util.Pair.create(obj, java.lang.Long.valueOf(jMax));
    }

    public defpackage.erk m(java.lang.Object obj, defpackage.erk erkVar) {
        return d(a(obj), erkVar, true);
    }

    public final boolean n() {
        return c() == 0;
    }

    public int o(int i) {
        if (i != g(false)) {
            return (-1) + i;
        }
        return -1;
    }
}
