package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adth {
    public static final java.lang.String a = "adth";
    private static final java.util.function.Consumer d = new defpackage.adta(1);
    private static final java.util.function.Consumer e = new defpackage.adta(0);
    private static final java.util.function.Consumer f = new defpackage.adta(2);
    public final defpackage.appu c;
    private final android.content.Context g;
    private final java.util.concurrent.Executor h;
    private final defpackage.adti i;
    private final android.net.ConnectivityManager j;
    private final java.util.Map k = new java.util.HashMap();
    private final java.util.Map l = new java.util.HashMap();
    private final java.util.Queue m = new j$.util.concurrent.ConcurrentLinkedQueue();
    protected final java.util.List b = new java.util.ArrayList();
    private boolean n = false;
    private final android.content.BroadcastReceiver o = new defpackage.adtb(this);

    public adth(defpackage.adti adtiVar, android.content.Context context, java.util.concurrent.Executor executor, defpackage.appu appuVar) {
        new defpackage.adtc(this);
        this.g = context;
        this.i = adtiVar;
        this.h = executor;
        this.c = appuVar;
        this.j = (android.net.ConnectivityManager) context.getSystemService("connectivity");
    }

    public static java.lang.String a(java.io.File file, java.lang.String str) {
        return file.getAbsolutePath() + '/' + str;
    }

    public static void j(java.net.HttpURLConnection httpURLConnection) {
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (java.lang.IllegalStateException | java.lang.NullPointerException unused) {
            }
        }
    }

    private static final void o(java.util.List list, java.util.function.Consumer consumer) {
        defpackage.ailk ailkVarListIterator = ((defpackage.aify) list).listIterator(0);
        while (ailkVarListIterator.hasNext()) {
            aa$.ExternalSyntheticApiModelOutline1.m(consumer, (defpackage.adte) ailkVarListIterator.next());
        }
    }

    public final synchronized java.net.HttpURLConnection b(java.lang.String str, java.lang.String str2) {
        java.net.HttpURLConnection httpURLConnectionA;
        defpackage.adti adtiVar = this.i;
        adtiVar.e();
        if (defpackage.dvx.c(this.g, "android.permission.INTERNET") != 0) {
            throw new java.lang.IllegalStateException("Missing INTERNET permission, can't start download");
        }
        if (((defpackage.adsz) this.k.get(str)).f()) {
            throw new java.lang.IllegalStateException();
        }
        httpURLConnectionA = adtiVar.a(str2);
        java.lang.Object obj = this.c.b;
        if (obj != null) {
            httpURLConnectionA.setRequestProperty("User-Agent", (java.lang.String) obj);
        }
        this.l.put(str, httpURLConnectionA);
        return httpURLConnectionA;
    }

    protected final synchronized java.util.List c() {
        defpackage.aift aiftVar;
        aiftVar = new defpackage.aift(4);
        java.util.Iterator it = this.b.iterator();
        while (it.hasNext()) {
            defpackage.adte adteVar = (defpackage.adte) ((java.lang.ref.WeakReference) it.next()).get();
            if (adteVar == null) {
                it.remove();
            } else {
                aiftVar.i(adteVar);
            }
        }
        return aiftVar.g();
    }

    public final synchronized void d(java.io.File file, java.lang.String str) {
        java.util.Map map = this.k;
        java.lang.String strA = a(file, str);
        defpackage.adsz adszVar = (defpackage.adsz) map.get(strA);
        if (adszVar != null) {
            adszVar.d();
        } else {
            android.util.Log.v(a, "Attempted to setCanceled unknown request: ".concat(strA));
        }
        j((java.net.HttpURLConnection) this.l.get(strA));
        if (adszVar != null) {
            g();
        }
    }

    public final synchronized void e() {
        defpackage.adti adtiVar = this.i;
        adtiVar.b();
        adtiVar.c();
    }

    public final void f(defpackage.adsz adszVar) {
        java.util.List listC;
        adszVar.c();
        synchronized (this) {
            java.util.Queue queue = this.m;
            boolean zIsEmpty = queue.isEmpty();
            queue.add(adszVar);
            if (zIsEmpty) {
                this.g.registerReceiver(this.o, new android.content.IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                this.n = true;
                g();
            }
            listC = queue.containsAll(this.k.values()) ? c() : null;
        }
        if (listC != null) {
            o(listC, d);
        }
    }

    public final synchronized void g() {
        java.lang.String str = a;
        java.util.Queue queue = this.m;
        android.util.Log.d(str, "Running " + queue.size() + " requests pending connectivity");
        java.util.Iterator it = queue.iterator();
        while (it.hasNext()) {
            defpackage.adsz adszVar = (defpackage.adsz) it.next();
            if (adszVar.f() || k(adszVar.a())) {
                it.remove();
                adszVar.b();
                i(adszVar);
            }
        }
        if (queue.isEmpty() && this.n) {
            this.g.unregisterReceiver(this.o);
            this.n = false;
        }
    }

    public final synchronized void h(defpackage.adte adteVar) {
        this.b.add(new java.lang.ref.WeakReference(adteVar));
    }

    public final void i(defpackage.adsz adszVar) {
        o(c(), e);
        this.h.execute(new defpackage.adtd(this, adszVar));
    }

    public final synchronized boolean k(defpackage.adsy adsyVar) {
        if (adsyVar == defpackage.adsy.c) {
            return true;
        }
        if (defpackage.dvx.c(this.g, "android.permission.ACCESS_NETWORK_STATE") != 0) {
            throw new java.lang.IllegalStateException("Attempting to determine connectivity without the ACCESS_NETWORK_STATE permission.");
        }
        android.net.ConnectivityManager connectivityManager = this.j;
        android.net.NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isAvailable()) {
            android.util.Log.d(a, "No current network, connectivity cannot be satisfied.");
        } else {
            this.i.e();
            if (activeNetworkInfo.isConnected()) {
                int iOrdinal = adsyVar.ordinal();
                if (iOrdinal == 0) {
                    if (connectivityManager.isActiveNetworkMetered() && activeNetworkInfo.getType() != 1 && activeNetworkInfo.getType() != 9 && activeNetworkInfo.getType() != 17) {
                    }
                    return true;
                }
                if (iOrdinal != 1) {
                    android.util.Log.e(a, "Unknown connectivity type checked: ".concat(java.lang.String.valueOf(adsyVar.name())));
                } else if (activeNetworkInfo.getType() != 0 && activeNetworkInfo.getType() != 4 && activeNetworkInfo.getType() != 6 && activeNetworkInfo.getType() != 7 && activeNetworkInfo.getType() != 1 && activeNetworkInfo.getType() != 9 && activeNetworkInfo.getType() != 16 && activeNetworkInfo.getType() != 17) {
                }
                return true;
            }
            android.util.Log.d(a, "Network disconnected, connectivity cannot be satisfied.");
        }
        return false;
    }

    final synchronized boolean l(defpackage.adsz adszVar) {
        java.io.File file = adszVar.b;
        java.lang.String str = adszVar.c;
        java.util.Map map = this.k;
        java.lang.String strA = a(file, str);
        if (map.containsKey(strA)) {
            android.util.Log.i(a, "Request is already being executed for key: ".concat(strA));
            return false;
        }
        map.put(strA, adszVar);
        i(adszVar);
        return true;
    }

    public final void m(java.io.File file, java.lang.String str, defpackage.adsx adsxVar, defpackage.adsw adswVar, java.io.File file2) {
        java.util.List listC;
        java.util.List listC2;
        java.lang.String strA = a(file, str);
        synchronized (this) {
            java.util.Map map = this.k;
            map.remove(strA);
            this.l.remove(strA);
            listC = null;
            if (map.isEmpty()) {
                listC = c();
                listC2 = null;
            } else {
                listC2 = this.m.containsAll(map.values()) ? c() : null;
            }
        }
        if (adswVar == null) {
            adsxVar.b(file2);
        } else {
            adsxVar.a(file2, adswVar);
        }
        if (listC != null) {
            o(listC, f);
        } else if (listC2 != null) {
            o(listC2, d);
        }
    }

    public final synchronized void n(java.net.HttpURLConnection httpURLConnection, int i) {
        if (i != -1) {
            this.i.d(httpURLConnection, i);
        }
    }
}
