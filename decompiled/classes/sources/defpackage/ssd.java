package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ssd implements defpackage.sqn {
    public final defpackage.aoin a;
    public java.lang.Long b;
    private final defpackage.ajct c;
    private final defpackage.ajct d;
    private final defpackage.ucr e;
    private final defpackage.tvn f;

    public ssd(defpackage.ajct ajctVar, defpackage.ajct ajctVar2, defpackage.aoin aoinVar, defpackage.ucr ucrVar, defpackage.tvn tvnVar) {
        this.d = ajctVar;
        this.c = ajctVar2;
        this.a = aoinVar;
        this.e = ucrVar;
        this.f = tvnVar;
    }

    @Override // defpackage.sqn
    public final defpackage.ajcq a(defpackage.aigf aigfVar) {
        this.b = null;
        defpackage.ajcq ajcqVarB = this.e.b(aigfVar.keySet());
        defpackage.jyx jyxVar = new defpackage.jyx(this, 9);
        long j = defpackage.ahqx.a;
        defpackage.ahqv ahqvVar = new defpackage.ahqv(defpackage.ahns.c(false), jyxVar);
        int i = defpackage.ajan.c;
        defpackage.ajct ajctVar = this.c;
        defpackage.ajam ajamVar = new defpackage.ajam(ajcqVarB, ahqvVar);
        ajcqVarB.c(ajamVar, defpackage.aiql.t(ajctVar, ajamVar));
        return ajamVar;
    }

    @Override // defpackage.sqn
    public final defpackage.ajcq b(defpackage.aihd aihdVar) {
        defpackage.ajcq ajcqVarSubmit = this.d.submit(defpackage.ahqx.i(new defpackage.raj(this, 17)));
        defpackage.ucr ucrVar = this.e;
        j$.util.Objects.requireNonNull(ucrVar);
        return defpackage.ahvr.I(ajcqVarSubmit, new srq(ucrVar, 3), this.c);
    }

    @Override // defpackage.sqn
    public final defpackage.ajcq c(hkd hkdVar) {
        return defpackage.ahvr.H(this.e.b(new defpackage.aile(hkdVar)), new soi(hkdVar, 6), this.c);
    }

    @Override // defpackage.sqn
    public final defpackage.ajcq d(android.content.Context context, android.telecom.Call.Details details, defpackage.ajcq ajcqVar) {
        return defpackage.ahvr.H(this.f.f(details), new rht(9), this.c);
    }

    @Override // defpackage.sqn
    public final defpackage.ajcq e() {
        defpackage.guy guyVar = new defpackage.guy(this, 16);
        long j = defpackage.ahqx.a;
        return this.d.submit(new defpackage.ajav(defpackage.ahns.c(false), guyVar, 1));
    }

    @Override // defpackage.sqn
    public final /* synthetic */ java.lang.Object f(spn spnVar) {
        spk spkVar = spnVar.e;
        return spkVar == null ? spk.a : spkVar;
    }

    @Override // defpackage.sqn
    public final java.lang.String g() {
        return "SpamPhoneLookup";
    }

    @Override // defpackage.sqn
    public final /* synthetic */ void h(defpackage.akzx akzxVar, java.lang.Object obj) {
        spk spkVar = (spk) obj;
        akzxVar.u();
        spn spnVar = akzxVar.b;
        spn spnVar2 = spn.a;
        j$.util.Objects.requireNonNull(spkVar);
        spnVar.e = spkVar;
        spnVar.b |= 4;
    }
}
