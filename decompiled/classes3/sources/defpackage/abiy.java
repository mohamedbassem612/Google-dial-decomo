package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class abiy implements aonj {
    private final /* synthetic */ int $cid;

    public /* synthetic */ abiy(int i) {
        this.$cid = i;
    }

    /* JADX WARN: Type inference failed for: r4v25, types: [boolean, int] */
    public final java.lang.Object a(java.lang.Object obj) {
        switch (this.$cid) {
            case 0:
                aooh.f((diq) obj, "$this$clearAndSetSemantics");
                return aojh.a;
            case 1:
                aooh.f((dbm) obj, "$this$drawWithContent");
                return aojh.a;
            case 2:
                defpackage.xsv xsvVar = (defpackage.xsv) obj;
                aooh.f(xsvVar, "it");
                return xsvVar;
            case 3:
                defpackage.xsv xsvVar2 = (defpackage.xsv) obj;
                aooh.f(xsvVar2, "it");
                return xsvVar2;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                aooh.f((diq) obj, "$this$semantics");
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                diq diqVar = (diq) obj;
                aooh.f(diqVar, "$this$semantics");
                dfb.o(diqVar, 1);
                throw null;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                defpackage.agki agkiVar = (defpackage.agki) obj;
                aooh.f(agkiVar, "$this$copy");
                defpackage.agjl agjlVar = agkiVar.a;
                defpackage.abiy abiyVar = new defpackage.abiy(7);
                aooh.f(agjlVar, "<this>");
                defpackage.agkl agklVar = new defpackage.agkl(agjlVar);
                abiyVar.a(agklVar);
                agkiVar.a = agklVar.a();
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                defpackage.agkl agklVar2 = (defpackage.agkl) obj;
                aooh.f(agklVar2, "$this$copy");
                agklVar2.b = 0.5f;
                agklVar2.c = 0.5f;
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                aooh.f((defpackage.abmo) obj, "it");
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                aooh.f((aes) obj, "$this$AnimatedContent");
                return new afo(aga.n(den.bv(220, 90, (ajh) null, 4), 2), aga.o(den.bv(90, 0, (ajh) null, 6), 2), (ahu) null, 12);
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                defpackage.abol abolVar = (defpackage.abol) obj;
                aooh.f(abolVar, "it");
                return abolVar.a();
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                aomy aomyVar = (aomy) obj;
                aooh.f(aomyVar, "it");
                java.lang.Boolean bool = (java.lang.Boolean) aomyVar.a();
                bool.booleanValue();
                return bool;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                defpackage.abvz abvzVar = (defpackage.abvz) obj;
                aooh.f(abvzVar, "it");
                return abvzVar.i();
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                return "?";
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                java.util.Map.Entry entry = (java.util.Map.Entry) obj;
                aooh.f(entry, "it");
                java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
                alcf alcfVar = ((akhg) entry.getValue()).d;
                if (alcfVar == null) {
                    alcfVar = alcf.a;
                }
                long millis = timeUnit.toMillis(alcfVar.b);
                java.util.concurrent.TimeUnit timeUnit2 = java.util.concurrent.TimeUnit.NANOSECONDS;
                alcf alcfVar2 = ((akhg) entry.getValue()).d;
                if (alcfVar2 == null) {
                    alcfVar2 = alcf.a;
                }
                return java.lang.Boolean.valueOf((boolean) (((millis + (((long) alcfVar2.c) / 1000000)) > j$.time.Instant.now().toEpochMilli() ? 1 : ((millis + (((long) alcfVar2.c) / 1000000)) == j$.time.Instant.now().toEpochMilli() ? 0 : -1)) >>> 31));
            case 15:
                aduy aduyVar = (aduy) obj;
                int i = acaw.a;
                aooh.f(aduyVar, "it");
                return aduyVar.i;
            case 16:
                aiof aiofVar = acea.a;
                return null;
            case 17:
                int i2 = defpackage.acjm.c;
                aooh.f((java.lang.String) obj, "it");
                return aozk.a((java.lang.Object) null);
            case 18:
                aooh.f((dkw) obj, "it");
                return aojh.a;
            case 19:
                java.util.Map map = defpackage.acsc.a;
                return afsq.aT((defpackage.aogy) obj);
            default:
                java.util.Map map2 = defpackage.acsc.a;
                return afsq.aU((defpackage.aogy) obj);
        }
    }
}
