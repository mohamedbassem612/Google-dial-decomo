package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vrh {
    public static final aimz a = aimz.i("com/android/dialer/voicemail/settings/pin/VoicemailChangePinFragmentPeer");
    public final android.content.Context b;
    public final defpackage.vra c;
    public final defpackage.vrb d;
    public final sou e;
    public final agtj f;
    public final rlv g;
    public final defpackage.vrl h;
    public final aoin i;
    public android.telecom.PhoneAccountHandle j;
    public defpackage.vrj m;
    public int r;
    public final ajwr s;
    public final ajwr t;
    private j$.util.Optional u = j$.util.Optional.empty();
    public java.lang.String k = "";
    public java.lang.String l = "";
    public final android.text.TextWatcher n = new jul(this, 5);
    public final agye o = new defpackage.vrd(this);
    public final agtk p = new defpackage.vre(this);
    public final agtk q = new defpackage.vrf(this);

    public vrh(android.content.Context context, defpackage.vra vraVar, defpackage.vrb vrbVar, ajwr ajwrVar, sou souVar, ajwr ajwrVar2, agtj agtjVar, rlv rlvVar, defpackage.vrl vrlVar, aoin aoinVar) {
        this.b = context;
        this.c = vraVar;
        this.d = vrbVar;
        this.s = ajwrVar;
        this.e = souVar;
        this.t = ajwrVar2;
        this.f = agtjVar;
        this.g = rlvVar;
        this.h = vrlVar;
        this.i = aoinVar;
    }

    private final java.lang.String k() {
        return ((android.widget.EditText) this.c.N().findViewById(2131428684)).getText().toString();
    }

    private final void l() {
        ((android.widget.Button) this.c.N().findViewById(2131428581)).setEnabled(false);
    }

    private final void m() {
        ((android.widget.Button) this.c.N().findViewById(2131428581)).setEnabled(true);
    }

    private final void n(java.lang.String str) {
        ((android.widget.TextView) this.c.N().findViewById(2131428133)).setText(str);
    }

    public final java.lang.String a(int i) {
        switch (i) {
            case 1:
                return this.b.getString(2132020810);
            case 2:
                return this.b.getString(2132020809);
            case 3:
                return this.b.getString(2132020811);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return this.b.getString(2132020807);
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return this.b.getString(2132020805);
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return this.b.getString(2132020808);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                return this.b.getString(2132020806);
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                return this.b.getString(2132020812);
            default:
                a.c().m(aioa.b).i(zct.b).l("com/android/dialer/voicemail/settings/pin/VoicemailChangePinFragmentPeer", "getChangePinResultMessage", 571, "VoicemailChangePinFragmentPeer.java").w("Unexpected ChangePinResult: %s", i);
                return "";
        }
    }

    public final void b() {
        j$.util.Optional optional = this.u;
        if (true == optional.isPresent()) {
            android.app.ProgressDialog progressDialog = (android.app.ProgressDialog) optional.get();
            if (progressDialog.isShowing()) {
                progressDialog.dismiss();
            } else {
                a.b().l("com/android/dialer/voicemail/settings/pin/VoicemailChangePinFragmentPeer", "dismissProgressDialog", 598, "VoicemailChangePinFragmentPeer.java").v("Dialog not visible, not dismissing");
            }
        }
        this.u = j$.util.Optional.empty();
    }

    public final void c() {
        int i = this.r;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 0 || i2 == 1) {
            i(3);
        } else if (i2 == 2) {
            i(4);
        }
    }

    public final void d() {
        defpackage.vra vraVar = this.c;
        android.view.View viewN = vraVar.N();
        android.widget.EditText editText = (android.widget.EditText) viewN.findViewById(2131428684);
        android.widget.TextView textView = (android.widget.TextView) viewN.findViewById(2131428323);
        android.widget.TextView textView2 = (android.widget.TextView) viewN.findViewById(2131428333);
        android.widget.TextView textView3 = (android.widget.TextView) viewN.findViewById(2131428133);
        android.widget.Button button = (android.widget.Button) viewN.findViewById(2131428581);
        textView3.setText("");
        button.setEnabled(false);
        int i = this.r;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 1) {
            textView.setText(2132018001);
            textView2.setText(2132018002);
            button.setText(2132017998);
        } else if (i2 == 2) {
            textView.setText(2132017999);
            button.setText(2132017998);
            textView2.setText(vraVar.Z(2132018000, new java.lang.Object[]{java.lang.Integer.valueOf(this.m.e.b), java.lang.Integer.valueOf(this.m.e.a)}));
        } else if (i2 == 3) {
            textView.setText(2132017996);
            textView2.setText("");
            button.setText(2132018003);
        }
        editText.setContentDescription(textView.getText());
    }

    public final void e() {
        int i = this.r;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 1) {
            if (k().length() > 0) {
                m();
                return;
            } else {
                l();
                return;
            }
        }
        if (i2 != 2) {
            if (i2 == 3) {
                if (k().equals(this.l)) {
                    m();
                    n("");
                    return;
                } else {
                    l();
                    n(this.c.Y(2132017997));
                    return;
                }
            }
            return;
        }
        if (k().length() == 0) {
            n(this.c.Y(2132020810));
            l();
        } else if (!h() || k().length() >= this.m.e.b) {
            n("");
            m();
        } else {
            n(this.c.Y(2132020810));
            l();
        }
    }

    public final void f(java.lang.String str) {
        defpackage.vqw vqwVar = new defpackage.vqw();
        amxr.g(vqwVar);
        ahgl.c(vqwVar, str);
        vqwVar.r(this.c.I(), "voicemail_change_pin_error_dialog_fragment");
    }

    public final void g() {
        android.app.ProgressDialog progressDialog = new android.app.ProgressDialog(this.b);
        progressDialog.setCancelable(false);
        progressDialog.setMessage(this.c.Y(2132020815));
        progressDialog.show();
        this.u = j$.util.Optional.of(progressDialog);
    }

    public final boolean h() {
        defpackage.vok vokVar = this.m.e;
        return (vokVar.b == 0 && vokVar.a == 0) ? false : true;
    }

    public final void i(int i) {
        this.r = i;
        ((android.widget.EditText) this.c.N().findViewById(2131428684)).setText("");
        d();
    }

    public final void j() {
        int i = this.r;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 0) {
            a.bI(a.c().m(aioa.b), "Unexpected operation: next button was pressed while verifying the default PIN.", "com/android/dialer/voicemail/settings/pin/VoicemailChangePinFragmentPeer", "onNextButtonClick", (char) 358, "VoicemailChangePinFragmentPeer.java", zct.b);
            return;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                this.l = k();
                c();
                return;
            } else {
                if (i2 == 3) {
                    this.f.i(new defpackage.zoe((java.lang.Object) this.m.d.a(this.j, this.k, this.l)), this.q);
                    g();
                    return;
                }
                return;
            }
        }
        this.k = k();
        agtj agtjVar = this.f;
        defpackage.vqt vqtVar = this.m.d;
        android.telecom.PhoneAccountHandle phoneAccountHandle = this.j;
        java.lang.String str = this.k;
        zjm zjmVar = vqtVar.c;
        agtjVar.i(new defpackage.zoe((java.lang.Object) ((zjmVar.g().isPresent() && ((vda) zjmVar.g().orElseThrow()).c(phoneAccountHandle).isPresent()) ? ahvr.H(((vee) ((defpackage.abtr) ((vda) zjmVar.g().orElseThrow()).c(phoneAccountHandle).orElseThrow()).d).c(phoneAccountHandle, str, str), new defpackage.vmj(15), vqtVar.b) : aiql.y(new java.lang.IllegalStateException("PhoneAccount not supported")))), this.p);
        g();
    }
}
