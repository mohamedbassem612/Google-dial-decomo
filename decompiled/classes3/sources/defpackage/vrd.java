package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
class vrd implements agye {
    final /* synthetic */ defpackage.vrh a;

    public vrd(defpackage.vrh vrhVar) {
        j$.util.Objects.requireNonNull(vrhVar);
        this.a = vrhVar;
    }

    public final void a(java.lang.Throwable th) {
        defpackage.vrh vrhVar = this.a;
        if (vrhVar.r == 1) {
            vrhVar.b();
            a.bq(defpackage.vrh.a.c(), "failed to get voicemailPinModel", "com/android/dialer/voicemail/settings/pin/VoicemailChangePinFragmentPeer$2", "onError", (char) 159, "VoicemailChangePinFragmentPeer.java", th, zct.b);
            vrhVar.c.H().getWindow().setSoftInputMode(3);
            vrhVar.f(vrhVar.a(6));
        }
    }

    public final /* synthetic */ void b(java.lang.Object obj) {
        final defpackage.vrh vrhVar = this.a;
        vrhVar.m = (defpackage.vrj) obj;
        defpackage.vra vraVar = vrhVar.c;
        final android.view.View viewN = vraVar.N();
        viewN.setVisibility(0);
        android.widget.EditText editText = (android.widget.EditText) viewN.findViewById(2131428684);
        if (vrhVar.h()) {
            editText.setFilters(new android.text.InputFilter[]{new android.text.InputFilter.LengthFilter(vrhVar.m.e.a)});
        }
        if (vrhVar.m.c) {
            android.widget.TextView textView = (android.widget.TextView) vraVar.N().findViewById(2131428434);
            j$.util.Optional optionalB = vrhVar.e.b(vrhVar.j.getComponentName().flattenToString(), vrhVar.j.getId());
            defpackage.qgz qgzVar = new defpackage.qgz(vrhVar, textView, 16, null);
            if (true == optionalB.isPresent()) {
                java.lang.Object obj2 = optionalB.get();
                java.lang.Object obj3 = qgzVar.a;
                java.lang.Object obj4 = qgzVar.b;
                defpackage.sot sotVar = (defpackage.sot) obj2;
                int iC = sotVar.d;
                if (iC == 0) {
                    iC = urg.c(((defpackage.vrh) obj3).b, android.R.attr.textColorSecondary);
                }
                android.widget.TextView textView2 = (android.widget.TextView) obj4;
                textView2.setTextColor(iC);
                textView2.setText(sotVar.c);
                textView2.setVisibility(0);
            }
        } else {
            defpackage.vrh.a.b().l("com/android/dialer/voicemail/settings/pin/VoicemailChangePinFragmentPeer", "setLabelText", 421, "VoicemailChangePinFragmentPeer.java").v("ignore to set label while only single SIM is activated");
        }
        vrhVar.d();
        vrhVar.e();
        editText.requestFocus();
        editText.addTextChangedListener(vrhVar.n);
        editText.setOnEditorActionListener(new android.widget.TextView.OnEditorActionListener() { // from class: vrc
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(android.widget.TextView textView3, int i, android.view.KeyEvent keyEvent) {
                if (!((android.widget.Button) viewN.findViewById(2131428581)).isEnabled()) {
                    return true;
                }
                if (i != 0 && i != 6 && i != 5) {
                    return false;
                }
                vrhVar.j();
                return true;
            }
        });
        if (vrhVar.r == 1) {
            vrhVar.b();
            if (!vrhVar.m.a.isPresent()) {
                vrhVar.i(2);
                return;
            }
            int i = vrhVar.m.b;
            aimz aimzVar = defpackage.vrh.a;
            aimzVar.b().l("com/android/dialer/voicemail/settings/pin/VoicemailChangePinFragmentPeer", "verifyDefaultPin", 612, "VoicemailChangePinFragmentPeer.java").w("Verify default PIN result: %s", i);
            if (i == 0) {
                vrhVar.k = (java.lang.String) vrhVar.m.a.orElseThrow();
                vrhVar.c();
            } else if (i == 6) {
                vraVar.H().getWindow().setSoftInputMode(3);
                vrhVar.f(vrhVar.a(6));
            } else {
                aimzVar.d().i(zct.b).l("com/android/dialer/voicemail/settings/pin/VoicemailChangePinFragmentPeer", "verifyDefaultPin", 629, "VoicemailChangePinFragmentPeer.java").w("invalid default old PIN: %s", i);
                vrhVar.m.d.c(vrhVar.j);
                vrhVar.i(2);
            }
        }
    }

    public final /* synthetic */ void c() {
    }
}
