package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public abstract class ymr implements defpackage.ymj {
    public static final java.lang.String a = "ymr";
    public final defpackage.ymd b;
    public final defpackage.ymk c;
    public final ajct d;
    public final java.util.concurrent.Executor e;
    public final java.lang.Object f = new java.lang.Object();
    public ajcq g;
    private final defpackage.yml h;
    private ajcq i;
    private ajcq j;

    protected ymr(defpackage.ymd ymdVar, defpackage.ymk ymkVar, defpackage.yml ymlVar) {
        this.b = ymdVar;
        this.c = ymkVar;
        this.h = ymlVar;
        this.d = ymdVar.g();
        this.e = ymdVar.h();
    }

    private final void h(ajcq ajcqVar, int i, defpackage.ync yncVar) {
        this.b.k(yncVar, ajcqVar, i, this.c.e);
    }

    @Override // defpackage.ymj
    public final ajcq a() {
        defpackage.ync yncVarA = defpackage.ync.a(this.b);
        ajcq ajcqVarG = ajan.g(d(), new defpackage.xcv(this, 18), this.d);
        h(ajcqVarG, 14, yncVarA);
        return ajcqVarG;
    }

    @Override // defpackage.ymj
    public final ajcq b(java.lang.Object obj) {
        defpackage.ync yncVarA = defpackage.ync.a(this.b);
        ajcq ajcqVarG = ajan.g(d(), new defpackage.wzg(this, obj, 5, null), this.d);
        h(ajcqVarG, 15, yncVarA);
        return ajcqVarG;
    }

    public abstract defpackage.ylj c(java.lang.Object obj, java.lang.Object obj2, defpackage.yng yngVar);

    protected final ajcq d() {
        synchronized (this.f) {
            ajcq ajcqVar = this.j;
            defpackage.ymd ymdVar = this.b;
            if (!j$.util.Objects.equals(ajcqVar, ymdVar.d()) || this.i == null) {
                this.i = ajck.w(ymdVar.d()).y(new defpackage.xcv(this, 19), this.d);
            }
        }
        return ajck.w(this.i).y(new defpackage.xcv(this, 17), this.d);
    }

    public final ajcq e() {
        ajcq ajcqVarY;
        ajcq ajcqVarY2;
        synchronized (this.f) {
            ajcq ajcqVar = this.j;
            defpackage.ymd ymdVar = this.b;
            if (!j$.util.Objects.equals(ajcqVar, ymdVar.d()) || (ajcqVarY2 = this.g) == null) {
                defpackage.yml ymlVar = this.h;
                if (ymdVar.i()) {
                    ajcqVarY = ajck.w(ymdVar.c(this.c)).y(new defpackage.wzg(this, ymlVar, 4), this.d);
                } else {
                    android.util.Log.i(a, "Auto-download is disabled, skipping download.");
                    ajcqVarY = ajcm.a;
                }
                ajck ajckVarW = ajck.w(ajcqVarY);
                defpackage.xcv xcvVar = new defpackage.xcv(this, 14);
                ajct ajctVar = this.d;
                ajcqVarY2 = ajckVarW.y(xcvVar, ajctVar).y(new defpackage.xcv(this, 15), ajctVar);
                this.g = ajcqVarY2;
                this.j = ymdVar.d();
                aiql.I(ajcqVarY2, new defpackage.uwo(this, 5), ajbm.a);
            }
        }
        return ajcqVarY2;
    }

    public abstract defpackage.ylj f(java.lang.Object obj, defpackage.ylr ylrVar);

    public abstract java.lang.Object g(defpackage.ylf ylfVar);
}
