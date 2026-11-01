package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mlm {
    public static final aimz a = aimz.i("com/android/dialer/dialpadview/ui/PreCallDialpadInputRenderer");
    public static final java.util.Map b = ajsz.aO(new aoiu[]{new aoiu(2131428622, new defpackage.mll(8, 1)), new aoiu(2131429326, new defpackage.mll(9, 2)), new aoiu(2131429260, new defpackage.mll(10, 3)), new aoiu(2131428298, new defpackage.mll(11, 4)), new aoiu(2131428279, new defpackage.mll(12, 5)), new aoiu(2131428958, new defpackage.mll(13, 6)), new aoiu(2131428934, new defpackage.mll(14, 7)), new aoiu(2131428083, new defpackage.mll(15, 8)), new aoiu(2131428583, new defpackage.mll(16, 9)), new aoiu(2131429546, new defpackage.mll(7, 0)), new aoiu(2131429014, new defpackage.mll(17, 10)), new aoiu(2131428713, new defpackage.mll(18, 11))});
    public final defpackage.mla c;
    public final defpackage.mjk d;
    public final ssq e;
    public final ahpz f;
    public final defpackage.mlq g;
    public final defpackage.mku h;
    public final aoss i;
    public final aoin j;
    public android.widget.EditText k;
    public java.lang.String l;
    public com.android.dialer.dialpadview.DialpadView m;
    public android.text.TextWatcher n;
    public final java.util.Set o;
    public final apni p;
    public final aogc q;

    public mlm(defpackage.mla mlaVar, defpackage.mjk mjkVar, ssq ssqVar, aogc aogcVar, ahpz ahpzVar, defpackage.mlq mlqVar, defpackage.mku mkuVar, aoss aossVar, apni apniVar, aoin aoinVar) {
        aooh.f(mjkVar, "toneController");
        aooh.f(ssqVar, "phoneNumberHelper");
        aooh.f(ahpzVar, "traceCreation");
        aooh.f(mlqVar, "preCallDialpadTextWatcher");
        aooh.f(mkuVar, "preCallDialpadArgentinaFormattingTextWatcher");
        aooh.f(aossVar, "lightweightScope");
        aooh.f(apniVar, "androidJobs");
        aooh.f(aoinVar, "enableSimpleIntentNumberFormat");
        this.c = mlaVar;
        this.d = mjkVar;
        this.e = ssqVar;
        this.q = aogcVar;
        this.f = ahpzVar;
        this.g = mlqVar;
        this.h = mkuVar;
        this.i = aossVar;
        this.p = apniVar;
        this.j = aoinVar;
        this.o = new java.util.LinkedHashSet();
    }

    public final java.lang.String a() {
        android.widget.EditText editText = this.k;
        if (editText == null) {
            aooh.j("digits");
            editText = null;
        }
        return editText.getText().toString();
    }

    public final void b(int i) {
        android.view.KeyEvent keyEvent = new android.view.KeyEvent(0, i);
        android.widget.EditText editText = this.k;
        if (editText == null) {
            aooh.j("digits");
            editText = null;
        }
        editText.onKeyDown(i, keyEvent);
    }

    public final void c(int i) {
        android.widget.EditText editText = this.k;
        if (editText == null) {
            aooh.j("digits");
            editText = null;
        }
        editText.setImportantForAccessibility(i);
    }

    public final void d() {
        com.android.dialer.dialpadview.DialpadView dialpadView = this.m;
        if (dialpadView == null) {
            aooh.j("dialpadView");
            dialpadView = null;
        }
        dialpadView.c.setEnabled(!f());
    }

    public final void e(java.lang.String str) {
        aooh.f(str, "newDigits");
        android.widget.EditText editText = this.k;
        android.widget.EditText editText2 = null;
        if (editText == null) {
            aooh.j("digits");
            editText = null;
        }
        android.text.Editable text = editText.getText();
        aooh.e(text, "getText(...)");
        if (str.contentEquals(text)) {
            return;
        }
        android.widget.EditText editText3 = this.k;
        if (editText3 == null) {
            aooh.j("digits");
            editText3 = null;
        }
        android.text.Editable text2 = editText3.getText();
        android.widget.EditText editText4 = this.k;
        if (editText4 == null) {
            aooh.j("digits");
        } else {
            editText2 = editText4;
        }
        text2.replace(0, editText2.getText().length(), str);
    }

    public final boolean f() {
        android.widget.EditText editText = this.k;
        if (editText == null) {
            aooh.j("digits");
            editText = null;
        }
        return editText.length() == 0;
    }
}
