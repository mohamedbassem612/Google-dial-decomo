package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class apnr {
    public static final java.util.Map a;
    private static final java.util.concurrent.CopyOnWriteArraySet b = new java.util.concurrent.CopyOnWriteArraySet();

    static {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.lang.Package r2 = defpackage.apje.class.getPackage();
        java.lang.String name = r2 != null ? r2.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        linkedHashMap.put(defpackage.apje.class.getName(), "okhttp.OkHttpClient");
        linkedHashMap.put(defpackage.apmk.class.getName(), "okhttp.Http2");
        linkedHashMap.put(defpackage.apkc.class.getName(), "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        a = defpackage.ajsz.aS(linkedHashMap);
    }

    public static final void a() {
        try {
            for (java.util.Map.Entry entry : a.entrySet()) {
                java.lang.String str = (java.lang.String) entry.getKey();
                java.lang.String str2 = (java.lang.String) entry.getValue();
                java.util.logging.Logger logger = java.util.logging.Logger.getLogger(str);
                if (b.add(logger)) {
                    logger.setUseParentHandlers(false);
                    logger.setLevel(android.util.Log.isLoggable(str2, 3) ? java.util.logging.Level.FINE : android.util.Log.isLoggable(str2, 4) ? java.util.logging.Level.INFO : java.util.logging.Level.WARNING);
                    logger.addHandler(defpackage.apns.a);
                }
            }
        } catch (java.lang.RuntimeException e) {
            java.lang.System.err.println("Possibly running android unit test without robolectric");
            e.printStackTrace();
        } catch (java.lang.UnsatisfiedLinkError e2) {
            java.lang.System.err.println("Possibly running android unit test without robolectric");
            e2.printStackTrace();
        }
    }
}
