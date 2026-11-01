package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class srs implements defpackage.sqn {
    public final defpackage.ssq a;
    private final defpackage.ajct b;
    private final defpackage.rsr c;

    public srs(defpackage.ajct ajctVar, defpackage.rsr rsrVar, defpackage.ssq ssqVar) {
        this.b = ajctVar;
        this.c = rsrVar;
        this.a = ssqVar;
    }

    @Override // defpackage.sqn
    public final defpackage.ajcq a(defpackage.aigf aigfVar) {
        defpackage.ajcq ajcqVarY = this.c.Y();
        defpackage.jtv jtvVar = new defpackage.jtv(this, aigfVar, 11);
        long j = defpackage.ahqx.a;
        defpackage.ahqv ahqvVar = new defpackage.ahqv(defpackage.ahns.c(false), jtvVar);
        int i = defpackage.ajan.c;
        defpackage.ajct ajctVar = this.b;
        defpackage.ajam ajamVar = new defpackage.ajam(ajcqVarY, ahqvVar);
        ajcqVarY.c(ajamVar, defpackage.aiql.t(ajctVar, ajamVar));
        return ajamVar;
    }

    @Override // defpackage.sqn
    public final defpackage.ajcq b(defpackage.aihd aihdVar) {
        return defpackage.aiql.z(java.lang.Boolean.FALSE);
    }

    @Override // defpackage.sqn
    public final defpackage.ajcq c(hkd hkdVar) {
        return this.b.submit(defpackage.ahqx.i(new qfb(this, hkdVar, 18, (byte[]) null)));
    }

    @Override // defpackage.sqn
    public final /* synthetic */ defpackage.ajcq d(android.content.Context context, android.telecom.Call.Details details, defpackage.ajcq ajcqVar) {
        return sns.f(this, context, details);
    }

    @Override // defpackage.sqn
    public final defpackage.ajcq e() {
        return defpackage.ajcm.a;
    }

    @Override // defpackage.sqn
    public final /* synthetic */ java.lang.Object f(spn spnVar) {
        sph sphVar = spnVar.k;
        return sphVar == null ? sph.a : sphVar;
    }

    @Override // defpackage.sqn
    public final java.lang.String g() {
        return "EmergencyPhoneLookup";
    }

    @Override // defpackage.sqn
    public final /* synthetic */ void h(defpackage.akzx akzxVar, java.lang.Object obj) {
        sph sphVar = (sph) obj;
        akzxVar.u();
        spn spnVar = akzxVar.b;
        spn spnVar2 = spn.a;
        j$.util.Objects.requireNonNull(sphVar);
        spnVar.k = sphVar;
        spnVar.b |= 256;
    }
}
