package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ryp {
    public static final aimz a = aimz.i("com/android/dialer/patrick/account/sharing/ui/compose/CallingCardSharingUiAdapter");
    public final defpackage.sjf b;
    public final defpackage.sjl c;
    public final defpackage.abxt d;
    public final aoin e;
    public final defpackage.sjh f;
    public final java.util.List g;

    public ryp(defpackage.sjf sjfVar, defpackage.sjl sjlVar, defpackage.abxt abxtVar, android.content.Context context, aoin aoinVar, defpackage.sjh sjhVar) {
        aooh.f(sjfVar, "navigationAdapter");
        aooh.f(sjlVar, "viewModel");
        aooh.f(context, "appContext");
        aooh.f(aoinVar, "enableContactsYourInfoFeatureRequestChanges");
        aooh.f(sjhVar, "navigationController");
        this.b = sjfVar;
        this.c = sjlVar;
        this.d = abxtVar;
        this.e = aoinVar;
        this.f = sjhVar;
        java.lang.String string = context.getString(2132017970);
        aooh.e(string, "getString(...)");
        java.lang.String string2 = context.getString(2132017969);
        aooh.e(string2, "getString(...)");
        this.g = ajsz.bb(new defpackage.ryt[]{new defpackage.ryt(defpackage.sfb.a, string), new defpackage.ryt(defpackage.sfb.b, string2)});
    }
}
