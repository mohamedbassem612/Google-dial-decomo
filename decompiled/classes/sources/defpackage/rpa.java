package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class rpa {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/main/impl/service/MainActivityRetainedStateController");
    public final java.util.Set b;
    public final defpackage.oko c;
    public final defpackage.aoss d;
    public final defpackage.aolr e;
    public final defpackage.aolr f;
    public final defpackage.rns g;
    public boolean h;
    public defpackage.rom i;
    public defpackage.rol j;
    public defpackage.roc k;
    public final defpackage.zjm l;
    public final defpackage.ahda m;
    public defpackage.ttj n;
    public final defpackage.aogc o;
    private final defpackage.apni p;

    public rpa(java.util.Set set, defpackage.zjm zjmVar, defpackage.aazc aazcVar, defpackage.oko okoVar, defpackage.aogc aogcVar, defpackage.apni apniVar, defpackage.aoss aossVar, defpackage.aolr aolrVar, defpackage.aolr aolrVar2) {
        if (aazcVar == null) {
            defpackage.aooh.i("clock");
        }
        if (aogcVar == null) {
            defpackage.aooh.i("resultPropagator");
        }
        if (apniVar == null) {
            defpackage.aooh.i("androidJobs");
        }
        if (aolrVar == null) {
            defpackage.aooh.i("lightweightContext");
        }
        if (aolrVar2 == null) {
            defpackage.aooh.i("blockingContext");
        }
        this.b = set;
        this.l = zjmVar;
        this.c = okoVar;
        this.o = aogcVar;
        this.p = apniVar;
        this.d = aossVar;
        this.e = aolrVar;
        this.f = aolrVar2;
        this.g = new defpackage.rov(this);
        this.m = new defpackage.ahda((byte[]) null);
        this.i = new defpackage.rom(true, false);
        this.j = new defpackage.rol(true, true, false);
        this.n = defpackage.ron.a;
        this.k = defpackage.roc.CALL_LOG_TAB_KEY;
    }

    public final java.lang.Object a(defpackage.aoln aolnVar) {
        return defpackage.aoov.aj(this.e, new defpackage.ror(this, null), aolnVar);
    }

    public final java.lang.Object b(defpackage.aoln aolnVar) throws java.lang.Throwable {
        java.lang.Object objF = f(defpackage.ron.a, aolnVar);
        return objF != defpackage.aolu.a ? defpackage.aojh.a : objF;
    }

    public final java.lang.Object c(defpackage.aoln aolnVar) {
        return defpackage.aosv.m(new defpackage.emu(this, (defpackage.aoln) null, 3), aolnVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object d(defpackage.aoln aolnVar) {
        defpackage.row rowVar;
        if (aolnVar instanceof defpackage.row) {
            rowVar = (defpackage.row) aolnVar;
            int i = rowVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                rowVar.c = i - Integer.MIN_VALUE;
            } else {
                rowVar = new defpackage.row(this, aolnVar);
            }
        } else {
            rowVar = new defpackage.row(this, aolnVar);
        }
        java.lang.Object objAj = rowVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = rowVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(objAj);
            defpackage.aolr aolrVar = this.e;
            defpackage.eee eeeVar = new defpackage.eee(this, (defpackage.aoln) null, 9, (char[]) null);
            rowVar.d = this;
            rowVar.c = 1;
            objAj = defpackage.aoov.aj(aolrVar, eeeVar, rowVar);
            if (objAj == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this = rowVar.d;
            defpackage.aooc.af(objAj);
        }
        this.e((defpackage.aoub) objAj);
        return defpackage.aojh.a;
    }

    public final void e(defpackage.aoub aoubVar) {
        this.p.i(aoubVar);
    }

    public final java.lang.Object f(defpackage.ttj ttjVar, defpackage.aoln aolnVar) throws java.lang.Throwable {
        java.lang.Object objM = defpackage.aosv.m(new lnb(this, ttjVar, (defpackage.aoln) null, 9), aolnVar);
        return objM != defpackage.aolu.a ? defpackage.aojh.a : objM;
    }
}
