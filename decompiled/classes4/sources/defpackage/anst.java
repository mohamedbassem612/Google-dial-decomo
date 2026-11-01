package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public abstract class anst implements defpackage.aodl {
    private java.io.InputStream a;
    protected final defpackage.ansf b;
    protected final defpackage.anlw c;
    final int d;
    protected defpackage.antk e;
    protected defpackage.aodj f;
    protected defpackage.aodm g;
    private int h;
    private int i;
    private java.util.ArrayList j;
    private boolean k;
    private int l;
    private int m;
    private defpackage.ansr n = defpackage.ansr.a;
    private int o;
    private int p;
    private boolean q;
    private boolean r;

    public anst(defpackage.ansf ansfVar, defpackage.anlw anlwVar, int i) {
        this.b = ansfVar;
        this.c = anlwVar;
        this.d = i;
    }

    private final void f() {
        defpackage.anss anssVar;
        if (this.i == 0) {
            int i = 0;
            while (i < this.j.size() && (anssVar = (defpackage.anss) this.j.get(i)) != null) {
                i++;
                if (anssVar.d) {
                    this.i = i;
                    s();
                    return;
                }
            }
        }
    }

    private final boolean q() {
        return this.a != null || this.i > 0;
    }

    private final boolean r() {
        return this.k && this.h >= this.l;
    }

    private final void s() {
        ahvr.ci(this.f);
        defpackage.aodj.g(this.f);
        defpackage.aodj.g(this.f);
        this.o++;
    }

    protected abstract void a(anqw anqwVar);

    protected abstract void b();

    public abstract void c(int i, android.os.Parcel parcel);

    public abstract void d(int i, android.os.Parcel parcel);

    public boolean e() {
        return false;
    }

    @Override // defpackage.aodl
    public final synchronized java.io.InputStream g() {
        defpackage.ansl anslVar;
        java.io.InputStream inputStream = this.a;
        if (inputStream != null) {
            this.a = null;
        } else if (this.p <= 0 || !q()) {
            inputStream = null;
        } else {
            int i = this.i;
            this.i = 0;
            if (i == 1) {
                defpackage.anss anssVar = (defpackage.anss) this.j.remove(0);
                int i2 = anssVar.c;
                java.io.InputStream inputStream2 = anssVar.a;
                anslVar = new defpackage.ansl(anssVar.b);
            } else {
                byte[][] bArr = new byte[i][];
                int length = 0;
                for (int i3 = 0; i3 < i; i3++) {
                    byte[] bArr2 = ((defpackage.anss) this.j.remove(0)).b;
                    bArr[i3] = bArr2;
                    length += bArr2.length;
                }
                anslVar = new defpackage.ansl(bArr, length);
            }
            this.h += i;
            f();
            inputStream = anslVar;
        }
        if (inputStream != null) {
            this.p--;
        } else {
            this.r = false;
            if (r() && !p()) {
                m(defpackage.ansr.d);
                j();
                return null;
            }
        }
        return inputStream;
    }

    public final void h(anqw anqwVar, anqw anqwVar2, boolean z) {
        if (p()) {
            return;
        }
        boolean z2 = this.n != defpackage.ansr.a;
        m(defpackage.ansr.f);
        if (z2) {
            this.f.f();
        }
        if (!z) {
            defpackage.ansf ansfVar = this.b;
            int i = this.d;
            try {
                defpackage.antl antlVarC = defpackage.antl.c();
                try {
                    antlVarC.a().writeInt(0);
                    anty.o(antlVarC.a(), anty.m(antlVarC.a(), anqwVar) | 8);
                    ansfVar.w(i, antlVarC);
                    antlVarC.close();
                } catch (java.lang.Throwable th) {
                    try {
                        antlVarC.close();
                        throw th;
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } catch (anqx e) {
                defpackage.ansf.f.logp(java.util.logging.Level.FINER, "io.grpc.binder.internal.BinderTransport", "sendOutOfBandClose", "Failed sending oob close transaction", e);
            }
        }
        if (z2) {
            a(anqwVar2);
        }
        o();
    }

    final void i(anqw anqwVar) {
        h(anqw.c, anqwVar, false);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0045  */
    /* JADX WARN: Code duplicated, block: B:49:0x003f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x004f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x0064 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x003d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x0049 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x005b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x0057 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x0007 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x0007 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x0007 A[SYNTHETIC] */
    final void j() {
        int iOrdinal;
        if (this.q) {
            return;
        }
        this.q = true;
        while (true) {
            int iOrdinal2 = this.n.ordinal();
            if (iOrdinal2 != 2) {
                if (iOrdinal2 != 3 || this.g == null || !this.k) {
                    break;
                }
                iOrdinal = this.n.ordinal();
                if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        throw new java.lang.AssertionError();
                    }
                } else if (!this.r) {
                    if (q()) {
                        this.r = true;
                        this.g.d(this);
                    } else if (this.k) {
                        m(defpackage.ansr.d);
                    }
                }
                if (this.k) {
                    m(defpackage.ansr.e);
                    b();
                }
            } else {
                if (this.g == null || this.r) {
                    break;
                }
                if (q()) {
                    if (this.p == 0) {
                        break;
                    }
                    iOrdinal = this.n.ordinal();
                    if (iOrdinal != 2) {
                        if (iOrdinal != 3) {
                            throw new java.lang.AssertionError();
                        }
                    } else if (!this.r) {
                        if (q()) {
                            this.r = true;
                            this.g.d(this);
                        } else if (this.k) {
                            m(defpackage.ansr.d);
                        }
                    }
                    if (this.k) {
                        m(defpackage.ansr.e);
                        b();
                    }
                } else {
                    if (!r()) {
                        break;
                    }
                    iOrdinal = this.n.ordinal();
                    if (iOrdinal != 2) {
                        if (iOrdinal != 3) {
                            throw new java.lang.AssertionError();
                        }
                    } else if (!this.r) {
                        if (q()) {
                            this.r = true;
                            this.g.d(this);
                        } else if (this.k) {
                            m(defpackage.ansr.d);
                        }
                    }
                    if (this.k) {
                        m(defpackage.ansr.e);
                        b();
                    }
                }
            }
        }
        this.q = false;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x009f A[Catch: anqx -> 0x0147, all -> 0x0151, TryCatch #1 {anqx -> 0x0147, blocks: (B:9:0x000c, B:11:0x0019, B:14:0x0022, B:16:0x0036, B:18:0x0040, B:20:0x0045, B:22:0x004f, B:24:0x0055, B:25:0x0058, B:29:0x005f, B:31:0x0063, B:34:0x0069, B:36:0x006d, B:40:0x0074, B:41:0x0083, B:42:0x008c, B:44:0x009f, B:45:0x00a6, B:47:0x00ac, B:49:0x00b9, B:50:0x00bf, B:51:0x00c8, B:52:0x00eb, B:53:0x00ec, B:54:0x0103, B:56:0x0106, B:57:0x010d, B:59:0x0111, B:61:0x0115, B:64:0x011d, B:65:0x0128, B:68:0x0137, B:69:0x0142), top: B:81:0x000c, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00a6 A[Catch: anqx -> 0x0147, all -> 0x0151, TryCatch #1 {anqx -> 0x0147, blocks: (B:9:0x000c, B:11:0x0019, B:14:0x0022, B:16:0x0036, B:18:0x0040, B:20:0x0045, B:22:0x004f, B:24:0x0055, B:25:0x0058, B:29:0x005f, B:31:0x0063, B:34:0x0069, B:36:0x006d, B:40:0x0074, B:41:0x0083, B:42:0x008c, B:44:0x009f, B:45:0x00a6, B:47:0x00ac, B:49:0x00b9, B:50:0x00bf, B:51:0x00c8, B:52:0x00eb, B:53:0x00ec, B:54:0x0103, B:56:0x0106, B:57:0x010d, B:59:0x0111, B:61:0x0115, B:64:0x011d, B:65:0x0128, B:68:0x0137, B:69:0x0142), top: B:81:0x000c, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00ac A[Catch: anqx -> 0x0147, all -> 0x0151, LOOP:0: B:47:0x00ac->B:83:?, LOOP_START, TryCatch #1 {anqx -> 0x0147, blocks: (B:9:0x000c, B:11:0x0019, B:14:0x0022, B:16:0x0036, B:18:0x0040, B:20:0x0045, B:22:0x004f, B:24:0x0055, B:25:0x0058, B:29:0x005f, B:31:0x0063, B:34:0x0069, B:36:0x006d, B:40:0x0074, B:41:0x0083, B:42:0x008c, B:44:0x009f, B:45:0x00a6, B:47:0x00ac, B:49:0x00b9, B:50:0x00bf, B:51:0x00c8, B:52:0x00eb, B:53:0x00ec, B:54:0x0103, B:56:0x0106, B:57:0x010d, B:59:0x0111, B:61:0x0115, B:64:0x011d, B:65:0x0128, B:68:0x0137, B:69:0x0142), top: B:81:0x000c, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00bf A[Catch: anqx -> 0x0147, all -> 0x0151, TryCatch #1 {anqx -> 0x0147, blocks: (B:9:0x000c, B:11:0x0019, B:14:0x0022, B:16:0x0036, B:18:0x0040, B:20:0x0045, B:22:0x004f, B:24:0x0055, B:25:0x0058, B:29:0x005f, B:31:0x0063, B:34:0x0069, B:36:0x006d, B:40:0x0074, B:41:0x0083, B:42:0x008c, B:44:0x009f, B:45:0x00a6, B:47:0x00ac, B:49:0x00b9, B:50:0x00bf, B:51:0x00c8, B:52:0x00eb, B:53:0x00ec, B:54:0x0103, B:56:0x0106, B:57:0x010d, B:59:0x0111, B:61:0x0115, B:64:0x011d, B:65:0x0128, B:68:0x0137, B:69:0x0142), top: B:81:0x000c, outer: #0 }] */
    final synchronized void k(android.os.Parcel parcel) {
        defpackage.anss anssVar;
        int i;
        int size;
        java.util.ArrayList arrayList;
        if (p()) {
            return;
        }
        try {
            int i2 = parcel.readInt();
            if (anty.p(i2, 8)) {
                anqw anqwVarN = anty.n(i2, parcel);
                h(anqwVarN, anqwVarN, true);
                return;
            }
            int i3 = parcel.readInt();
            boolean zP = anty.p(i2, 1);
            boolean zP2 = anty.p(i2, 2);
            boolean zP3 = anty.p(i2, 4);
            if (zP) {
                c(i2, parcel);
                m(defpackage.ansr.c);
            }
            if (zP2) {
                if ((i2 & 64) != 0) {
                    throw new anqx(anqw.f.f("Parcelable messages not allowed"), (anph) null);
                }
                int i4 = parcel.readInt();
                if (i4 > parcel.dataAvail()) {
                    throw new anqx(anqw.k.f("Message size is larger than remaining parcel size: " + i4 + " > " + parcel.dataAvail()), (anph) null);
                }
                byte[] bArrC = defpackage.ansm.c(i4);
                if (i4 > 0) {
                    parcel.readByteArray(bArrC);
                }
                int i5 = i2 & 128;
                boolean z = i5 == 0;
                if (this.j != null) {
                    anssVar = new defpackage.anss(bArrC, i4, z);
                    i = i3 - this.h;
                    size = this.j.size();
                    arrayList = this.j;
                    if (i < size) {
                        arrayList.set(i, anssVar);
                        f();
                    } else if (i > arrayList.size()) {
                        do {
                            this.j.add(null);
                        } while (i > this.j.size());
                        this.j.add(anssVar);
                    } else {
                        this.j.add(anssVar);
                        f();
                    }
                } else if (this.o == 0 && i5 == 0 && i3 == this.h) {
                    ahvr.bY(this.a == null);
                    this.a = new defpackage.ansl(bArrC);
                    s();
                } else {
                    this.j = new java.util.ArrayList(16);
                    anssVar = new defpackage.anss(bArrC, i4, z);
                    i = i3 - this.h;
                    size = this.j.size();
                    arrayList = this.j;
                    if (i < size) {
                        arrayList.set(i, anssVar);
                        f();
                    } else if (i > arrayList.size()) {
                        do {
                            this.j.add(null);
                        } while (i > this.j.size());
                        this.j.add(anssVar);
                    } else {
                        this.j.add(anssVar);
                        f();
                    }
                }
            }
            if (zP3) {
                d(i2, parcel);
                this.l = i3;
                this.k = true;
            }
            int i6 = this.h;
            if (i3 == i6) {
                java.util.ArrayList arrayList2 = this.j;
                if (arrayList2 == null) {
                    this.h = i6 + 1;
                } else if (!zP2 && !zP3) {
                    arrayList2.remove(0);
                    this.h++;
                    f();
                }
            }
            int iDataSize = this.m + parcel.dataSize();
            this.m = iDataSize;
            defpackage.aodj aodjVar = this.f;
            if (aodjVar != null && iDataSize != 0) {
                aodjVar.b(iDataSize);
                defpackage.aodj.g(this.f);
                this.m = 0;
            }
            j();
        } catch (anqx e) {
            anqw anqwVar = e.a;
            h(anqwVar, anqwVar, false);
        }
    }

    final void l(defpackage.antk antkVar, defpackage.aodm aodmVar) {
        this.e = antkVar;
        this.f = antkVar.f;
        this.g = aodmVar;
        if (p()) {
            return;
        }
        m(defpackage.ansr.b);
    }

    protected final void m(defpackage.ansr ansrVar) {
        defpackage.ansr ansrVar2 = this.n;
        int iOrdinal = ansrVar.ordinal();
        if (iOrdinal == 1) {
            ahvr.ce(ansrVar2 == defpackage.ansr.a, "%s -> %s", ansrVar2, ansrVar);
        } else if (iOrdinal == 2) {
            ahvr.ce(ansrVar2 == defpackage.ansr.b || ansrVar2 == defpackage.ansr.a, "%s -> %s", ansrVar2, ansrVar);
        } else if (iOrdinal == 3) {
            ahvr.ce(ansrVar2 == defpackage.ansr.c, "%s -> %s", ansrVar2, ansrVar);
        } else if (iOrdinal == 4) {
            ahvr.ce(ansrVar2 == defpackage.ansr.d, "%s -> %s", ansrVar2, ansrVar);
        } else if (iOrdinal != 5) {
            throw new java.lang.AssertionError();
        }
        this.n = ansrVar;
    }

    public final void n(int i) {
        this.p += i;
        j();
    }

    final void o() {
        this.b.s(this);
    }

    protected final boolean p() {
        return this.n == defpackage.ansr.f;
    }

    public final synchronized java.lang.String toString() {
        java.lang.StringBuilder sb;
        java.lang.String simpleName = getClass().getSimpleName();
        boolean z = this.k;
        java.lang.String strValueOf = java.lang.String.valueOf(this.n);
        boolean zQ = q();
        defpackage.aodm aodmVar = this.g;
        sb = new java.lang.StringBuilder();
        sb.append(simpleName);
        sb.append("[SfxA=");
        sb.append(z);
        sb.append("/De=");
        sb.append(strValueOf);
        sb.append("/Msg=");
        sb.append(zQ);
        sb.append("/Lis=");
        sb.append(aodmVar != null);
        sb.append(']');
        return sb.toString();
    }
}
