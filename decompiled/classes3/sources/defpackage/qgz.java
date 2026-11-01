package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class qgz implements java.util.function.Consumer {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ qgz(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v54, types: [android.view.View$OnTouchListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v40, types: [java.lang.Object, java.util.Map$Entry] */
    /* JADX WARN: Type inference failed for: r6v21, types: [java.lang.Object, usa] */
    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object obj) {
        int i = 20;
        int i2 = 5;
        switch (this.$cid) {
            case 0:
                defpackage.qfj qfjVar = (defpackage.qfj) obj;
                defpackage.qhj qhjVar = (defpackage.qhj) this.a;
                qhjVar.a().setEnabled(false);
                qhjVar.c().setEnabled(false);
                java.lang.String string = qhjVar.l.z().getResources().getString(((ahoz) this.b).c);
                defpackage.qfd qfdVar = qfjVar.d;
                defpackage.qfd.a.b().l("com/android/dialer/incall/rtt/service/RttCallMessageSender", "sendEmergencyMessage", 167, "RttCallMessageSender.java").v("sendEmergencyMessage");
                qhjVar.g.i(defpackage.zoe.N(ahrv.g(ahrv.g(qfdVar.d.c()).i(new defpackage.phd(qfdVar, string, 6), qfdVar.c)).h(new defpackage.phr(qfjVar, i), qfjVar.c)), qhjVar.I);
                return;
            case 1:
                defpackage.qfj qfjVar2 = (defpackage.qfj) obj;
                if (((defpackage.qhq) this.a).a) {
                    agsm.i(606, ((defpackage.qhj) this.b).K.c(), "Failed to suppress Rtt Merge Dialog", new java.lang.Object[0]);
                }
                qfjVar2.b();
                return;
            case 2:
                defpackage.qfz qfzVar = (defpackage.qfz) this.b;
                if (j$.util.Objects.equals((java.lang.String) obj, qfzVar.c)) {
                    return;
                }
                java.lang.Object obj2 = this.a;
                aimz aimzVar = defpackage.qhj.a;
                aimzVar.b().l("com/android/dialer/incall/rtt/ui/RttChatFragmentPeer", "clearEditTextOnCallSwap", 316, "RttChatFragmentPeer.java").v("Clearing RTT editText due to new call.");
                defpackage.qhj qhjVar2 = (defpackage.qhj) obj2;
                qhjVar2.i();
                if ((qfzVar.b & 16777216) != 0) {
                    aimzVar.b().l("com/android/dialer/incall/rtt/ui/RttChatFragmentPeer", "clearEditTextOnCallSwap", 320, "RttChatFragmentPeer.java").v("Restoring RTT editText from unfinished message.");
                    defpackage.qgp qgpVar = qfzVar.z;
                    if (qgpVar == null) {
                        qgpVar = defpackage.qgp.a;
                    }
                    qhjVar2.k(qgpVar.c);
                    return;
                }
                return;
            case 3:
                aooh.f(((qmt) this.a).e, "context");
                android.graphics.Bitmap bitmap = ((defpackage.qir) obj).b.a;
                if (bitmap == null) {
                    throw new java.lang.IllegalStateException("Required value was null.");
                }
                java.lang.Object obj3 = this.b;
                android.graphics.drawable.Icon iconCreateWithBitmap = android.graphics.drawable.Icon.createWithBitmap(bitmap);
                aooh.c(iconCreateWithBitmap);
                ((android.app.Notification.Builder) obj3).setLargeIcon(iconCreateWithBitmap);
                return;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                j$.util.Optional optionalOfNullable = j$.util.Optional.ofNullable(((defpackage.qjd) this.a).j);
                aooh.e(optionalOfNullable, "ofNullable(...)");
                defpackage.qgz qgzVar = new defpackage.qgz((heq) obj, this.b, i2, null);
                if (true == optionalOfNullable.isPresent()) {
                    java.lang.Object obj4 = optionalOfNullable.get();
                    java.lang.Object obj5 = qgzVar.a;
                    java.lang.Object obj6 = qgzVar.b;
                    defpackage.pdv pdvVar = (defpackage.pdv) obj4;
                    if (((pdvVar.b == 2 ? (defpackage.pdu) pdvVar.c : defpackage.pdu.a).b & 8) != 0) {
                        android.net.Uri uriG = ((heq) obj5).g((pdvVar.b == 2 ? (defpackage.pdu) pdvVar.c : defpackage.pdu.a).f);
                        qmt.a.b().l("com/android/dialer/incall/statusbarnotification/ui/StatusBarNotifier", "updateNotification", 573, "StatusBarNotifier.java").v("Setting call background image uri for Android Auto");
                        ((android.os.Bundle) obj6).putParcelable("car_app_call_background_image_uri", uriG);
                        return;
                    }
                    return;
                }
                return;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                defpackage.pdv pdvVar2 = (defpackage.pdv) obj;
                if (((pdvVar2.b == 2 ? (defpackage.pdu) pdvVar2.c : defpackage.pdu.a).b & 8) != 0) {
                    defpackage.pdu pduVar = pdvVar2.b == 2 ? (defpackage.pdu) pdvVar2.c : defpackage.pdu.a;
                    java.lang.Object obj7 = this.b;
                    android.net.Uri uriG2 = ((heq) this.a).g(pduVar.f);
                    qmt.a.b().l("com/android/dialer/incall/statusbarnotification/ui/StatusBarNotifier", "updateNotification", 573, "StatusBarNotifier.java").v("Setting call background image uri for Android Auto");
                    ((android.os.Bundle) obj7).putParcelable("car_app_call_background_image_uri", uriG2);
                    return;
                }
                return;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                defpackage.qjd qjdVar = (defpackage.qjd) obj;
                if (qmt.j(qjdVar)) {
                    defpackage.qjd qjdVar2 = (defpackage.qjd) this.b;
                    if (qjdVar.b.equals(qjdVar2.b)) {
                        java.lang.Object obj8 = this.a;
                        defpackage.qin qinVar = qjdVar2.e;
                        java.lang.String string2 = qinVar.a().toString();
                        defpackage.qin qinVar2 = qjdVar.e;
                        if (!string2.equals(qinVar2.a().toString())) {
                            ((qmt) obj8).n.o(rmx.cC);
                        }
                        if (qinVar.c.toString().contentEquals(qinVar2.c)) {
                            return;
                        }
                        ((qmt) obj8).n.o(rmx.cD);
                        return;
                    }
                    return;
                }
                return;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                defpackage.qjd qjdVar3 = (defpackage.qjd) obj;
                boolean zJ = qmt.j(qjdVar3);
                java.lang.Object obj9 = this.b;
                if (zJ && qjdVar3.b.equals(((defpackage.qjd) obj9).b)) {
                    return;
                }
                ((qmt) this.a).B.i(((defpackage.qjd) obj9).b).b(mce.am);
                return;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                if (((defpackage.rex) obj) == defpackage.rex.a) {
                    ((defpackage.rfc) this.b).a((j$.util.Optional) this.a);
                    return;
                }
                return;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                ((sqn) this.a.getKey()).h((akzx) this.b, obj);
                return;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                java.lang.Object obj10 = ((ucm) obj).b;
                java.lang.String str = ((defpackage.tkd) this.b).am;
                akzx akzxVarM = defpackage.usb.a.m();
                com.android.dialer.timekeeper.histogram.HistogramView histogramView = (com.android.dialer.timekeeper.histogram.HistogramView) this.a;
                int iS = histogramView.u.isPresent() ? ((defpackage.abtr) histogramView.u.orElseThrow()).s(2) : 0;
                akzxVarM.u();
                defpackage.usb usbVar = (defpackage.usb) akzxVarM.b;
                usbVar.b |= 4;
                usbVar.e = iS;
                int iS2 = histogramView.u.isPresent() ? ((defpackage.abtr) histogramView.u.orElseThrow()).s(3) : 0;
                akzxVarM.u();
                defpackage.usb usbVar2 = (defpackage.usb) akzxVarM.b;
                usbVar2.b |= 8;
                usbVar2.f = iS2;
                int iS3 = histogramView.u.isPresent() ? ((defpackage.abtr) histogramView.u.orElseThrow()).s(4) : 0;
                akzxVarM.u();
                defpackage.usb usbVar3 = (defpackage.usb) akzxVarM.b;
                usbVar3.b |= 16;
                usbVar3.g = iS3;
                ((defpackage.abtr) obj10).u(5, str, (defpackage.usb) akzxVarM.p());
                return;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                ((com.android.dialer.timekeeper.histogram.HistogramView) this.a).onRestoreInstanceState((android.os.Parcelable) obj);
                ((defpackage.tkd) this.b).an = j$.util.Optional.empty();
                return;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                java.lang.Object obj11 = this.a;
                ?? r0 = this.b;
                ucm ucmVar = (ucm) obj;
                defpackage.tkd tkdVar = (defpackage.tkd) r0;
                if (!j$.util.Objects.equals(tkdVar.am, obj11)) {
                    tkdVar.f();
                }
                aw awVar = (aw) r0;
                com.android.dialer.timekeeper.histogram.HistogramView histogramView2 = (com.android.dialer.timekeeper.histogram.HistogramView) awVar.Q.findViewById(2131429282);
                com.android.dialer.timekeeper.histogram.HistogramView histogramView3 = histogramView2;
                if (histogramView2 == null) {
                    com.android.dialer.timekeeper.histogram.HistogramView histogramView4 = (com.android.dialer.timekeeper.histogram.HistogramView) ((android.view.ViewStub) awVar.Q.findViewById(2131429283)).inflate();
                    histogramView4.setOnTouchListener(r0);
                    histogramView3 = histogramView4;
                }
                java.lang.String str2 = (java.lang.String) obj11;
                int length = str2.replaceAll("[^0-9]", "").length();
                if (length == 10 || length == 11) {
                    tkdVar.ap.b(awVar.z(), ucmVar.c.a(str2), new defpackage.tjz(tkdVar, histogramView3, ucmVar), new jox(20));
                    return;
                }
                histogramView3.m(j$.util.Optional.empty(), (defpackage.vqu) ucmVar.a, (defpackage.abtr) ucmVar.b);
                return;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    defpackage.uea.b.b().l("com/android/dialer/spam/composite/CompositeSpamStatus", "mergeStirShakenAndWriteCallIsSampledinSpamMetadata", 154, "CompositeSpamStatus.java").v("setting verdict source is disabled.");
                    return;
                }
                java.lang.Object obj12 = this.b;
                java.lang.Object obj13 = this.a;
                defpackage.uea.b.b().l("com/android/dialer/spam/composite/CompositeSpamStatus", "mergeStirShakenAndWriteCallIsSampledinSpamMetadata", 150, "CompositeSpamStatus.java").v("setting verdict source enabled, writing source of spam verdict");
                ((uil) obj13).c((defpackage.udl) obj12);
                return;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                android.net.Uri uri = android.net.Uri.parse((java.lang.String) obj);
                android.content.Context context = (android.content.Context) this.b;
                android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.android.dialer.voicemail.notification.receivers.VoicemailNotificationDismissalReceiver_Receiver.class);
                intent.setAction("com.android.dialer.voicemail.notification.receivers.ACTION_MARK_SINGLE_NEW_VOICEMAIL_AS_OLD");
                intent.setData(uri);
                ((dva) this.a).j(defpackage.afap.c(context, 0, intent, 67108864));
                return;
            case 15:
                ((defpackage.ajzk) this.b).e((java.lang.String) this.a, java.nio.ByteBuffer.wrap(((java.lang.String) obj).getBytes()));
                return;
            case 16:
                defpackage.sot sotVar = (defpackage.sot) obj;
                int iC = sotVar.d;
                if (iC == 0) {
                    iC = urg.c(((defpackage.vrh) this.a).b, android.R.attr.textColorSecondary);
                }
                android.widget.TextView textView = (android.widget.TextView) this.b;
                textView.setTextColor(iC);
                textView.setText(sotVar.c);
                textView.setVisibility(0);
                return;
            case 17:
                java.lang.Object obj14 = this.b;
                ahrv ahrvVarG = ahrv.g(((vda) obj).a((android.telecom.PhoneAccountHandle) obj14));
                vuu vuuVar = new vuu(obj14, 5);
                defpackage.vvb vvbVar = (defpackage.vvb) this.a;
                vvbVar.f.g(ahrvVarG.i(vuuVar, vvbVar.e), 10L, java.util.concurrent.TimeUnit.SECONDS);
                return;
            case 18:
                vda vdaVar = (vda) obj;
                java.lang.Object obj15 = this.b;
                defpackage.vvb vvbVar2 = (defpackage.vvb) obj15;
                vvbVar2.c.o(rmx.oi);
                android.telecom.PhoneAccountHandle phoneAccountHandleK = ttj.k((vzi) this.a);
                if (phoneAccountHandleK == null) {
                    defpackage.vvb.a.d().l("com/android/dialer/voicemail/tab/impl/dataservice/impl/VoicemailErrorActionsImpl", "startVvmPackage", 306, "VoicemailErrorActionsImpl.java").v("Invalid PhoneAccountHandle in VoicemailStatus for startVvmPackage");
                    return;
                }
                ahrv ahrvVarG2 = ahrv.g(vdaVar.a(phoneAccountHandleK));
                vuu vuuVar2 = new vuu(phoneAccountHandleK, 3);
                ajct ajctVar = vvbVar2.e;
                agsm.i(1012, ahrvVarG2.i(vuuVar2, ajctVar).i(new vuu(obj15, 4), ajctVar), "Failed to open VVM carrier app.", new java.lang.Object[0]);
                return;
            case 19:
                java.lang.Object obj16 = this.b;
                ahrv ahrvVarG3 = ahrv.g(((vda) obj).a((android.telecom.PhoneAccountHandle) obj16));
                vuu vuuVar3 = new vuu(obj16, 2);
                defpackage.vvb vvbVar3 = (defpackage.vvb) this.a;
                vvbVar3.f.g(ahrvVarG3.i(vuuVar3, vvbVar3.e), 10L, java.util.concurrent.TimeUnit.SECONDS);
                return;
            default:
                if (((alad) this.b).equals((defpackage.vtt) obj)) {
                    return;
                }
                j$.util.Optional optional = ((defpackage.vxq) this.a).J;
                if (true != optional.isPresent()) {
                    return;
                }
                ((android.view.ActionMode) optional.get()).finish();
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

    public /* synthetic */ qgz(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }
}
