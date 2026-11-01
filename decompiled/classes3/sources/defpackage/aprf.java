package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class aprf {
    public final /* synthetic */ java.lang.Object a;

    public aprf(defpackage.zfj zfjVar, defpackage.rai raiVar) {
        aooh.f(raiVar, "statusDrivenPrimesTimerTimingMetricFactory");
        this.a = new zfk(zfjVar, (defpackage.rai) ((hil) raiVar.a).a.yI.a());
    }

    public static /* synthetic */ void w(defpackage.aprf aprfVar, afjj afjjVar) {
        afjh afjhVar = (afjh) aprfVar.a;
        if (afjhVar.c.c(afjjVar.a) != null) {
            afjhVar.d.a();
        }
    }

    private final void x(defpackage.agne agneVar, agnf agnfVar) {
        int iIntValue;
        java.lang.Class<?> cls;
        aw awVarA;
        java.lang.Object obj = this.a;
        defpackage.agnc agncVar = (defpackage.agnc) obj;
        if (!agncVar.g) {
            if (agneVar.i) {
                agncVar.f.h();
                return;
            } else {
                agncVar.e.k(agnfVar);
                return;
            }
        }
        agab agabVar = defpackage.agnc.k;
        ahor ahorVarCq = ahvr.cq(agabVar);
        if (ahorVarCq.b()) {
            java.lang.Object objA = ahorVarCq.a();
            aooh.e(objA, "get(...)");
            iIntValue = ((java.lang.Number) objA).intValue();
        } else {
            iIntValue = 0;
        }
        int i = iIntValue + 1;
        if (i > 10) {
            ahyn ahynVar = agncVar.d;
            if (ahynVar.f()) {
                cls = ahynVar.b().getClass();
            } else {
                amwv amwvVar = agncVar.b;
                int iD = amwvVar.d() - 1;
                if (iD != 0) {
                    awVarA = iD != 1 ? amwvVar.b() : amwvVar.e();
                } else {
                    awVarA = amwvVar.a();
                }
                cls = awVarA.getClass();
            }
            defpackage.agnc.a.c().l("com/google/apps/tiktok/account/api/controller/AccountControllerImpl$HandleAccountAction", "fallbackOrSetErrorDetectingInfiniteLoop", 1232, "AccountControllerImpl.kt").y("A highly probable infinite loop detected in host: %s", new aepg(cls));
            throw new java.lang.IllegalStateException("Account error triggered too many times in the same call chain, the app is likely trapped in an infinite loop. This is likely an app bug where the onNoAccountAvailable method is triggering the account error again. Please check the preceding log in logcat to see which host is causing the problem.", ahrc.c());
        }
        ahou ahouVarB = ahou.b();
        ahouVarB.a(agabVar, java.lang.Integer.valueOf(i));
        ahoq ahoqVarX = ahvr.X(1274, "AccountController account error", ahouVarB.f(), true);
        try {
            if (agneVar.i) {
                ((defpackage.agnc) obj).f.h();
            } else {
                ((defpackage.agnc) obj).e.k(agnfVar);
            }
            ajsz.ak(ahoqVarX, (java.lang.Throwable) null);
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                ajsz.ak(ahoqVarX, th);
                throw th2;
            }
        }
    }

    public final void a() {
        anvb anvbVar = (anvb) this.a;
        if (anvbVar.c.decrementAndGet() == 0) {
            anvbVar.e();
        }
    }

    public final void b(amax amaxVar) {
        alje aljeVar = (alje) this.a;
        amgv amgvVar = aljeVar.h;
        int iA = aljeVar.b.a();
        akzx akzxVarM = altn.a.m();
        akzxVarM.u();
        altn altnVar = akzxVarM.b;
        j$.util.Objects.requireNonNull(amaxVar);
        altnVar.c = amaxVar;
        altnVar.b = 10;
        amgvVar.h(akzxVarM, j$.time.Duration.ofMillis(iA));
    }

    public final void c(amaz amazVar) {
        alje aljeVar = (alje) this.a;
        aljg aljgVar = aljeVar.b;
        amgv amgvVar = aljeVar.h;
        int iA = aljgVar.a();
        altn altnVar = altn.a;
        akzx akzxVarM = altnVar.m();
        akzxVarM.u();
        altn altnVar2 = akzxVarM.b;
        j$.util.Objects.requireNonNull(amazVar);
        altnVar2.c = amazVar;
        altnVar2.b = 4;
        amgvVar.h(akzxVarM, j$.time.Duration.ofMillis(iA));
        alud aludVar = aljeVar.d;
        alzx alzxVarB = aludVar.b(amazVar);
        amgv amgvVar2 = aljeVar.h;
        java.lang.String strName = alzxVarB.name();
        int iA2 = aljgVar.a();
        akzx akzxVarM2 = altnVar.m();
        akzxVarM2.u();
        altn altnVar3 = akzxVarM2.b;
        j$.util.Objects.requireNonNull(strName);
        altnVar3.b = 13;
        altnVar3.c = strName;
        amgvVar2.h(akzxVarM2, j$.time.Duration.ofMillis(iA2));
        aludVar.c(alzxVarB);
    }

    public final void d(aljk aljkVar) {
        ((alje) this.a).d.f(aljkVar);
    }

    public final void e(java.lang.Object obj) {
        ((dsc) this.a).f(obj);
    }

    public final void f(java.lang.Throwable th) {
        ((dsc) this.a).g(th);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.concurrent.Callable] */
    public final java.lang.Object g() {
        return this.a.call();
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.Map] */
    public final java.util.List h() {
        java.util.Collection collectionValues = ((ahbq) this.a).b.values();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            akzc akzcVarD = ((ahce) it.next()).d();
            if (akzcVarD != null) {
                arrayList.add(akzcVarD);
            }
        }
        java.util.Comparator comparator = akzc.e;
        aooh.e(comparator, "unsignedLexicographicalComparator(...)");
        return ajsz.bX(arrayList, comparator);
    }

    public final void i(com.google.protobuf.contrib.android.ProtoParsers.ParcelableProto parcelableProto, java.lang.Throwable th) {
        ahyn ahynVarG;
        defpackage.agmz agmzVar;
        aooh.f(parcelableProto, "operationWrapper");
        albh albhVarA = parcelableProto.a(defpackage.agne.a, akzq.a());
        aooh.e(albhVarA, "getMessage(...)");
        defpackage.agne agneVar = (defpackage.agne) albhVarA;
        defpackage.agnc.aK(agneVar);
        java.lang.Object obj = this.a;
        defpackage.agnc agncVar = (defpackage.agnc) obj;
        defpackage.agmz agmzVar2 = agncVar.i;
        if (agmzVar2 == null) {
            aooh.j("viewModel");
            agmzVar2 = null;
        }
        if (aooh.n(agneVar, agmzVar2.a())) {
            agncVar.aG();
            if (th instanceof defpackage.agtp) {
                int i = agneVar.h;
                if (i < 4) {
                    int iAM = a.aM(agneVar.e);
                    if (iAM == 0) {
                        iAM = 1;
                    }
                    defpackage.agnc.a.d().k(th).l("com/google/apps/tiktok/account/api/controller/AccountControllerImpl$HandleAccountAction", "onFailure", 1083, "AccountControllerImpl.kt").M("Android killed the app process before the account operation completes.retrying the failed operation. AccountControllerOperation type enum number: %s, time(s) attempted: %s, exit reason code: %s", new defpackage.aepf(iAM - 1), new defpackage.aepb(i), new defpackage.aepb(((java.lang.Number) ((defpackage.agtp) th).a.d(-1)).intValue()));
                    int iAM2 = a.aM(agneVar.e);
                    if (iAM2 == 0) {
                        iAM2 = 1;
                    }
                    aift aiftVar = new aift(4);
                    if (iAM2 == 2 || iAM2 == 3 || iAM2 == 6) {
                        alat alatVar = agneVar.f;
                        aooh.e(alatVar, "getSelectorsList(...)");
                        java.util.Iterator it = alatVar.iterator();
                        while (it.hasNext()) {
                            try {
                                aiftVar.i(java.lang.Class.forName((java.lang.String) it.next()).asSubclass(defpackage.agnt.class));
                            } catch (java.lang.ClassNotFoundException e) {
                                throw new java.lang.IllegalStateException(e);
                            }
                        }
                    }
                    ahyn ahynVar = ahwt.a;
                    if (iAM2 != 6) {
                        ahynVarG = ahynVar;
                    } else {
                        if ((agneVar.b & 64) == 0) {
                            throw new java.lang.IllegalStateException("Check failed.");
                        }
                        ahynVarG = ahyn.g(java.lang.Integer.valueOf(agneVar.j));
                    }
                    int i2 = agneVar.h;
                    int i3 = iAM2 - 1;
                    if (i3 == 1) {
                        java.lang.Object obj2 = this.a;
                        aify aifyVarH = aiftVar.h();
                        aooh.e(aifyVarH, "build(...)");
                        if (aifyVarH.isEmpty()) {
                            throw new java.lang.IllegalStateException("Check failed.");
                        }
                        ahoq ahoqVarW = ahvr.W(1280, "Switch Account With Custom Selectors");
                        try {
                            ((defpackage.agnc) obj2).aH(aifyVarH, ((defpackage.agnc) obj2).aC(aifyVarH, new com.google.apps.tiktok.account.api.AccountOperationContext(), false), i2);
                            ajsz.ak(ahoqVarW, (java.lang.Throwable) null);
                            return;
                        } catch (java.lang.Throwable th2) {
                            try {
                                throw th2;
                            } catch (java.lang.Throwable th3) {
                                ajsz.ak(ahoqVarW, th2);
                                throw th3;
                            }
                        }
                    }
                    if (i3 == 2) {
                        ahoq ahoqVarW2 = ahvr.W(1275, "Retry Switch Account Interactive with Specified Selectors");
                        try {
                            java.util.List listH = aiftVar.h();
                            aooh.e(listH, "build(...)");
                            if (listH == null) {
                                throw new java.lang.IllegalStateException("Required value was null.");
                            }
                            if (listH.isEmpty()) {
                                throw new java.lang.IllegalStateException("Check failed.");
                            }
                            ailk ailkVarY = listH.y(0);
                            aooh.e(ailkVarY, "iterator(...)");
                            while (ailkVarY.hasNext()) {
                                java.lang.Object next = ailkVarY.next();
                                aooh.e(next, "next(...)");
                                java.lang.Class cls = (java.lang.Class) next;
                                if (!defpackage.agnr.class.isAssignableFrom(cls)) {
                                    throw new java.lang.IllegalArgumentException(a.bg(cls, "selector ", " is not an interactive selector"));
                                }
                            }
                            ((defpackage.agnc) obj).aN(3, null, ahyn.g(listH), ahynVar, false, ahynVar, ((defpackage.agnc) obj).j.f(new defpackage.agns(((defpackage.agnc) obj).c.a()), listH, new com.google.apps.tiktok.account.api.AccountOperationContext()), i2);
                            ajsz.ak(ahoqVarW2, (java.lang.Throwable) null);
                            return;
                        } catch (java.lang.Throwable th4) {
                            try {
                                throw th4;
                            } catch (java.lang.Throwable th5) {
                                ajsz.ak(ahoqVarW2, th4);
                                throw th5;
                            }
                        }
                    }
                    if (i3 == 3) {
                        int i4 = agneVar.d;
                        if (i4 < 0) {
                            throw new java.lang.IllegalStateException("Check failed.");
                        }
                        agncVar.aJ(com.google.apps.tiktok.account.AccountId.b(i4), agneVar.g, i2);
                        return;
                    }
                    if (i3 == 4) {
                        defpackage.agmz agmzVar3 = agncVar.i;
                        if (agmzVar3 == null) {
                            aooh.j("viewModel");
                            agmzVar = null;
                        } else {
                            agmzVar = agmzVar3;
                        }
                        agmzVar.c = true;
                        agncVar.aE(i2);
                        return;
                    }
                    if (i3 != 5) {
                        throw new java.lang.IllegalStateException("AccountControllerOperation type is UNKNOWN. Shouldn't reach here because we already checked this field at the beginning of the method.");
                    }
                    java.lang.Object obj3 = this.a;
                    aify aifyVarH2 = aiftVar.h();
                    aooh.e(aifyVarH2, "build(...)");
                    int iIntValue = ((java.lang.Number) ahynVarG.b()).intValue();
                    defpackage.agnc agncVar2 = (defpackage.agnc) obj3;
                    defpackage.agom agomVar = agncVar2.f;
                    agti agtiVar = agomVar.a;
                    defpackage.agok agokVar = (defpackage.agok) agtiVar.b(iIntValue);
                    agncVar2.aF();
                    if (aifyVarH2.isEmpty()) {
                        throw new java.lang.IllegalStateException("Check failed.");
                    }
                    defpackage.agmz agmzVar4 = agncVar2.i;
                    if (agmzVar4 == null) {
                        aooh.j("viewModel");
                        agmzVar4 = null;
                    }
                    defpackage.agmz agmzVar5 = agncVar2.i;
                    if (agmzVar5 == null) {
                        aooh.j("viewModel");
                        agmzVar5 = null;
                    }
                    agmzVar4.c = agmzVar5.b;
                    afec.c();
                    agomVar.g();
                    agomVar.b = new defpackage.agny(agtiVar.a(agokVar), 0);
                    ahoq ahoqVarW3 = ahvr.W(1281, "Switch Account With Custom Selectors Keep State");
                    try {
                        ajcq ajcqVarAC = ((defpackage.agnc) obj3).aC(aifyVarH2, new com.google.apps.tiktok.account.api.AccountOperationContext(), true);
                        if (ajcqVarAC.isDone()) {
                            com.google.protobuf.contrib.android.ProtoParsers.ParcelableProto internalDontUse = new com.google.protobuf.contrib.android.ProtoParsers.InternalDontUse((byte[]) null, ((defpackage.agnc) obj3).aM(6, null, ahyn.g(aifyVarH2), ahwt.a, true, ahyn.g(agokVar), i2));
                            try {
                                defpackage.aprf aprfVar = ((defpackage.agnc) obj3).l;
                                java.lang.Object objH = aiql.H(ajcqVarAC);
                                aooh.e(objH, "getDone(...)");
                                aprfVar.j(internalDontUse, (com.google.apps.tiktok.account.api.controller.AccountActionResult) objH);
                            } catch (java.util.concurrent.ExecutionException e2) {
                                e = e2;
                                defpackage.aprf aprfVar2 = ((defpackage.agnc) obj3).l;
                                java.lang.Throwable cause = e.getCause();
                                if (cause != null) {
                                    e = cause;
                                }
                                aprfVar2.i(internalDontUse, e);
                            }
                        } else {
                            afec.c();
                            defpackage.agny agnyVar = agomVar.b;
                            aooh.c(agnyVar);
                            if (agnyVar.b != 1) {
                                agnyVar.b = 1;
                                ((defpackage.agok) agtiVar.b(agnyVar.a)).b();
                            }
                            ((defpackage.agnc) obj3).aN(6, null, ahyn.g(aifyVarH2), ahwt.a, true, ahyn.g(agokVar), ajcqVarAC, i2);
                        }
                        ajsz.ak(ahoqVarW3, (java.lang.Throwable) null);
                        return;
                    } catch (java.lang.Throwable th6) {
                        try {
                            throw th6;
                        } catch (java.lang.Throwable th7) {
                            ajsz.ak(ahoqVarW3, th6);
                            throw th7;
                        }
                    }
                }
                x(agneVar, new agnh(th));
            } else {
                x(agneVar, th instanceof agnf ? (agnf) th : new agnj(th));
            }
            if ((agneVar.b & 2) != 0) {
                com.google.apps.tiktok.account.AccountId accountIdB = com.google.apps.tiktok.account.AccountId.b(agneVar.d);
                if (th instanceof agnf) {
                    defpackage.agnc.a.b().k(th).l("com/google/apps/tiktok/account/api/controller/AccountControllerImpl$HandleAccountAction", "onFailure", 1108, "AccountControllerImpl.kt").y("Failed to use %s.", accountIdB);
                } else {
                    defpackage.agnc.a.c().k(th).l("com/google/apps/tiktok/account/api/controller/AccountControllerImpl$HandleAccountAction", "onFailure", 1111, "AccountControllerImpl.kt").y("Failed to use %s.", accountIdB);
                }
            }
            ((defpackage.agnc) this.a).aI();
        }
    }

    public final void j(com.google.protobuf.contrib.android.ProtoParsers.ParcelableProto parcelableProto, com.google.apps.tiktok.account.api.controller.AccountActionResult accountActionResult) {
        com.google.apps.tiktok.account.AccountId accountIdB;
        aooh.f(parcelableProto, "operationWrapper");
        aooh.f(accountActionResult, "result");
        albh albhVarA = parcelableProto.a(defpackage.agne.a, akzq.a());
        aooh.e(albhVarA, "getMessage(...)");
        defpackage.agne agneVar = (defpackage.agne) albhVarA;
        defpackage.agnc.aK(agneVar);
        defpackage.agnc agncVar = (defpackage.agnc) this.a;
        defpackage.agmz agmzVar = agncVar.i;
        defpackage.agoc agocVar = null;
        if (agmzVar == null) {
            aooh.j("viewModel");
            agmzVar = null;
        }
        if (aooh.n(agneVar, agmzVar.a())) {
            if ((agneVar.b & 2) != 0) {
                com.google.apps.tiktok.account.AccountId accountId = accountActionResult.a;
                aooh.c(accountId);
                int iA = accountId.a();
                int i = agneVar.d;
                if (iA != i) {
                    throw new java.lang.IllegalStateException("Check failed.");
                }
                accountIdB = com.google.apps.tiktok.account.AccountId.b(i);
            } else {
                if (accountActionResult.d != null) {
                    defpackage.agnc agncVar2 = (defpackage.agnc) this.a;
                    defpackage.agoa agoaVar = agncVar2.e;
                    if (!agoaVar.m()) {
                        agoaVar.l();
                    }
                    android.content.Intent intent = accountActionResult.d;
                    aooh.c(intent);
                    if (agoaVar.m()) {
                        defpackage.agnm.a(intent, com.google.apps.tiktok.account.AccountId.b(agoaVar.g()));
                    }
                    agncVar2.c.c().b(intent);
                    agncVar2.f.g();
                    return;
                }
                if (accountActionResult.c == null) {
                    x(agneVar, new defpackage.agnk());
                    defpackage.agnc agncVar3 = (defpackage.agnc) this.a;
                    agncVar3.aG();
                    agncVar3.aI();
                    return;
                }
                accountIdB = accountActionResult.a;
            }
            com.google.apps.tiktok.account.api.controller.ValidationResult validationResult = accountActionResult.c;
            if (validationResult == null) {
                throw new java.lang.IllegalStateException("Required value was null.");
            }
            com.google.apps.tiktok.account.api.AccountOperationContext accountOperationContext = accountActionResult.e;
            if (validationResult.c()) {
                defpackage.agoa agoaVar2 = agncVar.e;
                com.google.apps.tiktok.account.AccountId accountId2 = accountActionResult.a;
                aooh.c(accountId2);
                agoq agoqVar = accountActionResult.b;
                aooh.e(agoqVar, "getAccountInfo(...)");
                aooh.c(accountOperationContext);
                aooh.f(accountId2, "newAccountId");
                aooh.f(agoqVar, "newAccountInfo");
                aooh.f(accountOperationContext, "accountOperationContext");
                if (android.util.Log.isLoggable("ActivityAccountState", 3)) {
                    java.util.Objects.toString(accountId2);
                    android.util.Log.d("ActivityAccountState", "Switch To Account: ".concat(java.lang.String.valueOf(accountId2)));
                }
                if (agoaVar2.n(new defpackage.agof(accountId2.a(), agoqVar))) {
                    apjb apjbVar = agoaVar2.d;
                    apjbVar.F(agoqVar);
                    ahvr.bY(agoqVar != null);
                    ahvr.bY(!agoqVar.equals(agoq.a));
                    ahvr.bY((agoqVar.b & 256) != 0);
                    ahoq ahoqVarW = ahvr.W(1288, "onAccountReady");
                    try {
                        java.lang.String str = agoqVar.j;
                        xtq xtqVar = new xtq(new xtq(accountId2));
                        ailj ailjVarK = ((aile) apjbVar.a).k();
                        while (ailjVarK.hasNext()) {
                            ((defpackage.agnu) ailjVarK.next()).d(xtqVar);
                        }
                        java.util.Iterator it = ((java.util.ArrayList) apjbVar.b).iterator();
                        while (it.hasNext()) {
                            ((defpackage.agnu) it.next()).d(xtqVar);
                        }
                        ahoqVarW.close();
                        agoaVar2.j();
                        agoaVar2.d.E(agoqVar);
                    } catch (java.lang.Throwable th) {
                        try {
                            ahoqVarW.close();
                        } catch (java.lang.Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                ((defpackage.agnc) this.a).aG();
            } else {
                defpackage.agnc agncVar4 = (defpackage.agnc) this.a;
                defpackage.agna agnaVar = agncVar4.c;
                if (!agnaVar.e()) {
                    agncVar4.aG();
                    agni agniVar = new agni();
                    x(agneVar, agniVar);
                    defpackage.agnc.a.b().k(agniVar).l("com/google/apps/tiktok/account/api/controller/AccountControllerImpl$HandleAccountAction", "onSuccess", 1037, "AccountControllerImpl.kt").y("Account with id %s does not fulfill all the requirements.", accountIdB);
                    agncVar4.aI();
                    return;
                }
                if (validationResult.b()) {
                    agncVar4.e.l();
                }
                android.content.Intent intentA = validationResult.a();
                aooh.c(intentA);
                defpackage.agnm.a(intentA, accountIdB);
                intentA.putExtra("$tiktok$for_requirement_activity", true);
                defpackage.agoc agocVar2 = agncVar4.h;
                if (agocVar2 == null) {
                    aooh.j("config");
                } else {
                    agocVar = agocVar2;
                }
                boolean z = agocVar.a;
                intentA.putExtra("$tiktok$canRestartAccountSelector", false);
                intentA.addFlags(65536);
                agnaVar.b().b(intentA);
            }
            ((defpackage.agnc) this.a).aI();
        }
    }

    public final void k(com.google.android.material.textfield.TextInputLayout textInputLayout) {
        defpackage.agdf agdfVar = (defpackage.agdf) this.a;
        android.widget.EditText editText = agdfVar.j;
        if (editText != textInputLayout.c) {
            if (editText != null) {
                editText.removeTextChangedListener(agdfVar.k);
                if (agdfVar.j.getOnFocusChangeListener() == agdfVar.c().d()) {
                    agdfVar.j.setOnFocusChangeListener(null);
                }
            }
            agdfVar.j = textInputLayout.c;
            android.widget.EditText editText2 = agdfVar.j;
            if (editText2 != null) {
                editText2.addTextChangedListener(agdfVar.k);
            }
            agdfVar.c().g(agdfVar.j);
            agdfVar.o(agdfVar.c());
        }
    }

    public final void l(android.view.View view) {
        if (view.getParent() != null) {
            view.setVisibility(8);
        }
        ((defpackage.agbv) this.a).e(0);
    }

    public final defpackage.afok m(android.accounts.Account account, int i, java.lang.String str, int i2, int i3) {
        hjq hjqVar = (hjq) this.a;
        aolr aolrVar = (aolr) hjqVar.a.bY.a();
        hkt hktVar = hjqVar.b;
        return new defpackage.afok(aolrVar, hktVar.d(), hktVar.e(), hktVar.c(), (defpackage.rai) hktVar.m.a(), account, i, str, i2, i3);
    }

    public final void n() {
        afjh.a();
        long epochMilli = j$.time.Instant.now().toEpochMilli();
        afjh afjhVar = (afjh) this.a;
        afjhVar.i = epochMilli;
        if (afjhVar.l != null) {
            gus.ag(afjhVar.d.a());
        }
        java.lang.String strB = afjhVar.d.b();
        if (strB != null) {
            afjhVar.c.b(strB);
        }
    }

    public final void o(afjj afjjVar) {
        defpackage.afjk afjkVar = afjjVar.b;
        defpackage.afjk afjkVar2 = defpackage.afjk.a;
        if (!afjkVar.equals(afjkVar2)) {
            afjh.a();
        }
        java.lang.Object obj = this.a;
        java.lang.String str = afjjVar.a;
        afjh afjhVar = (afjh) obj;
        afji afjiVar = afjhVar.c;
        gus gusVarC = afjiVar.c(str);
        com.google.android.libraries.surveys.internal.model.SurveyDataImpl surveyDataImplA = afjiVar.a(str);
        if (afjkVar != afjkVar2) {
            afjhVar.i = j$.time.Instant.now().toEpochMilli();
        }
        if (gusVarC != null && surveyDataImplA != null) {
            gus.ag(surveyDataImplA.a());
        }
        afjiVar.b(str);
    }

    public final void p() {
        afjh.b();
        afjh afjhVar = (afjh) this.a;
        if (afjhVar.l != null) {
            gus.ah(afjhVar.d.a());
        }
    }

    public final void q(afjj afjjVar) {
        if (!afjjVar.b.equals(defpackage.afjk.a)) {
            afjh.b();
        }
        java.lang.Object obj = this.a;
        java.lang.String str = afjjVar.a;
        afji afjiVar = ((afjh) obj).c;
        gus gusVarC = afjiVar.c(str);
        com.google.android.libraries.surveys.internal.model.SurveyDataImpl surveyDataImplA = afjiVar.a(str);
        if (gusVarC == null || surveyDataImplA == null) {
            return;
        }
        gus.ah(surveyDataImplA.a());
    }

    public final void r(afjj afjjVar) {
        afjh afjhVar = (afjh) this.a;
        if (afjhVar.c.c(afjjVar.a) != null) {
            afjhVar.d.a();
        }
    }

    public final int s(int i) {
        return ((defpackage.aehs) this.a).a.e(i);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    public final void t(zfl zflVar) throws aois {
        zfk zfkVar = (zfk) this.a;
        zfl zflVar2 = zfkVar.a;
        if (zflVar2.e) {
            throw new java.lang.IllegalStateException("Invalid state transition; the status is already terminal.");
        }
        if (zflVar.f <= zflVar2.f) {
            throw new java.lang.IllegalStateException("Invalid state transition from " + zflVar2.name() + " -> " + zflVar.name());
        }
        int iOrdinal = zflVar.ordinal();
        if (iOrdinal == 0) {
            throw new java.lang.IllegalStateException("Impossible state transition");
        }
        if (iOrdinal == 1) {
            defpackage.aljb aljbVar = zfkVar.b;
            aljbVar.c = ((aeuo) aljbVar.a).a();
        } else if (iOrdinal == 2) {
            defpackage.aljb aljbVar2 = zfkVar.b;
            java.lang.Object obj = aljbVar2.c;
            if (obj != null) {
                ((aeuo) aljbVar2.a).d((aeun) obj, aenj.c((java.lang.String) null, (java.lang.Enum) aljbVar2.b), 2);
            }
        } else {
            if (iOrdinal != 3) {
                throw new aois();
            }
            defpackage.aljb aljbVar3 = zfkVar.b;
            java.lang.Object obj2 = aljbVar3.c;
            if (obj2 != null) {
                ((aeuo) aljbVar3.a).d((aeun) obj2, aenj.c((java.lang.String) null, (java.lang.Enum) aljbVar3.b), 3);
            }
        }
        zfkVar.a = zflVar;
    }

    public final int u() {
        vbu vbuVar = (vbu) this.a;
        if ((vbuVar.b & 1) != 0) {
            return vbuVar.c;
        }
        return 0;
    }

    public final java.lang.String v() {
        vbu vbuVar = (vbu) this.a;
        return (vbuVar.b & 8) != 0 ? vbuVar.h : "//VVM";
    }

    public /* synthetic */ aprf(java.lang.Object obj) {
        this.a = obj;
    }

    public aprf(java.lang.Object obj, byte[] bArr) {
        this.a = obj;
    }

    public aprf(defpackage.afrk afrkVar) {
        j$.util.Objects.requireNonNull(afrkVar);
        this.a = afrkVar;
    }

    public aprf(hjq hjqVar) {
        j$.util.Objects.requireNonNull(hjqVar);
        this.a = hjqVar;
    }

    public aprf() {
        throw null;
    }

    public aprf(aaeo aaeoVar) {
        j$.util.Objects.requireNonNull(aaeoVar);
        this.a = aaeoVar;
    }

    public aprf(com.google.android.material.chip.ChipGroup chipGroup) {
        j$.util.Objects.requireNonNull(chipGroup);
        this.a = chipGroup;
    }

    public aprf(defpackage.aaky aakyVar) {
        j$.util.Objects.requireNonNull(aakyVar);
        this.a = aakyVar;
    }

    public aprf(defpackage.aftx aftxVar) {
        j$.util.Objects.requireNonNull(aftxVar);
        this.a = aftxVar;
    }

    public aprf(defpackage.aawl aawlVar) {
        j$.util.Objects.requireNonNull(aawlVar);
        this.a = aawlVar;
    }

    public aprf(defpackage.afua afuaVar) {
        j$.util.Objects.requireNonNull(afuaVar);
        this.a = afuaVar;
    }

    public aprf(defpackage.acmz acmzVar) {
        j$.util.Objects.requireNonNull(acmzVar);
        this.a = acmzVar;
    }

    public aprf(defpackage.agbv agbvVar, byte[] bArr) {
        j$.util.Objects.requireNonNull(agbvVar);
        this.a = agbvVar;
    }

    public aprf(afjh afjhVar) {
        j$.util.Objects.requireNonNull(afjhVar);
        this.a = afjhVar;
    }

    public aprf(defpackage.agbv agbvVar) {
        j$.util.Objects.requireNonNull(agbvVar);
        this.a = agbvVar;
    }

    public aprf(defpackage.agdf agdfVar) {
        j$.util.Objects.requireNonNull(agdfVar);
        this.a = agdfVar;
    }

    public aprf(aiaw aiawVar, java.util.concurrent.Callable callable) {
        this.a = callable;
        j$.util.Objects.requireNonNull(aiawVar);
    }

    public aprf(defpackage.ajuq ajuqVar) {
        j$.util.Objects.requireNonNull(ajuqVar);
        this.a = ajuqVar;
    }

    public aprf(defpackage.ajxd ajxdVar) {
        j$.util.Objects.requireNonNull(ajxdVar);
        this.a = ajxdVar;
    }

    public aprf(alje aljeVar) {
        j$.util.Objects.requireNonNull(aljeVar);
        this.a = aljeVar;
    }

    public aprf(anrx anrxVar) {
        j$.util.Objects.requireNonNull(anrxVar);
        this.a = anrxVar;
    }

    public aprf(anvb anvbVar) {
        j$.util.Objects.requireNonNull(anvbVar);
        this.a = anvbVar;
    }

    public aprf(defpackage.vqf vqfVar) {
        j$.util.Objects.requireNonNull(vqfVar);
        this.a = vqfVar;
    }
}
