package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class bpd implements aonj {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ long a;

    public /* synthetic */ bpd(long j, int i) {
        this.$cid = i;
        this.a = j;
    }

    public final java.lang.Object a(java.lang.Object obj) {
        aosb aosbVar;
        java.lang.Object aoivVar;
        wyz wyzVar = null;
        switch (this.$cid) {
            case 0:
                csj csjVar = (csj) obj;
                csjVar.r(this.a, 4294967295L & ((long) java.lang.Float.floatToRawIntBits(csjVar.dl(1.0f) / 2.0f)), (((long) java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat((int) (csjVar.o() >> 32)))) << 32) | (((long) java.lang.Float.floatToRawIntBits(csjVar.dl(1.0f) / 2.0f)) & 4294967295L), csjVar.dl(1.0f), 0);
                return aojh.a;
            case 1:
                csj csjVar2 = (csj) obj;
                csjVar2.r(this.a, ((long) java.lang.Float.floatToRawIntBits(csjVar2.dl(1.0f) / 2.0f)) << 32, (((long) java.lang.Float.floatToRawIntBits(csjVar2.dl(1.0f) / 2.0f)) << 32) | (((long) java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat((int) (csjVar2.o() & 4294967295L)))) & 4294967295L), csjVar2.dl(1.0f), 0);
                return aojh.a;
            case 2:
                defpackage.cai caiVar = (defpackage.cai) obj;
                aonj aonjVar = caiVar.b;
                long j = this.a;
                if (aonjVar != null && (aosbVar = caiVar.a) != null) {
                    try {
                        aoivVar = aonjVar.a(java.lang.Long.valueOf(j));
                    } catch (java.lang.Throwable th) {
                        aoivVar = new aoiv(th);
                    }
                    aosbVar.w(aoivVar);
                    break;
                }
                return aojh.a;
            case 3:
                gin ginVarA = ((gjh) obj).a("SELECT * FROM transcript WHERE lastModifiedMillis >= ?");
                try {
                    ginVarA.h(1, this.a);
                    int iS = dzk.S(ginVarA, "id");
                    int iS2 = dzk.S(ginVarA, "conversation");
                    int iS3 = dzk.S(ginVarA, "audioRecordingFilePath");
                    int iS4 = dzk.S(ginVarA, "isRated");
                    int iS5 = dzk.S(ginVarA, "revelioCallType");
                    int iS6 = dzk.S(ginVarA, "lastModifiedMillis");
                    int iS7 = dzk.S(ginVarA, "callScreenFeedbackData");
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    while (ginVarA.m()) {
                        defpackage.lkq lkqVar = new defpackage.lkq();
                        lkqVar.a(ginVarA.l(iS) ? null : ginVarA.e(iS));
                        lkqVar.b = mni.cI(ginVarA.l(iS2) ? null : ginVarA.n(iS2));
                        lkqVar.c = ginVarA.l(iS3) ? null : ginVarA.e(iS3);
                        lkqVar.d = ((int) ginVarA.c(iS4)) != 0;
                        lkqVar.b(mni.cG(ginVarA.l(iS5) ? null : java.lang.Integer.valueOf((int) ginVarA.c(iS5))));
                        lkqVar.f = ginVarA.c(iS6);
                        lkqVar.g = mni.cK(ginVarA.l(iS7) ? null : ginVarA.n(iS7));
                        arrayList.add(lkqVar);
                        break;
                    }
                    return arrayList;
                } finally {
                    ginVarA.close();
                }
            case 4:
                return ((defpackage.mzg) obj).b == this.a ? defpackage.mzb.DOBBY_BUTTON_STATE_SELECTED : defpackage.mzb.DOBBY_BUTTON_STATE_DISABLED;
            case 5:
                return java.lang.Boolean.valueOf(aldf.c(this.a - ((defpackage.ofu) obj).a).b > 900);
            case 6:
                skp skpVar = (skp) obj;
                aooh.f(skpVar, "uiModel");
                rze rzeVarI = snl.i(skpVar.p());
                ryu ryuVarJ = snl.j(rzeVarI.a().p());
                vaa vaaVarC = defpackage.ajee.C(amml.a.m());
                long j2 = this.a;
                vaaVarC.at(cqg.d(j2));
                vaaVarC.as(cqg.c(j2));
                vaaVarC.ar(cqg.b(j2));
                xtq xtqVarK = aknx.K(akzv.a.m());
                xtqVarK.ao(cqg.a(j2));
                vaaVarC.aq(xtqVarK.an());
                amml ammlVarAp = vaaVarC.ap();
                aooh.f(ammlVarAp, "value");
                akzx akzxVar = (akzx) ryuVarJ.a;
                akzxVar.u();
                skn sknVar = akzxVar.b;
                j$.util.Objects.requireNonNull(ammlVarAp);
                sknVar.f = ammlVarAp;
                sknVar.b |= 8;
                rzeVarI.d(ryuVarJ.a());
                return rzeVarI.b();
            case 7:
                skp skpVar2 = (skp) obj;
                aooh.f(skpVar2, "uiModel");
                rze rzeVarI2 = snl.i(skpVar2.p());
                vaa vaaVarC2 = defpackage.ajee.C(amml.a.m());
                long j3 = this.a;
                vaaVarC2.at(cqg.d(j3));
                vaaVarC2.as(cqg.c(j3));
                vaaVarC2.ar(cqg.b(j3));
                xtq xtqVarK2 = aknx.K(akzv.a.m());
                xtqVarK2.ao(cqg.a(j3));
                vaaVarC2.aq(xtqVarK2.an());
                amml ammlVarAp2 = vaaVarC2.ap();
                aooh.f(ammlVarAp2, "value");
                akzx akzxVar2 = (akzx) rzeVarI2.a;
                akzxVar2.u();
                skp skpVar3 = akzxVar2.b;
                j$.util.Objects.requireNonNull(ammlVarAp2);
                skpVar3.e = ammlVarAp2;
                skpVar3.b |= 4;
                return rzeVarI2.b();
            case 8:
                gin ginVarA2 = ((gjh) obj).a("SELECT * FROM AtlasData WHERE callCreationTimeMillis = ?");
                try {
                    ginVarA2.h(1, this.a);
                    int iS8 = dzk.S(ginVarA2, "callCreationTimeMillis");
                    int iS9 = dzk.S(ginVarA2, "lastModifiedTimestampMillis");
                    int iS10 = dzk.S(ginVarA2, "atlasCallDetails");
                    int iS11 = dzk.S(ginVarA2, "detectionMetrics");
                    if (ginVarA2.m()) {
                        wyz wyzVar2 = new wyz();
                        wyzVar2.a = ginVarA2.c(iS8);
                        wyzVar2.b = ginVarA2.c(iS9);
                        wyzVar2.c = wza.a(ginVarA2.l(iS10) ? null : ginVarA2.n(iS10));
                        wyzVar2.d = wza.b(ginVarA2.l(iS11) ? null : ginVarA2.n(iS11));
                        wyzVar = wyzVar2;
                    }
                    return wyzVar;
                } finally {
                    ginVarA2.close();
                }
            case 9:
                gin ginVarA3 = ((gjh) obj).a("SELECT * FROM AtlasData WHERE callCreationTimeMillis < ?");
                try {
                    ginVarA3.h(1, this.a);
                    int iS12 = dzk.S(ginVarA3, "callCreationTimeMillis");
                    int iS13 = dzk.S(ginVarA3, "lastModifiedTimestampMillis");
                    int iS14 = dzk.S(ginVarA3, "atlasCallDetails");
                    int iS15 = dzk.S(ginVarA3, "detectionMetrics");
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    while (ginVarA3.m()) {
                        wyz wyzVar3 = new wyz();
                        wyzVar3.a = ginVarA3.c(iS12);
                        wyzVar3.b = ginVarA3.c(iS13);
                        wyzVar3.c = wza.a(ginVarA3.l(iS14) ? null : ginVarA3.n(iS14));
                        wyzVar3.d = wza.b(ginVarA3.l(iS15) ? null : ginVarA3.n(iS15));
                        arrayList2.add(wyzVar3);
                        break;
                    }
                    return arrayList2;
                } finally {
                    ginVarA3.close();
                }
            case 10:
                gin ginVarA4 = ((gjh) obj).a("SELECT * FROM AtlasData WHERE lastModifiedTimestampMillis > ?");
                try {
                    ginVarA4.h(1, this.a);
                    int iS16 = dzk.S(ginVarA4, "callCreationTimeMillis");
                    int iS17 = dzk.S(ginVarA4, "lastModifiedTimestampMillis");
                    int iS18 = dzk.S(ginVarA4, "atlasCallDetails");
                    int iS19 = dzk.S(ginVarA4, "detectionMetrics");
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    while (ginVarA4.m()) {
                        wyz wyzVar4 = new wyz();
                        wyzVar4.a = ginVarA4.c(iS16);
                        wyzVar4.b = ginVarA4.c(iS17);
                        wyzVar4.c = wza.a(ginVarA4.l(iS18) ? null : ginVarA4.n(iS18));
                        wyzVar4.d = wza.b(ginVarA4.l(iS19) ? null : ginVarA4.n(iS19));
                        arrayList3.add(wyzVar4);
                        break;
                    }
                    return arrayList3;
                } finally {
                    ginVarA4.close();
                }
            default:
                gin ginVarA5 = ((gjh) obj).a("DELETE FROM dialer_has_rcs_data WHERE timestamp_millis < ?");
                try {
                    ginVarA5.h(1, this.a);
                    ginVarA5.m();
                    return aojh.a;
                } finally {
                    ginVarA5.close();
                }
        }
    }
}
