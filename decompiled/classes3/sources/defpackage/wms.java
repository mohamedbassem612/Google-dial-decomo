package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wms extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;
    private final amzg f;
    private final amzg g;
    private final amzg h;
    private final amzg i;
    private final amzg j;
    private final amzg k;
    private final amzg l;
    private final amzg m;

    public wms(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4, amzg amzgVar5, amzg amzgVar6, amzg amzgVar7, amzg amzgVar8, amzg amzgVar9, amzg amzgVar10, amzg amzgVar11, amzg amzgVar12) {
        super(amyzVar2, new defpackage.amzw(defpackage.wms.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amzs.b(amzgVar4);
        this.f = amzs.b(amzgVar5);
        this.g = amzs.b(amzgVar6);
        this.h = amzs.b(amzgVar7);
        this.i = amzs.b(amzgVar8);
        this.j = amzs.b(amzgVar9);
        this.k = amzs.b(amzgVar10);
        this.l = amzs.b(amzgVar11);
        this.m = amzs.b(amzgVar12);
    }

    /* JADX WARN: Code duplicated, block: B:109:0x0271  */
    /* JADX WARN: Code duplicated, block: B:150:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:153:0x0313  */
    /* JADX WARN: Code duplicated, block: B:156:0x032d  */
    /* JADX WARN: Code duplicated, block: B:159:0x0358  */
    public final /* synthetic */ ajcq b(java.lang.Object obj) {
        defpackage.wpd wpdVar;
        int i;
        int size;
        boolean z;
        int i2;
        defpackage.wlc wlcVar;
        alat alatVar;
        defpackage.wlm wlmVar;
        defpackage.wlm wlmVar2;
        java.util.List list = (java.util.List) obj;
        java.lang.String str = (java.lang.String) list.get(1);
        int i3 = 2;
        boolean zBooleanValue = ((java.lang.Boolean) list.get(2)).booleanValue();
        boolean zBooleanValue2 = ((java.lang.Boolean) list.get(3)).booleanValue();
        aify aifyVar = (aify) list.get(4);
        aify aifyVar2 = (aify) list.get(5);
        j$.util.Optional optional = (j$.util.Optional) list.get(6);
        j$.util.Optional optional2 = (j$.util.Optional) list.get(7);
        defpackage.wki wkiVar = (defpackage.wki) list.get(8);
        defpackage.wow wowVar = (defpackage.wow) list.get(9);
        defpackage.abtr abtrVar = (defpackage.abtr) list.get(10);
        java.util.List list2 = (java.util.List) list.get(11);
        defpackage.wpg wpgVar = abtrVar.n().c;
        if (wpgVar == null) {
            wpgVar = defpackage.wpg.a;
        }
        switch (wpgVar.d) {
            case 0:
                wpdVar = defpackage.wpd.PROMPT_NONE;
                break;
            case 1:
                wpdVar = defpackage.wpd.HOLD_FOR_ME_WAITING_TO_ACTIVATE;
                break;
            case 2:
                wpdVar = defpackage.wpd.LOW_QUALITY_TRANSCRIPT;
                break;
            case 3:
                wpdVar = defpackage.wpd.AUDIO_ERROR;
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                wpdVar = defpackage.wpd.HUMAN_AGENT_DETECTED;
                break;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                wpdVar = defpackage.wpd.CONNECTING_TO_HUMAN_AGENT;
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                wpdVar = defpackage.wpd.HOLD_DETECTED;
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                wpdVar = defpackage.wpd.PIPELINE_ERROR;
                break;
            default:
                wpdVar = null;
                break;
        }
        if (wpdVar == null) {
            wpdVar = defpackage.wpd.UNRECOGNIZED;
        }
        akzx akzxVarM = defpackage.wlc.a.m();
        akzxVarM.u();
        defpackage.wlc wlcVar2 = (defpackage.wlc) akzxVarM.b;
        j$.util.Objects.requireNonNull(str);
        wlcVar2.b |= 1;
        wlcVar2.c = str;
        akzxVarM.u();
        defpackage.wlc wlcVar3 = (defpackage.wlc) akzxVarM.b;
        wlcVar3.b |= 2;
        wlcVar3.d = zBooleanValue;
        akzxVarM.u();
        defpackage.wlc wlcVar4 = (defpackage.wlc) akzxVarM.b;
        j$.util.Objects.requireNonNull(wkiVar);
        wlcVar4.f = wkiVar;
        wlcVar4.b |= 4;
        boolean z2 = wpdVar == defpackage.wpd.PIPELINE_ERROR;
        akzxVarM.u();
        defpackage.wlc wlcVar5 = (defpackage.wlc) akzxVarM.b;
        wlcVar5.b |= 2048;
        wlcVar5.p = z2;
        boolean z3 = wpdVar == defpackage.wpd.LOW_QUALITY_TRANSCRIPT;
        akzxVarM.u();
        defpackage.wlc wlcVar6 = (defpackage.wlc) akzxVarM.b;
        wlcVar6.b |= 32;
        wlcVar6.j = z3;
        boolean z4 = wpdVar == defpackage.wpd.AUDIO_ERROR;
        akzxVarM.u();
        defpackage.wlc wlcVar7 = (defpackage.wlc) akzxVarM.b;
        wlcVar7.b |= 1024;
        wlcVar7.o = z4;
        boolean z5 = wpdVar == defpackage.wpd.HUMAN_AGENT_DETECTED;
        akzxVarM.u();
        defpackage.wlc wlcVar8 = (defpackage.wlc) akzxVarM.b;
        wlcVar8.b |= 64;
        wlcVar8.k = z5;
        boolean z6 = wpdVar == defpackage.wpd.CONNECTING_TO_HUMAN_AGENT;
        akzxVarM.u();
        defpackage.wlc wlcVar9 = (defpackage.wlc) akzxVarM.b;
        wlcVar9.b |= 512;
        wlcVar9.n = z6;
        boolean z7 = wpdVar == defpackage.wpd.HOLD_DETECTED && zBooleanValue2;
        akzxVarM.u();
        defpackage.wlc wlcVar10 = (defpackage.wlc) akzxVarM.b;
        wlcVar10.b |= 128;
        wlcVar10.l = z7;
        boolean z8 = wpdVar == defpackage.wpd.HOLD_FOR_ME_WAITING_TO_ACTIVATE;
        akzxVarM.u();
        defpackage.wlc wlcVar11 = (defpackage.wlc) akzxVarM.b;
        wlcVar11.b |= 256;
        wlcVar11.m = z8;
        akzxVarM.u();
        defpackage.wlc wlcVar12 = (defpackage.wlc) akzxVarM.b;
        alat alatVar2 = wlcVar12.h;
        if (!alatVar2.c()) {
            wlcVar12.h = alad.J(alatVar2);
        }
        akyl.i(aifyVar2, wlcVar12.h);
        akzxVarM.u();
        defpackage.wlc wlcVar13 = (defpackage.wlc) akzxVarM.b;
        alat alatVar3 = wlcVar13.e;
        if (!alatVar3.c()) {
            wlcVar13.e = alad.J(alatVar3);
        }
        akyl.i(aifyVar, wlcVar13.e);
        akzxVarM.u();
        defpackage.wlc wlcVar14 = (defpackage.wlc) akzxVarM.b;
        wlcVar14.q = wowVar.a();
        wlcVar14.b |= 4096;
        defpackage.wow wowVar2 = defpackage.wow.INTRO_FOR_IVR_DATA;
        int i4 = -1;
        if (wowVar == wowVar2) {
            if (aifyVar.isEmpty()) {
                size = -1;
                i = -1;
            } else {
                size = aifyVar.size() - 1;
                int size2 = aifyVar.size() - 1;
                while (true) {
                    if (size2 >= 0) {
                        defpackage.wlf wlfVar = (defpackage.wlf) aifyVar.get(size2);
                        defpackage.wmz wmzVar = wlfVar.c == 2 ? (defpackage.wmz) wlfVar.d : defpackage.wmz.a;
                        if ((wmzVar.b & 2) != 0) {
                            long j = wmzVar.f;
                            defpackage.wlf wlfVar2 = (defpackage.wlf) aifyVar.get(size);
                            i = i4;
                            if (j == (wlfVar2.c == 2 ? (defpackage.wmz) wlfVar2.d : defpackage.wmz.a).f) {
                                size = size2;
                            }
                        } else {
                            i = i4;
                        }
                        size2--;
                        i4 = i;
                    } else {
                        i = i4;
                    }
                }
                defpackage.wlf wlfVar3 = (defpackage.wlf) aifyVar.get(size);
                if (((wlfVar3.c == 2 ? (defpackage.wmz) wlfVar3.d : defpackage.wmz.a).b & 2) == 0) {
                }
            }
            akzxVarM.u();
            defpackage.wlc wlcVar15 = (defpackage.wlc) akzxVarM.b;
            wlcVar15.b |= 8192;
            wlcVar15.r = size;
            if (wowVar == wowVar2 || aifyVar.isEmpty()) {
                z = false;
            } else {
                int size3 = aifyVar.size();
                int i5 = 0;
                long j2 = -1;
                while (true) {
                    if (i5 < size3) {
                        defpackage.wlf wlfVar4 = (defpackage.wlf) aifyVar.get(i5);
                        if (((wlfVar4.c == i3 ? (defpackage.wmz) wlfVar4.d : defpackage.wmz.a).b & i3) != 0) {
                            long j3 = (wlfVar4.c == i3 ? (defpackage.wmz) wlfVar4.d : defpackage.wmz.a).f;
                            if (j2 == -1 || j3 == j2) {
                                j2 = j3;
                            } else {
                                z = true;
                            }
                        }
                        i5++;
                        i3 = 2;
                    } else {
                        z = false;
                    }
                }
            }
            akzxVarM.u();
            defpackage.wlc wlcVar16 = (defpackage.wlc) akzxVarM.b;
            wlcVar16.b |= 16384;
            wlcVar16.s = z;
            if (wowVar == wowVar2 || aifyVar.isEmpty()) {
                i2 = i;
            } else {
                int size4 = aifyVar.size() + i;
                while (true) {
                    if (size4 >= 0) {
                        defpackage.wlf wlfVar5 = (defpackage.wlf) aifyVar.get(size4);
                        defpackage.wmz wmzVar2 = wlfVar5.c == 2 ? (defpackage.wmz) wlfVar5.d : defpackage.wmz.a;
                        int i6 = wmzVar2.c;
                        int I = wsc.I(i6);
                        int i7 = I - 1;
                        if (I == 0) {
                            throw null;
                        }
                        if (i7 == 0) {
                            if (wsc.M((i6 == 2 ? (defpackage.wnc) wmzVar2.d : defpackage.wnc.a).e)) {
                                i2 = size4;
                            } else {
                                size4--;
                            }
                        } else if (i7 != 1) {
                            if (i7 != 3) {
                                continue;
                            } else {
                                if (wsc.M((i6 == 5 ? (defpackage.wng) wmzVar2.d : defpackage.wng.a).e)) {
                                    i2 = size4;
                                }
                            }
                            size4--;
                        } else {
                            if (wsc.M((i6 == 3 ? (defpackage.wnb) wmzVar2.d : defpackage.wnb.a).g)) {
                                i2 = size4;
                            } else {
                                size4--;
                            }
                        }
                    } else {
                        i2 = i;
                    }
                }
            }
            akzxVarM.u();
            defpackage.wlc wlcVar17 = (defpackage.wlc) akzxVarM.b;
            wlcVar17.b |= 32768;
            wlcVar17.t = i2;
            akzxVarM.u();
            wlcVar = (defpackage.wlc) akzxVarM.b;
            alatVar = wlcVar.u;
            if (!alatVar.c()) {
                wlcVar.u = alad.J(alatVar);
            }
            akyl.i(list2, wlcVar.u);
            j$.util.Objects.requireNonNull(akzxVarM);
            wlmVar = new defpackage.wlm(akzxVarM, 1);
            if (true == optional.isPresent()) {
                java.lang.Object obj2 = optional.get();
                akzx akzxVar = (akzx) wlmVar.a;
                akzxVar.u();
                defpackage.wlc wlcVar18 = (defpackage.wlc) akzxVar.b;
                wlcVar18.g = ((defpackage.whe) obj2).d;
                wlcVar18.b |= 8;
            }
            j$.util.Objects.requireNonNull(akzxVarM);
            wlmVar2 = new defpackage.wlm(akzxVarM, 0);
            if (true == optional2.isPresent()) {
                defpackage.whg whgVar = (defpackage.whg) optional2.get();
                akzx akzxVar2 = (akzx) wlmVar2.a;
                akzxVar2.u();
                defpackage.wlc wlcVar19 = (defpackage.wlc) akzxVar2.b;
                j$.util.Objects.requireNonNull(whgVar);
                wlcVar19.i = whgVar;
                wlcVar19.b |= 16;
            }
            return aiql.z(j$.util.Optional.of((defpackage.wlc) akzxVarM.p()));
        }
        i = -1;
        size = i;
        akzxVarM.u();
        defpackage.wlc wlcVar110 = (defpackage.wlc) akzxVarM.b;
        wlcVar110.b |= 8192;
        wlcVar110.r = size;
        if (wowVar == wowVar2) {
            z = false;
        } else {
            z = false;
        }
        akzxVarM.u();
        defpackage.wlc wlcVar111 = (defpackage.wlc) akzxVarM.b;
        wlcVar111.b |= 16384;
        wlcVar111.s = z;
        if (wowVar == wowVar2) {
            i2 = i;
        } else {
            i2 = i;
        }
        akzxVarM.u();
        defpackage.wlc wlcVar112 = (defpackage.wlc) akzxVarM.b;
        wlcVar112.b |= 32768;
        wlcVar112.t = i2;
        akzxVarM.u();
        wlcVar = (defpackage.wlc) akzxVarM.b;
        alatVar = wlcVar.u;
        if (!alatVar.c()) {
            wlcVar.u = alad.J(alatVar);
        }
        akyl.i(list2, wlcVar.u);
        j$.util.Objects.requireNonNull(akzxVarM);
        wlmVar = new defpackage.wlm(akzxVarM, 1);
        if (true == optional.isPresent()) {
            java.lang.Object obj3 = optional.get();
            akzx akzxVar3 = (akzx) wlmVar.a;
            akzxVar3.u();
            defpackage.wlc wlcVar113 = (defpackage.wlc) akzxVar3.b;
            wlcVar113.g = ((defpackage.whe) obj3).d;
            wlcVar113.b |= 8;
        }
        j$.util.Objects.requireNonNull(akzxVarM);
        wlmVar2 = new defpackage.wlm(akzxVarM, 0);
        if (true == optional2.isPresent()) {
            defpackage.whg whgVar2 = (defpackage.whg) optional2.get();
            akzx akzxVar4 = (akzx) wlmVar2.a;
            akzxVar4.u();
            defpackage.wlc wlcVar114 = (defpackage.wlc) akzxVar4.b;
            j$.util.Objects.requireNonNull(whgVar2);
            wlcVar114.i = whgVar2;
            wlcVar114.b |= 16;
        }
        return aiql.z(j$.util.Optional.of((defpackage.wlc) akzxVarM.p()));
    }

    protected final ajcq c() {
        amzg amzgVar = this.m;
        amzg amzgVar2 = this.l;
        amzg amzgVar3 = this.k;
        amzg amzgVar4 = this.j;
        amzg amzgVar5 = this.i;
        amzg amzgVar6 = this.h;
        amzg amzgVar7 = this.g;
        amzg amzgVar8 = this.f;
        amzg amzgVar9 = this.e;
        amzg amzgVar10 = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar10.d(), amzgVar9.d(), amzgVar8.d(), amzgVar7.d(), amzgVar6.d(), amzgVar5.d(), amzgVar4.d(), amzgVar3.d(), amzgVar2.d(), amzgVar.d()});
    }
}
