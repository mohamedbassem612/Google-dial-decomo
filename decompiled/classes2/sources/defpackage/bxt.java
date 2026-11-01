package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class bxt extends aomg implements aonn {
    java.lang.Object a;
    java.lang.Object b;
    long c;
    int d;
    int e;
    final /* synthetic */ aoss f;
    final /* synthetic */ defpackage.bwj g;
    private /* synthetic */ java.lang.Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bxt(aoss aossVar, defpackage.bwj bwjVar, aoln aolnVar) {
        super(aolnVar);
        this.f = aossVar;
        this.g = bwjVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((cwc) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:32:0x00bc A[Catch: all -> 0x00c9, TRY_LEAVE, TryCatch #3 {all -> 0x00c9, blocks: (B:7:0x0014, B:30:0x00b8, B:32:0x00bc), top: B:44:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:50:? A[RETURN, SYNTHETIC] */
    public final java.lang.Object b(java.lang.Object obj) throws java.lang.Throwable {
        java.lang.Object objA;
        long jD;
        defpackage.cvg cvgVar;
        java.lang.Object objD;
        java.lang.Object obj2;
        java.lang.Object obj3;
        int i;
        java.lang.Object obj4;
        java.lang.Throwable th;
        java.lang.Object obj5;
        java.lang.Object objC;
        defpackage.cvm cvmVar;
        cwc cwcVar = (cwc) this.h;
        aolu aoluVar = aolu.a;
        int i2 = this.e;
        if (i2 == 0) {
            aooc.af(obj);
            objA = aozk.a(java.lang.Boolean.FALSE);
            jD = cwcVar.q().d();
            cvgVar = defpackage.cvg.a;
            this.h = cwcVar;
            this.a = objA;
            this.b = cvgVar;
            this.c = jD;
            this.e = 1;
            objD = defpackage.atv.d(cwcVar, cvgVar, this, 1);
            if (objD == aoluVar) {
                obj2 = cvgVar;
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    obj5 = this.a;
                    try {
                        aooc.af(obj);
                        cvmVar = (defpackage.cvm) obj;
                        if (cvmVar != null) {
                            cvmVar.b();
                        }
                        ((aozj) obj5).e(java.lang.Boolean.FALSE);
                        return aojh.a;
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        ((aozj) obj5).e(java.lang.Boolean.FALSE);
                        throw th;
                    }
                }
                i = this.d;
                jD = this.c;
                java.lang.Object obj6 = this.b;
                obj4 = this.a;
                try {
                    aooc.af(obj);
                    ((aozj) obj4).e(java.lang.Boolean.FALSE);
                } catch (cvh unused) {
                    objA = obj4;
                    obj3 = obj6;
                    aoov.an(this.f, (aolr) null, 4, new defpackage.htb((aozj) objA, this.g, (aoln) null, 1), 1);
                    this.h = null;
                    this.a = objA;
                    this.b = null;
                    this.c = jD;
                    this.d = i;
                    this.e = 3;
                    objC = defpackage.atv.c(cwcVar, (defpackage.cvg) obj3, this);
                    if (objC != aoluVar) {
                        return aoluVar;
                    }
                    java.lang.Object obj7 = objA;
                    obj = objC;
                    obj5 = obj7;
                    cvmVar = (defpackage.cvm) obj;
                    if (cvmVar != null) {
                        cvmVar.b();
                    }
                    ((aozj) obj5).e(java.lang.Boolean.FALSE);
                } catch (java.lang.Throwable th3) {
                    th = th3;
                    obj5 = obj4;
                    ((aozj) obj5).e(java.lang.Boolean.FALSE);
                    throw th;
                }
                return aojh.a;
            }
            jD = this.c;
            java.lang.Object obj8 = this.b;
            java.lang.Object obj9 = this.a;
            aooc.af(obj);
            objD = obj;
            objA = obj9;
            obj2 = obj8;
        }
        obj2 = cvgVar;
        int i3 = ((defpackage.cvm) objD).i;
        if (a.x(i3, 1) || a.x(i3, 3)) {
            try {
                try {
                    defpackage.bxr bxrVar = new defpackage.bxr((defpackage.cvg) obj2, (aoln) null, 0);
                    this.h = cwcVar;
                    this.a = objA;
                    this.b = obj2;
                    this.c = jD;
                    this.d = i3;
                    this.e = 2;
                    if (cwcVar.s(jD, bxrVar, this) == aoluVar) {
                        return aoluVar;
                    }
                    obj4 = objA;
                    ((aozj) obj4).e(java.lang.Boolean.FALSE);
                } catch (cvh unused2) {
                    obj3 = obj2;
                    i = i3;
                    aoov.an(this.f, (aolr) null, 4, new defpackage.htb((aozj) objA, this.g, (aoln) null, 1), 1);
                    this.h = null;
                    this.a = objA;
                    this.b = null;
                    this.c = jD;
                    this.d = i;
                    this.e = 3;
                    objC = defpackage.atv.c(cwcVar, (defpackage.cvg) obj3, this);
                    if (objC != aoluVar) {
                        return aoluVar;
                    }
                    java.lang.Object obj10 = objA;
                    obj = objC;
                    obj5 = obj10;
                    cvmVar = (defpackage.cvm) obj;
                    if (cvmVar != null) {
                        cvmVar.b();
                    }
                    ((aozj) obj5).e(java.lang.Boolean.FALSE);
                    return aojh.a;
                }
            } catch (java.lang.Throwable th4) {
                java.lang.Object obj11 = objA;
                th = th4;
                obj5 = obj11;
                ((aozj) obj5).e(java.lang.Boolean.FALSE);
                throw th;
            }
        }
        return aojh.a;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        defpackage.bxt bxtVar = new defpackage.bxt(this.f, this.g, aolnVar);
        bxtVar.h = obj;
        return bxtVar;
    }
}
