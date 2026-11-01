package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class afgn implements defpackage.ajat {
    public final java.util.List a;
    public final java.util.concurrent.Executor b;

    public afgn(java.util.List list, java.util.concurrent.Executor executor) {
        this.a = list;
        this.b = executor;
    }

    @Override // defpackage.ajat
    public final /* synthetic */ defpackage.ajcq a(java.lang.Object obj) {
        java.util.List list = this.a;
        int i = ((defpackage.aike) list).d;
        defpackage.apnt apntVar = (defpackage.apnt) obj;
        java.util.ArrayList arrayList = new java.util.ArrayList(i);
        defpackage.ailk ailkVarListIterator = ((defpackage.aify) list).listIterator(0);
        while (ailkVarListIterator.hasNext()) {
            arrayList.add(((defpackage.afgl) ailkVarListIterator.next()).c());
        }
        defpackage.ajat ajatVarC = defpackage.ahqx.c(new lgl(this, arrayList, i, 6));
        defpackage.afhf afhfVar = (defpackage.afhf) apntVar.a;
        defpackage.ahny ahnyVar = afhfVar.e;
        defpackage.ajbm ajbmVar = defpackage.ajbm.INSTANCE;
        ahnyVar.a();
        defpackage.ajcq ajcqVarG = defpackage.ajan.g(defpackage.aiql.A(afhfVar.c.a()), defpackage.ahqx.c(new aczq(apntVar, ajatVarC, ajbmVar, 16, (short[]) null)), ajbmVar);
        defpackage.ajam ajamVar = new defpackage.ajam(ajcqVarG, new defpackage.ahye(null));
        ajcqVarG.c(ajamVar, defpackage.aiql.t(ajbmVar, ajamVar));
        return defpackage.ajan.g(ajamVar, defpackage.ahqx.c(new lgl(this, i, arrayList, 7)), ajbmVar);
    }
}
