package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class eys {
    public int a;
    public boolean b;
    public defpackage.exp c;
    public defpackage.eyq d;
    public final defpackage.eyq[] e;
    public final defpackage.eyq[] f;
    public defpackage.eyq g;
    public defpackage.eyq h;
    public int i;
    public java.lang.Object j;
    public final defpackage.ezv l;
    public final rai m;
    private final defpackage.etk p;
    private long q;
    private long r;
    private final defpackage.erk n = new defpackage.erk();
    private final defpackage.erl o = new defpackage.erl();
    public java.util.List k = new java.util.ArrayList();

    public eys(defpackage.ezv ezvVar, defpackage.etk etkVar, rai raiVar, defpackage.exp expVar, int i) {
        this.l = ezvVar;
        this.p = etkVar;
        this.m = raiVar;
        this.c = expVar;
        this.e = new defpackage.eyq[i];
        this.f = new defpackage.eyq[i];
    }

    private static defpackage.ffu A(defpackage.erm ermVar, java.lang.Object obj, long j, long j2, defpackage.erl erlVar, defpackage.erk erkVar) {
        ermVar.m(obj, erkVar);
        ermVar.e(erkVar.c, erlVar, 0L);
        ermVar.a(obj);
        erkVar.j();
        ermVar.m(obj, erkVar);
        int iC = erkVar.c(j);
        return iC == -1 ? new defpackage.ffu(obj, -1, -1, j2, erkVar.b(j)) : new defpackage.ffu(obj, iC, erkVar.d(iC), j2, -1);
    }

    private final boolean B(defpackage.erm ermVar, defpackage.ffu ffuVar, boolean z) {
        int iA = ermVar.a(ffuVar.a);
        defpackage.erk erkVar = this.n;
        int i = ermVar.d(iA, erkVar, false).c;
        defpackage.erl erlVar = this.o;
        return !ermVar.e(i, erlVar, 0L).i && ermVar.i(iA, erkVar, erlVar, this.a, this.b) == -1 && z;
    }

    private final boolean C(defpackage.erm ermVar, defpackage.ffu ffuVar) {
        if (!E(ffuVar)) {
            return false;
        }
        java.lang.Object obj = ffuVar.a;
        return ermVar.e(ermVar.m(obj, this.n).c, this.o, 0L).o == ermVar.a(obj);
    }

    private static boolean D(defpackage.erm ermVar, int i, long j, defpackage.erl erlVar) {
        if (j != -9223372036854775807L) {
            return false;
        }
        ermVar.e(i, erlVar, 0L);
        return erlVar.i && !erlVar.k;
    }

    private static final boolean E(defpackage.ffu ffuVar) {
        return !ffuVar.c() && ffuVar.e == -1;
    }

    private final void F(defpackage.erm ermVar, java.lang.Object obj, int i) {
        defpackage.erk erkVar = this.n;
        ermVar.m(obj, erkVar);
        erkVar.k(i);
        long j = erkVar.h.a(i).i;
    }

    public static final boolean v(defpackage.eyq[] eyqVarArr, long[] jArr, defpackage.eyq eyqVar, long j) {
        for (int i = 0; i < eyqVarArr.length; i++) {
            defpackage.eyq eyqVar2 = eyqVarArr[i];
            if (eyqVar2 != null) {
                for (defpackage.eyq eyqVar3 = eyqVar.h; eyqVar3 != null; eyqVar3 = eyqVar3.h) {
                    if (eyqVar3.equals(eyqVar2)) {
                        return true;
                    }
                }
                if (eyqVar2.equals(eyqVar)) {
                    long j2 = jArr[i];
                    if (j2 == Long.MIN_VALUE || j2 >= j) {
                        return true;
                    }
                } else {
                    continue;
                }
            }
        }
        return false;
    }

    private final long w(defpackage.erm ermVar, defpackage.ffu ffuVar) {
        java.lang.Object obj = ffuVar.a;
        defpackage.erk erkVar = this.n;
        ermVar.m(obj, erkVar);
        if (ffuVar.c()) {
            return erkVar.e(ffuVar.b, ffuVar.c);
        }
        int i = ffuVar.e;
        if (i == -1) {
            return erkVar.d;
        }
        erkVar.k(i);
        return 0L;
    }

    private final long x(java.lang.Object obj) {
        for (int i = 0; i < this.k.size(); i++) {
            defpackage.eyq eyqVar = (defpackage.eyq) this.k.get(i);
            if (eyqVar.b.equals(obj)) {
                return eyqVar.g.a.d;
            }
        }
        return -1L;
    }

    private final defpackage.eyr y(defpackage.erm ermVar, java.lang.Object obj, int i, int i2, long j, long j2) {
        defpackage.ffu ffuVar = new defpackage.ffu(obj, i, i2, j2, -1);
        java.lang.Object obj2 = ffuVar.a;
        int i3 = ffuVar.b;
        int i4 = ffuVar.c;
        defpackage.erk erkVar = this.n;
        long jE = ermVar.m(obj2, erkVar).e(i3, i4);
        if (i2 == erkVar.d(i)) {
            erkVar.g();
        }
        erkVar.h(i3);
        long jMax = 0;
        if (jE != -9223372036854775807L && jE <= 0) {
            jMax = java.lang.Math.max(0L, (-1) + jE);
        }
        return new defpackage.eyr(ffuVar, jMax, -9223372036854775807L, j, jE, false, false, false);
    }

    private final defpackage.eyr z(defpackage.erm ermVar, java.lang.Object obj, long j, long j2, long j3, long j4) {
        defpackage.erk erkVar = this.n;
        ermVar.m(obj, erkVar);
        int iB = erkVar.b(j);
        if (iB != -1) {
            erkVar.h(iB);
        }
        if (iB != -1) {
            erkVar.h(iB);
        }
        defpackage.ffu ffuVar = new defpackage.ffu(obj, -1, -1, j4, iB);
        boolean zE = E(ffuVar);
        boolean zC = C(ermVar, ffuVar);
        boolean zB = B(ermVar, ffuVar, zE);
        long jW = w(ermVar, ffuVar);
        return new defpackage.eyr(ffuVar, (jW == -9223372036854775807L || j < jW) ? j : java.lang.Math.max(0L, jW - 1), j2, j3, jW, zE, zC, zB);
    }

    public final int a(defpackage.eyq eyqVar) {
        defpackage.eyq[] eyqVarArr;
        ahvr.ci(eyqVar);
        if (eyqVar.equals(this.g)) {
            return 0;
        }
        this.g = eyqVar;
        int i = 0;
        while (true) {
            eyqVar = eyqVar.h;
            if (eyqVar == null) {
                defpackage.eyq eyqVar2 = this.g;
                ahvr.ci(eyqVar2);
                eyqVar2.h(null);
                q();
                return i;
            }
            int i2 = 0;
            while (true) {
                eyqVarArr = this.e;
                if (i2 >= eyqVarArr.length) {
                    break;
                }
                if (eyqVar.equals(eyqVarArr[i2])) {
                    defpackage.eyq eyqVar3 = this.g;
                    eyqVarArr[i2] = eyqVar3;
                    this.f[i2] = eyqVar3;
                    i = 3;
                }
                i2++;
            }
            int i3 = 0;
            while (true) {
                defpackage.eyq[] eyqVarArr2 = this.f;
                if (i3 < eyqVarArr2.length) {
                    if (eyqVar.equals(eyqVarArr2[i3])) {
                        eyqVarArr2[i3] = eyqVarArr[i3];
                        i |= 2;
                    }
                    i3++;
                }
            }
            eyqVar.g();
            this.i--;
        }
    }

    public final int b(defpackage.erm ermVar) {
        defpackage.erm ermVar2;
        defpackage.eyq eyqVar;
        defpackage.eyq eyqVar2 = this.d;
        if (eyqVar2 == null) {
            return 0;
        }
        int iA = ermVar.a(eyqVar2.b);
        while (true) {
            ermVar2 = ermVar;
            iA = ermVar2.i(iA, this.n, this.o, this.a, this.b);
            while (true) {
                ahvr.ci(eyqVar2);
                eyqVar = eyqVar2.h;
                if (eyqVar == null || eyqVar2.g.g) {
                    break;
                }
                eyqVar2 = eyqVar;
            }
            if (iA == -1 || eyqVar == null || ermVar2.a(eyqVar.b) != iA) {
                break;
            }
            eyqVar2 = eyqVar;
            ermVar = ermVar2;
        }
        int iA2 = a(eyqVar2);
        eyqVar2.g = l(ermVar2, eyqVar2.g);
        return iA2;
    }

    public final defpackage.eyq c() {
        defpackage.eyq eyqVar;
        defpackage.eyq eyqVar2;
        if (this.d == null) {
            return null;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            defpackage.eyq[] eyqVarArr = this.e;
            int length = eyqVarArr.length;
            eyqVar = this.d;
            if (i2 >= length) {
                break;
            }
            if (eyqVar.equals(eyqVarArr[i2])) {
                eyqVarArr[i2] = this.d.h;
            }
            i2++;
        }
        ahvr.ci(eyqVar);
        while (true) {
            defpackage.eyq[] eyqVarArr2 = this.f;
            int length2 = eyqVarArr2.length;
            eyqVar2 = this.d;
            if (i >= length2) {
                break;
            }
            if (eyqVar2.equals(eyqVarArr2[i])) {
                eyqVarArr2[i] = this.d.h;
            }
            i++;
        }
        ahvr.ci(eyqVar2);
        this.d.g();
        int i3 = this.i - 1;
        this.i = i3;
        if (i3 == 0) {
            this.g = null;
            defpackage.eyq eyqVar3 = this.d;
            this.j = eyqVar3.b;
            this.r = eyqVar3.g.a.d;
        }
        this.d = this.d.h;
        q();
        return this.d;
    }

    public final defpackage.eyq d(int i) {
        defpackage.eyq[] eyqVarArr = this.f;
        defpackage.eyq eyqVar = eyqVarArr[i];
        defpackage.eyq[] eyqVarArr2 = this.e;
        if (j$.util.Objects.equals(eyqVar, eyqVarArr2[i])) {
            defpackage.eyq eyqVar2 = eyqVarArr2[i];
            ahvr.ci(eyqVar2);
            eyqVarArr[i] = eyqVar2.h;
        }
        defpackage.eyq eyqVar3 = eyqVarArr2[i];
        ahvr.ci(eyqVar3);
        eyqVarArr2[i] = eyqVar3.h;
        q();
        defpackage.eyq eyqVar4 = eyqVarArr2[i];
        ahvr.ci(eyqVar4);
        return eyqVar4;
    }

    public final defpackage.eyq e() {
        for (defpackage.eyq eyqVar = this.d; eyqVar != null; eyqVar = eyqVar.h) {
            for (defpackage.eyq eyqVar2 : this.f) {
                if (eyqVar.equals(eyqVar2)) {
                    return eyqVar;
                }
            }
        }
        return null;
    }

    public final defpackage.eyq f() {
        for (defpackage.eyq eyqVar = this.d; eyqVar != null; eyqVar = eyqVar.h) {
            for (defpackage.eyq eyqVar2 : this.e) {
                if (eyqVar.equals(eyqVar2)) {
                    return eyqVar;
                }
            }
        }
        return null;
    }

    public final defpackage.eyq g() {
        java.lang.Object[] objArr = this.e;
        if (objArr.length == 0) {
            return null;
        }
        defpackage.eyq eyqVar = objArr[0];
        for (defpackage.eyq eyqVar2 = this.d; eyqVar2 != null; eyqVar2 = eyqVar2.h) {
            for (java.lang.Object obj : objArr) {
                if (eyqVar2.equals(obj)) {
                    eyqVar = eyqVar2;
                    break;
                }
            }
        }
        return eyqVar;
    }

    public final defpackage.eyq h(int i) {
        return this.f[i];
    }

    public final defpackage.eyq i(int i) {
        return this.e[i];
    }

    public final defpackage.eyr j(defpackage.erm ermVar, defpackage.eyq eyqVar, long j) {
        int i;
        defpackage.erm ermVar2;
        long j2;
        long j3;
        defpackage.erl erlVar;
        java.lang.Object obj;
        long j4;
        long j5;
        long j6;
        long j7;
        long j8;
        defpackage.eyr eyrVar = eyqVar.g;
        long j9 = eyqVar.k;
        long j10 = eyrVar.e;
        long j11 = (j9 + j10) - j;
        if (eyrVar.g) {
            defpackage.ffu ffuVar = eyrVar.a;
            java.lang.Object obj2 = ffuVar.a;
            int iA = ermVar.a(obj2);
            int i2 = this.a;
            boolean z = this.b;
            defpackage.erl erlVar2 = this.o;
            defpackage.erk erkVar = this.n;
            int i3 = ermVar.i(iA, erkVar, erlVar2, i2, z);
            if (i3 != -1) {
                int i4 = ermVar.d(i3, erkVar, true).c;
                java.lang.Object obj3 = erkVar.b;
                ahvr.ci(obj3);
                long j12 = ffuVar.d;
                if (ermVar.e(i4, erlVar2, 0L).n == i3) {
                    long jMax = D(ermVar, erkVar.c, erkVar.d, erlVar2) ? java.lang.Math.max(0L, j11) : -9223372036854775807L;
                    android.util.Pair pairL = ermVar.l(erlVar2, erkVar, i4, -9223372036854775807L, jMax);
                    if (pairL != null) {
                        java.lang.Object obj4 = pairL.first;
                        long jLongValue = ((java.lang.Long) pairL.second).longValue();
                        defpackage.eyq eyqVar2 = eyqVar.h;
                        if (eyqVar2 == null || !eyqVar2.b.equals(obj4)) {
                            long jX = x(obj4);
                            if (jX == -1) {
                                jX = this.q;
                                this.q = 1 + jX;
                            }
                            j8 = jX;
                        } else {
                            j8 = eyqVar2.g.a.d;
                        }
                        j4 = jLongValue;
                        j7 = jMax;
                        erlVar = erlVar2;
                        obj = obj4;
                        j5 = j8;
                        j6 = -9223372036854775807L;
                    }
                } else {
                    erlVar = erlVar2;
                    obj = obj3;
                    j4 = 0;
                    j5 = j12;
                    j6 = 0;
                    j7 = -9223372036854775807L;
                }
                defpackage.ffu ffuVarA = A(ermVar, obj, j4, j5, erlVar, erkVar);
                long j13 = j4;
                if (j6 != -9223372036854775807L && eyrVar.d != -9223372036854775807L) {
                    ermVar.m(obj2, erkVar).j();
                    int i5 = erkVar.h.d;
                }
                return k(ermVar, ffuVarA, j6, j13, j7);
            }
        } else {
            defpackage.ffu ffuVar2 = eyrVar.a;
            java.lang.Object obj5 = ffuVar2.a;
            defpackage.erk erkVar2 = this.n;
            ermVar.m(obj5, erkVar2);
            if (!ffuVar2.c()) {
                int i6 = ffuVar2.e;
                if (i6 != -1) {
                    erkVar2.j();
                    if (i6 == -1) {
                        erkVar2.h.a(-1);
                        i = -1;
                    } else {
                        i = i6;
                    }
                } else {
                    i = -1;
                }
                int iD = erkVar2.d(i);
                erkVar2.h(i);
                if (iD != erkVar2.a(i)) {
                    return y(ermVar, obj5, i, iD, j10, ffuVar2.d);
                }
                F(ermVar, obj5, i);
                return z(ermVar, obj5, 0L, -9223372036854775807L, j10, ffuVar2.d);
            }
            int i7 = ffuVar2.b;
            if (erkVar2.a(i7) != -1) {
                int iA2 = erkVar2.h.a(i7).a(ffuVar2.c);
                if (iA2 < 0) {
                    return y(ermVar, obj5, i7, iA2, eyrVar.d, ffuVar2.d);
                }
                long jLongValue2 = eyrVar.d;
                if (jLongValue2 == -9223372036854775807L) {
                    defpackage.erl erlVar3 = this.o;
                    long jMax2 = D(ermVar, erkVar2.c, erkVar2.d, erlVar3) ? java.lang.Math.max(0L, j11) : -9223372036854775807L;
                    ermVar2 = ermVar;
                    android.util.Pair pairL2 = ermVar2.l(erlVar3, erkVar2, erkVar2.c, -9223372036854775807L, jMax2);
                    if (pairL2 != null) {
                        jLongValue2 = ((java.lang.Long) pairL2.second).longValue();
                        j3 = jMax2;
                        j2 = -9223372036854775807L;
                    }
                } else {
                    ermVar2 = ermVar;
                    j2 = jLongValue2;
                    j3 = -9223372036854775807L;
                }
                F(ermVar2, obj5, i7);
                return z(ermVar2, obj5, java.lang.Math.max(0L, jLongValue2), j3, j2, ffuVar2.d);
            }
        }
        return null;
    }

    public final defpackage.eyr k(defpackage.erm ermVar, defpackage.ffu ffuVar, long j, long j2, long j3) {
        java.lang.Object obj = ffuVar.a;
        ermVar.m(obj, this.n);
        return ffuVar.c() ? y(ermVar, obj, ffuVar.b, ffuVar.c, j, ffuVar.d) : z(ermVar, obj, j2, j3, j, ffuVar.d);
    }

    public final defpackage.eyr l(defpackage.erm ermVar, defpackage.eyr eyrVar) {
        defpackage.ffu ffuVar = eyrVar.a;
        boolean zE = E(ffuVar);
        boolean zC = C(ermVar, ffuVar);
        boolean zB = B(ermVar, ffuVar, zE);
        long jW = w(ermVar, ffuVar);
        java.lang.Object obj = ffuVar.a;
        defpackage.erk erkVar = this.n;
        ermVar.m(obj, erkVar);
        if (ffuVar.c()) {
            erkVar.h(ffuVar.b);
        } else {
            int i = ffuVar.e;
            if (i != -1) {
                erkVar.h(i);
            }
        }
        return new defpackage.eyr(ffuVar, eyrVar.b, eyrVar.c, eyrVar.d, jW, zE, zC, zB);
    }

    public final defpackage.ffu m(defpackage.eza ezaVar, defpackage.erm ermVar, java.lang.Object obj, long j, boolean z, boolean z2) {
        long jX;
        int iA;
        java.lang.Object obj2 = obj;
        defpackage.erk erkVar = this.n;
        int i = ermVar.m(obj2, erkVar).c;
        java.lang.Object obj3 = this.j;
        if (obj3 == null || (iA = ermVar.a(obj3)) == -1 || ermVar.d(iA, erkVar, false).c != i) {
            defpackage.eyq eyqVar = this.d;
            while (true) {
                if (eyqVar == null) {
                    defpackage.eyq eyqVar2 = this.d;
                    while (true) {
                        if (eyqVar2 == null) {
                            jX = x(obj2);
                            if (jX != -1) {
                                break;
                            }
                            jX = this.q;
                            this.q = 1 + jX;
                            if (this.d != null) {
                                break;
                            }
                            this.j = obj2;
                            this.r = jX;
                            break;
                        }
                        int iA2 = ermVar.a(eyqVar2.b);
                        if (iA2 != -1 && ermVar.d(iA2, erkVar, false).c == i) {
                            jX = eyqVar2.g.a.d;
                            break;
                        }
                        eyqVar2 = eyqVar2.h;
                    }
                } else {
                    if (eyqVar.b.equals(obj2)) {
                        jX = eyqVar.g.a.d;
                        break;
                    }
                    eyqVar = eyqVar.h;
                }
            }
        } else {
            jX = this.r;
        }
        long j2 = jX;
        if (!z && !z2) {
            defpackage.ffu ffuVar = ezaVar.c;
            defpackage.ffu ffuVarA = A(ermVar, obj2, j, j2, this.o, erkVar);
            if (ffuVar.c() && ffuVar.equals(ffuVarA)) {
                return ffuVar;
            }
            ermVar.m(obj2, erkVar);
            return new defpackage.ffu(obj2, -1, -1, j2, erkVar.b(j));
        }
        ermVar.m(obj2, erkVar);
        int i2 = erkVar.c;
        defpackage.erl erlVar = this.o;
        ermVar.e(i2, erlVar, 0L);
        for (int iA3 = ermVar.a(obj); iA3 >= erlVar.n; iA3--) {
            ermVar.d(iA3, erkVar, true);
            erkVar.j();
            if (erkVar.c(erkVar.d) != -1) {
                obj2 = erkVar.b;
                ahvr.ci(obj2);
            }
        }
        defpackage.ffu ffuVarA2 = A(ermVar, obj2, j, j2, erlVar, erkVar);
        int i3 = ffuVarA2.b;
        if (i3 != -1 && !z) {
            java.lang.Object obj4 = ffuVarA2.a;
            ermVar.m(obj4, erkVar);
            long j3 = erkVar.h.a(i3).a;
            if (j != 0) {
                return new defpackage.ffu(obj4, -1, -1, ffuVarA2.d, erkVar.b(j));
            }
        }
        return ffuVarA2;
    }

    public final void n(int i) {
        defpackage.eyq[] eyqVarArr = this.f;
        defpackage.eyq eyqVar = eyqVarArr[i];
        ahvr.ci(eyqVar);
        eyqVarArr[i] = eyqVar.h;
        q();
    }

    public final void o() {
        if (this.i != 0) {
            defpackage.eyq eyqVar = this.d;
            ahvr.ci(eyqVar);
            this.j = eyqVar.b;
            this.r = eyqVar.g.a.d;
            while (eyqVar != null) {
                eyqVar.g();
                eyqVar = eyqVar.h;
            }
            this.d = null;
            this.g = null;
            java.util.Arrays.fill(this.e, (java.lang.Object) null);
            java.util.Arrays.fill(this.f, (java.lang.Object) null);
            this.i = 0;
            q();
        }
    }

    public final void p() {
        defpackage.eyq eyqVar = this.h;
        if (eyqVar == null || eyqVar.k()) {
            this.h = null;
            for (int i = 0; i < this.k.size(); i++) {
                defpackage.eyq eyqVar2 = (defpackage.eyq) this.k.get(i);
                if (!eyqVar2.k()) {
                    this.h = eyqVar2;
                    return;
                }
            }
        }
    }

    public final void q() {
        defpackage.eyq eyqVar;
        aift aiftVar = new aift(4);
        for (defpackage.eyq eyqVar2 = this.d; eyqVar2 != null; eyqVar2 = eyqVar2.h) {
            aiftVar.i(eyqVar2.g.a);
        }
        defpackage.eyq[] eyqVarArr = this.e;
        defpackage.ffu ffuVar = null;
        if (eyqVarArr.length != 0 && (eyqVar = eyqVarArr[0]) != null) {
            ffuVar = eyqVar.g.a;
        }
        this.p.d(new defpackage.ac((java.lang.Object) this, (java.lang.Object) aiftVar, (java.lang.Object) ffuVar, 7, (short[]) null));
    }

    public final void r(long j) {
        defpackage.eyq eyqVar = this.g;
        if (eyqVar != null) {
            ahvr.bY(eyqVar.l());
            if (eyqVar.e) {
                eyqVar.a.dH(j - eyqVar.k);
            }
        }
    }

    public final void s() {
        if (this.k.isEmpty()) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < this.k.size(); i++) {
            ((defpackage.eyq) this.k.get(i)).g();
        }
        this.k = arrayList;
        this.h = null;
        p();
    }

    public final boolean t(defpackage.ffs ffsVar) {
        defpackage.eyq eyqVar = this.g;
        return eyqVar != null && eyqVar.a == ffsVar;
    }

    public final boolean u(defpackage.ffs ffsVar) {
        defpackage.eyq eyqVar = this.h;
        return eyqVar != null && eyqVar.a == ffsVar;
    }
}
