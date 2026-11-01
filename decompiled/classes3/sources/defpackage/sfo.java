package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class sfo extends aomh implements aonn {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sfo(android.content.Context context, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = context;
    }

    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        switch (this.$cid) {
            case 0:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 1:
                return c((sdc) obj, (aoln) obj2).b(aojh.a);
            case 2:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 3:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 15:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 16:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 17:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 18:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 19:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            default:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
        }
    }

    /* JADX WARN: Type inference failed for: r10v84, types: [java.lang.Iterable, java.lang.Object] */
    public final java.lang.Object b(java.lang.Object obj) {
        android.content.pm.ActivityInfo activityInfo;
        android.content.pm.ApplicationInfo applicationInfo;
        android.os.Bundle bundle = null;
        z = false;
        boolean z = false;
        int i = 0;
        switch (this.$cid) {
            case 0:
                aooc.af(obj);
                return ((vwb) this.a).c;
            case 1:
                aooc.af(obj);
                return this.a;
            case 2:
                aooc.af(obj);
                java.io.File file = new java.io.File(((sjy) this.a).c.getCacheDir(), "calling_card_cache");
                file.mkdirs();
                return file;
            case 3:
                aooc.af(obj);
                return java.lang.String.valueOf(((sjy) this.a).c.getCacheDir().getAbsolutePath()).concat("/calling_card_cache");
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                aooc.af(obj);
                defpackage.skp skpVar = defpackage.skp.a;
                aooh.e(skpVar, "getDefaultInstance(...)");
                ((defpackage.ska) this.a).b.g(skpVar);
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                aooc.af(obj);
                java.lang.Object obj2 = ((defpackage.ska) this.a).b.a;
                if (obj2 == null) {
                    return agxh.a;
                }
                defpackage.skq skqVar = (defpackage.skq) obj2;
                return agxh.a(skqVar.a, skqVar.b);
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                aooc.af(obj);
                return java.lang.Boolean.valueOf(dvx.c(((defpackage.sle) this.a).e.A(), "android.permission.CAMERA") == 0);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                aooc.af(obj);
                defpackage.sle sleVar = (defpackage.sle) this.a;
                if (((java.lang.Boolean) sleVar.u.a()).booleanValue()) {
                    android.net.Uri uri = sleVar.t.a().a;
                    if (uri == null) {
                        return null;
                    }
                    sleVar.e(uri);
                    return aojh.a;
                }
                android.net.Uri uri2 = sleVar.D;
                if (uri2 == null) {
                    return null;
                }
                sleVar.e(uri2);
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                aooc.af(obj);
                akzx akzxVarM = defpackage.plp.a.m();
                akzxVarM.u();
                defpackage.plp plpVar = (defpackage.plp) akzxVarM.b;
                plpVar.c = 1;
                plpVar.b |= 1;
                java.lang.String string = ((android.content.Context) this.a).getString(2132019763);
                akzxVarM.u();
                defpackage.plp plpVar2 = (defpackage.plp) akzxVarM.b;
                j$.util.Objects.requireNonNull(string);
                plpVar2.b |= 2;
                plpVar2.d = string;
                akzxVarM.u();
                defpackage.plp plpVar3 = (defpackage.plp) akzxVarM.b;
                plpVar3.e = 3;
                plpVar3.b |= 4;
                return j$.util.Optional.of(akzxVarM.p());
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                aooc.af(obj);
                java.lang.Object obj3 = this.a;
                android.net.Uri uri3 = android.net.Uri.parse(((defpackage.zrx) obj3).e);
                if (aoov.s(uri3.getScheme(), "tel", false)) {
                    java.lang.String schemeSpecificPart = uri3.getSchemeSpecificPart();
                    java.lang.String strNormalizeNumber = android.telephony.PhoneNumberUtils.normalizeNumber(schemeSpecificPart);
                    aooh.e(strNormalizeNumber, "normalizeNumber(...)");
                    if (aoov.ad(strNormalizeNumber, "+440")) {
                        sty.a.b().l("com/android/dialer/precall/integrations/MalformedNumberRectifierPrecallIntegration", "runWithoutUi$<anonymous>", 48, "MalformedNumberRectifierPrecallIntegration.kt").v("removing (0) in UK numbers");
                        java.lang.String strConvertKeypadLettersToDigits = android.telephony.PhoneNumberUtils.convertKeypadLettersToDigits(schemeSpecificPart);
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        int length = strConvertKeypadLettersToDigits.length();
                        int i2 = 0;
                        while (i < length) {
                            int i3 = i + 1;
                            char cCharAt = strConvertKeypadLettersToDigits.charAt(i);
                            if (cCharAt != "+440".charAt(i2)) {
                                sb.append(cCharAt);
                            } else {
                                i2++;
                                if (i2 == 4) {
                                    aooh.c(strConvertKeypadLettersToDigits);
                                    java.lang.String strSubstring = strConvertKeypadLettersToDigits.substring(i3);
                                    aooh.e(strSubstring, "substring(...)");
                                    sb.append(strSubstring);
                                    defpackage.zoe zoeVarCi = aehj.ci(((alad) obj3).p());
                                    java.lang.String string2 = android.net.Uri.fromParts("tel", sb.toString(), null).toString();
                                    aooh.e(string2, "toString(...)");
                                    zoeVarCi.e(string2);
                                    return zoeVarCi.a();
                                }
                                sb.append(cCharAt);
                            }
                            i = i3;
                        }
                        defpackage.zoe zoeVarCi2 = aehj.ci(((alad) obj3).p());
                        java.lang.String string3 = android.net.Uri.fromParts("tel", sb.toString(), null).toString();
                        aooh.e(string3, "toString(...)");
                        zoeVarCi2.e(string3);
                        return zoeVarCi2.a();
                    }
                }
                return obj3;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                aooc.af(obj);
                android.content.Context context = ((stz) this.a).c;
                android.widget.Toast.makeText(context, context.getString(2132019782), 1).show();
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                aooc.af(obj);
                android.content.pm.ResolveInfo resolveInfoResolveActivity = ((defpackage.suo) this.a).d.getPackageManager().resolveActivity(defpackage.suo.b, 128);
                if (resolveInfoResolveActivity != null && (activityInfo = resolveInfoResolveActivity.activityInfo) != null && (applicationInfo = activityInfo.applicationInfo) != null) {
                    bundle = applicationInfo.metaData;
                }
                if (bundle == null) {
                    defpackage.suo.a.c().m(aioa.b).i(zct.b).l("com/android/dialer/preferredsim/impl/simselector/DataIdProvider", "isPreferredSimEnabled$<anonymous>", 76, "DataIdProvider.kt").v("cannot resolve quick contact app");
                } else if (resolveInfoResolveActivity.activityInfo.applicationInfo.metaData.getBoolean("supports_per_number_preferred_account", false)) {
                    z = true;
                } else {
                    defpackage.suo.a.b().l("com/android/dialer/preferredsim/impl/simselector/DataIdProvider", "isPreferredSimEnabled$<anonymous>", 84, "DataIdProvider.kt").v("system contacts does not support preferred SIM");
                }
                return java.lang.Boolean.valueOf(z);
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                aooc.af(obj);
                defpackage.sxh sxhVar = (defpackage.sxh) this.a;
                if (sxhVar.c.isMusicActive()) {
                    sxhVar.b.n(rmw.jR);
                } else {
                    sxhVar.b.n(rmw.jS);
                }
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                aooc.af(obj);
                return java.lang.Boolean.valueOf(((tcc) this.a).i());
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                aooc.af(obj);
                j$.util.Optional optionalOf = j$.util.Optional.of(new defpackage.rvb(((defpackage.tef) this.a).a.getDrawable(2131231386), defpackage.ruz.GENERAL, defpackage.rvc.MOTOROLA_FLIPPABLES, new defpackage.rva(2132019359)));
                aooh.e(optionalOf, "of(...)");
                return optionalOf;
            case 15:
                aooc.af(obj);
                defpackage.otm otmVar = new defpackage.otm((char[]) null);
                otmVar.a = "is_window_layout_tiny";
                otmVar.f(java.lang.String.valueOf(((agze) ((defpackage.teg) this.a).a).a));
                return otmVar.e();
            case 16:
                aooc.af(obj);
                akzx akzxVarM2 = defpackage.amri.a.m();
                aooh.f(akzxVarM2, "builder");
                defpackage.tpf tpfVar = (defpackage.tpf) this.a;
                java.lang.Object obj4 = tpfVar.d;
                if (obj4 != null) {
                    akzxVarM2.u();
                    defpackage.amri amriVar = (defpackage.amri) akzxVarM2.b;
                    amriVar.c = ((defpackage.trt) obj4).a();
                    amriVar.b |= 1;
                }
                java.util.List listUnmodifiableList = j$.util.DesugarCollections.unmodifiableList(((defpackage.amri) akzxVarM2.b).d);
                aooh.e(listUnmodifiableList, "getLanguageDetectionEventsList(...)");
                new alct(listUnmodifiableList);
                ?? r10 = tpfVar.b;
                akzxVarM2.u();
                defpackage.amri amriVar2 = (defpackage.amri) akzxVarM2.b;
                alat alatVar = amriVar2.d;
                if (!alatVar.c()) {
                    amriVar2.d = alad.J(alatVar);
                }
                akyl.i((java.lang.Iterable) r10, amriVar2.d);
                alad aladVarP = akzxVarM2.p();
                aooh.e(aladVarP, "build(...)");
                return (defpackage.amri) aladVarP;
            case 17:
                aooc.af(obj);
                ((defpackage.tlw) this.a).e = true;
                return aojh.a;
            case 18:
                aooc.af(obj);
                ((defpackage.tlw) this.a).f = true;
                return aojh.a;
            case 19:
                aooc.af(obj);
                ((defpackage.tlw) this.a).d = true;
                return aojh.a;
            default:
                aooc.af(obj);
                ((defpackage.tlw) this.a).g = true;
                return aojh.a;
        }
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        switch (this.$cid) {
            case 0:
                return new defpackage.sfo((vwb) this.a, aolnVar, 0);
            case 1:
                return new defpackage.sfo((sdc) this.a, aolnVar, 1);
            case 2:
                return new defpackage.sfo((sjy) this.a, aolnVar, 2);
            case 3:
                return new defpackage.sfo((sjy) this.a, aolnVar, 3, (byte[]) null);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return new defpackage.sfo((defpackage.ska) this.a, aolnVar, 4);
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return new defpackage.sfo((defpackage.ska) this.a, aolnVar, 5, (byte[]) null);
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return new defpackage.sfo((defpackage.sle) this.a, aolnVar, 6);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                return new defpackage.sfo((defpackage.sle) this.a, aolnVar, 7, (byte[]) null);
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                return new defpackage.sfo((android.content.Context) this.a, aolnVar, 8);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                return new defpackage.sfo((defpackage.zrx) this.a, aolnVar, 9);
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                return new defpackage.sfo((stz) this.a, aolnVar, 10);
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                return new defpackage.sfo((defpackage.suo) this.a, aolnVar, 11);
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                return new defpackage.sfo((defpackage.sxh) this.a, aolnVar, 12);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                return new defpackage.sfo((tcc) this.a, aolnVar, 13);
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                return new defpackage.sfo((defpackage.tef) this.a, aolnVar, 14);
            case 15:
                return new defpackage.sfo((defpackage.teg) this.a, aolnVar, 15);
            case 16:
                return new defpackage.sfo((defpackage.tpf) this.a, aolnVar, 16);
            case 17:
                return new defpackage.sfo((defpackage.tlw) this.a, aolnVar, 17);
            case 18:
                return new defpackage.sfo((defpackage.tlw) this.a, aolnVar, 18, (byte[]) null);
            case 19:
                return new defpackage.sfo((defpackage.tlw) this.a, aolnVar, 19, (char[]) null);
            default:
                return new defpackage.sfo((defpackage.tlw) this.a, aolnVar, 20, (short[]) null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sfo(sdc sdcVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = sdcVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sfo(sjy sjyVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = sjyVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sfo(sjy sjyVar, aoln aolnVar, int i, byte[] bArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = sjyVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sfo(defpackage.ska skaVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = skaVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sfo(defpackage.ska skaVar, aoln aolnVar, int i, byte[] bArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = skaVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sfo(defpackage.sle sleVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = sleVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sfo(defpackage.sle sleVar, aoln aolnVar, int i, byte[] bArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = sleVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sfo(stz stzVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = stzVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sfo(defpackage.suo suoVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = suoVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sfo(defpackage.sxh sxhVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = sxhVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sfo(tcc tccVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = tccVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sfo(defpackage.tef tefVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = tefVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sfo(defpackage.teg tegVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = tegVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sfo(defpackage.tlw tlwVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = tlwVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sfo(defpackage.tlw tlwVar, aoln aolnVar, int i, byte[] bArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = tlwVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sfo(defpackage.tlw tlwVar, aoln aolnVar, int i, char[] cArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = tlwVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sfo(defpackage.tlw tlwVar, aoln aolnVar, int i, short[] sArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = tlwVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sfo(defpackage.tpf tpfVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = tpfVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sfo(vwb vwbVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = vwbVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sfo(defpackage.zrx zrxVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = zrxVar;
    }
}
