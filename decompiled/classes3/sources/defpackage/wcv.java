package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wcv implements defpackage.waj {
    public final defpackage.ysb a;
    private final mnj b;
    private final mnk c;
    private final aoin d;
    private final aoin e;
    private final aolr f;

    public wcv(mnj mnjVar, mnk mnkVar, aoin aoinVar, aoin aoinVar2, defpackage.ysb ysbVar, aolr aolrVar) {
        aooh.f(aoinVar, "enableDobbyGemini");
        aooh.f(aoinVar2, "enableAgenticCallScreen");
        aooh.f(ysbVar, "aiCoreAvailability");
        aooh.f(aolrVar, "blockingContext");
        this.b = mnjVar;
        this.c = mnkVar;
        this.d = aoinVar;
        this.e = aoinVar2;
        this.a = ysbVar;
        this.f = aolrVar;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x006a  */
    /* JADX WARN: Code duplicated, block: B:33:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:34:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:36:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:38:0x0113  */
    /* JADX WARN: Code duplicated, block: B:40:0x0121  */
    /* JADX WARN: Code duplicated, block: B:41:0x013d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.waj
    public final java.lang.Object a(akzx akzxVar, aoln aolnVar) {
        defpackage.wcu wcuVar;
        boolean zA;
        defpackage.yse yseVar;
        akzx akzxVar2;
        boolean z;
        boolean z2;
        mnj mnjVar;
        if (aolnVar instanceof defpackage.wcu) {
            wcuVar = (defpackage.wcu) aolnVar;
            int i = wcuVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                wcuVar.d = i - Integer.MIN_VALUE;
            } else {
                wcuVar = new defpackage.wcu(this, aolnVar);
            }
        } else {
            wcuVar = new defpackage.wcu(this, aolnVar);
        }
        java.lang.Object obj = wcuVar.b;
        aolu aoluVar = aolu.a;
        int i2 = wcuVar.d;
        boolean z3 = false;
        if (i2 == 0) {
            aooc.af(obj);
            zA = this.b.a();
            if (!zA || !this.c.a()) {
                yseVar = null;
            } else if (((java.lang.Boolean) this.e.a()).booleanValue()) {
                yseVar = defpackage.yse.i;
            } else if (((java.lang.Boolean) this.d.a()).booleanValue()) {
                yseVar = defpackage.yse.f;
            } else {
                yseVar = null;
            }
            if (yseVar == null) {
                z2 = false;
            } else {
                aolr aolrVar = this.f;
                defpackage.vjf vjfVar = new defpackage.vjf(this, yseVar, (aoln) null, 10);
                wcuVar.e = akzxVar;
                wcuVar.a = zA;
                wcuVar.d = 1;
                java.lang.Object objAj = aoov.aj(aolrVar, vjfVar, wcuVar);
                if (objAj == aoluVar) {
                    return aoluVar;
                }
                akzxVar2 = akzxVar;
                z = zA;
                obj = objAj;
            }
            akzx akzxVarM = defpackage.amtc.a.m();
            aooh.f(akzxVarM, "builder");
            akzxVarM.u();
            defpackage.amtc amtcVar = (defpackage.amtc) akzxVarM.b;
            amtcVar.b |= 1;
            amtcVar.c = zA;
            mnjVar = this.b;
            boolean zB = mnjVar.b();
            akzxVarM.u();
            defpackage.amtc amtcVar2 = (defpackage.amtc) akzxVarM.b;
            amtcVar2.b |= 2;
            amtcVar2.d = zB;
            if (mnjVar.b()) {
                if (((java.lang.Boolean) mnjVar.b.a()).booleanValue()) {
                    mnj.a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/dobby/clients/winky/enabledfn/WinkyEnabledFn", "isPhaseThreeEnabled", 94, "WinkyEnabledFn.kt").v("enabled by feature flag ENABLE_WINKY_FULL_FUNCTIONALITY");
                } else if (((java.lang.Boolean) mnjVar.c.a()).booleanValue()) {
                    mnj.a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/dobby/clients/winky/enabledfn/WinkyEnabledFn", "isPhaseThreeEnabled", 102, "WinkyEnabledFn.kt").v("enabled by feature flag ENABLE_WINKY_PHASE_THREE");
                } else {
                    mnj.a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/dobby/clients/winky/enabledfn/WinkyEnabledFn", "isPhaseThreeEnabled", 106, "WinkyEnabledFn.kt").v("Phase three is disabled by flags");
                }
                z3 = true;
            } else {
                mnj.a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/dobby/clients/winky/enabledfn/WinkyEnabledFn", "isPhaseThreeEnabled", 86, "WinkyEnabledFn.kt").v("disabled since Winky Phase Two is not enabled");
            }
            akzxVarM.u();
            defpackage.amtc amtcVar3 = (defpackage.amtc) akzxVarM.b;
            amtcVar3.b |= 4;
            amtcVar3.e = z3;
            akzxVarM.u();
            defpackage.amtc amtcVar4 = (defpackage.amtc) akzxVarM.b;
            amtcVar4.b |= 8;
            amtcVar4.f = z2;
            alad aladVarP = akzxVarM.p();
            aooh.e(aladVarP, "build(...)");
            defpackage.amtc amtcVar5 = (defpackage.amtc) aladVarP;
            akzxVar.u();
            defpackage.amtd amtdVar = (defpackage.amtd) akzxVar.b;
            defpackage.amtd amtdVar2 = defpackage.amtd.a;
            j$.util.Objects.requireNonNull(amtcVar5);
            amtdVar.f = amtcVar5;
            amtdVar.b |= 8;
            return aojh.a;
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        z = wcuVar.a;
        akzxVar2 = wcuVar.e;
        aooc.af(obj);
        boolean zBooleanValue = ((java.lang.Boolean) obj).booleanValue();
        zA = z;
        akzxVar = akzxVar2;
        z2 = zBooleanValue;
        akzx akzxVarM2 = defpackage.amtc.a.m();
        aooh.f(akzxVarM2, "builder");
        akzxVarM2.u();
        defpackage.amtc amtcVar6 = (defpackage.amtc) akzxVarM2.b;
        amtcVar6.b |= 1;
        amtcVar6.c = zA;
        mnjVar = this.b;
        boolean zB2 = mnjVar.b();
        akzxVarM2.u();
        defpackage.amtc amtcVar7 = (defpackage.amtc) akzxVarM2.b;
        amtcVar7.b |= 2;
        amtcVar7.d = zB2;
        if (mnjVar.b()) {
            mnj.a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/dobby/clients/winky/enabledfn/WinkyEnabledFn", "isPhaseThreeEnabled", 86, "WinkyEnabledFn.kt").v("disabled since Winky Phase Two is not enabled");
        } else {
            if (((java.lang.Boolean) mnjVar.b.a()).booleanValue()) {
                mnj.a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/dobby/clients/winky/enabledfn/WinkyEnabledFn", "isPhaseThreeEnabled", 94, "WinkyEnabledFn.kt").v("enabled by feature flag ENABLE_WINKY_FULL_FUNCTIONALITY");
            } else if (((java.lang.Boolean) mnjVar.c.a()).booleanValue()) {
                mnj.a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/dobby/clients/winky/enabledfn/WinkyEnabledFn", "isPhaseThreeEnabled", 102, "WinkyEnabledFn.kt").v("enabled by feature flag ENABLE_WINKY_PHASE_THREE");
            } else {
                mnj.a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/dobby/clients/winky/enabledfn/WinkyEnabledFn", "isPhaseThreeEnabled", 106, "WinkyEnabledFn.kt").v("Phase three is disabled by flags");
            }
            z3 = true;
        }
        akzxVarM2.u();
        defpackage.amtc amtcVar8 = (defpackage.amtc) akzxVarM2.b;
        amtcVar8.b |= 4;
        amtcVar8.e = z3;
        akzxVarM2.u();
        defpackage.amtc amtcVar9 = (defpackage.amtc) akzxVarM2.b;
        amtcVar9.b |= 8;
        amtcVar9.f = z2;
        alad aladVarP2 = akzxVarM2.p();
        aooh.e(aladVarP2, "build(...)");
        defpackage.amtc amtcVar10 = (defpackage.amtc) aladVarP2;
        akzxVar.u();
        defpackage.amtd amtdVar3 = (defpackage.amtd) akzxVar.b;
        defpackage.amtd amtdVar4 = defpackage.amtd.a;
        j$.util.Objects.requireNonNull(amtcVar10);
        amtdVar3.f = amtcVar10;
        amtdVar3.b |= 8;
        return aojh.a;
    }
}
