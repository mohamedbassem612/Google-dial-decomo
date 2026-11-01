package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ksv {
    public static final aimz a = aimz.i("com/android/dialer/calloptions/ui/CallOptionsActivityPeer");
    private static final java.util.Set n = ajsz.cW(new java.lang.String[]{"android.intent.category.DEFAULT", "android.intent.category.BROWSABLE"});
    public final com.android.dialer.calloptions.ui.CallOptionsActivity b;
    public final defpackage.kso c;
    public final aoin d;
    public final rlv e;
    public final defpackage.ksr f;
    public final aoss g;
    public final urg h;
    public int i;
    public final defpackage.kvt j;
    public final aazc k;
    public final gpd l;
    public final rze m;
    private final defpackage.kst o;

    public ksv(com.android.dialer.calloptions.ui.CallOptionsActivity callOptionsActivity, aazc aazcVar, rze rzeVar, defpackage.kso ksoVar, aoin aoinVar, rlv rlvVar, defpackage.kvt kvtVar, gpd gpdVar, defpackage.ksr ksrVar, defpackage.kst kstVar, aoss aossVar, urg urgVar) {
        aooh.f(aazcVar, "clock");
        aooh.f(aoinVar, "enableCallOptionsRbm");
        aooh.f(rlvVar, "loggingBindings");
        aooh.f(kvtVar, "callOptionsActivityProvider");
        aooh.f(gpdVar, "cuiSemanticLoggerFactory");
        aooh.f(aossVar, "lightweightScope");
        aooh.f(urgVar, "theme");
        this.b = callOptionsActivity;
        this.k = aazcVar;
        this.m = rzeVar;
        this.c = ksoVar;
        this.d = aoinVar;
        this.e = rlvVar;
        this.j = kvtVar;
        this.l = gpdVar;
        this.f = ksrVar;
        this.o = kstVar;
        this.g = aossVar;
        this.h = urgVar;
        this.i = 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [android.content.Context, com.android.dialer.calloptions.ui.CallOptionsActivity] */
    public final void a(android.content.Intent intent) {
        this.i = 7;
        this.e.o(rmx.AS);
        if (intent == null) {
            this.b.finish();
            return;
        }
        android.content.Intent intent2 = new android.content.Intent(intent.getAction());
        ?? r3 = this.b;
        intent2.setClass(r3, com.android.dialer.main.impl.MainActivity.class);
        intent2.setDataAndType(intent.getData(), intent.getType());
        intent2.putExtra("extra_from_call_options_fallback", true);
        java.util.Set<java.lang.String> categories = intent.getCategories();
        if (categories != null) {
            java.util.Iterator it = ajsz.cd(categories, n).iterator();
            while (it.hasNext()) {
                intent2.addCategory((java.lang.String) it.next());
            }
        }
        if (aooh.n(intent.getAction(), "android.intent.action.VIEW") && intent.hasExtra("add_call_mode")) {
            intent2.putExtra("add_call_mode", intent.getBooleanExtra("add_call_mode", false));
        }
        ahqx.l((android.content.Context) r3, intent2);
        r3.finish();
    }

    public final void b() {
        int i = this.i;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 1) {
            this.i = 6;
            this.e.o(rmx.AX);
            this.l.i((java.lang.String) null).b(mce.hW);
        } else if (i2 == 2) {
            this.i = 5;
            this.e.o(rmx.AY);
            this.l.i((java.lang.String) null).b(mce.hY);
        }
    }

    public final void c(java.lang.String str) {
        this.i = 4;
        this.e.o(rmx.Ba);
        android.net.Uri uri = android.net.Uri.parse(str);
        aooh.e(uri, "parse(...)");
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", uri.buildUpon().appendQueryParameter("ctx", (java.lang.String) this.o.b.a()).build());
        intent.putExtra("android.intent.extra.REFERRER", defpackage.kst.a);
        try {
            ahqx.l(this.b, intent);
        } catch (android.content.ActivityNotFoundException e) {
            a.d().k(e).l("com/android/dialer/calloptions/ui/CallOptionsActivityPeer", "openDeepLink", 361, "CallOptionsActivityPeer.kt").y("Failed to open deep link: %s", str);
        }
    }
}
