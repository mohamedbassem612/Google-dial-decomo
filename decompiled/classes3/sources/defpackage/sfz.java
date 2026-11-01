package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class sfz extends defpackage.sga {
    public static final aimz a = aimz.i("com/android/dialer/patrick/impl/settings/ui/CallingCardSettingsFragmentPeer");
    public static final java.lang.String[] b = {"android.permission.READ_CONTACTS", "android.permission.WRITE_CONTACTS"};
    public static final defpackage.abxn c;
    private static final defpackage.sfq z;
    private final defpackage.abxo A;
    private final ojo B;
    private final zrw C;
    private final smx D;
    private final ok E;
    private final gpd F;
    public final defpackage.sfp d;
    public final aoss e;
    public final aoss f;
    public final agtj g;
    public final rlv h;
    public final aoin i;
    public final ccp j;
    public final defpackage.sfr k;
    public final agtk l;
    public final agtk m;
    public final ok n;
    public final ok o;
    public final ok p;
    public android.net.Uri q;
    public final ok r;
    public final ok s;
    public final ok t;
    public final ok u;
    public final apdp v;
    public final defpackage.uss w;
    public final ajwr x;

    static {
        defpackage.vaa vaaVarC = defpackage.abxl.C(defpackage.abxn.a.m());
        vaaVarC.R(5);
        vaaVarC.Q(3);
        c = vaaVarC.M();
        z = new defpackage.sfq();
    }

    public sfz(defpackage.sfp sfpVar, aoss aossVar, aoss aossVar2, defpackage.abxo abxoVar, defpackage.uss ussVar, ojo ojoVar, zrw zrwVar, ajwr ajwrVar, agtj agtjVar, rlv rlvVar, smx smxVar, aoin aoinVar, gpd gpdVar) {
        aooh.f(aossVar, "backgroundScope");
        aooh.f(aossVar2, "lightweightScope");
        aooh.f(ojoVar, "dialerContentResolver");
        aooh.f(ajwrVar, "subscriptionMixin");
        aooh.f(agtjVar, "futuresMixin");
        aooh.f(rlvVar, "loggingBindings");
        aooh.f(aoinVar, "enableContactsYourInfoFeatureRequestChanges");
        aooh.f(gpdVar, "cuiSemanticLoggerFactory");
        this.d = sfpVar;
        this.e = aossVar;
        this.f = aossVar2;
        this.A = abxoVar;
        this.w = ussVar;
        this.B = ojoVar;
        this.C = zrwVar;
        this.x = ajwrVar;
        this.g = agtjVar;
        this.h = rlvVar;
        this.D = smxVar;
        this.i = aoinVar;
        this.F = gpdVar;
        this.j = new androidx.compose.runtime.ParcelableSnapshotMutableState(new defpackage.sgl(new ovt(this, 9, (short[][]) null), new ovt(this, 10, (int[][]) null), aokc.a, null, smxVar.a(), false), cdu.c);
        this.k = new defpackage.sfr(this);
        this.l = new defpackage.sfs(this);
        this.m = new defpackage.sfx(this);
        this.n = sfpVar.O(z, new kse(this, 10));
        this.o = sfpVar.O(abxoVar, new kse(this, 11));
        this.p = sfpVar.O(new oz(), new kse(this, 12));
        this.v = new apdp();
        this.r = sfpVar.O(abxoVar, new kse(this, 13));
        this.s = sfpVar.O(defpackage.sjf.a, new kse(this, 14));
        this.t = sfpVar.O(abxoVar, new kse(this, 15));
        ok okVarO = sfpVar.O(defpackage.sjf.b, new kse(this, 16));
        this.E = okVarO;
        this.u = okVarO;
    }

    public static final long i(android.net.Uri uri) {
        java.lang.String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment != null) {
            return java.lang.Long.parseLong(lastPathSegment);
        }
        throw new java.lang.IllegalStateException("Raw contact id cannot be parsed to long.");
    }

    public final defpackage.sgn a(defpackage.sfe sfeVar) {
        java.lang.String strF = f(sfeVar.a);
        java.lang.Long l = sfeVar.b;
        return new defpackage.sgn(l, strF, sfeVar.c, sfeVar.d, new obp(l, this, sfeVar, 12, (byte[]) null));
    }

    public final zas b() {
        return this.F.i((java.lang.String) null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(android.net.Uri uri, aoln aolnVar) {
        defpackage.sft sftVar;
        java.lang.Object next;
        if (aolnVar instanceof defpackage.sft) {
            sftVar = (defpackage.sft) aolnVar;
            int i = sftVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                sftVar.c = i - Integer.MIN_VALUE;
            } else {
                sftVar = new defpackage.sft(this, aolnVar);
            }
        } else {
            sftVar = new defpackage.sft(this, aolnVar);
        }
        defpackage.sft sftVar2 = sftVar;
        java.lang.Object objI = sftVar2.a;
        aolu aoluVar = aolu.a;
        int i2 = sftVar2.c;
        try {
            if (i2 == 0) {
                aooc.af(objI);
                defpackage.sfu sfuVar = new defpackage.sfu(uri);
                sftVar2.c = 1;
                objI = this.B.i(uri, new java.lang.String[]{"display_name", "account_name", "account_type"}, (java.lang.String) null, (java.lang.String[]) null, (java.lang.String) null, sfuVar, sftVar2);
                if (objI == aoluVar) {
                    return aoluVar;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objI);
            }
            aify aifyVar = (aify) objI;
            java.util.Iterator it = aifyVar.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!aooh.n(((defpackage.sfe) next).f, "com.google"));
            defpackage.sfe sfeVar = (defpackage.sfe) next;
            if (sfeVar != null) {
                return sfeVar;
            }
            java.lang.Object objBE = ajsz.bE(aifyVar);
            aooh.e(objBE, "first(...)");
            return (defpackage.sfe) objBE;
        } catch (java.lang.RuntimeException e) {
            a.d().k(e).l("com/android/dialer/patrick/impl/settings/ui/CallingCardSettingsFragmentPeer", "fetchContactData", 441, "CallingCardSettingsFragmentPeer.kt").v("fetchContactData failed");
            throw e;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object d(aoln aolnVar) {
        defpackage.sfv sfvVar;
        apdp apdpVar;
        if (aolnVar instanceof defpackage.sfv) {
            sfvVar = (defpackage.sfv) aolnVar;
            int i = sfvVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                sfvVar.c = i - Integer.MIN_VALUE;
            } else {
                sfvVar = new defpackage.sfv(this, aolnVar);
            }
        } else {
            sfvVar = new defpackage.sfv(this, aolnVar);
        }
        java.lang.Object obj = sfvVar.a;
        android.net.Uri uri = aolu.a;
        int i2 = sfvVar.c;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                apdp apdpVar2 = this.v;
                sfvVar.d = apdpVar2;
                sfvVar.c = 1;
                if (apdpVar2.b(sfvVar) != uri) {
                    apdpVar = apdpVar2;
                }
                return uri;
            }
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            apdpVar = sfvVar.d;
            aooc.af(obj);
            uri = this.q;
            return uri;
        } finally {
            apdpVar.d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object e(aoln aolnVar) {
        defpackage.sfw sfwVar;
        if (aolnVar instanceof defpackage.sfw) {
            sfwVar = (defpackage.sfw) aolnVar;
            int i = sfwVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                sfwVar.c = i - Integer.MIN_VALUE;
            } else {
                sfwVar = new defpackage.sfw(this, aolnVar);
            }
        } else {
            sfwVar = new defpackage.sfw(this, aolnVar);
        }
        java.lang.Object objL = sfwVar.a;
        aolu aoluVar = aolu.a;
        int i2 = sfwVar.c;
        boolean z2 = false;
        if (i2 != 0) {
            if (i2 == 1) {
                aooc.af(objL);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objL);
            }
            if (((java.lang.Boolean) objL).booleanValue()) {
                z2 = true;
            }
            return java.lang.Boolean.valueOf(z2);
        }
        aooc.af(objL);
        zrw zrwVar = this.C;
        sfwVar.c = 1;
        objL = zrwVar.l(sfwVar);
        if (objL == aoluVar) {
            return aoluVar;
        }
        if (((java.lang.Boolean) objL).booleanValue()) {
            zrw zrwVar2 = this.C;
            sfwVar.c = 2;
            objL = zrwVar2.m(sfwVar);
            if (objL == aoluVar) {
                return aoluVar;
            }
            if (((java.lang.Boolean) objL).booleanValue()) {
                z2 = true;
            }
        }
        return java.lang.Boolean.valueOf(z2);
    }

    public final java.lang.String f(java.lang.String str) {
        if (str != null) {
            return str;
        }
        java.lang.String strY = this.d.Y(2132019348);
        aooh.e(strY, "getString(...)");
        return strY;
    }

    public final void g(android.net.Uri uri, java.lang.String str) {
        a.b().l("com/android/dialer/patrick/impl/settings/ui/CallingCardSettingsFragmentPeer", "launchOnboardingFlowForContact", 286, "CallingCardSettingsFragmentPeer.kt").v("launchOnboardingFlow");
        this.g.i(defpackage.zoe.M(aosv.F(this.e, 0, new defpackage.sfy(this, uri, str, (aoln) null, 0), 3)), this.m);
    }

    public final void h(java.lang.String str, int i) {
        defpackage.agby.q(this.d.N(), str, i).h();
    }
}
