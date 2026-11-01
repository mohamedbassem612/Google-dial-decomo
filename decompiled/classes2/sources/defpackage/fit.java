package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fit extends android.os.Handler implements java.lang.Runnable {
    public java.io.IOException a;
    public int b;
    final /* synthetic */ defpackage.fix c;
    private final long d;
    private defpackage.fis e;
    private java.lang.Thread f;
    private boolean g;
    private volatile boolean h;
    private final defpackage.fgi i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fit(defpackage.fix fixVar, android.os.Looper looper, defpackage.fgi fgiVar, defpackage.fis fisVar, long j) {
        super(looper);
        j$.util.Objects.requireNonNull(fixVar);
        this.c = fixVar;
        this.i = fgiVar;
        this.e = fisVar;
        this.d = j;
    }

    private final void c() {
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        long j = jElapsedRealtime - this.d;
        defpackage.fis fisVar = this.e;
        ahvr.ci(fisVar);
        defpackage.fgi fgiVar = this.i;
        int i = this.b;
        defpackage.ewl ewlVar = fgiVar.c;
        defpackage.ffk ffkVar = new defpackage.ffk(fgiVar.a, fgiVar.h, jElapsedRealtime);
        if (i != 0) {
            ffkVar.d = ewlVar.b;
            ffkVar.e = ewlVar.c;
            ffkVar.f = j;
            ffkVar.g = ewlVar.a;
        } else {
            i = 0;
        }
        defpackage.fgm fgmVar = (defpackage.fgm) fisVar;
        alic alicVar = fgmVar.v;
        defpackage.ffl fflVar = new defpackage.ffl(ffkVar);
        int i2 = fgmVar.o;
        long j2 = fgiVar.g;
        alicVar.j(fflVar, new defpackage.ffq(i2, -1, null, eum.C(j2), eum.C(fgmVar.m)), i);
        this.a = null;
        defpackage.fix fixVar = this.c;
        defpackage.fit fitVar = fixVar.a;
        ahvr.ci(fitVar);
        fixVar.c.execute(fitVar);
    }

    private final void d() {
        this.c.a = null;
    }

    public final void a(boolean z) {
        this.h = z;
        this.a = null;
        if (hasMessages(1)) {
            this.g = true;
            removeMessages(1);
            if (!z) {
                sendEmptyMessage(2);
            }
        } else {
            synchronized (this) {
                this.g = true;
                this.i.e = true;
                java.lang.Thread thread = this.f;
                if (thread != null) {
                    thread.interrupt();
                }
            }
        }
        if (z) {
            d();
            long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
            defpackage.fis fisVar = this.e;
            ahvr.ci(fisVar);
            fisVar.B(this.i, jElapsedRealtime, jElapsedRealtime - this.d, true);
            this.e = null;
        }
    }

    public final void b(long j) {
        defpackage.fix fixVar = this.c;
        ahvr.bY(fixVar.a == null);
        fixVar.a = this;
        if (j > 0) {
            sendEmptyMessageDelayed(1, j);
        } else {
            c();
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00e5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ed A[LOOP:0: B:49:0x00eb->B:50:0x00ed, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:53:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:54:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:56:0x0106  */
    /* JADX WARN: Instruction removed from duplicated block: B:48:0x00e7, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [fgx, fis, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.os.Handler
    public final void handleMessage(android.os.Message message) {
        ygr ygrVar;
        int i;
        int i2;
        defpackage.fma fmaVar;
        if (this.h) {
            return;
        }
        if (message.what == 1) {
            c();
            return;
        }
        if (message.what == 4) {
            throw ((java.lang.Error) message.obj);
        }
        d();
        long j = this.d;
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        long j2 = jElapsedRealtime - j;
        ?? r7 = this.e;
        ahvr.ci((java.lang.Object) r7);
        if (this.g) {
            r7.B(this.i, jElapsedRealtime, j2, false);
            return;
        }
        int i3 = message.what;
        if (i3 == 2) {
            try {
                defpackage.fgi fgiVar = this.i;
                if (((defpackage.fgm) r7).m == -9223372036854775807L && ((defpackage.fgm) r7).l != null) {
                    long jP = ((defpackage.fgm) r7).p(true);
                    long j3 = jP != Long.MIN_VALUE ? jP + 10000 : 0L;
                    ((defpackage.fgm) r7).m = j3;
                    ((defpackage.fgm) r7).s.t(j3, ((defpackage.fgm) r7).l, ((defpackage.fgm) r7).n);
                }
                defpackage.ewl ewlVar = fgiVar.c;
                defpackage.ffk ffkVar = new defpackage.ffk(fgiVar.a, fgiVar.h, jElapsedRealtime);
                ffkVar.d = ewlVar.b;
                ffkVar.e = ewlVar.c;
                ffkVar.f = j2;
                ffkVar.g = ewlVar.a;
                ((defpackage.fgm) r7).v.h(new defpackage.ffl(ffkVar), new defpackage.ffq(((defpackage.fgm) r7).o, -1, null, eum.C(fgiVar.g), eum.C(((defpackage.fgm) r7).m)));
                defpackage.fgj fgjVar = ((defpackage.fgm) r7).g;
                fgjVar.c = -9223372036854775807L;
                fgjVar.a = 4;
                if (((defpackage.fgm) r7).A()) {
                    fgjVar.a();
                    ((defpackage.fgm) r7).t();
                }
                defpackage.ffr ffrVar = ((defpackage.fgm) r7).h;
                ahvr.ci(ffrVar);
                ffrVar.c(r7);
                return;
            } catch (java.lang.RuntimeException e) {
                defpackage.etr.d("LoadTask", "Unexpected exception handling load completed", e);
                this.c.b = new defpackage.fiw(e);
                return;
            }
        }
        if (i3 == 3) {
            java.io.IOException iOException = (java.io.IOException) message.obj;
            this.a = iOException;
            int i4 = this.b + 1;
            this.b = i4;
            defpackage.fgi fgiVar2 = this.i;
            defpackage.ewl ewlVar2 = fgiVar2.c;
            long j4 = -9223372036854775807L;
            defpackage.ffk ffkVar2 = new defpackage.ffk(fgiVar2.a, fgiVar2.h, jElapsedRealtime);
            ffkVar2.d = ewlVar2.b;
            ffkVar2.e = ewlVar2.c;
            ffkVar2.f = j2;
            ffkVar2.g = ewlVar2.a;
            defpackage.ffl fflVar = new defpackage.ffl(ffkVar2);
            long j5 = fgiVar2.g;
            java.lang.String str = eum.a;
            defpackage.fgm fgmVar = (defpackage.fgm) r7;
            int iK = fgmVar.k();
            defpackage.fgj fgjVar2 = fgmVar.g;
            int i5 = fgjVar2.d;
            int iAo = defpackage.hgt.ao(fgmVar.o);
            int i6 = iK > i5 ? 1 : i4;
            long jAI = i6 > iAo ? -9223372036854775807L : defpackage.hgt.aI(new amwp(iOException, i6));
            if (jAI == -9223372036854775807L) {
                ygrVar = defpackage.fix.e;
                fgjVar2.a = 6;
                j4 = -9223372036854775807L;
            } else {
                boolean z = fgmVar.p || !((fmaVar = fgmVar.l) == null || fmaVar.a() == -9223372036854775807L);
                boolean z2 = fgmVar.k;
                if (z) {
                    fgjVar2.d = iK;
                    fgjVar2.a = 2;
                } else {
                    if (!z2 || fgjVar2.g()) {
                        fgjVar2.e = z2;
                        fgjVar2.b = 0L;
                        fgjVar2.d = 0;
                        fgjVar2.a = 2;
                    } else {
                        fgjVar2.a = 5;
                    }
                    if (fgjVar2.d()) {
                        ygrVar = defpackage.fix.d;
                    } else {
                        if (!z) {
                            for (defpackage.fgu fguVar : fgmVar.j) {
                                fguVar.r(false);
                            }
                            fgiVar2.b(0L, 0L);
                        }
                        if (iK > i5) {
                            i = 1;
                        } else {
                            i = 0;
                        }
                        ygrVar = new ygr(i, jAI);
                    }
                }
                if (fgjVar2.d()) {
                    if (!z) {
                        while (i2 < r10) {
                            fguVar.r(false);
                        }
                        fgiVar2.b(0L, 0L);
                    }
                    if (iK > i5) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    ygrVar = new ygr(i, jAI);
                } else {
                    ygrVar = defpackage.fix.d;
                }
            }
            int i7 = ygrVar.a;
            fgmVar.v.i(fflVar, new defpackage.ffq(fgmVar.o, -1, null, eum.C(fgiVar2.g), eum.C(fgmVar.m)), iOException, !(i7 == 0 || i7 == 1));
            if (i7 == 3) {
                this.c.b = this.a;
                return;
            }
            if (i7 != 2) {
                if (i7 == 1) {
                    this.b = 1;
                }
                long jMin = ygrVar.b;
                if (jMin == j4) {
                    jMin = java.lang.Math.min((this.b - 1) * 1000, 5000);
                }
                b(jMin);
            }
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0206 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r11v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v1, types: [flj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r26v0 */
    /* JADX WARN: Type inference failed for: r26v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r26v2 */
    /* JADX WARN: Type inference failed for: r28v0, types: [fit] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v14, types: [flk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v20, types: [int] */
    /* JADX WARN: Type inference failed for: r8v21, types: [flj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v33 */
    /* JADX WARN: Type inference failed for: r8v36 */
    /* JADX WARN: Type inference failed for: r8v39 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v42 */
    /* JADX WARN: Type inference failed for: r8v47 */
    /* JADX WARN: Type inference failed for: r8v48 */
    /* JADX WARN: Type inference failed for: r8v49 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v52 */
    /* JADX WARN: Type inference failed for: r8v53 */
    /* JADX WARN: Type inference failed for: r8v54 */
    /* JADX WARN: Type inference failed for: r8v55 */
    /* JADX WARN: Type inference failed for: r8v56 */
    /* JADX WARN: Type inference failed for: r8v57 */
    /* JADX WARN: Type inference failed for: r8v58 */
    /* JADX WARN: Type inference failed for: r8v59 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instruction units count: 707
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fit.run():void");
    }
}
