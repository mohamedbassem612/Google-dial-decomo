package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class akbh implements defpackage.akbp {
    private final /* synthetic */ int $cid;
    private final java.lang.Object a;

    public akbh(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.akbp
    public final /* synthetic */ defpackage.akcc a() {
        int i = this.$cid;
        return defpackage.akcc.a;
    }

    @Override // defpackage.akbp
    public final /* synthetic */ defpackage.akcd b() {
        int i = this.$cid;
        return defpackage.akcd.a;
    }

    @Override // defpackage.akbp
    public final /* synthetic */ defpackage.akcd c() {
        int i = this.$cid;
        return defpackage.akcd.a;
    }

    @Override // defpackage.akbp
    public final /* synthetic */ defpackage.akcc d() {
        int i = this.$cid;
        return defpackage.akcc.a;
    }

    @Override // defpackage.akbp
    public final /* synthetic */ defpackage.akcd e() {
        int i = this.$cid;
        return defpackage.akcd.a;
    }

    @Override // defpackage.akbp
    public final /* synthetic */ defpackage.akcd f() {
        int i = this.$cid;
        return defpackage.akcd.a;
    }

    @Override // defpackage.akbp
    public final /* synthetic */ defpackage.akcc g(defpackage.aljf aljfVar) {
        int i = this.$cid;
        return defpackage.akcc.a;
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [ajzt, java.lang.Object] */
    @Override // defpackage.akbp
    public final defpackage.akcc h(defpackage.aljf aljfVar) {
        if (this.$cid != 0) {
            java.lang.Object obj = aljfVar.a;
            anma anmaVar = defpackage.ajyy.a;
            anmb anmbVar = (anmb) obj;
            ahvr.bZ(anmbVar.f(anmaVar) == null, "ChannelConfig provided twice");
            return new defpackage.akcc(1, null, null, anmbVar.e(anmaVar, this.a));
        }
        java.lang.Object objE = aljfVar.a;
        anma anmaVar2 = ajzs.a;
        anmb anmbVar2 = (anmb) objE;
        ajzs ajzsVarB = (ajzs) anmbVar2.f(anmaVar2);
        if (ajzsVarB == null) {
            java.lang.Object obj2 = aljfVar.c;
            ?? r6 = this.a;
            java.lang.String str = ((anpk) obj2).b;
            ajzsVarB = r6.b(str);
            ahvr.cl(ajzsVarB, "Could not find RpcId for method %s.Is portable_proto_filter set in your android_rpc_service?", str);
            objE = anmbVar2.e(anmaVar2, ajzsVarB);
        }
        return new defpackage.akcc(1, null, null, ((anmb) objE).e(defpackage.abzf.a, ajzsVarB.a()));
    }

    @Override // defpackage.akbp
    public final /* synthetic */ defpackage.akcd i(apjb apjbVar) {
        int i = this.$cid;
        return defpackage.akcd.a;
    }

    @Override // defpackage.akbp
    public final /* synthetic */ defpackage.akcd j(apjb apjbVar) {
        int i = this.$cid;
        return defpackage.akcd.a;
    }
}
