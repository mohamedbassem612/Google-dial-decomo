package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class oji {
    public static final aimz a = aimz.i("com/android/dialer/externals/aicore/ui/DialerAiCorePreferenceViewPeer");
    public final aoss b;
    public yse c;
    public final defpackage.ojl d;
    public final yth e;
    public final rai f;
    private final aoir g;

    public oji(defpackage.ojl ojlVar, yth ythVar, rai raiVar, aoss aossVar) {
        aooh.f(raiVar, "dialerAiCorePreferenceViewModelFactory");
        aooh.f(aossVar, "fragmentCoroutineScope");
        this.d = ojlVar;
        this.e = ythVar;
        this.f = raiVar;
        this.b = aossVar;
        this.g = aooc.ag(new defpackage.mtr(this, 15));
        defpackage.ojl.inflate(ojlVar.getContext(), 2131624143, ojlVar);
        b().setOnClickListener(new defpackage.nti(this, 4));
    }

    public final android.widget.LinearLayout a() {
        return (android.widget.LinearLayout) this.d.findViewById(2131427443);
    }

    public final android.widget.LinearLayout b() {
        return (android.widget.LinearLayout) this.d.findViewById(2131427482);
    }

    public final defpackage.ojf c() {
        return (defpackage.ojf) this.g.a();
    }

    public final yse d() {
        yse yseVar = this.c;
        if (yseVar != null) {
            return yseVar;
        }
        aooh.j("aiCoreFeature");
        return null;
    }

    public final void e(java.lang.String str) {
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW");
        android.net.Uri uri = android.net.Uri.parse("https://play.google.com/store/apps/details?id=".concat(str));
        aooh.e(uri, "parse(...)");
        intent.setData(uri);
        intent.setPackage("com.android.vending");
        android.content.Context context = this.d.getContext();
        aooh.e(context, "getContext(...)");
        ahqx.l(context, intent);
    }
}
