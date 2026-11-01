package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class adek implements ahyc {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ adek(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v2, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v39, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v40, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v41, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v8, types: [adfq, java.lang.Object] */
    public final java.lang.Object apply(java.lang.Object obj) {
        int i = 0;
        switch (this.$cid) {
            case 0:
                return this.a.a(obj);
            case 1:
                return this.a.a(obj);
            case 2:
                adfl adflVar = (adfl) obj;
                if (!adff.i(adflVar)) {
                    return ((adff) this.a).a();
                }
                akof akofVar = adflVar.b;
                if (akofVar == null) {
                    akofVar = akof.a;
                }
                return ahyn.h(akofVar);
            case 3:
                this.a.a((com.google.android.libraries.micore.superpacks.base.VersionedName) obj);
                return java.lang.Boolean.TRUE;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                defpackage.adow adowVar = (defpackage.adow) this.a;
                adowVar.p(defpackage.adov.g, null, true);
                defpackage.adow.a.b().l("com/google/android/libraries/micore/telephony/callflow/incomingcall/IncomingCallFlowManager", "stop", 430, "IncomingCallFlowManager.java").w("%d:stop():Incoming call flow stopped", adowVar.j);
                return null;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                defpackage.adow.a.b().l("com/google/android/libraries/micore/telephony/callflow/incomingcall/IncomingCallFlowManager", "performStopSequence", 535, "IncomingCallFlowManager.java").w("%d:performStopSequence(future): speech and playback were shutdown", ((defpackage.adow) this.a).j);
                return null;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                boolean zBooleanValue = ((java.lang.Boolean) obj).booleanValue();
                defpackage.adow adowVar2 = (defpackage.adow) this.a;
                adowVar2.m = zBooleanValue;
                if (!zBooleanValue || adowVar2.a() != defpackage.adov.b) {
                    return null;
                }
                adowVar2.k();
                adowVar2.p(defpackage.adov.c, null, false);
                defpackage.adow.a.b().l("com/google/android/libraries/micore/telephony/callflow/incomingcall/IncomingCallFlowManager", "startInternal", 314, "IncomingCallFlowManager.java").w("%d:start():Incoming call flow started", adowVar2.j);
                return null;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                defpackage.adow adowVar3 = (defpackage.adow) this.a;
                adowVar3.l();
                adowVar3.p(defpackage.adov.e, null, false);
                defpackage.adow.a.b().l("com/google/android/libraries/micore/telephony/callflow/incomingcall/IncomingCallFlowManager", "pause", 494, "IncomingCallFlowManager.java").w("%d:pause():Incoming call flow paused", adowVar3.j);
                return null;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                return this.a;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                return ((aemh) obj).b((java.lang.String) this.a);
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                aify aifyVar = (aify) obj;
                int i2 = defpackage.aemw.b;
                int size = aifyVar.size();
                while (i < size) {
                    java.lang.Object obj2 = this.a;
                    aeme aemeVar = (aeme) aifyVar.get(i);
                    i++;
                    if (((java.lang.String) obj2).equals(aemeVar.a)) {
                        return aemeVar;
                    }
                }
                return null;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                try {
                    return new java.lang.ProcessBuilder("/system/bin/trigger_perfetto", (java.lang.String) obj).start();
                } catch (java.io.IOException unused) {
                    ((aerb) this.a).b = true;
                    return null;
                }
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                int iF = ((aiyy) obj).f();
                boolean z = iF == 1 || iF == 3;
                java.lang.Object obj3 = this.a;
                java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(z);
                ((defpackage.aevx) obj3).a.set(boolValueOf);
                return boolValueOf;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                int i3 = defpackage.aezf.a;
                akzx akzxVarM = defpackage.aeyb.a.m();
                for (java.util.Map.Entry entry : j$.util.DesugarCollections.unmodifiableMap(((defpackage.aeyb) obj).b).entrySet()) {
                    java.lang.Object obj4 = this.a;
                    defpackage.aeya aeyaVar = (defpackage.aeya) entry.getValue();
                    akzx akzxVarM2 = defpackage.aeya.a.m();
                    if (!aeyaVar.d.equals(obj4)) {
                        java.lang.String str = aeyaVar.d;
                        akzxVarM2.u();
                        defpackage.aeya aeyaVar2 = (defpackage.aeya) akzxVarM2.b;
                        j$.util.Objects.requireNonNull(str);
                        aeyaVar2.b |= 1;
                        aeyaVar2.d = str;
                    }
                    for (java.lang.String str2 : aeyaVar.c) {
                        if (!str2.equals(obj4)) {
                            akzxVarM2.ao(str2);
                        }
                    }
                    akzxVarM.ap((java.lang.String) entry.getKey(), (defpackage.aeya) akzxVarM2.p());
                }
                return (defpackage.aeyb) akzxVarM.p();
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                java.lang.Object obj5 = this.a;
                int i4 = defpackage.aezf.a;
                defpackage.aeya aeyaVar3 = defpackage.aeya.a;
                j$.util.Objects.requireNonNull(obj5);
                defpackage.aeya aeyaVar4 = (defpackage.aeya) ((defpackage.aeyb) obj).b.get(obj5);
                if (aeyaVar4 != null) {
                    aeyaVar3 = aeyaVar4;
                }
                return aeyaVar3.c;
            case 15:
                java.lang.Object obj6 = this.a;
                int i5 = defpackage.aezf.a;
                defpackage.aeya aeyaVar5 = defpackage.aeya.a;
                j$.util.Objects.requireNonNull(obj6);
                defpackage.aeya aeyaVar6 = (defpackage.aeya) ((defpackage.aeyb) obj).b.get(obj6);
                if (aeyaVar6 != null) {
                    aeyaVar5 = aeyaVar6;
                }
                return aeyaVar5.d;
            case 16:
                return ((aezt) this.a).a();
            case 17:
                ((java.util.concurrent.atomic.AtomicBoolean) this.a).set(false);
                return null;
            case 18:
                return this.a.a(obj);
            case 19:
                return a.k((aonj) this.a, obj);
            default:
                return a.k((aonj) this.a, obj);
        }
    }
}
