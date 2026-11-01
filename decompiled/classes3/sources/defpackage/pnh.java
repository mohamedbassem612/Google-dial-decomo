package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class pnh implements java.util.function.Function {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ pnh(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function andThen(java.util.function.Function function) {
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
        return j$.util.function.Function.-CC.$default$andThen(this, function);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v10, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v11, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v12, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r12v74, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v75, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v8, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v9, types: [aonj, java.lang.Object] */
    @Override // java.util.function.Function
    public final java.lang.Object apply(java.lang.Object obj) {
        android.util.Size size;
        int width;
        int height;
        java.lang.Object obj2;
        int i = 0;
        int i2 = 1;
        switch (this.$cid) {
            case 0:
                return pez.aq((android.content.Context) this.a, (java.lang.CharSequence) obj);
            case 1:
                return (java.lang.Boolean) new mgf((mgu) this.a, ((java.lang.Boolean) obj).booleanValue()).a(mfy.bo).f();
            case 2:
                return this.a.a(obj);
            case 3:
                return this.a.a(obj);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return this.a.a(obj);
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return a.k((aonj) this.a, obj);
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return j$.util.Optional.ofNullable((defpackage.sbe) this.a.get((defpackage.pmq) obj));
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                return android.text.TextUtils.concat(this.a, "  ·  ", (java.lang.CharSequence) obj);
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                return pez.aq((android.content.Context) this.a, (java.lang.CharSequence) obj);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                return ((defpackage.zmn) this.a).c((android.telecom.PhoneAccountHandle) obj);
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                android.telecom.DisconnectCause disconnectCause = (android.telecom.DisconnectCause) obj;
                int code = disconnectCause.getCode();
                if (code != 9 && code != 11) {
                    switch (code) {
                        case 1:
                        case 3:
                            return 2000;
                        case 2:
                            return !((java.lang.Boolean) ((defpackage.puq) this.a).p.a()).booleanValue() ? 200 : 0;
                        case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                        case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                        case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                            return 0;
                    }
                }
                if (disconnectCause.getReason() != null && disconnectCause.getReason().contains("IMS_MERGED_SUCCESSFULLY")) {
                    return 200;
                }
                return 5000;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                aoin aoinVar = ((defpackage.pvf) this.a).l;
                defpackage.pvc pvcVar = (defpackage.pvc) obj;
                if (((java.lang.Long) aoinVar.a()).longValue() == 240) {
                    size = defpackage.pvf.c;
                } else if (((java.lang.Long) aoinVar.a()).longValue() == 720) {
                    size = defpackage.pvf.b;
                } else {
                    a.bt(defpackage.pvf.a.c().m(aioa.b), "VIDEO_CALL_CAMERA_RESOLUTION is invalid: %d", aoinVar.a(), "com/android/dialer/incall/core/video/impl/CameraController", "getOptimalCameraSize", (char) 305, "CameraController.java", zct.b);
                    size = defpackage.pvf.b;
                }
                if (pvcVar.a().a()) {
                    width = size.getHeight();
                    height = size.getWidth();
                } else {
                    width = size.getWidth();
                    height = size.getHeight();
                }
                aimz aimzVar = defpackage.pvf.a;
                aimzVar.b().l("com/android/dialer/incall/core/video/impl/CameraController", "getOptimalCameraSize", 317, "CameraController.java").M("view: %dx%d, sizes: %s", java.lang.Integer.valueOf(width), java.lang.Integer.valueOf(height), pvcVar.b());
                j$.util.Optional optionalMax = j$.util.Collection.-EL.stream(pvcVar.b()).filter(new defpackage.amdh(width, height, i2)).max(j$.util.Comparator.-CC.comparingLong(new fhk(6)));
                aimzVar.b().l("com/android/dialer/incall/core/video/impl/CameraController", "getOptimalCameraSize", 323, "CameraController.java").y("optimal size: %s", optionalMax);
                return optionalMax;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                return java.lang.Boolean.valueOf(((alad) this.a).equals((defpackage.pxl) obj));
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                return java.lang.Boolean.valueOf(this.a.equals((defpackage.pyi) obj));
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                return ((zpm) this.a).e((java.lang.String) obj);
            case 15:
                defpackage.pzp pzpVar = (defpackage.pzp) obj;
                aoin aoinVar2 = (aoin) ((defpackage.pzt) this.a).a.get(pzpVar);
                if (aoinVar2 != null) {
                    return java.lang.Boolean.valueOf(((defpackage.pzs) aoinVar2.a()).f());
                }
                throw new java.lang.AssertionError(java.lang.String.format("screen for %s is not bound", pzpVar.name()));
            case 16:
                return ((dxt) this.a).b((java.lang.String) obj);
            case 17:
                java.lang.String str = ((defpackage.qgp) obj).c;
                ahzf ahzfVar = defpackage.qeq.a;
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                while (true) {
                    obj2 = this.a;
                    if (i < str.length()) {
                        java.lang.String str2 = (java.lang.String) obj2;
                        if (i < str2.length() && str.charAt(i) == str2.charAt(i)) {
                            i++;
                        }
                    }
                }
                for (int i3 = i; i3 < str.length(); i3++) {
                    sb.append('\b');
                }
                while (true) {
                    java.lang.String str3 = (java.lang.String) obj2;
                    if (i >= str3.length()) {
                        return sb.toString();
                    }
                    sb.append(str3.charAt(i));
                    i++;
                }
                break;
            case 18:
                return ((her) this.a).X((defpackage.qfz) obj);
            case 19:
                return this.a.a(obj);
            default:
                return this.a.a(obj);
        }
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
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
        return j$.util.function.Function.-CC.$default$compose(this, function);
    }
}
