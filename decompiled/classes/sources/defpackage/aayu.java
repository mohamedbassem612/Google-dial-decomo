package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aayu implements defpackage.aayo {
    static final java.lang.Integer b;
    static final java.lang.Long c;
    static final java.lang.String d;
    public static final /* synthetic */ int l = 0;
    public final java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock e;
    public volatile byte f;
    public final java.util.concurrent.ConcurrentMap g;
    public final java.util.concurrent.ConcurrentMap h;
    public final java.util.concurrent.ConcurrentMap i;
    public java.lang.Object j;
    public final defpackage.aazc k;
    private final java.util.concurrent.locks.ReentrantReadWriteLock n;
    private final java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock o;
    private final java.util.concurrent.ConcurrentMap p;
    private final java.util.concurrent.ConcurrentMap q;
    private boolean r;
    private final java.lang.String[] s;
    private static final java.lang.String[] m = new java.lang.String[0];
    static final java.lang.Boolean a = new java.lang.Boolean(false);

    static {
        new java.lang.Float(Float.NaN);
        b = new java.lang.Integer(-1);
        c = new java.lang.Long(-1L);
        d = new java.lang.String("");
    }

    public aayu() {
        java.util.concurrent.locks.ReentrantReadWriteLock reentrantReadWriteLock = new java.util.concurrent.locks.ReentrantReadWriteLock(true);
        this.n = reentrantReadWriteLock;
        this.e = reentrantReadWriteLock.readLock();
        this.o = reentrantReadWriteLock.writeLock();
        this.f = (byte) 0;
        this.p = new j$.util.concurrent.ConcurrentHashMap();
        this.g = new j$.util.concurrent.ConcurrentHashMap(5);
        this.h = new j$.util.concurrent.ConcurrentHashMap(5);
        this.i = new j$.util.concurrent.ConcurrentHashMap(5);
        this.q = new j$.util.concurrent.ConcurrentHashMap(5);
        this.j = null;
        this.r = false;
        this.s = m;
        this.k = new defpackage.aazc(null);
    }

    private static java.lang.String f(java.lang.String str, java.lang.String str2) {
        return str == d ? str2 : str;
    }

    private final void g() {
        java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock writeLock = this.o;
        writeLock.lock();
        try {
            if (this.f == 2) {
                writeLock.unlock();
                return;
            }
            this.p.clear();
            this.g.clear();
            this.h.clear();
            this.i.clear();
            this.q.clear();
            this.j = new java.lang.Object();
            this.r = false;
            this.f = (byte) 2;
            this.o.unlock();
        } catch (java.lang.Throwable th) {
            this.o.unlock();
            throw th;
        }
    }

    @Override // defpackage.aayo
    public final java.lang.String a(android.content.ContentResolver contentResolver, java.lang.String str, java.lang.String str2) {
        java.lang.String string;
        e(contentResolver);
        c(contentResolver);
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.e;
        readLock.lock();
        try {
            java.lang.Object obj = this.j;
            java.lang.String str3 = (java.lang.String) this.p.get(str);
            if (str3 != null) {
                java.lang.String strF = f(str3, str2);
                readLock.unlock();
                return strF;
            }
            this.e.unlock();
            try {
                android.net.Uri uri = defpackage.aayn.a;
                android.content.ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
                try {
                    if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                        throw new defpackage.aayt("Unable to acquire ContentProviderClient");
                    }
                    try {
                        android.database.Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uri, null, null, new java.lang.String[]{str}, null);
                        try {
                            if (cursorQuery == null) {
                                throw new defpackage.aayt("ContentProvider query returned null cursor");
                            }
                            if (cursorQuery.moveToFirst()) {
                                string = cursorQuery.getString(1);
                                cursorQuery.close();
                                contentProviderClientAcquireUnstableContentProviderClient.release();
                            } else {
                                cursorQuery.close();
                                contentProviderClientAcquireUnstableContentProviderClient.release();
                                string = null;
                            }
                            if (string != null && string.equals(str2)) {
                                string = str2;
                            }
                            this.e.lock();
                            try {
                                if (obj == this.j) {
                                    this.p.put(str, string == null ? d : string);
                                }
                                this.e.unlock();
                                return string != null ? string : str2;
                            } catch (java.lang.Throwable th) {
                                this.e.unlock();
                                throw th;
                            }
                        } catch (java.lang.Throwable th2) {
                            if (cursorQuery == null) {
                                throw th2;
                            }
                            try {
                                cursorQuery.close();
                                throw th2;
                            } catch (java.lang.Throwable th3) {
                                th2.addSuppressed(th3);
                                throw th2;
                            }
                        }
                    } catch (android.os.RemoteException e) {
                        throw new defpackage.aayt(e);
                    }
                } catch (java.lang.Throwable th4) {
                    contentProviderClientAcquireUnstableContentProviderClient.release();
                    throw th4;
                }
            } catch (defpackage.aayt unused) {
                return str2;
            }
        } catch (java.lang.Throwable th5) {
            this.e.unlock();
            throw th5;
        }
    }

    public final java.lang.Object b(java.util.Map map, java.lang.String str, java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Object obj3 = map.get(str);
        return obj3 != obj2 ? obj3 : obj;
    }

    public final void c(android.content.ContentResolver contentResolver) {
        byte b2 = this.f;
        if (b2 != 0) {
            if (b2 == 1) {
                g();
                return;
            }
            return;
        }
        java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock writeLock = this.o;
        writeLock.lock();
        try {
            byte b3 = this.f;
            if (b3 == 1) {
                g();
            } else if (b3 != 2) {
                this.j = new java.lang.Object();
                this.f = (byte) 2;
                contentResolver.registerContentObserver(defpackage.aayn.a, true, new defpackage.aayr(this));
                this.o.unlock();
                return;
            }
            writeLock.unlock();
        } catch (java.lang.Throwable th) {
            this.o.unlock();
            throw th;
        }
    }

    public final void d(java.lang.Object obj, java.util.Map map, java.lang.String str, java.lang.Object obj2, java.lang.Object obj3) {
        this.o.lock();
        try {
            if (obj == this.j) {
                if (obj2 == null) {
                    obj2 = obj3;
                }
                map.put(str, obj2);
                this.p.remove(str);
            }
        } finally {
            this.o.unlock();
        }
    }

    public final void e(android.content.ContentResolver contentResolver) {
        if (contentResolver == null) {
            throw new java.lang.IllegalStateException("ContentResolver needed with GservicesDelegateSupplier.init()");
        }
    }
}
