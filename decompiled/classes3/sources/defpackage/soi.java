package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class soi implements ahyc {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ soi(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00ff  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v11, types: [java.lang.Object, sqn] */
    /* JADX WARN: Type inference failed for: r14v13, types: [java.lang.Object, sqn] */
    /* JADX WARN: Type inference failed for: r14v15, types: [java.lang.Object, sqn] */
    /* JADX WARN: Type inference failed for: r14v64, types: [java.lang.Object, swu] */
    public final java.lang.Object apply(java.lang.Object obj) {
        int i = 3;
        int i2 = 2;
        int i3 = 8;
        int i4 = 4;
        z = false;
        boolean z = false;
        z = false;
        boolean z2 = false;
        objArr = 0;
        java.lang.Object[] objArr = 0;
        switch (this.$cid) {
            case 0:
                java.util.List list = (java.util.List) obj;
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                soj sojVar = (soj) this.a;
                if (((java.lang.Boolean) sojVar.f.a()).booleanValue() && !list.isEmpty()) {
                    java.lang.String[] strArrSplit = new java.lang.String((byte[]) list.get(0), java.nio.charset.StandardCharsets.UTF_8).split(" ", -1);
                    if (strArrSplit.length == 0) {
                        throw new java.lang.IllegalStateException("Failed to parse persistent log time");
                    }
                    java.lang.String str = strArrSplit[0];
                    java.lang.String[] strArrSplit2 = new java.lang.String((byte[]) ahvr.bk(list), java.nio.charset.StandardCharsets.UTF_8).split(" ", -1);
                    if (strArrSplit2.length == 0) {
                        throw new java.lang.IllegalStateException("Failed to parse persistent log time");
                    }
                    java.lang.String str2 = strArrSplit2[0];
                    j$.time.format.DateTimeFormatter dateTimeFormatterOfPattern = j$.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd");
                    long jBetween = j$.time.temporal.ChronoUnit.DAYS.between(j$.time.LocalDate.from(dateTimeFormatterOfPattern.parse(str)), j$.time.LocalDate.from(dateTimeFormatterOfPattern.parse(str2))) + 1;
                    rlv rlvVar = sojVar.e;
                    akzx akzxVarM = ampt.a.m();
                    akzx akzxVarM2 = defpackage.amps.a.m();
                    akzxVarM2.u();
                    defpackage.amps ampsVar = (defpackage.amps) akzxVarM2.b;
                    ampsVar.b |= 1;
                    ampsVar.c = jBetween;
                    akzxVarM.u();
                    ampt amptVar = akzxVarM.b;
                    defpackage.amps ampsVar2 = (defpackage.amps) akzxVarM2.p();
                    j$.util.Objects.requireNonNull(ampsVar2);
                    amptVar.c = ampsVar2;
                    amptVar.b |= 1;
                    rlvVar.m(akzxVarM.p());
                }
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    sb.append(new java.lang.String((byte[]) it.next(), java.nio.charset.StandardCharsets.UTF_8));
                    sb.append('\n');
                }
                return sb.toString();
            case 1:
                byte[] bArr = (byte[]) obj;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.Object obj2 = this.a;
                try {
                    java.io.DataInputStream dataInputStream = new java.io.DataInputStream(new java.io.ByteArrayInputStream(bArr));
                    try {
                        for (byte[] bArrB = soh.b(dataInputStream); bArrB != null; bArrB = soh.b(dataInputStream)) {
                            arrayList.add(bArrB);
                        }
                        dataInputStream.close();
                        return arrayList;
                    } catch (java.lang.Throwable th) {
                        try {
                            dataInputStream.close();
                            throw th;
                        } catch (java.lang.Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                } catch (sog e) {
                    android.util.Log.e("DialerPersistentLogFile", "logs corrupted, deleting", e);
                    try {
                        for (java.io.File file : ((soh) obj2).c()) {
                            file.delete();
                        }
                        ((soh) obj2).a();
                        return new java.util.ArrayList();
                    } catch (java.io.IOException e2) {
                        throw new java.lang.AssertionError("error deleting persistent logs", e2);
                    }
                } catch (java.io.IOException e3) {
                    throw new java.lang.AssertionError("error reading persistent logs", e3);
                }
            case 2:
                sqi.a.c().i(zct.b).k((java.lang.Throwable) obj).l("com/android/dialer/phonelookup/composite/CompositePhoneLookup", "isDirty", 265, "CompositePhoneLookup.java").y("%s - isDirty check failed", this.a.g());
                return java.lang.Boolean.FALSE;
            case 3:
                sqi.a.b().k((java.lang.Throwable) obj).l("com/android/dialer/phonelookup/composite/CompositePhoneLookup", "lookup", 192, "CompositePhoneLookup.java").y("%s - lookup for number failed", this.a.g());
                return null;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                sqi.a.b().k((java.lang.Throwable) obj).l("com/android/dialer/phonelookup/composite/CompositePhoneLookup", "lookup", 140, "CompositePhoneLookup.java").y("%s - lookup for call failed", this.a.g());
                return null;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                a.bI(sqq.a.d(), "Time out!", "com/android/dialer/phonelookup/cp2/Cp2ExtendedDirectoryPhoneLookupContributor", "lookupInternal", (char) 224, "Cp2ExtendedDirectoryPhoneLookupContributor.java", zct.b);
                ((sqq) this.a).f.n(rmw.iF);
                return defpackage.spe.a;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                uip uipVar = (uip) ((aigf) obj).get(this.a);
                ahvr.ci(uipVar);
                udm udmVar = (udm) uipVar.k().g().orElse(udm.a);
                akzx akzxVarM3 = defpackage.spk.a.m();
                udj udjVarJ = uipVar.j();
                akzxVarM3.u();
                defpackage.spk spkVar = (defpackage.spk) akzxVarM3.b;
                spkVar.c = udjVarJ.f;
                spkVar.b |= 1;
                int iAQ = a.aQ(udmVar.i);
                if (iAQ == 0) {
                    iAQ = 1;
                }
                akzxVarM3.u();
                defpackage.spk spkVar2 = (defpackage.spk) akzxVarM3.b;
                spkVar2.e = iAQ - 1;
                spkVar2.b |= 4;
                int iAQ2 = a.aQ(udmVar.j);
                int i5 = iAQ2 != 0 ? iAQ2 : 1;
                akzxVarM3.u();
                defpackage.spk spkVar3 = (defpackage.spk) akzxVarM3.b;
                spkVar3.f = i5 - 1;
                spkVar3.b |= 8;
                return (defpackage.spk) akzxVarM3.p();
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                j$.util.Optional optionalMin = j$.util.Collection.-EL.stream(((sti) this.a).d.k().e()).filter(new defpackage.ree((ste) obj, i4)).min(j$.util.Comparator.-CC.comparingInt(new defpackage.rar(i3)));
                if (true != optionalMin.isPresent()) {
                    return optionalMin;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry) optionalMin.get();
                akzx akzxVarM4 = defpackage.stj.a.m();
                defpackage.stf stfVar = (defpackage.stf) entry.getKey();
                akzxVarM4.u();
                defpackage.stj stjVar = (defpackage.stj) akzxVarM4.b;
                stjVar.c = stfVar.a();
                stjVar.b |= 1;
                return j$.util.Optional.ofNullable((defpackage.stj) akzxVarM4.p());
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                java.lang.Boolean bool = (java.lang.Boolean) obj;
                ((swt) this.a).i.o(bool.booleanValue() ? rmx.ef : rmx.eg);
                return bool;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                java.lang.Boolean bool2 = (java.lang.Boolean) obj;
                boolean zBooleanValue = bool2.booleanValue();
                java.lang.Object obj3 = this.a;
                if (zBooleanValue) {
                    ((swv) obj3).f.o(rmx.gW);
                    return bool2;
                }
                ((swv) obj3).f.o(rmx.gV);
                return bool2;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                this.a.cp().a(qbc.fv);
                return java.lang.Boolean.TRUE;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                java.lang.String str3 = (java.lang.String) obj;
                java.lang.Object obj4 = this.a;
                defpackage.sxx sxxVar = (defpackage.sxx) obj4;
                oii oiiVar = sxxVar.d;
                if (oiiVar != null && oiiVar.o()) {
                    defpackage.sxx.a.b().l("com/android/dialer/revelio/impl/tidepods/impl/demo/TidepodsRevelioDemoPlayer", "playAudio", 50, "TidepodsRevelioDemoPlayer.java").v("audio is playing");
                    return defpackage.sxx.a(4);
                }
                if (str3.isEmpty()) {
                    defpackage.sxx.a.b().l("com/android/dialer/revelio/impl/tidepods/impl/demo/TidepodsRevelioDemoPlayer", "playAudio", 55, "TidepodsRevelioDemoPlayer.java").v("audio file path is empty");
                    return defpackage.sxx.a(5);
                }
                if (sxxVar.d == null) {
                    sxxVar.d = sxxVar.e.o();
                    sxxVar.d.h(new android.media.AudioAttributes.Builder().setContentType(1).setUsage(1).build());
                }
                try {
                    ((defpackage.sxx) obj4).d.f();
                    ((defpackage.sxx) obj4).d.i(str3);
                    ((defpackage.sxx) obj4).d.c();
                    ((defpackage.sxx) obj4).d.m();
                    defpackage.sxx.a.b().l("com/android/dialer/revelio/impl/tidepods/impl/demo/TidepodsRevelioDemoPlayer", "playAudio", 79, "TidepodsRevelioDemoPlayer.java").v("successfully played audio");
                    return defpackage.sxx.a(2);
                } catch (java.io.IOException unused) {
                    defpackage.sxx.a.c().m(aioa.b).l("com/android/dialer/revelio/impl/tidepods/impl/demo/TidepodsRevelioDemoPlayer", "playAudio", 74, "TidepodsRevelioDemoPlayer.java").y("Unable to play audio: %s", str3);
                    return defpackage.sxx.a(3);
                }
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                lgj lgjVar = (lgj) obj;
                boolean zBooleanValue2 = ((java.lang.Boolean) ((tkl) this.a).e().orElse(java.lang.Boolean.FALSE)).booleanValue();
                lgj lgjVar2 = lgj.f;
                if (zBooleanValue2 && (lgjVar == lgj.e || lgjVar == lgj.d)) {
                    objArr = 1;
                }
                return (lgjVar == lgjVar2 || objArr != 0) ? j$.util.Optional.of(new defpackage.syh(2)) : j$.util.Optional.empty();
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                j$.util.Optional optional = (j$.util.Optional) obj;
                if (!optional.isPresent()) {
                    defpackage.szn.a.b().l("com/android/dialer/revelio/impl/tidepods/impl/service/CachedAudioGroupInterpreter", "loadAndCacheInterpreter", 83, "CachedAudioGroupInterpreter.java").v("audioGroupInterpreter wasn't present");
                    return j$.util.Optional.empty();
                }
                java.lang.Object obj5 = this.a;
                defpackage.rdp rdpVar = (defpackage.rdp) optional.orElseThrow();
                java.util.concurrent.atomic.AtomicReference atomicReference = ((defpackage.szn) obj5).b;
                if (!anty.aq(atomicReference, rdpVar)) {
                    defpackage.szn.a.b().l("com/android/dialer/revelio/impl/tidepods/impl/service/CachedAudioGroupInterpreter", "loadAndCacheInterpreter", 88, "CachedAudioGroupInterpreter.java").y("another thread set audioGroupInterpreter first, dropping this one with voice: %s", ((defpackage.rdp) optional.orElseThrow()).d);
                }
                defpackage.rdp rdpVar2 = (defpackage.rdp) atomicReference.get();
                defpackage.szn.a.b().l("com/android/dialer/revelio/impl/tidepods/impl/service/CachedAudioGroupInterpreter", "loadAndCacheInterpreter", 95, "CachedAudioGroupInterpreter.java").y("returning audioGroupInterpreter with voice: %s", rdpVar2.d);
                return j$.util.Optional.of(rdpVar2);
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                ((defpackage.szs) this.a).j();
                return null;
            case 15:
                defpackage.szs szsVar = (defpackage.szs) this.a;
                long j = szsVar.k;
                java.lang.String strValueOf = java.lang.String.valueOf(j);
                akzx akzxVarM5 = defpackage.ucu.a.m();
                akzxVarM5.u();
                defpackage.ucu ucuVar = (defpackage.ucu) akzxVarM5.b;
                ucuVar.b |= 1;
                ucuVar.c = j;
                j$.util.Optional optionalOf = j$.util.Optional.of((defpackage.amrc) obj);
                aooh.f(optionalOf, "revelioOutcome");
                optionalOf.isPresent();
                defpackage.amrc amrcVar = (defpackage.amrc) optionalOf.orElseThrow();
                if (amrcVar != null) {
                    switch (amrcVar.ordinal()) {
                        case 1:
                            i = 2;
                            break;
                        case 2:
                            break;
                        case 3:
                            i = 7;
                            break;
                        case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                            i = 4;
                            break;
                        case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                            i = 5;
                            break;
                        case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                            i = 6;
                            break;
                        case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                            i = 8;
                            break;
                        default:
                            i = 1;
                            break;
                    }
                } else {
                    i = 1;
                }
                tvn tvnVar = szsVar.H;
                akzxVarM5.u();
                defpackage.ucu ucuVar2 = (defpackage.ucu) akzxVarM5.b;
                ucuVar2.k = i - 1;
                ucuVar2.b |= 512;
                tvnVar.b(strValueOf, (defpackage.ucu) akzxVarM5.p());
                return null;
            case 16:
                akzx akzxVar = (akzx) this.a;
                akzxVar.u();
                tbf tbfVar = akzxVar.b;
                tbf tbfVar2 = tbf.a;
                tbfVar.e = ((defpackage.tbe) obj).e;
                tbfVar.b |= 4;
                return akzxVar.p();
            case 17:
                java.lang.Boolean bool3 = (java.lang.Boolean) obj;
                if (((uhs) ((gou) this.a).e).e() && bool3.booleanValue()) {
                    z2 = true;
                }
                return java.lang.Boolean.valueOf(z2);
            case 18:
                java.lang.Boolean bool4 = (java.lang.Boolean) obj;
                if (((uhs) ((gou) this.a).e).e() && !bool4.booleanValue()) {
                    z = true;
                }
                return java.lang.Boolean.valueOf(z);
            case 19:
                defpackage.amrc amrcVar2 = (defpackage.amrc) obj;
                akzx akzxVar2 = (akzx) this.a;
                defpackage.amrd amrdVar = ((defpackage.amrf) akzxVar2.b).f;
                if (amrdVar == null) {
                    amrdVar = defpackage.amrd.a;
                }
                akzx akzxVarP = amrdVar.p();
                akzxVarP.u();
                defpackage.amrd amrdVar2 = (defpackage.amrd) akzxVarP.b;
                amrdVar2.c = amrcVar2.i;
                amrdVar2.b |= 1;
                defpackage.amrd amrdVar3 = (defpackage.amrd) akzxVarP.p();
                akzxVar2.u();
                defpackage.amrf amrfVar = (defpackage.amrf) akzxVar2.b;
                j$.util.Objects.requireNonNull(amrdVar3);
                amrfVar.f = amrdVar3;
                amrfVar.b |= 8;
                return j$.util.Optional.of((defpackage.amrf) akzxVar2.p());
            default:
                j$.util.Optional optional2 = (j$.util.Optional) obj;
                defpackage.taj tajVar = new defpackage.taj(this.a, i2);
                if (true != optional2.isPresent()) {
                    return optional2;
                }
                return j$.util.Optional.ofNullable(adnw.a((java.io.File) optional2.get(), (java.lang.String) tajVar.a));
        }
    }
}
