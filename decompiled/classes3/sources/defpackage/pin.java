package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class pin implements java.util.function.Supplier {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ pin(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v18, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v67, types: [aonj, java.lang.Object] */
    @Override // java.util.function.Supplier
    public final java.lang.Object get() {
        int i = 3;
        int i2 = 15;
        int i3 = 9;
        switch (this.$cid) {
            case 0:
                android.os.Bundle bundle = (android.os.Bundle) this.a;
                if (!pez.af(bundle)) {
                    return j$.util.Optional.empty();
                }
                java.lang.Object obj = this.b;
                return bundle.containsKey("android.telecom.extra.ANSWERING_DROPS_FG_CALL_APP_NAME") ? j$.util.Optional.of(((android.content.Context) obj).getString(2132017685, bundle.getString("android.telecom.extra.ANSWERING_DROPS_FG_CALL_APP_NAME"))) : j$.util.Optional.of(((android.content.Context) obj).getString(2132017686));
            case 1:
                j$.util.Optional optional = (j$.util.Optional) this.a;
                return optional.isPresent() ? pez.ag(((defpackage.abvz) optional.orElseThrow()).e) : pez.ag(((defpackage.sql) this.b).j());
            case 2:
                java.lang.String str = (java.lang.String) ((j$.util.Optional) this.b).orElse((java.lang.Object) null);
                if (str != null) {
                    if (((aify) j$.util.Collection.-EL.stream(((ypt) this.a.a()).b).map(new defpackage.pir(2)).map(new defpackage.pir(i)).collect(aido.a)).contains(akfg.b(str))) {
                        return java.lang.Boolean.FALSE;
                    }
                }
                return java.lang.Boolean.TRUE;
            case 3:
                return this.a == defpackage.zpo.g ? j$.util.Optional.ofNullable(((android.telecom.Call) this.b).getDetails().getDisconnectCause()) : j$.util.Optional.empty();
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                java.lang.Object obj2 = this.b;
                j$.util.Objects.requireNonNull(obj2);
                defpackage.pnh pnhVar = new defpackage.pnh(obj2, i3);
                java.lang.Object obj3 = this.a;
                j$.util.Optional optional2 = (j$.util.Optional) obj3;
                if (true != optional2.isPresent()) {
                    return obj3;
                }
                j$.util.Optional optionalC = ((defpackage.zmn) pnhVar.a).c((android.telecom.PhoneAccountHandle) optional2.get());
                optionalC.getClass();
                return optionalC;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return ((defpackage.qke) this.b).a.getString(2132019517, this.a);
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return ((defpackage.qke) this.b).a.getString(2132019558, this.a);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                java.lang.Object obj4 = this.b;
                java.lang.Object obj5 = this.a;
                defpackage.pin pinVar = new defpackage.pin(obj5, obj4, i3);
                defpackage.qth qthVar = (defpackage.qth) obj5;
                if (!((java.lang.Boolean) qthVar.d.a(pinVar).a(mgv.D).f()).booleanValue()) {
                    return j$.util.Optional.empty();
                }
                int i4 = -qthVar.a();
                android.util.Size size = (android.util.Size) qthVar.f().orElseThrow();
                android.util.Size size2 = (android.util.Size) obj4;
                defpackage.qth.a.b().l("com/android/dialer/incall/video/ui/VideoSelector", "buildPreviewVideoScale", 166, "VideoSelector.java").O("viewSize x/y %d/%d, previewVideoDimensions x/y: %d/%d, counterRotation: %d", java.lang.Integer.valueOf(size2.getWidth()), java.lang.Integer.valueOf(size2.getHeight()), java.lang.Integer.valueOf(size.getWidth()), java.lang.Integer.valueOf(size.getHeight()), java.lang.Integer.valueOf(i4));
                return j$.util.Optional.of(defpackage.qtq.d(size2, size, i4));
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                if (!defpackage.qth.i((android.util.Size) this.b)) {
                    return java.lang.Boolean.FALSE;
                }
                j$.util.Optional optionalE = ((defpackage.qth) this.a).e();
                if (!optionalE.isPresent()) {
                    a.bI(defpackage.qth.a.d(), "background video dimensions are empty", "com/android/dialer/incall/video/ui/VideoSelector", "checkBackgroundViewAndVideoPreconditions", (char) 330, "VideoSelector.java", zct.b);
                    return java.lang.Boolean.FALSE;
                }
                android.util.Size size3 = (android.util.Size) optionalE.orElseThrow();
                if (size3.getWidth() > 0 && size3.getHeight() > 0) {
                    return java.lang.Boolean.TRUE;
                }
                a.bI(defpackage.qth.a.c().m(aioa.b), "background video dimensions are unexpectedly 0", "com/android/dialer/incall/video/ui/VideoSelector", "checkBackgroundViewAndVideoPreconditions", (char) 339, "VideoSelector.java", zct.b);
                return java.lang.Boolean.FALSE;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                if (!defpackage.qth.i((android.util.Size) this.b)) {
                    return java.lang.Boolean.FALSE;
                }
                j$.util.Optional optionalF = ((defpackage.qth) this.a).f();
                if (!optionalF.isPresent()) {
                    a.bI(defpackage.qth.a.d(), "preview video dimensions are empty", "com/android/dialer/incall/video/ui/VideoSelector", "checkPreviewViewAndVideoPreconditions", (char) 299, "VideoSelector.java", zct.b);
                    return java.lang.Boolean.FALSE;
                }
                android.util.Size size4 = (android.util.Size) optionalF.orElseThrow();
                if (size4.getWidth() > 0 && size4.getHeight() > 0) {
                    return java.lang.Boolean.TRUE;
                }
                a.bI(defpackage.qth.a.c().m(aioa.b), "preview video dimensions are unexpectedly 0", "com/android/dialer/incall/video/ui/VideoSelector", "checkPreviewViewAndVideoPreconditions", (char) 308, "VideoSelector.java", zct.b);
                return java.lang.Boolean.FALSE;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                java.lang.Object obj6 = this.a;
                android.util.Size size5 = (android.util.Size) this.b;
                defpackage.qth qthVar2 = (defpackage.qth) obj6;
                if (!qthVar2.h(size5)) {
                    return j$.util.Optional.empty();
                }
                if (qthVar2.e.a) {
                    aimw aimwVarL = defpackage.qth.a.b().l("com/android/dialer/incall/video/ui/VideoSelector", "getBackgroundVideoSuggestedScaleType", 264, "VideoSelector.java");
                    defpackage.qtp qtpVar = defpackage.qtp.b;
                    aimwVarL.y("scale type is %s", qtpVar);
                    return j$.util.Optional.of(qtpVar);
                }
                android.util.Size size6 = (android.util.Size) qthVar2.e().orElseThrow();
                float width = size6.getWidth() / size6.getHeight();
                float width2 = size5.getWidth() / size5.getHeight();
                j$.util.Optional optionalOf = java.lang.Math.abs(width - width2) / (width + width2) < 0.2f ? j$.util.Optional.of(defpackage.qtp.b) : j$.util.Optional.of(defpackage.qtp.a);
                defpackage.qth.a.b().l("com/android/dialer/incall/video/ui/VideoSelector", "getBackgroundVideoSuggestedScaleType", 281, "VideoSelector.java").y("scale type is %s", optionalOf.orElseThrow());
                return optionalOf;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                java.lang.Object obj7 = this.a;
                android.util.Size size7 = (android.util.Size) this.b;
                defpackage.qth qthVar3 = (defpackage.qth) obj7;
                if (!qthVar3.h(size7)) {
                    return j$.util.Optional.empty();
                }
                android.util.Size size8 = (android.util.Size) qthVar3.e().orElseThrow();
                defpackage.qtp qtpVar2 = (defpackage.qtp) qthVar3.g(size7).orElseThrow();
                if (!qthVar3.e.a) {
                    defpackage.qth.a.b().l("com/android/dialer/incall/video/ui/VideoSelector", "buildBackgroundVideoScale", 229, "VideoSelector.java").O("viewSize x/y: %d/%d,  backgroundVideoDimensions x/y: %d/%d, scaleType: %s", java.lang.Integer.valueOf(size7.getWidth()), java.lang.Integer.valueOf(size7.getHeight()), java.lang.Integer.valueOf(size8.getWidth()), java.lang.Integer.valueOf(size8.getHeight()), qtpVar2);
                    return j$.util.Optional.of(defpackage.qtq.c(size7, size8, 0, qtpVar2));
                }
                aimz aimzVar = defpackage.qth.a;
                aimzVar.b().l("com/android/dialer/incall/video/ui/VideoSelector", "buildBackgroundVideoScale", 205, "VideoSelector.java").v("local video only mode");
                int i5 = -qthVar3.a();
                aimzVar.b().l("com/android/dialer/incall/video/ui/VideoSelector", "buildBackgroundVideoScale", 212, "VideoSelector.java").P("viewSize x/y: %d/%d, backgroundVideoDimensions x/y: %d/%d, counterRotation: %d, scaleType: %s", java.lang.Integer.valueOf(size7.getWidth()), java.lang.Integer.valueOf(size7.getHeight()), java.lang.Integer.valueOf(size8.getWidth()), java.lang.Integer.valueOf(size8.getHeight()), java.lang.Integer.valueOf(i5), qtpVar2);
                return j$.util.Optional.of(defpackage.qtq.c(size7, size8, i5, qtpVar2));
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                defpackage.qkv qkvVar = new defpackage.qkv(new defpackage.skx(this.b, i2), 20);
                java.lang.Object objOfNullable = this.a;
                j$.util.Optional optional3 = (j$.util.Optional) objOfNullable;
                if (true == optional3.isPresent()) {
                    objOfNullable = j$.util.Optional.ofNullable(qkvVar.a.a(optional3.get()));
                }
                return (j$.util.Optional) ((j$.util.Optional) objOfNullable).orElse(j$.util.Optional.empty());
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                return ((vfr) this.a).d.ao((android.telecom.PhoneAccountHandle) this.b);
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                return ((vfr) this.a).c.i((android.telecom.PhoneAccountHandle) this.b);
            case 15:
                java.lang.Object obj8 = this.b;
                java.lang.Object obj9 = this.a;
                vfu vfuVar = (vfu) obj9;
                return ahvr.H(vfuVar.v((android.telecom.PhoneAccountHandle) obj8), new defpackage.veb(obj9, 19), vfuVar.b);
            case 16:
                java.lang.Object obj10 = this.b;
                vfu vfuVar2 = (vfu) this.a;
                return ahvr.H(vfuVar2.v((android.telecom.PhoneAccountHandle) obj10), new defpackage.vef(14), vfuVar2.b);
            case 17:
                java.lang.Object obj11 = this.b;
                vfu vfuVar3 = (vfu) this.a;
                return ahvr.H(vfuVar3.v((android.telecom.PhoneAccountHandle) obj11), new defpackage.vef(i2), vfuVar3.b);
            case 18:
                vfu vfuVar4 = (vfu) this.a;
                return ahvr.H(vfuVar4.d.x((android.telecom.PhoneAccountHandle) this.b), new defpackage.vef(13), vfuVar4.b);
            case 19:
                vfu vfuVar5 = (vfu) this.a;
                return ahvr.H(vfuVar5.d.x((android.telecom.PhoneAccountHandle) this.b), new defpackage.vft(i), vfuVar5.b);
            default:
                java.lang.Object obj12 = this.b;
                vfu vfuVar6 = (vfu) this.a;
                return java.lang.Boolean.valueOf(vfuVar6.e.ar(vfuVar6.a((android.telecom.PhoneAccountHandle) obj12)));
        }
    }

    public /* synthetic */ pin(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
