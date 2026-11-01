package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class sqq implements defpackage.sqn {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/phonelookup/cp2/Cp2ExtendedDirectoryPhoneLookupContributor");
    public static final java.lang.String[] b = {"_id", "contact_id", "display_name", "photo_thumb_uri", "photo_uri", "type", "label", "lookup", "display_name_alt", "normalized_number"};
    public final defpackage.ajct c;
    public final defpackage.ajcu d;
    public final defpackage.aoin e;
    public final defpackage.rlv f;
    public final defpackage.ssq g;
    public final defpackage.ojo h;
    public final defpackage.ahda i = new defpackage.ahda();
    public final defpackage.ahbv j;
    public final defpackage.ipc k;
    private final android.content.Context l;
    private final defpackage.ajct m;
    private final defpackage.aoin n;
    private final defpackage.aoin o;
    private final defpackage.sqv p;
    private final defpackage.rsr q;

    public sqq(android.content.Context context, defpackage.ajct ajctVar, defpackage.ajct ajctVar2, defpackage.ajcu ajcuVar, defpackage.aoin aoinVar, defpackage.aoin aoinVar2, defpackage.sqv sqvVar, defpackage.aoin aoinVar3, defpackage.rlv rlvVar, defpackage.ipc ipcVar, defpackage.ssq ssqVar, defpackage.ojo ojoVar, defpackage.rsr rsrVar, defpackage.ahbv ahbvVar) {
        this.l = context;
        this.m = ajctVar;
        this.c = ajctVar2;
        this.d = ajcuVar;
        this.n = aoinVar;
        this.o = aoinVar2;
        this.p = sqvVar;
        this.e = aoinVar3;
        this.f = rlvVar;
        this.k = ipcVar;
        this.g = ssqVar;
        this.h = ojoVar;
        this.q = rsrVar;
        this.j = ahbvVar;
    }

    private final defpackage.ajcq j() {
        defpackage.guy guyVar = new defpackage.guy(this, 15);
        long j = defpackage.ahqx.a;
        return this.m.submit(new defpackage.ajav(defpackage.ahns.c(false), guyVar, 1));
    }

    @Override // defpackage.sqn
    public final defpackage.ajcq a(defpackage.aigf aigfVar) {
        defpackage.aify aifyVar = defpackage.zqz.a;
        if (defpackage.dvx.c(this.l, "android.permission.READ_CONTACTS") != 0) {
            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.d()).i(defpackage.zct.b)).l("com/android/dialer/phonelookup/cp2/Cp2ExtendedDirectoryPhoneLookupContributor", "getMostRecentInfo", (char) 436, "Cp2ExtendedDirectoryPhoneLookupContributor.java")).v("missing permissions");
            return this.p.a(aigfVar);
        }
        defpackage.ajcq ajcqVarJ = j();
        defpackage.jtv jtvVar = new defpackage.jtv(this, aigfVar, 10);
        defpackage.ajcu ajcuVar = this.d;
        long j = defpackage.ahqx.a;
        defpackage.ahqv ahqvVar = new defpackage.ahqv(defpackage.ahns.c(false), jtvVar);
        int i = defpackage.ajan.c;
        defpackage.ajam ajamVar = new defpackage.ajam(ajcqVarJ, ahqvVar);
        ajcqVarJ.c(ajamVar, defpackage.aiql.t(ajcuVar, ajamVar));
        return ajamVar;
    }

    @Override // defpackage.sqn
    public final defpackage.ajcq b(defpackage.aihd aihdVar) {
        if (defpackage.zqz.a(this.l, "android.permission.READ_CONTACTS")) {
            return j();
        }
        return this.p.b(aihdVar, new sqj(3));
    }

    @Override // defpackage.sqn
    public final defpackage.ajcq c(hkd hkdVar) {
        return i(hkdVar.c);
    }

    @Override // defpackage.sqn
    public final defpackage.ajcq d(android.content.Context context, android.telecom.Call.Details details, defpackage.ajcq ajcqVar) {
        if (!((java.lang.Boolean) this.o.a()).booleanValue()) {
            return sns.f(this, context, details);
        }
        java.lang.String strB = ura.b(details);
        defpackage.ahrv ahrvVarG = defpackage.ahrv.g(this.q.a());
        phd phdVar = new phd(this, strB, 15);
        defpackage.ajcu ajcuVar = this.d;
        return ahrvVarG.i(phdVar, ajcuVar).i(new srq(this, 1), ajcuVar).i(new phd(this, strB, 16), ajcuVar);
    }

    @Override // defpackage.sqn
    public final defpackage.ajcq e() {
        defpackage.guy guyVar = new defpackage.guy(this, 14);
        long j = defpackage.ahqx.a;
        return this.m.submit(new defpackage.ajav(defpackage.ahns.c(false), guyVar, 1));
    }

    @Override // defpackage.sqn
    public final /* synthetic */ java.lang.Object f(spn spnVar) {
        spe speVar = spnVar.d;
        return speVar == null ? spe.a : speVar;
    }

    @Override // defpackage.sqn
    public final java.lang.String g() {
        return "Cp2ExtendedDirectoryPhoneLookup";
    }

    @Override // defpackage.sqn
    public final /* synthetic */ void h(defpackage.akzx akzxVar, java.lang.Object obj) {
        spe speVar = (spe) obj;
        akzxVar.u();
        spn spnVar = akzxVar.b;
        spn spnVar2 = spn.a;
        j$.util.Objects.requireNonNull(speVar);
        spnVar.d = speVar;
        spnVar.b |= 2;
    }

    public final defpackage.ajcq i(java.lang.String str) {
        if (!defpackage.zqz.a(this.l, "android.permission.READ_CONTACTS")) {
            return defpackage.aiql.z(spe.a);
        }
        defpackage.ajcq ajcqVarSubmit = this.m.submit(defpackage.ahqx.i(new defpackage.raj(this, 15)));
        phd phdVar = new phd(this, str, 14);
        defpackage.ajcu ajcuVar = this.d;
        defpackage.ajcq ajcqVarI = defpackage.ahvr.I(ajcqVarSubmit, phdVar, ajcuVar);
        long jLongValue = ((java.lang.Long) this.n.a()).longValue();
        return jLongValue != Long.MAX_VALUE ? defpackage.ahvr.B(defpackage.aiql.G(ajcqVarI, jLongValue, java.util.concurrent.TimeUnit.MILLISECONDS, ajcuVar), java.util.concurrent.TimeoutException.class, new soi(this, 5), ajcuVar) : ajcqVarI;
    }
}
