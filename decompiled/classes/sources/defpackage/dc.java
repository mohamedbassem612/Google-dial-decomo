package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class dc {
    static final defpackage.db a = new defpackage.db(new defpackage.so(1));
    public static int b = -100;
    public static defpackage.dxe c = null;
    public static defpackage.dxe d = null;
    private static java.lang.Boolean i = null;
    public static boolean e = false;
    public static final defpackage.acc f = new defpackage.acc(0);
    public static final java.lang.Object g = new java.lang.Object();
    public static final java.lang.Object h = new java.lang.Object();

    public static void i(defpackage.dc dcVar) {
        synchronized (g) {
            defpackage.acb acbVar = new defpackage.acb(f);
            while (acbVar.hasNext()) {
                defpackage.dc dcVar2 = (defpackage.dc) ((java.lang.ref.WeakReference) acbVar.next()).get();
                if (dcVar2 == dcVar || dcVar2 == null) {
                    acbVar.remove();
                }
            }
        }
    }

    public static void m(int i2) {
        if (i2 != -1 && i2 != 0 && i2 != 1 && i2 != 2 && i2 != 3) {
            android.util.Log.d("AppCompatDelegate", "setDefaultNightMode() called with an unknown mode");
            return;
        }
        if (b != i2) {
            b = i2;
            synchronized (g) {
                defpackage.acb acbVar = new defpackage.acb(f);
                while (acbVar.hasNext()) {
                    defpackage.dc dcVar = (defpackage.dc) ((java.lang.ref.WeakReference) acbVar.next()).get();
                    if (dcVar != null) {
                        dcVar.p();
                    }
                }
            }
        }
    }

    static boolean o(android.content.Context context) {
        if (i == null) {
            try {
                android.content.pm.ServiceInfo serviceInfo = context.getPackageManager().getServiceInfo(new android.content.ComponentName(context, (java.lang.Class<?>) defpackage.dv.class), 640);
                if (serviceInfo.metaData != null) {
                    i = java.lang.Boolean.valueOf(serviceInfo.metaData.getBoolean("autoStoreLocales"));
                }
            } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                android.util.Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                i = java.lang.Boolean.FALSE;
            }
        }
        return i.booleanValue();
    }

    public android.content.Context a() {
        throw null;
    }

    public abstract cp b();

    public abstract android.view.View c(int i2);

    public abstract void d(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams);

    public abstract void e();

    public abstract void f();

    public abstract void g();

    public abstract void h();

    public abstract void j(int i2);

    public abstract void k(android.view.View view);

    public abstract void l(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams);

    public abstract void n(java.lang.CharSequence charSequence);

    public abstract void p();

    public abstract void q();

    public abstract void r(int i2);
}
