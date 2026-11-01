package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xkp {
    public static final java.util.Set a = new java.util.LinkedHashSet();
    public final java.lang.String b;
    public android.os.Messenger c;
    private final java.lang.String d;
    private final aoir e;
    private final aoir f;
    private final defpackage.adsq g;

    public xkp(final java.util.function.Supplier supplier, java.lang.Class cls) {
        java.lang.String name = cls.getName();
        aooh.e(name, "getName(...)");
        aooh.f(name, "serviceClassName");
        aoir aoirVarAg = aooc.ag(new aomy() { // from class: xko
            public final java.lang.Object a() {
                java.util.Set set = defpackage.xkp.a;
                java.lang.Object objM = aa$.ExternalSyntheticApiModelOutline1.m(supplier);
                aooh.e(objM, "get(...)");
                return new defpackage.xpy((android.content.Context) objM);
            }
        });
        aooh.f(name, "serviceClassName");
        this.d = "com.google.android.setupwizard";
        this.b = name;
        this.e = aoirVarAg;
        if ("com.google.android.setupwizard".length() == 0 || name.length() == 0) {
            throw new java.lang.IllegalArgumentException("Empty controller package name or service class name.");
        }
        this.f = aooc.ag(new aomy() { // from class: xkm
            public final java.lang.Object a() {
                java.util.Set set = defpackage.xkp.a;
                return ((android.content.Context) aa$.ExternalSyntheticApiModelOutline1.m(supplier)).getApplicationContext();
            }
        });
        this.g = new defpackage.adsq(this, 1);
    }

    public final android.content.Context a() {
        java.lang.Object objA = this.f.a();
        aooh.e(objA, "getValue(...)");
        return (android.content.Context) objA;
    }

    public final java.lang.AutoCloseable b() {
        if (!((defpackage.xpz) this.e.a()).e(354143470L)) {
            defpackage.xox.b("KeepAliveManager", "[KeepAlive] Feature is disabled.");
            return new defpackage.xkn(1);
        }
        java.lang.String packageName = a().getPackageName();
        java.lang.String str = this.d;
        if (packageName.equals(str)) {
            throw new java.lang.IllegalArgumentException("Invalid keep alive request from the controller app itself.");
        }
        defpackage.viw viwVar = new defpackage.viw(this, 2);
        java.util.Set set = a;
        set.add(viwVar);
        defpackage.xox.d("KeepAliveManager", "[KeepAlive] KeepAlive request from " + a().getPackageName() + ". Request count: " + set.size());
        if (set.size() == 1) {
            android.content.Intent intent = new android.content.Intent("com.android.onboarding.process.onboardinghost.ACTION_BIND_ONBOARDING_CONTROLLER");
            intent.setComponent(new android.content.ComponentName(str, "com.android.onboarding.process.onboardinghost.KeepAliveControllerService"));
            defpackage.adsq adsqVar = this.g;
            android.content.Context contextA = a();
            aooh.f(adsqVar, "<this>");
            aooh.f(contextA, "context");
            try {
                if (contextA.bindService(intent, adsqVar, 1)) {
                    defpackage.xox.d("KeepAliveManager", "[KeepAlive] Client " + a().getPackageName() + " with UID " + android.os.Process.myUid() + " is bound to " + intent.getComponent());
                }
            } catch (java.lang.Exception e) {
                defpackage.xox.f("ServiceConnection", contextA.getPackageName() + " with UID " + android.os.Process.myUid() + " failed to bind service " + intent, e);
            }
            try {
                contextA.unbindService(adsqVar);
            } catch (java.lang.Exception e2) {
                defpackage.xox.f("ServiceConnection", contextA.getPackageName() + " with UID " + android.os.Process.myUid() + " failed to unbind service as a part of clean up: " + intent, e2);
            }
            a.remove(viwVar);
            return new defpackage.xkn(0);
        }
        return viwVar;
    }

    public final void c() throws android.os.RemoteException {
        defpackage.xox.b("KeepAliveManager", "[KeepAlive] Client " + a().getPackageName() + " with UID " + android.os.Process.myUid() + " requesting unbind from controller.");
        if (this.c == null) {
            defpackage.xox.e("KeepAliveManager", "[KeepAlive] Race condition: messenger is not initialized when requested to unbind.");
            return;
        }
        android.os.Messenger messenger = null;
        android.os.Message messageObtain = android.os.Message.obtain((android.os.Handler) null, 2);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("package", a().getPackageName());
        bundle.putInt("android.intent.extra.UID", android.os.Process.myUid());
        messageObtain.setData(bundle);
        try {
            android.os.Messenger messenger2 = this.c;
            if (messenger2 == null) {
                aooh.j("messenger");
            } else {
                messenger = messenger2;
            }
            messenger.send(messageObtain);
            defpackage.xff.k(this.g, a());
        } catch (android.os.DeadObjectException unused) {
            defpackage.xox.e("KeepAliveManager", "[KeepAlive] Connection with controller died. No need to unbind anymore.");
        }
    }
}
