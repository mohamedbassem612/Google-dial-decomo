package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class sgi {
    public final java.lang.Object a;
    public final java.lang.Object b;

    public sgi(android.content.Context context, ipc ipcVar) {
        aooh.f(context, "appContext");
        this.a = context;
        this.b = ipcVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(java.lang.String str, akfg akfgVar, aoln aolnVar) {
        defpackage.smy smyVar;
        if (aolnVar instanceof defpackage.smy) {
            smyVar = (defpackage.smy) aolnVar;
            int i = smyVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                smyVar.b = i - Integer.MIN_VALUE;
            } else {
                smyVar = new defpackage.smy(this, aolnVar);
            }
        } else {
            smyVar = new defpackage.smy(this, aolnVar);
        }
        java.lang.Object objD = smyVar.a;
        aolu aoluVar = aolu.a;
        int i2 = smyVar.b;
        if (i2 == 0) {
            aooc.af(objD);
            if (str == null || aoov.H(str)) {
                return null;
            }
            ajcq ajcqVarV = ((ahbv) this.b).v(str, akfgVar != akfg.eq ? akfgVar.eW : null);
            smyVar.b = 1;
            objD = aosv.D(ajcqVarV, smyVar);
            if (objD != aoluVar) {
            }
            return aoluVar;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objD);
            return objD;
        }
        aooc.af(objD);
        hkd hkdVar = (hkd) objD;
        aooh.c(hkdVar);
        smyVar.b = 2;
        java.lang.Object objB = b(hkdVar, smyVar);
        if (objB != aoluVar) {
            return objB;
        }
        return aoluVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(hkd hkdVar, aoln aolnVar) {
        defpackage.smz smzVar;
        if (aolnVar instanceof defpackage.smz) {
            smzVar = (defpackage.smz) aolnVar;
            int i = smzVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                smzVar.b = i - Integer.MIN_VALUE;
            } else {
                smzVar = new defpackage.smz(this, aolnVar);
            }
        } else {
            smzVar = new defpackage.smz(this, aolnVar);
        }
        java.lang.Object objAK = smzVar.a;
        aolu aoluVar = aolu.a;
        int i2 = smzVar.b;
        if (i2 == 0) {
            aooc.af(objAK);
            int i3 = hkdVar.b;
            if ((i3 & 4) != 0 && hkdVar.e && (i3 & 32) != 0) {
                java.lang.Object obj = this.a;
                smzVar.c = hkdVar;
                smzVar.b = 1;
                objAK = ((aogc) obj).aK(smzVar);
                if (objAK == aoluVar) {
                    return aoluVar;
                }
            }
            return null;
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        hkdVar = smzVar.c;
        aooc.af(objAK);
        defpackage.akfx akfxVar = (defpackage.akfx) objAK;
        java.lang.String strExtractNetworkPortion = android.telephony.PhoneNumberUtils.extractNetworkPortion(hkdVar.c);
        aooh.e(strExtractNetworkPortion, "extractNetworkPortion(...)");
        defpackage.akgu akguVarA = orv.a(akfxVar, strExtractNetworkPortion, akfg.b(hkdVar.h));
        if (akguVarA != null) {
            return akfxVar.x(akguVarA, 1);
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [aolr, java.lang.Object] */
    public final java.lang.Object c(defpackage.snm snmVar, aoln aolnVar) {
        return aoov.aj((aolr) this.b, new defpackage.rka(this, snmVar, (aoln) null, 15), aolnVar);
    }

    public sgi(android.content.Context context, ajct ajctVar) {
        this.a = context;
        this.b = ajctVar;
    }

    public sgi(aogc aogcVar, ahbv ahbvVar) {
        aooh.f(ahbvVar, "dialerPhoneNumbers");
        this.a = aogcVar;
        this.b = ahbvVar;
    }

    public sgi(defpackage.sgh sghVar, ucm ucmVar) {
        aooh.f(ucmVar, "tikTokAlertDialogs");
        this.a = sghVar;
        this.b = ucmVar;
    }

    public sgi(defpackage.uyg uygVar, aolr aolrVar) {
        aooh.f(aolrVar, "lightweightContext");
        this.a = uygVar;
        this.b = aolrVar;
    }
}
