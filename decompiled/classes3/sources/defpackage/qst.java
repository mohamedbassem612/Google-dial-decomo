package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class qst implements java.util.function.Consumer {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ qst(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r5v58, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v59, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v60, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v61, types: [aonj, java.lang.Object] */
    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object obj) {
        qbc qbcVar;
        switch (this.$cid) {
            case 0:
                ((defpackage.qtq) obj).e(((defpackage.qtd) this.a).e());
                return;
            case 1:
                ((defpackage.qtd) this.a).x(((defpackage.qqr) obj).h.a);
                return;
            case 2:
                ((defpackage.qtd) this.a).g().setScaleType((android.widget.ImageView.ScaleType) obj);
                return;
            case 3:
                defpackage.qrv qrvVar = (defpackage.qrv) obj;
                aihd aihdVar = defpackage.qtd.a;
                qrvVar.e(qbc.bZ);
                qrvVar.h.set(this.a);
                qrvVar.s.a(ajcm.a);
                return;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                aihd aihdVar2 = defpackage.qtd.a;
                ((defpackage.qtq) obj).e((android.view.TextureView) this.a);
                return;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                android.util.Size size = (android.util.Size) obj;
                int width = size.getWidth();
                int height = size.getHeight();
                defpackage.qtd qtdVar = (defpackage.qtd) this.a;
                if (qtdVar.z()) {
                    height = (int) (height * 0.6f);
                    width = (int) (width * 0.6f);
                }
                defpackage.qtd.u(qtdVar.e(), width, height);
                defpackage.qtd.u(qtdVar.h(), width, height);
                return;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                aihd aihdVar3 = defpackage.qtd.a;
                ((defpackage.qtq) obj).e((android.view.TextureView) this.a);
                return;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                defpackage.qrv qrvVar2 = (defpackage.qrv) obj;
                j$.util.Optional optionalOfNullable = ((defpackage.qtd) this.a).l;
                if (true == optionalOfNullable.isPresent()) {
                    optionalOfNullable = j$.util.Optional.ofNullable(java.lang.Boolean.valueOf(((defpackage.qqr) optionalOfNullable.get()).c));
                }
                qrvVar2.j(!((java.lang.Boolean) optionalOfNullable.orElse(java.lang.Boolean.FALSE)).booleanValue());
                return;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                ((defpackage.qtd) this.a).y((defpackage.qth) obj);
                return;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                int i = defpackage.qta.b;
                ((defpackage.qtd) this.a).y((defpackage.qth) obj);
                return;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                defpackage.qtm.a.b().l("com/android/dialer/incall/video/view/SurfaceTextureTracker", "stop", 108, "SurfaceTextureTracker.java").y("%s stopped", ((defpackage.qtm) this.a).b);
                ((ajcq) obj).cancel(false);
                return;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                defpackage.qbe qbeVarCp = ((defpackage.qtk) ((defpackage.apqr) obj).a(defpackage.qtk.class)).cp();
                int iOrdinal = ((defpackage.qtm) this.a).b.ordinal();
                if (iOrdinal == 0) {
                    qbcVar = qbc.ht;
                } else if (iOrdinal == 1) {
                    qbcVar = qbc.hu;
                } else {
                    if (iOrdinal != 2) {
                        throw new java.lang.AssertionError("exhaustive switch");
                    }
                    qbcVar = qbc.hv;
                }
                qbeVarCp.a(qbcVar);
                return;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                defpackage.qud qudVar = (defpackage.qud) obj;
                ailj ailjVarK = ((defpackage.rap) this.a).u.e().k();
                while (ailjVarK.hasNext()) {
                    defpackage.uar uarVar = (defpackage.uar) ailjVarK.next();
                    int iBX = pez.bX(qudVar.g);
                    if (iBX == 0) {
                        iBX = 1;
                    }
                    uarVar.b(iBX, qudVar.h);
                }
                return;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                defpackage.qud qudVar2 = (defpackage.qud) obj;
                ailj ailjVarK2 = ((defpackage.rap) this.a).u.e().k();
                while (ailjVarK2.hasNext()) {
                    defpackage.uar uarVar2 = (defpackage.uar) ailjVarK2.next();
                    int iBX2 = pez.bX(qudVar2.g);
                    if (iBX2 == 0) {
                        iBX2 = 1;
                    }
                    uarVar2.a(iBX2);
                }
                return;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                this.a.a(obj);
                return;
            case 15:
                this.a.a(obj);
                return;
            case 16:
                this.a.a(obj);
                return;
            case 17:
                this.a.a(obj);
                return;
            case 18:
                ((defpackage.rfa) obj).c(((defpackage.rej) this.a).a, defpackage.rex.a);
                return;
            case 19:
                ((defpackage.rfa) obj).b(((defpackage.rfm) this.a).a());
                return;
            default:
                ((defpackage.rfa) obj).d(((defpackage.rfw) this.a).a());
                return;
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
