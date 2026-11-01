package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public abstract class luu implements android.content.ComponentCallbacks2 {
    public static final aimz a = aimz.i("com/android/dialer/contactphoto/ContactPhotoManager");
    public static final mni b;
    private static defpackage.luu c;

    static {
        android.net.Uri.parse("defaultimage://");
        b = new mni();
    }

    public static synchronized defpackage.luu a(android.content.Context context) {
        return new defpackage.lvb(context);
    }

    public static defpackage.luu b(android.content.Context context) {
        if (c == null) {
            android.content.Context applicationContext = context.getApplicationContext();
            defpackage.luu luuVarA = a(applicationContext);
            c = luuVarA;
            applicationContext.registerComponentCallbacks(luuVarA);
            if (zqz.a(context, "android.permission.READ_CONTACTS")) {
                defpackage.lvb lvbVar = (defpackage.lvb) c;
                lvbVar.f();
                lvbVar.l.b();
            }
        }
        return c;
    }

    public final void c(android.widget.QuickContactBadge quickContactBadge, android.net.Uri uri, long j, android.net.Uri uri2, java.lang.String str) {
        quickContactBadge.assignContactUri(uri);
        java.lang.String strEncode = null;
        quickContactBadge.setOverlay(null);
        quickContactBadge.setContentDescription(quickContactBadge.getContext().getString(2132018266, str));
        if (uri != null && !abxl.d(uri)) {
            java.util.List<java.lang.String> pathSegments = uri.getPathSegments();
            if (pathSegments.size() >= 3) {
                strEncode = android.net.Uri.encode(pathSegments.get(2));
            }
        }
        defpackage.lut lutVar = new defpackage.lut(str, strEncode, 1, true);
        if (j == 0) {
            if (uri2 != null) {
                d(quickContactBadge, uri2);
                return;
            }
            j = 0;
        }
        e(quickContactBadge, j, lutVar);
    }

    public abstract void d(android.widget.ImageView imageView, android.net.Uri uri);

    public abstract void e(android.widget.ImageView imageView, long j, defpackage.lut lutVar);

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(android.content.res.Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
    }
}
