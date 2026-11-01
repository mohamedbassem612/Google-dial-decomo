package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class rxz {
    public final aemh a;
    public final aoss b;
    public final aoin c;
    public final scw d;
    public final aoin e;
    public final agxi f;
    private final agoo g;
    private final java.util.concurrent.Executor h;
    private final agpq i;
    private final sjy j;
    private final defpackage.rzs k;
    private final defpackage.sfa l;
    private final aoin m;
    private final adag n;

    public rxz(agoo agooVar, aemh aemhVar, java.util.concurrent.Executor executor, aoss aossVar, aoin aoinVar, agpq agpqVar, sjy sjyVar, adag adagVar, defpackage.rzs rzsVar, defpackage.sfa sfaVar, scw scwVar, aoin aoinVar2, aoin aoinVar3) {
        aooh.f(agooVar, "accountDataService");
        aooh.f(aemhVar, "googleOwnersProvider");
        aooh.f(executor, "lightweightExecutor");
        aooh.f(aossVar, "lightweightScope");
        aooh.f(agpqVar, "gcoreAccountName");
        aooh.f(adagVar, "accountManager");
        aooh.f(aoinVar2, "enableContactsYourInfoFeatureRequestChanges");
        aooh.f(aoinVar3, "enableCallingCardAccountPersistenceOnSave");
        this.g = agooVar;
        this.a = aemhVar;
        this.h = executor;
        this.b = aossVar;
        this.c = aoinVar;
        this.i = agpqVar;
        this.j = sjyVar;
        this.n = adagVar;
        this.k = rzsVar;
        this.l = sfaVar;
        this.d = scwVar;
        this.m = aoinVar2;
        this.e = aoinVar3;
        this.f = new defpackage.agxn(agooVar.a(), new defpackage.qfc(this, 19), executor);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(agoq agoqVar, aoln aolnVar) {
        defpackage.rxv rxvVar;
        java.lang.Object obj;
        android.accounts.Account account;
        java.lang.Object objC;
        java.lang.Object obj2;
        if (aolnVar instanceof defpackage.rxv) {
            rxvVar = (defpackage.rxv) aolnVar;
            int i = rxvVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                rxvVar.e = i - Integer.MIN_VALUE;
            } else {
                rxvVar = new defpackage.rxv(this, aolnVar);
            }
        } else {
            rxvVar = new defpackage.rxv(this, aolnVar);
        }
        java.lang.Object objD = rxvVar.c;
        aolu aoluVar = aolu.a;
        int i2 = rxvVar.e;
        if (i2 != 0) {
            if (i2 == 1) {
                aooc.af(objD);
            } else if (i2 == 2) {
                obj = rxvVar.a;
                aooc.af(objD);
                aoov.an(this.b, (aolr) null, 0, new defpackage.roy(this, (aoln) null, 6), 3);
                ajcq ajcqVarA = this.i.a((com.google.apps.tiktok.account.AccountId) obj);
                rxvVar.a = obj;
                rxvVar.e = 3;
                objD = aosv.D(ajcqVarA, rxvVar);
                if (objD == aoluVar) {
                    return aoluVar;
                }
                defpackage.rzs rzsVar = this.k;
                account = (android.accounts.Account) objD;
                aooh.c(account);
                rxvVar.a = obj;
                rxvVar.b = account;
                rxvVar.e = 4;
                objC = rzsVar.c(account, rxvVar);
                if (objC == aoluVar) {
                    return aoluVar;
                }
                objD = objC;
                obj2 = account;
            } else if (i2 == 3) {
                obj = rxvVar.a;
                aooc.af(objD);
                defpackage.rzs rzsVar2 = this.k;
                account = (android.accounts.Account) objD;
                aooh.c(account);
                rxvVar.a = obj;
                rxvVar.b = account;
                rxvVar.e = 4;
                objC = rzsVar2.c(account, rxvVar);
                if (objC == aoluVar) {
                    return aoluVar;
                }
                objD = objC;
                obj2 = account;
            } else {
                if (i2 != 4) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = rxvVar.b;
                obj = rxvVar.a;
                aooc.af(objD);
            }
            aooh.c(obj2);
            aooh.c(obj);
            aooh.f(obj2, "account");
            aooh.f(obj, "accountId");
            return new aoiu(new defpackage.ser((android.accounts.Account) obj2, (com.google.apps.tiktok.account.AccountId) obj, 1), (snl) objD);
        }
        aooc.af(objD);
        agpq agpqVar = this.i;
        java.lang.String strE = agpqVar.e(agoqVar);
        if (strE == null) {
            throw new java.lang.IllegalStateException("Account name should not be null.");
        }
        ajcq ajcqVarC = agpqVar.c(strE);
        rxvVar.e = 1;
        objD = aosv.D(ajcqVarC, rxvVar);
        if (objD == aoluVar) {
            return aoluVar;
        }
        com.google.apps.tiktok.account.AccountId accountId = (com.google.apps.tiktok.account.AccountId) objD;
        ajcq ajcqVarF = this.n.f(accountId);
        rxvVar.a = accountId;
        rxvVar.e = 2;
        if (aosv.D(ajcqVarF, rxvVar) == aoluVar) {
            return aoluVar;
        }
        obj = accountId;
        aoov.an(this.b, (aolr) null, 0, new defpackage.roy(this, (aoln) null, 6), 3);
        ajcq ajcqVarA2 = this.i.a((com.google.apps.tiktok.account.AccountId) obj);
        rxvVar.a = obj;
        rxvVar.e = 3;
        objD = aosv.D(ajcqVarA2, rxvVar);
        if (objD == aoluVar) {
            return aoluVar;
        }
        defpackage.rzs rzsVar3 = this.k;
        account = (android.accounts.Account) objD;
        aooh.c(account);
        rxvVar.a = obj;
        rxvVar.b = account;
        rxvVar.e = 4;
        objC = rzsVar3.c(account, rxvVar);
        if (objC == aoluVar) {
            return aoluVar;
        }
        objD = objC;
        obj2 = account;
        aooh.c(obj2);
        aooh.c(obj);
        aooh.f(obj2, "account");
        aooh.f(obj, "accountId");
        return new aoiu(new defpackage.ser((android.accounts.Account) obj2, (com.google.apps.tiktok.account.AccountId) obj, 1), (snl) objD);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0063  */
    /* JADX WARN: Code duplicated, block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(agoq agoqVar, aoln aolnVar) {
        defpackage.rxw rxwVar;
        snl snlVar;
        java.lang.Object obj;
        if (aolnVar instanceof defpackage.rxw) {
            rxwVar = (defpackage.rxw) aolnVar;
            int i = rxwVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                rxwVar.d = i - Integer.MIN_VALUE;
            } else {
                rxwVar = new defpackage.rxw(this, aolnVar);
            }
        } else {
            rxwVar = new defpackage.rxw(this, aolnVar);
        }
        java.lang.Object objB = rxwVar.b;
        aolu aoluVar = aolu.a;
        int i2 = rxwVar.d;
        if (i2 != 0) {
            if (i2 == 1) {
                aooc.af(objB);
            } else if (i2 == 2) {
                aooc.af(objB);
                defpackage.sfa sfaVar = this.l;
                snlVar = (snl) objB;
                rxwVar.a = snlVar;
                rxwVar.d = 3;
                objB = sfaVar.d(rxwVar);
                if (objB != aoluVar) {
                    return aoluVar;
                }
                obj = snlVar;
            } else {
                if (i2 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj = rxwVar.a;
                aooc.af(objB);
            }
            return new aoiu((defpackage.ser) objB, obj);
        }
        aooc.af(objB);
        rxwVar.d = 1;
        if (c(agoqVar, rxwVar) == aoluVar) {
            return aoluVar;
        }
        defpackage.rzs rzsVar = this.k;
        rxwVar.d = 2;
        objB = rzsVar.b(rxwVar);
        if (objB == aoluVar) {
            return aoluVar;
        }
        defpackage.sfa sfaVar2 = this.l;
        snlVar = (snl) objB;
        rxwVar.a = snlVar;
        rxwVar.d = 3;
        objB = sfaVar2.d(rxwVar);
        if (objB != aoluVar) {
            return aoluVar;
        }
        obj = snlVar;
        return new aoiu((defpackage.ser) objB, obj);
    }

    /* JADX WARN: Code duplicated, block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(agoq agoqVar, aoln aolnVar) {
        defpackage.rxy rxyVar;
        java.lang.String strE;
        defpackage.sfa sfaVar;
        if (aolnVar instanceof defpackage.rxy) {
            rxyVar = (defpackage.rxy) aolnVar;
            int i = rxyVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                rxyVar.c = i - Integer.MIN_VALUE;
            } else {
                rxyVar = new defpackage.rxy(this, aolnVar);
            }
        } else {
            rxyVar = new defpackage.rxy(this, aolnVar);
        }
        java.lang.Object objD = rxyVar.a;
        aolu aoluVar = aolu.a;
        int i2 = rxyVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                strE = rxyVar.d;
                aooc.af(objD);
            } else if (i2 == 2) {
                strE = rxyVar.d;
                aooc.af(objD);
                sfaVar = this.l;
                rxyVar.d = null;
                rxyVar.c = 3;
                if (sfaVar.h(strE, rxyVar) == aoluVar) {
                    return aoluVar;
                }
            } else {
                if (i2 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objD);
            }
            aoov.an(this.b, (aolr) null, 0, new defpackage.roy(this, (aoln) null, 7, (byte[]) null), 3);
            return aojh.a;
        }
        aooc.af(objD);
        agpq agpqVar = this.i;
        strE = agpqVar.e(agoqVar);
        if (strE == null) {
            throw new java.lang.IllegalStateException("Account name should not be null.");
        }
        ajcq ajcqVarC = agpqVar.c(strE);
        rxyVar.d = strE;
        rxyVar.c = 1;
        objD = aosv.D(ajcqVarC, rxyVar);
        if (objD == aoluVar) {
            return aoluVar;
        }
        ajcq ajcqVarF = this.n.f((com.google.apps.tiktok.account.AccountId) objD);
        rxyVar.d = strE;
        rxyVar.c = 2;
        if (aosv.D(ajcqVarF, rxyVar) == aoluVar) {
            return aoluVar;
        }
        sfaVar = this.l;
        rxyVar.d = null;
        rxyVar.c = 3;
        if (sfaVar.h(strE, rxyVar) == aoluVar) {
            return aoluVar;
        }
        aoov.an(this.b, (aolr) null, 0, new defpackage.roy(this, (aoln) null, 7, (byte[]) null), 3);
        return aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v6, types: [abxu] */
    /* JADX WARN: Type inference failed for: r6v2, types: [abxu, java.lang.Object] */
    public final java.lang.Object d(snl snlVar, defpackage.ser serVar, aoln aolnVar) {
        defpackage.rxx rxxVar;
        ?? r5;
        defpackage.abxs abxsVarG;
        defpackage.abxs abxsVarG2;
        if (aolnVar instanceof defpackage.rxx) {
            rxxVar = (defpackage.rxx) aolnVar;
            int i = rxxVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                rxxVar.c = i - Integer.MIN_VALUE;
            } else {
                rxxVar = new defpackage.rxx(this, aolnVar);
            }
        } else {
            rxxVar = new defpackage.rxx(this, aolnVar);
        }
        java.lang.Object objJ = rxxVar.a;
        aolu aoluVar = aolu.a;
        int i2 = rxxVar.c;
        java.lang.String str = null;
        if (i2 == 0) {
            aooc.af(objJ);
            int iW = anty.W(snlVar);
            if (iW != 0) {
                if (iW != 1) {
                    throw new aois();
                }
                throw ((defpackage.rzj) snlVar).a;
            }
            ?? r6 = ((defpackage.rzm) snlVar).a;
            if (r6 == 0) {
                return null;
            }
            if (((java.lang.Boolean) this.m.a()).booleanValue()) {
                return r6;
            }
            defpackage.abxp abxpVarE = defpackage.abxl.e(r6);
            java.lang.String str2 = (abxpVarE == null || (abxsVarG = defpackage.abxl.g(abxpVarE)) == null) ? null : abxsVarG.f;
            if (str2 == null || str2.length() == 0) {
                throw new java.lang.IllegalStateException("Image URI from My Calling Card is empty");
            }
            sjy sjyVar = this.j;
            com.google.apps.tiktok.account.AccountId accountId = serVar != null ? serVar.b : null;
            rxxVar.d = (defpackage.abxt) r6;
            rxxVar.c = 1;
            objJ = sjyVar.j(str2, "SelfMyCallingCard", accountId, rxxVar);
            if (objJ == aoluVar) {
                return aoluVar;
            }
            r5 = r6;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.abxt abxtVar = rxxVar.d;
            aooc.af(objJ);
            r5 = abxtVar;
        }
        android.net.Uri uri = (android.net.Uri) objJ;
        if (uri == null) {
            throw new java.lang.IllegalStateException("Failed to save image file");
        }
        java.lang.String string = uri.toString();
        aooh.e(string, "toString(...)");
        defpackage.abxp abxpVarE2 = defpackage.abxl.e(r5);
        if (abxpVarE2 != null && (abxsVarG2 = defpackage.abxl.g(abxpVarE2)) != null) {
            str = abxsVarG2.g;
        }
        return snl.O((defpackage.abxt) r5, string, str);
    }
}
