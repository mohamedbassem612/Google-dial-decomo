package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class udy implements defpackage.ucr {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/spam/composite/CompositeSpam");
    public final defpackage.ucr b;
    public final defpackage.ucr c;
    public final defpackage.ajct d;
    public final defpackage.ajct e;
    public final defpackage.zzd f;
    public final android.content.Context g;
    public final defpackage.rlv h;
    public final defpackage.uct i;
    public final defpackage.aoin j;
    public final defpackage.aoin k;
    public final defpackage.aoin l;
    public final defpackage.zdi m;
    public final defpackage.ugs n;
    public final defpackage.uhz o;
    public final defpackage.tvn p;
    public final defpackage.rsr q;
    public final defpackage.zjm r;
    private final defpackage.ucr s;
    private final defpackage.aoin t;
    private final defpackage.ipc u;

    public udy(defpackage.ipc ipcVar, defpackage.ucr ucrVar, defpackage.ucr ucrVar2, defpackage.ucr ucrVar3, defpackage.ajct ajctVar, defpackage.ajct ajctVar2, defpackage.zzd zzdVar, defpackage.tvn tvnVar, defpackage.zjm zjmVar, android.content.Context context, defpackage.rlv rlvVar, defpackage.zdi zdiVar, defpackage.aoin aoinVar, defpackage.aoin aoinVar2, defpackage.uct uctVar, defpackage.ugs ugsVar, defpackage.uhz uhzVar, defpackage.rsr rsrVar, defpackage.aoin aoinVar3, defpackage.aoin aoinVar4) {
        this.o = uhzVar;
        this.q = rsrVar;
        this.t = aoinVar3;
        this.u = ipcVar;
        this.b = ucrVar;
        this.s = ucrVar2;
        this.c = ucrVar3;
        this.d = ajctVar;
        this.e = ajctVar2;
        this.f = zzdVar;
        this.p = tvnVar;
        this.r = zjmVar;
        this.g = context;
        this.h = rlvVar;
        this.m = zdiVar;
        this.j = aoinVar;
        this.k = aoinVar4;
        this.l = aoinVar2;
        this.i = uctVar;
        this.n = ugsVar;
    }

    public static defpackage.ajcq f(defpackage.ajcq ajcqVar, defpackage.uip uipVar, java.lang.String str) {
        return defpackage.ahvr.B(ajcqVar, java.lang.Exception.class, defpackage.ahqx.a(new tzs(str, uipVar, 5)), defpackage.ajbm.INSTANCE);
    }

    public static java.lang.String h(java.lang.String str, long j) {
        return java.lang.String.valueOf(j$.util.Objects.hash(new java.lang.Object[]{str, java.lang.Long.valueOf(j)}));
    }

    @Override // defpackage.ucr
    public final defpackage.ajcq a(defpackage.aify aifyVar) {
        return ((java.lang.Boolean) this.j.a()).booleanValue() ? this.d.submit(defpackage.ahqx.i(new syg(this, aifyVar, 10))) : defpackage.aiql.z(defpackage.aikj.b);
    }

    @Override // defpackage.ucr
    public final defpackage.ajcq b(defpackage.aihd aihdVar) {
        if (aihdVar == null) {
            defpackage.aooh.i("dialerPhoneNumbersSet");
        }
        defpackage.ueh uehVar = ((defpackage.uek) this.b).e;
        return defpackage.aosv.F(uehVar.a, 0, new defpackage.bur(uehVar, aihdVar, (defpackage.aoln) null, 19), 3);
    }

    @Override // defpackage.ucr
    public final defpackage.ajcq c(android.telecom.Call.Details details) {
        defpackage.ajcq ajcqVarH;
        defpackage.ajcq ajcqVarF;
        defpackage.aimz aimzVar = a;
        ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/spam/composite/CompositeSpam", "checkSpamStatus", 224, "CompositeSpam.java")).v("enter");
        java.lang.String strB = ura.b(details);
        if (android.text.TextUtils.isEmpty(strB)) {
            ajcqVarH = defpackage.aiql.z(uib.a);
        } else {
            defpackage.ahrv ahrvVarG = defpackage.ahrv.g(this.q.a());
            tak takVar = new tak(this, strB, 15, (byte[]) null);
            defpackage.ajct ajctVar = this.e;
            ajcqVarH = ahrvVarG.i(takVar, ajctVar).h(new defpackage.ubc(6), ajctVar);
            defpackage.agsm.i(909, ajcqVarH, "Exception while reading cross-app spam signal", new java.lang.Object[0]);
        }
        ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/spam/composite/CompositeSpam", "checkSpamStatusInAppCatchingAll", 336, "CompositeSpam.java")).v("querying inAppSpam");
        defpackage.ucr ucrVar = this.b;
        defpackage.ajcq ajcqVarF2 = f(defpackage.ahvr.I(((defpackage.uek) ucrVar).c.submit(defpackage.ahqx.i(new syg(ucrVar, ura.b(details), 13))), new udu(ucrVar, 2), defpackage.ajbm.INSTANCE), ufi.d(), "inAppSpam");
        if (defpackage.zqz.a(this.g, "android.permission.READ_PHONE_STATE")) {
            ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/spam/composite/CompositeSpam", "checkSpamStatusStirShakenCatchingAll", 350, "CompositeSpam.java")).v("querying stirShakenSpam");
            defpackage.ucr ucrVar2 = this.s;
            defpackage.aooh.f(details, "details");
            defpackage.ujb ujbVar = (defpackage.ujb) ucrVar2;
            ajcqVarF = f(defpackage.aosv.F(ujbVar.c, 0, new rir(ujbVar, details, (defpackage.aoln) null, 8), 3), defpackage.ttj.H(), "stirShakenSpam");
        } else {
            ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/spam/composite/CompositeSpam", "checkSpamStatusStirShakenCatchingAll", 346, "CompositeSpam.java")).v("read phone state permissions unavailable to check spam status");
            ajcqVarF = defpackage.aiql.z(defpackage.ttj.H());
        }
        defpackage.ahda ahdaVarAk = defpackage.ahvr.ak(ajcqVarF2, ajcqVarF);
        udw udwVar = new udw(this, ajcqVarF2, ajcqVarF, details);
        defpackage.ajct ajctVar2 = this.e;
        defpackage.ajcq ajcqVarP = ahdaVarAk.p(udwVar, ajctVar2);
        if (((java.lang.Boolean) this.t.a()).booleanValue()) {
            defpackage.agsm.i(908, defpackage.ahvr.ak(ajcqVarH, ajcqVarP).o(new tbb(this, ajcqVarH, ajcqVarP, 5), ajctVar2), "Failed to calculate cross-app overlap", new java.lang.Object[0]);
        }
        return defpackage.ahvr.H(ajcqVarP, new tzs(this, details, 7), ajctVar2);
    }

    @Override // defpackage.ucr
    public final defpackage.ajcq d(j$.time.Instant instant, defpackage.udj udjVar) {
        defpackage.uex uexVar = ((defpackage.uek) this.b).h;
        return defpackage.ahvr.F(new tbb(uexVar, instant, udjVar, 6), uexVar.d);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002a  */
    @Override // defpackage.ucr
    public final defpackage.ajcq e(defpackage.akzx akzxVar) {
        aivu aivuVar = akzxVar.b.c;
        if (aivuVar == null) {
            aivuVar = aivu.a;
        }
        aivt aivtVarB = aivt.b(aivuVar.f);
        if (aivtVarB == null) {
            aivtVarB = aivt.a;
        }
        int iOrdinal = aivtVarB.ordinal();
        if (iOrdinal == 1) {
            this.u.bm(defpackage.rmu.REPORT_NOT_SPAM_OR_DONT_SCREEN_CLICKED);
        } else if (iOrdinal == 2) {
            this.u.bm(defpackage.rmu.REPORT_SPAM_CLICKED);
        } else if (iOrdinal == 3) {
            this.u.bm(defpackage.rmu.REPORT_NOT_SPAM_OR_DONT_SCREEN_CLICKED);
        }
        defpackage.ajct ajctVar = this.d;
        defpackage.ahrv ahrvVarG = defpackage.ahrv.g(defpackage.ahvr.I(ajctVar.submit(defpackage.ahqx.i(new udt(this, akzxVar))), new tak(this, akzxVar, 14, (byte[]) null), ajctVar));
        tak takVar = new tak(this, akzxVar, 13, (byte[]) null);
        defpackage.ajct ajctVar2 = this.e;
        defpackage.ahrv ahrvVarH = ahrvVarG.i(takVar, ajctVar2).h(new tzs(this, akzxVar, 4, (byte[]) null), ajctVar);
        tzs tzsVar = new tzs(this, akzxVar, 6, (byte[]) null);
        defpackage.ajbm ajbmVar = defpackage.ajbm.INSTANCE;
        return defpackage.ahrv.g(ahrvVarH.h(tzsVar, ajbmVar)).i(new udx(this, akzxVar), ajctVar2).h(new tzs(this, akzxVar, 8, (byte[]) null), ajctVar2).i(new tak(this, akzxVar, 16, (byte[]) null), ajbmVar);
    }

    public final j$.util.Optional g(ucq ucqVar) {
        j$.util.Optional optionalC;
        if ((ucqVar.b & 8) != 0) {
            optionalC = j$.util.Optional.of(java.lang.Long.valueOf(ucqVar.f));
        } else {
            defpackage.zjm zjmVar = this.r;
            aivu aivuVar = ucqVar.c;
            if (aivuVar == null) {
                aivuVar = aivu.a;
            }
            optionalC = zjmVar.C(aivuVar.g);
        }
        return optionalC.isPresent() ? j$.util.Optional.ofNullable(this.p.j(java.lang.String.valueOf(optionalC.orElseThrow()))) : j$.util.Optional.empty();
    }
}
