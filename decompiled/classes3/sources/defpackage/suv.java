package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class suv {
    private static final aimz c = aimz.i("com/android/dialer/preferredsim/impl/simselector/SimSelectorDialogOptionsProvider");
    public final aolr a;
    public final nvw b;
    private final android.content.Context d;
    private final zjs e;
    private final kvt f;

    public suv(android.content.Context context, aolr aolrVar, zjs zjsVar, kvt kvtVar, nvw nvwVar) {
        aooh.f(context, "appContext");
        aooh.f(aolrVar, "lightweightContext");
        aooh.f(zjsVar, "dialerTelecom");
        aooh.f(kvtVar, "activeCalls");
        aooh.f(nvwVar, "canSelectSim");
        this.d = context;
        this.a = aolrVar;
        this.e = zjsVar;
        this.f = kvtVar;
        this.b = nvwVar;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:33:0x00de  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(aoln aolnVar) {
        defpackage.sut sutVar;
        android.telecom.PhoneAccount phoneAccount;
        if (aolnVar instanceof defpackage.sut) {
            sutVar = (defpackage.sut) aolnVar;
            int i = sutVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                sutVar.c = i - Integer.MIN_VALUE;
            } else {
                sutVar = new defpackage.sut(this, aolnVar);
            }
        } else {
            sutVar = new defpackage.sut(this, aolnVar);
        }
        java.lang.Object objD = sutVar.a;
        aolu aoluVar = aolu.a;
        int i2 = sutVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                aooc.af(objD);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objD);
            }
            phoneAccount = (android.telecom.PhoneAccount) objD;
            if (phoneAccount != null) {
                c.c().m(aioa.b).i(zct.b).l("com/android/dialer/preferredsim/impl/simselector/SimSelectorDialogOptionsProvider", "getHintForOtherSimInUse", 130, "SimSelectorDialogOptionsProvider.kt").v("phone account not found");
                return null;
            }
            return this.d.getString(2132019788, phoneAccount.getLabel().toString());
        }
        aooc.af(objD);
        ajcq ajcqVarH = this.f.h();
        sutVar.c = 1;
        objD = aosv.D(ajcqVarH, sutVar);
        if (objD == aoluVar) {
            return aoluVar;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : (java.lang.Iterable) objD) {
            if (((hla) obj).a().isPresent()) {
                arrayList.add(obj);
            }
        }
        hla hlaVar = (hla) ajsz.bG(arrayList);
        if (hlaVar == null) {
            c.c().m(aioa.b).i(zct.b).l("com/android/dialer/preferredsim/impl/simselector/SimSelectorDialogOptionsProvider", "getHintForOtherSimInUse", 120, "SimSelectorDialogOptionsProvider.kt").v("active calls no longer exist");
        } else {
            zjs zjsVar = this.e;
            android.telecom.PhoneAccountHandle phoneAccountHandle = (android.telecom.PhoneAccountHandle) aooh.q(hlaVar.a());
            sutVar.c = 2;
            objD = zjsVar.p(phoneAccountHandle, sutVar);
            if (objD == aoluVar) {
                return aoluVar;
            }
            phoneAccount = (android.telecom.PhoneAccount) objD;
            if (phoneAccount != null) {
                return this.d.getString(2132019788, phoneAccount.getLabel().toString());
            }
            c.c().m(aioa.b).i(zct.b).l("com/android/dialer/preferredsim/impl/simselector/SimSelectorDialogOptionsProvider", "getHintForOtherSimInUse", 130, "SimSelectorDialogOptionsProvider.kt").v("phone account not found");
        }
        return null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(android.telecom.PhoneAccountHandle phoneAccountHandle, nvr nvrVar, defpackage.alin alinVar, aoln aolnVar) throws aois {
        defpackage.sus susVar;
        java.lang.Object string;
        vk vkVar;
        vk vkVar2;
        if (aolnVar instanceof defpackage.sus) {
            susVar = (defpackage.sus) aolnVar;
            int i = susVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                susVar.c = i - Integer.MIN_VALUE;
            } else {
                susVar = new defpackage.sus(this, aolnVar);
            }
        } else {
            susVar = new defpackage.sus(this, aolnVar);
        }
        java.lang.Object obj = susVar.a;
        aolu aoluVar = aolu.a;
        int i2 = susVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            aooh.f(phoneAccountHandle, "phoneAccountHandle");
            akzx akzxVarP = mni.bS(lvl.a.m()).R().p();
            mni.bO(akzxVarP, phoneAccountHandle);
            lvl lvlVarP = akzxVarP.p();
            aooh.e(lvlVarP, "build(...)");
            vk vkVarBS = mni.bS(lvlVarP.p());
            boolean z = nvrVar == nvr.a;
            akzx akzxVar = (akzx) vkVarBS.a;
            akzxVar.u();
            lvl lvlVar = akzxVar.b;
            lvlVar.b |= 8;
            lvlVar.f = z;
            susVar.d = vkVarBS;
            susVar.e = vkVarBS;
            susVar.c = 1;
            int iOrdinal = nvrVar.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    string = a(susVar);
                } else if (iOrdinal == 2) {
                    string = this.d.getString(2132019789);
                } else if (iOrdinal == 3) {
                    string = this.d.getString(2132019790);
                } else {
                    if (iOrdinal != 4) {
                        throw new aois();
                    }
                    string = this.d.getString(2132019787);
                }
            } else if (alinVar == null || !aooh.n(alinVar.c, phoneAccountHandle)) {
                string = null;
            } else {
                java.lang.Object obj2 = alinVar.b;
                if (obj2 == defpackage.svi.b) {
                    string = this.d.getString(2132019786);
                } else if (obj2 == defpackage.svi.c) {
                    string = this.d.getString(2132019785);
                } else {
                    c.d().i(zct.b).l("com/android/dialer/preferredsim/impl/simselector/SimSelectorDialogOptionsProvider", "getHintForCanSelect", 103, "SimSelectorDialogOptionsProvider.kt").y("unhandled reason %s", obj2);
                    string = null;
                }
            }
            if (string == aoluVar) {
                return aoluVar;
            }
            vkVar = vkVarBS;
            obj = string;
            vkVar2 = vkVar;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            vkVar2 = susVar.e;
            vkVar = susVar.d;
            aooc.af(obj);
        }
        java.lang.String str = (java.lang.String) obj;
        if (str != null) {
            akzx akzxVar2 = (akzx) vkVar2.a;
            akzxVar2.u();
            lvl lvlVar2 = akzxVar2.b;
            lvl lvlVar3 = lvl.a;
            j$.util.Objects.requireNonNull(str);
            lvlVar2.b |= 4;
            lvlVar2.e = str;
        }
        return vkVar.R();
    }
}
