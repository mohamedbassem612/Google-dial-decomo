package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class sin {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/patrick/impl/storage/PatrickStorage");
    public final defpackage.shq b;
    public final defpackage.aolr c;
    public final defpackage.sia d;
    public final defpackage.sjy e;
    public final defpackage.aoin f;
    public final defpackage.agpq g;

    public sin(defpackage.shq shqVar, defpackage.aolr aolrVar, defpackage.sia siaVar, defpackage.sjy sjyVar, defpackage.aoin aoinVar, defpackage.agpq agpqVar) {
        if (aolrVar == null) {
            defpackage.aooh.i("lightweightContext");
        }
        if (aoinVar == null) {
            defpackage.aooh.i("enableContactsYourInfoFeatureRequestChanges");
        }
        if (agpqVar == null) {
            defpackage.aooh.i("gcoreAccountName");
        }
        this.b = shqVar;
        this.c = aolrVar;
        this.d = siaVar;
        this.e = sjyVar;
        this.f = aoinVar;
        this.g = agpqVar;
    }

    public final java.lang.Object a(java.util.List list, defpackage.aoln aolnVar) {
        return defpackage.aoov.aj(this.c, new yuf(this, list, (defpackage.aoln) null, 1), aolnVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(java.lang.String str, java.lang.String str2, defpackage.aoln aolnVar) {
        sid sidVar;
        if (aolnVar instanceof sid) {
            sidVar = (sid) aolnVar;
            int i = sidVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                sidVar.c = i - Integer.MIN_VALUE;
            } else {
                sidVar = new sid(this, aolnVar);
            }
        } else {
            sidVar = new sid(this, aolnVar);
        }
        java.lang.Object objA = sidVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = sidVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(objA);
            if (((java.lang.Boolean) this.f.a()).booleanValue()) {
                java.util.List listAY = defpackage.ajsz.aY(new sio(str, str2));
                sidVar.c = 1;
                objA = a(listAY, sidVar);
                if (objA == aoluVar) {
                    return aoluVar;
                }
            }
            return defpackage.aojh.a;
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        defpackage.aooc.af(objA);
        if (!((java.lang.Boolean) objA).booleanValue()) {
            ((defpackage.aimw) a.d().l("com/android/dialer/patrick/impl/storage/PatrickStorage", "deleteSelfMyCallingCard", 272, "PatrickStorage.kt")).v("Failed to delete Self My Calling Card from CPG.");
        }
        return defpackage.aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(defpackage.aoln aolnVar) throws java.io.IOException {
        sif sifVar;
        java.lang.Throwable th;
        defpackage.ahoq ahoqVar;
        if (aolnVar instanceof sif) {
            sifVar = (sif) aolnVar;
            int i = sifVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                sifVar.c = i - Integer.MIN_VALUE;
            } else {
                sifVar = new sif(this, aolnVar);
            }
        } else {
            sifVar = new sif(this, aolnVar);
        }
        java.lang.Object obj = sifVar.a;
        java.lang.Object obj2 = defpackage.aolu.a;
        int i2 = sifVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            if (!defpackage.ahvr.R(sifVar.u())) {
                throw new java.lang.IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
            }
            defpackage.ahoq ahoqVarZ = defpackage.ahvr.Z(819, "PatrickStorage_fetchContactsWithPatrickData");
            try {
                defpackage.shq shqVar = this.b;
                sifVar.d = ahoqVarZ;
                sifVar.c = 1;
                java.lang.Object objC = shqVar.c(sifVar);
                if (objC != obj2) {
                    obj = objC;
                    ahoqVar = ahoqVarZ;
                }
                return obj2;
            } catch (java.lang.Throwable th2) {
                th = th2;
                ahoqVar = ahoqVarZ;
                throw th;
            }
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ahoqVar = sifVar.d;
        try {
            defpackage.aooc.af(obj);
        } catch (java.lang.Throwable th3) {
            th = th3;
            try {
                throw th;
            } catch (java.lang.Throwable th4) {
                defpackage.ajsz.ak(ahoqVar, th);
                throw th4;
            }
        }
        obj2 = (java.util.List) obj;
        defpackage.ajsz.ak(ahoqVar, null);
        return obj2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object d(defpackage.aoln aolnVar) throws java.io.IOException {
        defpackage.sig sigVar;
        java.lang.Throwable th;
        defpackage.ahoq ahoqVar;
        java.lang.Object obj;
        if (aolnVar instanceof defpackage.sig) {
            sigVar = (defpackage.sig) aolnVar;
            int i = sigVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                sigVar.c = i - Integer.MIN_VALUE;
            } else {
                sigVar = new defpackage.sig(this, aolnVar);
            }
        } else {
            sigVar = new defpackage.sig(this, aolnVar);
        }
        java.lang.Object obj2 = sigVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = sigVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(obj2);
            if (!defpackage.ahvr.R(sigVar.u())) {
                throw new java.lang.IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
            }
            defpackage.ahoq ahoqVarX = defpackage.ahvr.X(820, "PatrickStorage_isCallingCardStorageAvailable", defpackage.ahot.a, true);
            try {
                defpackage.sia siaVar = this.d;
                sigVar.d = ahoqVarX;
                sigVar.c = 1;
                java.lang.Object objAj = defpackage.aoov.aj(siaVar.b, new defpackage.mev(siaVar, (defpackage.aoln) null, 16), sigVar);
                obj = aoluVar;
                if (objAj != aoluVar) {
                    obj2 = objAj;
                    ahoqVar = ahoqVarX;
                }
                return obj;
            } catch (java.lang.Throwable th2) {
                th = th2;
                ahoqVar = ahoqVarX;
                throw th;
            }
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ahoqVar = sigVar.d;
        try {
            defpackage.aooc.af(obj2);
        } catch (java.lang.Throwable th3) {
            th = th3;
            try {
                throw th;
            } catch (java.lang.Throwable th4) {
                defpackage.ajsz.ak(ahoqVar, th);
                throw th4;
            }
        }
        java.lang.Boolean bool = (java.lang.Boolean) obj2;
        bool.booleanValue();
        defpackage.ajsz.ak(ahoqVar, null);
        obj = bool;
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object e(defpackage.aoln aolnVar) throws java.io.IOException {
        sih sihVar;
        java.lang.Throwable th;
        defpackage.ahoq ahoqVar;
        java.lang.Object obj;
        if (aolnVar instanceof sih) {
            sihVar = (sih) aolnVar;
            int i = sihVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                sihVar.c = i - Integer.MIN_VALUE;
            } else {
                sihVar = new sih(this, aolnVar);
            }
        } else {
            sihVar = new sih(this, aolnVar);
        }
        java.lang.Object obj2 = sihVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = sihVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(obj2);
            if (!defpackage.ahvr.R(sihVar.u())) {
                throw new java.lang.IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
            }
            defpackage.ahoq ahoqVarZ = defpackage.ahvr.Z(821, "PatrickStorage_isMyCallingCardStorageAvailable");
            try {
                defpackage.sia siaVar = this.d;
                sihVar.d = ahoqVarZ;
                sihVar.c = 1;
                java.lang.Object objAj = defpackage.aoov.aj(siaVar.b, new sge(siaVar, (defpackage.aoln) null, 8, (byte[]) null), sihVar);
                obj = aoluVar;
                if (objAj != aoluVar) {
                    obj2 = objAj;
                    ahoqVar = ahoqVarZ;
                }
                return obj;
            } catch (java.lang.Throwable th2) {
                th = th2;
                ahoqVar = ahoqVarZ;
                throw th;
            }
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ahoqVar = sihVar.d;
        try {
            defpackage.aooc.af(obj2);
        } catch (java.lang.Throwable th3) {
            th = th3;
            try {
                throw th;
            } catch (java.lang.Throwable th4) {
                defpackage.ajsz.ak(ahoqVar, th);
                throw th4;
            }
        }
        java.lang.Boolean bool = (java.lang.Boolean) obj2;
        bool.booleanValue();
        defpackage.ajsz.ak(ahoqVar, null);
        obj = bool;
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object f(defpackage.aoln aolnVar) throws java.io.IOException {
        sii siiVar;
        java.lang.Throwable th;
        defpackage.ahoq ahoqVar;
        java.lang.Object obj;
        if (aolnVar instanceof sii) {
            siiVar = (sii) aolnVar;
            int i = siiVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                siiVar.c = i - Integer.MIN_VALUE;
            } else {
                siiVar = new sii(this, aolnVar);
            }
        } else {
            siiVar = new sii(this, aolnVar);
        }
        java.lang.Object obj2 = siiVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = siiVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(obj2);
            if (!defpackage.ahvr.R(siiVar.u())) {
                throw new java.lang.IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
            }
            defpackage.ahoq ahoqVarZ = defpackage.ahvr.Z(822, "PatrickStorage_isSelfMyCallingCardStorageAvailable");
            try {
                defpackage.sia siaVar = this.d;
                siiVar.d = ahoqVarZ;
                siiVar.c = 1;
                java.lang.Object objAj = defpackage.aoov.aj(siaVar.b, new sge(siaVar, (defpackage.aoln) null, 9, (char[]) null), siiVar);
                obj = aoluVar;
                if (objAj != aoluVar) {
                    obj2 = objAj;
                    ahoqVar = ahoqVarZ;
                }
                return obj;
            } catch (java.lang.Throwable th2) {
                th = th2;
                ahoqVar = ahoqVarZ;
                throw th;
            }
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ahoqVar = siiVar.d;
        try {
            defpackage.aooc.af(obj2);
        } catch (java.lang.Throwable th3) {
            th = th3;
            try {
                throw th;
            } catch (java.lang.Throwable th4) {
                defpackage.ajsz.ak(ahoqVar, th);
                throw th4;
            }
        }
        java.lang.Boolean bool = (java.lang.Boolean) obj2;
        bool.booleanValue();
        defpackage.ajsz.ak(ahoqVar, null);
        obj = bool;
        return obj;
    }

    public final java.lang.Object g(java.lang.String str, java.lang.String str2, defpackage.aoln aolnVar) {
        return defpackage.aoov.aj(this.c, new sij(this, str, str2, (defpackage.aoln) null, 1, (byte[]) null), aolnVar);
    }

    public final java.lang.Object h(java.lang.String str, java.lang.String str2, defpackage.aoln aolnVar) {
        return defpackage.aoov.aj(this.c, new sij(this, str, str2, (defpackage.aoln) null, 0), aolnVar);
    }

    public final java.lang.Object i(abxt abxtVar, java.lang.String str, java.lang.String str2, defpackage.aoln aolnVar) {
        return defpackage.aoov.aj(this.c, new sik(this, abxtVar, str, str2, (defpackage.aoln) null), aolnVar);
    }
}
