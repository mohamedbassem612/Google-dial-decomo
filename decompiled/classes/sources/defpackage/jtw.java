package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class jtw implements defpackage.sqn {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/calleridfeedback/impl/phonelookup/CallerIdFeedbackPhoneLookupContributor");
    public java.lang.Long b;
    public final defpackage.jsk c;
    private final defpackage.ajct d;
    private final defpackage.kaw e;
    private final defpackage.aogc f;

    public jtw(defpackage.ajct ajctVar, defpackage.aogc aogcVar, defpackage.jsk jskVar, defpackage.kaw kawVar) {
        this.d = ajctVar;
        this.f = aogcVar;
        this.c = jskVar;
        this.e = kawVar;
    }

    @Override // defpackage.sqn
    public final defpackage.ajcq a(defpackage.aigf aigfVar) {
        defpackage.ajcq ajcmVar;
        this.b = null;
        defpackage.aihd aihdVarKeySet = aigfVar.keySet();
        if (aihdVarKeySet.isEmpty()) {
            ajcmVar = new defpackage.ajcm(defpackage.aikj.b);
        } else {
            defpackage.jsk jskVar = this.c;
            defpackage.ajcq ajcqVarU = jskVar.e.u(aihdVarKeySet);
            hky hkyVar = new hky(jskVar, 6);
            defpackage.ajct ajctVar = jskVar.b;
            long j = defpackage.ahqx.a;
            defpackage.ajax ajaxVar = new defpackage.ajax(defpackage.ahns.c(false), (defpackage.ajat) hkyVar, 1);
            int i = defpackage.ajan.c;
            defpackage.ajal ajalVar = new defpackage.ajal(ajcqVarU, ajaxVar);
            ajcqVarU.c(ajalVar, defpackage.aiql.t(ajctVar, ajalVar));
            ajcmVar = ajalVar;
        }
        return defpackage.ahrv.g(ajcmVar).h(new defpackage.jtv(this, aigfVar, 0), this.d);
    }

    @Override // defpackage.sqn
    public final defpackage.ajcq b(defpackage.aihd aihdVar) {
        return defpackage.ahrv.g(this.f.bk()).i(new hky(this, 8), this.d);
    }

    @Override // defpackage.sqn
    public final defpackage.ajcq c(hkd hkdVar) {
        defpackage.ahvr.ci(hkdVar);
        return defpackage.ahvr.H(this.c.a(hkdVar.c), new exn(19), this.d);
    }

    @Override // defpackage.sqn
    public final /* synthetic */ defpackage.ajcq d(android.content.Context context, android.telecom.Call.Details details, defpackage.ajcq ajcqVar) {
        return sns.f(this, context, details);
    }

    @Override // defpackage.sqn
    public final defpackage.ajcq e() {
        if (this.b == null) {
            return defpackage.ajcm.a;
        }
        ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/calleridfeedback/impl/phonelookup/CallerIdFeedbackPhoneLookupContributor", "onSuccessfulBulkUpdate", 134, "CallerIdFeedbackPhoneLookupContributor.java")).y("Writing timestampOfLastCallerIdFeedbackLookup : %d", this.b);
        return this.e.p(this.f.bl(new defpackage.jsd(this, 2)));
    }

    @Override // defpackage.sqn
    public final /* synthetic */ java.lang.Object f(spn spnVar) {
        spa spaVar = spnVar.n;
        return spaVar == null ? spa.a : spaVar;
    }

    @Override // defpackage.sqn
    public final java.lang.String g() {
        return "CallerIdFeedbackPhoneLookup";
    }

    @Override // defpackage.sqn
    public final /* synthetic */ void h(defpackage.akzx akzxVar, java.lang.Object obj) {
        spa spaVar = (spa) obj;
        akzxVar.u();
        spn spnVar = akzxVar.b;
        spn spnVar2 = spn.a;
        j$.util.Objects.requireNonNull(spaVar);
        spnVar.n = spaVar;
        spnVar.b |= 2048;
    }
}
