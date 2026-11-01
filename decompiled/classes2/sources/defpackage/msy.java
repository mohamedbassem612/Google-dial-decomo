package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class msy implements defpackage.lmv {
    public static final aimz a = aimz.i("com/android/dialer/dobby/impl/callscreeningservice/DobbyIncomingCallScreeningEndedListener");
    public static final java.lang.String[] b = {"contact_id", "display_name", "photo_id", "photo_thumb_uri", "lookup"};
    public final mtd c;
    public final nri d;
    public final defpackage.nrj e;
    public final defpackage.mys f;
    public final rlv g;
    public final android.content.Context h;
    public final ojo i;
    public final aolr j;
    public final aoin k;
    public final gpd l;
    public final rdp m;
    private final aoss n;
    private final nnx o;
    private final noe p;

    public msy(aoss aossVar, mtd mtdVar, nri nriVar, defpackage.nrj nrjVar, defpackage.mys mysVar, rdp rdpVar, nnx nnxVar, noe noeVar, rlv rlvVar, android.content.Context context, ojo ojoVar, aolr aolrVar, gpd gpdVar, aoin aoinVar) {
        aooh.f(aossVar, "lightweightScope");
        aooh.f(mtdVar, "latestVoteStorage");
        aooh.f(nriVar, "dobbyDatabase");
        aooh.f(rlvVar, "loggingBindings");
        aooh.f(context, "appContext");
        aooh.f(ojoVar, "dialerContentResolver");
        aooh.f(aolrVar, "backgroundContext");
        aooh.f(gpdVar, "cuiSemanticLoggerFactory");
        aooh.f(aoinVar, "useCoroutinesLaunch");
        this.n = aossVar;
        this.c = mtdVar;
        this.d = nriVar;
        this.e = nrjVar;
        this.f = mysVar;
        this.m = rdpVar;
        this.o = nnxVar;
        this.p = noeVar;
        this.g = rlvVar;
        this.h = context;
        this.i = ojoVar;
        this.j = aolrVar;
        this.l = gpdVar;
        this.k = aoinVar;
    }

    @Override // defpackage.lmv
    public final ajcq a(defpackage.lmq lmqVar, defpackage.lnl lnlVar) {
        aooh.f(lnlVar, "result");
        return aosv.F(this.n, 0, new defpackage.msx(lnlVar, lmqVar, this, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(aoln aolnVar) {
        defpackage.msv msvVar;
        uzx uzxVarB;
        java.lang.Object objB;
        uzx uzxVar;
        uzx uzxVar2;
        uzx uzxVar3;
        if (aolnVar instanceof defpackage.msv) {
            msvVar = (defpackage.msv) aolnVar;
            int i = msvVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                msvVar.c = i - Integer.MIN_VALUE;
            } else {
                msvVar = new defpackage.msv(this, aolnVar);
            }
        } else {
            msvVar = new defpackage.msv(this, aolnVar);
        }
        java.lang.Object obj = msvVar.a;
        aolu aoluVar = aolu.a;
        int i2 = msvVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                uzx uzxVar4 = msvVar.e;
                uzxVar = msvVar.d;
                aooc.af(obj);
                objB = obj;
                uzxVarB = uzxVar4;
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                uzxVar2 = msvVar.e;
                uzxVar3 = msvVar.d;
                aooc.af(obj);
            }
            uzxVar2.aJ(((java.lang.Boolean) obj).booleanValue());
            return uzxVar3.aH();
        }
        aooc.af(obj);
        uzxVarB = defpackage.airh.B(defpackage.aivr.b.m());
        nnx nnxVar = this.o;
        msvVar.d = uzxVarB;
        msvVar.e = uzxVarB;
        msvVar.c = 1;
        objB = nnxVar.b(msvVar);
        if (objB == aoluVar) {
            return aoluVar;
        }
        uzxVar = uzxVarB;
        nok nokVar = (nok) objB;
        defpackage.noi noiVarB = defpackage.noi.b(nokVar.d);
        if (noiVarB == null) {
            noiVarB = defpackage.noi.UNRECOGNIZED;
        }
        uzxVarB.aI(mni.p(noiVarB));
        defpackage.noh nohVarB = defpackage.noh.b(nokVar.c);
        if (nohVarB == null) {
            nohVarB = defpackage.noh.UNRECOGNIZED;
        }
        uzxVarB.aK(mni.u(nohVarB));
        noe noeVar = this.p;
        msvVar.d = uzxVar;
        msvVar.e = uzxVarB;
        msvVar.c = 2;
        java.lang.Object objC = noeVar.c(msvVar);
        if (objC == aoluVar) {
            return aoluVar;
        }
        uzx uzxVar5 = uzxVarB;
        obj = objC;
        uzxVar2 = uzxVar5;
        uzxVar3 = uzxVar;
        uzxVar2.aJ(((java.lang.Boolean) obj).booleanValue());
        return uzxVar3.aH();
    }
}
