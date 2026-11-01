package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class kvf implements defpackage.ahyc {
    private final /* synthetic */ int $cid;

    public /* synthetic */ kvf(int i) {
        this.$cid = i;
    }

    @Override // defpackage.ahyc
    public final java.lang.Object apply(java.lang.Object obj) {
        int i = 0;
        z = false;
        boolean z = false;
        switch (this.$cid) {
            case 0:
                return (java.util.List) j$.util.Collection.-EL.stream(((java.util.Map) obj).values()).map(new defpackage.kju(4)).collect(defpackage.aido.a);
            case 1:
                defpackage.jzl jzlVar = (defpackage.jzl) obj;
                if (!jzlVar.d) {
                    return j$.util.Optional.empty();
                }
                defpackage.kiv kivVar = jzlVar.c;
                if (kivVar == null) {
                    kivVar = defpackage.kiv.a;
                }
                defpackage.akzx akzxVarL = kivVar.L();
                akzxVarL.u();
                ((defpackage.kiv) akzxVarL.b).b = defpackage.albq.a;
                for (defpackage.kiu kiuVar : kivVar.b) {
                    defpackage.kit kitVarB = defpackage.kit.b(kiuVar.v);
                    if (kitVarB == null) {
                        kitVarB = defpackage.kit.UNKNOWN;
                    }
                    if (kitVarB == defpackage.kit.UNKNOWN) {
                        ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) defpackage.jyy.a.d()).i(defpackage.zct.b)).l("com/android/dialer/calllog/coalescer/CoalescedRowsDao", "discardInvalidRows", (char) 241, "CoalescedRowsDao.java")).v("invalid row: date group unknown");
                    } else {
                        defpackage.akzx akzxVarL2 = kiuVar.L();
                        akzxVarL2.u();
                        defpackage.kiu kiuVar2 = (defpackage.kiu) akzxVarL2.b;
                        kiuVar2.b |= 2097152;
                        kiuVar2.y = i;
                        defpackage.kiu kiuVar3 = (defpackage.kiu) akzxVarL2.r();
                        akzxVarL.u();
                        defpackage.kiv kivVar2 = (defpackage.kiv) akzxVarL.b;
                        j$.util.Objects.requireNonNull(kiuVar3);
                        kivVar2.b();
                        kivVar2.b.add(kiuVar3);
                        i++;
                    }
                }
                return j$.util.Optional.of((defpackage.kiv) akzxVarL.r());
            case 2:
                long j = ((defpackage.kvi) obj).c;
                ((defpackage.aimw) ((defpackage.aimw) defpackage.kvj.a.b()).l("com/android/dialer/callrecording/impl/calllog/CallRecordingDataSourceStatusService", "getTimestampOfLastSyncedCallRecordingInfoMillis", 104, "CallRecordingDataSourceStatusService.java")).x("lastSyncedCallRecordingInfoTimestamp %d", j);
                return java.lang.Long.valueOf(j);
            case 3:
                return defpackage.aihd.o(((defpackage.kvi) obj).d);
            case 4:
                return null;
            case 5:
                return null;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.aimz aimzVar = defpackage.nyh.a;
                return null;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                return null;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                return (defpackage.aify) j$.util.Collection.-EL.stream((defpackage.aify) obj).filter(new defpackage.opv(6)).collect(defpackage.aido.a);
            case 9:
                j$.util.Optional optional = (j$.util.Optional) obj;
                return true == optional.isPresent() ? j$.util.Optional.ofNullable(((abtr) optional.get()).e) : optional;
            case 10:
                return defpackage.aify.n(((defpackage.vml) obj).b);
            case 11:
                return new defpackage.gsf();
            case 12:
                return ((defpackage.rsr) obj).aB();
            case 13:
                defpackage.kit kitVar = defpackage.kit.UNKNOWN;
                defpackage.aift aiftVar = new defpackage.aift(4);
                defpackage.kit kitVar2 = kitVar;
                for (uzo uzoVar : (defpackage.aify) obj) {
                    defpackage.kiu kiuVar4 = uzoVar.d;
                    if (kiuVar4 == null) {
                        kiuVar4 = defpackage.kiu.a;
                    }
                    int iP = hgu.p(j$.time.Instant.now().toEpochMilli(), kiuVar4.e);
                    defpackage.kit kitVar3 = iP != 0 ? iP != 1 ? defpackage.kit.OLDER : defpackage.kit.YESTERDAY : defpackage.kit.TODAY;
                    defpackage.kiu kiuVar5 = uzoVar.d;
                    if (kiuVar5 == null) {
                        kiuVar5 = defpackage.kiu.a;
                    }
                    defpackage.kit kitVar4 = kitVar2 == kitVar3 ? kitVar : kitVar3;
                    defpackage.akzx akzxVarL3 = kiuVar5.L();
                    akzxVarL3.u();
                    defpackage.kiu kiuVar6 = (defpackage.kiu) akzxVarL3.b;
                    kiuVar6.v = kitVar4.e;
                    kiuVar6.b |= 262144;
                    defpackage.kiu kiuVar7 = (defpackage.kiu) akzxVarL3.r();
                    defpackage.akzx akzxVarL4 = uzoVar.L();
                    akzxVarL4.u();
                    uzo uzoVar2 = akzxVarL4.b;
                    j$.util.Objects.requireNonNull(kiuVar7);
                    uzoVar2.d = kiuVar7;
                    uzoVar2.b |= 2;
                    aiftVar.i(akzxVarL4.r());
                    kitVar2 = kitVar3;
                }
                return aiftVar.g();
            case 14:
                defpackage.adtz adtzVar = (defpackage.adtz) obj;
                if (adtzVar.d() != null && ((defpackage.abzt) adtzVar.d()).a()) {
                    z = true;
                }
                return java.lang.Boolean.valueOf(z);
            case 15:
                defpackage.adtz adtzVar2 = (defpackage.adtz) obj;
                defpackage.aiof aiofVar = defpackage.acdv.a;
                if (adtzVar2.d() == null) {
                    return adtzVar2;
                }
                ((defpackage.abzt) adtzVar2.d()).a();
                return adtzVar2;
            case 16:
                java.lang.Throwable th = (java.lang.Throwable) obj;
                ((defpackage.aiob) ((defpackage.aiob) ((defpackage.aiob) defpackage.acdv.a.d()).k(th)).l("com/google/android/libraries/internal/growth/growthkit/internal/promotions/impl/PromotionsManagerImpl", "instrumentProcessResult", 187, "PromotionsManagerImpl.java")).v("Failed to process event");
                return new adtw(th, defpackage.adty.a);
            case 17:
                java.util.Map map = (java.util.Map) obj;
                defpackage.aiof aiofVar2 = defpackage.acea.a;
                if (map == null) {
                    defpackage.aooh.i("promotions");
                }
                return defpackage.ajsz.bX(map.values(), new defpackage.beg(13));
            case 18:
                return new java.util.HashMap((java.util.Map) obj);
            case 19:
                return null;
            default:
                return null;
        }
    }
}
