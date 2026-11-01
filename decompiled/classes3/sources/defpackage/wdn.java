package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class wdn implements ahzi {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ wdn(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r7v63, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v66, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v71, types: [aoin, java.lang.Object] */
    public final java.lang.Object eZ() {
        java.lang.Object wdwVar;
        switch (this.$cid) {
            case 0:
                wdx wdxVar = (wdx) this.a;
                wdwVar = new defpackage.wdw(wdxVar, (android.content.Context) wdxVar.b.eZ());
                break;
            case 1:
                wdx wdxVar2 = (wdx) this.a;
                return new android.view.ContextThemeWrapper((android.content.Context) wdxVar2.c.eZ(), urg.d(wdxVar2.e.g()));
            case 2:
                wdx wdxVar3 = (wdx) this.a;
                if (android.os.Build.VERSION.SDK_INT < 31) {
                    return wdxVar3.d;
                }
                tkl tklVar = wdxVar3.z;
                android.content.Context contextCreateDisplayContext = ((android.content.Context) tklVar.c).createDisplayContext(((android.hardware.display.DisplayManager) tklVar.a).getDisplay(0));
                if (baa$.ExternalSyntheticApiModelOutline1.m(contextCreateDisplayContext) != null) {
                    return baa$.ExternalSyntheticApiModelOutline1.m(contextCreateDisplayContext, 2038, (android.os.Bundle) null);
                }
                a.bI(wdx.a.d(), "No display for context consumed by bubble display", "com/android/dialer/widget/bubble/impl/BubbleImpl", "getDisplayContext", (char) 1072, "BubbleImpl.java", zct.b);
                return wdxVar3.d;
            case 3:
                return (android.view.WindowManager) ((android.content.Context) ((wdx) this.a).b.eZ()).getSystemService(android.view.WindowManager.class);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                wdx wdxVar4 = (wdx) this.a;
                return java.lang.Integer.valueOf(((android.content.Context) wdxVar4.b.eZ()).getResources().getDimensionPixelOffset(2131165383) - ((android.content.Context) wdxVar4.b.eZ()).getResources().getDimensionPixelSize(2131165386));
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return wsc.bq((android.content.Context) ((wdx) this.a).b.eZ(), defpackage.urq.EASING_STANDARD_ACCELERATE);
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                wdx wdxVar5 = (wdx) this.a;
                wdwVar = new defpackage.wdw(wdxVar5, (android.content.Context) wdxVar5.b.eZ());
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                wdx wdxVar6 = (wdx) this.a;
                return java.lang.Integer.valueOf(((android.content.Context) wdxVar6.b.eZ()).getResources().getDimensionPixelSize(2131165390) - ((android.content.Context) wdxVar6.b.eZ()).getResources().getDimensionPixelSize(2131165392));
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                wdwVar = new defpackage.wdk((android.content.Context) ((wdx) this.a).b.eZ());
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                wdx wdxVar7 = (wdx) this.a;
                wdwVar = new defpackage.wdu(wdxVar7, (android.content.Context) wdxVar7.b.eZ());
                break;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                wdx wdxVar8 = (wdx) this.a;
                wdwVar = new defpackage.wdu(wdxVar8, (android.content.Context) wdxVar8.b.eZ());
                break;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                defpackage.wib wibVar = (defpackage.wib) this.a;
                float f = wibVar.b;
                float f2 = wibVar.a;
                wdwVar = new defpackage.wia(wibVar.a(defpackage.wib.c(true, true, f2, f)), wibVar.a(defpackage.wib.c(true, false, f2, f)), wibVar.a(defpackage.wib.c(false, true, f2, f)), wibVar.a(defpackage.wib.c(false, false, f2, f)));
                break;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                wdwVar = new defpackage.wii((ops) this.a);
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                wdwVar = new defpackage.wij((ops) this.a);
                break;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                return (acux) this.a.a();
            case 15:
                return java.lang.Integer.valueOf(defpackage.wqo.a(((java.lang.Long) this.a.a()).longValue()));
            case 16:
                return java.lang.Integer.valueOf(defpackage.wqo.a(((java.lang.Long) this.a.a()).longValue()));
            case 17:
                return java.lang.Integer.valueOf(((android.content.res.Resources) this.a).getDimensionPixelSize(2131168040));
            case 18:
                return java.lang.Integer.valueOf(((android.content.res.Resources) this.a).getDimensionPixelSize(2131168037));
            case 19:
                return java.lang.Integer.valueOf(((android.content.res.Resources) this.a).getDimensionPixelSize(2131168039));
            default:
                return java.lang.Integer.valueOf(((android.content.res.Resources) this.a).getDimensionPixelSize(2131168038));
        }
        return wdwVar;
    }
}
