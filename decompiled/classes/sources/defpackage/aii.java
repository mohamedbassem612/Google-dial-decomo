package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aii {
    public final java.lang.String a;
    public final defpackage.air b;
    public final defpackage.aiw c;
    public final defpackage.aiw d;
    public defpackage.aiw e;
    public defpackage.aiw f;
    public final defpackage.nf g;
    private final java.lang.Object h;
    private final defpackage.ccp i;
    private final defpackage.ccp j;
    private final defpackage.aku k;
    private final defpackage.nf l;

    public aii(java.lang.Object obj, defpackage.nf nfVar, java.lang.Object obj2, java.lang.String str) {
        this.g = nfVar;
        this.h = obj2;
        this.a = str;
        this.b = new defpackage.air(nfVar, obj, null, Long.MIN_VALUE, Long.MIN_VALUE, false);
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        defpackage.cdu cduVar = defpackage.cdu.c;
        this.i = new androidx.compose.runtime.ParcelableSnapshotMutableState(bool, cduVar);
        this.j = new androidx.compose.runtime.ParcelableSnapshotMutableState(obj, cduVar);
        this.l = new defpackage.nf((byte[]) null);
        this.k = new defpackage.aku(1.0f, 1500.0f, obj2);
        defpackage.aiw aiwVarA = a();
        defpackage.aiw aiwVar = aiwVarA instanceof defpackage.ais ? defpackage.aij.e : aiwVarA instanceof defpackage.ait ? defpackage.aij.f : aiwVarA instanceof defpackage.aiu ? defpackage.aij.g : defpackage.aij.h;
        this.c = aiwVar;
        defpackage.aiw aiwVarA2 = a();
        defpackage.aiw aiwVar2 = aiwVarA2 instanceof defpackage.ais ? defpackage.aij.a : aiwVarA2 instanceof defpackage.ait ? defpackage.aij.b : aiwVarA2 instanceof defpackage.aiu ? defpackage.aij.c : defpackage.aij.d;
        this.d = aiwVar2;
        this.e = aiwVar;
        this.f = aiwVar2;
    }

    /* JADX WARN: Type inference failed for: r12v4, types: [aonj, java.lang.Object] */
    public static /* synthetic */ java.lang.Object l(defpackage.aii aiiVar, java.lang.Object obj, defpackage.aiq aiqVar, java.lang.Object obj2, defpackage.aonj aonjVar, defpackage.aoln aolnVar, int i) {
        if ((i & 2) != 0) {
            aiqVar = aiiVar.k;
        }
        defpackage.aiq aiqVar2 = aiqVar;
        if ((i & 4) != 0) {
            obj2 = aiiVar.e();
        }
        if ((i & 8) != 0) {
            aonjVar = null;
        }
        java.lang.Object objD = aiiVar.d();
        defpackage.nf nfVar = aiiVar.g;
        ala alaVar = new ala(aiqVar2, nfVar, objD, obj, (defpackage.aiw) nfVar.a.a(obj2));
        long j = aiiVar.b.b;
        return aiiVar.l.g(akd.a, new aif(aiiVar, obj2, alaVar, j, aonjVar, (defpackage.aoln) null), aolnVar);
    }

    public final defpackage.aiw a() {
        return this.b.a;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [aonj, java.lang.Object] */
    public final java.lang.Object b(java.lang.Object obj) {
        if (defpackage.aooh.n(this.e, this.c) && defpackage.aooh.n(this.f, this.d)) {
            return obj;
        }
        defpackage.nf nfVar = this.g;
        defpackage.aiw aiwVar = (defpackage.aiw) nfVar.a.a(obj);
        int iB = aiwVar.b();
        boolean z = false;
        for (int i = 0; i < iB; i++) {
            if (aiwVar.a(i) < this.e.a(i) || aiwVar.a(i) > this.f.a(i)) {
                aiwVar.e(i, defpackage.aooc.s(aiwVar.a(i), this.e.a(i), this.f.a(i)));
                z = true;
            }
        }
        return z ? nfVar.b.a(aiwVar) : obj;
    }

    public final java.lang.Object c() {
        return this.j.a();
    }

    public final java.lang.Object d() {
        return this.b.a();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [aonj, java.lang.Object] */
    public final java.lang.Object e() {
        return this.g.b.a(a());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object f(java.lang.Object obj, defpackage.aoln aolnVar) {
        aig aigVar;
        if (aolnVar instanceof aig) {
            aigVar = (aig) aolnVar;
            int i = aigVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                aigVar.d = i - Integer.MIN_VALUE;
            } else {
                aigVar = new aig(this, aolnVar);
            }
        } else {
            aigVar = new aig(this, aolnVar);
        }
        java.lang.Object obj2 = aigVar.b;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = aigVar.d;
        if (i2 == 0) {
            defpackage.aooc.af(obj2);
            defpackage.nf nfVar = this.l;
            bqp bqpVar = new bqp(this, obj, (defpackage.aoln) null, 1);
            aigVar.a = null;
            aigVar.d = 1;
            if (nfVar.g(akd.a, bqpVar, aigVar) == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            java.lang.Object obj3 = aigVar.a;
            defpackage.aooc.af(obj2);
        }
        return defpackage.aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object g(defpackage.aoln aolnVar) {
        aih aihVar;
        if (aolnVar instanceof aih) {
            aihVar = (aih) aolnVar;
            int i = aihVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                aihVar.c = i - Integer.MIN_VALUE;
            } else {
                aihVar = new aih(this, aolnVar);
            }
        } else {
            aihVar = new aih(this, aolnVar);
        }
        java.lang.Object obj = aihVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = aihVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            defpackage.nf nfVar = this.l;
            jgn jgnVar = new jgn(this, (defpackage.aoln) null, 1);
            aihVar.c = 1;
            if (nfVar.g(akd.a, jgnVar, aihVar) == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(obj);
        }
        return defpackage.aojh.a;
    }

    public final void h() {
        defpackage.air airVar = this.b;
        airVar.a.d();
        airVar.b = Long.MIN_VALUE;
        i(false);
    }

    public final void i(boolean z) {
        this.i.b(java.lang.Boolean.valueOf(z));
    }

    public final void j(java.lang.Object obj) {
        this.j.b(obj);
    }

    public final boolean k() {
        return ((java.lang.Boolean) this.i.a()).booleanValue();
    }
}
