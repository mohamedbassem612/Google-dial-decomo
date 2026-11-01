package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ric {
    public static final aimz a = aimz.i("com/android/dialer/internationalcallonwifi/ui/InternationalCallOnWifiDialogFragmentPeer");
    public final defpackage.rif b;
    public final defpackage.rhz c;
    public final ruc d;
    public final defpackage.rhs e;
    final agye f = new defpackage.ria(this);
    public final ajwr g;
    public final ucm h;
    private final zpm i;

    public ric(defpackage.rif rifVar, defpackage.rhz rhzVar, ruc rucVar, ucm ucmVar, zpm zpmVar, ajwr ajwrVar, defpackage.rhs rhsVar) {
        this.b = rifVar;
        this.c = rhzVar;
        this.d = rucVar;
        this.h = ucmVar;
        this.i = zpmVar;
        this.g = ajwrVar;
        this.e = rhsVar;
    }

    public final j$.util.Optional a() {
        defpackage.rif rifVar = this.b;
        zpm zpmVar = this.i;
        java.lang.String str = rifVar.b;
        j$.util.Optional optionalE = zpmVar.e(str);
        if (optionalE.isPresent()) {
            return j$.util.Optional.of(((defpackage.rib) ((defpackage.apqr) optionalE.orElseThrow()).a(defpackage.rib.class)).au());
        }
        a.bt(a.d(), "Call id %s was not found in CallScopes", str, "com/android/dialer/internationalcallonwifi/ui/InternationalCallOnWifiDialogFragmentPeer", "getController", (char) 161, "InternationalCallOnWifiDialogFragmentPeer.java", zct.b);
        return j$.util.Optional.empty();
    }

    public final boolean b() {
        return ((android.widget.CheckBox) ((al) this.c).d.findViewById(2131427457)).isChecked();
    }
}
