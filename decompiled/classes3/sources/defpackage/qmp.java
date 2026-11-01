package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class qmp implements java.util.function.Consumer {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ qmp(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object obj) {
        int i = 7;
        byte[] bArr = null;
        switch (this.$cid) {
            case 0:
                ((android.app.Notification.Builder) this.a).setWhen(((java.lang.Long) obj).longValue());
                return;
            case 1:
                ((qmt) this.a).o.set(j$.util.Optional.of(((defpackage.apqr) obj).b));
                return;
            case 2:
                j$.util.Optional optionalH = ((qmt) this.a).h((java.lang.String) obj);
                if (true == optionalH.isPresent()) {
                    defpackage.qko qkoVar = (defpackage.qko) optionalH.get();
                    java.util.concurrent.atomic.AtomicReference atomicReference = qkoVar.h;
                    if (((j$.util.Optional) atomicReference.get()).isPresent()) {
                        return;
                    }
                    atomicReference.set(j$.util.Optional.of(qkoVar.l.c(new defpackage.qfe(qkoVar, 7), ((java.lang.Long) qkoVar.j.a()).longValue(), java.util.concurrent.TimeUnit.MILLISECONDS)));
                    return;
                }
                return;
            case 3:
                aimw aimwVarL = defpackage.qko.a.b().l("com/android/dialer/incall/statusbarnotification/service/StatusBarNotificationController", "onActionButtonAddedToNotification", 137, "StatusBarNotificationController.java");
                defpackage.qid qidVar = ((defpackage.qib) this.a).a;
                aimwVarL.y("Action button created: %s", qidVar.name());
                aoin aoinVar = (aoin) ((defpackage.qko) obj).c.get(qidVar);
                if (aoinVar == null || aoinVar.a() == null) {
                    return;
                }
                ((mwh) aoinVar.a()).a();
                return;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                defpackage.qjd qjdVar = (defpackage.qjd) obj;
                if (qmt.j(qjdVar)) {
                    java.lang.Object obj2 = this.a;
                    j$.util.Optional optional = ((qmt) obj2).p;
                    defpackage.qgz qgzVar = new defpackage.qgz(obj2, qjdVar, i, bArr);
                    if (true == optional.isPresent()) {
                        java.lang.Object obj3 = optional.get();
                        java.lang.Object obj4 = qgzVar.a;
                        java.lang.Object obj5 = qgzVar.b;
                        defpackage.qjd qjdVar2 = (defpackage.qjd) obj3;
                        if (qmt.j(qjdVar2) && qjdVar2.b.equals(((defpackage.qjd) obj5).b)) {
                            return;
                        }
                        ((qmt) obj4).B.i(((defpackage.qjd) obj5).b).b(mce.am);
                        return;
                    }
                    return;
                }
                return;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                defpackage.qjd qjdVar3 = (defpackage.qjd) obj;
                qmt qmtVar = (qmt) this.a;
                aeun aeunVar = (aeun) ((j$.util.Optional) qmtVar.l.getAndSet(j$.util.Optional.empty())).orElse((java.lang.Object) null);
                if (aeunVar != null) {
                    defpackage.qil qilVar = qjdVar3.u;
                    j$.util.Objects.requireNonNull(qilVar);
                    j$.util.Objects.checkIndex(0, 5);
                    if (qilVar != null) {
                        if (qilVar instanceof defpackage.qip) {
                            qmtVar.k.q(aeunVar, qmt.b, rub.b);
                            return;
                        } else if (qilVar instanceof defpackage.qiz) {
                            qmtVar.k.q(aeunVar, qmt.c, rub.b);
                            return;
                        } else if (qilVar instanceof defpackage.qja) {
                            qmtVar.k.q(aeunVar, qmt.d, rub.b);
                            return;
                        } else if (qilVar instanceof defpackage.qjf) {
                            return;
                        }
                    }
                    throw new java.lang.RuntimeException(null, null);
                }
                return;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                j$.util.Optional optionalH2 = ((qmt) this.a).h((java.lang.String) obj);
                if (true == optionalH2.isPresent()) {
                    defpackage.qko qkoVar2 = (defpackage.qko) optionalH2.get();
                    if (qkoVar2.i.getAndSet(true)) {
                        return;
                    }
                    qkoVar2.r.a(qbc.dL);
                    return;
                }
                return;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                defpackage.qjd qjdVar4 = (defpackage.qjd) obj;
                boolean zJ = qmt.j(qjdVar4);
                java.lang.Object obj6 = this.a;
                if (zJ) {
                    if (qjdVar4.a == defpackage.qit.DOBBY && qmt.k(qjdVar4) && qjdVar4.t) {
                        ((qmt) obj6).e().b(mce.cS);
                        return;
                    } else {
                        ((qmt) obj6).e().b(mce.ah);
                        return;
                    }
                }
                defpackage.qit qitVar = qjdVar4.a;
                if (qitVar == defpackage.qit.DOBBY && qmt.l(qjdVar4) && !qjdVar4.t) {
                    ((qmt) obj6).e().b(mce.cR);
                    return;
                } else {
                    if (qitVar == defpackage.qit.REVELIO && qmt.l(qjdVar4)) {
                        ((qmt) obj6).e().b(mce.cT);
                        return;
                    }
                    return;
                }
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                defpackage.qjd qjdVar5 = (defpackage.qjd) obj;
                if (qmt.j(qjdVar5)) {
                    j$.util.Optional optionalE = ((qmt) this.a).w.e(qjdVar5.b);
                    if (true == optionalE.isPresent()) {
                        defpackage.qax qaxVarAh = ((defpackage.qmr) ((defpackage.apqr) optionalE.get()).a(defpackage.qmr.class)).ah();
                        qaxVarAh.d.isPresent();
                        if (qaxVarAh.r == -1) {
                            aazc aazcVar = qaxVarAh.A;
                            qaxVarAh.r = android.os.SystemClock.elapsedRealtime();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                j$.util.Optional optionalH3 = ((qmt) this.a).h((java.lang.String) obj);
                if (true == optionalH3.isPresent()) {
                    ((defpackage.qko) optionalH3.get()).r.c(qbc.dP);
                    return;
                }
                return;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                ((android.app.Notification.Builder) this.a).setContentTitle((java.lang.CharSequence) obj);
                return;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                ((defpackage.qnd) this.a).b((defpackage.zcy) obj);
                return;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                defpackage.amsc amscVar = (defpackage.amsc) obj;
                akzx akzxVar = (akzx) this.a;
                akzxVar.u();
                amow amowVar = akzxVar.b;
                amow amowVar2 = amow.a;
                j$.util.Objects.requireNonNull(amscVar);
                amowVar.aa = amscVar;
                amowVar.c |= 8388608;
                return;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                int i2 = com.android.dialer.incall.video.ui.VideoCheckableLabeledButton.h;
                ((android.view.View.OnClickListener) obj).onClick((android.view.View) this.a);
                return;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                ((defpackage.qtq) obj).e(((defpackage.qtd) this.a).e());
                return;
            case 15:
                ((defpackage.qtq) obj).e(((defpackage.qtd) this.a).d());
                return;
            case 16:
                defpackage.qrv qrvVar = (defpackage.qrv) obj;
                aihd aihdVar = defpackage.qtd.a;
                aigf aigfVarK = qrvVar.u.k();
                defpackage.qmy qmyVar = (defpackage.qmy) this.a;
                defpackage.qmz qmzVar = qmyVar.a;
                aoin aoinVar2 = (aoin) aigfVarK.get(qmzVar);
                if (aoinVar2 == null) {
                    throw new java.lang.IllegalStateException(java.lang.String.format("Listener for %s not injected to CallScopeComponent", qmzVar.name()));
                }
                defpackage.qmw qmwVar = qmyVar.e;
                qrvVar.e.a();
                ((defpackage.qmx) aoinVar2.a()).a(qmwVar);
                return;
            case 17:
                aihd aihdVar2 = defpackage.qtd.a;
                ((defpackage.qtq) obj).e((android.view.TextureView) this.a);
                return;
            case 18:
                ((defpackage.qtd) this.a).w((defpackage.qth) obj);
                return;
            case 19:
                ((defpackage.qtd) this.a).x(((defpackage.qqr) obj).h.a);
                return;
            default:
                defpackage.qrv qrvVar2 = (defpackage.qrv) obj;
                int iA = ((defpackage.qtd) this.a).a();
                aimz aimzVar = defpackage.qrv.a;
                aimzVar.b().l("com/android/dialer/incall/video/service/VideoScreenController", "reportScreenOrientation", 315, "VideoScreenController.java").w("newRotationDegrees: %d", iA);
                aimzVar.b().l("com/android/dialer/incall/video/service/VideoScreenController", "reportScreenOrientation", 316, "VideoScreenController.java").y("currentRotationDegrees: %s", qrvVar2.m.isPresent() ? java.lang.Integer.valueOf(qrvVar2.m.getAsInt()) : "empty");
                if (qrvVar2.m.equals(j$.util.OptionalInt.of(iA))) {
                    aimzVar.b().l("com/android/dialer/incall/video/service/VideoScreenController", "reportScreenOrientation", 320, "VideoScreenController.java").v("current rotation and new rotation match");
                    return;
                }
                qrvVar2.r.d(iA);
                j$.util.OptionalInt optionalInt = qrvVar2.m;
                j$.util.Optional optionalEmpty = !optionalInt.isPresent() ? j$.util.Optional.empty() : j$.util.Optional.of(defpackage.qrv.a(optionalInt.getAsInt()));
                defpackage.qru qruVarA = defpackage.qrv.a(iA);
                boolean zIsPresent = optionalEmpty.isPresent();
                int iOrdinal = qruVarA.ordinal();
                if (iOrdinal == 0) {
                    qrvVar2.t.a(!zIsPresent ? qbc.bY : qbc.bW);
                } else if (iOrdinal == 1) {
                    qrvVar2.t.a(!zIsPresent ? qbc.bX : qbc.bV);
                }
                qrvVar2.m = j$.util.OptionalInt.of(iA);
                aimzVar.b().l("com/android/dialer/incall/video/service/VideoScreenController", "reportScreenOrientation", 344, "VideoScreenController.java").w("currentRotationDegrees set to: %d", qrvVar2.m.getAsInt());
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
