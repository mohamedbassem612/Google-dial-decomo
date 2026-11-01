package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class lid implements agye {
    private final android.widget.RadioGroup a;
    private final android.widget.TextView b;
    private final ajwr c;

    public lid(android.widget.RadioGroup radioGroup, android.widget.TextView textView, ajwr ajwrVar) {
        this.a = radioGroup;
        this.b = textView;
        this.c = ajwrVar;
    }

    public final void a(java.lang.Throwable th) {
        a.bq(defpackage.lif.a.c(), "failed to load voices", "com/android/dialer/callscreen/impl/settings/VoiceSettingsFragmentPeer$OnLoadSubscriptionCallbacks", "onError", 'g', "VoiceSettingsFragmentPeer.java", th, zct.b);
    }

    public final /* bridge */ /* synthetic */ void b(java.lang.Object obj) {
        j$.util.Optional optional = (j$.util.Optional) obj;
        if (!optional.isPresent()) {
            a.bI(defpackage.lif.a.c().m(aioa.b), "model was empty", "com/android/dialer/callscreen/impl/settings/VoiceSettingsFragmentPeer$OnLoadSubscriptionCallbacks", "onNewData", 'C', "VoiceSettingsFragmentPeer.java", zct.b);
            return;
        }
        android.widget.RadioGroup radioGroup = this.a;
        radioGroup.removeAllViews();
        int i = 0;
        while (i < ((defpackage.lih) optional.orElseThrow()).b.size()) {
            defpackage.lhu lhuVar = (defpackage.lhu) ((defpackage.lih) optional.orElseThrow()).b.get(i);
            defpackage.lif.a.b().l("com/android/dialer/callscreen/impl/settings/VoiceSettingsFragmentPeer$OnLoadSubscriptionCallbacks", "onNewData", 74, "VoiceSettingsFragmentPeer.java").J("creating radio button for: %s, isChecked=%b", lhuVar.c, lhuVar.d);
            android.widget.RadioButton radioButton = (android.widget.RadioButton) android.view.LayoutInflater.from(radioGroup.getContext()).inflate(2131624700, (android.view.ViewGroup) radioGroup, false);
            radioButton.setId(android.view.View.generateViewId());
            i++;
            radioButton.setText(radioGroup.getContext().getString(2132020818, java.lang.Integer.valueOf(i)));
            radioButton.setChecked(lhuVar.d);
            this.c.g(radioButton, new defpackage.lie(lhuVar));
            radioGroup.addView(radioButton);
        }
        this.b.setText(android.text.TextUtils.concat("\"", ((defpackage.lhu) ((defpackage.lih) optional.orElseThrow()).b.get(0)).f, "\""));
    }

    public final /* synthetic */ void c() {
    }
}
