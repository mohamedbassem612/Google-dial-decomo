package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class agkc implements aonj {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ agkc(int i) {
        this.$cid = i;
        this.a = "    ";
    }

    /* JADX WARN: Type inference failed for: r10v45, types: [dat, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v50, types: [aoub, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v55, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v83, types: [aonj, java.lang.Object] */
    public final java.lang.Object a(java.lang.Object obj) {
        java.lang.Object objAe;
        java.lang.Throwable th;
        int i = 0;
        int i2 = 1;
        int i3 = 20;
        switch (this.$cid) {
            case 0:
                defpackage.agki agkiVar = (defpackage.agki) obj;
                aooh.f(agkiVar, "$this$copy");
                agkiVar.b = defpackage.agmc.D(agkiVar.d(), new defpackage.afno(i3));
                agkiVar.e = defpackage.agmc.H(agkiVar.e(), new defpackage.agkd(i2));
                int i4 = 2;
                agkiVar.f = defpackage.agmc.y(agkiVar.a(), new defpackage.agkc(this.a, i4));
                agkiVar.j = defpackage.agmc.z(agkiVar.b(), new defpackage.agkd(i));
                defpackage.agjs agjsVar = agkiVar.e;
                if (agjsVar != null) {
                    agkiVar.e = defpackage.agmc.H(agjsVar, new defpackage.agkd(i4));
                }
                return aojh.a;
            case 1:
                defpackage.agkb agkbVar = (defpackage.agkb) obj;
                aooh.f(agkbVar, "$this$copy");
                agkbVar.c = 0.3f;
                agkbVar.b = 12.0f;
                return aojh.a;
            case 2:
                defpackage.agkb agkbVar2 = (defpackage.agkb) obj;
                aooh.f(agkbVar2, "$this$copy");
                agkbVar2.i = 0.5f;
                agkbVar2.g = 15.75f;
                agkbVar2.e = 0.45f;
                agkbVar2.f = 0.0033f;
                agkbVar2.c = 0.0f;
                agkbVar2.d = 0.4f;
                agkbVar2.a = 6.0f;
                agkbVar2.b = 10.0f;
                return aojh.a;
            case 3:
                defpackage.agkn agknVar = (defpackage.agkn) obj;
                aooh.f(agknVar, "$this$panelConfig");
                agknVar.a = 0.0f;
                agknVar.b = 0.0f;
                agknVar.d = 1.0f;
                agknVar.c = ((defpackage.agke) this.a).a.intValue();
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                defpackage.agko agkoVar = (defpackage.agko) obj;
                aooh.f(agkoVar, "$this$radialGradientConfig");
                agkoVar.a = 60.0f;
                agkoVar.c();
                defpackage.agma agmaVar = ((defpackage.agke) this.a).b;
                agkoVar.c = agmaVar.a;
                agkoVar.d = agmaVar.b;
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                defpackage.agkb agkbVar3 = (defpackage.agkb) obj;
                aooh.f(agkbVar3, "$this$borderLightConfig");
                java.lang.Object obj2 = this.a;
                agkbVar3.a = 40.0f;
                agkbVar3.b = 8.0f;
                agkbVar3.c = 0.0f;
                agkbVar3.d = 1.0f;
                agkbVar3.b();
                agkbVar3.i = 0.5f;
                agkbVar3.h = ((defpackage.agke) obj2).b.b;
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                defpackage.agkf agkfVar = (defpackage.agkf) obj;
                aooh.f(agkfVar, "$this$dotsConfig");
                agkfVar.f = "return blurredSdfMask;";
                agkfVar.a = 1.0f;
                agkfVar.d = 15.0f;
                agkfVar.e = 15.0f;
                agkfVar.c = 1.0f;
                agkfVar.b = ((defpackage.agke) this.a).b.c;
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                defpackage.agki agkiVar2 = (defpackage.agki) obj;
                aooh.f(agkiVar2, "$this$copy");
                agkiVar2.f = defpackage.agmc.y(agkiVar2.a(), new defpackage.abph(this.a, i3));
                agkiVar2.j = defpackage.agmc.z(agkiVar2.b(), new defpackage.afno(18));
                defpackage.agjs agjsVar2 = agkiVar2.e;
                if (agjsVar2 != null) {
                    agkiVar2.e = defpackage.agmc.H(agjsVar2, new defpackage.afno(19));
                }
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                cfo.w((dat) this.a);
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                ((android.os.CancellationSignal) this.a).cancel();
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                this.a.s((java.util.concurrent.CancellationException) null);
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                java.util.List list = (java.util.List) obj;
                aooh.f(list, "infos");
                if (list.isEmpty()) {
                    return aiql.z((java.lang.Object) null);
                }
                aexi aexiVar = (aexi) ((ahct) this.a).c.a();
                ajsy[] ajsyVarArr = (ajsy[]) list.toArray(new ajsy[0]);
                return aexiVar.a((ajsy[]) java.util.Arrays.copyOf(ajsyVarArr, ajsyVarArr.length));
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                return (ajsy) ((aigf) obj).get(this.a);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                java.lang.String str = (java.lang.String) obj;
                aooh.f(str, "packageName");
                java.lang.String strValueOf = java.lang.String.valueOf(str);
                defpackage.agqo agqoVar = (defpackage.agqo) this.a;
                com.google.apps.tiktok.account.AccountId accountId = agqoVar.b;
                ahkk ahkkVar = defpackage.agqo.a;
                java.lang.String str2 = defpackage.agqo.a(accountId) + java.io.File.separator + "phenotype/".concat(strValueOf);
                ajwr ajwrVar = agqoVar.d;
                new java.io.File(ajwrVar.k(ahkkVar), str2).getParentFile().mkdirs();
                android.net.Uri uriM = ajwrVar.m(ahkkVar, str2);
                aooh.e(uriM, "getMobStoreUriSync(...)");
                return uriM;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                return obj == this.a ? "(this Collection)" : java.lang.String.valueOf(obj);
            case 15:
                java.util.Map.Entry entry = (java.util.Map.Entry) obj;
                aooh.f(entry, "it");
                java.lang.Object key = entry.getKey();
                aojp aojpVar = (aojp) this.a;
                return aojpVar.j(key) + '=' + aojpVar.j(entry.getValue());
            case 16:
                return ((aorc) this.a).b(((java.lang.Integer) obj).intValue());
            case 17:
                java.lang.String str3 = (java.lang.String) obj;
                aooh.f(str3, "it");
                boolean zH = aoov.H(str3);
                java.lang.Object obj3 = this.a;
                if (zH) {
                    return str3.length() >= 4 ? str3 : obj3;
                }
                return ((java.lang.String) obj3).concat(java.lang.String.valueOf(str3));
            case 18:
                java.lang.String str4 = (java.lang.String) obj;
                aooh.f(str4, "line");
                return ((java.lang.String) this.a).concat(java.lang.String.valueOf(str4));
            default:
                java.lang.Throwable th2 = (java.lang.Throwable) obj;
                int i5 = apbv.a;
                try {
                    th = (java.lang.Throwable) this.a.a(th2);
                    boolean zN = aooh.n(th2.getMessage(), th.getMessage());
                    objAe = th;
                    if (!zN && !aooh.n(th.getMessage(), th2.toString())) {
                        objAe = th;
                        objAe = null;
                    }
                } catch (java.lang.Throwable th3) {
                    objAe = aooc.ae(th3);
                }
                objAe = th;
                return (java.lang.Throwable) (true != (objAe instanceof aoiv) ? objAe : null);
        }
    }

    public /* synthetic */ agkc(int i, byte[] bArr) {
        this.$cid = i;
        this.a = "";
    }

    public /* synthetic */ agkc(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }
}
