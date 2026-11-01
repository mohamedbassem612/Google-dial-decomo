package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class wlm implements java.util.function.Consumer {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ wlm(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r14v79, types: [java.lang.Object, wvs] */
    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object obj) {
        switch (this.$cid) {
            case 0:
                defpackage.whg whgVar = (defpackage.whg) obj;
                akzx akzxVar = (akzx) this.a;
                akzxVar.u();
                defpackage.wlc wlcVar = (defpackage.wlc) akzxVar.b;
                defpackage.wlc wlcVar2 = defpackage.wlc.a;
                j$.util.Objects.requireNonNull(whgVar);
                wlcVar.i = whgVar;
                wlcVar.b |= 16;
                break;
            case 1:
                akzx akzxVar2 = (akzx) this.a;
                akzxVar2.u();
                defpackage.wlc wlcVar3 = (defpackage.wlc) akzxVar2.b;
                defpackage.wlc wlcVar4 = defpackage.wlc.a;
                wlcVar3.g = ((defpackage.whe) obj).d;
                wlcVar3.b |= 8;
                break;
            case 2:
                androidx.preference.SwitchPreference switchPreference = (androidx.preference.SwitchPreference) obj;
                defpackage.wqc wqcVar = (defpackage.wqc) this.a;
                switchPreference.k(wqcVar.f);
                switchPreference.I(wqcVar.e && wqcVar.c);
                ((androidx.preference.Preference) switchPreference).q = -1;
                break;
            case 3:
                androidx.preference.SwitchPreference switchPreference2 = (androidx.preference.SwitchPreference) obj;
                defpackage.wqc wqcVar2 = (defpackage.wqc) this.a;
                switchPreference2.k(wqcVar2.g);
                switchPreference2.I(wqcVar2.e && wqcVar2.c);
                ((androidx.preference.Preference) switchPreference2).q = -1;
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                ((aift) this.a).i((defpackage.wqp) obj);
                break;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                java.lang.String str = (java.lang.String) obj;
                akzx akzxVar3 = (akzx) this.a;
                akzxVar3.u();
                defpackage.wrf wrfVar = (defpackage.wrf) akzxVar3.b;
                defpackage.wrf wrfVar2 = defpackage.wrf.a;
                j$.util.Objects.requireNonNull(str);
                wrfVar.b |= 16;
                wrfVar.g = str;
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                java.lang.String str2 = (java.lang.String) obj;
                akzx akzxVar4 = (akzx) this.a;
                akzxVar4.u();
                defpackage.wrf wrfVar3 = (defpackage.wrf) akzxVar4.b;
                defpackage.wrf wrfVar4 = defpackage.wrf.a;
                j$.util.Objects.requireNonNull(str2);
                wrfVar3.b |= 4;
                wrfVar3.e = str2;
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                java.lang.String str3 = (java.lang.String) obj;
                akzx akzxVar5 = (akzx) this.a;
                akzxVar5.u();
                defpackage.wrf wrfVar5 = (defpackage.wrf) akzxVar5.b;
                defpackage.wrf wrfVar6 = defpackage.wrf.a;
                j$.util.Objects.requireNonNull(str3);
                wrfVar5.b |= 8;
                wrfVar5.f = str3;
                break;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                int iIntValue = ((java.lang.Integer) obj).intValue();
                akzx akzxVar6 = (akzx) this.a;
                akzxVar6.u();
                defpackage.wrf wrfVar7 = (defpackage.wrf) akzxVar6.b;
                defpackage.wrf wrfVar8 = defpackage.wrf.a;
                wrfVar7.b |= 64;
                wrfVar7.i = iIntValue;
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                defpackage.wqu wquVar = (defpackage.wqu) obj;
                akzx akzxVar7 = (akzx) this.a;
                akzxVar7.u();
                defpackage.wrq wrqVar = (defpackage.wrq) akzxVar7.b;
                defpackage.wrq wrqVar2 = defpackage.wrq.a;
                j$.util.Objects.requireNonNull(wquVar);
                wrqVar.e = wquVar;
                wrqVar.b |= 4;
                break;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                defpackage.whw whwVar = (defpackage.whw) obj;
                akzx akzxVar8 = (akzx) this.a;
                akzxVar8.u();
                defpackage.wrq wrqVar3 = (defpackage.wrq) akzxVar8.b;
                defpackage.wrq wrqVar4 = defpackage.wrq.a;
                j$.util.Objects.requireNonNull(whwVar);
                wrqVar3.f = whwVar;
                wrqVar3.b |= 8;
                break;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                java.lang.String str4 = ((defpackage.whx) obj).a;
                akzx akzxVar9 = (akzx) this.a;
                akzxVar9.u();
                defpackage.wrq wrqVar5 = (defpackage.wrq) akzxVar9.b;
                defpackage.wrq wrqVar6 = defpackage.wrq.a;
                j$.util.Objects.requireNonNull(str4);
                wrqVar5.b |= 16;
                wrqVar5.g = str4;
                break;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                defpackage.wqv wqvVar = (defpackage.wqv) obj;
                akzx akzxVar10 = (akzx) this.a;
                akzxVar10.u();
                defpackage.wrq wrqVar7 = (defpackage.wrq) akzxVar10.b;
                defpackage.wrq wrqVar8 = defpackage.wrq.a;
                j$.util.Objects.requireNonNull(wqvVar);
                wrqVar7.d = wqvVar;
                wrqVar7.b |= 2;
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                u uVar = new u(((defpackage.wtk) this.a).e.I());
                uVar.k((aw) obj);
                uVar.c();
                break;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                ((defpackage.wtk) this.a).i((defpackage.wlc) obj);
                break;
            case 15:
                defpackage.wky wkyVar = (defpackage.wky) obj;
                ainm ainmVarB = defpackage.wky.a.b();
                java.lang.Object obj2 = this.a;
                ainp ainpVar = zct.a;
                defpackage.wmv wmvVar = ((defpackage.wua) obj2).a;
                a.bt(ainmVarB, "with action: %s", wmvVar, "com/android/dialer/xatu/impl/service/XatuController", "onFollowUpClicked", (char) 764, "XatuController.java", ainpVar);
                if (wmvVar.ordinal() == 1) {
                    agsm.i(1085, wkyVar.c(), "Can't resume transcription", new java.lang.Object[0]);
                }
                break;
            case 16:
                defpackage.wgz wgzVar = ((defpackage.wrs) this.a).a;
                defpackage.wkp wkpVar = (defpackage.wkp) obj;
                aooh.f(wgzVar, "activationParams");
                aimz aimzVar = zih.a;
                aoov.al(wkpVar.b, zih.b.plus(aols.a), 1, new defpackage.tgn((aoln) null, wkpVar, wgzVar, 9, (byte[]) null));
                break;
            case 17:
                defpackage.wkp wkpVar2 = (defpackage.wkp) obj;
                defpackage.wgz wgzVar2 = ((defpackage.wrr) this.a).a;
                aooh.f(wgzVar2, "activationParams");
                defpackage.wkp.a.b().i(zct.a).l("com/android/dialer/xatu/impl/service/XatuAddonCoordinatorController", "abortAddonFeatureActivation", 64, "XatuAddonCoordinatorController.kt").v("enter");
                zpz zpzVar = wkpVar2.c;
                defpackage.wha whaVarB = defpackage.wha.b(wgzVar2.c);
                if (whaVarB == null) {
                    whaVarB = defpackage.wha.ADDON_FEATURE_KEY_UNSPECIFIED;
                }
                zpzVar.a(wkpVar2.g(whaVarB).a());
                break;
            case 18:
                ((defpackage.wkp) obj).f(((defpackage.wsh) this.a).a);
                break;
            case 19:
                defpackage.wky wkyVar2 = (defpackage.wky) obj;
                agsm.i(1071, wkyVar2.d(new defpackage.wkx((defpackage.wre) this.a, j$.util.Optional.empty())), "failed to stop Xatu session", new java.lang.Object[0]);
                agsm.i(1072, wkyVar2.b(), "failed to close Xatu ui", new java.lang.Object[0]);
                break;
            default:
                this.a.a((defpackage.wwa) obj);
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
