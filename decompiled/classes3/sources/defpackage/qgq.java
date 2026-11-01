package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class qgq implements android.view.View.OnClickListener {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ qgq(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r7v64, types: [ajcq, java.lang.Object] */
    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        int i = 0;
        switch (this.$cid) {
            case 0:
                ((defpackage.qgs) this.a).a.e((defpackage.zmw) this.b);
                break;
            case 1:
                java.lang.Object obj = this.b;
                defpackage.yta ytaVar = defpackage.yta.a;
                defpackage.yta ytaVar2 = ((defpackage.ysc) obj).a;
                java.lang.Object obj2 = this.a;
                if (ytaVar2 == ytaVar) {
                    oji.a.b().l("com/android/dialer/externals/aicore/ui/DialerAiCorePreferenceViewPeer", "onAttachedToWindow$<anonymous>$<anonymous>", 104, "DialerAiCorePreferenceViewPeer.kt").v("navigating to playstore AiCore app");
                    ((oji) obj2).e("com.google.android.aicore");
                } else if (ytaVar2 == defpackage.yta.d) {
                    oji.a.b().l("com/android/dialer/externals/aicore/ui/DialerAiCorePreferenceViewPeer", "onAttachedToWindow$<anonymous>$<anonymous>", 107, "DialerAiCorePreferenceViewPeer.kt").v("downloading feature model");
                    oji ojiVar = (oji) obj2;
                    ojiVar.e.c(ojiVar.d());
                }
                break;
            case 2:
                java.lang.Object obj3 = this.a;
                java.lang.Object obj4 = this.b;
                j$.util.Optional optionalF = ((defpackage.qhj) obj4).f();
                defpackage.qgz qgzVar = new defpackage.qgz(obj4, obj3, i, null);
                if (true == optionalF.isPresent()) {
                    java.lang.Object obj5 = optionalF.get();
                    java.lang.Object obj6 = qgzVar.a;
                    java.lang.Object obj7 = qgzVar.b;
                    defpackage.qfj qfjVar = (defpackage.qfj) obj5;
                    defpackage.qhj qhjVar = (defpackage.qhj) obj6;
                    qhjVar.a().setEnabled(false);
                    qhjVar.c().setEnabled(false);
                    java.lang.String string = qhjVar.l.z().getResources().getString(((ahoz) obj7).c);
                    defpackage.qfd qfdVar = qfjVar.d;
                    defpackage.qfd.a.b().l("com/android/dialer/incall/rtt/service/RttCallMessageSender", "sendEmergencyMessage", 167, "RttCallMessageSender.java").v("sendEmergencyMessage");
                    qhjVar.g.i(defpackage.zoe.N(ahrv.g(ahrv.g(qfdVar.d.c()).i(new defpackage.phd(qfdVar, string, 6), qfdVar.c)).h(new defpackage.phr(qfjVar, 20), qfjVar.c)), qhjVar.I);
                }
                break;
            case 3:
                if (((defpackage.qhv) this.b).k) {
                    j$.util.Optional optionalF2 = ((defpackage.qgw) this.a).y().f();
                    if (true == optionalF2.isPresent()) {
                        defpackage.qfj qfjVar2 = (defpackage.qfj) optionalF2.get();
                        defpackage.qfj.a.b().l("com/android/dialer/incall/rtt/service/RttChatController", "onSwapCallClicked", 139, "RttChatController.java").v("onSwapCallClicked");
                        qfjVar2.d();
                        j$.util.Optional optionalG = qfjVar2.n.g();
                        if (true == optionalG.isPresent()) {
                            agsm.i(602, ((defpackage.qfh) ((defpackage.apqr) optionalG.get()).a(defpackage.qfh.class)).cq().l(), "failed to unhold the call", new java.lang.Object[0]);
                        }
                    }
                }
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                vwb vwbVar = (vwb) this.b;
                j$.util.Optional optionalD = ((defpackage.rhx) vwbVar.a).d(((defpackage.rfo) ((j$.util.Optional) vwbVar.c).orElseThrow()).a);
                defpackage.qst qstVar = new defpackage.qst(this.a, 18);
                if (true == optionalD.isPresent()) {
                    ((defpackage.rfa) optionalD.get()).c(((defpackage.rej) qstVar.a).a, defpackage.rex.a);
                }
                break;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                ((defpackage.thn) this.a).w.onClick(view);
                ((defpackage.tja) this.b).b();
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                ((defpackage.tie) this.a).t.onClick(view);
                ((defpackage.tja) this.b).b();
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                ((defpackage.tih) this.a).w.onClick(view);
                ((defpackage.tja) this.b).b();
                break;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                ((defpackage.tio) this.a).t.onClick(view);
                ((defpackage.tja) this.b).b();
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                ((defpackage.umr) this.a).aU((defpackage.upl) this.b);
                break;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                ((defpackage.umr) this.a).aV((defpackage.upl) this.b);
                break;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                ((defpackage.umr) this.a).aW((defpackage.upl) this.b);
                break;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                ((defpackage.umr) this.a).aW((defpackage.upl) this.b);
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                ((defpackage.umr) this.a).aW((defpackage.upl) this.b);
                break;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                ((com.android.dialer.timekeeper.histogram.HistogramView) this.a).i();
                ((defpackage.abtr) this.b).t(4);
                break;
            case 15:
                defpackage.uvo uvoVar = (defpackage.uvo) this.a;
                agsm.i(950, uvoVar.m.e(), "Failed to cancel notification", new java.lang.Object[0]);
                defpackage.utu utuVar = uvoVar.f;
                long j = utuVar.c;
                int iAP = a.aP(utuVar.f);
                int i2 = iAP != 0 ? iAP : 1;
                defpackage.ulw ulwVar = uvoVar.l;
                java.lang.Object obj8 = this.b;
                agsm.i(951, ulwVar.b(j, i2), "Could not mark one or more features as survey ineligible", new java.lang.Object[0]);
                defpackage.uwp uwpVar = uvoVar.d;
                defpackage.uwp.a.b().l("com/android/dialer/transcriptaudiofeedback/impl/metrics/FeedbackMetricsLogger", "logUserClickedHelpUsImproveFromTranscriptView", 112, "FeedbackMetricsLogger.java").v("logging user pressed help us improve banner");
                uwpVar.b((java.lang.String) obj8, new lct(19));
                defpackage.uvz.aU(utuVar).r(uvoVar.c.I(), "help_us_improve_dialog");
                break;
            case 16:
                ((defpackage.vxq) this.b).A(((defpackage.vub) this.a).d.b);
                break;
            case 17:
                ((defpackage.vxq) this.b).A(((defpackage.vub) this.a).e.b);
                break;
            case 18:
                defpackage.vxq.a.b().l("com/android/dialer/voicemail/tab/impl/ui/VisualVoicemailFragmentPeer", "deleteExpandedVoicemail", 1980, "VisualVoicemailFragmentPeer.java").v("undoing delete");
                defpackage.vxq vxqVar = (defpackage.vxq) this.a;
                vxqVar.l(mce.dL);
                this.b.cancel(false);
                vxqVar.v();
                break;
            case 19:
                ((defpackage.vyc) this.b).d.setVisibility(8);
                kiu kiuVar = ((defpackage.uzo) this.a).d;
                if (kiuVar == null) {
                    kiuVar = kiu.a;
                }
                ahvr.j(new defpackage.vxx(kiuVar.d, true), view);
                break;
            default:
                ((defpackage.vyc) this.b).d.setVisibility(8);
                kiu kiuVar2 = ((defpackage.uzo) this.a).d;
                if (kiuVar2 == null) {
                    kiuVar2 = kiu.a;
                }
                ahvr.j(new defpackage.vxx(kiuVar2.d, false), view);
                break;
        }
    }

    public /* synthetic */ qgq(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
