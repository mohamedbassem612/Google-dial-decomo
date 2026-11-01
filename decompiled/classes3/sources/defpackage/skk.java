package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class skk implements aonj {
    private final /* synthetic */ int $cid;

    public /* synthetic */ skk(int i) {
        this.$cid = i;
    }

    public final java.lang.Object a(java.lang.Object obj) {
        switch (this.$cid) {
            case 0:
                defpackage.skp skpVar = (defpackage.skp) obj;
                aooh.f(skpVar, "uiModel");
                defpackage.rze rzeVarI = snl.i(skpVar.p());
                rzeVarI.h(5);
                return rzeVarI.b();
            case 1:
                defpackage.skp skpVar2 = (defpackage.skp) obj;
                aooh.f(skpVar2, "uiModel");
                defpackage.rze rzeVarI2 = snl.i(skpVar2.p());
                rzeVarI2.h(2);
                return rzeVarI2.b();
            case 2:
                aooh.f((defpackage.sln) obj, "it");
                return aojh.a;
            case 3:
                java.lang.Integer num = (java.lang.Integer) obj;
                num.intValue();
                java.util.List list = defpackage.sme.a;
                return num;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                java.lang.Integer num2 = (java.lang.Integer) obj;
                num2.intValue();
                java.util.List list2 = defpackage.sme.a;
                return num2;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                java.util.List list3 = (java.util.List) obj;
                java.util.List list4 = defpackage.sme.a;
                aooh.f(list3, "<destruct>");
                return new androidx.compose.runtime.ParcelableSnapshotMutableState(new defpackage.abjl(((java.lang.Number) list3.get(0)).floatValue(), ((java.lang.Number) list3.get(1)).floatValue(), ((java.lang.Number) list3.get(2)).floatValue()), cdu.c);
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return afsq.cc((diq) obj);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                return a.I((diq) obj);
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                defpackage.xsv xsvVar = (defpackage.xsv) obj;
                aooh.f(xsvVar, "it");
                defpackage.yeh yehVarQ = xsvVar.q(defpackage.xwm.c);
                aooh.e(yehVarQ, "diskCacheStrategy(...)");
                return (defpackage.xsv) yehVarQ;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                diq diqVar = (diq) obj;
                aooh.f(diqVar, "$this$semantics");
                dfb.s(diqVar);
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                diq diqVar2 = (diq) obj;
                aooh.f(diqVar2, "$this$semantics");
                dfb.r(diqVar2, 0.0f);
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                diq diqVar3 = (diq) obj;
                aooh.f(diqVar3, "$this$semantics");
                dfb.r(diqVar3, 1.0f);
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                defpackage.rze rzeVar = (defpackage.rze) obj;
                aooh.f(rzeVar, "it");
                rzeVar.i();
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                defpackage.rze rzeVar2 = (defpackage.rze) obj;
                aooh.f(rzeVar2, "it");
                rzeVar2.i();
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                return ((zzx) obj).p();
            case 15:
                ((defpackage.uxp) obj).a();
                return aojh.a;
            case 16:
                diq diqVar4 = (diq) obj;
                aooh.f(diqVar4, "$this$semantics");
                dfb.f(diqVar4);
                return aojh.a;
            case 17:
                return java.lang.Boolean.valueOf((((ipb) obj).b & 32) != 0);
            case 18:
                uaw uawVar = ((ipb) obj).h;
                return uawVar == null ? uaw.a : uawVar;
            case 19:
                defpackage.ujk.a.c().i(zct.b).k((android.database.sqlite.SQLiteException) obj).l("com/android/dialer/spamnotification/impl/service/SpamCallHistoryStatusFetcher", "queryCallLogForSpamCallHistoryStatus$<anonymous>", 80, "SpamCallHistoryStatusFetcher.kt").v("Query call log error");
                return new defpackage.ujh(defpackage.ujg.b);
            default:
                return java.lang.Boolean.valueOf(android.text.TextUtils.isEmpty((java.lang.String) obj));
        }
    }
}
