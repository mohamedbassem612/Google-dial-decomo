package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class jyx implements defpackage.ahyc {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ jyx(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r10v20, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v23, types: [java.lang.Object, sqn] */
    /* JADX WARN: Type inference failed for: r10v58, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.lang.Object, kfj] */
    @Override // defpackage.ahyc
    public final java.lang.Object apply(java.lang.Object obj) {
        int i = 2;
        int i2 = 4;
        int i3 = 1;
        switch (this.$cid) {
            case 0:
                defpackage.akzx akzxVarM = defpackage.jzl.a.m();
                akzxVarM.u();
                defpackage.jzl jzlVar = (defpackage.jzl) akzxVarM.b;
                java.lang.Object obj2 = this.a;
                j$.util.Objects.requireNonNull(obj2);
                jzlVar.c = (defpackage.kiv) obj2;
                jzlVar.b |= 1;
                akzxVarM.u();
                defpackage.jzl jzlVar2 = (defpackage.jzl) akzxVarM.b;
                jzlVar2.b |= 2;
                jzlVar2.d = true;
                return (defpackage.jzl) akzxVarM.r();
            case 1:
                ?? r10 = this.a;
                defpackage.kfk kfkVar = (defpackage.kfk) r10;
                java.util.Map map = kfkVar.a;
                java.util.Set setKeySet = kfkVar.b.keySet();
                java.util.Set setKeySet2 = map.keySet();
                for (kdy kdyVar : ((java.util.Map) obj).values()) {
                    long j = kdyVar.a;
                    java.lang.Long lValueOf = java.lang.Long.valueOf(j);
                    if (!setKeySet2.contains(lValueOf) && !setKeySet.contains(lValueOf) && !kfkVar.c.contains(lValueOf)) {
                        android.content.ContentValues contentValues = new android.content.ContentValues();
                        contentValues.put("timestamp", java.lang.Long.valueOf(kdyVar.b));
                        r10.d(j, contentValues);
                    }
                }
                return null;
            case 2:
                return (defpackage.aigf) j$.util.Collection.-EL.stream(((java.util.Map) obj).values()).collect(defpackage.aido.b(new defpackage.kju(6), new defpackage.okq(this.a, i3)));
            case 3:
                return ((defpackage.ljf) this.a).b((defpackage.aigf) obj);
            case 4:
                return ((defpackage.lcx) this.a).a((j$.util.Optional) obj);
            case 5:
                java.lang.Integer num = (java.lang.Integer) obj;
                int andSet = ((defpackage.nyh) this.a).d.getAndSet(num.intValue());
                if (andSet == num.intValue()) {
                    return num;
                }
                ((defpackage.aimw) ((defpackage.aimw) defpackage.nyh.a.b()).l("com/android/dialer/duo/impl/MeetCallControllerImpl", "getDuoKitAvailability", 350, "MeetCallControllerImpl.java")).B("DuoKit availability changed. Prev: %s, Current: %s", andSet, num);
                return num;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                this.a.a(obj);
                return null;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                return ((defpackage.rwi) this.a).c();
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) defpackage.sqi.a.c()).i(defpackage.zct.b)).k((java.lang.Throwable) obj)).l("com/android/dialer/phonelookup/composite/CompositePhoneLookup", "onSuccessfulBulkUpdate", 401, "CompositePhoneLookup.java")).y("%s - onSuccessfulBulkUpdate failed", this.a.g());
                return null;
            case 9:
                defpackage.aigb aigbVar = new defpackage.aigb(4);
                defpackage.ailj it = ((defpackage.aigf) obj).entrySet().iterator();
                while (true) {
                    java.lang.Object obj3 = this.a;
                    if (!it.hasNext()) {
                        defpackage.ssd ssdVar = (defpackage.ssd) obj3;
                        if (ssdVar.b == null) {
                            ssdVar.b = java.lang.Long.valueOf(j$.time.Instant.now().toEpochMilli());
                        }
                        return aigbVar.e(true);
                    }
                    java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                    hkd hkdVar = (hkd) entry.getKey();
                    defpackage.uip uipVar = (defpackage.uip) entry.getValue();
                    defpackage.udm udmVar = (defpackage.udm) uipVar.k().g().orElse(defpackage.udm.a);
                    defpackage.akzx akzxVarM2 = spk.a.m();
                    defpackage.udj udjVarJ = uipVar.j();
                    akzxVarM2.u();
                    spk spkVar = akzxVarM2.b;
                    spkVar.c = udjVarJ.f;
                    spkVar.b |= 1;
                    int iAQ = defpackage.a.aQ(udmVar.i);
                    if (iAQ == 0) {
                        iAQ = 1;
                    }
                    akzxVarM2.u();
                    spk spkVar2 = akzxVarM2.b;
                    spkVar2.e = iAQ - 1;
                    spkVar2.b |= 4;
                    int iAQ2 = defpackage.a.aQ(udmVar.j);
                    if (iAQ2 == 0) {
                        iAQ2 = 1;
                    }
                    akzxVarM2.u();
                    spk spkVar3 = akzxVarM2.b;
                    spkVar3.f = iAQ2 - 1;
                    spkVar3.b |= 8;
                    aigbVar.i(hkdVar, akzxVarM2.r());
                    j$.util.Optional optionalM = uipVar.m();
                    if (optionalM.isPresent()) {
                        defpackage.ssd ssdVar2 = (defpackage.ssd) obj3;
                        ssdVar2.b = java.lang.Long.valueOf(ssdVar2.b == null ? ((java.lang.Long) optionalM.orElseThrow()).longValue() : java.lang.Math.max(((java.lang.Long) optionalM.orElseThrow()).longValue(), ssdVar2.b.longValue()));
                    }
                }
                break;
            case 10:
                defpackage.ste steVar = (defpackage.ste) obj;
                if (steVar == null) {
                    ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) defpackage.stm.a.d()).i(defpackage.zct.b)).l("com/android/dialer/postcall/impl/storage/PostCallDao", "isPostCall", 'O', "PostCallDao.java")).v("received null data service, returning false");
                    return java.lang.Boolean.FALSE;
                }
                int i4 = steVar.b;
                if ((i4 & 1) == 0) {
                    ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) defpackage.stm.a.d()).i(defpackage.zct.b)).l("com/android/dialer/postcall/impl/storage/PostCallDao", "isPostCall", 'W', "PostCallDao.java")).v("received null call connect time, returning false");
                    return java.lang.Boolean.FALSE;
                }
                if ((i4 & 2) == 0) {
                    ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) defpackage.stm.a.d()).i(defpackage.zct.b)).l("com/android/dialer/postcall/impl/storage/PostCallDao", "isPostCall", '^', "PostCallDao.java")).v("received null call disconnect time, returning false");
                    return java.lang.Boolean.FALSE;
                }
                if (steVar.f) {
                    ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) defpackage.stm.a.d()).i(defpackage.zct.b)).l("com/android/dialer/postcall/impl/storage/PostCallDao", "isPostCall", 'f', "PostCallDao.java")).v("already triggered a post call action for this call");
                    return java.lang.Boolean.FALSE;
                }
                defpackage.alcf alcfVar = steVar.d;
                if (alcfVar == null) {
                    alcfVar = defpackage.alcf.a;
                }
                if (defpackage.aldi.c(alcfVar, defpackage.aldi.e(j$.time.Instant.now().toEpochMilli())).b >= ((java.lang.Long) ((defpackage.stm) this.a).c.a()).longValue() / 1000) {
                    ((defpackage.aimw) ((defpackage.aimw) defpackage.stm.a.b()).l("com/android/dialer/postcall/impl/storage/PostCallDao", "isPostCall", 112, "PostCallDao.java")).v("not a recent post call, returning false");
                    return java.lang.Boolean.FALSE;
                }
                ((defpackage.aimw) ((defpackage.aimw) defpackage.stm.a.b()).l("com/android/dialer/postcall/impl/storage/PostCallDao", "isPostCall", 116, "PostCallDao.java")).v("returning true");
                return java.lang.Boolean.TRUE;
            case 11:
                j$.util.stream.Stream stream = j$.util.Collection.-EL.stream((java.util.List) obj);
                java.lang.Object obj4 = this.a;
                boolean zAnyMatch = stream.filter(new defpackage.tcw(obj4, i3)).anyMatch(new defpackage.tcw(obj4, 0));
                defpackage.aimw aimwVar = (defpackage.aimw) ((defpackage.aimw) defpackage.tcx.a.b()).l("com/android/dialer/rtt/settings/impl/configuration/RttDeviceCompatibility", "isDeviceSupported", 54, "RttDeviceCompatibility.java");
                java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(zAnyMatch);
                aimwVar.y("[RTT] isDeviceSupported: %s", boolValueOf);
                return boolValueOf;
            case 12:
                if (((defpackage.uqg) obj) != defpackage.uqg.a) {
                    return null;
                }
                ((defpackage.uqe) this.a).o.i(null).b(defpackage.mce.APP_ON_CREATE);
                return null;
            case 13:
                return (defpackage.aify) j$.util.Collection.-EL.stream((java.util.Collection) this.a).filter(new defpackage.tcw((defpackage.aigf) obj, i)).collect(defpackage.aido.a);
            case 14:
                defpackage.vcs vcsVar = (defpackage.vcs) obj;
                defpackage.zzx zzxVar = (defpackage.zzx) ((defpackage.ahbv) this.a).f;
                return !zzxVar.k().containsKey(vcsVar) ? j$.util.Optional.empty() : j$.util.Optional.of((defpackage.vcg) ((defpackage.aoin) zzxVar.k().get(vcsVar)).a());
            case 15:
                defpackage.vcs vcsVar2 = (defpackage.vcs) obj;
                defpackage.zzx zzxVar2 = (defpackage.zzx) ((defpackage.ahbv) this.a).b;
                return !zzxVar2.k().containsKey(vcsVar2) ? j$.util.Optional.empty() : j$.util.Optional.of((vch) ((defpackage.aoin) zzxVar2.k().get(vcsVar2)).a());
            case 16:
                defpackage.vcs vcsVar3 = (defpackage.vcs) obj;
                defpackage.zzx zzxVar3 = (defpackage.zzx) ((defpackage.ahbv) this.a).d;
                return !zzxVar3.k().containsKey(vcsVar3) ? j$.util.Optional.empty() : j$.util.Optional.of((defpackage.vcc) ((defpackage.aoin) zzxVar3.k().get(vcsVar3)).a());
            case 17:
                return (defpackage.vcs) ((defpackage.aoin) ((defpackage.zzx) ((defpackage.ahbv) this.a).a).k().getOrDefault(((j$.util.Optional) obj).orElse(defpackage.vdd.VVM_CARRIER_UNKNOWN), new defpackage.rkv(9))).a();
            case 18:
                defpackage.vcs vcsVar4 = (defpackage.vcs) obj;
                defpackage.zzx zzxVar4 = (defpackage.zzx) ((defpackage.ahbv) this.a).g;
                return !zzxVar4.k().containsKey(vcsVar4) ? j$.util.Optional.empty() : j$.util.Optional.of((defpackage.vfj) ((defpackage.aoin) zzxVar4.k().get(vcsVar4)).a());
            case 19:
                defpackage.vml vmlVar = (defpackage.vml) obj;
                defpackage.aify aifyVar = (defpackage.aify) j$.util.Collection.-EL.stream(j$.util.DesugarCollections.unmodifiableList(((defpackage.vml) vmlVar.L().b).b)).filter(new defpackage.tcw(this.a, 3)).collect(defpackage.aido.a);
                defpackage.akzx akzxVarL = vmlVar.L();
                akzxVarL.u();
                ((defpackage.vml) akzxVarL.b).b = defpackage.albq.a;
                akzxVarL.Y(aifyVar);
                return (defpackage.vml) akzxVarL.r();
            default:
                j$.util.stream.Stream stream2 = j$.util.Collection.-EL.stream((defpackage.aify) obj);
                java.lang.Object obj5 = this.a;
                j$.util.stream.Stream map2 = stream2.filter(new defpackage.tcw(obj5, i2)).map(new defpackage.vaq(4));
                return ((java.lang.Boolean) ((defpackage.vmo) obj5).b.a()).booleanValue() ? (defpackage.aifo) map2.collect(defpackage.aido.b) : (defpackage.aifo) map2.collect(defpackage.aido.a);
        }
    }
}
