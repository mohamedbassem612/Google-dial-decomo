package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class abdh implements java.util.function.Predicate {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ abdh(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // java.util.function.Predicate
    public final /* synthetic */ java.util.function.Predicate and(java.util.function.Predicate predicate) {
        switch (this.$cid) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                break;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                break;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                break;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                break;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                break;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                break;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            default:
                break;
        }
        return j$.util.function.Predicate.-CC.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final /* synthetic */ java.util.function.Predicate negate() {
        switch (this.$cid) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                break;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                break;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                break;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                break;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                break;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                break;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            default:
                break;
        }
        return j$.util.function.Predicate.-CC.$default$negate(this);
    }

    @Override // java.util.function.Predicate
    public final /* synthetic */ java.util.function.Predicate or(java.util.function.Predicate predicate) {
        switch (this.$cid) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                break;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                break;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                break;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                break;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                break;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                break;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            default:
                break;
        }
        return j$.util.function.Predicate.-CC.$default$or(this, predicate);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v6, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v9, types: [aonj, java.lang.Object] */
    @Override // java.util.function.Predicate
    public final boolean test(java.lang.Object obj) {
        j$.time.Instant instantDK;
        switch (this.$cid) {
            case 0:
                return j$.util.Collection.-EL.stream((java.util.Collection) this.a).anyMatch(new defpackage.abdh((java.lang.String) obj, 2));
            case 1:
                return ((defpackage.ztw) ((defpackage.afpl) obj).b).g.equals(this.a);
            case 2:
                return ((android.os.PatternMatcher) obj).match((java.lang.String) this.a);
            case 3:
                return a.w((aonj) this.a, obj);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return a.w((aonj) this.a, obj);
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return a.w((aonj) this.a, obj);
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return a.w((aonj) this.a, obj);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                try {
                    return admd.c((java.util.zip.ZipEntry) this.a).startsWith((java.lang.String) obj);
                } catch (java.io.IOException unused) {
                }
                break;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                if (!((adql) this.a).e((adnv) obj)) {
                    return true;
                }
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                return ((adsi) obj).b.equals(this.a);
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                j$.util.Optional optional = ((adqt) obj).a;
                if (optional.isPresent()) {
                    if (optional.get().equals(this.a)) {
                        return true;
                    }
                }
                break;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                j$.util.Optional optional2 = ((adqt) obj).a;
                if (optional2.isPresent()) {
                    if (optional2.get().equals(this.a)) {
                        return true;
                    }
                }
                break;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                java.lang.String str = (java.lang.String) obj;
                if (!str.equals(((adqy) this.a).c) && j$.util.Collection.-EL.stream(adqy.a).noneMatch(new defpackage.abdh(str, 13))) {
                    return true;
                }
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                aihd aihdVar = adqy.a;
                return ((java.lang.String) this.a).contains((java.lang.String) obj);
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                apgw apgwVar = (apgw) obj;
                int i = apgwVar.c;
                if (i == 1) {
                    alcf alcfVar = ((apfr) apgwVar.d).g;
                    if (alcfVar == null) {
                        alcfVar = alcf.a;
                    }
                    instantDK = ajsz.dK(alcfVar);
                } else {
                    alcf alcfVar2 = (i == 3 ? (aphg) apgwVar.d : aphg.a).e;
                    if (alcfVar2 == null) {
                        alcfVar2 = alcf.a;
                    }
                    instantDK = ajsz.dK(alcfVar2);
                }
                return instantDK.isAfter((j$.time.Instant) this.a);
            case 15:
                java.lang.String str2 = (java.lang.String) obj;
                java.util.regex.Pattern pattern = aetp.a;
                java.lang.String str3 = (java.lang.String) this.a;
                if (str3.equals(str2) || str3.endsWith(".".concat(java.lang.String.valueOf(str2)))) {
                    return true;
                }
                break;
            case 16:
                return ((java.lang.String) this.a).contains((java.lang.String) obj);
            case 17:
                int i2 = defpackage.akak.b;
                if (!((aihd) this.a).contains(((defpackage.akal) ((java.util.Map.Entry) obj).getKey()).a)) {
                    return true;
                }
                break;
            case 18:
                java.util.Map.Entry entry = (java.util.Map.Entry) obj;
                return j$.util.Collection.-EL.stream(((defpackage.ulw) ((defpackage.alic) this.a).b).d(aify.q((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue()))).allMatch(new defpackage.zun(16));
            case 19:
                return ((aihd) this.a).contains(((java.util.Map.Entry) obj).getKey());
            default:
                return ((almy) obj).e.equals(this.a);
        }
        return false;
    }
}
