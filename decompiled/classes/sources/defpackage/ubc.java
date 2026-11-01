package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class ubc implements defpackage.ahyc {
    private final /* synthetic */ int $cid;

    public /* synthetic */ ubc(int i) {
        this.$cid = i;
    }

    @Override // defpackage.ahyc
    public final java.lang.Object apply(java.lang.Object obj) {
        int i;
        int i2;
        int i3 = 1;
        switch (this.$cid) {
            case 0:
                boolean z = ((defpackage.uaw) obj).c;
                defpackage.akzx akzxVarM = ubf.a.m();
                akzxVarM.u();
                ubf ubfVar = akzxVarM.b;
                ubfVar.b |= 1;
                ubfVar.c = z;
                return akzxVarM.r();
            case 1:
                return java.lang.Boolean.valueOf(((defpackage.uaw) obj).c);
            case 2:
                return ((ucj) obj).b();
            case 3:
                ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) defpackage.udd.a.c()).i(defpackage.zct.b)).k((java.lang.Throwable) obj)).l("com/android/dialer/spam/calllog/SpamCallDataSource", "handleDeletes", (char) 168, "SpamCallDataSource.java")).v("failed deleting call spam status");
                return null;
            case 4:
                ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) defpackage.udd.a.c()).i(defpackage.zct.b)).k((java.lang.Throwable) obj)).l("com/android/dialer/spam/calllog/SpamCallDataSource", "handleInserts", 't', "SpamCallDataSource.java")).v("failed checking call spam status");
                return defpackage.aikj.b;
            case 5:
                ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) defpackage.udy.a.d()).i(defpackage.zct.b)).k((java.lang.Exception) obj)).l("com/android/dialer/spam/composite/CompositeSpam", "storePatronusCheckSkipReasonCatchingAll", 867, "CompositeSpam.java")).v("Could not save Patronus check skip reason");
                return null;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                uid uidVar = (defpackage.wsc) obj;
                if (uidVar instanceof uid) {
                    ((defpackage.aimw) ((defpackage.aimw) defpackage.udy.a.b()).l("com/android/dialer/spam/composite/CompositeSpam", "readCrossAppSignalFromCallFuture", 935, "CompositeSpam.java")).y("Successfully read cross-app signal: %s", uidVar.a);
                    return uidVar;
                }
                if (uidVar instanceof uib) {
                    ((defpackage.aimw) ((defpackage.aimw) defpackage.udy.a.b()).l("com/android/dialer/spam/composite/CompositeSpam", "readCrossAppSignalFromCallFuture", 938, "CompositeSpam.java")).v("Cross-app signal not found.");
                    return uidVar;
                }
                if (!(uidVar instanceof uia)) {
                    return uidVar;
                }
                ((defpackage.aimw) ((defpackage.aimw) defpackage.udy.a.b()).l("com/android/dialer/spam/composite/CompositeSpam", "readCrossAppSignalFromCallFuture", 940, "CompositeSpam.java")).y("Cross-app signal read failed: %s", new defpackage.aepg((java.lang.Enum) ((uia) uidVar).a));
                return uidVar;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                uie uieVar = (defpackage.wsc) obj;
                if (!(uieVar instanceof uie)) {
                    return null;
                }
                ((defpackage.aimw) ((defpackage.aimw) defpackage.udy.a.b()).l("com/android/dialer/spam/composite/CompositeSpam", "storeCrossAppSignalFromCall", 964, "CompositeSpam.java")).y("Cross-apps signal storage failed: %s", new defpackage.aepg((java.lang.Enum) uieVar.a));
                return null;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                return java.lang.Boolean.FALSE;
            case 9:
                uie uieVar2 = (defpackage.wsc) obj;
                if (!(uieVar2 instanceof uie)) {
                    return null;
                }
                ((defpackage.aimw) ((defpackage.aimw) defpackage.udy.a.b()).l("com/android/dialer/spam/composite/CompositeSpam", "storeCrossAppSignalFromReport", 907, "CompositeSpam.java")).y("Cross-app signal storage failed: %s", new defpackage.aepg((java.lang.Enum) uieVar2.a));
                return null;
            case 10:
                return java.lang.Boolean.valueOf(((java.lang.Long) obj).longValue() != -1);
            case 11:
                return java.lang.Boolean.valueOf(((java.lang.Long) obj).longValue() != -1);
            case 12:
                return java.lang.Boolean.valueOf(((java.lang.Long) obj).longValue() != -1);
            case 13:
                if (!((zdn) obj).a.a.equals("SUSPICIOUS")) {
                    return udn.a;
                }
                long epochMilli = j$.time.Instant.now().toEpochMilli();
                defpackage.udm udmVar = udn.a;
                uzx uzxVarCc = defpackage.wsc.cc(defpackage.udm.a.m());
                uzxVarCc.n(epochMilli);
                uzxVarCc.l(defpackage.udj.SPAM_STATUS_SPAM);
                return uzxVarCc.k();
            case 14:
                ((defpackage.aimw) ((defpackage.aimw) defpackage.uex.a.b()).l("com/android/dialer/spam/inapp/SpamDatabaseUtils", "getGlobalSpamBloomFilterStatusForNormalizedNumber", 220, "SpamDatabaseUtils.java")).v("Bloom filter classification error due to moirai not initialized.");
                return udn.a;
            case 15:
                j$.util.Optional optional = (j$.util.Optional) obj;
                if (true != optional.isPresent()) {
                    return optional;
                }
                defpackage.udj udjVarB = defpackage.udj.b(((ufi) optional.get()).a().d);
                if (udjVarB == null) {
                    udjVarB = defpackage.udj.SPAM_STATUS_UNKNOWN;
                }
                return j$.util.Optional.ofNullable(udjVarB);
            case 16:
                ajdw ajdwVar = (ajdw) obj;
                defpackage.aimz aimzVar = defpackage.uhk.a;
                defpackage.uik uikVarA = defpackage.uin.a();
                int iAR = defpackage.a.aR(ajdwVar.b);
                if (iAR == 0) {
                    iAR = 1;
                }
                uikVarA.c(defpackage.uhk.f(iAR));
                int iAR2 = defpackage.a.aR(ajdwVar.b);
                if (iAR2 == 0) {
                    iAR2 = 1;
                }
                j$.util.Optional optionalEmpty = ajdwVar.d.isEmpty() ? j$.util.Optional.empty() : j$.util.Optional.of(ajdwVar.d);
                defpackage.akzx akzxVarM2 = defpackage.udm.a.m();
                defpackage.udj udjVarF = defpackage.uhk.f(iAR2);
                akzxVarM2.u();
                defpackage.udm udmVar2 = (defpackage.udm) akzxVarM2.b;
                udmVar2.d = udjVarF.f;
                udmVar2.b |= 2;
                int i4 = iAR2 - 2;
                if (i4 != 1) {
                    i = i4 != 2 ? 1 : 2;
                } else {
                    i = 3;
                }
                akzxVarM2.u();
                defpackage.udm udmVar3 = (defpackage.udm) akzxVarM2.b;
                udmVar3.g = i - 1;
                udmVar3.b |= 16;
                int iAR3 = defpackage.a.aR(ajdwVar.c);
                if (iAR3 == 0) {
                    iAR3 = 1;
                }
                int i5 = iAR3 - 2;
                if (i5 != 1) {
                    i2 = i5 != 2 ? 1 : 2;
                } else {
                    i2 = 3;
                }
                akzxVarM2.u();
                defpackage.udm udmVar4 = (defpackage.udm) akzxVarM2.b;
                udmVar4.e = i2 - 1;
                udmVar4.b |= 4;
                defpackage.aimw aimwVar = (defpackage.aimw) ((defpackage.aimw) defpackage.uhk.a.b()).l("com/android/dialer/spam/patronus/PatronusSpam", "buildSpamMetadataFromGetCallerInfoResponse", 467, "PatronusSpam.java");
                ajea ajeaVarB = ajea.b(ajdwVar.e);
                if (ajeaVarB == null) {
                    ajeaVarB = ajea.d;
                }
                aimwVar.y("SuspiciousStatus: %s", ajeaVarB);
                ajea ajeaVarB2 = ajea.b(ajdwVar.e);
                if (ajeaVarB2 == null) {
                    ajeaVarB2 = ajea.d;
                }
                int iOrdinal = ajeaVarB2.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal == 1) {
                        i3 = 2;
                    } else if (iOrdinal == 2) {
                        i3 = 3;
                    } else if (iOrdinal != 3) {
                        throw new java.lang.RuntimeException(null, null);
                    }
                }
                akzxVarM2.u();
                defpackage.udm udmVar5 = (defpackage.udm) akzxVarM2.b;
                udmVar5.h = i3 - 1;
                udmVar5.b |= 32;
                defpackage.uil uilVar = new defpackage.uil();
                uilVar.e((defpackage.udm) akzxVarM2.r());
                defpackage.aooh.f(optionalEmpty, "patronusLiveLookupSessionId");
                uilVar.d = (java.lang.String) defpackage.aooh.q(optionalEmpty);
                uilVar.g = (short) (uilVar.g | 64);
                uikVarA.b(uilVar.a());
                return uikVarA.a();
            case 17:
                return java.lang.Boolean.valueOf(!((uhl) obj).b);
            case 18:
                defpackage.aigf aigfVar = (defpackage.aigf) obj;
                return (defpackage.aigf) j$.util.Collection.-EL.stream(aigfVar.entrySet()).collect(defpackage.aido.b(new thw(13), new defpackage.thy(aigfVar, 5)));
            case 19:
                defpackage.aimz aimzVar2 = uqp.a;
                return ((defpackage.aigf) obj).keySet().g();
            default:
                defpackage.aimz aimzVar3 = uqp.a;
                return (defpackage.aify) j$.util.Collection.-EL.stream(((java.util.Map) obj).entrySet()).map(new thw(14)).collect(defpackage.aido.a);
        }
    }
}
