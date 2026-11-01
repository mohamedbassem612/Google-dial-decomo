package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xtd implements java.io.Closeable {
    public final java.io.File a;
    public final java.io.File b;
    public final java.io.File c;
    public java.io.Writer f;
    public int h;
    private final java.io.File j;
    public long e = 0;
    public final java.util.LinkedHashMap g = new java.util.LinkedHashMap(0, 0.75f, true);
    private long m = 0;
    final java.util.concurrent.ThreadPoolExecutor i = new java.util.concurrent.ThreadPoolExecutor(0, 1, 60, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.LinkedBlockingQueue(), new defpackage.xsz());
    private final java.util.concurrent.Callable n = new defpackage.ahvx(this, 1);
    private final int k = 1;
    public final int d = 1;
    private final long l = 262144000;

    public xtd(java.io.File file) {
        this.a = file;
        this.b = new java.io.File(file, "journal");
        this.c = new java.io.File(file, "journal.tmp");
        this.j = new java.io.File(file, "journal.bkp");
    }

    public static void d(java.io.File file) throws java.io.IOException {
        if (file.exists() && !file.delete()) {
            throw new java.io.IOException();
        }
    }

    public static void g(java.io.File file, java.io.File file2, boolean z) throws java.io.IOException {
        if (z) {
            d(file2);
        }
        if (!file.renameTo(file2)) {
            throw new java.io.IOException();
        }
    }

    private final void l() {
        if (this.f == null) {
            throw new java.lang.IllegalStateException("cache is closed");
        }
    }

    private static void m(java.io.Writer writer) {
        android.os.StrictMode.ThreadPolicy threadPolicy = android.os.StrictMode.getThreadPolicy();
        android.os.StrictMode.setThreadPolicy(rs$.ExternalSyntheticApiModelOutline0.m(new android.os.StrictMode.ThreadPolicy.Builder(threadPolicy)).build());
        try {
            writer.close();
        } finally {
            android.os.StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    private static void n(java.io.Writer writer) {
        android.os.StrictMode.ThreadPolicy threadPolicy = android.os.StrictMode.getThreadPolicy();
        android.os.StrictMode.setThreadPolicy(rs$.ExternalSyntheticApiModelOutline0.m(new android.os.StrictMode.ThreadPolicy.Builder(threadPolicy)).build());
        try {
            writer.flush();
        } finally {
            android.os.StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public final synchronized defpackage.xtc a(java.lang.String str) {
        l();
        defpackage.xtb xtbVar = (defpackage.xtb) this.g.get(str);
        if (xtbVar != null && xtbVar.c) {
            for (int i = 0; i < this.d; i = 1) {
                if (xtbVar.c().exists()) {
                }
            }
            this.h++;
            this.f.append((java.lang.CharSequence) "READ");
            this.f.append(' ');
            this.f.append((java.lang.CharSequence) str);
            this.f.append('\n');
            if (i()) {
                this.i.submit(this.n);
            }
            return new defpackage.xtc(this, str);
        }
        return null;
    }

    public final synchronized void b(defpackage.xta xtaVar, boolean z) {
        defpackage.xtb xtbVar = xtaVar.a;
        if (xtbVar.d != xtaVar) {
            throw new java.lang.IllegalStateException();
        }
        if (z && !xtbVar.c) {
            for (int i = 0; i < this.d; i = 1) {
                if (!xtaVar.b[0]) {
                    xtaVar.a();
                    throw new java.lang.IllegalStateException("Newly created entry didn't create value for index 0");
                }
                if (!xtbVar.d().exists()) {
                    xtaVar.a();
                    return;
                }
            }
        }
        for (int i2 = 0; i2 < this.d; i2 = 1) {
            java.io.File fileD = xtbVar.d();
            if (!z) {
                d(fileD);
            } else if (fileD.exists()) {
                java.io.File fileC = xtbVar.c();
                fileD.renameTo(fileC);
                long[] jArr = xtbVar.b;
                long j = jArr[0];
                long length = fileC.length();
                jArr[0] = length;
                this.e = (this.e - j) + length;
            }
        }
        this.h++;
        xtbVar.d = null;
        if (xtbVar.c || z) {
            xtbVar.c = true;
            this.f.append((java.lang.CharSequence) "CLEAN");
            this.f.append(' ');
            this.f.append((java.lang.CharSequence) xtbVar.a);
            this.f.append((java.lang.CharSequence) xtbVar.a());
            this.f.append('\n');
            if (z) {
                this.m++;
            }
        } else {
            java.util.LinkedHashMap linkedHashMap = this.g;
            java.lang.String str = xtbVar.a;
            linkedHashMap.remove(str);
            this.f.append((java.lang.CharSequence) "REMOVE");
            this.f.append(' ');
            this.f.append((java.lang.CharSequence) str);
            this.f.append('\n');
        }
        n(this.f);
        if (this.e > this.l || i()) {
            this.i.submit(this.n);
        }
    }

    public final void c() throws java.io.IOException {
        close();
        defpackage.xtg.b(this.a);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(this.g.values());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            defpackage.xta xtaVar = ((defpackage.xtb) arrayList.get(i)).d;
            if (xtaVar != null) {
                xtaVar.a();
            }
        }
        h();
        m(this.f);
        this.f = null;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00f3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:80:0x0104 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    public final void e() {
        java.lang.String strSubstring;
        defpackage.xtf xtfVar = new defpackage.xtf(new java.io.FileInputStream(this.b), defpackage.xtg.a);
        try {
            java.lang.String strA = xtfVar.a();
            java.lang.String strA2 = xtfVar.a();
            java.lang.String strA3 = xtfVar.a();
            java.lang.String strA4 = xtfVar.a();
            java.lang.String strA5 = xtfVar.a();
            if (!"libcore.io.DiskLruCache".equals(strA) || !"1".equals(strA2) || !java.lang.Integer.toString(this.k).equals(strA3) || !java.lang.Integer.toString(this.d).equals(strA4) || !"".equals(strA5)) {
                throw new java.io.IOException("unexpected journal header: [" + strA + ", " + strA2 + ", " + strA4 + ", " + strA5 + ']');
            }
            int i = 0;
            while (true) {
                try {
                    java.lang.String strA6 = xtfVar.a();
                    int iIndexOf = strA6.indexOf(32);
                    if (iIndexOf == -1) {
                        throw new java.io.IOException("unexpected journal line: ".concat(java.lang.String.valueOf(strA6)));
                    }
                    int i2 = iIndexOf + 1;
                    int iIndexOf2 = strA6.indexOf(32, i2);
                    if (iIndexOf2 == -1) {
                        strSubstring = strA6.substring(i2);
                        if (iIndexOf == 6) {
                            if (strA6.startsWith("REMOVE")) {
                                this.g.remove(strSubstring);
                            } else {
                                iIndexOf = 6;
                            }
                        }
                        i++;
                    } else {
                        strSubstring = strA6.substring(i2, iIndexOf2);
                    }
                    java.util.LinkedHashMap linkedHashMap = this.g;
                    defpackage.xtb xtbVar = (defpackage.xtb) linkedHashMap.get(strSubstring);
                    if (xtbVar == null) {
                        xtbVar = new defpackage.xtb(this, strSubstring);
                        linkedHashMap.put(strSubstring, xtbVar);
                    }
                    if (iIndexOf2 != -1 && iIndexOf == 5) {
                        if (!strA6.startsWith("CLEAN")) {
                            iIndexOf = 5;
                            if (iIndexOf2 != -1) {
                                if (iIndexOf2 == -1) {
                                }
                                throw new java.io.IOException("unexpected journal line: ".concat(java.lang.String.valueOf(strA6)));
                            }
                            if (iIndexOf2 == -1) {
                            }
                            throw new java.io.IOException("unexpected journal line: ".concat(java.lang.String.valueOf(strA6)));
                        }
                        java.lang.String[] strArrSplit = strA6.substring(iIndexOf2 + 1).split(" ");
                        xtbVar.c = true;
                        xtbVar.d = null;
                        if (strArrSplit.length != xtbVar.e.d) {
                            throw defpackage.xtb.e(strArrSplit);
                        }
                        for (int i3 = 0; i3 < strArrSplit.length; i3++) {
                            try {
                                xtbVar.b[i3] = java.lang.Long.parseLong(strArrSplit[i3]);
                            } catch (java.lang.NumberFormatException unused) {
                                throw defpackage.xtb.e(strArrSplit);
                            }
                        }
                    } else if (iIndexOf2 != -1 && iIndexOf == 5 && strA6.startsWith("DIRTY")) {
                        xtbVar.d = new defpackage.xta(this, xtbVar);
                    } else if (iIndexOf2 == -1 || iIndexOf != 4 || !strA6.startsWith("READ")) {
                        throw new java.io.IOException("unexpected journal line: ".concat(java.lang.String.valueOf(strA6)));
                    }
                    i++;
                } catch (java.io.EOFException unused2) {
                    this.h = i - this.g.size();
                    if (xtfVar.b == -1) {
                        f();
                    } else {
                        this.f = new java.io.BufferedWriter(new java.io.OutputStreamWriter(new java.io.FileOutputStream(this.b, true), defpackage.xtg.a));
                    }
                    defpackage.xtg.a(xtfVar);
                    return;
                }
            }
        } catch (java.lang.Throwable th) {
            defpackage.xtg.a(xtfVar);
            throw th;
        }
    }

    public final synchronized void f() {
        java.io.Writer writer = this.f;
        if (writer != null) {
            m(writer);
        }
        java.io.BufferedWriter bufferedWriter = new java.io.BufferedWriter(new java.io.OutputStreamWriter(new java.io.FileOutputStream(this.c), defpackage.xtg.a));
        try {
            bufferedWriter.write("libcore.io.DiskLruCache");
            bufferedWriter.write("\n");
            bufferedWriter.write("1");
            bufferedWriter.write("\n");
            bufferedWriter.write(java.lang.Integer.toString(this.k));
            bufferedWriter.write("\n");
            bufferedWriter.write(java.lang.Integer.toString(this.d));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (defpackage.xtb xtbVar : this.g.values()) {
                if (xtbVar.d != null) {
                    bufferedWriter.write("DIRTY " + xtbVar.a + '\n');
                } else {
                    bufferedWriter.write("CLEAN " + xtbVar.a + xtbVar.a() + '\n');
                }
            }
            m(bufferedWriter);
            java.io.File file = this.b;
            if (file.exists()) {
                g(file, this.j, true);
            }
            g(this.c, file, false);
            this.j.delete();
            this.f = new java.io.BufferedWriter(new java.io.OutputStreamWriter(new java.io.FileOutputStream(file, true), defpackage.xtg.a));
        } catch (java.lang.Throwable th) {
            m(bufferedWriter);
            throw th;
        }
    }

    public final void h() {
        while (this.e > this.l) {
            k((java.lang.String) ((java.util.Map.Entry) this.g.entrySet().iterator().next()).getKey());
        }
    }

    public final boolean i() {
        int i = this.h;
        return i >= 2000 && i >= this.g.size();
    }

    public final synchronized defpackage.xta j(java.lang.String str) {
        l();
        java.util.LinkedHashMap linkedHashMap = this.g;
        defpackage.xtb xtbVar = (defpackage.xtb) linkedHashMap.get(str);
        if (xtbVar == null) {
            xtbVar = new defpackage.xtb(this, str);
            linkedHashMap.put(str, xtbVar);
        } else if (xtbVar.d != null) {
            return null;
        }
        defpackage.xta xtaVar = new defpackage.xta(this, xtbVar);
        xtbVar.d = xtaVar;
        this.f.append((java.lang.CharSequence) "DIRTY");
        this.f.append(' ');
        this.f.append((java.lang.CharSequence) str);
        this.f.append('\n');
        n(this.f);
        return xtaVar;
    }

    public final synchronized void k(java.lang.String str) {
        l();
        java.util.LinkedHashMap linkedHashMap = this.g;
        defpackage.xtb xtbVar = (defpackage.xtb) linkedHashMap.get(str);
        if (xtbVar != null && xtbVar.d == null) {
            for (int i = 0; i < this.d; i = 1) {
                java.io.File fileC = xtbVar.c();
                if (fileC.exists() && !fileC.delete()) {
                    throw new java.io.IOException("failed to delete ".concat(fileC.toString()));
                }
                long j = this.e;
                long[] jArr = xtbVar.b;
                this.e = j - jArr[0];
                jArr[0] = 0;
            }
            this.h++;
            this.f.append((java.lang.CharSequence) "REMOVE");
            this.f.append(' ');
            this.f.append((java.lang.CharSequence) str);
            this.f.append('\n');
            linkedHashMap.remove(str);
            if (i()) {
                this.i.submit(this.n);
            }
        }
    }
}
