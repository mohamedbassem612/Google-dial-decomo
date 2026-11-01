package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class acgz implements defpackage.acgr {
    public java.util.Map a;
    public boolean b;
    public defpackage.ajcq c;
    private final defpackage.acgr d;

    public acgz(defpackage.acgr acgrVar) {
        this.d = acgrVar;
    }

    private final synchronized defpackage.ajcq g() {
        defpackage.ajcq ajcqVarC;
        java.util.Map map = this.a;
        if (map != null) {
            ajcqVarC = new defpackage.ajcm(map);
        } else {
            ajcqVarC = this.c;
            if (ajcqVarC == null) {
                this.b = false;
                ajcqVarC = this.d.c();
                this.c = ajcqVarC;
                defpackage.acgy acgyVar = new defpackage.acgy(this, 0);
                ajcqVarC.c(new defpackage.ajcc(ajcqVarC, acgyVar), defpackage.ajbm.INSTANCE);
            }
        }
        return ajcqVarC;
    }

    private final synchronized void h() {
        this.a = null;
        this.b = true;
    }

    @Override // defpackage.acgr
    public final defpackage.ajcq a() {
        h();
        return this.d.a();
    }

    @Override // defpackage.acgr
    public final defpackage.ajcq b(java.util.Map map) {
        h();
        return this.d.b(map);
    }

    @Override // defpackage.acgr
    public final defpackage.ajcq c() {
        defpackage.ajcq ajcqVarG = g();
        defpackage.kvf kvfVar = new defpackage.kvf(18);
        defpackage.ajbm ajbmVar = defpackage.ajbm.INSTANCE;
        int i = defpackage.ajan.c;
        defpackage.ajam ajamVar = new defpackage.ajam(ajcqVarG, kvfVar);
        ajcqVarG.c(ajamVar, defpackage.aiql.t(ajbmVar, ajamVar));
        return ajamVar;
    }

    @Override // defpackage.acgr
    public final defpackage.ajcq d(java.lang.String str, defpackage.albh albhVar) {
        h();
        return this.d.d(str, albhVar);
    }

    @Override // defpackage.acgr
    public final defpackage.ajcq e(java.lang.String str) {
        h();
        return this.d.e(str);
    }

    @Override // defpackage.acgr
    public final defpackage.ajcq f(java.util.List list) {
        h();
        return this.d.f(list);
    }
}
