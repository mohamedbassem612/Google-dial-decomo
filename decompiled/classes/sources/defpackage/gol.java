package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gol {
    private static final defpackage.aonj a = new defpackage.een(10);

    /* JADX WARN: Code duplicated, block: B:30:0x006e A[Catch: all -> 0x00b2, TryCatch #0 {all -> 0x00b2, blocks: (B:18:0x0030, B:20:0x0039, B:22:0x003f, B:24:0x0047, B:26:0x004d, B:28:0x0055, B:32:0x0077, B:34:0x008c, B:38:0x0096, B:39:0x009b, B:40:0x00ad, B:30:0x006e, B:31:0x0073), top: B:56:0x0030, outer: #1 }] */
    /* JADX WARN: Type inference failed for: r11v2, types: [gom, java.lang.Object] */
    public static final defpackage.gom a(android.content.Context context) {
        java.lang.ClassLoader classLoader;
        androidx.window.extensions.embedding.ActivityEmbeddingComponent activityEmbeddingComponentL;
        java.lang.ClassLoader classLoader2;
        if (context == null) {
            defpackage.aooh.i("context");
        }
        defpackage.aonj aonjVar = a;
        defpackage.goy goyVar = defpackage.goy.a;
        if (context == null) {
            defpackage.aooh.i("context");
        }
        if (defpackage.goy.a == null) {
            java.util.concurrent.locks.ReentrantLock reentrantLock = defpackage.goy.b;
            reentrantLock.lock();
            try {
                if (defpackage.goy.a == null) {
                    android.content.Context applicationContext = context.getApplicationContext();
                    if (applicationContext == null) {
                        defpackage.aooh.g();
                    }
                    int i = new defpackage.gms().a;
                    defpackage.gou gouVar = null;
                    try {
                        java.lang.Integer.valueOf(i).getClass();
                        if (i > 0 && defpackage.gus.M() && (classLoader = defpackage.gom.class.getClassLoader()) != null) {
                            if (!defpackage.gus.M() || (classLoader2 = defpackage.gou.class.getClassLoader()) == null) {
                                activityEmbeddingComponentL = defpackage.gus.L();
                            } else {
                                defpackage.gne gneVar = new defpackage.gne(classLoader2, null);
                                androidx.window.extensions.WindowExtensions windowExtensionsM = ddz$.ExternalSyntheticApiModelOutline0.m();
                                defpackage.aooh.e(windowExtensionsM, "getWindowExtensions(...)");
                                activityEmbeddingComponentL = new defpackage.kgl(classLoader2, gneVar, windowExtensionsM).z();
                                if (activityEmbeddingComponentL == null) {
                                    activityEmbeddingComponentL = defpackage.gus.L();
                                }
                            }
                            defpackage.goe goeVar = new defpackage.goe(new defpackage.gne(classLoader));
                            defpackage.gne gneVar2 = new defpackage.gne(classLoader, null);
                            if (i >= 8) {
                                new defpackage.gpd(activityEmbeddingComponentL, goeVar);
                            }
                            if (i >= 6) {
                                if (activityEmbeddingComponentL == null) {
                                    defpackage.aooh.i("embeddingExtension");
                                }
                                new java.util.concurrent.locks.ReentrantLock();
                                new android.util.ArrayMap();
                                new defpackage.gms().a(6);
                            }
                            gouVar = new defpackage.gou(activityEmbeddingComponentL, goeVar, gneVar2, applicationContext);
                        }
                    } catch (java.lang.Throwable th) {
                        th.toString();
                        android.util.Log.d("EmbeddingBackend", "Failed to load embedding extension: ".concat(th.toString()));
                    }
                    if (gouVar == null) {
                        android.util.Log.d("EmbeddingBackend", "No supported embedding extension found");
                    }
                    defpackage.goy.a = new defpackage.goy(applicationContext, gouVar);
                }
                reentrantLock.unlock();
            } catch (java.lang.Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        }
        defpackage.goy goyVar2 = defpackage.goy.a;
        if (goyVar2 == null) {
            defpackage.aooh.g();
        }
        return aonjVar.a(goyVar2);
    }
}
