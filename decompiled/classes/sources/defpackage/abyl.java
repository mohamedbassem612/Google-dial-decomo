package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class abyl {
    public static final /* synthetic */ int a = 0;
    private static android.os.UserManager b = null;
    private static volatile boolean c = false;
    private static boolean d = false;

    private abyl() {
    }

    public static android.content.Context a(android.content.Context context) {
        return !aa$.ExternalSyntheticApiModelOutline1.m(context) ? aa$.ExternalSyntheticApiModelOutline1.m(context) : context;
    }

    public static defpackage.ajcq b(android.content.Context context, defpackage.ajas ajasVar, java.util.concurrent.Executor executor) {
        if (h(context)) {
            defpackage.ajdk ajdkVar = new defpackage.ajdk(ajasVar);
            executor.execute(ajdkVar);
            return ajdkVar;
        }
        defpackage.ajdd ajddVar = new defpackage.ajdd();
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = new java.util.concurrent.atomic.AtomicBoolean();
        abyk abykVar = new abyk(atomicBoolean, context, ajddVar, ajasVar, executor);
        context.registerReceiver(abykVar, new android.content.IntentFilter("android.intent.action.USER_UNLOCKED"));
        if (h(context) && atomicBoolean.compareAndSet(false, true)) {
            f(context, abykVar);
            defpackage.ajdk ajdkVar2 = new defpackage.ajdk(ajasVar);
            executor.execute(ajdkVar2);
            ajddVar.q(ajdkVar2);
        } else {
            ajddVar.c(new abyj(ajddVar, atomicBoolean, context, abykVar), defpackage.ajbm.INSTANCE);
        }
        return ajddVar;
    }

    public static defpackage.ajcq c(android.content.Context context, java.util.concurrent.Callable callable, java.util.concurrent.Executor executor) {
        return b(context, new defpackage.xbw(callable, 16), executor);
    }

    public static defpackage.ajcq d(android.content.Context context, java.lang.Runnable runnable) {
        return c(context, java.util.concurrent.Executors.callable(runnable, null), defpackage.ajbm.INSTANCE);
    }

    public static defpackage.ajcq e(android.content.Context context, java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
        return c(context, java.util.concurrent.Executors.callable(runnable, null), executor);
    }

    public static void f(android.content.Context context, android.content.BroadcastReceiver broadcastReceiver) {
        try {
            context.unregisterReceiver(broadcastReceiver);
        } catch (java.lang.IllegalArgumentException e) {
            android.util.Log.w("DirectBootUtils", "Failed to unregister receiver", e);
        }
    }

    public static synchronized void g() {
        d = true;
    }

    public static boolean h(android.content.Context context) {
        boolean zJ;
        if (c) {
            return true;
        }
        synchronized (defpackage.abyl.class) {
            if (c) {
                return true;
            }
            if (d) {
                java.util.List<android.content.pm.ResolveInfo> listQueryIntentServices = context.getPackageManager().queryIntentServices(new android.content.Intent().setClassName(context, com.google.android.libraries.directboot.DirectBootHelperService.class.getName()), 268435968);
                zJ = false;
                if (listQueryIntentServices != null && !listQueryIntentServices.isEmpty()) {
                    java.util.Iterator<android.content.pm.ResolveInfo> it = listQueryIntentServices.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            zJ = true;
                            break;
                        }
                        if (aa$.ExternalSyntheticApiModelOutline1.m(it.next().serviceInfo)) {
                            android.util.Log.w("DirectBootUtils", "Falling back to user manager.");
                            d = false;
                            zJ = j(context);
                            break;
                        }
                    }
                }
            } else {
                zJ = j(context);
            }
            if (zJ) {
                c = true;
            }
            return zJ;
        }
    }

    public static boolean i(android.content.Context context) {
        return h(context);
    }

    private static boolean j(android.content.Context context) {
        boolean z = true;
        int i = 1;
        while (true) {
            if (i <= 2) {
                android.os.UserManager userManager = b;
                if (userManager == null) {
                    userManager = (android.os.UserManager) context.getSystemService(android.os.UserManager.class);
                    b = userManager;
                }
                if (userManager != null) {
                    try {
                        if (aa$.ExternalSyntheticApiModelOutline1.m(userManager) || !userManager.isUserRunning(android.os.Process.myUserHandle())) {
                            break;
                            break;
                        }
                        break;
                    } catch (java.lang.NullPointerException e) {
                        android.util.Log.w("DirectBootUtils", "Failed to check if user is unlocked.", e);
                        b = null;
                        i++;
                    }
                }
                return z;
            }
            z = false;
            break;
        }
        if (z) {
            b = null;
        }
        return z;
    }
}
