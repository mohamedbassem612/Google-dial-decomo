package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class lhp implements defpackage.afgl {
    public final android.content.Context a;
    public final defpackage.ajcu b;
    public final defpackage.adqn c;
    private final defpackage.ajct d;
    private final defpackage.ajct e;
    private final defpackage.aogc f;

    public lhp(android.content.Context context, defpackage.ajct ajctVar, defpackage.ajct ajctVar2, defpackage.ajcu ajcuVar, defpackage.aogc aogcVar, defpackage.adqn adqnVar) {
        this.a = context;
        this.d = ajctVar;
        this.e = ajctVar2;
        this.b = ajcuVar;
        this.f = aogcVar;
        this.c = adqnVar;
    }

    @Override // defpackage.afgl
    public final defpackage.ajcq a() {
        return defpackage.ajcm.a;
    }

    @Override // defpackage.afgl
    public final /* bridge */ /* synthetic */ defpackage.ajcq b(defpackage.albh albhVar) {
        defpackage.ahrv ahrvVarG = defpackage.ahrv.g(this.f.an());
        lhy lhyVar = new lhy(this, 1);
        defpackage.ajct ajctVar = this.d;
        return ahrvVarG.i(lhyVar, ajctVar).h(new lgd(this, 6), ajctVar).h(new lef(13), ajctVar).h(new lgd((defpackage.lhs) albhVar, 7), ajctVar);
    }

    @Override // defpackage.afgl
    public final defpackage.ajcq c() {
        return defpackage.ahvr.F(new lgc(this, 5), this.e);
    }
}
