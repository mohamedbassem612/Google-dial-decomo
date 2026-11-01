package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
abstract class antk {
    private boolean a;
    private java.io.InputStream b;
    private java.util.Queue c;
    public final defpackage.ansf d;
    public final int e;
    public final defpackage.aodj f;
    private boolean g;
    private int h;
    private int i;
    private int j;
    private int k = 1;

    public antk(defpackage.ansf ansfVar, int i, defpackage.aodj aodjVar) {
        this.d = ansfVar;
        this.e = i;
        this.f = aodjVar;
    }

    private final void c(int i) {
        int i2 = this.k;
        int i3 = i - 1;
        if (i3 == 1) {
            ahvr.bY(i2 == 1);
        } else if (i3 == 2) {
            ahvr.bY(i2 == 2);
        } else if (i3 == 3) {
            ahvr.bY(i2 == 3);
        }
        this.k = i;
    }

    protected abstract int a(android.os.Parcel parcel);

    protected abstract int b(android.os.Parcel parcel);

    final void d(java.io.InputStream inputStream) {
        e();
        java.util.Queue queue = this.c;
        if (queue != null) {
            queue.add(inputStream);
        } else {
            if (this.b == null) {
                this.b = inputStream;
                return;
            }
            j$.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = new j$.util.concurrent.ConcurrentLinkedQueue();
            this.c = concurrentLinkedQueue;
            concurrentLinkedQueue.add(inputStream);
        }
    }

    protected final void e() {
        this.a = true;
    }

    protected final void f() {
        this.g = true;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: anqx */
    final void g() throws anqx {
        int iA;
        java.io.InputStream inputStream;
        int i;
        while (true) {
            int i2 = this.k;
            int i3 = i2 - 1;
            if (i2 == 0) {
                throw null;
            }
            boolean z = true;
            if (i3 != 0) {
                if (i3 != 1) {
                    if (i3 != 2 || !this.g) {
                        return;
                    }
                } else if (!i() && !this.g) {
                    return;
                }
            } else if (!this.a) {
                return;
            }
            if (!h()) {
                return;
            }
            try {
                try {
                    defpackage.antl antlVarC = defpackage.antl.c();
                    try {
                        int i4 = 0;
                        antlVarC.a().writeInt(0);
                        android.os.Parcel parcelA = antlVarC.a();
                        int i5 = this.h;
                        this.h = i5 + 1;
                        parcelA.writeInt(i5);
                        int i6 = this.k;
                        int i7 = i6 - 1;
                        if (i6 == 0) {
                            throw null;
                        }
                        if (i7 != 0) {
                            if (i7 == 1) {
                                iA = 0;
                            } else if (i7 != 2) {
                                throw new java.lang.AssertionError();
                            }
                            iA = i4 | 4 | b(antlVarC.a());
                            c(4);
                            anty.o(antlVarC.a(), iA);
                            int iDataSize = antlVarC.a().dataSize();
                            this.d.w(this.e, antlVarC);
                            defpackage.aodj aodjVar = this.f;
                            aodjVar.c(iDataSize);
                            defpackage.aodj.g(aodjVar);
                            antlVarC.close();
                        } else {
                            iA = a(antlVarC.a()) | 1;
                            c(2);
                            if (i() || this.g) {
                            }
                            anty.o(antlVarC.a(), iA);
                            int iDataSize2 = antlVarC.a().dataSize();
                            this.d.w(this.e, antlVarC);
                            defpackage.aodj aodjVar2 = this.f;
                            aodjVar2.c(iDataSize2);
                            defpackage.aodj.g(aodjVar2);
                            antlVarC.close();
                        }
                        if (this.i == 0) {
                            inputStream = this.b;
                        } else {
                            java.util.Queue queue = this.c;
                            inputStream = queue != null ? (java.io.InputStream) queue.peek() : null;
                        }
                        if (inputStream != null) {
                            int i8 = iA | 2;
                            android.os.Parcel parcelA2 = antlVarC.a();
                            if (inputStream instanceof defpackage.antm) {
                                this.j = ((defpackage.antm) inputStream).a(parcelA2);
                                i = 64;
                                z = false;
                            } else {
                                byte[] bArrB = defpackage.ansm.b();
                                try {
                                    int i9 = inputStream.read(bArrB);
                                    if (i9 <= 0) {
                                        parcelA2.writeInt(0);
                                    } else {
                                        parcelA2.writeInt(i9);
                                        parcelA2.writeByteArray(bArrB, 0, i9);
                                        this.j += i9;
                                        if (i9 == bArrB.length) {
                                            i = 128;
                                        }
                                        defpackage.ansm.a(bArrB);
                                    }
                                    z = false;
                                    i = 0;
                                    defpackage.ansm.a(bArrB);
                                } catch (java.lang.Throwable th) {
                                    defpackage.ansm.a(bArrB);
                                    throw th;
                                }
                            }
                            if (!z) {
                                inputStream.close();
                                int i10 = this.i;
                                this.i = i10 + 1;
                                if (i10 > 0) {
                                    java.util.Queue queue2 = this.c;
                                    ahvr.ci(queue2);
                                    queue2.poll();
                                }
                                defpackage.aodj aodjVar3 = this.f;
                                defpackage.aodj.g(aodjVar3);
                                defpackage.aodj.g(aodjVar3);
                                this.j = 0;
                            }
                            iA = i8 | i;
                        } else {
                            ahvr.bY(this.g);
                        }
                        i4 = iA;
                        if (!this.g || i()) {
                            iA = i4;
                        } else {
                            c(3);
                            iA = i4 | 4 | b(antlVarC.a());
                            c(4);
                        }
                        anty.o(antlVarC.a(), iA);
                        int iDataSize3 = antlVarC.a().dataSize();
                        this.d.w(this.e, antlVarC);
                        defpackage.aodj aodjVar4 = this.f;
                        aodjVar4.c(iDataSize3);
                        defpackage.aodj.g(aodjVar4);
                        antlVarC.close();
                    } catch (java.lang.Throwable th2) {
                        try {
                            antlVarC.close();
                        } catch (java.lang.Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                } catch (java.io.IOException e) {
                    throw new anqx(anqw.k.e(e), (anph) null);
                }
            } catch (anqx e2) {
                c(5);
                throw e2;
            }
        }
    }

    final boolean h() {
        return this.d.z();
    }

    protected final boolean i() {
        java.util.Queue queue = this.c;
        if (queue != null) {
            if (!queue.isEmpty()) {
                return true;
            }
        } else if (this.b != null && this.i == 0) {
            return true;
        }
        return false;
    }

    public final synchronized java.lang.String toString() {
        java.lang.String simpleName;
        java.lang.String str;
        simpleName = getClass().getSimpleName();
        int i = this.k;
        if (i == 1) {
            str = "INITIAL";
        } else if (i == 2) {
            str = "PREFIX_SENT";
        } else if (i == 3) {
            str = "ALL_MESSAGES_SENT";
        } else if (i != 4) {
            str = i != 5 ? "null" : "CLOSED";
        } else {
            str = "SUFFIX_SENT";
        }
        return simpleName + "[S=" + str + "/NDM=" + this.i + ']';
    }
}
