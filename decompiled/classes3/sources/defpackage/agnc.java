package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agnc extends defpackage.agmc implements emj, defpackage.agnn {
    private static final defpackage.agne m;
    public final amwv b;
    public final defpackage.agna c;
    public final ahyn d;
    public final defpackage.agoa e;
    public final defpackage.agom f;
    public final boolean g;
    public defpackage.agoc h;
    public defpackage.agmz i;
    public final defpackage.abtr j;
    public final defpackage.aprf l;
    private final agtj n;
    private final boolean o;
    private final boolean p;
    private final boolean q;
    private final defpackage.agnb r;
    private ajcq s;
    private boolean t;
    private final defpackage.agno u;
    private final xm v;
    public static final agab k = new agab((int[]) null);
    public static final aimz a = aimz.i("AccountControllerImpl");

    static {
        akzx akzxVarM = defpackage.agne.a.m();
        akzxVarM.u();
        defpackage.agne agneVar = (defpackage.agne) akzxVarM.b;
        agneVar.b |= 1;
        agneVar.c = -1;
        alad aladVarP = akzxVarM.p();
        aooh.e(aladVarP, "build(...)");
        m = (defpackage.agne) aladVarP;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agnc(amwv amwvVar, xm xmVar, defpackage.agna agnaVar, ahyn ahynVar, defpackage.agoa agoaVar, agtj agtjVar, apjb apjbVar, defpackage.agom agomVar, defpackage.abtr abtrVar, defpackage.agno agnoVar, ahyn ahynVar2, ahyn ahynVar3) {
        super(null);
        aooh.f(amwvVar, "screenHost");
        aooh.f(xmVar, "injectionChecker");
        aooh.f(agoaVar, "accountState");
        aooh.f(apjbVar, "uiCallbacksHandler");
        aooh.f(agomVar, "keepStateCallbacksHandler");
        aooh.f(abtrVar, "accountUiService");
        aooh.f(agnoVar, "requirementManager");
        aooh.f(ahynVar2, "disabledForMigration");
        this.b = amwvVar;
        this.v = xmVar;
        this.c = agnaVar;
        this.d = ahynVar;
        this.e = agoaVar;
        this.n = agtjVar;
        this.f = agomVar;
        this.j = abtrVar;
        this.u = agnoVar;
        this.l = new defpackage.aprf(this, (byte[]) null);
        this.r = new defpackage.agnb(this);
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        this.o = ((java.lang.Boolean) ahynVar2.d(bool)).booleanValue();
        this.p = ((java.lang.Boolean) ((ahys) ahynVar3).a).booleanValue();
        bool.booleanValue();
        this.g = true;
        bool.booleanValue();
        this.q = true;
        bool.booleanValue();
        java.lang.Object obj = agoaVar.b;
        if (obj != null && !aooh.n(obj, this)) {
            throw new java.lang.IllegalStateException("Check failed.");
        }
        agoaVar.b = this;
        amwvVar.P().c(new ahrs(this));
        agnaVar.d(new defpackage.uoh(this, 3), new defpackage.uoh(this, 4));
    }

    public static final void aK(defpackage.agne agneVar) {
        if ((agneVar.b & 32) == 0) {
            throw new java.lang.IllegalStateException("Check failed.");
        }
        if (agneVar.h <= 0) {
            throw new java.lang.IllegalStateException("Check failed.");
        }
        int iAM = a.aM(agneVar.e);
        if (iAM == 0) {
            iAM = 1;
        }
        int i = iAM - 1;
        if (i == 1 || i == 2) {
            if ((agneVar.b & 2) != 0) {
                throw new java.lang.IllegalStateException("Check failed.");
            }
            if (agneVar.f.size() <= 0) {
                throw new java.lang.IllegalStateException("Check failed.");
            }
            int i2 = agneVar.b;
            if ((i2 & 8) != 0) {
                throw new java.lang.IllegalStateException("Check failed.");
            }
            if (agneVar.i) {
                throw new java.lang.IllegalStateException("Check failed.");
            }
            if ((i2 & 64) != 0) {
                throw new java.lang.IllegalStateException("Check failed.");
            }
            return;
        }
        if (i == 3) {
            if ((agneVar.b & 2) == 0) {
                throw new java.lang.IllegalStateException("Check failed.");
            }
            if (agneVar.f.size() != 0) {
                throw new java.lang.IllegalStateException("Check failed.");
            }
            int i3 = agneVar.b;
            if ((i3 & 8) == 0) {
                throw new java.lang.IllegalStateException("Check failed.");
            }
            if (agneVar.i) {
                throw new java.lang.IllegalStateException("Check failed.");
            }
            if ((i3 & 64) != 0) {
                throw new java.lang.IllegalStateException("Check failed.");
            }
            return;
        }
        if (i == 4) {
            if ((agneVar.b & 2) == 0) {
                throw new java.lang.IllegalStateException("Check failed.");
            }
            if (agneVar.f.size() != 0) {
                throw new java.lang.IllegalStateException("Check failed.");
            }
            int i4 = agneVar.b;
            if ((i4 & 8) != 0) {
                throw new java.lang.IllegalStateException("Check failed.");
            }
            if (agneVar.i) {
                throw new java.lang.IllegalStateException("Check failed.");
            }
            if ((i4 & 64) != 0) {
                throw new java.lang.IllegalStateException("Check failed.");
            }
            return;
        }
        if (i != 5) {
            throw new java.lang.IllegalArgumentException("AccountControllerOperation.type is of value UNKNOWN - the proto might be skewed during the parcel/unparcel process.");
        }
        if ((agneVar.b & 2) != 0) {
            throw new java.lang.IllegalStateException("Check failed.");
        }
        if (agneVar.f.size() <= 0) {
            throw new java.lang.IllegalStateException("Check failed.");
        }
        int i5 = agneVar.b;
        if ((i5 & 8) != 0) {
            throw new java.lang.IllegalStateException("Check failed.");
        }
        if (!agneVar.i) {
            throw new java.lang.IllegalStateException("Check failed.");
        }
        if ((i5 & 64) == 0) {
            throw new java.lang.IllegalStateException("Check failed.");
        }
    }

    public static final agnf aL(android.content.Intent intent) {
        return (agnf) dvh.c(intent, "account_error", agnf.class);
    }

    public final void a(emx emxVar) {
        java.lang.String str;
        java.lang.String strConcat;
        amwv amwvVar = this.b;
        aooh.f(amwvVar, "host");
        xm xmVar = this.v;
        int iD = amwvVar.d();
        int i = xmVar.a;
        if (i == 0) {
            xmVar.a = iD;
        } else if (iD != i) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed to use AccountController in ");
            sb.append(amwvVar);
            sb.append(". AccountController cannot be injected into both an Activity and a screen Fragment in the same hierarchy. Previously injected in ");
            if (i != 1) {
                str = i != 2 ? "FRAGMENT" : "FRAGMENT_HOST";
            } else {
                str = "ACTIVITY";
            }
            sb.append((java.lang.Object) str);
            throw new java.lang.IllegalStateException(sb.toString());
        }
        defpackage.agmz agmzVar = (defpackage.agmz) new eog(amwvVar).a(defpackage.agmz.class);
        this.i = agmzVar;
        if (agmzVar == null) {
            aooh.j("viewModel");
            agmzVar = null;
        }
        agmzVar.d.c = this.o;
        if (this.h == null) {
            aift aiftVar = new aift(4);
            aiftVar.i(defpackage.agra.class);
            this.h = new defpackage.agoc(aiftVar.h());
        }
        if (this.c.a().hasExtra("$tiktok$for_requirement_activity")) {
            defpackage.agoc agocVar = this.h;
            if (agocVar == null) {
                aooh.j("config");
                agocVar = null;
            }
            aify aifyVar = agocVar.c;
            defpackage.abtr abtrVar = this.j;
            defpackage.agoc agocVar2 = this.h;
            if (agocVar2 == null) {
                aooh.j("config");
                agocVar2 = null;
            }
            aify aifyVar2 = agocVar2.c;
            aify aifyVarG = abtrVar.g();
            if (aifyVarG.isEmpty()) {
                strConcat = "";
            } else {
                java.util.Objects.toString(aifyVarG);
                strConcat = " Requirements: ".concat(java.lang.String.valueOf(aifyVarG));
            }
            java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("Requirement activity's AccountController should be set up with an empty list of account requirements. Did you forget to set the AccountController with Config.forRequirementActivity?".concat(strConcat));
            if (!this.p) {
                throw illegalStateException;
            }
            a.c().k(illegalStateException).l("com/google/apps/tiktok/account/api/controller/AccountControllerImpl", "onCreate", 212, "AccountControllerImpl.kt").v("The requirement activity bit is set while the requirements are not overridden with an empty list. If the activity is not a requirement Activity, then it's likely the app is started by another malicious app which sets the requirement activity bit in the Intent");
        }
        defpackage.agmz agmzVar2 = this.i;
        if (agmzVar2 == null) {
            aooh.j("viewModel");
            agmzVar2 = null;
        }
        if (agmzVar2.d.a()) {
            defpackage.agmz agmzVar3 = this.i;
            if (agmzVar3 == null) {
                aooh.j("viewModel");
                agmzVar3 = null;
            }
            agmzVar3.b(m);
            ahoq ahoqVarW = ahvr.W(1276, "AccountController getInitialAccount");
            try {
                com.google.apps.tiktok.account.api.AccountOperationContext accountOperationContext = new com.google.apps.tiktok.account.api.AccountOperationContext();
                if (this.h == null) {
                    aooh.j("config");
                }
                defpackage.agoc agocVar3 = this.h;
                if (agocVar3 == null) {
                    aooh.j("config");
                    agocVar3 = null;
                }
                aify aifyVar3 = agocVar3.b;
                aooh.c(aifyVar3);
                ajcq ajcqVarAC = aC(aifyVar3, accountOperationContext, false);
                ahoqVarW.a(ajcqVarAC);
                ajsz.ak(ahoqVarW, (java.lang.Throwable) null);
                this.s = ajcqVarAC;
            } catch (java.lang.Throwable th) {
                try {
                    throw th;
                } catch (java.lang.Throwable th2) {
                    ajsz.ak(ahoqVarW, th);
                    throw th2;
                }
            }
        }
        this.n.h(this.r);
        defpackage.agno agnoVar = this.u;
        afec.c();
        java.util.List list = agnoVar.d;
        synchronized (list) {
            list.add(this);
        }
    }

    public final ajcq aC(aify aifyVar, com.google.apps.tiktok.account.api.AccountOperationContext accountOperationContext, boolean z) {
        defpackage.agna agnaVar = this.c;
        defpackage.agns agnsVar = new defpackage.agns(agnaVar.a());
        defpackage.agoc agocVar = null;
        if (!z) {
            defpackage.agmz agmzVar = this.i;
            if (agmzVar == null) {
                aooh.j("viewModel");
                agmzVar = null;
            }
            agmzVar.c = false;
        }
        defpackage.abtr abtrVar = this.j;
        ajcq ajcqVarF = abtrVar.f(agnsVar, aifyVar, accountOperationContext);
        defpackage.agoc agocVar2 = this.h;
        if (agocVar2 == null) {
            aooh.j("config");
        } else {
            agocVar = agocVar2;
        }
        android.content.Intent intentA = agnaVar.a();
        aify aifyVar2 = agocVar.c;
        return ajan.g(ajcqVarF, ahqx.c(new defpackage.aczq((java.lang.Object) abtrVar, (java.lang.Object) intentA, (java.lang.Object) ajcqVarF, 18, (byte[]) null)), ajbm.a);
    }

    @Override // defpackage.agnn
    public final ajcq aD() {
        defpackage.agmz agmzVar = this.i;
        if (agmzVar == null) {
            aooh.j("viewModel");
            agmzVar = null;
        }
        agmzVar.c = true;
        defpackage.agmz agmzVar2 = this.i;
        if (agmzVar2 == null) {
            aooh.j("viewModel");
            agmzVar2 = null;
        }
        if (!agmzVar2.b) {
            defpackage.agna agnaVar = this.c;
            if (!agnaVar.g() && !agnaVar.f()) {
                return aE(0);
            }
        }
        return aiql.z((java.lang.Object) null);
    }

    public final ajcq aE(int i) {
        ajcq ajcqVarZ;
        defpackage.agmz agmzVar = this.i;
        if (agmzVar == null) {
            aooh.j("viewModel");
            agmzVar = null;
        }
        if (!agmzVar.c) {
            return aiql.z((java.lang.Object) null);
        }
        defpackage.agmz agmzVar2 = this.i;
        if (agmzVar2 == null) {
            aooh.j("viewModel");
            agmzVar2 = null;
        }
        agmzVar2.c = false;
        ahoq ahoqVarW = ahvr.W(1277, "Revalidate Account");
        try {
            int iG = this.e.g();
            if (iG == -1) {
                ajcqVarZ = aiql.z((java.lang.Object) null);
            } else {
                com.google.apps.tiktok.account.AccountId accountIdB = com.google.apps.tiktok.account.AccountId.b(iG);
                defpackage.abtr abtrVar = this.j;
                defpackage.agoc agocVar = this.h;
                if (agocVar == null) {
                    aooh.j("config");
                    agocVar = null;
                }
                aify aifyVar = agocVar.c;
                ajcq ajcqVarH = abtrVar.h(accountIdB, this.c.a(), new com.google.apps.tiktok.account.api.AccountOperationContext());
                ahwt ahwtVar = ahwt.a;
                ahoqVarW.a(ajcqVarH);
                aN(5, accountIdB, ahwtVar, ahwtVar, false, ahwtVar, ajcqVarH, i);
                ajcqVarZ = ajcqVarH;
            }
            ajsz.ak(ahoqVarW, (java.lang.Throwable) null);
            return ajcqVarZ;
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                ajsz.ak(ahoqVarW, th);
                throw th2;
            }
        }
    }

    public final void aF() {
        if (this.o) {
            throw new java.lang.IllegalStateException("Attempted to use the account controller when accounts are disabled");
        }
    }

    public final void aG() {
        defpackage.agmz agmzVar = this.i;
        defpackage.agmz agmzVar2 = null;
        if (agmzVar == null) {
            aooh.j("viewModel");
            agmzVar = null;
        }
        agmzVar.b = false;
        if (this.e.m()) {
            return;
        }
        defpackage.agmz agmzVar3 = this.i;
        if (agmzVar3 == null) {
            aooh.j("viewModel");
        } else {
            agmzVar2 = agmzVar3;
        }
        agmzVar2.c = false;
    }

    public final void aH(aify aifyVar, ajcq ajcqVar, int i) {
        boolean zIsDone = ajcqVar.isDone();
        defpackage.agoa agoaVar = this.e;
        if (!zIsDone) {
            agoaVar.l();
            ahyn ahynVarH = ahyn.h(aifyVar);
            ahwt ahwtVar = ahwt.a;
            aN(2, null, ahynVarH, ahwtVar, false, ahwtVar, ajcqVar, i);
            return;
        }
        agoaVar.i();
        ahyn ahynVarG = ahyn.g(aifyVar);
        ahwt ahwtVar2 = ahwt.a;
        defpackage.agne agneVarAM = aM(2, null, ahynVarG, ahwtVar2, false, ahwtVar2, i);
        try {
            defpackage.aprf aprfVar = this.l;
            com.google.protobuf.contrib.android.ProtoParsers.InternalDontUse internalDontUse = new com.google.protobuf.contrib.android.ProtoParsers.InternalDontUse((byte[]) null, agneVarAM);
            java.lang.Object objH = aiql.H(ajcqVar);
            aooh.e(objH, "getDone(...)");
            aprfVar.j(internalDontUse, (com.google.apps.tiktok.account.api.controller.AccountActionResult) objH);
        } catch (java.util.concurrent.ExecutionException e) {
            java.util.concurrent.ExecutionException executionException = e;
            defpackage.aprf aprfVar2 = this.l;
            com.google.protobuf.contrib.android.ProtoParsers.InternalDontUse internalDontUse2 = new com.google.protobuf.contrib.android.ProtoParsers.InternalDontUse((byte[]) null, agneVarAM);
            java.lang.Throwable cause = executionException.getCause();
            if (cause != null) {
                executionException = cause;
            }
            aprfVar2.i(internalDontUse2, executionException);
        }
    }

    public final void aI() {
        defpackage.agmz agmzVar = this.i;
        if (agmzVar == null) {
            aooh.j("viewModel");
            agmzVar = null;
        }
        if (agmzVar.b) {
            return;
        }
        this.f.g();
        aE(0);
    }

    public final void aJ(com.google.apps.tiktok.account.AccountId accountId, boolean z, int i) {
        com.google.apps.tiktok.account.AccountId accountId2;
        ajcq ajcqVarH;
        ahoq ahoqVarW = ahvr.W(1279, "Switch Account");
        try {
            defpackage.agmz agmzVar = this.i;
            if (agmzVar == null) {
                aooh.j("viewModel");
                agmzVar = null;
            }
            agmzVar.c = false;
            defpackage.abtr abtrVar = this.j;
            if (z) {
                defpackage.agoc agocVar = this.h;
                if (agocVar == null) {
                    aooh.j("config");
                    agocVar = null;
                }
                aify aifyVar = agocVar.c;
                accountId2 = accountId;
                ajcqVarH = ajan.g(((adag) abtrVar.e).f(accountId), ahqx.c(new defpackage.acyj(abtrVar, accountId2, this.c.a(), new com.google.apps.tiktok.account.api.AccountOperationContext(), 16)), ajbm.a);
            } else {
                accountId2 = accountId;
                defpackage.agoc agocVar2 = this.h;
                if (agocVar2 == null) {
                    aooh.j("config");
                    agocVar2 = null;
                }
                aify aifyVar2 = agocVar2.c;
                ajcqVarH = abtrVar.h(accountId2, this.c.a(), new com.google.apps.tiktok.account.api.AccountOperationContext());
            }
            ajcq ajcqVar = ajcqVarH;
            if (!ajcqVar.isDone()) {
                int i2 = ((com.google.apps.tiktok.account.AutoValue_AccountId) accountId2).a;
                defpackage.agoa agoaVar = this.e;
                if (i2 != agoaVar.g()) {
                    agoaVar.l();
                }
            }
            ahwt ahwtVar = ahwt.a;
            ahyn ahynVarG = ahyn.g(java.lang.Boolean.valueOf(z));
            ahoqVarW.a(ajcqVar);
            aN(4, accountId2, ahwtVar, ahynVarG, false, ahwtVar, ajcqVar, i);
            ajsz.ak(ahoqVarW, (java.lang.Throwable) null);
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                ajsz.ak(ahoqVarW, th);
                throw th2;
            }
        }
    }

    public final defpackage.agne aM(int i, com.google.apps.tiktok.account.AccountId accountId, ahyn ahynVar, ahyn ahynVar2, boolean z, ahyn ahynVar3, int i2) {
        int i3;
        if (this.q) {
            afec.c();
        }
        defpackage.agmz agmzVar = this.i;
        defpackage.agmz agmzVar2 = null;
        if (agmzVar == null) {
            aooh.j("viewModel");
            agmzVar = null;
        }
        if (agmzVar.a().c == Integer.MAX_VALUE) {
            i3 = 0;
        } else {
            defpackage.agmz agmzVar3 = this.i;
            if (agmzVar3 == null) {
                aooh.j("viewModel");
                agmzVar3 = null;
            }
            i3 = agmzVar3.a().c + 1;
        }
        akzx akzxVarM = defpackage.agne.a.m();
        akzxVarM.u();
        defpackage.agne agneVar = (defpackage.agne) akzxVarM.b;
        agneVar.b |= 1;
        agneVar.c = i3;
        if (accountId != null) {
            akzxVarM.u();
            defpackage.agne agneVar2 = (defpackage.agne) akzxVarM.b;
            agneVar2.b |= 2;
            agneVar2.d = ((com.google.apps.tiktok.account.AutoValue_AccountId) accountId).a;
        }
        akzxVarM.u();
        defpackage.agne agneVar3 = (defpackage.agne) akzxVarM.b;
        agneVar3.e = i - 1;
        agneVar3.b |= 4;
        if (ahynVar.f()) {
            aify aifyVar = (aify) ahynVar.b();
            if (aifyVar.isEmpty()) {
                throw new java.lang.IllegalStateException("Check failed.");
            }
            java.util.ArrayList arrayList = new java.util.ArrayList(aifyVar.size());
            ailk ailkVarY = aifyVar.y(0);
            aooh.e(ailkVarY, "iterator(...)");
            while (ailkVarY.hasNext()) {
                java.lang.Object next = ailkVarY.next();
                aooh.e(next, "next(...)");
                java.lang.String name = ((java.lang.Class) next).getName();
                aooh.e(name, "getName(...)");
                arrayList.add(name);
            }
            akzxVarM.u();
            defpackage.agne agneVar4 = (defpackage.agne) akzxVarM.b;
            alat alatVar = agneVar4.f;
            if (!alatVar.c()) {
                agneVar4.f = alad.J(alatVar);
            }
            akyl.i(arrayList, agneVar4.f);
        }
        if (ahynVar2.f()) {
            boolean zBooleanValue = ((java.lang.Boolean) ahynVar2.b()).booleanValue();
            akzxVarM.u();
            defpackage.agne agneVar5 = (defpackage.agne) akzxVarM.b;
            agneVar5.b |= 8;
            agneVar5.g = zBooleanValue;
        }
        akzxVarM.u();
        defpackage.agne agneVar6 = (defpackage.agne) akzxVarM.b;
        agneVar6.b |= 32;
        agneVar6.i = z;
        if (ahynVar3.f()) {
            int iA = this.f.a.a((defpackage.agok) ahynVar3.b());
            akzxVarM.u();
            defpackage.agne agneVar7 = (defpackage.agne) akzxVarM.b;
            agneVar7.b |= 64;
            agneVar7.j = iA;
        }
        akzxVarM.u();
        defpackage.agne agneVar8 = (defpackage.agne) akzxVarM.b;
        agneVar8.b |= 16;
        agneVar8.h = i2 + 1;
        defpackage.agmz agmzVar4 = this.i;
        if (agmzVar4 == null) {
            aooh.j("viewModel");
            agmzVar4 = null;
        }
        alad aladVarP = akzxVarM.p();
        aooh.e(aladVarP, "build(...)");
        agmzVar4.b((defpackage.agne) aladVarP);
        defpackage.agmz agmzVar5 = this.i;
        if (agmzVar5 == null) {
            aooh.j("viewModel");
            agmzVar5 = null;
        }
        aK(agmzVar5.a());
        defpackage.agmz agmzVar6 = this.i;
        if (agmzVar6 == null) {
            aooh.j("viewModel");
        } else {
            agmzVar2 = agmzVar6;
        }
        return agmzVar2.a();
    }

    public final void aN(int i, com.google.apps.tiktok.account.AccountId accountId, ahyn ahynVar, ahyn ahynVar2, boolean z, ahyn ahynVar3, ajcq ajcqVar, int i2) {
        defpackage.agne agneVarAM = aM(i, accountId, ahynVar, ahynVar2, z, ahynVar3, i2);
        defpackage.agmz agmzVar = this.i;
        if (agmzVar == null) {
            aooh.j("viewModel");
            agmzVar = null;
        }
        agmzVar.b = true;
        try {
            this.n.k(new defpackage.zoe((java.lang.Object) ajcqVar), new defpackage.zoe(new com.google.protobuf.contrib.android.ProtoParsers.InternalDontUse((byte[]) null, agneVarAM)), this.r);
        } catch (java.lang.IllegalStateException e) {
            throw new java.lang.IllegalStateException("Cannot switch account before Activity resumes.", e);
        }
    }

    public final void b(emx emxVar) {
        afec.c();
        java.util.List list = this.u.d;
        synchronized (list) {
            list.remove(this);
        }
        defpackage.agmz agmzVar = this.i;
        if (agmzVar == null) {
            aooh.j("viewModel");
            agmzVar = null;
        }
        defpackage.agmy agmyVar = agmzVar.d;
        agmyVar.b = ahyn.g(java.lang.Boolean.valueOf(agmyVar.c));
        agmyVar.a = null;
        agmyVar.d = 3;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    public final void e(emx emxVar) throws aois {
        if (this.t) {
            aI();
            return;
        }
        this.t = true;
        defpackage.agmz agmzVar = this.i;
        defpackage.agmz agmzVar2 = null;
        if (agmzVar == null) {
            aooh.j("viewModel");
            agmzVar = null;
        }
        boolean zA = agmzVar.d.a();
        defpackage.agoa agoaVar = this.e;
        if (!zA) {
            agoaVar.j();
            defpackage.agoh agohVar = agoaVar.h().a;
            if (agohVar instanceof defpackage.agof) {
                apjb apjbVar = agoaVar.d;
                defpackage.agof agofVar = (defpackage.agof) agohVar;
                com.google.apps.tiktok.account.AccountId.b(agofVar.a);
                apjbVar.E(agofVar.b);
            }
            aI();
        } else {
            if (agoaVar.m()) {
                throw new java.lang.IllegalArgumentException("Should not have account before initial start.");
            }
            if (this.s == null) {
                throw new java.lang.IllegalStateException("Should have had initial account fetch.");
            }
            defpackage.agmz agmzVar3 = this.i;
            if (agmzVar3 == null) {
                aooh.j("viewModel");
                agmzVar3 = null;
            }
            if (agmzVar3.a() == null) {
                throw new java.lang.IllegalStateException("Required value was null.");
            }
            defpackage.agmz agmzVar4 = this.i;
            if (agmzVar4 == null) {
                aooh.j("viewModel");
                agmzVar4 = null;
            }
            if (aooh.n(agmzVar4.a(), m)) {
                defpackage.agoc agocVar = this.h;
                if (agocVar == null) {
                    aooh.j("config");
                    agocVar = null;
                }
                aify aifyVar = agocVar.b;
                aooh.e(aifyVar, "initialSelectors(...)");
                ajcq ajcqVar = this.s;
                aooh.c(ajcqVar);
                aH(aifyVar, ajcqVar, 0);
            }
            this.s = null;
        }
        defpackage.agmz agmzVar5 = this.i;
        if (agmzVar5 == null) {
            aooh.j("viewModel");
            agmzVar5 = null;
        }
        if (agmzVar5.d.b.f()) {
            defpackage.agmz agmzVar6 = this.i;
            if (agmzVar6 == null) {
                aooh.j("viewModel");
            } else {
                agmzVar2 = agmzVar6;
            }
            if (((java.lang.Boolean) agmzVar2.d.b.b()).booleanValue() || !this.o) {
                return;
            }
            this.e.i();
        }
    }

    public final void fn(emx emxVar) {
        aI();
    }

    public final /* synthetic */ void c(emx emxVar) {
    }

    public final /* synthetic */ void f(emx emxVar) {
    }
}
