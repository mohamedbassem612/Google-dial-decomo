package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class apt extends ark {
    public defpackage.apy a;
    public ars b;
    public ars c;
    public amn d;
    private dpf j;

    public apt(defpackage.apy apyVar, aso asoVar, boolean z, kaw kawVar, ars arsVar) {
        super(defpackage.app.a, z, kawVar, asoVar);
        this.a = apyVar;
        this.d = null;
        this.b = arsVar;
    }

    public final void cM() {
        n();
        if (((cmv) this).D) {
            dpf dpfVar = cfo.A(this).r;
            dpf dpfVar2 = this.j;
            if (dpfVar2 == null || !aooh.n(dpfVar2, dpfVar)) {
                this.j = dpfVar;
                g(this.b);
            }
        }
    }

    public final java.lang.Object cR(aonn aonnVar, aoln aolnVar) {
        java.lang.Object objF = this.a.f(defpackage.aoc.a, new defpackage.apq(aonnVar, this, null), aolnVar);
        return objF != aolu.a ? aojh.a : objF;
    }

    public final void cS(defpackage.aqw aqwVar) {
        if (((cmv) this).D) {
            aoov.an(M(), (aolr) null, 0, new defpackage.amg(this, aqwVar, (aoln) null, 10), 3);
        }
    }

    public final void dc() {
        g(this.b);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object e(float f, aoln aolnVar) {
        defpackage.apr aprVar;
        aooq aooqVar;
        if (aolnVar instanceof defpackage.apr) {
            aprVar = (defpackage.apr) aolnVar;
            int i = aprVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                aprVar.c = i - Integer.MIN_VALUE;
            } else {
                aprVar = new defpackage.apr(this, aolnVar);
            }
        } else {
            aprVar = new defpackage.apr(this, aolnVar);
        }
        java.lang.Object obj = aprVar.a;
        aolu aoluVar = aolu.a;
        int i2 = aprVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            aooq aooqVar2 = new aooq();
            aooqVar2.a = f;
            defpackage.apy apyVar = this.a;
            defpackage.aps apsVar = new defpackage.aps(this, aooqVar2, f, null);
            aprVar.d = aooqVar2;
            aprVar.c = 2;
            if (apyVar.f(defpackage.aoc.a, apsVar, aprVar) == aoluVar) {
                return aoluVar;
            }
            aooqVar = aooqVar2;
        } else {
            if (i2 == 1) {
                aooc.af(obj);
                return obj;
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooqVar = aprVar.d;
            aooc.af(obj);
        }
        return new java.lang.Float(aooqVar.a);
    }

    public final void g(ars arsVar) {
        if (arsVar == null) {
            aiq aiqVar = defpackage.api.a;
            aiq aiqVar2 = defpackage.api.a;
            aonj aonjVar = defpackage.api.b;
            dpf dpfVar = cfo.A(this).r;
            this.j = dpfVar;
            defpackage.apy apyVar = this.a;
            arsVar = new defpackage.auu(new defpackage.apl(apyVar, aonjVar, new defpackage.mq(dpfVar, 18)), defpackage.app.c, aiqVar2);
        }
        this.c = arsVar;
    }

    public final boolean i() {
        return this.a.o();
    }

    public final boolean j() {
        return cfo.A(this).s == dpq.b && ((ark) this).e == aso.b;
    }

    public final void h(long j) {
    }
}
