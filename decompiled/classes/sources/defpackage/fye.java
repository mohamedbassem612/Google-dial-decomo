package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class fye {
    public final defpackage.aojw a;
    public final defpackage.aojw b;
    public defpackage.fya c;
    public int d;
    public defpackage.fyd e;
    public final defpackage.aozj f = new defpackage.aozj(defpackage.fyf.a);
    private final defpackage.aozh g;
    private boolean h;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;
    private final defpackage.aozj n;
    private final defpackage.ads o;
    private final defpackage.ads p;
    private final defpackage.ads q;

    public fye() {
        defpackage.aozj aozjVar = new defpackage.aozj(new defpackage.fyb(null));
        this.n = aozjVar;
        this.g = new defpackage.aoys(aozjVar, null);
        this.a = new defpackage.aojw();
        this.b = new defpackage.aojw();
        defpackage.ads adsVar = defpackage.adt.a;
        this.o = new defpackage.ads(6);
        this.p = new defpackage.ads(6);
        this.q = new defpackage.ads(6);
    }

    public final defpackage.fya a(int i) {
        java.lang.Object next;
        java.lang.Object next2;
        defpackage.aojw aojwVar = this.a;
        java.lang.Object obj = null;
        if (i != -1) {
            java.util.Iterator<E> it = aojwVar.iterator();
            do {
                if (!it.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it.next();
            } while (!((defpackage.fya) next2).h());
            defpackage.fya fyaVar = (defpackage.fya) next2;
            if (fyaVar != null) {
                return fyaVar;
            }
            for (java.lang.Object obj2 : this.b) {
                if (((defpackage.fya) obj2).h()) {
                    obj = obj2;
                    break;
                }
            }
            return (defpackage.fya) obj;
        }
        java.util.Iterator<E> it2 = aojwVar.iterator();
        do {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
        } while (!((defpackage.fya) next).h());
        defpackage.fya fyaVar2 = (defpackage.fya) next;
        if (fyaVar2 != null) {
            return fyaVar2;
        }
        for (java.lang.Object obj3 : this.b) {
            if (((defpackage.fya) obj3).h()) {
                obj = obj3;
                break;
            }
        }
        return (defpackage.fya) obj;
    }

    public final void b(defpackage.fxy fxyVar, defpackage.fyd fydVar, int i) {
        defpackage.ads adsVar;
        boolean z;
        if (fydVar == null) {
            defpackage.aooh.i("input");
        }
        if (i != 0) {
            adsVar = i != 1 ? this.o : this.p;
        } else {
            adsVar = this.q;
        }
        adsVar.d(fydVar);
        defpackage.fxy fxyVar2 = fydVar.c;
        if (fxyVar2 != null) {
            throw new java.lang.IllegalArgumentException(defpackage.a.bm((byte) 46, fxyVar2, fydVar, "Input '", "' is already added to dispatcher "));
        }
        fydVar.c = fxyVar;
        if (((defpackage.fyb) this.g.c()) == null) {
            defpackage.aooh.i("history");
            defpackage.aooh.i("history");
        }
        if (i != 0) {
            z = i != 1 ? this.m : this.i;
        } else {
            z = this.k;
        }
        fydVar.a();
        fydVar.c(z);
    }

    /* JADX WARN: Code duplicated, block: B:115:0x0101 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x00da A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:79:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:81:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:83:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:99:0x013a  */
    public final void c() {
        boolean z;
        boolean z2;
        long j;
        java.lang.Object[] objArr;
        long[] jArr;
        int i;
        defpackage.fyd fydVar;
        java.lang.Object[] objArr2;
        long[] jArr2;
        int i2;
        defpackage.fyd fydVar2;
        boolean z3;
        defpackage.fya fyaVarA;
        defpackage.aojw<defpackage.fya> aojwVar = this.a;
        if (aojwVar.isEmpty()) {
            z = false;
            break;
        }
        java.util.Iterator<E> it = aojwVar.iterator();
        while (true) {
            if (it.hasNext()) {
                if (((defpackage.fya) it.next()).h()) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        if (!aojwVar.isEmpty()) {
            for (defpackage.fya fyaVar : aojwVar) {
            }
        }
        defpackage.aojw<defpackage.fya> aojwVar2 = this.b;
        if (aojwVar2.isEmpty()) {
            z2 = false;
            break;
        }
        java.util.Iterator<E> it2 = aojwVar2.iterator();
        while (true) {
            if (it2.hasNext()) {
                if (((defpackage.fya) it2.next()).h()) {
                    z2 = true;
                    break;
                }
            } else {
                z2 = false;
                break;
            }
        }
        if (!aojwVar2.isEmpty()) {
            for (defpackage.fya fyaVar2 : aojwVar2) {
            }
        }
        boolean z4 = z || z2;
        boolean z5 = this.j != z;
        boolean z6 = this.k != z;
        boolean z7 = this.h != z2;
        boolean z8 = this.i != z2;
        boolean z9 = this.l != z4;
        boolean z10 = this.m != z4;
        char c = 31;
        if (z5) {
            defpackage.ads adsVar = this.q;
            j = 2147483647L;
            objArr = adsVar.b;
            jArr = adsVar.c;
            i = adsVar.e;
            while (i != Integer.MAX_VALUE) {
                long j2 = (jArr[i] >> c) & 2147483647L;
                char c2 = c;
                fydVar = (defpackage.fyd) objArr[i];
                if (z5) {
                    fydVar.a();
                }
                if (z6) {
                    fydVar.c(z);
                }
                i = (int) j2;
                c = c2;
            }
        } else if (z6) {
            z6 = true;
            defpackage.ads adsVar2 = this.q;
            j = 2147483647L;
            objArr = adsVar2.b;
            jArr = adsVar2.c;
            i = adsVar2.e;
            while (i != Integer.MAX_VALUE) {
                long j3 = (jArr[i] >> c) & 2147483647L;
                char c3 = c;
                fydVar = (defpackage.fyd) objArr[i];
                if (z5) {
                    fydVar.a();
                }
                if (z6) {
                    fydVar.c(z);
                }
                i = (int) j3;
                c = c3;
            }
        } else {
            j = 2147483647L;
        }
        char c4 = c;
        if (z7) {
            defpackage.ads adsVar3 = this.p;
            objArr2 = adsVar3.b;
            jArr2 = adsVar3.c;
            i2 = adsVar3.e;
            while (i2 != Integer.MAX_VALUE) {
                long j4 = (jArr2[i2] >> c4) & j;
                fydVar2 = (defpackage.fyd) objArr2[i2];
                if (z7) {
                    fydVar2.a();
                }
                if (z8) {
                    fydVar2.c(z2);
                }
                i2 = (int) j4;
            }
        } else if (z8) {
            z8 = true;
            defpackage.ads adsVar4 = this.p;
            objArr2 = adsVar4.b;
            jArr2 = adsVar4.c;
            i2 = adsVar4.e;
            while (i2 != Integer.MAX_VALUE) {
                long j5 = (jArr2[i2] >> c4) & j;
                fydVar2 = (defpackage.fyd) objArr2[i2];
                if (z7) {
                    fydVar2.a();
                }
                if (z8) {
                    fydVar2.c(z2);
                }
                i2 = (int) j5;
            }
        }
        if (!z9) {
            if (z10) {
                z3 = true;
            }
            this.j = z;
            this.k = z;
            this.h = z2;
            this.i = z2;
            this.l = z4;
            this.m = z4;
            fyaVarA = this.c;
            if (fyaVarA == null) {
                fyaVarA = a(0);
            }
            e(fyaVarA);
        }
        z3 = z10;
        defpackage.ads adsVar5 = this.o;
        java.lang.Object[] objArr3 = adsVar5.b;
        long[] jArr3 = adsVar5.c;
        int i3 = adsVar5.e;
        while (i3 != Integer.MAX_VALUE) {
            long j6 = (jArr3[i3] >> c4) & j;
            defpackage.fyd fydVar3 = (defpackage.fyd) objArr3[i3];
            if (z9) {
                fydVar3.a();
            }
            if (z3) {
                fydVar3.c(z4);
            }
            i3 = (int) j6;
        }
        this.j = z;
        this.k = z;
        this.h = z2;
        this.i = z2;
        this.l = z4;
        this.m = z4;
        fyaVarA = this.c;
        if (fyaVarA == null) {
            fyaVarA = a(0);
        }
        e(fyaVarA);
    }

    public final void d(defpackage.fyd fydVar) {
        defpackage.aooh.f(fydVar, "input");
        this.q.g(fydVar);
        this.p.g(fydVar);
        this.o.g(fydVar);
        fydVar.c = null;
        fydVar.d = false;
        fydVar.d();
    }

    public final void e(defpackage.fya fyaVar) {
        defpackage.fyb fybVar;
        defpackage.fya fyaVarA = this.c;
        if (fyaVarA == null) {
            fyaVarA = a(0);
        }
        if (defpackage.aooh.n(fyaVarA, fyaVar)) {
            if (fyaVarA == null) {
                fybVar = new defpackage.fyb(null);
            } else {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (defpackage.fya fyaVar2 : this.a) {
                    if (fyaVar2.h() && !fyaVar2.c.isEmpty()) {
                        arrayList.addAll(fyaVar2.c);
                    }
                }
                for (defpackage.fya fyaVar3 : this.b) {
                    if (fyaVar3.h() && !fyaVar3.c.isEmpty()) {
                        arrayList.addAll(fyaVar3.c);
                    }
                }
                defpackage.dzl dzlVar = fyaVarA.f;
                java.util.List list = fyaVarA.d;
                if (dzlVar == null) {
                    defpackage.aooh.i("currentInfo");
                }
                if (list == null) {
                    defpackage.aooh.i("forwardInfo");
                }
                fybVar = new defpackage.fyb(dzlVar, arrayList, list, arrayList.size());
            }
            defpackage.aozj aozjVar = this.n;
            if (defpackage.aooh.n((defpackage.fyb) aozjVar.c(), fybVar)) {
                return;
            }
            aozjVar.e(fybVar);
            defpackage.ads adsVar = this.q;
            java.lang.Object[] objArr = adsVar.b;
            long[] jArr = adsVar.c;
            int i = adsVar.e;
            while (i != Integer.MAX_VALUE) {
                long j = (jArr[i] >> 31) & 2147483647L;
                i = (int) j;
            }
            defpackage.ads adsVar2 = this.p;
            java.lang.Object[] objArr2 = adsVar2.b;
            long[] jArr2 = adsVar2.c;
            int i2 = adsVar2.e;
            while (i2 != Integer.MAX_VALUE) {
                long j2 = (jArr2[i2] >> 31) & 2147483647L;
                i2 = (int) j2;
            }
            defpackage.ads adsVar3 = this.o;
            java.lang.Object[] objArr3 = adsVar3.b;
            long[] jArr3 = adsVar3.c;
            int i3 = adsVar3.e;
            while (i3 != Integer.MAX_VALUE) {
                long j3 = (jArr3[i3] >> 31) & 2147483647L;
                i3 = (int) j3;
            }
        }
    }
}
