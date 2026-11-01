package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xrr implements android.content.ComponentCallbacks2 {
    private static volatile defpackage.xrr g;
    private static volatile boolean h;
    public final defpackage.xwq a;
    public final defpackage.xxm b;
    public final defpackage.xsk c;
    public final java.util.List d = new java.util.ArrayList();
    public final defpackage.xxt e;
    public final defpackage.xfh f;
    private final defpackage.yds i;
    private final defpackage.xye j;

    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Object, java.util.Map] */
    public xrr(android.content.Context context, defpackage.xwq xwqVar, defpackage.xye xyeVar, defpackage.xxm xxmVar, defpackage.xxt xxtVar, defpackage.yds ydsVar, defpackage.xfh xfhVar, java.util.Map map, java.util.List list, java.util.List list2, defpackage.yea yeaVar, xtq xtqVar) {
        this.a = xwqVar;
        this.b = xxmVar;
        this.e = xxtVar;
        this.j = xyeVar;
        this.i = ydsVar;
        this.f = xfhVar;
        if (((defpackage.xsb) ((defpackage.xsl) xtqVar.a.get(defpackage.xsb.class))) != null) {
            throw null;
        }
        xtqVar.a(defpackage.xry.class);
        this.c = new defpackage.xsk(context, xxtVar, new defpackage.xst(this, list2, yeaVar), new defpackage.xfh(null), map, list, xwqVar, xtqVar);
    }

    public static defpackage.xrr b(android.content.Context context) {
        if (g == null) {
            com.bumptech.glide.GeneratedAppGlideModule generatedAppGlideModuleG = g(context.getApplicationContext());
            synchronized (defpackage.xrr.class) {
                if (g == null) {
                    if (h) {
                        throw new java.lang.IllegalStateException("Glide has been called recursively, this is probably an internal library error!");
                    }
                    h = true;
                    try {
                        defpackage.xsj xsjVar = new defpackage.xsj();
                        android.content.Context applicationContext = context.getApplicationContext();
                        java.util.List list = java.util.Collections.EMPTY_LIST;
                        if (android.util.Log.isLoggable("ManifestParser", 3)) {
                            android.util.Log.d("ManifestParser", "Loading Glide modules");
                        }
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        try {
                            android.content.pm.ApplicationInfo applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
                            if (applicationInfo != null && applicationInfo.metaData != null) {
                                if (android.util.Log.isLoggable("ManifestParser", 2)) {
                                    android.util.Log.v("ManifestParser", "Got app info metadata: " + java.lang.String.valueOf(applicationInfo.metaData));
                                }
                                for (java.lang.String str : applicationInfo.metaData.keySet()) {
                                    if ("GlideModule".equals(applicationInfo.metaData.get(str))) {
                                        arrayList.add(defpackage.yee.a(str));
                                        if (android.util.Log.isLoggable("ManifestParser", 3)) {
                                            android.util.Log.d("ManifestParser", a.bx(str, "Loaded Glide module: "));
                                        }
                                    }
                                }
                                if (android.util.Log.isLoggable("ManifestParser", 3)) {
                                    android.util.Log.d("ManifestParser", "Finished loading Glide modules");
                                }
                            } else if (android.util.Log.isLoggable("ManifestParser", 3)) {
                                android.util.Log.d("ManifestParser", "Got null app info metadata");
                            }
                        } catch (android.content.pm.PackageManager.NameNotFoundException e) {
                            if (android.util.Log.isLoggable("ManifestParser", 6)) {
                                android.util.Log.e("ManifestParser", "Failed to parse glide modules", e);
                            }
                        }
                        if (generatedAppGlideModuleG != null && !generatedAppGlideModuleG.c().isEmpty()) {
                            java.util.Set setC = generatedAppGlideModuleG.c();
                            java.util.Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                defpackage.yec yecVar = (defpackage.yec) it.next();
                                if (setC.contains(yecVar.getClass())) {
                                    if (android.util.Log.isLoggable("Glide", 3)) {
                                        android.util.Log.d("Glide", "AppGlideModule excludes manifest GlideModule: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(yecVar))));
                                    }
                                    it.remove();
                                }
                            }
                        }
                        if (android.util.Log.isLoggable("Glide", 3)) {
                            java.util.Iterator it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                android.util.Log.d("Glide", "Discovered GlideModule from manifest: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(((defpackage.yec) it2.next()).getClass()))));
                            }
                        }
                        xsjVar.g = generatedAppGlideModuleG != null ? generatedAppGlideModuleG.b() : null;
                        java.util.Iterator it3 = arrayList.iterator();
                        while (it3.hasNext()) {
                            ((defpackage.yec) it3.next()).d(applicationContext);
                        }
                        if (generatedAppGlideModuleG != null) {
                            generatedAppGlideModuleG.d(applicationContext);
                        }
                        if (xsjVar.d == null) {
                            long j = defpackage.xyn.a;
                            defpackage.xyj xyjVar = new defpackage.xyj(false, false);
                            xyjVar.b(defpackage.xyn.a());
                            xyjVar.a = "source";
                            xsjVar.d = xyjVar.a();
                        }
                        if (xsjVar.e == null) {
                            long j2 = defpackage.xyn.a;
                            defpackage.xyj xyjVar2 = new defpackage.xyj(true, false);
                            xyjVar2.b(1);
                            xyjVar2.a = "disk-cache";
                            xsjVar.e = xyjVar2.a();
                        }
                        if (xsjVar.h == null) {
                            int i = defpackage.xyn.a() < 4 ? 1 : 2;
                            defpackage.xyj xyjVar3 = new defpackage.xyj(true, false);
                            xyjVar3.b(i);
                            xyjVar3.a = "animation";
                            xsjVar.h = xyjVar3.a();
                        }
                        if (xsjVar.f == null) {
                            long j3 = defpackage.xyn.a;
                            defpackage.xyj xyjVar4 = new defpackage.xyj(false, true);
                            xyjVar4.b = defpackage.xyn.a;
                            xyjVar4.a = "source-unlimited";
                            xsjVar.f = xyjVar4.a();
                        }
                        if (xsjVar.l == null) {
                            xsjVar.l = new defpackage.ahox(new defpackage.xyg(applicationContext));
                        }
                        if (xsjVar.p == null) {
                            xsjVar.p = new defpackage.xfh(null);
                        }
                        if (xsjVar.c == null) {
                            int i2 = xsjVar.l.c;
                            if (i2 > 0) {
                                xsjVar.c = new defpackage.xxu(i2);
                            } else {
                                xsjVar.c = new defpackage.xxn();
                            }
                        }
                        if (xsjVar.j == null) {
                            xsjVar.j = new defpackage.xxt(xsjVar.l.b);
                        }
                        if (xsjVar.k == null) {
                            xsjVar.k = new defpackage.xye(xsjVar.l.a);
                        }
                        if (xsjVar.o == null) {
                            xsjVar.o = new defpackage.vqu(applicationContext);
                        }
                        if (xsjVar.b == null) {
                            xsjVar.b = new defpackage.xwq(xsjVar.k, xsjVar.o, xsjVar.e, xsjVar.d, xsjVar.h);
                        }
                        java.util.List list2 = xsjVar.i;
                        if (list2 == null) {
                            xsjVar.i = java.util.Collections.EMPTY_LIST;
                        } else {
                            xsjVar.i = j$.util.DesugarCollections.unmodifiableList(list2);
                        }
                        defpackage.xrr xrrVar = new defpackage.xrr(applicationContext, xsjVar.b, xsjVar.k, xsjVar.c, xsjVar.j, new defpackage.yds(xsjVar.g), xsjVar.p, xsjVar.a, xsjVar.i, arrayList, generatedAppGlideModuleG, new xtq(xsjVar.m));
                        applicationContext.registerComponentCallbacks(xrrVar);
                        g = xrrVar;
                        h = false;
                    } catch (java.lang.Throwable th) {
                        h = false;
                        throw th;
                    }
                }
            }
        }
        return g;
    }

    public static defpackage.xsx c(android.content.Context context) {
        return d(context).b(context);
    }

    public static defpackage.yds d(android.content.Context context) {
        anty.aI(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return b(context).i;
    }

    private static com.bumptech.glide.GeneratedAppGlideModule g(android.content.Context context) {
        try {
            return (com.bumptech.glide.GeneratedAppGlideModule) java.lang.Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(android.content.Context.class).newInstance(context.getApplicationContext());
        } catch (java.lang.ClassNotFoundException unused) {
            if (!android.util.Log.isLoggable("Glide", 5)) {
                return null;
            }
            android.util.Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
            return null;
        } catch (java.lang.IllegalAccessException e) {
            h(e);
            return null;
        } catch (java.lang.InstantiationException e2) {
            h(e2);
            return null;
        } catch (java.lang.NoSuchMethodException e3) {
            h(e3);
            return null;
        } catch (java.lang.reflect.InvocationTargetException e4) {
            h(e4);
            return null;
        }
    }

    private static void h(java.lang.Exception exc) {
        throw new java.lang.IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", exc);
    }

    public final android.content.Context a() {
        return this.c.getBaseContext();
    }

    public final void e() {
        defpackage.ygc.g();
        this.j.i(0L);
        this.b.c();
        this.e.b();
    }

    public final void f(int i) {
        defpackage.ygc.g();
        java.util.List<defpackage.xsx> list = this.d;
        synchronized (list) {
            for (defpackage.xsx xsxVar : list) {
            }
        }
        defpackage.xye xyeVar = this.j;
        if (i >= 40) {
            xyeVar.i(0L);
        } else if (i >= 20 || i == 15) {
            xyeVar.i(xyeVar.e() / 2);
        }
        this.b.e(i);
        this.e.d(i);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        e();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        f(i);
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(android.content.res.Configuration configuration) {
    }
}
