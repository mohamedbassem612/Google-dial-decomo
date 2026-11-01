package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class tcy implements ahyc {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ tcy(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r12v15, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r12v19, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r12v21, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r12v71, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r12v9, types: [java.lang.Object, java.util.concurrent.Future] */
    public final java.lang.Object apply(java.lang.Object obj) {
        int i = 2;
        switch (this.$cid) {
            case 0:
                if (!((j$.util.Optional) obj).isPresent()) {
                    defpackage.tcz.a.b().l("com/android/dialer/rtt/settings/impl/gateway/RttSettingsGatewayHandler", "createSupportLibrarySettingsIntent", 120, "RttSettingsGatewayHandler.java").v("FragmentMetadata is empty.");
                    return null;
                }
                java.lang.Object obj2 = this.a;
                akzx akzxVarM = defpackage.rvq.a.m();
                akzx akzxVarM2 = defpackage.rvo.a.m();
                defpackage.rvc rvcVar = defpackage.rvc.RTT;
                akzxVarM2.u();
                ((defpackage.rvo) akzxVarM2.b).d = rvcVar.a();
                defpackage.rvo rvoVar = (defpackage.rvo) akzxVarM2.p();
                akzxVarM.u();
                defpackage.rvq rvqVar = (defpackage.rvq) akzxVarM.b;
                j$.util.Objects.requireNonNull(rvoVar);
                rvqVar.d = rvoVar;
                rvqVar.c = 2;
                return ((defpackage.tcz) obj2).c.aL((defpackage.rvq) akzxVarM.p());
            case 1:
                java.lang.Boolean bool = (java.lang.Boolean) obj;
                ?? r12 = this.a;
                try {
                    tcv.a.b().l("com/android/dialer/rtt/settings/impl/configuration/RttConfigurationLoaderImpl", "optimizedLoad", 114, "RttConfigurationLoaderImpl.java").y("Is device supported for RTT: %s", bool);
                    return bool.booleanValue() ? (tcp) aiql.H((java.util.concurrent.Future) r12) : tcp.b;
                } catch (java.util.concurrent.ExecutionException e) {
                    a.bq(tcv.a.c(), "Should never get here", "com/android/dialer/rtt/settings/impl/configuration/RttConfigurationLoaderImpl", "optimizedLoad", 'w', "RttConfigurationLoaderImpl.java", e, zct.b);
                    return tcp.b;
                }
            case 2:
                defpackage.tdd tddVar = (defpackage.tdd) this.a;
                java.lang.Boolean bool2 = (java.lang.Boolean) obj;
                java.util.Iterator it = tddVar.e.s().iterator();
                while (it.hasNext()) {
                    android.os.PersistableBundle persistableBundle = (android.os.PersistableBundle) tddVar.l.a(tddVar.k.b((android.telecom.PhoneAccountHandle) it.next())).orElse((java.lang.Object) null);
                    if (persistableBundle != null && persistableBundle.getBoolean("hide_tty_hco_vco_with_rtt", false) && bool2.booleanValue()) {
                        return java.lang.Boolean.TRUE;
                    }
                }
                return java.lang.Boolean.FALSE;
            case 3:
                ?? r13 = this.a;
                aimz aimzVar = defpackage.tia.a;
                return (aify) j$.util.Collection.-EL.stream((java.util.Collection) r13).map(new thy((aigf) obj, 1)).collect(aido.a);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                aihd aihdVar = (aihd) obj;
                aimz aimzVar2 = defpackage.tia.a;
                aift aiftVar = new aift(4);
                java.util.HashSet hashSet = new java.util.HashSet();
                for (defpackage.tin tinVar : this.a) {
                    if (tinVar.d == null) {
                        a.bI(defpackage.tia.a.c().m(aioa.b), "null phone number", "com/android/dialer/searchfragment/contactretriever/impl/Cp2DefaultDirectoryContactRetrieverImpl", "filterOutInvalidAccountTypes", (char) 311, "Cp2DefaultDirectoryContactRetrieverImpl.java", zct.b);
                    } else {
                        java.lang.Long lValueOf = java.lang.Long.valueOf(tinVar.a);
                        if (!hashSet.contains(lValueOf) && aihdVar.contains(java.lang.Long.valueOf(tinVar.l))) {
                            hashSet.add(lValueOf);
                            aiftVar.i(tinVar);
                        }
                    }
                }
                return aiftVar.h();
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                ?? r14 = this.a;
                aimz aimzVar3 = defpackage.tia.a;
                return (aify) j$.util.Collection.-EL.stream((java.util.Collection) r14).map(new thy((aigf) obj, 0)).collect(aido.a);
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                aimz aimzVar4 = defpackage.tib.a;
                return (aigf) j$.util.Collection.-EL.stream(((aigf) this.a).e()).collect(aido.b(new defpackage.thw(i), new thy((aigf) obj, 2)));
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                aigf aigfVar = (aigf) obj;
                aimz aimzVar5 = defpackage.tib.a;
                aigb aigbVar = new aigb(4);
                ailj ailjVarK = ((aigf) this.a).e().k();
                while (ailjVarK.hasNext()) {
                    java.util.Map.Entry entry = (java.util.Map.Entry) ailjVarK.next();
                    aift aiftVar2 = new aift(4);
                    aify aifyVar = (aify) entry.getValue();
                    int size = aifyVar.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        defpackage.tin tinVar2 = (defpackage.tin) aifyVar.get(i2);
                        wgi wgiVar = (wgi) aigfVar.getOrDefault(java.lang.String.valueOf(tinVar2.a), wgi.a);
                        defpackage.til tilVar = new defpackage.til(tinVar2);
                        tilVar.k(wgiVar);
                        aiftVar2.i(tilVar.a());
                    }
                    aigbVar.i((java.lang.Long) entry.getKey(), aiftVar2.h());
                }
                return aigbVar.e(true);
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                defpackage.amtv amtvVar = (defpackage.amtv) obj;
                akzx akzxVarP = ((alad) this.a).p();
                akzxVarP.u();
                defpackage.amtp amtpVar = (defpackage.amtp) akzxVarP.b;
                j$.util.Objects.requireNonNull(amtvVar);
                amtpVar.c = amtvVar;
                amtpVar.b |= 1;
                return (defpackage.amtp) akzxVarP.p();
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                hxe hxeVar = (hxe) obj;
                boolean zEquals = hxeVar.equals(hxe.a);
                java.lang.Object obj3 = this.a;
                if (zEquals) {
                    defpackage.tzv.a.b().l("com/android/dialer/sonic/impl/service/SonicAudioPlayer", "completeLocalAudioWithCuiLogging", 336, "SonicAudioPlayer.java").v("Sonic audio play at local side ended successfully");
                    ((defpackage.tzv) obj3).d.b(mce.cE);
                    return hxeVar;
                }
                defpackage.tzv.a.b().l("com/android/dialer/sonic/impl/service/SonicAudioPlayer", "completeLocalAudioWithCuiLogging", 339, "SonicAudioPlayer.java").y("Sonic audio play at local side ended with reason: %s", hxeVar);
                if (hxeVar.equals(hxe.c)) {
                    ((defpackage.tzv) obj3).d.a(mcd.Z);
                    return hxeVar;
                }
                ((defpackage.tzv) obj3).d.b(mce.cG);
                return hxeVar;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                hxe hxeVar2 = (hxe) obj;
                boolean zEquals2 = hxeVar2.equals(hxe.a);
                java.lang.Object obj4 = this.a;
                if (zEquals2) {
                    defpackage.tzv.a.b().l("com/android/dialer/sonic/impl/service/SonicAudioPlayer", "completeRemoteAudioWithCuiLogging", 394, "SonicAudioPlayer.java").v("Sonic audio play at remote side ended successfully");
                    ((defpackage.tzv) obj4).d.b(mce.cD);
                    return hxeVar2;
                }
                defpackage.tzv.a.d().l("com/android/dialer/sonic/impl/service/SonicAudioPlayer", "completeRemoteAudioWithCuiLogging", 397, "SonicAudioPlayer.java").y("Sonic audio play at remote side ended with reason: %s", hxeVar2);
                if (!hxeVar2.equals(hxe.c)) {
                    ((defpackage.tzv) obj4).d.b(mce.cF);
                    return hxeVar2;
                }
                defpackage.tzv tzvVar = (defpackage.tzv) obj4;
                tzvVar.d.a(mcd.Y);
                tzvVar.j.c();
                return hxeVar2;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    return null;
                }
                j$.util.Optional optionalG = ((defpackage.tzx) this.a).j.g();
                if (true != optionalG.isPresent()) {
                    return null;
                }
                ((defpackage.uat) optionalG.get()).b();
                return null;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                defpackage.uaq uaqVar = (defpackage.uaq) this.a;
                java.lang.Boolean bool3 = (java.lang.Boolean) obj;
                if (!((java.lang.Boolean) uaqVar.e.a()).booleanValue() || !bool3.booleanValue()) {
                    return null;
                }
                uaqVar.c();
                return null;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                ((defpackage.uaq) this.a).b();
                return null;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                defpackage.uar uarVar = (defpackage.uar) this.a;
                java.lang.Boolean bool4 = (java.lang.Boolean) obj;
                if (!((java.lang.Boolean) uarVar.d.a()).booleanValue() || !bool4.booleanValue()) {
                    return null;
                }
                uarVar.f.c();
                return null;
            case 15:
                java.util.Collection<kdy> collectionValues = ((java.util.Map) obj).values();
                aift aiftVarD = aify.d(collectionValues.size());
                boolean zBooleanValue = ((java.lang.Boolean) ((udd) this.a).c.a()).booleanValue();
                for (kdy kdyVar : collectionValues) {
                    if (zBooleanValue) {
                        aiftVarD.i(java.lang.String.valueOf(kdyVar.b));
                    } else {
                        java.lang.String str = kdyVar.s;
                        if (str != null) {
                            aiftVarD.i(str);
                        }
                    }
                }
                return aiftVarD.h();
            case 16:
                j$.util.Map.-EL.forEach((java.util.Map) this.a, new jwx((aigf) obj, 10));
                return null;
            case 17:
                j$.util.Optional optionalOf = j$.util.Optional.of(aiyg.b);
                if (optionalOf == null) {
                    throw new java.lang.NullPointerException("Null patronusSpamCheckSkipReason");
                }
                defpackage.udz udzVar = (defpackage.udz) this.a;
                udzVar.d = optionalOf;
                udzVar.c(ttj.H());
                return udzVar.a();
            case 18:
                akzc akzcVar = (akzc) obj;
                if (akzcVar == null) {
                    return null;
                }
                akzx akzxVar = (akzx) this.a;
                aivu aivuVar = ((defpackage.ucq) akzxVar.b).c;
                if (aivuVar == null) {
                    aivuVar = aivu.a;
                }
                akzx akzxVarP2 = aivuVar.p();
                akzx akzxVarM3 = aiyf.a.m();
                akzxVarM3.u();
                aiyf aiyfVar = akzxVarM3.b;
                j$.util.Objects.requireNonNull("14093167251235428823");
                aiyfVar.b |= 1;
                aiyfVar.c = "14093167251235428823";
                akzxVarM3.u();
                aiyf aiyfVar2 = akzxVarM3.b;
                j$.util.Objects.requireNonNull(akzcVar);
                aiyfVar2.b |= 2;
                aiyfVar2.d = akzcVar;
                akzxVarP2.u();
                aivu aivuVar2 = akzxVarP2.b;
                aiyf aiyfVarP = akzxVarM3.p();
                j$.util.Objects.requireNonNull(aiyfVarP);
                alat alatVar = aivuVar2.G;
                if (!alatVar.c()) {
                    aivuVar2.G = alad.J(alatVar);
                }
                aivuVar2.G.add(aiyfVarP);
                aivu aivuVarP = akzxVarP2.p();
                akzxVar.u();
                defpackage.ucq ucqVar = (defpackage.ucq) akzxVar.b;
                j$.util.Objects.requireNonNull(aivuVarP);
                ucqVar.c = aivuVarP;
                ucqVar.b |= 1;
                return null;
            case 19:
                defpackage.udz udzVar2 = (defpackage.udz) this.a;
                udzVar2.c((uip) obj);
                return udzVar2.a();
            default:
                j$.util.Optional optional = (j$.util.Optional) obj;
                defpackage.ubv ubvVar = new defpackage.ubv(this.a, 8);
                if (true != optional.isPresent()) {
                    return null;
                }
                java.lang.Object obj5 = optional.get();
                java.lang.Object obj6 = ubvVar.a;
                java.lang.Object obj7 = ((defpackage.taq) obj5).a;
                akzx akzxVar2 = (akzx) obj6;
                aivu aivuVar3 = ((defpackage.ucq) akzxVar2.b).c;
                if (aivuVar3 == null) {
                    aivuVar3 = aivu.a;
                }
                akzx akzxVarP3 = aivuVar3.p();
                defpackage.ucu ucuVar = (defpackage.ucu) obj7;
                if ((ucuVar.b & 4096) != 0) {
                    aivw aivwVar = ucuVar.n;
                    if (aivwVar == null) {
                        aivwVar = aivw.a;
                    }
                    akzxVarP3.u();
                    aivu aivuVar4 = akzxVarP3.b;
                    j$.util.Objects.requireNonNull(aivwVar);
                    aivuVar4.H = aivwVar;
                    aivuVar4.c |= 4;
                }
                akzxVar2.u();
                defpackage.ucq ucqVar2 = (defpackage.ucq) akzxVar2.b;
                aivu aivuVarP2 = akzxVarP3.p();
                j$.util.Objects.requireNonNull(aivuVarP2);
                ucqVar2.c = aivuVarP2;
                ucqVar2.b |= 1;
                return null;
        }
    }
}
