package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class vvz {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/voicemail/tab/impl/mainscreenintegration/VoicemailTabRetainedState");
    public final defpackage.vtv b;
    public final defpackage.zrw c;
    public final defpackage.ojo d;
    public final defpackage.aoss e;
    public final defpackage.aolr f;
    public final defpackage.aoin g;
    public boolean h;
    public defpackage.vvr i;
    public final defpackage.vtp j;
    public final defpackage.vze k;
    public final defpackage.afhf l;
    public final defpackage.zjm m;
    public final defpackage.ahda n;
    public final defpackage.zzx o;
    private final defpackage.ajct p;

    public vvz(defpackage.vtp vtpVar, defpackage.vze vzeVar, defpackage.vtv vtvVar, defpackage.zrw zrwVar, defpackage.zjm zjmVar, defpackage.ojo ojoVar, defpackage.apni apniVar, defpackage.afhf afhfVar, defpackage.aoss aossVar, defpackage.aolr aolrVar, defpackage.ajct ajctVar, defpackage.aoin aoinVar, defpackage.zzx zzxVar) {
        if (ojoVar == null) {
            defpackage.aooh.i("dialerContentResolver");
        }
        if (apniVar == null) {
            defpackage.aooh.i("androidJobs");
        }
        if (afhfVar == null) {
            defpackage.aooh.i("voicemailTabPersistedStateDataStore");
        }
        if (aossVar == null) {
            defpackage.aooh.i("activityRetainedCoroutineScope");
        }
        if (aolrVar == null) {
            defpackage.aooh.i("lightweightContext");
        }
        if (ajctVar == null) {
            defpackage.aooh.i("lightweightExecutor");
        }
        if (aoinVar == null) {
            defpackage.aooh.i("debounceTimeoutMillis");
        }
        this.j = vtpVar;
        this.k = vzeVar;
        this.b = vtvVar;
        this.c = zrwVar;
        this.m = zjmVar;
        this.d = ojoVar;
        this.l = afhfVar;
        this.e = aossVar;
        this.f = aolrVar;
        this.p = ajctVar;
        this.g = aoinVar;
        this.o = zzxVar;
        this.n = new defpackage.ahda((byte[]) null);
        this.i = new defpackage.vvr(true, 0, true);
    }

    public final defpackage.ajcq a(boolean z) {
        return defpackage.aosv.F(this.e, 0, new vvx(this, z, (defpackage.aoln) null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(final boolean z, defpackage.aoln aolnVar) {
        defpackage.vvw vvwVar;
        if (aolnVar instanceof defpackage.vvw) {
            vvwVar = (defpackage.vvw) aolnVar;
            int i = vvwVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                vvwVar.c = i - Integer.MIN_VALUE;
            } else {
                vvwVar = new defpackage.vvw(this, aolnVar);
            }
        } else {
            vvwVar = new defpackage.vvw(this, aolnVar);
        }
        java.lang.Object obj = vvwVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = vvwVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            if (!this.o.m()) {
                final int i3 = 8;
                defpackage.ajcq ajcqVarA = this.l.a(new defpackage.vuj(new defpackage.aonj() { // from class: skg
                    @Override // defpackage.aonj
                    public final java.lang.Object a(java.lang.Object obj2) {
                        switch (i3) {
                            case 0:
                                skp skpVar = (skp) obj2;
                                defpackage.aooh.f(skpVar, "uiModel");
                                defpackage.akzx akzxVarL = skpVar.L();
                                akzxVarL.u();
                                skp skpVar2 = akzxVarL.b;
                                skpVar2.b |= 32;
                                skpVar2.h = z;
                                skp skpVarR = akzxVarL.r();
                                defpackage.aooh.e(skpVarR, "build(...)");
                                return skpVarR;
                            case 1:
                                mmg mmgVar = (mmg) obj2;
                                defpackage.aooh.f(mmgVar, "data");
                                vk vkVarAa = defpackage.mni.aa(mmgVar.L());
                                vkVarAa.N(z);
                                return vkVarAa.M();
                            case 2:
                                skp skpVar3 = (skp) obj2;
                                defpackage.aooh.f(skpVar3, "uiModel");
                                rze rzeVarI = defpackage.snl.i(skpVar3.L());
                                defpackage.akzx akzxVar = (defpackage.akzx) rzeVarI.a;
                                akzxVar.u();
                                skp skpVar4 = akzxVar.b;
                                skpVar4.b |= 524288;
                                skpVar4.t = z;
                                return rzeVarI.b();
                            case 3:
                                skp skpVar5 = (skp) obj2;
                                defpackage.aooh.f(skpVar5, "uiModel");
                                rze rzeVarI2 = defpackage.snl.i(skpVar5.L());
                                defpackage.akzx akzxVar2 = (defpackage.akzx) rzeVarI2.a;
                                akzxVar2.u();
                                skp skpVar6 = akzxVar2.b;
                                skpVar6.b |= 8192;
                                skpVar6.o = z;
                                return rzeVarI2.b();
                            case 4:
                                skp skpVar7 = (skp) obj2;
                                defpackage.aooh.f(skpVar7, "uiModel");
                                rze rzeVarI3 = defpackage.snl.i(skpVar7.L());
                                defpackage.akzx akzxVar3 = (defpackage.akzx) rzeVarI3.a;
                                akzxVar3.u();
                                skp skpVar8 = akzxVar3.b;
                                skpVar8.b |= 32768;
                                skpVar8.p = z;
                                return rzeVarI3.b();
                            case 5:
                                skp skpVar9 = (skp) obj2;
                                defpackage.aooh.f(skpVar9, "uiModel");
                                defpackage.akzx akzxVarL2 = skpVar9.L();
                                akzxVarL2.u();
                                skp skpVar10 = akzxVarL2.b;
                                skpVar10.b |= 4096;
                                skpVar10.n = z;
                                skp skpVarR2 = akzxVarL2.r();
                                defpackage.aooh.e(skpVarR2, "build(...)");
                                return skpVarR2;
                            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                                defpackage.diq diqVar = (defpackage.diq) obj2;
                                java.util.List list = sme.a;
                                defpackage.aooh.f(diqVar, "$this$semantics");
                                defpackage.dfb.p(diqVar, z);
                                return defpackage.aojh.a;
                            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                                defpackage.diq diqVar2 = (defpackage.diq) obj2;
                                java.util.List list2 = sme.a;
                                defpackage.aooh.f(diqVar2, "$this$semantics");
                                if (z) {
                                    defpackage.dfb.g(diqVar2);
                                }
                                return defpackage.aojh.a;
                            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                                defpackage.vvq vvqVar = (defpackage.vvq) obj2;
                                defpackage.aooh.c(vvqVar);
                                defpackage.akzx akzxVarL3 = vvqVar.L();
                                defpackage.aooh.f(akzxVarL3, "builder");
                                akzxVarL3.u();
                                ((defpackage.vvq) akzxVarL3.b).b = z;
                                defpackage.alad aladVarR = akzxVarL3.r();
                                defpackage.aooh.e(aladVarR, "build(...)");
                                return (defpackage.vvq) aladVarR;
                            default:
                                alvf alvfVar = (alvf) obj2;
                                defpackage.aooh.f(alvfVar, "turn");
                                if (z) {
                                    return alvfVar.f == 1 ? alvg.o(alvfVar) : "[Remote] ***\n";
                                }
                                return alvg.o(alvfVar);
                        }
                    }
                }, 10), this.p);
                vvwVar.c = 1;
                if (defpackage.aosv.D(ajcqVarA, vvwVar) == aoluVar) {
                    return aoluVar;
                }
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(obj);
        }
        return defpackage.aojh.a;
    }
}
