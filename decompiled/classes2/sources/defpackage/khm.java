package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class khm {
    final /* synthetic */ aogc a;
    private final int b;
    private final boolean c;
    private final defpackage.hkd d;
    private final java.lang.String e;
    private final java.lang.String f;

    public khm(aogc aogcVar, int i, boolean z, defpackage.hkd hkdVar, java.lang.String str, java.lang.String str2) {
        this.a = aogcVar;
        this.b = i;
        this.c = z;
        this.d = hkdVar;
        this.e = str;
        this.f = str2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(defpackage.khm khmVar, aoln aolnVar) {
        defpackage.khj khjVar;
        if (aolnVar instanceof defpackage.khj) {
            khjVar = (defpackage.khj) aolnVar;
            int i = khjVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                khjVar.c = i - Integer.MIN_VALUE;
            } else {
                khjVar = new defpackage.khj(this, aolnVar);
            }
        } else {
            khjVar = new defpackage.khj(this, aolnVar);
        }
        java.lang.Object objB = khjVar.a;
        aolu aoluVar = aolu.a;
        int i2 = khjVar.c;
        boolean z = true;
        if (i2 == 0) {
            aooc.af(objB);
            if (this.b == khmVar.b) {
                khjVar.d = khmVar;
                khjVar.c = 1;
                objB = (this.c || khmVar.c) ? java.lang.Boolean.FALSE : b(khmVar, khjVar);
                if (objB != aoluVar) {
                }
                return aoluVar;
            }
            z = false;
            return java.lang.Boolean.valueOf(z);
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objB);
            return objB;
        }
        khmVar = khjVar.d;
        aooc.af(objB);
        if (!((java.lang.Boolean) objB).booleanValue()) {
            khjVar.d = null;
            khjVar.c = 2;
            java.lang.Object objC = c(khmVar, khjVar);
            if (objC != aoluVar) {
                return objC;
            }
            return aoluVar;
        }
        return java.lang.Boolean.valueOf(z);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(defpackage.khm khmVar, aoln aolnVar) {
        defpackage.khk khkVar;
        if (aolnVar instanceof defpackage.khk) {
            khkVar = (defpackage.khk) aolnVar;
            int i = khkVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                khkVar.c = i - Integer.MIN_VALUE;
            } else {
                khkVar = new defpackage.khk(this, aolnVar);
            }
        } else {
            khkVar = new defpackage.khk(this, aolnVar);
        }
        java.lang.Object objD = khkVar.a;
        aolu aoluVar = aolu.a;
        int i2 = khkVar.c;
        if (i2 == 0) {
            aooc.af(objD);
            aogc aogcVar = this.a;
            ajcq ajcqVarT = ((ahbv) aogcVar.b).t(this.d, khmVar.d);
            khkVar.c = 1;
            objD = aosv.D(ajcqVarT, khkVar);
            if (objD == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objD);
        }
        aooh.e(objD, "await(...)");
        return objD;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x007b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(defpackage.khm khmVar, aoln aolnVar) {
        defpackage.khl khlVar;
        java.lang.String str;
        java.lang.String str2;
        if (aolnVar instanceof defpackage.khl) {
            khlVar = (defpackage.khl) aolnVar;
            int i = khlVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                khlVar.c = i - Integer.MIN_VALUE;
            } else {
                khlVar = new defpackage.khl(this, aolnVar);
            }
        } else {
            khlVar = new defpackage.khl(this, aolnVar);
        }
        java.lang.Object objB = khlVar.a;
        aolu aoluVar = aolu.a;
        int i2 = khlVar.c;
        boolean z = true;
        if (i2 == 0) {
            aooc.af(objB);
            if (this.c && khmVar.c && (str = this.f) != null && str.length() != 0 && aooh.n(str, khmVar.f)) {
                khlVar.d = khmVar;
                khlVar.c = 1;
                objB = b(khmVar, khlVar);
                if (objB == aoluVar) {
                    return aoluVar;
                }
            } else {
                z = false;
            }
            return java.lang.Boolean.valueOf(z);
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        khmVar = khlVar.d;
        aooc.af(objB);
        if (!((java.lang.Boolean) objB).booleanValue() && (!this.c || !khmVar.c || (str2 = this.e) == null || str2.length() <= 0 || !aooh.n(str2, khmVar.e))) {
            z = false;
        }
        return java.lang.Boolean.valueOf(z);
    }
}
