package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class jst implements defpackage.sqn {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/calleridfeedback/impl/eligibilitylookup/CrowdsourceEligibilityPhoneLookupContributor");
    public final defpackage.ajct b;
    public final defpackage.aoin c;
    public final defpackage.tcc d;
    public final defpackage.zjm e;
    public final defpackage.aogc f;
    private final defpackage.ajct g;

    public jst(defpackage.ajct ajctVar, defpackage.ajct ajctVar2, defpackage.aoin aoinVar, defpackage.tcc tccVar, defpackage.zjm zjmVar, defpackage.aogc aogcVar) {
        this.b = ajctVar;
        this.g = ajctVar2;
        this.c = aoinVar;
        this.d = tccVar;
        this.e = zjmVar;
        this.f = aogcVar;
    }

    @Override // defpackage.sqn
    public final defpackage.ajcq a(defpackage.aigf aigfVar) {
        defpackage.ajcq ajcqVarA = this.d.a();
        defpackage.jtv jtvVar = new defpackage.jtv(this, aigfVar, 1);
        long j = defpackage.ahqx.a;
        defpackage.ahqv ahqvVar = new defpackage.ahqv(defpackage.ahns.c(false), jtvVar);
        int i = defpackage.ajan.c;
        defpackage.ajct ajctVar = this.g;
        defpackage.ajam ajamVar = new defpackage.ajam(ajcqVarA, ahqvVar);
        ajcqVarA.c(ajamVar, defpackage.aiql.t(ajctVar, ajamVar));
        return ajamVar;
    }

    @Override // defpackage.sqn
    public final defpackage.ajcq b(defpackage.aihd aihdVar) {
        if (((java.lang.Long) this.c.a()).longValue() == 0) {
            return defpackage.aiql.z(java.lang.Boolean.FALSE);
        }
        defpackage.aogc aogcVar = this.f;
        defpackage.tcc tccVar = this.d;
        defpackage.ajcq ajcqVarBk = aogcVar.bk();
        defpackage.ajcq ajcqVarA = tccVar.a();
        return defpackage.ahvr.ak(ajcqVarBk, ajcqVarA).p(defpackage.ahqx.b(new jsr(this, ajcqVarBk, ajcqVarA, 0)), this.g);
    }

    @Override // defpackage.sqn
    public final defpackage.ajcq c(hkd hkdVar) {
        defpackage.ahvr.ci(hkdVar);
        return defpackage.ahvr.I(defpackage.ahvr.G(new ibg(this, 7), this.g), new idd(this, hkdVar, 6, (byte[]) null), this.b);
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
        spf spfVar = spnVar.p;
        return spfVar == null ? spf.a : spfVar;
    }

    @Override // defpackage.sqn
    public final java.lang.String g() {
        return "CrowdsourceEligibilityPhoneLookup";
    }

    @Override // defpackage.sqn
    public final /* synthetic */ void h(defpackage.akzx akzxVar, java.lang.Object obj) {
        spf spfVar = (spf) obj;
        akzxVar.u();
        spn spnVar = akzxVar.b;
        spn spnVar2 = spn.a;
        j$.util.Objects.requireNonNull(spfVar);
        spnVar.p = spfVar;
        spnVar.b |= 8192;
    }
}
