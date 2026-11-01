package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class rzr extends aomh implements aonn {
    java.lang.Object a;
    java.lang.Object b;
    java.lang.Object c;
    int d;
    final /* synthetic */ defpackage.rzs e;
    final /* synthetic */ android.accounts.Account f;
    final /* synthetic */ defpackage.abxt g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rzr(defpackage.rzs rzsVar, android.accounts.Account account, defpackage.abxt abxtVar, aoln aolnVar) {
        super(2, aolnVar);
        this.e = rzsVar;
        this.f = account;
        this.g = abxtVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0147  */
    /* JADX WARN: Code duplicated, block: B:45:0x014e A[Catch: all -> 0x0182, TryCatch #0 {all -> 0x0182, blocks: (B:43:0x014a, B:45:0x014e, B:46:0x017d), top: B:64:0x014a, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x01af A[Catch: Exception -> 0x01dc, TryCatch #1 {Exception -> 0x01dc, blocks: (B:7:0x000f, B:58:0x01cc, B:8:0x0014, B:54:0x019f, B:56:0x01af, B:59:0x01d4, B:11:0x001f, B:39:0x010f, B:42:0x0149, B:49:0x0181, B:52:0x0184, B:12:0x0024, B:17:0x0048, B:19:0x006f, B:21:0x0075, B:22:0x0077, B:23:0x008e, B:25:0x0093, B:27:0x0099, B:28:0x009b, B:29:0x00b2, B:31:0x00de, B:32:0x00e0, B:34:0x00e4, B:36:0x00eb, B:35:0x00e9, B:15:0x002b, B:43:0x014a, B:45:0x014e, B:46:0x017d), top: B:66:0x0007, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x01d4 A[Catch: Exception -> 0x01dc, TRY_LEAVE, TryCatch #1 {Exception -> 0x01dc, blocks: (B:7:0x000f, B:58:0x01cc, B:8:0x0014, B:54:0x019f, B:56:0x01af, B:59:0x01d4, B:11:0x001f, B:39:0x010f, B:42:0x0149, B:49:0x0181, B:52:0x0184, B:12:0x0024, B:17:0x0048, B:19:0x006f, B:21:0x0075, B:22:0x0077, B:23:0x008e, B:25:0x0093, B:27:0x0099, B:28:0x009b, B:29:0x00b2, B:31:0x00de, B:32:0x00e0, B:34:0x00e4, B:36:0x00eb, B:35:0x00e9, B:15:0x002b, B:43:0x014a, B:45:0x014e, B:46:0x017d), top: B:66:0x0007, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x014a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:? A[RETURN, SYNTHETIC] */
    public final java.lang.Object b(java.lang.Object obj) {
        java.lang.Object obj2;
        java.lang.Object obj3;
        java.lang.Object obj4;
        anpk anpkVar;
        ajcq ajcqVarA;
        anpk anpkVarA;
        defpackage.rzs rzsVar;
        aolu aoluVar = aolu.a;
        int i = this.d;
        try {
            if (i != 0) {
                if (i == 1) {
                    aooc.af(obj);
                } else if (i == 2) {
                    obj2 = this.c;
                    obj3 = this.b;
                    obj4 = this.a;
                    aooc.af(obj);
                    akzc akzcVar = (akzc) obj;
                    aooh.f(akzcVar, "value");
                    java.lang.Object obj5 = ((ajyi) obj3).a;
                    ((akzx) obj5).u();
                    defpackage.aknp aknpVar = (defpackage.aknp) ((akzx) obj5).b;
                    defpackage.aknp aknpVar2 = defpackage.aknp.a;
                    j$.util.Objects.requireNonNull(akzcVar);
                    aknpVar.c = akzcVar;
                    alad aladVarP = ((akzx) ((ajyi) obj4).a).p();
                    aooh.e(aladVarP, "build(...)");
                    defpackage.aknp aknpVar3 = (defpackage.aknp) aladVarP;
                    anmc anmcVar = ((aohh) obj2).a;
                    anpkVar = defpackage.akmr.d;
                    if (anpkVar == null) {
                        synchronized (defpackage.akmr.class) {
                            try {
                                anpkVarA = defpackage.akmr.d;
                                if (anpkVarA == null) {
                                    aal aalVarD = anpk.d();
                                    aalVarD.b = anpj.a;
                                    aalVarD.d = anpk.c("google.internal.dialer.v1.DialerCallInfoLookupService", "UpdateMyCallingCard");
                                    aalVarD.b();
                                    defpackage.aknp aknpVar4 = defpackage.aknp.a;
                                    akzq akzqVar = aohd.a;
                                    aalVarD.e = new aohc(aknpVar4);
                                    aalVarD.c = new aohc(defpackage.aknq.a);
                                    anpkVarA = aalVarD.a();
                                    defpackage.akmr.d = anpkVarA;
                                }
                            } catch (java.lang.Throwable th) {
                                throw th;
                            }
                        }
                        anpkVar = anpkVarA;
                    }
                    ajcqVarA = aohp.a(anmcVar.b(anpkVar, ((aohh) obj2).b), aknpVar3);
                    this.a = null;
                    this.b = null;
                    this.c = null;
                    this.d = 3;
                    if (aosv.D(ajcqVarA, this) == aoluVar) {
                        return aoluVar;
                    }
                    rzsVar = this.e;
                    if (!((java.lang.Boolean) rzsVar.j.a()).booleanValue()) {
                        return new defpackage.rzm(this.g);
                    }
                    sin sinVar = rzsVar.e;
                    defpackage.abxt abxtVar = this.g;
                    android.accounts.Account account = this.f;
                    java.lang.String str = account.name;
                    aooh.e(str, "name");
                    java.lang.String str2 = account.type;
                    aooh.e(str2, "type");
                    this.d = 4;
                    obj = sinVar.i(abxtVar, str, str2, this);
                    if (obj == aoluVar) {
                        return aoluVar;
                    }
                } else if (i != 3) {
                    aooc.af(obj);
                } else {
                    aooc.af(obj);
                    rzsVar = this.e;
                    if (!((java.lang.Boolean) rzsVar.j.a()).booleanValue()) {
                        return new defpackage.rzm(this.g);
                    }
                    sin sinVar2 = rzsVar.e;
                    defpackage.abxt abxtVar2 = this.g;
                    android.accounts.Account account2 = this.f;
                    java.lang.String str3 = account2.name;
                    aooh.e(str3, "name");
                    java.lang.String str4 = account2.type;
                    aooh.e(str4, "type");
                    this.d = 4;
                    obj = sinVar2.i(abxtVar2, str3, str4, this);
                    if (obj == aoluVar) {
                        return aoluVar;
                    }
                }
                return new defpackage.rzm((defpackage.abxt) obj);
            }
            aooc.af(obj);
            defpackage.rzs rzsVar2 = this.e;
            android.accounts.Account account3 = this.f;
            java.lang.Object objA = rzsVar2.f.a();
            aooh.e(objA, "get(...)");
            long jLongValue = ((java.lang.Number) objA).longValue();
            this.d = 1;
            obj = rzsVar2.i(account3, jLongValue);
            if (obj == aoluVar) {
                return aoluVar;
            }
            obj2 = (akmq) obj;
            defpackage.abxt abxtVar3 = this.g;
            defpackage.rzs rzsVar3 = this.e;
            akzx akzxVarM = defpackage.aknp.a.m();
            aooh.f(akzxVarM, "builder");
            ajyi ajyiVar = new ajyi(akzxVarM);
            aooh.f(abxtVar3, "<this>");
            akzx akzxVarM2 = defpackage.akmm.a.m();
            if ((abxtVar3.b & 1) != 0) {
                java.util.function.Function function = defpackage.sax.a;
                defpackage.abxp abxpVar = abxtVar3.c;
                if (abxpVar == null) {
                    abxpVar = defpackage.abxp.a;
                }
                defpackage.akmj akmjVar = (defpackage.akmj) aa$.ExternalSyntheticApiModelOutline1.m(function, abxpVar);
                akzxVarM2.u();
                defpackage.akmm akmmVar = (defpackage.akmm) akzxVarM2.b;
                j$.util.Objects.requireNonNull(akmjVar);
                akmmVar.c = akmjVar;
                akmmVar.b |= 1;
            }
            if ((abxtVar3.b & 2) != 0) {
                java.util.function.Function function2 = defpackage.sax.b;
                defpackage.abxr abxrVar = abxtVar3.d;
                if (abxrVar == null) {
                    abxrVar = defpackage.abxr.a;
                }
                defpackage.akmu akmuVar = (defpackage.akmu) aa$.ExternalSyntheticApiModelOutline1.m(function2, abxrVar);
                akzxVarM2.u();
                defpackage.akmm akmmVar2 = (defpackage.akmm) akzxVarM2.b;
                j$.util.Objects.requireNonNull(akmuVar);
                akmmVar2.d = akmuVar;
                akmmVar2.b |= 2;
            }
            defpackage.akmm akmmVar3 = (defpackage.akmm) akzxVarM2.p();
            aooh.e(akmmVar3, "apply(...)");
            aooh.f(akmmVar3, "value");
            java.lang.Object obj6 = ajyiVar.a;
            ((akzx) obj6).u();
            defpackage.aknp aknpVar5 = (defpackage.aknp) ((akzx) obj6).b;
            j$.util.Objects.requireNonNull(akmmVar3);
            aknpVar5.d = akmmVar3;
            aknpVar5.b |= 1;
            defpackage.abxp abxpVar2 = abxtVar3.c;
            if (abxpVar2 == null) {
                abxpVar2 = defpackage.abxp.a;
            }
            java.lang.String str5 = (abxpVar2.b == 1 ? (defpackage.abxs) abxpVar2.c : defpackage.abxs.a).f;
            aooh.e(str5, "getImageUri(...)");
            android.net.Uri uri = android.net.Uri.parse(str5);
            aooh.e(uri, "parse(...)");
            defpackage.afaw afawVarP = snl.P(abxtVar3);
            this.a = ajyiVar;
            this.b = ajyiVar;
            this.c = obj2;
            this.d = 2;
            obj = rzsVar3.d(uri, afawVarP, this);
            if (obj == aoluVar) {
                return aoluVar;
            }
            obj3 = ajyiVar;
            obj4 = obj3;
            akzc akzcVar2 = (akzc) obj;
            aooh.f(akzcVar2, "value");
            java.lang.Object obj7 = ((ajyi) obj3).a;
            ((akzx) obj7).u();
            defpackage.aknp aknpVar6 = (defpackage.aknp) ((akzx) obj7).b;
            defpackage.aknp aknpVar7 = defpackage.aknp.a;
            j$.util.Objects.requireNonNull(akzcVar2);
            aknpVar6.c = akzcVar2;
            alad aladVarP2 = ((akzx) ((ajyi) obj4).a).p();
            aooh.e(aladVarP2, "build(...)");
            defpackage.aknp aknpVar8 = (defpackage.aknp) aladVarP2;
            anmc anmcVar2 = ((aohh) obj2).a;
            anpkVar = defpackage.akmr.d;
            if (anpkVar == null) {
                synchronized (defpackage.akmr.class) {
                    anpkVarA = defpackage.akmr.d;
                    if (anpkVarA == null) {
                        aal aalVarD2 = anpk.d();
                        aalVarD2.b = anpj.a;
                        aalVarD2.d = anpk.c("google.internal.dialer.v1.DialerCallInfoLookupService", "UpdateMyCallingCard");
                        aalVarD2.b();
                        defpackage.aknp aknpVar9 = defpackage.aknp.a;
                        akzq akzqVar2 = aohd.a;
                        aalVarD2.e = new aohc(aknpVar9);
                        aalVarD2.c = new aohc(defpackage.aknq.a);
                        anpkVarA = aalVarD2.a();
                        defpackage.akmr.d = anpkVarA;
                    }
                    anpkVar = anpkVarA;
                }
            }
            ajcqVarA = aohp.a(anmcVar2.b(anpkVar, ((aohh) obj2).b), aknpVar8);
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = 3;
            if (aosv.D(ajcqVarA, this) == aoluVar) {
                return aoluVar;
            }
            rzsVar = this.e;
            if (!((java.lang.Boolean) rzsVar.j.a()).booleanValue()) {
                return new defpackage.rzm(this.g);
            }
            sin sinVar3 = rzsVar.e;
            defpackage.abxt abxtVar4 = this.g;
            android.accounts.Account account4 = this.f;
            java.lang.String str6 = account4.name;
            aooh.e(str6, "name");
            java.lang.String str7 = account4.type;
            aooh.e(str7, "type");
            this.d = 4;
            obj = sinVar3.i(abxtVar4, str6, str7, this);
            if (obj == aoluVar) {
                return aoluVar;
            }
            return new defpackage.rzm((defpackage.abxt) obj);
        } catch (java.lang.Exception e) {
            defpackage.rzs.a.c().k(e).l("com/android/dialer/patrick/impl/backend/CallingCardBackendService", "updateSelfMyCallingCard$<anonymous>", 123, "CallingCardBackendService.kt").y("Error updating My Calling Card: %s", new aepg(anqw.d(e).o));
            return defpackage.rzs.j(e);
        }
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.rzr(this.e, this.f, this.g, aolnVar);
    }
}
