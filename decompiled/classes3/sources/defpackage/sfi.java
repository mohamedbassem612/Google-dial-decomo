package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class sfi implements agxi {
    public static final aimz a = aimz.i("com/android/dialer/patrick/impl/settings/service/CallingCardSettingsUiDataSource");
    public final sin b;
    public final defpackage.sfa c;
    public final smx d;
    public final aoin e;
    public final vwb f;
    private final aoss g;
    private final android.content.Context h;
    private final agpq i;
    private final sjy j;
    private final defpackage.rzs k;
    private final agoo l;
    private final aoin m;

    public sfi(aoss aossVar, android.content.Context context, sin sinVar, defpackage.sfa sfaVar, agpq agpqVar, sjy sjyVar, defpackage.rzs rzsVar, agoo agooVar, vwb vwbVar, smx smxVar, aazc aazcVar, aoin aoinVar, aoin aoinVar2) {
        aooh.f(aossVar, "lightweightScope");
        aooh.f(context, "appContext");
        aooh.f(agpqVar, "gcoreAccountName");
        aooh.f(agooVar, "accountDataService");
        aooh.f(vwbVar, "callingCardSettingsUiModelCache");
        aooh.f(aazcVar, "clock");
        aooh.f(aoinVar, "enableContactsYourInfoFeatureRequestChanges");
        this.g = aossVar;
        this.h = context;
        this.b = sinVar;
        this.c = sfaVar;
        this.i = agpqVar;
        this.j = sjyVar;
        this.k = rzsVar;
        this.l = agooVar;
        this.f = vwbVar;
        this.d = smxVar;
        this.e = aoinVar;
        this.m = aoinVar2;
    }

    public static final defpackage.sfe d(defpackage.sib sibVar) {
        return new defpackage.sfe(sibVar.d, java.lang.Long.valueOf(sibVar.a), java.lang.Long.valueOf(sibVar.b), sibVar.c, sibVar.e, null, null, null);
    }

    public final ajbg a() {
        return new ajbg(aosv.F(this.g, 0, new mva(this, (aoln) null, 17, (byte[]) null), 3));
    }

    public final ajcq b() {
        return aosv.F(this.g, 0, new mva(this, (aoln) null, 16), 3);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Code duplicated, block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x00a3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:25:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:27:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:29:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:31:0x00db  */
    /* JADX WARN: Code duplicated, block: B:34:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:36:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:38:0x0102  */
    /* JADX WARN: Code duplicated, block: B:40:0x0109  */
    /* JADX WARN: Code duplicated, block: B:44:0x0134  */
    /* JADX WARN: Code duplicated, block: B:46:0x014b  */
    /* JADX WARN: Code duplicated, block: B:49:0x016b  */
    /* JADX WARN: Code duplicated, block: B:52:0x0183  */
    /* JADX WARN: Code duplicated, block: B:54:0x0190  */
    /* JADX WARN: Code duplicated, block: B:56:0x0193  */
    /* JADX WARN: Code duplicated, block: B:59:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:61:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:64:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:66:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:82:0x0267  */
    /* JADX WARN: Code duplicated, block: B:83:0x0272  */
    /* JADX WARN: Code duplicated, block: B:88:0x028a  */
    /* JADX WARN: Code duplicated, block: B:91:0x029e  */
    /* JADX WARN: Code duplicated, block: B:93:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:98:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v15, types: [abxu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18, types: [abxu] */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27 */
    public final java.lang.Object c(android.accounts.Account account, aoln aolnVar) throws aois {
        defpackage.sfh sfhVar;
        android.accounts.Account account2;
        snl snlVar;
        int iW;
        java.lang.Object obj;
        java.lang.Object objD;
        snl snlVar2;
        android.accounts.Account account3;
        java.lang.Object obj2;
        defpackage.sfa sfaVar;
        snl snlVar3;
        defpackage.sfl sflVar;
        defpackage.sfa sfaVar2;
        snl snlVar4;
        com.google.apps.tiktok.account.AccountId accountId;
        java.lang.Object objD2;
        java.lang.Object obj3;
        snl snlVar5;
        ?? r4;
        agoq agoqVar;
        defpackage.abxp abxpVarE;
        java.lang.String str;
        agoq agoqVar2;
        android.accounts.Account account4;
        defpackage.abxs abxsVarG;
        java.lang.String str2;
        ?? r5;
        android.net.Uri uri;
        defpackage.abxp abxpVarE2;
        java.lang.String str3;
        java.lang.String str4;
        defpackage.abxs abxsVarG2;
        android.net.Uri uri2;
        if (aolnVar instanceof defpackage.sfh) {
            sfhVar = (defpackage.sfh) aolnVar;
            int i = sfhVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                sfhVar.g = i - Integer.MIN_VALUE;
            } else {
                sfhVar = new defpackage.sfh(this, aolnVar);
            }
        } else {
            sfhVar = new defpackage.sfh(this, aolnVar);
        }
        java.lang.Object objB = sfhVar.e;
        aolu aoluVar = aolu.a;
        android.net.Uri uri3 = null;
        switch (sfhVar.g) {
            case 0:
                aooc.af(objB);
                defpackage.rzs rzsVar = this.k;
                account2 = account;
                sfhVar.a = account2;
                sfhVar.g = 1;
                objB = rzsVar.b(sfhVar);
                if (objB == aoluVar) {
                    return aoluVar;
                }
                snlVar = (snl) objB;
                iW = anty.W(snlVar);
                if (iW != 0) {
                    if (iW == 1) {
                        throw new aois();
                    }
                    snlVar3 = ((defpackage.rzj) snlVar).b;
                    j$.util.Objects.checkIndex(0, 3);
                    if (snlVar3 instanceof defpackage.rzk) {
                        sfaVar2 = this.c;
                        sfhVar.a = snlVar;
                        sfhVar.g = 2;
                        if (sfaVar2.a(sfhVar) != aoluVar) {
                            return aoluVar;
                        }
                        snlVar4 = snlVar;
                        java.lang.String string = this.h.getString(2132017947);
                        aooh.e(string, "getString(...)");
                        snl snlVar6 = snlVar4;
                        sflVar = new defpackage.sfl(string, -2);
                        snlVar = snlVar6;
                    } else {
                        if (snlVar3 instanceof defpackage.rzl) {
                            throw new aois();
                        }
                        java.lang.String string2 = this.h.getString(2132019741);
                        aooh.e(string2, "getString(...)");
                        sflVar = new defpackage.sfl(string2, -1);
                    }
                    return new defpackage.sfk(((defpackage.rzj) snlVar).a, sflVar, null);
                }
                obj = ((defpackage.rzm) snlVar).a;
                if (obj == null) {
                    a.b().l("com/android/dialer/patrick/impl/settings/service/CallingCardSettingsUiDataSource", "fetchAndStoreSelfMyCallingCard", 134, "CallingCardSettingsUiDataSource.kt").v("Self My Calling Card is null");
                    sfaVar = this.c;
                    sfhVar.a = null;
                    sfhVar.g = 3;
                    if (sfaVar.a(sfhVar) == aoluVar) {
                        return aoluVar;
                    }
                    return new defpackage.sfm(null);
                }
                ajcq ajcqVarC = this.i.c(account2.name);
                sfhVar.a = account2;
                sfhVar.b = snlVar;
                sfhVar.c = obj;
                sfhVar.g = 4;
                objD = aosv.D(ajcqVarC, sfhVar);
                if (objD != aoluVar) {
                    return aoluVar;
                }
                snlVar2 = snlVar;
                objB = objD;
                account3 = account2;
                obj2 = obj;
                accountId = (com.google.apps.tiktok.account.AccountId) objB;
                ajcq ajcqVarB = this.l.b(accountId);
                sfhVar.a = account3;
                sfhVar.b = snlVar2;
                sfhVar.c = obj2;
                sfhVar.d = accountId;
                sfhVar.g = 5;
                objD2 = aosv.D(ajcqVarB, sfhVar);
                if (objD2 == aoluVar) {
                    return aoluVar;
                }
                snl snlVar7 = snlVar2;
                obj3 = accountId;
                objB = objD2;
                snlVar5 = snlVar7;
                r4 = obj2;
                agoqVar = ((defpackage.agon) objB).b;
                if (!((java.lang.Boolean) this.e.a()).booleanValue()) {
                    java.lang.String str5 = agoqVar.d;
                    str2 = agoqVar.h;
                    aooh.c(str2);
                    if (str2.length() <= 0) {
                        str2 = null;
                    }
                    if (str2 != null) {
                        uri3 = android.net.Uri.parse(str2);
                        aooh.e(uri3, "parse(...)");
                    }
                    return new defpackage.sfm(new defpackage.sfe(str5, null, null, uri3, null, account3.name, agoqVar.j, (defpackage.abxt) ((defpackage.rzm) snlVar5).a));
                }
                abxpVarE = defpackage.abxl.e(r4);
                if (abxpVarE != null || (abxsVarG = defpackage.abxl.g(abxpVarE)) == null) {
                    str = null;
                } else {
                    str = abxsVarG.f;
                }
                if (str != null || str.length() <= 0) {
                    throw new java.lang.IllegalStateException("Image URI from My Calling Card is empty");
                }
                sjy sjyVar = this.j;
                sfhVar.a = account3;
                sfhVar.b = r4;
                sfhVar.c = agoqVar;
                sfhVar.d = null;
                sfhVar.g = 6;
                java.lang.Object objJ = sjyVar.j(str, "SelfMyCallingCard", (com.google.apps.tiktok.account.AccountId) obj3, sfhVar);
                if (objJ == aoluVar) {
                    return aoluVar;
                }
                agoqVar2 = agoqVar;
                objB = objJ;
                account4 = account3;
                r5 = r4;
                uri = (android.net.Uri) objB;
                if (((java.lang.Boolean) this.m.a()).booleanValue() || uri != null) {
                    if (uri == null) {
                        return new defpackage.sfk(new java.lang.IllegalStateException("Failed to save image file"), null, null);
                    }
                    java.lang.String string3 = uri.toString();
                    aooh.e(string3, "toString(...)");
                    abxpVarE2 = defpackage.abxl.e(r5);
                    if (abxpVarE2 != null || (abxsVarG2 = defpackage.abxl.g(abxpVarE2)) == null) {
                        str3 = null;
                    } else {
                        str3 = abxsVarG2.g;
                    }
                    defpackage.abxt abxtVarO = snl.O((defpackage.abxt) r5, string3, str3);
                    java.lang.String str6 = agoqVar2.d;
                    str4 = agoqVar2.h;
                    aooh.c(str4);
                    if (str4.length() <= 0) {
                        str4 = null;
                    }
                    if (str4 != null) {
                        uri3 = android.net.Uri.parse(str4);
                        aooh.e(uri3, "parse(...)");
                    }
                    return new defpackage.sfm(new defpackage.sfe(str6, null, null, uri3, null, account4.name, agoqVar2.j, abxtVarO));
                }
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("Failed to save image file");
                java.lang.String string4 = this.h.getString(2132017951);
                aooh.e(string4, "getString(...)");
                defpackage.sfl sflVar2 = new defpackage.sfl(string4, -1);
                java.lang.String str7 = agoqVar2.d;
                java.lang.String str8 = agoqVar2.h;
                aooh.c(str8);
                if (str8.length() <= 0) {
                    str8 = null;
                }
                if (str8 != null) {
                    android.net.Uri uri4 = android.net.Uri.parse(str8);
                    aooh.e(uri4, "parse(...)");
                    uri2 = uri4;
                } else {
                    uri2 = null;
                }
                java.lang.String str9 = account4.name;
                java.lang.String str10 = agoqVar2.j;
                akzx akzxVarP = ((alad) r5).p();
                akzxVarP.u();
                defpackage.abxt abxtVar = (defpackage.abxt) akzxVarP.b;
                abxtVar.c = null;
                abxtVar.b &= -2;
                return new defpackage.sfk(illegalStateException, sflVar2, new defpackage.sfe(str7, null, null, uri2, null, str9, str10, (defpackage.abxt) akzxVarP.p()));
            case 1:
                account2 = (android.accounts.Account) sfhVar.a;
                aooc.af(objB);
                snlVar = (snl) objB;
                iW = anty.W(snlVar);
                if (iW != 0) {
                    if (iW == 1) {
                        throw new aois();
                    }
                    snlVar3 = ((defpackage.rzj) snlVar).b;
                    j$.util.Objects.checkIndex(0, 3);
                    if (snlVar3 instanceof defpackage.rzk) {
                        sfaVar2 = this.c;
                        sfhVar.a = snlVar;
                        sfhVar.g = 2;
                        if (sfaVar2.a(sfhVar) != aoluVar) {
                            return aoluVar;
                        }
                        snlVar4 = snlVar;
                        java.lang.String string5 = this.h.getString(2132017947);
                        aooh.e(string5, "getString(...)");
                        snl snlVar8 = snlVar4;
                        sflVar = new defpackage.sfl(string5, -2);
                        snlVar = snlVar8;
                    } else {
                        if (snlVar3 instanceof defpackage.rzl) {
                            throw new aois();
                        }
                        java.lang.String string6 = this.h.getString(2132019741);
                        aooh.e(string6, "getString(...)");
                        sflVar = new defpackage.sfl(string6, -1);
                    }
                    return new defpackage.sfk(((defpackage.rzj) snlVar).a, sflVar, null);
                }
                obj = ((defpackage.rzm) snlVar).a;
                if (obj == null) {
                    a.b().l("com/android/dialer/patrick/impl/settings/service/CallingCardSettingsUiDataSource", "fetchAndStoreSelfMyCallingCard", 134, "CallingCardSettingsUiDataSource.kt").v("Self My Calling Card is null");
                    sfaVar = this.c;
                    sfhVar.a = null;
                    sfhVar.g = 3;
                    if (sfaVar.a(sfhVar) == aoluVar) {
                        return aoluVar;
                    }
                    return new defpackage.sfm(null);
                }
                ajcq ajcqVarC2 = this.i.c(account2.name);
                sfhVar.a = account2;
                sfhVar.b = snlVar;
                sfhVar.c = obj;
                sfhVar.g = 4;
                objD = aosv.D(ajcqVarC2, sfhVar);
                if (objD != aoluVar) {
                    return aoluVar;
                }
                snlVar2 = snlVar;
                objB = objD;
                account3 = account2;
                obj2 = obj;
                accountId = (com.google.apps.tiktok.account.AccountId) objB;
                ajcq ajcqVarB2 = this.l.b(accountId);
                sfhVar.a = account3;
                sfhVar.b = snlVar2;
                sfhVar.c = obj2;
                sfhVar.d = accountId;
                sfhVar.g = 5;
                objD2 = aosv.D(ajcqVarB2, sfhVar);
                if (objD2 == aoluVar) {
                    return aoluVar;
                }
                snl snlVar9 = snlVar2;
                obj3 = accountId;
                objB = objD2;
                snlVar5 = snlVar9;
                r4 = obj2;
                agoqVar = ((defpackage.agon) objB).b;
                if (!((java.lang.Boolean) this.e.a()).booleanValue()) {
                    abxpVarE = defpackage.abxl.e(r4);
                    if (abxpVarE != null) {
                        str = null;
                    } else {
                        str = null;
                    }
                    if (str != null) {
                        break;
                    }
                    throw new java.lang.IllegalStateException("Image URI from My Calling Card is empty");
                }
                java.lang.String str11 = agoqVar.d;
                str2 = agoqVar.h;
                aooh.c(str2);
                if (str2.length() <= 0) {
                    str2 = null;
                }
                if (str2 != null) {
                    uri3 = android.net.Uri.parse(str2);
                    aooh.e(uri3, "parse(...)");
                }
                return new defpackage.sfm(new defpackage.sfe(str11, null, null, uri3, null, account3.name, agoqVar.j, (defpackage.abxt) ((defpackage.rzm) snlVar5).a));
            case 2:
                snlVar4 = (snl) sfhVar.a;
                aooc.af(objB);
                java.lang.String string7 = this.h.getString(2132017947);
                aooh.e(string7, "getString(...)");
                snl snlVar10 = snlVar4;
                sflVar = new defpackage.sfl(string7, -2);
                snlVar = snlVar10;
                return new defpackage.sfk(((defpackage.rzj) snlVar).a, sflVar, null);
            case 3:
                aooc.af(objB);
                return new defpackage.sfm(null);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                defpackage.abxt abxtVar2 = (defpackage.abxt) sfhVar.c;
                snlVar2 = (snl) sfhVar.b;
                account3 = (android.accounts.Account) sfhVar.a;
                aooc.af(objB);
                obj2 = abxtVar2;
                accountId = (com.google.apps.tiktok.account.AccountId) objB;
                ajcq ajcqVarB3 = this.l.b(accountId);
                sfhVar.a = account3;
                sfhVar.b = snlVar2;
                sfhVar.c = obj2;
                sfhVar.d = accountId;
                sfhVar.g = 5;
                objD2 = aosv.D(ajcqVarB3, sfhVar);
                if (objD2 == aoluVar) {
                    return aoluVar;
                }
                snl snlVar11 = snlVar2;
                obj3 = accountId;
                objB = objD2;
                snlVar5 = snlVar11;
                r4 = obj2;
                agoqVar = ((defpackage.agon) objB).b;
                if (!((java.lang.Boolean) this.e.a()).booleanValue()) {
                    abxpVarE = defpackage.abxl.e(r4);
                    if (abxpVarE != null) {
                        str = null;
                    } else {
                        str = null;
                    }
                    if (str != null) {
                        break;
                    }
                    throw new java.lang.IllegalStateException("Image URI from My Calling Card is empty");
                }
                java.lang.String str12 = agoqVar.d;
                str2 = agoqVar.h;
                aooh.c(str2);
                if (str2.length() <= 0) {
                    str2 = null;
                }
                if (str2 != null) {
                    uri3 = android.net.Uri.parse(str2);
                    aooh.e(uri3, "parse(...)");
                }
                return new defpackage.sfm(new defpackage.sfe(str12, null, null, uri3, null, account3.name, agoqVar.j, (defpackage.abxt) ((defpackage.rzm) snlVar5).a));
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                java.lang.Object obj4 = sfhVar.d;
                defpackage.abxt abxtVar3 = (defpackage.abxt) sfhVar.c;
                snl snlVar12 = (snl) sfhVar.b;
                android.accounts.Account account5 = (android.accounts.Account) sfhVar.a;
                aooc.af(objB);
                obj3 = obj4;
                r4 = abxtVar3;
                snlVar5 = snlVar12;
                account3 = account5;
                agoqVar = ((defpackage.agon) objB).b;
                if (!((java.lang.Boolean) this.e.a()).booleanValue()) {
                    abxpVarE = defpackage.abxl.e(r4);
                    if (abxpVarE != null) {
                        str = null;
                    } else {
                        str = null;
                    }
                    if (str != null) {
                        break;
                    }
                    throw new java.lang.IllegalStateException("Image URI from My Calling Card is empty");
                }
                java.lang.String str13 = agoqVar.d;
                str2 = agoqVar.h;
                aooh.c(str2);
                if (str2.length() <= 0) {
                    str2 = null;
                }
                if (str2 != null) {
                    uri3 = android.net.Uri.parse(str2);
                    aooh.e(uri3, "parse(...)");
                }
                return new defpackage.sfm(new defpackage.sfe(str13, null, null, uri3, null, account3.name, agoqVar.j, (defpackage.abxt) ((defpackage.rzm) snlVar5).a));
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                agoqVar2 = (agoq) sfhVar.c;
                defpackage.abxt abxtVar4 = (defpackage.abxt) sfhVar.b;
                account4 = (android.accounts.Account) sfhVar.a;
                aooc.af(objB);
                r5 = abxtVar4;
                uri = (android.net.Uri) objB;
                if (((java.lang.Boolean) this.m.a()).booleanValue()) {
                }
                if (uri == null) {
                    return new defpackage.sfk(new java.lang.IllegalStateException("Failed to save image file"), null, null);
                }
                java.lang.String string8 = uri.toString();
                aooh.e(string8, "toString(...)");
                abxpVarE2 = defpackage.abxl.e(r5);
                if (abxpVarE2 != null) {
                    str3 = null;
                } else {
                    str3 = null;
                }
                defpackage.abxt abxtVarO2 = snl.O((defpackage.abxt) r5, string8, str3);
                java.lang.String str14 = agoqVar2.d;
                str4 = agoqVar2.h;
                aooh.c(str4);
                if (str4.length() <= 0) {
                    str4 = null;
                }
                if (str4 != null) {
                    uri3 = android.net.Uri.parse(str4);
                    aooh.e(uri3, "parse(...)");
                }
                return new defpackage.sfm(new defpackage.sfe(str14, null, null, uri3, null, account4.name, agoqVar2.j, abxtVarO2));
            default:
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final /* bridge */ /* synthetic */ java.lang.Object e() {
        return defpackage.sfa.b;
    }
}
