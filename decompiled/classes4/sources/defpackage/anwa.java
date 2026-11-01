package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class anwa extends defpackage.anuq {
    private static final defpackage.anvy b = new defpackage.anvw(1);
    private static final defpackage.anvy c = new defpackage.anvw(0);
    private static final defpackage.anvy d = new defpackage.anvw(2);
    private static final defpackage.anvz e = new defpackage.anvx();
    public int a;
    private final java.util.Deque f;
    private java.util.Deque g;
    private boolean h;
    private int i;

    public anwa() {
        this.i = 0;
        this.f = new java.util.ArrayDeque();
    }

    private final int l(defpackage.anvz anvzVar, int i, java.lang.Object obj, int i2) {
        a(i);
        java.util.Deque deque = this.f;
        if (!deque.isEmpty()) {
            p();
        }
        while (i > 0) {
            if (deque.isEmpty()) {
                throw new java.lang.AssertionError("Failed executing read operation");
            }
            defpackage.aoaw aoawVar = (defpackage.aoaw) deque.peek();
            int iMin = java.lang.Math.min(i, aoawVar.f());
            i2 = anvzVar.a(aoawVar, iMin, obj, i2);
            i -= iMin;
            this.a -= iMin;
            p();
        }
        return i2;
    }

    private final int m(defpackage.anvy anvyVar, int i, java.lang.Object obj, int i2) {
        try {
            return l(anvyVar, i, obj, i2);
        } catch (java.io.IOException e2) {
            throw new java.lang.AssertionError(e2);
        }
    }

    private final void n() {
        java.util.Deque deque = this.f;
        if (this.i > deque.size()) {
            this.i = deque.size();
        }
    }

    private final void o() {
        if (this.h) {
            java.util.Deque deque = this.g;
            java.util.Deque deque2 = this.f;
            deque.add((defpackage.aoaw) deque2.remove());
            defpackage.aoaw aoawVar = (defpackage.aoaw) deque2.peek();
            if (aoawVar != null) {
                aoawVar.b();
            }
        } else {
            ((defpackage.aoaw) this.f.remove()).close();
        }
        n();
    }

    private final void p() {
        if (((defpackage.aoaw) this.f.peek()).f() == 0) {
            o();
        }
    }

    private final void q(int i) {
        if (this.h) {
            return;
        }
        defpackage.aoaw[] aoawVarArr = new defpackage.aoaw[i];
        int iF = 0;
        for (int i2 = i - 1; i2 >= 0; i2--) {
            defpackage.aoaw aoawVar = (defpackage.aoaw) this.f.pollLast();
            aoawVarArr[i2] = aoawVar;
            iF += aoawVar.f();
        }
        byte[] bArr = new byte[iF];
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            defpackage.aoaw aoawVar2 = aoawVarArr[i4];
            int iF2 = aoawVar2.f();
            aoawVar2.j(bArr, i3, iF2);
            i3 += iF2;
            aoawVar2.close();
        }
        java.nio.ByteBuffer byteBufferWrap = java.nio.ByteBuffer.wrap(bArr);
        defpackage.aoaw aoawVar3 = defpackage.aoba.a;
        this.f.add(new defpackage.aoaz(byteBufferWrap));
    }

    @Override // defpackage.anuq, defpackage.aoaw
    public final void b() {
        if (this.g == null) {
            this.g = new java.util.ArrayDeque(java.lang.Math.min(this.f.size(), 16));
        }
        while (!this.g.isEmpty()) {
            ((defpackage.aoaw) this.g.remove()).close();
        }
        this.h = true;
        defpackage.aoaw aoawVar = (defpackage.aoaw) this.f.peek();
        if (aoawVar != null) {
            aoawVar.b();
        }
    }

    @Override // defpackage.anuq, defpackage.aoaw
    public final void c() {
        if (!this.h) {
            throw new java.nio.InvalidMarkException();
        }
        java.util.Deque deque = this.f;
        defpackage.aoaw aoawVar = (defpackage.aoaw) deque.peek();
        if (aoawVar != null) {
            int iF = aoawVar.f();
            aoawVar.c();
            this.a += aoawVar.f() - iF;
        }
        while (true) {
            defpackage.aoaw aoawVar2 = (defpackage.aoaw) this.g.pollLast();
            if (aoawVar2 == null) {
                return;
            }
            aoawVar2.c();
            deque.addFirst(aoawVar2);
            this.a += aoawVar2.f();
        }
    }

    @Override // defpackage.anuq, defpackage.aoaw, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        while (true) {
            java.util.Deque deque = this.f;
            if (deque.isEmpty()) {
                break;
            } else {
                ((defpackage.aoaw) deque.remove()).close();
            }
        }
        if (this.g != null) {
            while (!this.g.isEmpty()) {
                ((defpackage.aoaw) this.g.remove()).close();
            }
        }
        this.i = 0;
    }

    @Override // defpackage.anuq, defpackage.aoaw
    public final boolean d() {
        java.util.Iterator it = this.f.iterator();
        while (it.hasNext()) {
            if (!((defpackage.aoaw) it.next()).d()) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.aoaw
    public final int e() {
        return m(b, 1, null, 0);
    }

    @Override // defpackage.aoaw
    public final int f() {
        return this.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005e, code lost:
    
        r1 = r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [aoaw] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [anwa] */
    /* JADX WARN: Type inference failed for: r1v3, types: [anwa] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r7v1, types: [aoaw] */
    @Override // defpackage.aoaw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.aoaw g(int r8) {
        /*
            r7 = this;
            if (r8 > 0) goto L5
            aoaw r7 = defpackage.aoba.a
            goto L5f
        L5:
            r7.a(r8)
            int r0 = r7.a
            int r0 = r0 - r8
            r7.a = r0
            r0 = 0
            r1 = r0
        Lf:
            java.util.Deque r2 = r7.f
            java.lang.Object r3 = r2.peek()
            aoaw r3 = (defpackage.aoaw) r3
            int r4 = r3.f()
            if (r4 <= r8) goto L23
            aoaw r8 = r3.g(r8)
            r3 = 0
            goto L3c
        L23:
            boolean r5 = r7.h
            if (r5 == 0) goto L2f
            aoaw r3 = r3.g(r4)
            r7.o()
            goto L38
        L2f:
            java.lang.Object r3 = r2.poll()
            aoaw r3 = (defpackage.aoaw) r3
            r7.n()
        L38:
            int r8 = r8 - r4
            r6 = r3
            r3 = r8
            r8 = r6
        L3c:
            if (r0 != 0) goto L40
            r0 = r8
            goto L5c
        L40:
            if (r1 != 0) goto L59
            anwa r1 = new anwa
            r4 = 2
            if (r3 == 0) goto L52
            int r2 = r2.size()
            int r2 = r2 + r4
            r4 = 16
            int r4 = java.lang.Math.min(r2, r4)
        L52:
            r1.<init>(r4)
            r1.h(r0)
            r0 = r1
        L59:
            r1.h(r8)
        L5c:
            if (r3 > 0) goto L60
            r7 = r0
        L5f:
            return r7
        L60:
            r8 = r3
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anwa.g(int):aoaw");
    }

    public final void h(defpackage.aoaw aoawVar) {
        boolean z = this.h && this.f.isEmpty();
        int iF = aoawVar.f();
        if (iF >= 1024) {
            int i = this.i;
            if (i > 1) {
                q(i);
            }
            this.i = 0;
            this.f.add(aoawVar);
            this.a += iF;
        } else {
            this.f.add(aoawVar);
            this.a += iF;
            int i2 = this.i + 1;
            this.i = i2;
            if (i2 >= 1000) {
                q(i2);
                this.i = 0;
            }
        }
        if (z) {
            ((defpackage.aoaw) this.f.peek()).b();
        }
    }

    @Override // defpackage.aoaw
    public final void i(java.io.OutputStream outputStream, int i) {
        l(e, i, outputStream, 0);
    }

    @Override // defpackage.aoaw
    public final void j(byte[] bArr, int i, int i2) {
        m(d, i2, bArr, i);
    }

    @Override // defpackage.aoaw
    public final void k(int i) {
        m(c, i, null, 0);
    }

    public anwa(int i) {
        this.i = 0;
        this.f = new java.util.ArrayDeque(i);
    }
}
