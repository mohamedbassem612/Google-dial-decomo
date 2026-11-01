package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class puo implements java.util.function.Consumer {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ puo(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    /* JADX WARN: Type inference failed for: r6v42, types: [aonj, java.lang.Object] */
    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object obj) {
        switch (this.$cid) {
            case 0:
                ((defpackage.pzo) obj).c((android.telecom.Call) this.a, 3);
                break;
            case 1:
                ((defpackage.pzo) obj).c((android.telecom.Call) this.a, 5);
                break;
            case 2:
                ((defpackage.pvf) this.a).q.b(mfy.dq, aify.p(gus.aw("null")));
                ((android.telecom.InCallService.VideoCall) obj).setCamera(null);
                break;
            case 3:
                defpackage.pxh pxhVar = ((defpackage.pvf) this.a).s;
                android.util.Size size = (android.util.Size) obj;
                pxhVar.f(size);
                pxhVar.e(size);
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                java.lang.Object obj2 = this.a;
                agsm.i(534, ahvr.E(new defpackage.pmw(obj2, (defpackage.pvi) obj, 7), ((defpackage.pvj) obj2).d), "unable to make toast", new java.lang.Object[0]);
                break;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                defpackage.pvm.a.b().l("com/android/dialer/incall/core/video/impl/VideoCallCallback", "onVideoCallChanged", 61, "VideoCallCallback.java").v("register");
                java.lang.Object obj3 = this.a;
                defpackage.pvm pvmVar = (defpackage.pvm) obj3;
                mni.aK(pvmVar.d, mfy.dl);
                ((android.telecom.InCallService.VideoCall) obj).registerCallback((android.telecom.InCallService.VideoCall.Callback) obj3);
                aimz aimzVar = defpackage.pxh.a;
                aimzVar.b().l("com/android/dialer/incall/core/video/impl/VideoSurfaceCacheImpl", "reportDeviceOrientationOnVideoCallCreated", 132, "VideoSurfaceCacheImpl.java").v("enter");
                aimw aimwVarL = aimzVar.b().l("com/android/dialer/incall/core/video/impl/VideoSurfaceCacheImpl", "reportDeviceOrientationOnVideoCallCreated", 133, "VideoSurfaceCacheImpl.java");
                defpackage.pxh pxhVar2 = pvmVar.c;
                j$.util.Optional optionalOfNullable = pxhVar2.i;
                if (true == optionalOfNullable.isPresent()) {
                    optionalOfNullable = j$.util.Optional.ofNullable(optionalOfNullable.get().toString());
                }
                aimwVarL.y("uiRotation: %s", optionalOfNullable.orElse("empty"));
                j$.util.Optional optional = pxhVar2.i;
                defpackage.puo puoVar = new defpackage.puo(pxhVar2, 6);
                if (true == optional.isPresent()) {
                    ((defpackage.pxh) puoVar.a).d(((java.lang.Integer) optional.get()).intValue());
                }
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                ((defpackage.pxh) this.a).d(((java.lang.Integer) obj).intValue());
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                defpackage.pxh pxhVar3 = (defpackage.pxh) this.a;
                pxhVar3.h.a(mfy.ds);
                ((android.telecom.InCallService.VideoCall) obj).setDisplaySurface(pxhVar3.b());
                break;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                ahvr.bN(((defpackage.pyi) obj).b == ((defpackage.pyi) this.a).b, "the animator only supports one and only one container");
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                aimz aimzVar2 = defpackage.pyu.a;
                ((defpackage.pyq) ((defpackage.apqr) obj).a(defpackage.pyq.class)).cp().a((qbc) this.a);
                break;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                akzx akzxVar = (akzx) this.a;
                akzxVar.u();
                amow amowVar = akzxVar.b;
                amow amowVar2 = amow.a;
                amowVar.ag = ((defpackage.pzp) obj).t;
                amowVar.c |= 1073741824;
                break;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                this.a.a(obj);
                break;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                defpackage.qax qaxVar = (defpackage.qax) this.a;
                qaxVar.e.p((aeun) obj, ruc.aK);
                qaxVar.u = j$.util.Optional.empty();
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                java.lang.Long l = (java.lang.Long) obj;
                l.longValue();
                defpackage.qax qaxVar2 = (defpackage.qax) this.a;
                java.lang.Long l2 = (java.lang.Long) j$.util.concurrent.ConcurrentMap.-EL.getOrDefault((java.util.concurrent.ConcurrentMap) qaxVar2.z.d, l, -1L);
                if (l2.longValue() != -1) {
                    qaxVar2.o = l2.longValue();
                }
                break;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                defpackage.qax qaxVar3 = (defpackage.qax) this.a;
                qaxVar3.e.p((aeun) obj, ruc.aI);
                qaxVar3.s = j$.util.Optional.empty();
                break;
            case 15:
                ((defpackage.qax) this.a).e.p((aeun) obj, ruc.aJ);
                break;
            case 16:
                amnr amnrVar = (amnr) obj;
                akzx akzxVar2 = (akzx) this.a;
                akzxVar2.u();
                defpackage.amqp amqpVar = (defpackage.amqp) akzxVar2.b;
                defpackage.amqp amqpVar2 = defpackage.amqp.a;
                j$.util.Objects.requireNonNull(amnrVar);
                amqpVar.i = amnrVar;
                amqpVar.b |= 64;
                break;
            case 17:
                amtg amtgVar = (amtg) obj;
                akzx akzxVar3 = (akzx) this.a;
                akzxVar3.u();
                defpackage.amqp amqpVar3 = (defpackage.amqp) akzxVar3.b;
                defpackage.amqp amqpVar4 = defpackage.amqp.a;
                j$.util.Objects.requireNonNull(amtgVar);
                amqpVar3.h = amtgVar;
                amqpVar3.b |= 32;
                break;
            case 18:
                int iIntValue = ((java.lang.Integer) obj).intValue();
                akzx akzxVar4 = (akzx) this.a;
                akzxVar4.u();
                ampu ampuVar = akzxVar4.b;
                ampu ampuVar2 = ampu.a;
                ampuVar.b |= 2;
                ampuVar.d = iIntValue;
                break;
            case 19:
                int iIntValue2 = ((java.lang.Integer) obj).intValue();
                akzx akzxVar5 = (akzx) this.a;
                akzxVar5.u();
                ampu ampuVar3 = akzxVar5.b;
                ampu ampuVar4 = ampu.a;
                ampuVar3.b |= 1;
                ampuVar3.c = iIntValue2;
                break;
            default:
                int iIntValue3 = ((java.lang.Integer) obj).intValue();
                akzx akzxVar6 = (akzx) this.a;
                akzxVar6.u();
                ampu ampuVar5 = akzxVar6.b;
                ampu ampuVar6 = ampu.a;
                ampuVar5.b |= 4;
                ampuVar5.e = iIntValue3;
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
