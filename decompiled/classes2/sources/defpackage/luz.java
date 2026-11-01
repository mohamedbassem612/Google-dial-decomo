package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class luz extends android.os.HandlerThread implements android.os.Handler.Callback {
    public android.os.Handler a;
    final /* synthetic */ defpackage.lvb b;
    private final ojo c;
    private final java.lang.StringBuilder d;
    private final java.util.Set e;
    private final java.util.Set f;
    private final java.util.Set g;
    private final java.util.List h;
    private byte[] i;
    private int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public luz(defpackage.lvb lvbVar) {
        super("ContactPhotoLoader");
        j$.util.Objects.requireNonNull(lvbVar);
        this.b = lvbVar;
        this.d = new java.lang.StringBuilder();
        this.e = new java.util.HashSet();
        this.f = new java.util.HashSet();
        this.g = new java.util.HashSet();
        this.h = new java.util.ArrayList();
        this.j = 0;
        this.c = ((luy) agab.aH(lvbVar.g, luy.class)).aZ();
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00ea A[Catch: all -> 0x00f5, TRY_LEAVE, TryCatch #1 {all -> 0x00f5, blocks: (B:43:0x00d2, B:45:0x00d8, B:46:0x00ea), top: B:61:0x00d2 }] */
    private final void c(boolean z) throws java.lang.Throwable {
        java.lang.Throwable th;
        java.util.Set set = this.e;
        if (set.isEmpty()) {
            return;
        }
        if (!z && this.j == 1) {
            java.util.Iterator it = set.iterator();
            while (it.hasNext()) {
                this.h.remove((java.lang.Long) it.next());
            }
            if (this.h.isEmpty()) {
                this.j = 2;
            }
        }
        java.lang.StringBuilder sb = this.d;
        sb.setLength(0);
        sb.append("_id IN(");
        for (int i = 0; i < set.size(); i++) {
            if (i != 0) {
                sb.append(',');
            }
            sb.append('?');
        }
        sb.append(')');
        android.database.Cursor cursorB = this.c.b(android.provider.ContactsContract.Data.CONTENT_URI, defpackage.lvb.e, sb.toString(), (java.lang.String[]) this.f.toArray(defpackage.lvb.d), (java.lang.String) null);
        if (cursorB != null) {
            while (cursorB.moveToNext()) {
                try {
                    java.lang.Long lValueOf = java.lang.Long.valueOf(cursorB.getLong(0));
                    this.b.g(lValueOf, cursorB.getBlob(1), z);
                    set.remove(lValueOf);
                } catch (java.lang.Throwable th2) {
                    try {
                        cursorB.close();
                        throw th2;
                    } catch (java.lang.Throwable th3) {
                        th2.addSuppressed(th3);
                        throw th2;
                    }
                }
            }
        }
        if (cursorB != null) {
            cursorB.close();
        }
        for (java.lang.Long l : this.e) {
            android.database.Cursor cursor = null;
            if (android.provider.ContactsContract.isProfileId(l.longValue())) {
                try {
                    android.database.Cursor cursorB2 = this.c.b(android.content.ContentUris.withAppendedId(android.provider.ContactsContract.Data.CONTENT_URI, l.longValue()), defpackage.lvb.e, (java.lang.String) null, (java.lang.String[]) null, (java.lang.String) null);
                    if (cursorB2 != null) {
                        try {
                            if (cursorB2.moveToFirst()) {
                                this.b.g(java.lang.Long.valueOf(cursorB2.getLong(0)), cursorB2.getBlob(1), z);
                            } else {
                                this.b.g(l, null, z);
                            }
                        } catch (java.lang.Throwable th4) {
                            th = th4;
                            cursor = cursorB2;
                            if (cursor == null) {
                                throw th;
                            }
                            cursor.close();
                            throw th;
                        }
                    } else {
                        this.b.g(l, null, z);
                    }
                    if (cursorB2 != null) {
                        cursorB2.close();
                    }
                } catch (java.lang.Throwable th5) {
                    th = th5;
                }
            } else {
                this.b.g(l, null, z);
            }
        }
        this.b.k.sendEmptyMessage(2);
    }

    private final void d() {
        android.net.Uri uriBuild;
        java.io.InputStream inputStream;
        java.util.Iterator it = this.g.iterator();
        while (it.hasNext()) {
            android.net.Uri uri = ((defpackage.lva) it.next()).b;
            aimz aimzVar = defpackage.luu.a;
            if (android.text.TextUtils.isEmpty(uri.getEncodedFragment())) {
                uriBuild = uri;
            } else {
                android.net.Uri.Builder builderBuildUpon = uri.buildUpon();
                builderBuildUpon.encodedFragment(null);
                uriBuild = builderBuildUpon.build();
            }
            if (this.i == null) {
                this.i = new byte[16384];
            }
            try {
                java.lang.String scheme = uriBuild.getScheme();
                if (scheme.equals("http") || scheme.equals("https")) {
                    android.net.TrafficStats.setThreadStatsTag(1);
                    try {
                        java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) new java.net.URL(uriBuild.toString()).openConnection();
                        java.lang.String str = this.b.m;
                        if (!android.text.TextUtils.isEmpty(str)) {
                            httpURLConnection.setRequestProperty("User-Agent", str);
                        }
                        try {
                            inputStream = httpURLConnection.getInputStream();
                        } catch (java.io.IOException unused) {
                            httpURLConnection.disconnect();
                            inputStream = null;
                        }
                        android.net.TrafficStats.clearThreadStatsTag();
                    } catch (java.lang.Throwable th) {
                        android.net.TrafficStats.clearThreadStatsTag();
                        throw th;
                    }
                } else {
                    ojo ojoVar = this.c;
                    aooh.f(uriBuild, "uri");
                    inputStream = ojoVar.a.getContentResolver().openInputStream(uriBuild);
                }
                java.io.InputStream inputStream2 = inputStream;
                if (inputStream2 != null) {
                    java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                    while (true) {
                        try {
                            int i = inputStream2.read(this.i);
                            if (i == -1) {
                                break;
                            } else {
                                byteArrayOutputStream.write(this.i, 0, i);
                            }
                        } catch (java.lang.Throwable th2) {
                            inputStream2.close();
                            throw th2;
                        }
                    }
                    inputStream2.close();
                    defpackage.lvb lvbVar = this.b;
                    lvbVar.g(uri, byteArrayOutputStream.toByteArray(), false);
                    lvbVar.k.sendEmptyMessage(2);
                } else {
                    this.b.g(uri, null, false);
                }
            } catch (java.lang.Exception | java.lang.OutOfMemoryError e) {
                a.bq(defpackage.lvb.c.c(), "failed to load contact photo by Uri", "com/android/dialer/contactphoto/ContactPhotoManagerImpl$LoaderThread", "loadUriBasedPhotos", (char) 1182, "ContactPhotoManagerImpl.java", e, zct.b);
                this.b.g(uri, null, false);
            }
        }
    }

    public final void a() {
        if (this.a == null) {
            this.a = new android.os.Handler(getLooper(), this);
        }
    }

    public final void b() {
        if (this.j != 2) {
            a();
            if (this.a.hasMessages(1)) {
                return;
            }
            this.a.sendEmptyMessageDelayed(0, 1000L);
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message message) throws java.lang.Throwable {
        int i;
        java.lang.Throwable th;
        android.database.Cursor cursorB;
        java.lang.ref.Reference reference;
        int i2 = message.what;
        if (i2 != 0) {
            if (i2 == 1) {
                defpackage.lvb lvbVar = this.b;
                if (zqz.a(lvbVar.g, "android.permission.READ_CONTACTS")) {
                    java.util.Set set = this.e;
                    java.util.Set set2 = this.f;
                    java.util.Set set3 = this.g;
                    set.clear();
                    set2.clear();
                    set3.clear();
                    boolean z = false;
                    for (defpackage.lva lvaVar : lvbVar.j.values()) {
                        defpackage.lux luxVar = (defpackage.lux) lvbVar.h.get(lvaVar.a());
                        if (luxVar != defpackage.lvb.f) {
                            if (luxVar != null && luxVar.a != null && luxVar.b && ((reference = luxVar.d) == null || reference.get() == null)) {
                                defpackage.lvb.h(luxVar);
                                z = true;
                            } else if (luxVar == null || !luxVar.b) {
                                if (lvaVar.b != null) {
                                    set3.add(lvaVar);
                                } else {
                                    long j = lvaVar.a;
                                    set.add(java.lang.Long.valueOf(j));
                                    set2.add(java.lang.String.valueOf(j));
                                }
                            }
                        }
                    }
                    if (z) {
                        lvbVar.k.sendEmptyMessage(2);
                    }
                    c(false);
                    d();
                    b();
                    return true;
                }
            }
        } else if (zqz.a(this.b.g, "android.permission.READ_CONTACTS") && (i = this.j) != 2) {
            if (i == 0) {
                try {
                    cursorB = this.c.b(android.provider.ContactsContract.Contacts.CONTENT_URI.buildUpon().appendQueryParameter("directory", "0").appendQueryParameter("limit", "100").build(), new java.lang.String[]{"photo_id"}, "photo_id NOT NULL AND photo_id!=0", (java.lang.String[]) null, "starred DESC, last_time_contacted DESC");
                    if (cursorB != null) {
                        while (cursorB.moveToNext()) {
                            try {
                                this.h.add(0, java.lang.Long.valueOf(cursorB.getLong(0)));
                            } catch (java.lang.Throwable th2) {
                                th = th2;
                                if (cursorB == null) {
                                    throw th;
                                }
                                cursorB.close();
                                throw th;
                            }
                        }
                    }
                    if (cursorB != null) {
                        cursorB.close();
                    }
                    if (this.h.isEmpty()) {
                        this.j = 2;
                    } else {
                        this.j = 1;
                    }
                    b();
                } catch (java.lang.Throwable th3) {
                    th = th3;
                    cursorB = null;
                }
            } else {
                defpackage.lvb lvbVar2 = this.b;
                if (lvbVar2.h.size() > lvbVar2.i) {
                    this.j = 2;
                } else {
                    java.util.Set set4 = this.e;
                    set4.clear();
                    java.util.Set set5 = this.f;
                    set5.clear();
                    java.util.List list = this.h;
                    int size = list.size();
                    while (size > 0 && set4.size() < 25) {
                        size--;
                        java.lang.Long l = (java.lang.Long) list.get(size);
                        set4.add(l);
                        set5.add(l.toString());
                        list.remove(size);
                    }
                    c(true);
                    if (size == 0) {
                        this.j = 2;
                    }
                    b();
                }
            }
        }
        return true;
    }
}
