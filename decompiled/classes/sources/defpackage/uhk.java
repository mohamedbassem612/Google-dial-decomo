package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class uhk implements defpackage.ucr {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/spam/patronus/PatronusSpam");
    public static final defpackage.aenj b = new defpackage.aenj("PatronusSpam.checkSpamStatus");
    public static final defpackage.aenj c = new defpackage.aenj("PatronusSpam.SpamProtectionService.getCallerInfo");
    static final defpackage.uip d;
    public final defpackage.aoin e;
    public final defpackage.aoin f;
    public final defpackage.aoin g;
    public final android.content.Context h;
    public final defpackage.aoin i;
    public final defpackage.ajct j;
    public final defpackage.ajct k;
    public final defpackage.rlv l;
    public final defpackage.oko m;
    public final defpackage.ruc n;
    public final android.util.LruCache o;
    public final java.util.concurrent.Executor p;
    public final defpackage.akah q;
    public final defpackage.aoin r;
    public final defpackage.aoin s;
    public final defpackage.ojo t;
    public final defpackage.ahbv u;

    static {
        defpackage.uik uikVarA = defpackage.uin.a();
        uikVarA.c(defpackage.udj.SPAM_STATUS_UNKNOWN);
        defpackage.uil uilVar = new defpackage.uil();
        defpackage.akzx akzxVarM = defpackage.udm.a.m();
        defpackage.udj udjVar = defpackage.udj.SPAM_STATUS_UNKNOWN;
        akzxVarM.u();
        defpackage.udm udmVar = (defpackage.udm) akzxVarM.b;
        udmVar.d = udjVar.f;
        udmVar.b |= 2;
        akzxVarM.u();
        defpackage.udm udmVar2 = (defpackage.udm) akzxVarM.b;
        udmVar2.g = 0;
        udmVar2.b |= 16;
        akzxVarM.u();
        defpackage.udm udmVar3 = (defpackage.udm) akzxVarM.b;
        udmVar3.e = 0;
        udmVar3.b |= 4;
        akzxVarM.u();
        defpackage.udm udmVar4 = (defpackage.udm) akzxVarM.b;
        udmVar4.h = 0;
        udmVar4.b |= 32;
        uilVar.e((defpackage.udm) akzxVarM.r());
        uikVarA.b(uilVar.a());
        d = uikVarA.a();
    }

    public uhk(android.content.Context context, defpackage.aoin aoinVar, defpackage.ajct ajctVar, defpackage.ajct ajctVar2, defpackage.rlv rlvVar, defpackage.oko okoVar, defpackage.aoin aoinVar2, defpackage.aoin aoinVar3, defpackage.aoin aoinVar4, defpackage.aoin aoinVar5, defpackage.aoin aoinVar6, defpackage.ruc rucVar, defpackage.ahbv ahbvVar, defpackage.akah akahVar, android.util.LruCache lruCache, defpackage.ojo ojoVar) {
        this.h = context;
        this.i = aoinVar;
        this.j = ajctVar;
        this.k = ajctVar2;
        this.l = rlvVar;
        this.m = okoVar;
        this.f = aoinVar2;
        this.g = aoinVar3;
        this.e = aoinVar4;
        this.r = aoinVar5;
        this.s = aoinVar6;
        this.n = rucVar;
        this.u = ahbvVar;
        this.o = lruCache;
        this.p = new defpackage.ajdc(ajctVar2);
        this.q = akahVar;
        this.t = ojoVar;
    }

    public static defpackage.udj f(int i) {
        int i2 = i - 2;
        if (i2 != 1) {
            return i2 != 2 ? defpackage.udj.SPAM_STATUS_UNKNOWN : defpackage.udj.SPAM_STATUS_NOT_SPAM;
        }
        return defpackage.udj.SPAM_STATUS_SPAM;
    }

    @Override // defpackage.ucr
    public final /* synthetic */ defpackage.ajcq a(defpackage.aify aifyVar) {
        throw null;
    }

    @Override // defpackage.ucr
    public final defpackage.ajcq b(defpackage.aihd aihdVar) {
        throw null;
    }

    @Override // defpackage.ucr
    public final defpackage.ajcq c(android.telecom.Call.Details details) {
        throw null;
    }

    @Override // defpackage.ucr
    public final /* synthetic */ defpackage.ajcq d(j$.time.Instant instant, defpackage.udj udjVar) {
        throw null;
    }

    @Override // defpackage.ucr
    public final defpackage.ajcq e(defpackage.akzx akzxVar) {
        throw null;
    }
}
