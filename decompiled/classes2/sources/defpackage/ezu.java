package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ezu {
    public final defpackage.erk a;
    public defpackage.ffu c;
    public defpackage.ffu d;
    public defpackage.ffu e;
    public aify b = aike.a;
    private aigf f = aikj.b;

    public ezu(defpackage.erk erkVar) {
        this.a = erkVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0071, code lost:
    
        if (e(r4, r5, r10.y(), r10.g(), r10.h(), r9) != false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.ffu b(defpackage.eri r10, aify r11, defpackage.ffu r12, defpackage.erk r13) {
        /*
            erm r0 = r10.q()
            int r1 = r10.j()
            boolean r2 = r0.n()
            r3 = 0
            if (r2 == 0) goto L11
            r5 = r3
            goto L16
        L11:
            java.lang.Object r2 = r0.f(r1)
            r5 = r2
        L16:
            boolean r2 = r10.y()
            r4 = 0
            r6 = -1
            if (r2 != 0) goto L34
            boolean r2 = r0.n()
            if (r2 != 0) goto L34
            erk r13 = r0.d(r1, r13, r4)
            long r0 = r10.n()
            long r0 = eum.w(r0)
            int r6 = r13.b(r0)
        L34:
            r9 = r6
            r13 = r4
        L36:
            int r0 = r11.size()
            if (r13 >= r0) goto L58
            java.lang.Object r0 = r11.get(r13)
            r4 = r0
            ffu r4 = (defpackage.ffu) r4
            boolean r6 = r10.y()
            int r7 = r10.g()
            int r8 = r10.h()
            boolean r0 = e(r4, r5, r6, r7, r8, r9)
            if (r0 != 0) goto L73
            int r13 = r13 + 1
            goto L36
        L58:
            boolean r11 = r11.isEmpty()
            if (r11 == 0) goto L75
            if (r12 == 0) goto L75
            boolean r6 = r10.y()
            int r7 = r10.g()
            int r8 = r10.h()
            r4 = r12
            boolean r10 = e(r4, r5, r6, r7, r8, r9)
            if (r10 == 0) goto L75
        L73:
            r12 = r4
            goto L76
        L75:
            r12 = r3
        L76:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ezu.b(eri, aify, ffu, erk):ffu");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0024, code lost:
    
        if (r6.c < r0.a(r1)) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002e, code lost:
    
        if (r1 >= 0) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void d(aigb r5, defpackage.ffu r6, defpackage.erm r7) {
        /*
            r4 = this;
            if (r6 == 0) goto L41
            erk r0 = r4.a
            java.lang.Object r1 = r6.a
            int r1 = r7.a(r1)
            r2 = -1
            if (r1 == r2) goto L30
            r3 = 0
            r7.d(r1, r0, r3)
            boolean r1 = r6.c()
            if (r1 == 0) goto L27
            int r1 = r6.b
            r0.j()
            if (r1 >= 0) goto L30
            int r2 = r6.c
            int r0 = r0.a(r1)
            if (r2 >= r0) goto L30
            goto L3e
        L27:
            int r1 = r6.e
            if (r1 == r2) goto L3e
            r0.j()
            if (r1 < 0) goto L3e
        L30:
            aigf r4 = r4.f
            java.lang.Object r4 = r4.get(r6)
            erm r4 = (defpackage.erm) r4
            if (r4 == 0) goto L41
            r5.i(r6, r4)
            goto L41
        L3e:
            r5.i(r6, r7)
        L41:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ezu.d(aigb, ffu, erm):void");
    }

    private static boolean e(defpackage.ffu ffuVar, java.lang.Object obj, boolean z, int i, int i2, int i3) {
        if (!ffuVar.a.equals(obj)) {
            return false;
        }
        if (z) {
            if (ffuVar.b != i || ffuVar.c != i2) {
                return false;
            }
        } else if (ffuVar.b != -1 || ffuVar.e != i3) {
            return false;
        }
        return true;
    }

    public final defpackage.erm a(defpackage.ffu ffuVar) {
        return (defpackage.erm) this.f.get(ffuVar);
    }

    public final void c(defpackage.erm ermVar) {
        aify aifyVar;
        aigb aigbVar = new aigb(4);
        if (this.b.isEmpty()) {
            d(aigbVar, this.d, ermVar);
            if (!j$.util.Objects.equals(this.e, this.d)) {
                d(aigbVar, this.e, ermVar);
            }
            if (!j$.util.Objects.equals(this.c, this.d) && !j$.util.Objects.equals(this.c, this.e)) {
                d(aigbVar, this.c, ermVar);
            }
        } else {
            int i = 0;
            while (true) {
                int size = this.b.size();
                aifyVar = this.b;
                if (i >= size) {
                    break;
                }
                d(aigbVar, (defpackage.ffu) aifyVar.get(i), ermVar);
                i++;
            }
            if (!aifyVar.contains(this.c)) {
                d(aigbVar, this.c, ermVar);
            }
        }
        this.f = aigbVar.e(true);
    }
}
