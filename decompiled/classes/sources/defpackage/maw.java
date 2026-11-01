package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class maw {
    public final java.lang.Object a;
    public final java.lang.Object b;
    public final java.lang.Object c;
    public java.lang.Object d;
    public final java.lang.Object e;
    public final java.lang.Object f;

    public maw(defpackage.gfg gfgVar, defpackage.aonj aonjVar, defpackage.aonn aonnVar) {
        this.e = gfgVar;
        this.b = new gft();
        this.a = gfgVar.d;
        java.util.List listBU = defpackage.ajsz.bU(gfgVar.d, new gfu(new fxs(this, 6)));
        android.content.Context context = gfgVar.a;
        java.lang.String str = gfgVar.b;
        defpackage.gis gisVar = gfgVar.c;
        defpackage.ipc ipcVar = gfgVar.r;
        boolean z = gfgVar.e;
        int i = gfgVar.q;
        java.util.concurrent.Executor executor = gfgVar.f;
        java.util.concurrent.Executor executor2 = gfgVar.g;
        boolean z2 = gfgVar.h;
        boolean z3 = gfgVar.i;
        java.util.Set set = gfgVar.j;
        java.util.List list = gfgVar.k;
        java.util.List list2 = gfgVar.l;
        boolean z4 = gfgVar.m;
        defpackage.aolr aolrVar = gfgVar.n;
        defpackage.aooh.f(context, "context");
        defpackage.gfg gfgVar2 = new defpackage.gfg(context, str, gisVar, ipcVar, listBU, z, i, executor, executor2, z2, z3, set, list, list2, z4, aolrVar);
        gfgVar2.o = gfgVar.o;
        gfgVar2.p = gfgVar.p;
        defpackage.git gitVar = (defpackage.git) aonjVar.a(gfgVar2);
        this.c = gitVar;
        defpackage.kaw kawVar = new defpackage.kaw(gitVar);
        java.lang.String str2 = gfgVar.b;
        this.f = new defpackage.ghd(kawVar, str2 == null ? ":memory:" : str2, aonnVar);
        b();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [git, java.lang.Object] */
    private final void b() {
        ?? r0 = this.c;
        if (r0 != 0) {
            r0.d(((defpackage.gfg) this.e).q == 3);
        }
    }

    public final void a(defpackage.gjh gjhVar) {
        defpackage.dzk.M(gjhVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        defpackage.dzk.M(gjhVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + ((defpackage.gga) this.b).b + "')");
    }

    public maw(defpackage.gfg gfgVar, defpackage.gga ggaVar, defpackage.aonn aonnVar) {
        this.e = gfgVar;
        this.b = ggaVar;
        this.a = gfgVar.d;
        defpackage.gir girVarK = defpackage.dzk.K(gfgVar.a);
        girVarK.a = gfgVar.b;
        girVarK.b = new defpackage.giq(this, ggaVar.a);
        defpackage.git gitVarA = gfgVar.c.a(girVarK.a());
        this.c = gitVarA;
        defpackage.kaw kawVar = new defpackage.kaw(gitVarA);
        java.lang.String str = gfgVar.b;
        this.f = new defpackage.ghd(kawVar, str == null ? ":memory:" : str, aonnVar);
        b();
    }

    public maw(defpackage.aoss aossVar, defpackage.apni apniVar, defpackage.aazc aazcVar, defpackage.aoin aoinVar) {
        if (aossVar == null) {
            defpackage.aooh.i("lightweightScope");
        }
        if (apniVar == null) {
            defpackage.aooh.i("androidJobs");
        }
        if (aazcVar == null) {
            defpackage.aooh.i("clock");
        }
        if (aoinVar == null) {
            defpackage.aooh.i("enableReverseLookupHappinessSurvey");
        }
        this.a = aossVar;
        this.b = apniVar;
        this.e = aazcVar;
        this.c = aoinVar;
        this.f = new defpackage.ahda((byte[]) null);
    }
}
