package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class kjt implements java.util.function.Consumer {
    public final /* synthetic */ defpackage.kjw a;
    public final /* synthetic */ defpackage.aenj b;
    public final /* synthetic */ defpackage.aenj c;
    public final /* synthetic */ defpackage.ajcq d;

    public /* synthetic */ kjt(defpackage.kjw kjwVar, defpackage.aenj aenjVar, defpackage.aenj aenjVar2, defpackage.ajcq ajcqVar) {
        this.a = kjwVar;
        this.b = aenjVar;
        this.c = aenjVar2;
        this.d = ajcqVar;
    }

    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object obj) {
        defpackage.aenj aenjVarA = defpackage.aenj.a(this.b, this.c);
        defpackage.zay zayVar = new defpackage.zay(this.a, (defpackage.aeun) obj, aenjVarA, 1);
        defpackage.ajbm ajbmVar = defpackage.ajbm.INSTANCE;
        long j = defpackage.ahqx.a;
        defpackage.sqh sqhVar = new defpackage.sqh(defpackage.ahns.c(false), zayVar, 2);
        defpackage.ajcq ajcqVar = this.d;
        ajcqVar.c(new defpackage.ajcc(ajcqVar, sqhVar), ajbmVar);
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        return j$.util.function.Consumer.-CC.$default$andThen(this, consumer);
    }
}
