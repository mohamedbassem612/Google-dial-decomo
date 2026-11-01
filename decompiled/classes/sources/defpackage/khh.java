package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class khh implements defpackage.lzj {
    public final defpackage.gpd a;
    public final defpackage.tkl b;
    private final defpackage.aolr c;
    private final defpackage.lzk d;

    public khh(defpackage.tkl tklVar, defpackage.gpd gpdVar, defpackage.aolr aolrVar) {
        if (gpdVar == null) {
            defpackage.aooh.i("haloCallLogReader");
        }
        if (aolrVar == null) {
            defpackage.aooh.i("lightweightContext");
        }
        this.b = tklVar;
        this.a = gpdVar;
        this.c = aolrVar;
        this.d = defpackage.lzk.HALO;
    }

    @Override // defpackage.kes
    public final /* synthetic */ java.lang.Object a() {
        return this.d;
    }

    @Override // defpackage.kes
    public final java.lang.Object b(java.util.List list, defpackage.aoln aolnVar) {
        return defpackage.aoov.aj(this.c, new khg(this, list, (defpackage.aoln) null, 0), aolnVar);
    }

    @Override // defpackage.kes
    public final defpackage.ker d() {
        defpackage.kgu kguVar = defpackage.kgu.a;
        defpackage.albn albnVarM = defpackage.alad.M(defpackage.kgu.class);
        defpackage.aooh.e(albnVarM, "parser(...)");
        return new defpackage.ker(albnVarM);
    }
}
