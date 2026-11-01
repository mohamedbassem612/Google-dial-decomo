package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abgn extends aomh implements aonn {
    private final /* synthetic */ int $cid;
    float a;
    int b;
    final /* synthetic */ boolean c;
    final /* synthetic */ java.lang.Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abgn(defpackage.abgq abgqVar, boolean z, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.d = abgqVar;
        this.c = z;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final java.lang.Object d(boolean z, defpackage.abgq abgqVar, float f, int i, int i2, ajh ajhVar, aoln aolnVar) {
        defpackage.abgm abgmVar;
        if (aolnVar instanceof defpackage.abgm) {
            abgmVar = (defpackage.abgm) aolnVar;
            int i3 = abgmVar.b;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                abgmVar.b = i3 - Integer.MIN_VALUE;
            } else {
                abgmVar = new defpackage.abgm(aolnVar);
            }
        } else {
            abgmVar = new defpackage.abgm(aolnVar);
        }
        java.lang.Object obj = abgmVar.a;
        aolu aoluVar = aolu.a;
        int i4 = abgmVar.b;
        if (i4 == 0) {
            aooc.af(obj);
            aii aiiVar = z ? abgqVar.l : abgqVar.m;
            dpi dpiVar = new dpi(((-i) * f * abgqVar.c.a) + 0.0f);
            alm almVarBv = den.bv(i2, 0, ajhVar, 2);
            abgmVar.b = 1;
            if (aii.l(aiiVar, dpiVar, almVarBv, (java.lang.Object) null, (aonj) null, abgmVar, 12) == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i4 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(obj);
        }
        return aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final java.lang.Object e(defpackage.abgq abgqVar, float f, boolean z, int i, int i2, ajh ajhVar, aoln aolnVar) {
        defpackage.abgl abglVar;
        if (aolnVar instanceof defpackage.abgl) {
            abglVar = (defpackage.abgl) aolnVar;
            int i3 = abglVar.b;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                abglVar.b = i3 - Integer.MIN_VALUE;
            } else {
                abglVar = new defpackage.abgl(aolnVar);
            }
        } else {
            abglVar = new defpackage.abgl(aolnVar);
        }
        java.lang.Object obj = abglVar.a;
        aolu aoluVar = aolu.a;
        int i4 = abglVar.b;
        if (i4 == 0) {
            aooc.af(obj);
            aii aiiVar = abgqVar.k;
            java.lang.Float f2 = new java.lang.Float(i * f * abgqVar.c.b * (true != z ? -1.0f : 1.0f));
            alm almVarBv = den.bv(i2, 0, ajhVar, 2);
            abglVar.b = 1;
            if (aii.l(aiiVar, f2, almVarBv, (java.lang.Object) null, (aonj) null, abglVar, 12) == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i4 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(obj);
        }
        return aojh.a;
    }

    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.$cid;
        if (i == 0) {
            return c((aoss) obj, (aoln) obj2).b(aojh.a);
        }
        if (i != 1) {
            return c((aoss) obj, (aoln) obj2).b(aojh.a);
        }
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ea, code lost:
    
        if (e((defpackage.abgq) r0, r1, r2, 0, 350, r5, r16) != r15) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0158, code lost:
    
        if (d(r0, (defpackage.abgq) r1, r2, 0, 350, r5, r16) != r15) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abgn.b(java.lang.Object):java.lang.Object");
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        int i = this.$cid;
        if (i == 0) {
            return new defpackage.abgn(this.c, (defpackage.abgq) this.d, aolnVar, 0);
        }
        java.lang.Object obj2 = this.d;
        if (i != 1) {
            return new defpackage.abgn((aii) obj2, this.c, aolnVar, 2);
        }
        return new defpackage.abgn((defpackage.abgq) obj2, this.c, aolnVar, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abgn(aii aiiVar, boolean z, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.d = aiiVar;
        this.c = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abgn(boolean z, defpackage.abgq abgqVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.c = z;
        this.d = abgqVar;
    }
}
