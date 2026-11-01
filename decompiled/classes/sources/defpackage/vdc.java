package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class vdc {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/voicemail/service/impl/carriermapping/VvmCarrierIdentifierImpl");
    public final defpackage.oko b;
    public final defpackage.aoin c;
    public final defpackage.aoin d;
    public final defpackage.aoin e;
    private final defpackage.ajct f;
    private final defpackage.tvn g;
    private final defpackage.vde h;
    private final defpackage.zjm i;

    public vdc(defpackage.aoin aoinVar, defpackage.aoin aoinVar2, defpackage.aoin aoinVar3, defpackage.ajct ajctVar, defpackage.oko okoVar, defpackage.tvn tvnVar, defpackage.zjm zjmVar, defpackage.vde vdeVar) {
        this.f = ajctVar;
        this.b = okoVar;
        this.c = aoinVar;
        this.d = aoinVar2;
        this.e = aoinVar3;
        this.g = tvnVar;
        this.i = zjmVar;
        this.h = vdeVar;
    }

    public static boolean c(defpackage.yqf yqfVar, java.lang.String str, j$.util.Optional optional) {
        return optional.isPresent() && j$.util.Collection.-EL.stream(yqfVar.b).anyMatch(new lvq(optional, str, 4));
    }

    public final defpackage.ajcq a(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        defpackage.nyf nyfVar = new defpackage.nyf(this, phoneAccountHandle, 5, null);
        long j = defpackage.ahqx.a;
        defpackage.ajdk ajdkVar = new defpackage.ajdk(new defpackage.ajav(defpackage.ahns.c(false), nyfVar, 1));
        this.f.execute(ajdkVar);
        return ajdkVar;
    }

    @java.lang.Deprecated
    public final j$.util.Optional b(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        boolean zA = this.g.a(phoneAccountHandle);
        defpackage.aimz aimzVar = a;
        if (zA) {
            ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/voicemail/service/impl/carriermapping/VvmCarrierIdentifierImpl", "getVvmCarrierNameBlocking", 98, "VvmCarrierIdentifierImpl.java")).v("simulator phone account handle detected!");
            return j$.util.Optional.of(defpackage.vdd.VVM_CARRIER_SIMULATOR);
        }
        ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).g(1, java.util.concurrent.TimeUnit.MINUTES)).l("com/android/dialer/voicemail/service/impl/carriermapping/VvmCarrierIdentifierImpl", "getVvmCarrierNameBlocking", 101, "VvmCarrierIdentifierImpl.java")).y("Looking up carrier name for phone account handle: %s", phoneAccountHandle.getId());
        defpackage.zjm zjmVar = this.i;
        if (zjmVar.g().isPresent()) {
            throw null;
        }
        defpackage.vde vdeVar = this.h;
        defpackage.aonj aonjVar = new defpackage.aonj() { // from class: vdb
            /* JADX WARN: Code duplicated, block: B:21:0x00b8  */
            /* JADX WARN: Code duplicated, block: B:23:0x00bf  */
            /* JADX WARN: Code duplicated, block: B:25:0x00e5  */
            /* JADX WARN: Code duplicated, block: B:28:0x0116  */
            /* JADX WARN: Code duplicated, block: B:29:0x0139  */
            /* JADX WARN: Code duplicated, block: B:31:0x0147  */
            /* JADX WARN: Code duplicated, block: B:32:0x016a  */
            /* JADX WARN: Code duplicated, block: B:34:0x0170  */
            /* JADX WARN: Code duplicated, block: B:37:0x01a2  */
            /* JADX WARN: Code duplicated, block: B:38:0x01b8  */
            /* JADX WARN: Code duplicated, block: B:40:0x01d4  */
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                j$.util.Optional optionalEmpty;
                int iD;
                j$.util.Optional optionalFindFirst;
                defpackage.aimz aimzVar2;
                defpackage.ainp ainpVar;
                j$.util.Optional optionalQ;
                j$.util.Optional optionalT;
                java.lang.String str;
                defpackage.vdc vdcVar = this.a;
                android.telecom.PhoneAccountHandle phoneAccountHandle2 = (android.telecom.PhoneAccountHandle) obj;
                try {
                    optionalEmpty = j$.util.Optional.ofNullable(vdcVar.b.i(phoneAccountHandle2));
                } catch (java.lang.SecurityException e) {
                    ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) defpackage.vdc.a.b()).i(defpackage.zct.a)).k(e)).l("com/android/dialer/voicemail/service/impl/carriermapping/VvmCarrierIdentifierImpl", "getDialerTelephonyForPhoneAccountHandle", (char) 273, "VvmCarrierIdentifierImpl.java")).v("missing permission to retrieve TelephonyManager.");
                    optionalEmpty = j$.util.Optional.empty();
                }
                if (optionalEmpty.isPresent()) {
                    defpackage.oko okoVar = (defpackage.oko) optionalEmpty.orElseThrow();
                    if (android.os.Build.VERSION.SDK_INT < 33) {
                        j$.util.Optional optionalQ2 = okoVar.q();
                        j$.util.Optional optionalT2 = okoVar.t();
                        if (optionalQ2.isEmpty() || optionalT2.isEmpty()) {
                            iD = okoVar.d();
                            if (iD == -1) {
                                aimzVar2 = defpackage.vdc.a;
                                defpackage.ainm ainmVarB = aimzVar2.b();
                                ainpVar = defpackage.zct.a;
                                ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ainmVarB).i(ainpVar)).l("com/android/dialer/voicemail/service/impl/carriermapping/VvmCarrierIdentifierImpl", "getVvmCarrierName", (char) 156, "VvmCarrierIdentifierImpl.java")).y("PhoneAccountHandle %s doesn't match to any carrier in carrier list, maybe phoneAccountHandle was corrupted.", phoneAccountHandle2);
                                optionalQ = okoVar.q();
                                optionalT = okoVar.t();
                                if (!optionalQ.isPresent()) {
                                    ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) aimzVar2.b()).m(defpackage.aioa.MEDIUM)).i(ainpVar)).l("com/android/dialer/voicemail/service/impl/carriermapping/VvmCarrierIdentifierImpl", "findCarrierNameForExtraCarriers", (char) 200, "VvmCarrierIdentifierImpl.java")).v("Provided VVM carrier has an empty MccMnc.");
                                }
                                str = (java.lang.String) optionalQ.orElseThrow();
                                if (defpackage.vdc.c((defpackage.yqf) vdcVar.d.a(), str, optionalT)) {
                                    ((defpackage.aimw) ((defpackage.aimw) aimzVar2.b()).l("com/android/dialer/voicemail/service/impl/carriermapping/VvmCarrierIdentifierImpl", "findCarrierNameForExtraCarriers", 204, "VvmCarrierIdentifierImpl.java")).I("Provided VVM carrier is not present in the carrier list but identified by Dialer as El Telecom, mccmnc = %s, gid1 = %s", optionalQ.orElse("Empty"), optionalT.orElse("Empty"));
                                    optionalFindFirst = j$.util.Optional.of(defpackage.vdd.VVM_CARRIER_EL_TELECOM);
                                } else if (defpackage.vdc.c((defpackage.yqf) vdcVar.e.a(), str, optionalT)) {
                                    ((defpackage.aimw) ((defpackage.aimw) aimzVar2.b()).l("com/android/dialer/voicemail/service/impl/carriermapping/VvmCarrierIdentifierImpl", "findCarrierNameForExtraCarriers", 211, "VvmCarrierIdentifierImpl.java")).I("Provided VVM carrier is not present in the carrier list but identified by Dialer as Red SIM, mccmnc = %s, gid1 = %s", optionalQ.orElse("Empty"), optionalT.orElse("Empty"));
                                    optionalFindFirst = j$.util.Optional.of(defpackage.vdd.VVM_CARRIER_RED_SIM);
                                } else if (optionalT.isPresent() && ((defpackage.alfc) vdcVar.c.a()).b.contains(str)) {
                                    ((defpackage.aimw) ((defpackage.aimw) aimzVar2.b()).l("com/android/dialer/voicemail/service/impl/carriermapping/VvmCarrierIdentifierImpl", "findCarrierNameForExtraCarriers", 218, "VvmCarrierIdentifierImpl.java")).I("Provided VVM carrier is not present in the carrier list but identified by Dialer as Telus Canada, mccmnc = %s, gid1 = %s", optionalQ.orElse("Empty"), optionalT.orElse("Empty"));
                                    optionalFindFirst = j$.util.Optional.of(defpackage.vdd.VVM_CARRIER_TELUS_CANADA_ANDROID_O);
                                } else {
                                    ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) aimzVar2.b()).i(ainpVar)).l("com/android/dialer/voicemail/service/impl/carriermapping/VvmCarrierIdentifierImpl", "findCarrierNameForExtraCarriers", (char) 224, "VvmCarrierIdentifierImpl.java")).v("PhoneAccountHandle does not match to any carrier.");
                                    optionalFindFirst = j$.util.Optional.empty();
                                }
                            } else {
                                optionalFindFirst = j$.util.DesugarArrays.stream(defpackage.vdd.values()).filter(new sst(iD, 2)).findFirst();
                                if (!optionalFindFirst.isPresent()) {
                                    ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) defpackage.vdc.a.b()).i(defpackage.zct.a)).l("com/android/dialer/voicemail/service/impl/carriermapping/VvmCarrierIdentifierImpl", "getVvmCarrierName", 173, "VvmCarrierIdentifierImpl.java")).B("Carrier with ID %d for PhoneAccountHandle %s not found in support list", iD, phoneAccountHandle2);
                                    optionalFindFirst = j$.util.Optional.empty();
                                }
                            }
                        } else {
                            java.lang.String str2 = (java.lang.String) optionalQ2.orElseThrow();
                            java.lang.String str3 = (java.lang.String) optionalT2.orElseThrow();
                            if (str2.equals("310240") && str3.equals("4276")) {
                                ((defpackage.aimw) ((defpackage.aimw) defpackage.vdc.a.b()).l("com/android/dialer/voicemail/service/impl/carriermapping/VvmCarrierIdentifierImpl", "isPreTFiCarrier", 237, "VvmCarrierIdentifierImpl.java")).v("Pre-T Fi sim detected");
                                optionalFindFirst = j$.util.Optional.of(defpackage.vdd.VVM_CARRIER_FI);
                            } else {
                                iD = okoVar.d();
                                if (iD == -1) {
                                    aimzVar2 = defpackage.vdc.a;
                                    defpackage.ainm ainmVarB2 = aimzVar2.b();
                                    ainpVar = defpackage.zct.a;
                                    ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ainmVarB2).i(ainpVar)).l("com/android/dialer/voicemail/service/impl/carriermapping/VvmCarrierIdentifierImpl", "getVvmCarrierName", (char) 156, "VvmCarrierIdentifierImpl.java")).y("PhoneAccountHandle %s doesn't match to any carrier in carrier list, maybe phoneAccountHandle was corrupted.", phoneAccountHandle2);
                                    optionalQ = okoVar.q();
                                    optionalT = okoVar.t();
                                    if (!optionalQ.isPresent()) {
                                        ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) aimzVar2.b()).m(defpackage.aioa.MEDIUM)).i(ainpVar)).l("com/android/dialer/voicemail/service/impl/carriermapping/VvmCarrierIdentifierImpl", "findCarrierNameForExtraCarriers", (char) 200, "VvmCarrierIdentifierImpl.java")).v("Provided VVM carrier has an empty MccMnc.");
                                    }
                                    str = (java.lang.String) optionalQ.orElseThrow();
                                    if (defpackage.vdc.c((defpackage.yqf) vdcVar.d.a(), str, optionalT)) {
                                        ((defpackage.aimw) ((defpackage.aimw) aimzVar2.b()).l("com/android/dialer/voicemail/service/impl/carriermapping/VvmCarrierIdentifierImpl", "findCarrierNameForExtraCarriers", 204, "VvmCarrierIdentifierImpl.java")).I("Provided VVM carrier is not present in the carrier list but identified by Dialer as El Telecom, mccmnc = %s, gid1 = %s", optionalQ.orElse("Empty"), optionalT.orElse("Empty"));
                                        optionalFindFirst = j$.util.Optional.of(defpackage.vdd.VVM_CARRIER_EL_TELECOM);
                                    } else if (defpackage.vdc.c((defpackage.yqf) vdcVar.e.a(), str, optionalT)) {
                                        ((defpackage.aimw) ((defpackage.aimw) aimzVar2.b()).l("com/android/dialer/voicemail/service/impl/carriermapping/VvmCarrierIdentifierImpl", "findCarrierNameForExtraCarriers", 211, "VvmCarrierIdentifierImpl.java")).I("Provided VVM carrier is not present in the carrier list but identified by Dialer as Red SIM, mccmnc = %s, gid1 = %s", optionalQ.orElse("Empty"), optionalT.orElse("Empty"));
                                        optionalFindFirst = j$.util.Optional.of(defpackage.vdd.VVM_CARRIER_RED_SIM);
                                    } else if (optionalT.isPresent()) {
                                        ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) aimzVar2.b()).i(ainpVar)).l("com/android/dialer/voicemail/service/impl/carriermapping/VvmCarrierIdentifierImpl", "findCarrierNameForExtraCarriers", (char) 224, "VvmCarrierIdentifierImpl.java")).v("PhoneAccountHandle does not match to any carrier.");
                                        optionalFindFirst = j$.util.Optional.empty();
                                    } else {
                                        ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) aimzVar2.b()).i(ainpVar)).l("com/android/dialer/voicemail/service/impl/carriermapping/VvmCarrierIdentifierImpl", "findCarrierNameForExtraCarriers", (char) 224, "VvmCarrierIdentifierImpl.java")).v("PhoneAccountHandle does not match to any carrier.");
                                        optionalFindFirst = j$.util.Optional.empty();
                                    }
                                } else {
                                    optionalFindFirst = j$.util.DesugarArrays.stream(defpackage.vdd.values()).filter(new sst(iD, 2)).findFirst();
                                    if (!optionalFindFirst.isPresent()) {
                                        ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) defpackage.vdc.a.b()).i(defpackage.zct.a)).l("com/android/dialer/voicemail/service/impl/carriermapping/VvmCarrierIdentifierImpl", "getVvmCarrierName", 173, "VvmCarrierIdentifierImpl.java")).B("Carrier with ID %d for PhoneAccountHandle %s not found in support list", iD, phoneAccountHandle2);
                                        optionalFindFirst = j$.util.Optional.empty();
                                    }
                                }
                            }
                        }
                    } else {
                        iD = okoVar.d();
                        if (iD == -1) {
                            aimzVar2 = defpackage.vdc.a;
                            defpackage.ainm ainmVarB3 = aimzVar2.b();
                            ainpVar = defpackage.zct.a;
                            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ainmVarB3).i(ainpVar)).l("com/android/dialer/voicemail/service/impl/carriermapping/VvmCarrierIdentifierImpl", "getVvmCarrierName", (char) 156, "VvmCarrierIdentifierImpl.java")).y("PhoneAccountHandle %s doesn't match to any carrier in carrier list, maybe phoneAccountHandle was corrupted.", phoneAccountHandle2);
                            optionalQ = okoVar.q();
                            optionalT = okoVar.t();
                            if (!optionalQ.isPresent()) {
                                ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) aimzVar2.b()).m(defpackage.aioa.MEDIUM)).i(ainpVar)).l("com/android/dialer/voicemail/service/impl/carriermapping/VvmCarrierIdentifierImpl", "findCarrierNameForExtraCarriers", (char) 200, "VvmCarrierIdentifierImpl.java")).v("Provided VVM carrier has an empty MccMnc.");
                            }
                            str = (java.lang.String) optionalQ.orElseThrow();
                            if (defpackage.vdc.c((defpackage.yqf) vdcVar.d.a(), str, optionalT)) {
                                ((defpackage.aimw) ((defpackage.aimw) aimzVar2.b()).l("com/android/dialer/voicemail/service/impl/carriermapping/VvmCarrierIdentifierImpl", "findCarrierNameForExtraCarriers", 204, "VvmCarrierIdentifierImpl.java")).I("Provided VVM carrier is not present in the carrier list but identified by Dialer as El Telecom, mccmnc = %s, gid1 = %s", optionalQ.orElse("Empty"), optionalT.orElse("Empty"));
                                optionalFindFirst = j$.util.Optional.of(defpackage.vdd.VVM_CARRIER_EL_TELECOM);
                            } else if (defpackage.vdc.c((defpackage.yqf) vdcVar.e.a(), str, optionalT)) {
                                ((defpackage.aimw) ((defpackage.aimw) aimzVar2.b()).l("com/android/dialer/voicemail/service/impl/carriermapping/VvmCarrierIdentifierImpl", "findCarrierNameForExtraCarriers", 211, "VvmCarrierIdentifierImpl.java")).I("Provided VVM carrier is not present in the carrier list but identified by Dialer as Red SIM, mccmnc = %s, gid1 = %s", optionalQ.orElse("Empty"), optionalT.orElse("Empty"));
                                optionalFindFirst = j$.util.Optional.of(defpackage.vdd.VVM_CARRIER_RED_SIM);
                            } else if (optionalT.isPresent()) {
                                ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) aimzVar2.b()).i(ainpVar)).l("com/android/dialer/voicemail/service/impl/carriermapping/VvmCarrierIdentifierImpl", "findCarrierNameForExtraCarriers", (char) 224, "VvmCarrierIdentifierImpl.java")).v("PhoneAccountHandle does not match to any carrier.");
                                optionalFindFirst = j$.util.Optional.empty();
                            } else {
                                ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) aimzVar2.b()).i(ainpVar)).l("com/android/dialer/voicemail/service/impl/carriermapping/VvmCarrierIdentifierImpl", "findCarrierNameForExtraCarriers", (char) 224, "VvmCarrierIdentifierImpl.java")).v("PhoneAccountHandle does not match to any carrier.");
                                optionalFindFirst = j$.util.Optional.empty();
                            }
                        } else {
                            optionalFindFirst = j$.util.DesugarArrays.stream(defpackage.vdd.values()).filter(new sst(iD, 2)).findFirst();
                            if (!optionalFindFirst.isPresent()) {
                                ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) defpackage.vdc.a.b()).i(defpackage.zct.a)).l("com/android/dialer/voicemail/service/impl/carriermapping/VvmCarrierIdentifierImpl", "getVvmCarrierName", 173, "VvmCarrierIdentifierImpl.java")).B("Carrier with ID %d for PhoneAccountHandle %s not found in support list", iD, phoneAccountHandle2);
                                optionalFindFirst = j$.util.Optional.empty();
                            }
                        }
                    }
                } else {
                    ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) defpackage.vdc.a.b()).m(defpackage.aioa.MEDIUM)).i(defpackage.zct.a)).l("com/android/dialer/voicemail/service/impl/carriermapping/VvmCarrierIdentifierImpl", "getVvmCarrierName", (char) 140, "VvmCarrierIdentifierImpl.java")).v("DialerTelephony is null, return empty vvm carrier name.");
                    optionalFindFirst = j$.util.Optional.empty();
                }
                if (optionalFindFirst.isPresent()) {
                    defpackage.ainm ainmVarB4 = defpackage.vdc.a.b();
                    ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ainmVarB4).i(defpackage.zct.a)).l("com/android/dialer/voicemail/service/impl/carriermapping/VvmCarrierIdentifierImpl", "getVvmCarrierNameBlocking", '{', "VvmCarrierIdentifierImpl.java")).y("found carrier name: %s", optionalFindFirst.orElseThrow());
                }
                return optionalFindFirst;
            }
        };
        j$.time.Duration durationOfDays = j$.time.Duration.ofDays(1L);
        if (phoneAccountHandle == null) {
            defpackage.aooh.i("phoneAccountHandle");
        }
        if (durationOfDays == null) {
            defpackage.aooh.i("expiration");
        }
        java.lang.Object objComputeIfAbsent = j$.util.concurrent.ConcurrentMap.-EL.computeIfAbsent(vdeVar.b, phoneAccountHandle, new defpackage.okq(new defpackage.nxi(durationOfDays, aonjVar, 4), 3));
        if (objComputeIfAbsent == null) {
            defpackage.aooh.g();
        }
        java.lang.Object objEZ = ((defpackage.ahzi) objComputeIfAbsent).eZ();
        defpackage.aooh.e(objEZ, "get(...)");
        return (j$.util.Optional) objEZ;
    }
}
