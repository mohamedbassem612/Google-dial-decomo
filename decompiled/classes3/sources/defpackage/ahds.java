package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class ahds implements ahyc {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ ahds(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v2, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v27, types: [aiiy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r10v5, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v6, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v7, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v21, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v26, types: [aoin, java.lang.Object] */
    public final java.lang.Object apply(java.lang.Object obj) {
        switch (this.$cid) {
            case 0:
                return this.a.a(obj);
            case 1:
                return a.l((aonj) this.a, obj);
            case 2:
                aooh.f((java.util.List) obj, "it");
                return (ahbm) aiql.H((java.util.concurrent.Future) this.a);
            case 3:
                this.a.a(obj);
                return null;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                this.a.a(obj);
                return null;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                this.a.a(obj);
                return null;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                boolean z = ((aiyy) obj).f() == 1;
                java.lang.Object obj2 = this.a;
                java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(z);
                ((defpackage.ahid) obj2).b.set(boolValueOf);
                return boolValueOf;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                defpackage.ahid.a.d().k((java.lang.Throwable) obj).l("com/google/apps/tiktok/monitoring/checkbox/TikTokCheckboxCheckerImpl", "shouldLog", 70, "TikTokCheckboxCheckerImpl.java").v("fetching usage reporting opt-in failed");
                java.lang.Object obj3 = this.a;
                java.lang.Boolean bool = java.lang.Boolean.FALSE;
                ((defpackage.ahid) obj3).b.set(bool);
                return bool;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                com.google.android.gms.auth.TokenData tokenData = (com.google.android.gms.auth.TokenData) obj;
                java.lang.String str = tokenData.b;
                java.lang.Long l = tokenData.c;
                int i = defpackage.ahjv.e;
                j$.util.Optional optionalOfNullable = j$.util.Optional.ofNullable(l);
                if (true == optionalOfNullable.isPresent()) {
                    optionalOfNullable = j$.util.Optional.ofNullable(j$.time.Instant.ofEpochSecond(((java.lang.Long) optionalOfNullable.get()).longValue()));
                }
                return new ucm(str, this.a, (j$.time.Instant) optionalOfNullable.orElse((java.lang.Object) null));
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    return null;
                }
                defpackage.akxm akxmVar = (defpackage.akxm) this.a;
                defpackage.ahiy ahiyVar = (defpackage.ahiy) akxmVar.d.a();
                aogc aogcVar = (aogc) akxmVar.e;
                ahiyVar.a((java.lang.String) aogcVar.b, aogcVar.p(), "poke");
                return null;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    return null;
                }
                defpackage.akxm akxmVar2 = (defpackage.akxm) this.a;
                defpackage.ahiy ahiyVar2 = (defpackage.ahiy) akxmVar2.d.a();
                aogc aogcVar2 = (aogc) akxmVar2.e;
                ahiyVar2.a((java.lang.String) aogcVar2.b, aogcVar2.p(), "sync");
                return null;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                java.util.Map.Entry entry = (java.util.Map.Entry) obj;
                ?? r10 = this.a;
                ahvr.ci((java.lang.Object) r10);
                ahvr.ci(entry);
                return new defpackage.aiiw(entry, r10);
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                java.util.Map.Entry entry2 = (java.util.Map.Entry) obj;
                return ((aijn) this.a).b.a(entry2.getKey(), entry2.getValue());
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                defpackage.ajzm ajzmVar = (defpackage.ajzm) this.a;
                aiii aiiiVar = ajzmVar.c;
                android.net.Uri uri = android.net.Uri.parse(ajzmVar.a);
                java.util.HashSet hashSet = new java.util.HashSet(aiiiVar.p());
                java.util.HashSet hashSet2 = new java.util.HashSet(uri.getQueryParameterNames());
                aifz aifzVar = new aifz();
                aifzVar.c(aiiiVar);
                android.net.Uri.Builder builderBuildUpon = uri.buildUpon();
                for (defpackage.ajzn ajznVar : (java.util.List) obj) {
                    for (defpackage.ajzj ajzjVar : ajznVar.a().e()) {
                        if (!hashSet.add(ajzjVar)) {
                            throw new defpackage.ajzo(java.lang.String.format("Duplicate header key: %s", ajzjVar.a));
                        }
                    }
                    for (java.lang.String str2 : ajznVar.b().e()) {
                        if (!hashSet2.add(str2)) {
                            throw new defpackage.ajzo(java.lang.String.format("Duplicate url parameter key: %s", str2));
                        }
                    }
                    aifzVar.c(ajznVar.a());
                    ailj ailjVarK = ajznVar.b().d().k();
                    while (ailjVarK.hasNext()) {
                        java.util.Map.Entry entry3 = (java.util.Map.Entry) ailjVarK.next();
                        builderBuildUpon.appendQueryParameter((java.lang.String) entry3.getKey(), (java.lang.String) entry3.getValue());
                    }
                }
                defpackage.ajzk ajzkVarA = ajzmVar.a();
                ajzkVarA.i.clear();
                ajzkVarA.b.q();
                ajzkVarA.f(builderBuildUpon.build().toString());
                ajzkVarA.a(aifzVar.a());
                return new defpackage.ajzm(ajzkVarA);
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                return akwz.e((akxy) this.a, 10007);
            default:
                amcx.a.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/CacheSupportedAmStateManager", "init", 1471, "CacheSupportedAmStateManager.java").v("Successfully initialized ivr options parser.");
                ((amcx) this.a).h.set(true);
                return null;
        }
    }
}
