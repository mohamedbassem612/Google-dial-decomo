package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class tai implements ajat {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ tai(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r14v37, types: [adnm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v83, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final ajcq a(java.lang.Object obj) {
        java.lang.Object obj2;
        ajcq ajcqVarB;
        byte[] bArr = null;
        int i = 6;
        int i2 = 9;
        int i3 = 4;
        int i4 = 3;
        int i5 = 2;
        int i6 = 1;
        int i7 = 0;
        switch (this.$cid) {
            case 0:
                boolean zBooleanValue = ((java.lang.Boolean) obj).booleanValue();
                java.lang.Object obj3 = this.a;
                return ahvr.G(new iaw(obj3, zBooleanValue, 4), ((defpackage.szs) obj3).g);
            case 1:
                lgi.a.b().l("com/android/dialer/callscreen/impl/service/CallScreenState", "removeConversationListener", 176, "CallScreenState.java").v("enter");
                defpackage.szt sztVar = (defpackage.szt) this.a;
                lgi lgiVar = sztVar.b;
                return ahvr.ak(new ajcq[]{ahvr.E(new ldf(lgiVar, 9), lgiVar.c), sztVar.c.b()}).o(new onq(9), sztVar.d);
            case 2:
                fvl fvlVar = new fvl(6);
                defpackage.szs szsVar = ((defpackage.tam) this.a).g;
                long jLongValue = ((java.lang.Long) szsVar.s.a()).longValue();
                ajcu ajcuVar = szsVar.e;
                return ahrv.g(ajcuVar.b(fvlVar, jLongValue, java.util.concurrent.TimeUnit.MILLISECONDS)).i(new defpackage.srq(szsVar, 20), ajcuVar).i(new defpackage.szq(szsVar, i6), ajcuVar);
            case 3:
                j$.util.Optional optional = (j$.util.Optional) obj;
                boolean zIsPresent = optional.isPresent();
                java.lang.Object obj4 = this.a;
                if (!zIsPresent) {
                    defpackage.tam tamVar = (defpackage.tam) obj4;
                    tamVar.p.a(qbc.fz);
                    return ahvr.I(tamVar.o.g(true), new defpackage.tai(obj4, i2), tamVar.b);
                }
                defpackage.tam tamVar2 = (defpackage.tam) obj4;
                tbm tbmVar = tamVar2.e;
                long j = tamVar2.f;
                agsm.i(858, tbmVar.d(j, new lct(17)), "Failed setting call auto screened in Revelio metrics", new java.lang.Object[0]);
                defpackage.qbe qbeVar = tamVar2.p;
                qbeVar.c(((lhd) optional.orElseThrow()).a ? qbc.fr : qbc.fp);
                lhd lhdVar = (lhd) optional.orElseThrow();
                ahoq ahoqVarW = ahvr.W(862, "RevelioSessionInitializer.startRevelio");
                try {
                    qbeVar.a(qbc.ft);
                    tbmVar.f(j$.util.Optional.of(((defpackage.tam) obj4).m));
                    defpackage.swx swxVar = ((defpackage.tam) obj4).i;
                    aimw aimwVarL = defpackage.swx.a.b().l("com/android/dialer/revelio/impl/tidepods/impl/audio/VolumeChangeDetector", "startDetecting", 37, "VolumeChangeDetector.java");
                    android.media.AudioManager audioManager = swxVar.d;
                    aimwVarL.z("call volume:%d, ringer volume:%d", audioManager.getStreamVolume(0), audioManager.getStreamVolume(2));
                    swxVar.b.r(android.provider.Settings.System.CONTENT_URI, swxVar.c);
                    ahrv ahrvVarG = ahrv.g(tbmVar.c(j, defpackage.amrc.CALLER_DISCONNECTED));
                    defpackage.tai taiVar = new defpackage.tai(obj4, 11);
                    ajcu ajcuVar2 = ((defpackage.tam) obj4).b;
                    ahrv ahrvVarI = ahrvVarG.i(taiVar, ajcuVar2).i(new defpackage.tai(obj4, 12), ajcuVar2).i(new defpackage.tak(obj4, lhdVar, i7), ajcuVar2).i(new defpackage.tai(obj4, 13), ajcuVar2).i(new defpackage.tai(obj4, 14), ajcuVar2).i(new defpackage.tai(obj4, 15), ajcuVar2);
                    ahoqVarW.a(ahrvVarI);
                    ahrv ahrvVarI2 = ahrv.g(ahrvVarI).i(new defpackage.tai(obj4, 16), ajcuVar2).i(new defpackage.qgk(i4), ajcuVar2);
                    defpackage.szs szsVar2 = ((defpackage.tam) obj4).g;
                    j$.util.Objects.requireNonNull(szsVar2);
                    agsm.i(863, ahrvVarI2.i(new defpackage.tai(szsVar2, i7), ajcuVar2), "failed to listen to caller spam status result", new java.lang.Object[0]);
                    agsm.i(864, ahvr.I(ahrvVarI, new defpackage.tai(obj4, i5), ajcuVar2), "startScreeningTimeout failed", new java.lang.Object[0]);
                    ahoqVarW.close();
                    return ahrvVarI;
                } catch (java.lang.Throwable th) {
                    try {
                        ahoqVarW.close();
                        throw th;
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                defpackage.tal talVar = (defpackage.tal) obj;
                ajcq ajcqVarAS = talVar.aS();
                ajcq ajcqVarAM = talVar.aM();
                ajcq ajcqVarAL = talVar.aL();
                ajcq ajcqVarBu = talVar.bu();
                return ahvr.ak(new ajcq[]{ajcqVarAS, ajcqVarAM, ajcqVarAL, ajcqVarBu}).o(new joq(ajcqVarBu, ajcqVarAS, ajcqVarAM, ajcqVarAL, 10), ((defpackage.tam) this.a).b);
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return ((defpackage.tam) this.a).d.a();
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                java.lang.Object obj5 = this.a;
                j$.util.Optional optionalD = ((defpackage.tam) obj5).l.d();
                defpackage.taj tajVar = new defpackage.taj(obj5, 0);
                if (true == optionalD.isPresent()) {
                    ?? r14 = optionalD.get();
                    java.lang.Object obj6 = tajVar.a;
                    adoa adoaVar = adoa.a;
                    if (r14.e(adoaVar)) {
                        ((defpackage.tam) obj6).p.a(qbc.fn);
                        ajcqVarB = ajcm.a;
                    } else {
                        ((defpackage.tam) obj6).p.a(qbc.fo);
                        ajcqVarB = r14.b(adoaVar);
                    }
                    optionalD = j$.util.Optional.ofNullable(ajcqVarB);
                }
                if (true != optionalD.isPresent()) {
                    a.bI(defpackage.tam.a.c().m(aioa.b), "CallAvatarSessionManager unavailable when starting Revelio", "com/android/dialer/revelio/impl/tidepods/impl/service/RevelioSessionInitializer", "initializeAvatarSessionManager", (char) 323, "RevelioSessionInitializer.java", zct.b);
                    obj2 = ajcm.a;
                } else {
                    obj2 = optionalD.get();
                }
                return (ajcq) obj2;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                java.util.concurrent.Callable callableI = ahqx.i(new onq(10));
                java.lang.Object obj7 = this.a;
                java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
                ajcu ajcuVar3 = ((defpackage.tam) obj7).b;
                return ahvr.I(ajcuVar3.c(callableI, 3L, timeUnit), new defpackage.tai(obj7, 10), ajcuVar3);
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                defpackage.tam tamVar3 = (defpackage.tam) this.a;
                tamVar3.p.a(qbc.fx);
                return tamVar3.c();
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                return ((defpackage.tam) this.a).c();
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                defpackage.szs szsVar3 = ((defpackage.tam) this.a).g;
                return ahvr.E(new defpackage.sxq(szsVar3, i5), szsVar3.g);
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                defpackage.tam tamVar4 = (defpackage.tam) this.a;
                return tamVar4.j.a(tamVar4.f, 3);
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                java.lang.Object obj8 = this.a;
                defpackage.tam tamVar5 = (defpackage.tam) obj8;
                return ahrv.g(tamVar5.l.a()).i(new defpackage.tai(obj8, i), tamVar5.b);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                java.lang.Object obj9 = this.a;
                defpackage.tam tamVar6 = (defpackage.tam) obj9;
                ajcq ajcqVarB2 = tamVar6.d.b(lgj.c);
                defpackage.tai taiVar2 = new defpackage.tai(obj9, 7);
                ajcu ajcuVar4 = tamVar6.b;
                agsm.i(861, ahvr.I(ajcqVarB2, taiVar2, ajcuVar4), "startScreeningTimeout failed", new java.lang.Object[0]);
                return ahvr.I(ajcqVarB2, new defpackage.tai(obj9, 8), ajcuVar4);
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                defpackage.szt.a.b().l("com/android/dialer/revelio/impl/tidepods/impl/service/RevelioConversationListener", "startListening", 61, "RevelioConversationListener.java").v("enter");
                lgi.a.b().l("com/android/dialer/callscreen/impl/service/CallScreenState", "setConversationListener", 167, "CallScreenState.java").v("enter");
                defpackage.szt sztVar2 = ((defpackage.tam) this.a).k;
                lgi lgiVar2 = sztVar2.b;
                return ahvr.E(new lge(lgiVar2, sztVar2, 3), lgiVar2.c);
            case 15:
                java.lang.Object obj10 = this.a;
                defpackage.tam tamVar7 = (defpackage.tam) obj10;
                return tamVar7.h.a() ? tamVar7.d.a() : ahvr.I(tamVar7.o.b(), new defpackage.tai(obj10, 5), tamVar7.b);
            case 16:
                return ((defpackage.tam) this.a).b();
            case 17:
                return ((ldq) ((defpackage.rdp) this.a).b).a(j$.util.Optional.empty());
            case 18:
                tbf tbfVar = (tbf) obj;
                int iAQ = a.aQ(tbfVar.c);
                i6 = iAQ != 0 ? iAQ : 1;
                java.lang.Object obj11 = this.a;
                gou gouVar = (gou) obj11;
                return ahvr.I(ahvr.H(((uhs) gouVar.e).a(), new defpackage.tbc(i6, 0), (java.util.concurrent.Executor) gouVar.a), new defpackage.tak(obj11, tbfVar, i4, bArr), (java.util.concurrent.Executor) gouVar.b);
            case 19:
                j$.util.Optional optional2 = (j$.util.Optional) obj;
                if (!optional2.isPresent()) {
                    a.bI(defpackage.tbj.a.c().m(aioa.b), "audioRequestOptional returns empty", "com/android/dialer/revelio/impl/tidepods/impl/soundplayer/RevelioInCallAudioPlayer", "playAudioMessage", (char) 161, "RevelioInCallAudioPlayer.java", zct.b);
                    return ajcm.a;
                }
                java.lang.Object obj12 = this.a;
                adnw adnwVar = (adnw) optional2.orElseThrow();
                j$.util.Optional optional3 = adnwVar.a;
                optional3.isPresent();
                j$.util.Optional optional4 = adnwVar.b;
                optional4.isPresent();
                return ((defpackage.tbj) obj12).b.d((java.io.File) optional3.orElseThrow(), (java.lang.String) optional4.orElseThrow());
            default:
                j$.util.Optional optional5 = (j$.util.Optional) obj;
                if (!optional5.isPresent()) {
                    return aiql.y(new java.lang.IllegalStateException("Voicemail beep sound file not available; cannot play voicemail beep sound"));
                }
                java.lang.Object obj13 = this.a;
                defpackage.tbj tbjVar = (defpackage.tbj) obj13;
                return ahvr.I(tbjVar.b.c(), new defpackage.tak(obj13, optional5, i3, bArr), tbjVar.c);
        }
    }
}
