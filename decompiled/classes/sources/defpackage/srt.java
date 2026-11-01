package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class srt implements java.util.function.Function {
    public final /* synthetic */ defpackage.srv a;
    public final /* synthetic */ defpackage.aigf b;

    public /* synthetic */ srt(defpackage.srv srvVar, defpackage.aigf aigfVar) {
        this.a = srvVar;
        this.b = aigfVar;
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function andThen(java.util.function.Function function) {
        return j$.util.function.Function.-CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final java.lang.Object apply(java.lang.Object obj) {
        defpackage.srv srvVar = this.a;
        defpackage.ajcq ajcqVarY = srvVar.b.Y();
        defpackage.rml rmlVar = new defpackage.rml(srvVar, this.b, (defpackage.ssm) obj, 4);
        long j = defpackage.ahqx.a;
        defpackage.ahqv ahqvVar = new defpackage.ahqv(defpackage.ahns.c(false), rmlVar);
        int i = defpackage.ajan.c;
        defpackage.ajct ajctVar = srvVar.a;
        defpackage.ajam ajamVar = new defpackage.ajam(ajcqVarY, ahqvVar);
        ajcqVarY.c(ajamVar, defpackage.aiql.t(ajctVar, ajamVar));
        return ajamVar;
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
        return j$.util.function.Function.-CC.$default$compose(this, function);
    }
}
