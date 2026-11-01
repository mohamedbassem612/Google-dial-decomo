package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aeao implements defpackage.adzf {
    public final long a;
    private final defpackage.aoin b;
    private final defpackage.aduu c;
    private final defpackage.adzh d;
    private final java.lang.String e;
    private final defpackage.adao f;

    static {
        defpackage.aiof.i("GnpSdk");
    }

    public aeao(defpackage.aoin aoinVar, defpackage.aduu aduuVar, defpackage.adao adaoVar, defpackage.adzh adzhVar) {
        defpackage.aooh.f(aoinVar, "gnpRegistrationScheduler");
        defpackage.aooh.f(aduuVar, "gnpConfig");
        defpackage.aooh.f(adaoVar, "gnpRegistrationDataHelper");
        defpackage.aooh.f(adzhVar, "gnpJobSchedulingApi");
        this.b = aoinVar;
        this.c = aduuVar;
        this.f = adaoVar;
        this.d = adzhVar;
        this.e = "GNP_PERIODIC_REGISTRATION";
        this.a = ((long) (aduuVar.h * 86400)) * 1000;
    }

    @Override // defpackage.adzf
    public final int a() {
        return 17;
    }

    @Override // defpackage.adzf
    public final long b() {
        return this.a;
    }

    @Override // defpackage.adzf
    public final java.lang.Long c() {
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0076, code lost:
    
        if (r5.a(17, r6) != r0) goto L29;
     */
    @Override // defpackage.adzf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(android.os.Bundle r6, defpackage.aoln r7) {
        /*
            r5 = this;
            boolean r6 = r7 instanceof aean
            if (r6 == 0) goto L13
            r6 = r7
            aean r6 = (aean) r6
            int r0 = r6.c
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r6.c = r0
            goto L18
        L13:
            aean r6 = new aean
            r6.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r6.a
            aolu r0 = defpackage.aolu.a
            int r1 = r6.c
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L3d
            if (r1 == r4) goto L39
            if (r1 == r3) goto L35
            if (r1 != r2) goto L2d
            defpackage.aooc.af(r7)
            goto L81
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            defpackage.aooc.af(r7)
            goto L78
        L39:
            defpackage.aooc.af(r7)
            goto L4a
        L3d:
            defpackage.aooc.af(r7)
            adao r7 = r5.f
            r6.c = r4
            java.lang.Object r7 = r7.i(r6)
            if (r7 == r0) goto L80
        L4a:
            adzu r1 = defpackage.adzu.GNP
            if (r7 != r1) goto L6c
            aduu r7 = r5.c
            int r7 = r7.h
            if (r7 == 0) goto L6c
            aoin r5 = r5.b
            java.lang.Object r5 = r5.a()
            java.lang.String r7 = "get(...)"
            defpackage.aooh.e(r5, r7)
            aegg r5 = (defpackage.aegg) r5
            akti r7 = defpackage.akti.PERIODIC_REGISTRATION
            r6.c = r2
            java.lang.Object r7 = r5.a(r7, r6)
            if (r7 != r0) goto L81
            goto L80
        L6c:
            adzh r5 = r5.d
            r6.c = r3
            r7 = 17
            java.lang.Object r5 = r5.a(r7, r6)
            if (r5 == r0) goto L80
        L78:
            adub r7 = new adub
            aojh r5 = defpackage.aojh.a
            r7.<init>(r5)
            goto L81
        L80:
            r7 = r0
        L81:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aeao.d(android.os.Bundle, aoln):java.lang.Object");
    }

    @Override // defpackage.adzf
    public final java.lang.String e() {
        return this.e;
    }

    @Override // defpackage.adzf
    public final boolean f() {
        return true;
    }

    @Override // defpackage.adzf
    public final boolean g() {
        return true;
    }

    @Override // defpackage.adzf
    public final int h() {
        return 1;
    }

    @Override // defpackage.adzf
    public final void i() {
    }

    @Override // defpackage.adzf
    public final /* synthetic */ void j() {
    }
}
