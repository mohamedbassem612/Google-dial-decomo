package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wtm implements android.view.View.OnClickListener {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;

    public /* synthetic */ wtm(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        switch (this.$cid) {
            case 0:
                ((defpackage.wtk) this.a).t();
                return;
            case 1:
                j$.util.Optional optionalD = ((defpackage.wtk) this.a).d();
                if (true == optionalD.isPresent()) {
                    agsm.i(1075, ((defpackage.wky) optionalD.get()).z.f(), "Failed to disconnect.", new java.lang.Object[0]);
                    return;
                }
                return;
            case 2:
                defpackage.wtk wtkVar = (defpackage.wtk) this.a;
                if (wtkVar.x) {
                    wtkVar.g();
                    return;
                } else {
                    wtkVar.m(true);
                    return;
                }
            case 3:
                ((defpackage.wtk) this.a).s();
                return;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                ((defpackage.wtk) this.a).f();
                return;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                ((defpackage.wtk) this.a).r();
                defpackage.wtk.h((com.google.android.material.floatingactionbutton.FloatingActionButton) view);
                return;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                defpackage.xan xanVar = (defpackage.xan) this.a;
                defpackage.afpl afplVar = new defpackage.afpl((android.app.Activity) xanVar.d.G());
                defpackage.wzv wzvVar = xanVar.b;
                com.google.android.gms.googlehelp.GoogleHelp googleHelp = new com.google.android.gms.googlehelp.GoogleHelp((java.lang.String) wzvVar.a.a());
                googleHelp.q = android.net.Uri.parse((java.lang.String) wzvVar.b.a());
                com.google.android.gms.feedback.ThemeSettings themeSettings = new com.google.android.gms.feedback.ThemeSettings(3, 0);
                themeSettings.a = 3;
                googleHelp.s = themeSettings;
                afplVar.N(googleHelp.a());
                return;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                ((defpackage.abps) this.a).h.b.a();
                return;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                ((defpackage.abpr) this.a).b.a();
                return;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                ((defpackage.ackk) this.a).ak = true;
                return;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                java.lang.Object obj = this.a;
                ahpm ahpmVarA = ((defpackage.ackk) obj).b.a("TooltipFragment");
                try {
                    ((defpackage.ackk) obj).e = false;
                    ((defpackage.ackk) obj).ap.v(((defpackage.ackk) obj).al, 4);
                    ahpmVarA.close();
                    return;
                } catch (java.lang.Throwable th) {
                    try {
                        ahpmVarA.close();
                        break;
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                ((defpackage.ackm) this.a).a();
                return;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                android.view.View.OnClickListener onClickListener = ((defpackage.ackm) this.a).a.m;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                    return;
                }
                return;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                defpackage.aekj aekjVar = (defpackage.aekj) ((defpackage.aprf) this.a).a;
                aekjVar.g(view);
                aekjVar.i(false);
                return;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                defpackage.aekj aekjVar2 = (defpackage.aekj) this.a;
                aekjVar2.h.c.e(new adae(5), view);
                aekjVar2.q(true != aekjVar2.c ? 44 : 45);
                aekjVar2.i(!aekjVar2.c);
                return;
            case 15:
                ((android.widget.CheckBox) this.a).performClick();
                return;
            case 16:
                int i = com.google.android.libraries.surveys.internal.view.PlatformSystemInfoDialogFragment.a;
                ((cy) this.a).cancel();
                return;
            case 17:
                defpackage.afky afkyVar = (defpackage.afky) this.a;
                afkyVar.c.e = true;
                afjj afjjVarA = afkyVar.a();
                if (afjjVarA != null) {
                    aehj.b.r(afjjVarA);
                }
                afkyVar.i(afkyVar.d, afkyVar.k, afkyVar.h, afjz.l(afkyVar.f));
                afkyVar.h();
                return;
            case 18:
                defpackage.afky afkyVar2 = (defpackage.afky) this.a;
                afkyVar2.c.e = false;
                afjj afjjVarA2 = afkyVar2.a();
                if (afjjVarA2 != null) {
                    aehj.b.r(afjjVarA2);
                }
                afkyVar2.j(afkyVar2.d, afkyVar2.k, afkyVar2.h, afjz.l(afkyVar2.f));
                afkyVar2.i(afkyVar2.d, afkyVar2.k, afkyVar2.h, afjz.l(afkyVar2.f));
                afkyVar2.b.dismissAllowingStateLoss();
                return;
            case 19:
                int i2 = defpackage.aflq.b;
                java.lang.Object obj2 = this.a;
                ((android.widget.EditText) obj2).requestFocus();
                afjz.i((android.view.View) obj2);
                view.scrollTo(0, view.getBottom());
                return;
            default:
                ((cy) this.a).cancel();
                return;
        }
    }

    public wtm(defpackage.wtk wtkVar, int i) {
        this.$cid = i;
        this.a = wtkVar;
    }
}
