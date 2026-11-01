package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class ubv implements java.util.function.Consumer {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ ubv(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v33, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v34, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v35, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v36, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v39, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v40, types: [aonj, java.lang.Object] */
    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object obj) {
        switch (this.$cid) {
            case 0:
                this.a.a(obj);
                break;
            case 1:
                ((android.os.Bundle) this.a).putInt("key_rtt_configuration_cache", ((tcp) obj).f);
                break;
            case 2:
                ((com.google.android.libraries.communications.ux.views.promo.PromoCard) ((aw) ((defpackage.ucc) this.a).b).Q.findViewById(2131428742)).setEnabled(((defpackage.uap) obj).c);
                break;
            case 3:
                udk udkVar = udk.b;
                udk udkVarB = udk.b(((udm) obj).f);
                if (udkVarB == null) {
                    udkVarB = udk.a;
                }
                if (udkVar.equals(udkVarB)) {
                    ((aift) this.a).i(defpackage.amot.DIALER_STIR_SHAKER_VERIFIED);
                }
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                udj udjVarB = udj.b(((udm) obj).d);
                if (udjVarB == null) {
                    udjVarB = udj.a;
                }
                java.lang.Object obj2 = this.a;
                if (udj.c.equals(udjVarB)) {
                    ((aift) obj2).i(defpackage.amot.LOCAL_SPAM_LIST);
                } else if (udj.b.equals(udjVarB)) {
                    ((aift) obj2).i(defpackage.amot.LOCAL_WHITELIST);
                }
                break;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                udj udjVar = udj.c;
                udj udjVarB2 = udj.b(((udm) obj).d);
                if (udjVarB2 == null) {
                    udjVarB2 = udj.a;
                }
                if (udjVar.equals(udjVarB2)) {
                    ((aift) this.a).i(defpackage.amot.PATRONUS_SPAM);
                }
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                udm udmVar = (udm) obj;
                udj udjVar2 = udj.c;
                udj udjVarB3 = udj.b(udmVar.d);
                if (udjVarB3 == null) {
                    udjVarB3 = udj.a;
                }
                java.lang.Object obj3 = this.a;
                if (udjVar2.equals(udjVarB3)) {
                    ((aift) obj3).i(defpackage.amot.GCORE_SPAM);
                }
                int iAN = a.aN(udmVar.e);
                if (iAN != 0 && iAN == 3) {
                    ((aift) obj3).i(defpackage.amot.GCORE_SPOOF);
                }
                udk udkVar2 = udk.c;
                udk udkVarB2 = udk.b(udmVar.f);
                if (udkVarB2 == null) {
                    udkVarB2 = udk.a;
                }
                if (udkVar2.equals(udkVarB2)) {
                    ((aift) obj3).i(defpackage.amot.GCORE_STIR_SHAKEN_FAILED);
                }
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                java.lang.String str = (java.lang.String) obj;
                akzx akzxVar = (akzx) this.a;
                akzxVar.u();
                defpackage.ucu ucuVar = (defpackage.ucu) akzxVar.b;
                defpackage.ucu ucuVar2 = defpackage.ucu.a;
                j$.util.Objects.requireNonNull(str);
                ucuVar.b |= 64;
                ucuVar.h = str;
                break;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                java.lang.Object obj4 = ((defpackage.taq) obj).a;
                akzx akzxVar2 = (akzx) this.a;
                aivu aivuVar = ((defpackage.ucq) akzxVar2.b).c;
                if (aivuVar == null) {
                    aivuVar = aivu.a;
                }
                akzx akzxVarP = aivuVar.p();
                defpackage.ucu ucuVar3 = (defpackage.ucu) obj4;
                if ((ucuVar3.b & 4096) != 0) {
                    aivw aivwVar = ucuVar3.n;
                    if (aivwVar == null) {
                        aivwVar = aivw.a;
                    }
                    akzxVarP.u();
                    aivu aivuVar2 = akzxVarP.b;
                    j$.util.Objects.requireNonNull(aivwVar);
                    aivuVar2.H = aivwVar;
                    aivuVar2.c |= 4;
                }
                akzxVar2.u();
                defpackage.ucq ucqVar = (defpackage.ucq) akzxVar2.b;
                aivu aivuVarP = akzxVarP.p();
                j$.util.Objects.requireNonNull(aivuVarP);
                ucqVar.c = aivuVarP;
                ucqVar.b |= 1;
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                long epochMilli = j$.time.Instant.ofEpochMilli(((java.lang.Long) obj).longValue()).truncatedTo(j$.time.temporal.ChronoUnit.HOURS).toEpochMilli();
                akzx akzxVar3 = (akzx) this.a;
                akzxVar3.u();
                aivu aivuVar3 = akzxVar3.b;
                aivu aivuVar4 = aivu.a;
                aivuVar3.b |= 262144;
                aivuVar3.t = epochMilli;
                break;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                defpackage.uea.b.b().l("com/android/dialer/spam/composite/CompositeSpamStatus", "mergeStirShakenAndWriteCallIsSampledinSpamMetadata", 141, "CompositeSpamStatus.java").v("merged patronusSpamCheckSkipReason");
                ((uil) this.a).b(j$.util.Optional.of((aiyg) obj));
                break;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                this.a.a(obj);
                break;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                this.a.a(obj);
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                this.a.a(obj);
                break;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                this.a.a(obj);
                break;
            case 15:
                ((android.content.ContentValues) this.a).put("pinned", (java.lang.Integer) obj);
                break;
            case 16:
                this.a.a(obj);
                break;
            case 17:
                this.a.a(obj);
                break;
            case 18:
                int iIntValue = ((java.lang.Integer) obj).intValue();
                akzx akzxVar4 = (akzx) this.a;
                akzxVar4.u();
                defpackage.vaj vajVar = (defpackage.vaj) akzxVar4.b;
                defpackage.vaj vajVar2 = defpackage.vaj.a;
                vajVar.c = iIntValue;
                break;
            case 19:
                java.lang.String str2 = (java.lang.String) obj;
                akzx akzxVar5 = (akzx) this.a;
                akzxVar5.u();
                defpackage.vaj vajVar3 = (defpackage.vaj) akzxVar5.b;
                defpackage.vaj vajVar4 = defpackage.vaj.a;
                j$.util.Objects.requireNonNull(str2);
                vajVar3.b |= 1;
                vajVar3.d = str2;
                break;
            default:
                ((dvu) this.a).b = androidx.core.graphics.drawable.IconCompat.f((android.graphics.Bitmap) obj);
                break;
        }
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
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
        return j$.util.function.Consumer.-CC.$default$andThen(this, consumer);
    }
}
