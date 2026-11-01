package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lwf implements defpackage.tem {
    public static final aimz a = aimz.i("com/android/dialer/contactsearch/ContactsAppSearchDataSource");
    public static final java.util.Set b = ajsz.cW(new java.lang.String[]{"name", "familyName", "middleName", "givenName", "additionalNames"});
    public final defpackage.htw c;
    public final defpackage.lvx d;
    public final rlv e;
    public final uqj f;
    public final aoin g;
    public tei h;
    public final aonj i;
    public final lvs j;
    public final apdp k;
    private final tek l;

    public lwf(defpackage.htw htwVar, defpackage.lvx lvxVar, aazc aazcVar, rlv rlvVar, uqj uqjVar, lvs lvsVar, aoin aoinVar) {
        aooh.f(htwVar, "sessionProvider");
        aooh.f(aazcVar, "clock");
        aooh.f(rlvVar, "loggingBindings");
        aooh.f(lvsVar, "contactDisplayPreferences");
        aooh.f(aoinVar, "maxNumScoresConsideredInPopularityRanking");
        this.c = htwVar;
        this.d = lvxVar;
        this.e = rlvVar;
        this.f = uqjVar;
        this.j = lvsVar;
        this.g = aoinVar;
        this.k = new apdp();
        this.i = new aiuo(new defpackage.kqu(this, (aoln) null, 2));
        this.l = tek.b;
    }

    @Override // defpackage.tem
    public final tek a() {
        return this.l;
    }

    @Override // defpackage.tem
    public final aoxh c(tei teiVar) {
        aooh.f(teiVar, "query");
        if (teiVar.a.length() != 0) {
            return teiVar.c == 2 ? this.d.c(teiVar) : new aowy(new defpackage.lwe(this, teiVar, (aoln) null, 0));
        }
        return new edg(tgj.a, 13);
    }
}
