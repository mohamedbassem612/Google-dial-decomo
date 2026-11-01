package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class mnp {
    private static final defpackage.aimz g = defpackage.aimz.i("com/android/dialer/dobby/impl/DobbyImpl");
    public final defpackage.nul a;
    public final defpackage.noe b;
    public final defpackage.aoss c;
    public final defpackage.zpm d;
    public final defpackage.mti e;
    public final defpackage.aogc f;
    private final defpackage.mnl h;
    private final defpackage.mtd i;
    private final defpackage.kaw j;
    private final defpackage.kaw k;

    public mnp(android.content.Context context, defpackage.aogc aogcVar, defpackage.mti mtiVar, defpackage.kaw kawVar, defpackage.zpm zpmVar, defpackage.mnl mnlVar, defpackage.mtd mtdVar, defpackage.nul nulVar, defpackage.noe noeVar, defpackage.aoss aossVar, defpackage.kaw kawVar2) {
        if (context == null) {
            defpackage.aooh.i("appContext");
        }
        if (zpmVar == null) {
            defpackage.aooh.i("callScopes");
        }
        if (mtdVar == null) {
            defpackage.aooh.i("dobbyLatestVoteStorage");
        }
        if (aossVar == null) {
            defpackage.aooh.i("lightweightScope");
        }
        if (kawVar2 == null) {
            defpackage.aooh.i("hasAnotherActiveCallCache");
        }
        this.f = aogcVar;
        this.e = mtiVar;
        this.k = kawVar;
        this.d = zpmVar;
        this.h = mnlVar;
        this.i = mtdVar;
        this.a = nulVar;
        this.b = noeVar;
        this.c = aossVar;
        this.j = kawVar2;
    }

    public final nej a(java.lang.String str) {
        mnn mnnVar;
        j$.util.Optional optionalE = this.d.e(str);
        defpackage.aooh.e(optionalE, "get(...)");
        apqr apqrVar = (apqr) defpackage.aooh.q(optionalE);
        nej nejVarH = null;
        if (apqrVar != null && (mnnVar = (mnn) apqrVar.a(mnn.class)) != null) {
            nejVarH = mnnVar.H();
        }
        if (nejVarH == null) {
            ((defpackage.aimw) g.d().l("com/android/dialer/dobby/impl/DobbyImpl", "getDobbyLifecycleController$<anonymous>", 146, "DobbyImpl.kt")).v("callerId provided is not valid, cannot get DobbyLifecycleController.");
        }
        return nejVarH;
    }

    public final java.lang.CharSequence b(java.lang.String str) {
        defpackage.aooh.f(str, "summaryText");
        return this.k.B(str);
    }

    public final java.lang.Object c(java.lang.String str, defpackage.aoln aolnVar) {
        nej nejVarA = a(str);
        if (nejVarA == null) {
            return java.lang.Boolean.FALSE;
        }
        vk vkVarS = defpackage.mni.S(mne.a.m());
        vkVarS.J(mnd.b);
        return nejVarA.b(vkVarS.I(), aolnVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object d(defpackage.aoln aolnVar) {
        mno mnoVar;
        if (aolnVar instanceof mno) {
            mnoVar = (mno) aolnVar;
            int i = mnoVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mnoVar.c = i - Integer.MIN_VALUE;
            } else {
                mnoVar = new mno(this, aolnVar);
            }
        } else {
            mnoVar = new mno(this, aolnVar);
        }
        java.lang.Object objA = mnoVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = mnoVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(objA);
            if (this.j.r()) {
                return java.lang.Boolean.TRUE;
            }
            defpackage.mtd mtdVar = this.i;
            mnoVar.c = 1;
            objA = mtdVar.a(mnoVar);
            if (objA == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(objA);
        }
        mta mtaVar = (mta) objA;
        return java.lang.Boolean.valueOf((mtaVar != null ? mtaVar.b : null) == msz.d);
    }

    public final boolean e() {
        return this.h.a() == defpackage.mnm.MODE_SUPPORTS_AUTO_AND_MANUAL_SCREENING;
    }

    public final al f(java.lang.String str, java.lang.String str2, java.lang.String str3, rmy rmyVar, j$.util.Optional optional) {
        defpackage.aooh.f(str, "normalizedNumber");
        defpackage.aooh.f(str2, "countryIso");
        defpackage.aooh.f(str3, "phoneNumberTitle");
        defpackage.aooh.f(rmyVar, "reportingLocation");
        defpackage.aooh.f(optional, "callCreationTimeMillis");
        return defpackage.mni.ai(str, str2, str3, rmyVar, (java.lang.Long) defpackage.aooh.q(optional));
    }
}
