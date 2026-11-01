package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pbh {
    public static final aimz a = aimz.i("com/android/dialer/incall/answer/sms/ui/SmsBottomSheetFragmentPeer");
    public final defpackage.pat b;
    public final defpackage.pbc c;
    public final android.app.KeyguardManager d;
    public final urg e;
    public final qba f;
    public final tec g;
    public final aoin h;
    public final aoin i;
    public defpackage.qay j;
    public final zpm k;
    public final gpd l;
    public final heq m;
    private final aoin n;

    public pbh(defpackage.pat patVar, defpackage.pbc pbcVar, android.app.KeyguardManager keyguardManager, zpm zpmVar, urg urgVar, qba qbaVar, gpd gpdVar, heq heqVar, tec tecVar, aoin aoinVar, aoin aoinVar2, aoin aoinVar3) {
        this.b = patVar;
        this.c = pbcVar;
        this.d = keyguardManager;
        this.k = zpmVar;
        this.e = urgVar;
        this.f = qbaVar;
        this.l = gpdVar;
        this.m = heqVar;
        this.g = tecVar;
        this.h = aoinVar;
        this.n = aoinVar2;
        this.i = aoinVar3;
    }

    public final android.widget.TextView a(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup) {
        android.widget.TextView textView = (android.widget.TextView) layoutInflater.inflate(2131624454, viewGroup, false);
        if (((java.lang.Boolean) this.n.a()).booleanValue()) {
            textView.setClickable(true);
            textView.setFocusable(true);
            dzs.i(textView, new defpackage.pbe(this));
        }
        return textView;
    }

    public final void b() {
        java.lang.String str = this.b.c;
        defpackage.pax paxVar = new defpackage.pax();
        amxr.g(paxVar);
        ahgl.c(paxVar, str);
        paxVar.r(this.c.I(), "CustomSmsDialog");
    }
}
