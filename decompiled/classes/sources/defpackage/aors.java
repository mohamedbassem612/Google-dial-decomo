package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class aors extends defpackage.aoul implements defpackage.aoub, defpackage.aoln, defpackage.aoss {
    public final defpackage.aolr a;

    public aors(defpackage.aolr aolrVar, boolean z) {
        super(z);
        K((defpackage.aoub) aolrVar.get(defpackage.aoub.d));
        this.a = aolrVar.plus(this);
    }

    @Override // defpackage.aoss
    public final defpackage.aolr c() {
        return this.a;
    }

    protected void fE(java.lang.Object obj) {
        fx(obj);
    }

    @Override // defpackage.aoul
    public final void fF(java.lang.Throwable th) {
        defpackage.aosv.t(this.a, th);
    }

    @Override // defpackage.aoul
    protected final void fG(java.lang.Object obj) {
        if (!(obj instanceof defpackage.aosk)) {
            l(obj);
        } else {
            defpackage.aosk aoskVar = (defpackage.aosk) obj;
            k(aoskVar.b, aoskVar.c.a());
        }
    }

    @Override // defpackage.aoul
    protected final java.lang.String g() {
        return java.lang.String.valueOf(getClass().getSimpleName()).concat(" was cancelled");
    }

    @Override // defpackage.aoul
    public java.lang.String h() {
        java.lang.String str = null;
        if (defpackage.aosu.a) {
            defpackage.aolr aolrVar = this.a;
            defpackage.aosq aosqVar = (defpackage.aosq) aolrVar.get(defpackage.aosq.b);
            if (aosqVar != null) {
                defpackage.aosr aosrVar = (defpackage.aosr) aolrVar.get(defpackage.aosr.b);
                str = (aosrVar != null ? aosrVar.a : "coroutine") + '#' + aosqVar.a;
            }
        }
        if (str == null) {
            return defpackage.aosv.a(this);
        }
        return "\"" + str + "\":" + defpackage.aosv.a(this);
    }

    @Override // defpackage.aoln
    public final defpackage.aolr u() {
        return this.a;
    }

    @Override // defpackage.aoln
    public final void w(java.lang.Object obj) throws java.lang.Throwable {
        java.lang.Object objF = F(defpackage.aosv.v(obj));
        if (objF != defpackage.aoum.d) {
            fE(objF);
        }
    }

    protected void l(java.lang.Object obj) {
    }

    protected void k(java.lang.Throwable th, boolean z) {
    }
}
