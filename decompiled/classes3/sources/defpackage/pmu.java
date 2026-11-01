package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class pmu implements aonj {
    private final /* synthetic */ int $cid;

    public /* synthetic */ pmu(int i) {
        this.$cid = i;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00da A[Catch: all -> 0x00f8, TRY_LEAVE, TryCatch #0 {all -> 0x00f8, blocks: (B:11:0x0048, B:13:0x0055, B:15:0x0069, B:17:0x007f, B:18:0x0099, B:21:0x009f, B:24:0x00ac, B:25:0x00da), top: B:63:0x0048, inners: #2 }] */
    public final java.lang.Object a(java.lang.Object obj) {
        switch (this.$cid) {
            case 0:
                android.widget.Chronometer chronometer = (android.widget.Chronometer) obj;
                aooh.f(chronometer, "it");
                chronometer.setTextColor(chronometer.getContext().getColor(2131099860));
                return aojh.a;
            case 1:
                android.widget.Chronometer chronometer2 = (android.widget.Chronometer) obj;
                aooh.f(chronometer2, "it");
                chronometer2.stop();
                return aojh.a;
            case 2:
                android.widget.ImageView imageView = (android.widget.ImageView) obj;
                aooh.f(imageView, "it");
                imageView.setImageTintList(android.content.res.ColorStateList.valueOf(imageView.getContext().getColor(2131099860)));
                return aojh.a;
            case 3:
                android.widget.TextView textView = (android.widget.TextView) obj;
                aooh.f(textView, "it");
                textView.setTextColor(urg.c(textView.getContext(), android.R.attr.textColorPrimary));
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                android.widget.TextView textView2 = (android.widget.TextView) obj;
                aooh.f(textView2, "it");
                textView2.setVisibility(0);
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                android.widget.TextView textView3 = (android.widget.TextView) obj;
                aooh.f(textView3, "it");
                textView3.setSelected(true);
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                android.widget.TextView textView4 = (android.widget.TextView) obj;
                aooh.f(textView4, "it");
                textView4.setSelected(true);
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                android.widget.ViewAnimator viewAnimator = (android.widget.ViewAnimator) obj;
                aooh.f(viewAnimator, "it");
                viewAnimator.setVisibility(0);
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                android.widget.TextView textView5 = (android.widget.TextView) obj;
                aooh.f(textView5, "it");
                textView5.setVisibility(0);
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                return ((android.telecom.DisconnectCause) obj).getLabel();
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                return java.lang.Boolean.valueOf(((defpackage.pzp) obj) == defpackage.pzp.VOICE_SCREEN);
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                return afsq.cp((diq) obj);
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                return afsq.cp((diq) obj);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                return afsq.cc((diq) obj);
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                aooh.f((defpackage.qug) obj, "it");
                return aojh.a;
            case 15:
                java.lang.Boolean bool = (java.lang.Boolean) obj;
                bool.booleanValue();
                return bool;
            case 16:
                return java.lang.Boolean.valueOf(((gpy) obj) instanceof gpy);
            case 17:
                defpackage.apqr apqrVar = (defpackage.apqr) obj;
                aooh.f(apqrVar, "callScope");
                defpackage.qax qaxVarAh = ((defpackage.qaj) apqrVar.a(defpackage.qaj.class)).ah();
                ahoq ahoqVarW = ahvr.W(571, "CallScopeLatencyTracker_onInCallFragmentFirstDrawn");
                try {
                    qaxVarAh.d.isPresent();
                    if (qaxVarAh.o == -1) {
                        aazc aazcVar = qaxVarAh.A;
                        qaxVarAh.o = android.os.SystemClock.elapsedRealtime();
                        if (qaxVarAh.y.a().size() == 1) {
                            ruc rucVar = qaxVarAh.e;
                            aenj aenjVar = ruc.aH;
                            rucVar.m(aenjVar);
                            j$.util.Optional optional = qaxVarAh.s;
                            defpackage.puo puoVar = new defpackage.puo(qaxVarAh, 14);
                            if (true == optional.isPresent()) {
                                java.lang.Object obj2 = optional.get();
                                java.lang.Object obj3 = puoVar.a;
                                ((defpackage.qax) obj3).e.p((aeun) obj2, ruc.aI);
                                ((defpackage.qax) obj3).s = j$.util.Optional.empty();
                            }
                            if (qaxVarAh.p != -1) {
                                try {
                                    da$.ExternalSyntheticApiModelOutline0.m(aenjVar.a, qaxVarAh.b.hashCode());
                                } catch (java.lang.IllegalStateException e) {
                                    defpackage.qax.a.d().i(zct.b).k(e).l("com/android/dialer/incall/latencyreport/CallScopeLatencyTracker", "onInCallFragmentFirstDrawn", 279, "CallScopeLatencyTracker.java").w("Failed to end trace section for AcceptOnAnswerScreenToInCallFragmentRenderingLatency with cookie: %d", qaxVarAh.b.hashCode());
                                }
                            }
                        } else {
                            qaxVarAh.e.b(ruc.aH);
                        }
                        break;
                    } else {
                        qaxVarAh.e.b(ruc.aH);
                    }
                    ahoqVarW.close();
                    ((defpackage.qaj) apqrVar.a(defpackage.qaj.class)).cp().c(qbc.c);
                    return aojh.a;
                } catch (java.lang.Throwable th) {
                    try {
                        ahoqVarW.close();
                        break;
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            case 18:
                return ((defpackage.qjj) aooc.ar((hkl) obj, defpackage.qjj.class)).aH();
            case 19:
                return java.lang.Integer.valueOf(((ted) obj).d);
            default:
                return ((defpackage.qil) obj).a();
        }
    }
}
