package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class abpk implements aonj {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ int a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;

    public /* synthetic */ abpk(defpackage.ahex ahexVar, java.lang.String str, int i, int i2) {
        this.$cid = i2;
        this.c = ahexVar;
        this.b = str;
        this.a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v9, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v6, types: [ahzi, java.lang.Object] */
    public final java.lang.Object a(java.lang.Object obj) {
        int i = this.$cid;
        if (i == 0) {
            android.widget.TextView textView = (android.widget.TextView) obj;
            aooh.f(textView, "textView");
            boolean zIsEmpty = android.text.TextUtils.isEmpty(textView.getText());
            ?? r5 = this.b;
            if (zIsEmpty) {
                textView.setText((java.lang.CharSequence) r5);
            } else {
                int i2 = this.a;
                java.lang.CharSequence[] charSequenceArr = new java.lang.CharSequence[3];
                charSequenceArr[0] = textView.getText();
                charSequenceArr[1] = i2 == 2 ? " " : "";
                charSequenceArr[2] = r5;
                textView.setText(abts.p(charSequenceArr));
            }
            com.google.android.libraries.communications.ux.views.captionsview.CaptionsView captionsView = (com.google.android.libraries.communications.ux.views.captionsview.CaptionsView) this.c;
            defpackage.abpm abpmVar = (defpackage.abpm) captionsView.b.poll();
            if (abpmVar != null) {
                captionsView.c(abpmVar.a, abpmVar.b);
            } else {
                captionsView.f = false;
            }
            return aojh.a;
        }
        if (i == 1) {
            czb czbVar = (czb) obj;
            aom aomVar = (aom) this.c;
            int iC = aomVar.a.c();
            if (iC < 0) {
                iC = 0;
            }
            int i3 = this.a;
            if (iC > i3) {
                iC = i3;
            }
            boolean z = aomVar.c;
            int i4 = -iC;
            czbVar.x(new ayc(this.b, true != z ? i4 : 0, true == z ? i4 : 0, 1));
            return aojh.a;
        }
        if (i != 2) {
            if (!((java.lang.Boolean) obj).booleanValue()) {
                return null;
            }
            int i5 = this.a;
            defpackage.ahex ahexVar = (defpackage.ahex) this.c;
            defpackage.abtr abtrVar = (defpackage.abtr) ahexVar.b.a();
            aogc aogcVar = (aogc) ahexVar.d;
            ((afip) abtrVar.c.eZ()).b(1L, new java.lang.Object[]{aogcVar.b, aogcVar.p(), i5 + (-1) != 0 ? "retry" : "onetry", this.b});
            return null;
        }
        if (!((java.lang.Boolean) obj).booleanValue()) {
            return null;
        }
        int i6 = this.a;
        java.lang.Object obj2 = this.b;
        defpackage.ahex ahexVar2 = (defpackage.ahex) this.c;
        defpackage.abtr abtrVar2 = (defpackage.abtr) ahexVar2.b.a();
        aogc aogcVar2 = (aogc) ahexVar2.d;
        abtrVar2.c((java.lang.String) aogcVar2.b, aogcVar2.p(), (java.lang.String) obj2, defpackage.ahex.d(i6), "attempt");
        return null;
    }

    public /* synthetic */ abpk(java.lang.CharSequence charSequence, int i, com.google.android.libraries.communications.ux.views.captionsview.CaptionsView captionsView, int i2) {
        this.$cid = i2;
        this.b = charSequence;
        this.a = i;
        this.c = captionsView;
    }

    public /* synthetic */ abpk(java.lang.Object obj, int i, java.lang.Object obj2, int i2) {
        this.$cid = i2;
        this.c = obj;
        this.a = i;
        this.b = obj2;
    }
}
