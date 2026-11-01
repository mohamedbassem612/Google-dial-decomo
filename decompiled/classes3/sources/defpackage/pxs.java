package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class pxs implements java.util.function.Supplier {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ pxs(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r13v9, types: [ahzi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9, types: [ajct, java.lang.Object] */
    @Override // java.util.function.Supplier
    public final java.lang.Object get() {
        java.lang.IllegalStateException illegalStateException;
        int i = 6;
        switch (this.$cid) {
            case 0:
                return ((defpackage.pxt) this.a).d.a("IN_CALL_DIALOG_LOCK");
            case 1:
                return java.lang.Boolean.valueOf(((defpackage.ptx) this.a).t());
            case 2:
                return (android.os.PowerManager.WakeLock) this.a.eZ();
            case 3:
                java.lang.Object obj = this.a;
                defpackage.qtg qtgVar = ((defpackage.qth) obj).e;
                if (!qtgVar.a) {
                    return qtgVar.e.b;
                }
                defpackage.pux puxVar = qtgVar.d;
                defpackage.qkv qkvVar = new defpackage.qkv(obj, i);
                j$.util.Optional optional = puxVar.b;
                if (true != optional.isPresent()) {
                    return optional;
                }
                android.util.Size size = (android.util.Size) optional.get();
                j$.util.Optional optional2 = ((defpackage.qth) qkvVar.a).e.b;
                if (optional2.isPresent() && ((defpackage.pus) optional2.orElseThrow()).a()) {
                    defpackage.qth.a.b().l("com/android/dialer/incall/video/ui/VideoSelector", "convertLocalDimensionsWithRotation", 407, "VideoSelector.java").z("localDimensionsWithRotation: height: %d, width: %d", size.getHeight(), size.getWidth());
                    size = new android.util.Size(size.getHeight(), size.getWidth());
                }
                return j$.util.Optional.ofNullable(size);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                int rotation = ((defpackage.qth) this.a).c.getDefaultDisplay().getRotation();
                defpackage.qth.a.b().l("com/android/dialer/incall/video/ui/VideoSelector", "getRenderedContentRotationInDegrees", 72, "VideoSelector.java").w("rotation is: %d", rotation);
                if (rotation == 3) {
                    return 270;
                }
                if (rotation == 2) {
                    return 180;
                }
                return rotation == 1 ? 90 : 0;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                java.lang.Object obj2 = this.a;
                defpackage.qtg qtgVar2 = ((defpackage.qth) obj2).e;
                if (qtgVar2.a) {
                    return j$.util.Optional.empty();
                }
                defpackage.pux puxVar2 = qtgVar2.d;
                defpackage.qkv qkvVar2 = new defpackage.qkv(obj2, i);
                j$.util.Optional optional3 = puxVar2.b;
                if (true != optional3.isPresent()) {
                    return optional3;
                }
                android.util.Size size2 = (android.util.Size) optional3.get();
                j$.util.Optional optional4 = ((defpackage.qth) qkvVar2.a).e.b;
                if (optional4.isPresent() && ((defpackage.pus) optional4.orElseThrow()).a()) {
                    defpackage.qth.a.b().l("com/android/dialer/incall/video/ui/VideoSelector", "convertLocalDimensionsWithRotation", 407, "VideoSelector.java").z("localDimensionsWithRotation: height: %d, width: %d", size2.getHeight(), size2.getWidth());
                    size2 = new android.util.Size(size2.getHeight(), size2.getWidth());
                }
                return j$.util.Optional.ofNullable(size2);
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                int iA = ((defpackage.qth) this.a).a() % 180;
                defpackage.qth.a.b().l("com/android/dialer/incall/video/ui/VideoSelector", "isLandscape", 93, "VideoSelector.java").v(iA == 90 ? "landscape" : "portrait");
                return java.lang.Boolean.valueOf(iA == 90);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                return ((hwv) this.a).b;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                return ((hwv) this.a).a;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                return this.a;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                return java.lang.Boolean.valueOf(((vln) this.a).c.ar(new aile("com.tmobile.vvm.application")));
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                aile aileVar = new aile("com.tmobile.vvm.application");
                aogc aogcVar = ((vln) this.a).c;
                ajcq ajcqVarEU = aogcVar.c.eU(ahqx.i(new defpackage.uwl(aogcVar, aileVar, 13)));
                aooh.e(ajcqVarEU, "submit(...)");
                return ajcqVarEU;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                aify aifyVar = ((defpackage.vlx) this.a).d;
                aimz aimzVar = vma.a;
                illegalStateException = new java.lang.IllegalStateException(java.lang.String.format("Empty greeting url: %s", aifyVar));
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                aigf aigfVar = ((defpackage.vlx) this.a).b;
                aimz aimzVar2 = vma.a;
                illegalStateException = new java.lang.IllegalStateException(java.lang.String.format("Can't find greeting type: %s", aigfVar));
                break;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                return j$.util.Optional.of(((android.content.Context) this.a).getString(2132020848));
            case 15:
                return j$.util.Optional.of(((android.content.Context) this.a).getString(2132020848));
            case 16:
                illegalStateException = new java.lang.IllegalStateException(java.lang.String.format("no ringtone for URI %s", this.a));
                break;
            case 17:
                return java.lang.Boolean.valueOf(((defpackage.zqj) this.a).c);
            case 18:
                return java.lang.Boolean.valueOf(((defpackage.zqj) this.a).e);
            case 19:
                return java.lang.Boolean.valueOf(((defpackage.zqj) this.a).f);
            default:
                return java.lang.Boolean.valueOf(((defpackage.zqj) this.a).b);
        }
        return illegalStateException;
    }
}
