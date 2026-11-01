package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class xms implements aonj {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ xms(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r8v72, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public final java.lang.Object a(java.lang.Object obj) throws java.io.IOException {
        defpackage.zdv zdvVarC;
        switch (this.$cid) {
            case 0:
                defpackage.xhn xhnVar = (defpackage.xhn) obj;
                aooh.f(xhnVar, "metadata");
                defpackage.xox.e("TaskStateManager", "Undelivered: " + xhnVar + " [" + this.a + ']');
                return aojh.a;
            case 1:
                emy emyVar = (emy) obj;
                int i = defpackage.xmh.b;
                aooh.f(emyVar, "it");
                emyVar.f((emp) this.a);
                return aojh.a;
            case 2:
                java.lang.Throwable th = (java.lang.Throwable) obj;
                j$.util.Objects.checkIndex(0, 2);
                java.lang.Object obj2 = this.a;
                if (th == null || (th instanceof java.util.concurrent.CancellationException)) {
                    defpackage.xox.b("TaskStateManager", a.bF((byte) 93, obj2, "Metadata channel closed gracefully ["));
                } else {
                    defpackage.xox.f("TaskStateManager", a.bF((byte) 93, obj2, "Metadata channel closed abruptly ["), th);
                }
                return aojh.a;
            case 3:
                java.lang.String str = (java.lang.String) obj;
                return str + '=' + defpackage.xff.p(((android.os.BaseBundle) this.a).get(str));
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                diq diqVar = (diq) obj;
                aooh.f(diqVar, "$this$semantics");
                ccp ccpVar = ((defpackage.xto) this.a).c;
                aooh.f(diqVar, "<this>");
                diqVar.a(defpackage.xtm.a, ccpVar);
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return a.z((czc) this.a, (czb) obj);
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                ((java.lang.Boolean) obj).booleanValue();
                ((defpackage.ykr) this.a).c();
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                return java.lang.Boolean.valueOf(aooh.n(((defpackage.yua) obj).a, this.a));
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                gin ginVarA = ((gjh) obj).a("SELECT * from dialer_capability_data where e164_phone_number = ?");
                try {
                    ginVarA.j(1, (java.lang.String) this.a);
                    int iS = dzk.S(ginVarA, "e164_phone_number");
                    int iS2 = dzk.S(ginVarA, "capability");
                    int iS3 = dzk.S(ginVarA, "timestamp_millis");
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    while (ginVarA.m()) {
                        java.lang.String strE = ginVarA.e(iS);
                        java.lang.String strE2 = ginVarA.e(iS2);
                        aooh.f(strE2, "string");
                        try {
                            zdvVarC = defpackage.zdv.c(strE2);
                        } catch (java.lang.IllegalArgumentException unused) {
                            zdvVarC = defpackage.zdv.UNSPECIFIED_CAPABILITY;
                        }
                        arrayList.add(new defpackage.zeo(strE, zdvVarC, ginVarA.c(iS3)));
                        break;
                    }
                    ginVarA.close();
                    return arrayList;
                } catch (java.lang.Throwable th2) {
                    ginVarA.close();
                    throw th2;
                }
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                gin ginVarA2 = ((gjh) obj).a("SELECT * from dialer_has_rcs_data where e164_phone_number = ?");
                try {
                    ginVarA2.j(1, (java.lang.String) this.a);
                    return ginVarA2.m() ? new defpackage.zfc(ginVarA2.e(dzk.S(ginVarA2, "e164_phone_number")), ginVarA2.c(dzk.S(ginVarA2, "timestamp_millis"))) : null;
                } finally {
                    ginVarA2.close();
                }
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                return wsc.v((defpackage.zfp) this.a, (defpackage.rze) obj);
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                return wsc.v((defpackage.zfp) this.a, (defpackage.rze) obj);
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                return wsc.v((defpackage.zfp) this.a, (defpackage.rze) obj);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                return wsc.v((defpackage.zfp) this.a, (defpackage.rze) obj);
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                return wsc.v((defpackage.zfp) this.a, (defpackage.rze) obj);
            case 15:
                return wsc.v((defpackage.zfp) this.a, (defpackage.rze) obj);
            case 16:
                return java.lang.Boolean.valueOf(aooh.n(((defpackage.zhq) obj).b, this.a));
            case 17:
                ve veVar = (ve) obj;
                aooh.f(veVar, "<this>");
                java.lang.String absolutePath = ((java.io.File) this.a).getAbsolutePath();
                aooh.e(absolutePath, "getAbsolutePath(...)");
                aooh.f(absolutePath, "value");
                veVar.a = absolutePath;
                return aojh.a;
            case 18:
                ve veVar2 = (ve) obj;
                aooh.f(veVar2, "<this>");
                veVar2.a = new defpackage.xms(this.a, 17);
                return aojh.a;
            case 19:
                return a.z((czc) this.a, (czb) obj);
            default:
                czb czbVar = (czb) obj;
                aooh.f(czbVar, "$this$layout");
                ?? r8 = this.a;
                int size = r8.size();
                for (int i2 = 0; i2 < size; i2++) {
                    czbVar.s((czc) r8.get(i2), 0, 0, 0.0f);
                }
                return aojh.a;
        }
    }
}
