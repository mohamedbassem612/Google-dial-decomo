package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class rhb implements java.util.function.Consumer {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ rhb(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r7v24, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v28, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v29, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v30, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v31, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v32, types: [java.lang.Object, sok] */
    /* JADX WARN: Type inference failed for: r7v42, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v55, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v56, types: [java.lang.Object, java.util.List] */
    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object obj) {
        switch (this.$cid) {
            case 0:
                defpackage.qcr qcrVar = (defpackage.qcr) obj;
                defpackage.rea reaVar = ((defpackage.rhc) ((j$.util.Optional) ((vwb) this.a).c).orElseThrow()).b;
                java.lang.Object obj2 = qcrVar.b;
                aoin aoinVar = (aoin) ((zzx) qcrVar.a).k().get(reaVar);
                ahvr.cl(aoinVar, "no controller for %s", reaVar.name());
                ((zpz) obj2).a(((defpackage.rdz) aoinVar.a()).c());
                break;
            case 1:
                ((android.widget.ImageView) this.a).setOnClickListener(new defpackage.qht((aoin) obj, 12));
                break;
            case 2:
                defpackage.rhp rhpVar = (defpackage.rhp) obj;
                boolean zB = ((defpackage.ric) this.a).b();
                defpackage.rhp.b.b().l("com/android/dialer/internationalcallonwifi/service/InternationalCallOnWifiDialogController", "onNegativeButtonClicked", 68, "InternationalCallOnWifiDialogController.java").v("enter");
                agsm.i(715, ahvr.E(new gql(rhpVar, zB, 8), rhpVar.c), "Failed to execute negative button press.", new java.lang.Object[0]);
                break;
            case 3:
                defpackage.rhp rhpVar2 = (defpackage.rhp) obj;
                boolean zB2 = ((defpackage.ric) this.a).b();
                defpackage.rhp.b.b().l("com/android/dialer/internationalcallonwifi/service/InternationalCallOnWifiDialogController", "onPositiveButtonClicked", 88, "InternationalCallOnWifiDialogController.java").v("enter");
                agsm.i(716, ahvr.E(new gql(rhpVar2, zB2, 9), rhpVar2.c), "Failed to execute positive button press.", new java.lang.Object[0]);
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                this.a.a(obj);
                break;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                java.lang.Object obj3 = this.a;
                ((defpackage.rvu) obj3).d.p((aeun) obj, ruc.bZ);
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                this.a.a(obj);
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                this.a.a(obj);
                break;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                this.a.a(obj);
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                this.a.a(obj);
                break;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                this.a.bu().p((aeun) obj, ruc.bH);
                break;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                java.lang.String string = ((java.lang.CharSequence) obj).toString();
                akzx akzxVar = (akzx) this.a;
                akzxVar.u();
                defpackage.spd spdVar = (defpackage.spd) akzxVar.b;
                defpackage.spd spdVar2 = defpackage.spd.a;
                j$.util.Objects.requireNonNull(string);
                spdVar.b |= 32;
                spdVar.h = string;
                break;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                aimz aimzVar = sqw.a;
                java.lang.String string2 = ((java.lang.CharSequence) obj).toString();
                akzx akzxVar2 = (akzx) this.a;
                akzxVar2.u();
                defpackage.spd spdVar3 = (defpackage.spd) akzxVar2.b;
                defpackage.spd spdVar4 = defpackage.spd.a;
                j$.util.Objects.requireNonNull(string2);
                spdVar3.b |= 32;
                spdVar3.h = string2;
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                this.a.a(obj);
                break;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                alcf alcfVarE = aldi.e(((java.lang.Long) obj).longValue());
                akzx akzxVar3 = (akzx) this.a;
                akzxVar3.u();
                ste steVar = akzxVar3.b;
                ste steVar2 = ste.a;
                j$.util.Objects.requireNonNull(alcfVarE);
                steVar.d = alcfVarE;
                steVar.b |= 2;
                break;
            case 15:
                java.lang.String str = (java.lang.String) obj;
                akzx akzxVar4 = (akzx) this.a;
                akzxVar4.u();
                ste steVar3 = akzxVar4.b;
                ste steVar4 = ste.a;
                j$.util.Objects.requireNonNull(str);
                steVar3.b |= 4;
                steVar3.e = str;
                break;
            case 16:
                defpackage.amrf amrfVar = (defpackage.amrf) obj;
                akzx akzxVar5 = (akzx) this.a;
                akzxVar5.u();
                amow amowVar = akzxVar5.b;
                amow amowVar2 = amow.a;
                j$.util.Objects.requireNonNull(amrfVar);
                amowVar.M = amrfVar;
                amowVar.c |= 4096;
                break;
            case 17:
                this.a.a(obj);
                break;
            case 18:
                this.a.add((defpackage.qib) obj);
                break;
            case 19:
                ((defpackage.tax) this.a).t.u = lia.class.getName();
                break;
            default:
                defpackage.tbu tbuVar = (defpackage.tbu) this.a;
                android.widget.ImageView imageView = (android.widget.ImageView) ((aw) tbuVar.b).Q.findViewById(2131427525);
                defpackage.abwd abwdVar = ((defpackage.tao) obj).a;
                defpackage.akcu akcuVar = new defpackage.akcu();
                akcuVar.f();
                akcuVar.g(false);
                akcuVar.h(false);
                tbuVar.f.g(imageView, abwdVar, akcuVar.e(), false);
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
