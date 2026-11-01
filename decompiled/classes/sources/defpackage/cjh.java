package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class cjh {
    public java.util.Set a;
    public final defpackage.cfc b;
    public defpackage.cfc c;
    public final defpackage.cfc d;
    public final defpackage.cfc e;
    public java.util.ArrayList f;
    public defpackage.ady g;
    public defpackage.ady h;
    public defpackage.adw i;
    private defpackage.cmc j;
    private defpackage.ady k;

    public cjh() {
        defpackage.cfc cfcVar = new defpackage.cfc(new defpackage.cdw[16]);
        this.b = cfcVar;
        defpackage.ady adyVar = defpackage.adz.a;
        this.h = new defpackage.ady(6);
        this.c = cfcVar;
        this.d = new defpackage.cfc(new java.lang.Object[16]);
        this.e = new defpackage.cfc(new defpackage.aomy[16]);
    }

    private static final boolean j(defpackage.cdw cdwVar, defpackage.cfc cfcVar) {
        java.lang.Object[] objArr = cfcVar.a;
        int i = cfcVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            cjc cjcVarA = ((defpackage.cdw) objArr[i2]).a();
            if (cjcVarA instanceof cjc) {
                defpackage.cfc cfcVar2 = cjcVarA.a;
                if (cfcVar2.m(cdwVar) || j(cdwVar, cfcVar2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void a() {
        this.a = null;
        this.j = null;
        defpackage.cfc cfcVar = this.b;
        cfcVar.g();
        this.h.d();
        this.c = cfcVar;
        this.d.g();
        this.e.g();
        this.k = null;
        this.i = null;
        this.f = null;
    }

    public final void b() {
        java.util.Set set = this.a;
        if (set == null || set.isEmpty()) {
            return;
        }
        android.os.Trace.beginSection("Compose:abandons");
        try {
            adk adkVar = new adk((defpackage.adl) set, 0);
            while (adkVar.hasNext()) {
                defpackage.cdv cdvVar = (defpackage.cdv) adkVar.next();
                adkVar.remove();
                cdvVar.h();
            }
            android.os.Trace.endSection();
        } catch (java.lang.Throwable th) {
            android.os.Trace.endSection();
            throw th;
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x004e */
    /* JADX WARN: Bottom block not found for handler: all -> 0x0080 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            r6 = this;
            java.util.Set r0 = r6.a
            if (r0 == 0) goto L85
            r1 = 0
            r6.g = r1
            cfc r1 = r6.d
            int r2 = r1.b
            if (r2 == 0) goto L53
            java.lang.String r2 = "Compose:onForgotten"
            android.os.Trace.beginSection(r2)
            ady r2 = r6.k     // Catch: java.lang.Throwable -> L4e
            int r3 = r1.b     // Catch: java.lang.Throwable -> L4e
            goto L45
        L17:
            if (r3 < 0) goto L4a
            java.lang.Object[] r4 = r1.a     // Catch: java.lang.Throwable -> L4e
            r4 = r4[r3]     // Catch: java.lang.Throwable -> L4e
            boolean r5 = r4 instanceof defpackage.cdw     // Catch: java.lang.Throwable -> L48
            if (r5 == 0) goto L2e
            r5 = r4
            cdw r5 = (defpackage.cdw) r5     // Catch: java.lang.Throwable -> L48
            cdv r5 = r5.a()     // Catch: java.lang.Throwable -> L48
            r0.remove(r5)     // Catch: java.lang.Throwable -> L48
            r5.i()     // Catch: java.lang.Throwable -> L48
        L2e:
            boolean r5 = r4 instanceof defpackage.cap     // Catch: java.lang.Throwable -> L48
            if (r5 == 0) goto L45
            if (r2 == 0) goto L40
            boolean r5 = r2.a(r4)     // Catch: java.lang.Throwable -> L48
            if (r5 == 0) goto L40
            cap r4 = (defpackage.cap) r4     // Catch: java.lang.Throwable -> L48
            r4.c()     // Catch: java.lang.Throwable -> L48
            goto L45
        L40:
            cap r4 = (defpackage.cap) r4     // Catch: java.lang.Throwable -> L48
            r4.b()     // Catch: java.lang.Throwable -> L48
        L45:
            int r3 = r3 + (-1)
            goto L17
        L48:
            r6 = move-exception
            throw r6     // Catch: java.lang.Throwable -> L4e
        L4a:
            android.os.Trace.endSection()
            goto L53
        L4e:
            r6 = move-exception
            android.os.Trace.endSection()
            throw r6
        L53:
            cfc r0 = r6.b
            int r1 = r0.b
            if (r1 == 0) goto L85
            java.lang.String r1 = "Compose:onRemembered"
            android.os.Trace.beginSection(r1)
            java.util.Set r6 = r6.a     // Catch: java.lang.Throwable -> L80
            if (r6 == 0) goto L7c
            java.lang.Object[] r1 = r0.a     // Catch: java.lang.Throwable -> L80
            int r0 = r0.b     // Catch: java.lang.Throwable -> L80
            r2 = 0
        L67:
            if (r2 >= r0) goto L7c
            r3 = r1[r2]     // Catch: java.lang.Throwable -> L80
            cdw r3 = (defpackage.cdw) r3     // Catch: java.lang.Throwable -> L80
            cdv r3 = r3.a()     // Catch: java.lang.Throwable -> L80
            r6.remove(r3)     // Catch: java.lang.Throwable -> L80
            r3.j()     // Catch: java.lang.Throwable -> L7a
            int r2 = r2 + 1
            goto L67
        L7a:
            r6 = move-exception
            throw r6     // Catch: java.lang.Throwable -> L80
        L7c:
            android.os.Trace.endSection()
            goto L85
        L80:
            r6 = move-exception
            android.os.Trace.endSection()
            throw r6
        L85:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cjh.c():void");
    }

    public final void d() {
        defpackage.cfc cfcVar = this.e;
        if (cfcVar.b != 0) {
            android.os.Trace.beginSection("Compose:sideeffects");
            try {
                java.lang.Object[] objArr = cfcVar.a;
                int i = cfcVar.b;
                for (int i2 = 0; i2 < i; i2++) {
                    ((defpackage.aomy) objArr[i2]).a();
                }
                cfcVar.g();
            } finally {
                android.os.Trace.endSection();
            }
        }
    }

    public final void e(defpackage.cdw cdwVar) {
        if (!this.h.a(cdwVar)) {
            defpackage.ady adyVar = this.g;
            if (adyVar == null || !adyVar.a(cdwVar)) {
                f(cdwVar);
                return;
            }
            return;
        }
        this.h.l(cdwVar);
        if (!this.c.m(cdwVar)) {
            defpackage.cfc cfcVar = this.b;
            if (!cfcVar.m(cdwVar)) {
                j(cdwVar, cfcVar);
            }
        }
        java.util.Set set = this.a;
        if (set != null) {
            set.add(cdwVar.a());
        }
    }

    public final void f(java.lang.Object obj) {
        this.d.n(obj);
    }

    public final void g(defpackage.cap capVar) {
        defpackage.ady adyVar = this.k;
        if (adyVar == null) {
            defpackage.ady adyVar2 = defpackage.adz.a;
            adyVar = new defpackage.ady(6);
            this.k = adyVar;
        }
        adyVar.h(capVar);
        f(capVar);
    }

    public final void h(defpackage.cdw cdwVar) {
        this.c.n(cdwVar);
        this.h.j(cdwVar);
    }

    public final void i(java.util.Set set, defpackage.cmc cmcVar) {
        a();
        this.a = set;
        this.j = null;
    }
}
