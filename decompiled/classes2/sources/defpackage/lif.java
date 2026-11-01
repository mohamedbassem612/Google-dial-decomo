package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lif {
    public static final aimz a = aimz.i("com/android/dialer/callscreen/impl/settings/VoiceSettingsFragmentPeer");
    public final agtk b = new defpackage.lib(this);
    public final agtk c = new defpackage.lic(this);
    public final defpackage.lia d;
    public final defpackage.lhz e;
    public final agtj f;
    public defpackage.lhl g;
    public final whl h;
    public final ajwr i;
    public final defpackage.jyn j;
    public final ajwr k;

    public lif(defpackage.lia liaVar, defpackage.lhz lhzVar, defpackage.jyn jynVar, ajwr ajwrVar, ajwr ajwrVar2, agtj agtjVar, whl whlVar) {
        this.d = liaVar;
        this.e = lhzVar;
        this.j = jynVar;
        this.i = ajwrVar;
        this.k = ajwrVar2;
        this.f = agtjVar;
        this.h = whlVar;
    }

    public static android.widget.RadioGroup a(defpackage.lia liaVar) {
        return (android.widget.RadioGroup) liaVar.N().findViewById(2131429479);
    }

    public static void b(android.widget.RadioGroup radioGroup, boolean z) {
        for (int i = 0; i < radioGroup.getChildCount(); i++) {
            radioGroup.getChildAt(i).setEnabled(z);
        }
    }
}
