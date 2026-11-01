package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class agxo implements defpackage.agxi {
    final /* synthetic */ defpackage.ajaz a;
    final /* synthetic */ java.lang.Object b;

    public agxo(defpackage.agab agabVar, defpackage.ajaz ajazVar, java.lang.Object obj) {
        this.a = ajazVar;
        this.b = obj;
        j$.util.Objects.requireNonNull(agabVar);
    }

    @Override // defpackage.agxi
    public final defpackage.ajbg a() {
        defpackage.ajcp ajcpVar = defpackage.ajbg.a;
        defpackage.ajbb ajbbVar = new defpackage.ajbb();
        defpackage.ajdk ajdkVar = new defpackage.ajdk(new defpackage.ahqt(this.a, ajbbVar, 2));
        ajdkVar.run();
        defpackage.ajbg ajbgVar = new defpackage.ajbg(ajdkVar, ajbbVar);
        defpackage.achf achfVar = new defpackage.achf(2);
        long j = defpackage.ahqx.a;
        return ajbgVar.c(new defpackage.ahqn(defpackage.ahns.c(false), achfVar), defpackage.ajbm.INSTANCE);
    }

    @Override // defpackage.agxi
    public final defpackage.ajcq b() {
        return defpackage.ajcm.a;
    }

    @Override // defpackage.agxi
    public final java.lang.Object e() {
        return this.b;
    }

    public final java.lang.String toString() {
        return "LocalDataSource[" + this.a.toString() + ']';
    }
}
