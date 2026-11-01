package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class uxt implements defpackage.uxn {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;
    final /* synthetic */ alad b;

    public uxt(defpackage.uzx uzxVar, defpackage.uxr uxrVar, int i) {
        this.$cid = i;
        this.b = uxrVar;
        j$.util.Objects.requireNonNull(uzxVar);
        this.a = uzxVar;
    }

    @Override // defpackage.uxn
    public final defpackage.uxo a() {
        if (this.$cid != 0) {
            akzx akzxVarM = defpackage.uxo.a.m();
            akzxVarM.u();
            defpackage.uxo uxoVar = (defpackage.uxo) akzxVarM.b;
            uxoVar.b |= 1;
            uxoVar.c = 2131231948;
            akzxVarM.u();
            defpackage.uxo uxoVar2 = (defpackage.uxo) akzxVarM.b;
            uxoVar2.b |= 2;
            uxoVar2.d = 2132017282;
            return (defpackage.uxo) akzxVarM.p();
        }
        akzx akzxVarM2 = defpackage.uxo.a.m();
        akzxVarM2.u();
        defpackage.uxo uxoVar3 = (defpackage.uxo) akzxVarM2.b;
        uxoVar3.b |= 1;
        uxoVar3.c = 2131231952;
        akzxVarM2.u();
        defpackage.uxo uxoVar4 = (defpackage.uxo) akzxVarM2.b;
        uxoVar4.b |= 2;
        uxoVar4.d = 2132017283;
        return (defpackage.uxo) akzxVarM2.p();
    }

    @Override // defpackage.uxn
    public final j$.util.Optional b() {
        int i = this.$cid;
        alad aladVar = this.b;
        return i != 0 ? j$.util.Optional.of(new defpackage.uxs((defpackage.vqf) ((defpackage.uzx) this.a).a, (defpackage.uxr) aladVar, 0)) : j$.util.Optional.of(new defpackage.uxs((android.app.Activity) this.a, aladVar, 2));
    }

    public uxt(wsc wscVar, android.app.Activity activity, defpackage.uxu uxuVar, int i) {
        this.$cid = i;
        this.a = activity;
        this.b = uxuVar;
        j$.util.Objects.requireNonNull(wscVar);
    }
}
