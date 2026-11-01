package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class agvo implements aonj {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ agvo(java.lang.Object[] objArr, int i) {
        this.$cid = i;
        this.a = "failed to store moirai protection token";
        this.b = objArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v27, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r11v8, types: [amwu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v2, types: [aozh, java.lang.Object] */
    public final java.lang.Object a(java.lang.Object obj) {
        int iIntValue;
        final int i = 1;
        switch (this.$cid) {
            case 0:
                java.lang.Throwable th = (java.lang.Throwable) obj;
                if (th != null && !(th instanceof java.util.concurrent.CancellationException)) {
                    defpackage.agvq.a.c().k(th).l("com/google/apps/tiktok/coroutines/AndroidJobs$Companion", "logOnFailure$<anonymous>", 85, "AndroidJobs.kt").S((java.lang.String) this.a, (java.lang.Object[]) this.b);
                }
                return aojh.a;
            case 1:
                return ((agpt) this.a).a((java.lang.String) this.b);
            case 2:
                ahoq ahoqVarX = ahvr.X(1369, "Updating configurations", ahot.a, true);
                java.lang.Object obj2 = this.b;
                try {
                    ahbz ahbzVar = (ahbz) ((ahct) this.a).d.a();
                    java.lang.String str = ((ajsy) obj2).g;
                    aooh.e(str, "getConfigPackage(...)");
                    ajcq ajcqVarB = ahbzVar.b(str);
                    ahoqVarX.a(ajcqVarB);
                    ajsz.ak(ahoqVarX, (java.lang.Throwable) null);
                    return ajcqVarB;
                } catch (java.lang.Throwable th2) {
                    try {
                        throw th2;
                    } catch (java.lang.Throwable th3) {
                        ajsz.ak(ahoqVarX, th2);
                        throw th3;
                    }
                }
            case 3:
                ajsy ajsyVar = (ajsy) obj;
                java.lang.Object obj3 = this.b;
                ahct ahctVar = (ahct) this.a;
                java.lang.String str2 = (java.lang.String) obj3;
                if (ahctVar.c(str2, ajsyVar)) {
                    return aiql.z((java.lang.Object) null);
                }
                ajcq ajcqVarA = ahctVar.a(str2, ajsyVar);
                if (ajsyVar != null) {
                    iIntValue = ajsyVar.c == 2 ? ((java.lang.Integer) ajsyVar.d).intValue() : 0;
                } else {
                    iIntValue = ahctVar.b;
                }
                final defpackage.ahcr ahcrVar = new defpackage.ahcr(ajsyVar, str2, iIntValue, ahctVar, 0);
                return ahvr.H(ajcqVarA, new ahyc() { // from class: ahcu
                    public final java.lang.Object apply(java.lang.Object obj4) {
                        int i2 = i;
                        aonj aonjVar = ahcrVar;
                        return i2 != 0 ? aonjVar.a(obj4) : aonjVar.a(obj4);
                    }
                }, ahctVar.a);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                defpackage.aprf aprfVar = (defpackage.aprf) obj;
                aooh.f(aprfVar, "$this$lifecycleFlow");
                if (android.os.Looper.getMainLooper().getThread() != java.lang.Thread.currentThread()) {
                    throw new java.lang.IllegalStateException("Check failed.");
                }
                ?? r6 = this.b;
                java.lang.Object obj4 = this.a;
                aols aolsVar = aols.a;
                defpackage.ahhe ahheVar = (defpackage.ahhe) obj4;
                aoss aossVar = ahheVar.b;
                ahre.c(aossVar);
                aoov.al(aossVar, afsq.K(aolsVar), 4, new defpackage.abos((aoln) null, ahheVar, (aozh) r6, aprfVar, 5));
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                aooh.f((alnr) obj, "it");
                return new defpackage.ynq(((alqc) this.b).g(), (defpackage.ymk) this.a, new defpackage.yos(2));
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                aooh.f((alnr) obj, "it");
                defpackage.ymd ymdVarG = ((alqc) this.b).g();
                defpackage.yos yosVar = new defpackage.yos(3);
                defpackage.aliq aliqVarA = defpackage.yot.a(ymdVarG);
                aliqVarA.q((defpackage.ymk) this.a);
                aliqVarA.a = yosVar;
                return defpackage.yor.i(aliqVarA.p());
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                aooh.f((alnr) obj, "it");
                defpackage.ymd ymdVarG2 = ((alqc) this.b).g();
                defpackage.yos yosVar2 = new defpackage.yos(4);
                java.lang.Object obj5 = this.a;
                if (obj5 == null) {
                    throw new java.lang.NullPointerException("Null feature");
                }
                defpackage.yoi yoiVar = new defpackage.yoi(ymdVarG2, yosVar2, (defpackage.ymk) obj5);
                defpackage.ymk ymkVar = yoiVar.c;
                int i2 = defpackage.yoh.h;
                return (defpackage.yoh) (ymkVar.c == 8 ? new defpackage.yok(yoiVar.a, ymkVar, yoiVar.b) : new defpackage.yoh(yoiVar.a, ymkVar, yoiVar.b));
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                aoxh aoxhVar = (aoxh) obj;
                aooh.f(aoxhVar, "requests");
                return new hlh(anty.u(aoxhVar, this.a), this.b, 16);
            default:
                ((aovt) this.b).a.removeCallbacks(this.a);
                return aojh.a;
        }
    }

    public /* synthetic */ agvo(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }

    public /* synthetic */ agvo(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }
}
