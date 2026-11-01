package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mkw {
    public static final aigf a = aigf.o(2131427999, defpackage.miv.VOICE_BUTTON, 2131427990, defpackage.miv.RTT_VOICE_BUTTON, 2131427989, defpackage.miv.RTT_BUTTON, 2131427980, defpackage.miv.BUSINESS_MESSAGE_CHAT_BUTTON, 2131427983, defpackage.miv.WAIT_TIME_VOICE_BUTTON);
    public static final aihd b = new aile(defpackage.miv.VOICE_BUTTON);
    public aigf d;
    public final defpackage.mla f;
    public final java.util.Map c = new java.util.EnumMap(defpackage.miv.class);
    public final java.util.Map e = new java.util.EnumMap(defpackage.miv.class);

    public mkw(defpackage.mla mlaVar) {
        this.f = mlaVar;
    }

    public final void a(defpackage.miu miuVar) {
        java.lang.String str;
        defpackage.miv mivVarB = defpackage.miv.b(miuVar.c);
        if (mivVarB == null) {
            mivVarB = defpackage.miv.UNSPECIFIED;
        }
        com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton extendedFloatingActionButton = (com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton) this.c.get(mivVarB);
        java.lang.String str2 = miuVar.d;
        if (miuVar.e.isEmpty()) {
            str = str2;
        } else {
            str = str2 + '\n' + miuVar.e;
        }
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(str);
        spannableStringBuilder.setSpan(new android.text.style.TextAppearanceSpan(this.f.z(), 2132083363), str2.length(), str.length(), 17);
        extendedFloatingActionButton.setText(spannableStringBuilder);
    }
}
