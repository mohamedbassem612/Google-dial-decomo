package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ajtc {
    public static final java.lang.Object a = new java.lang.Object();
    public static final java.util.Map b = new defpackage.aca();
    public final defpackage.ajtv c;
    public final defpackage.ajuc e;
    public final defpackage.ajwe f;
    private final android.content.Context h;
    private final java.lang.String i;
    private final defpackage.ajtg j;
    public final java.util.concurrent.atomic.AtomicBoolean d = new java.util.concurrent.atomic.AtomicBoolean(false);
    private final java.util.concurrent.atomic.AtomicBoolean k = new java.util.concurrent.atomic.AtomicBoolean();
    public final java.util.List g = new java.util.concurrent.CopyOnWriteArrayList();

    public ajtc(android.content.Context context, java.lang.String str, defpackage.ajtg ajtgVar) {
        java.util.List arrayList;
        java.util.Iterator it;
        int i;
        new java.util.concurrent.CopyOnWriteArrayList();
        defpackage.aais.as(context);
        this.h = context;
        defpackage.aais.ap(str);
        this.i = str;
        this.j = ajtgVar;
        defpackage.ajth ajthVar = defpackage.ajyo.a;
        android.os.Trace.beginSection("Firebase");
        android.os.Trace.beginSection("ComponentDiscovery");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        android.os.Bundle bundle = null;
        try {
            android.content.pm.PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                android.util.Log.w("ComponentDiscovery", "Context has no PackageManager.");
            } else {
                android.content.pm.ServiceInfo serviceInfo = packageManager.getServiceInfo(new android.content.ComponentName(context, (java.lang.Class<?>) com.google.firebase.components.ComponentDiscoveryService.class), 128);
                if (serviceInfo == null) {
                    android.util.Log.w("ComponentDiscovery", com.google.firebase.components.ComponentDiscoveryService.class.toString() + " has no service info.");
                } else {
                    bundle = serviceInfo.metaData;
                }
            }
            while (true) {
                i = 1;
                if (!it.hasNext()) {
                    break;
                } else {
                    arrayList2.add(new defpackage.ajtu((java.lang.String) it.next(), 1));
                }
            }
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            android.util.Log.w("ComponentDiscovery", "Application info not found.");
        }
        if (bundle == null) {
            android.util.Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
            arrayList = java.util.Collections.EMPTY_LIST;
        } else {
            arrayList = new java.util.ArrayList();
            for (java.lang.String str2 : bundle.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str2)) && str2.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str2.substring(31));
                }
            }
        }
        it = arrayList.iterator();
        android.os.Trace.endSection();
        android.os.Trace.beginSection("Runtime");
        defpackage.ajuv ajuvVar = defpackage.ajuv.INSTANCE;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList3.addAll(arrayList2);
        defpackage.ajsz.L(new com.google.firebase.FirebaseCommonRegistrar(), arrayList3);
        defpackage.ajsz.L(new com.google.firebase.concurrent.ExecutorsRegistrar(), arrayList3);
        arrayList4.add(defpackage.ajtp.e(context, android.content.Context.class, new java.lang.Class[0]));
        arrayList4.add(defpackage.ajtp.e(this, defpackage.ajtc.class, new java.lang.Class[0]));
        arrayList4.add(defpackage.ajtp.e(ajtgVar, defpackage.ajtg.class, new java.lang.Class[0]));
        defpackage.ajyq ajyqVar = new defpackage.ajyq();
        if (defpackage.dpe.p(context) && defpackage.ajyo.b.get()) {
            arrayList4.add(defpackage.ajtp.e(ajthVar, defpackage.ajth.class, new java.lang.Class[0]));
        }
        defpackage.ajtv ajtvVar = new defpackage.ajtv(ajuvVar, arrayList3, arrayList4, ajyqVar);
        this.c = ajtvVar;
        android.os.Trace.endSection();
        this.e = new defpackage.ajuc(new defpackage.ajtt(this, context, i));
        this.f = defpackage.ajsz.p(ajtvVar, defpackage.ajvp.class);
        defpackage.apnt apntVar = new defpackage.apnt(this);
        g();
        if (this.d.get()) {
            defpackage.aaea.a.c();
        }
        this.g.add(apntVar);
        android.os.Trace.endSection();
    }

    public static defpackage.ajtc b() {
        defpackage.ajtc ajtcVar;
        synchronized (a) {
            ajtcVar = (defpackage.ajtc) b.get("[DEFAULT]");
            if (ajtcVar == null) {
                throw new java.lang.IllegalStateException("Default FirebaseApp is not initialized in this process " + defpackage.aair.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
            }
            ((defpackage.ajvp) ajtcVar.f.a()).c();
        }
        return ajtcVar;
    }

    public final android.content.Context a() {
        g();
        return this.h;
    }

    public final defpackage.ajtg c() {
        g();
        return this.j;
    }

    public final java.lang.Object d(java.lang.Class cls) {
        g();
        return defpackage.ajsz.r(this.c, cls);
    }

    public final java.lang.String e() {
        g();
        return this.i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.ajtc) {
            return this.i.equals(((defpackage.ajtc) obj).e());
        }
        return false;
    }

    public final java.lang.String f() {
        return defpackage.aais.e(e().getBytes(java.nio.charset.Charset.defaultCharset())) + '+' + defpackage.aais.e(c().b.getBytes(java.nio.charset.Charset.defaultCharset()));
    }

    public final void g() {
        defpackage.aais.ao(!this.k.get(), "FirebaseApp was deleted");
    }

    public final void h() {
        java.util.HashMap map;
        android.content.Context context = this.h;
        if (defpackage.dpe.p(context)) {
            android.util.Log.i("FirebaseApp", "Device unlocked: initializing all Firebase APIs for app ".concat(java.lang.String.valueOf(e())));
            defpackage.ajtv ajtvVar = this.c;
            if (defpackage.anty.aq(ajtvVar.b, java.lang.Boolean.valueOf(i()))) {
                synchronized (ajtvVar) {
                    map = new java.util.HashMap(ajtvVar.a);
                }
                ajtvVar.f(map);
            }
            ((defpackage.ajvp) this.f.a()).c();
            return;
        }
        android.util.Log.i("FirebaseApp", "Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ".concat(java.lang.String.valueOf(e())));
        java.util.concurrent.atomic.AtomicReference atomicReference = ajtb.a;
        if (atomicReference.get() == null) {
            ajtb ajtbVar = new ajtb(context);
            if (defpackage.anty.aq(atomicReference, ajtbVar)) {
                context.registerReceiver(ajtbVar, new android.content.IntentFilter("android.intent.action.USER_UNLOCKED"));
            }
        }
    }

    public final int hashCode() {
        return this.i.hashCode();
    }

    public final boolean i() {
        return "[DEFAULT]".equals(e());
    }

    public final java.lang.String toString() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        defpackage.aehj.bX("name", this.i, arrayList);
        defpackage.aehj.bX("options", this.j, arrayList);
        return defpackage.aehj.bW(arrayList, this);
    }
}
