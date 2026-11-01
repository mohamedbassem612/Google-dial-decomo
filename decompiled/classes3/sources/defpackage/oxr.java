package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class oxr implements hru {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ oxr(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    public final void a(boolean z) {
        switch (this.$cid) {
            case 0:
                android.view.View view = (android.view.View) this.a;
                view.setPivotY(view.getHeight() / 2.0f);
                break;
            case 1:
                if (!z) {
                    java.lang.Object obj = this.a;
                    defpackage.oyc.a.b().l("com/android/dialer/incall/answer/method/ui/FlingUpDownAnswerMethodFragmentPeer", "onEntryAnimationDone", 913, "FlingUpDownAnswerMethodFragmentPeer.java").v("Swipe entry anim ends.");
                    defpackage.oyc oycVar = (defpackage.oyc) obj;
                    if (oycVar.o == 1) {
                        oycVar.o(2);
                    }
                }
                break;
            case 2:
                ((defpackage.oyc) this.a).i(z);
                break;
            case 3:
                ((defpackage.oyc) this.a).i(z);
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                defpackage.oyc oycVar2 = (defpackage.oyc) this.a;
                int i = oycVar2.p;
                if (i != 0) {
                    oycVar2.p = 0;
                    oycVar2.n = null;
                    oycVar2.o(i);
                }
                break;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                if (!android.os.Build.FINGERPRINT.equals("robolectric")) {
                    defpackage.oyc oycVar3 = (defpackage.oyc) this.a;
                    if (oycVar3.m != null && oycVar3.o == 2) {
                        if (oycVar3.l) {
                            oycVar3.h.isPresent();
                        }
                        oycVar3.m.start();
                        break;
                    }
                }
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                if (!z) {
                    defpackage.oyc oycVar4 = (defpackage.oyc) this.a;
                    oycVar4.c().setVisibility(8);
                    oycVar4.b().setVisibility(0);
                }
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                defpackage.oyf oyfVar = (defpackage.oyf) this.a;
                oyfVar.c = null;
                if (!z) {
                    oyfVar.b();
                }
                break;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                if (!z) {
                    java.lang.Object obj2 = this.a;
                    j$.util.Optional optional = ((defpackage.oyu) obj2).i;
                    defpackage.oys oysVar = new defpackage.oys(obj2, 2);
                    if (true == optional.isPresent()) {
                        ahvr.i(pez.al((defpackage.own) optional.get()), ((defpackage.oyu) oysVar.a).c);
                    }
                }
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                if (!z) {
                    java.lang.Object obj3 = this.a;
                    j$.util.Optional optional2 = ((defpackage.oyu) obj3).i;
                    defpackage.oys oysVar2 = new defpackage.oys(obj3, 0);
                    if (true == optional2.isPresent()) {
                        ahvr.i(pez.am((defpackage.own) optional2.get()), ((defpackage.oyu) oysVar2.a).c);
                    }
                }
                break;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                if (!z) {
                    java.lang.Object obj4 = this.a;
                    j$.util.Optional optional3 = ((defpackage.oyu) obj4).i;
                    defpackage.oys oysVar3 = new defpackage.oys(obj4, 3);
                    if (true == optional3.isPresent()) {
                        ahvr.i(pez.an((defpackage.own) optional3.get()), ((defpackage.oyu) oysVar3.a).c);
                    }
                }
                break;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                if (!z) {
                    ((defpackage.qhj) this.a).j();
                }
                break;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                defpackage.qso qsoVar = (defpackage.qso) this.a;
                qsoVar.j();
                qsoVar.h = j$.util.Optional.empty();
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                java.lang.Object obj5 = this.a;
                if (obj5 != null) {
                    ((defpackage.rap) obj5).h(new defpackage.qsu(obj5, 9));
                }
                break;
            default:
                if (!z) {
                    ((android.view.View) this.a).setVisibility(8);
                }
                break;
        }
    }
}
