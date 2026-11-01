package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class srr implements defpackage.sqn {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/phonelookup/dialergatewayserver/CallInfoLookupServicePhoneLookupContributor");
    public final defpackage.ruc b;
    public final defpackage.rlv c;
    public final defpackage.tcc d;
    public final defpackage.zhf e;
    private final defpackage.ajct f;
    private final defpackage.ajct g;
    private final defpackage.ahbv h;

    public srr(defpackage.ajct ajctVar, defpackage.ajct ajctVar2, defpackage.ruc rucVar, defpackage.rlv rlvVar, defpackage.tcc tccVar, defpackage.ahbv ahbvVar, defpackage.zhf zhfVar) {
        this.f = ajctVar;
        this.g = ajctVar2;
        this.b = rucVar;
        this.c = rlvVar;
        this.d = tccVar;
        this.h = ahbvVar;
        this.e = zhfVar;
    }

    @Override // defpackage.sqn
    public final defpackage.ajcq a(defpackage.aigf aigfVar) {
        return defpackage.anar.w(aigfVar);
    }

    @Override // defpackage.sqn
    public final defpackage.ajcq b(defpackage.aihd aihdVar) {
        return defpackage.aiql.z(java.lang.Boolean.FALSE);
    }

    @Override // defpackage.sqn
    public final defpackage.ajcq c(hkd hkdVar) {
        defpackage.ahvr.ci(hkdVar);
        plx plxVar = new plx(this, 7);
        defpackage.ajct ajctVar = this.g;
        return defpackage.ahvr.C(defpackage.ahvr.I(defpackage.ahvr.G(plxVar, ajctVar), new phd(this, hkdVar, 17, (byte[]) null), ajctVar), java.lang.Exception.class, defpackage.ahqx.c(new srq(this, 0)), this.f);
    }

    @Override // defpackage.sqn
    public final defpackage.ajcq d(android.content.Context context, android.telecom.Call.Details details, defpackage.ajcq ajcqVar) {
        return defpackage.ahvr.I(this.h.v(ura.b(details), defpackage.rlt.a(context, null)), new srq(this, 2), this.f);
    }

    @Override // defpackage.sqn
    public final defpackage.ajcq e() {
        return defpackage.ajcm.a;
    }

    @Override // defpackage.sqn
    public final /* synthetic */ java.lang.Object f(spn spnVar) {
        zhj zhjVar = spnVar.l;
        return zhjVar == null ? zhj.a : zhjVar;
    }

    @Override // defpackage.sqn
    public final java.lang.String g() {
        return "CallInfoLookupServicePhoneLookup";
    }

    @Override // defpackage.sqn
    public final /* synthetic */ void h(defpackage.akzx akzxVar, java.lang.Object obj) {
        zhj zhjVar = (zhj) obj;
        akzxVar.u();
        spn spnVar = akzxVar.b;
        spn spnVar2 = spn.a;
        j$.util.Objects.requireNonNull(zhjVar);
        spnVar.l = zhjVar;
        spnVar.b |= 512;
    }
}
