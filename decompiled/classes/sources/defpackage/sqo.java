package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class sqo implements defpackage.sqn {
    private static final defpackage.aimz c = defpackage.aimz.i("com/android/dialer/phonelookup/cp2/Cp2DefaultDirectoryPhoneLookupContributor");
    public final defpackage.aoin a;
    public final defpackage.ipc b;
    private final android.content.Context d;
    private final defpackage.ajct e;
    private final defpackage.ajct f;
    private final defpackage.sqv g;
    private final defpackage.sqw h;

    public sqo(android.content.Context context, defpackage.aoin aoinVar, defpackage.ajct ajctVar, defpackage.ajct ajctVar2, defpackage.sqv sqvVar, defpackage.sqw sqwVar, defpackage.ipc ipcVar) {
        this.d = context;
        this.a = aoinVar;
        this.e = ajctVar;
        this.f = ajctVar2;
        this.g = sqvVar;
        this.h = sqwVar;
        this.b = ipcVar;
    }

    private final defpackage.ajcq i() {
        defpackage.guy guyVar = new defpackage.guy(this, 12);
        long j = defpackage.ahqx.a;
        return this.e.submit(new defpackage.ajav(defpackage.ahns.c(false), guyVar, 1));
    }

    @Override // defpackage.sqn
    public final defpackage.ajcq a(defpackage.aigf aigfVar) {
        defpackage.aify aifyVar = defpackage.zqz.a;
        if (defpackage.dvx.c(this.d, "android.permission.READ_CONTACTS") != 0) {
            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) c.d()).i(defpackage.zct.b)).l("com/android/dialer/phonelookup/cp2/Cp2DefaultDirectoryPhoneLookupContributor", "getMostRecentInfo", (char) 138, "Cp2DefaultDirectoryPhoneLookupContributor.java")).v("missing permissions");
            return this.g.a(aigfVar);
        }
        defpackage.ajcq ajcqVarI = i();
        defpackage.jtv jtvVar = new defpackage.jtv(this, aigfVar, 9);
        defpackage.ajct ajctVar = this.f;
        long j = defpackage.ahqx.a;
        defpackage.ahqv ahqvVar = new defpackage.ahqv(defpackage.ahns.c(false), jtvVar);
        int i = defpackage.ajan.c;
        defpackage.ajam ajamVar = new defpackage.ajam(ajcqVarI, ahqvVar);
        ajcqVarI.c(ajamVar, defpackage.aiql.t(ajctVar, ajamVar));
        return ajamVar;
    }

    @Override // defpackage.sqn
    public final defpackage.ajcq b(defpackage.aihd aihdVar) {
        if (defpackage.zqz.a(this.d, "android.permission.READ_CONTACTS")) {
            return i();
        }
        ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) c.d()).i(defpackage.zct.b)).l("com/android/dialer/phonelookup/cp2/Cp2DefaultDirectoryPhoneLookupContributor", "isDirty", 'j', "Cp2DefaultDirectoryPhoneLookupContributor.java")).v("missing permissions");
        return this.g.b(aihdVar, new sqj(2));
    }

    @Override // defpackage.sqn
    public final defpackage.ajcq c(hkd hkdVar) {
        defpackage.sqw sqwVar = this.h;
        return defpackage.ahvr.H(sqwVar.c.submit(defpackage.ahqx.i(new qfb(sqwVar, hkdVar, 17, (byte[]) null))), new rht(7), this.f);
    }

    @Override // defpackage.sqn
    public final /* synthetic */ defpackage.ajcq d(android.content.Context context, android.telecom.Call.Details details, defpackage.ajcq ajcqVar) {
        return sns.f(this, context, details);
    }

    @Override // defpackage.sqn
    public final defpackage.ajcq e() {
        defpackage.guy guyVar = new defpackage.guy(this, 13);
        long j = defpackage.ahqx.a;
        return this.e.submit(new defpackage.ajav(defpackage.ahns.c(false), guyVar, 1));
    }

    @Override // defpackage.sqn
    public final /* synthetic */ java.lang.Object f(spn spnVar) {
        spe speVar = spnVar.c;
        return speVar == null ? spe.a : speVar;
    }

    @Override // defpackage.sqn
    public final java.lang.String g() {
        return "Cp2DefaultDirectoryPhoneLookup";
    }

    @Override // defpackage.sqn
    public final /* synthetic */ void h(defpackage.akzx akzxVar, java.lang.Object obj) {
        spe speVar = (spe) obj;
        akzxVar.u();
        spn spnVar = akzxVar.b;
        spn spnVar2 = spn.a;
        j$.util.Objects.requireNonNull(speVar);
        spnVar.c = speVar;
        spnVar.b |= 1;
    }
}
