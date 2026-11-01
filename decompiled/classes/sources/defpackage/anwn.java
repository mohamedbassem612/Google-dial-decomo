package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class anwn implements defpackage.anzu {
    public final defpackage.anrc b;
    public java.lang.Runnable c;
    public java.lang.Runnable d;
    public java.lang.Runnable e;
    public defpackage.anzt f;
    private final java.util.concurrent.Executor j;
    private final defpackage.anns i = new defpackage.anns(defpackage.anns.c(defpackage.anwn.class), null, defpackage.anns.a.incrementAndGet());
    public final java.lang.Object a = new java.lang.Object();
    public java.util.Collection g = new java.util.LinkedHashSet();
    public volatile defpackage.apni h = new defpackage.apni((java.lang.Object) null, (java.lang.Object) null);

    public anwn(java.util.concurrent.Executor executor, defpackage.anrc anrcVar) {
        this.j = executor;
        this.b = anrcVar;
    }

    private static java.lang.String f(anoh anohVar) {
        if (anohVar != null) {
            if (anohVar.b != null) {
                return "subchannel returned by LB picker has no connected subchannel";
            }
            defpackage.anqw anqwVar = anohVar.c;
            if (!anqwVar.h()) {
                defpackage.anqt anqtVar = anqwVar.o;
                java.lang.String str = anqwVar.p;
                return "wait_for_ready RPC failed with status: " + anqtVar.toString() + (str == null ? "" : ": ".concat(str));
            }
            java.lang.String str2 = anohVar.f;
            if (str2 != null) {
                return str2;
            }
        }
        return "client channel: waiting for picker";
    }

    private static java.lang.String g(anoh anohVar) {
        if (anohVar != null) {
            if (anohVar.b != null) {
                return "subchannel_state_mismatch";
            }
            if (!anohVar.c.h()) {
                return "picker_failing_with_wait_for_ready";
            }
            java.lang.String str = anohVar.e;
            if (str != null) {
                return str;
            }
        }
        return "connecting";
    }

    public final void a(anol anolVar) {
        java.lang.Runnable runnable;
        synchronized (this.a) {
            this.h = new defpackage.apni(anolVar, this.h.a);
            if (anolVar == null || !e()) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList(this.g);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                anwm anwmVar = (anwm) arrayList.get(i);
                anoi anoiVar = anwmVar.a;
                anoh anohVarA = anolVar.a(anoiVar);
                defpackage.anmb anmbVar = anoiVar.a;
                if (anmbVar.g() && anohVarA.c()) {
                    anwmVar.d = anohVarA.c;
                }
                defpackage.anvs anvsVarC = defpackage.anxo.c(anohVarA, anmbVar.g());
                if (anvsVarC != null) {
                    anwmVar.q();
                    java.util.concurrent.Executor executor = this.j;
                    java.util.concurrent.Executor executor2 = anmbVar.c;
                    if (executor2 != null) {
                        executor = executor2;
                    }
                    anmv anmvVar = anwmVar.b;
                    anmv anmvVarA = anmvVar.a();
                    try {
                        anvp anvpVarB = anvsVarC.b(anoiVar.c, anoiVar.b, anmbVar, anwmVar.c);
                        anmvVar.f(anmvVarA);
                        java.lang.Runnable runnableP = anwmVar.p(anvpVarB);
                        if (runnableP != null) {
                            executor.execute(runnableP);
                        }
                        arrayList2.add(anwmVar);
                    } catch (java.lang.Throwable th) {
                        anwmVar.b.f(anmvVarA);
                        throw th;
                    }
                } else {
                    anwmVar.r(g(anohVarA), f(anohVarA));
                }
            }
            synchronized (this.a) {
                if (e()) {
                    java.util.Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        this.g.remove((anwm) it.next());
                    }
                    if (this.g.isEmpty()) {
                        this.g = new java.util.LinkedHashSet();
                    }
                    if (!e()) {
                        defpackage.anrc anrcVar = this.b;
                        anrcVar.b(this.d);
                        if (this.h.a != null && (runnable = this.e) != null) {
                            anrcVar.b(runnable);
                            this.e = null;
                        }
                    }
                    this.b.a();
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00a1, code lost:
    
        throw r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00a2, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00a8, code lost:
    
        r7 = r0;
     */
    @Override // defpackage.anvs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final anvp b(anpk r7, defpackage.anph r8, defpackage.anmb r9, defpackage.anmg[] r10) throws java.lang.Throwable {
        /*
            r6 = this;
            anoi r2 = new anoi     // Catch: java.lang.Throwable -> La6
            aoah r0 = new aoah     // Catch: java.lang.Throwable -> La6
            r0.<init>()     // Catch: java.lang.Throwable -> La6
            r2.<init>(r7, r8, r9, r0)     // Catch: java.lang.Throwable -> La6
            apni r7 = r6.h     // Catch: java.lang.Throwable -> La6
        Lc:
            java.lang.Object r8 = r7.a     // Catch: java.lang.Throwable -> La6
            if (r8 == 0) goto L18
            anwy r7 = new anwy     // Catch: java.lang.Throwable -> L38
            anqw r8 = (defpackage.anqw) r8     // Catch: java.lang.Throwable -> L38
            r7.<init>(r8, r10)     // Catch: java.lang.Throwable -> L38
            goto L36
        L18:
            java.lang.Object r8 = r7.b     // Catch: java.lang.Throwable -> La6
            if (r8 == 0) goto L3d
            anol r8 = (anol) r8     // Catch: java.lang.Throwable -> L38
            anoh r8 = r8.a(r2)     // Catch: java.lang.Throwable -> L38
            anmb r9 = r2.a     // Catch: java.lang.Throwable -> L38
            boolean r0 = r9.g()     // Catch: java.lang.Throwable -> L38
            anvs r0 = defpackage.anxo.c(r8, r0)     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L3e
            anpk r7 = r2.c     // Catch: java.lang.Throwable -> L38
            anph r8 = r2.b     // Catch: java.lang.Throwable -> L38
            anvp r7 = r0.b(r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L38
        L36:
            r1 = r6
            goto L8a
        L38:
            r0 = move-exception
            r7 = r0
            r1 = r6
            goto La9
        L3d:
            r8 = 0
        L3e:
            java.lang.Object r9 = r6.a     // Catch: java.lang.Throwable -> La6
            monitor-enter(r9)     // Catch: java.lang.Throwable -> La6
            apni r0 = r6.h     // Catch: java.lang.Throwable -> L9d
            if (r7 != r0) goto L95
            java.lang.String r4 = g(r8)     // Catch: java.lang.Throwable -> L9d
            java.lang.String r5 = f(r8)     // Catch: java.lang.Throwable -> L9d
            anwm r0 = new anwm     // Catch: java.lang.Throwable -> L9d
            r1 = r6
            r3 = r10
            r0.<init>(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> La4
            anmb r6 = r2.a     // Catch: java.lang.Throwable -> La4
            boolean r6 = r6.g()     // Catch: java.lang.Throwable -> La4
            if (r6 == 0) goto L68
            if (r8 == 0) goto L68
            boolean r6 = r8.c()     // Catch: java.lang.Throwable -> La4
            if (r6 == 0) goto L68
            anqw r6 = r8.c     // Catch: java.lang.Throwable -> La4
            r0.d = r6     // Catch: java.lang.Throwable -> La4
        L68:
            java.util.Collection r6 = r1.g     // Catch: java.lang.Throwable -> La4
            r6.add(r0)     // Catch: java.lang.Throwable -> La4
            monitor-enter(r9)     // Catch: java.lang.Throwable -> La4
            java.util.Collection r6 = r1.g     // Catch: java.lang.Throwable -> L92
            int r6 = r6.size()     // Catch: java.lang.Throwable -> L92
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L92
            r7 = 1
            if (r6 != r7) goto L7f
            anrc r6 = r1.b     // Catch: java.lang.Throwable -> La4
            java.lang.Runnable r7 = r1.c     // Catch: java.lang.Throwable -> La4
            r6.b(r7)     // Catch: java.lang.Throwable -> La4
        L7f:
            int r6 = r3.length     // Catch: java.lang.Throwable -> La4
            r7 = 0
        L81:
            if (r7 >= r6) goto L88
            r8 = r3[r7]     // Catch: java.lang.Throwable -> La4
            int r7 = r7 + 1
            goto L81
        L88:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> La4
            r7 = r0
        L8a:
            anrc r6 = r1.b
            r6.a()
            return r7
        L90:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L92
            throw r6     // Catch: java.lang.Throwable -> La4
        L92:
            r0 = move-exception
            r6 = r0
            goto L90
        L95:
            r1 = r6
            r3 = r10
            monitor-exit(r9)     // Catch: java.lang.Throwable -> La4
            r7 = r0
            r6 = r1
            r10 = r3
            goto Lc
        L9d:
            r0 = move-exception
            r1 = r6
        L9f:
            r6 = r0
            monitor-exit(r9)     // Catch: java.lang.Throwable -> La4
            throw r6     // Catch: java.lang.Throwable -> La2
        La2:
            r0 = move-exception
            goto La8
        La4:
            r0 = move-exception
            goto L9f
        La6:
            r0 = move-exception
            r1 = r6
        La8:
            r7 = r0
        La9:
            anrc r6 = r1.b
            r6.a()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anwn.b(anpk, anph, anmb, anmg[]):anvp");
    }

    @Override // defpackage.anny
    public final defpackage.anns c() {
        return this.i;
    }

    @Override // defpackage.anzu
    public final java.lang.Runnable d(defpackage.anzt anztVar) {
        throw null;
    }

    public final boolean e() {
        boolean z;
        synchronized (this.a) {
            z = !this.g.isEmpty();
        }
        return z;
    }

    @Override // defpackage.anzu
    public final void q(defpackage.anqw anqwVar) {
        java.lang.Runnable runnable;
        synchronized (this.a) {
            if (this.h.a != null) {
                return;
            }
            this.h = new defpackage.apni(this.h.b, anqwVar);
            defpackage.anrc anrcVar = this.b;
            anrcVar.b(new alvr(this, 19));
            if (!e() && (runnable = this.e) != null) {
                anrcVar.b(runnable);
                this.e = null;
            }
            this.b.a();
        }
    }

    @Override // defpackage.anzu
    public final void r(defpackage.anqw anqwVar) {
        java.util.Collection<anwm> collection;
        java.lang.Runnable runnable;
        q(anqwVar);
        synchronized (this.a) {
            collection = this.g;
            runnable = this.e;
            this.e = null;
            if (!collection.isEmpty()) {
                this.g = java.util.Collections.EMPTY_LIST;
            }
        }
        if (runnable != null) {
            for (anwm anwmVar : collection) {
                java.lang.Runnable runnableP = anwmVar.p(new anwy(anqwVar, anvq.b, anwmVar.c));
                if (runnableP != null) {
                    runnableP.run();
                }
            }
            this.b.execute(runnable);
        }
    }
}
