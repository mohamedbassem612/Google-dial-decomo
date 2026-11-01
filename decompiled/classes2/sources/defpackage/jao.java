package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jao implements rrz {
    private final android.content.Context a;
    private final rlv b;
    private final zjs c;
    private final jbm d;
    private final rsd e;
    private final rsb f;
    private final zjm g;
    private final ipc h;

    public jao(android.content.Context context, ipc ipcVar, rlv rlvVar, zjs zjsVar, zjm zjmVar, jbm jbmVar) {
        aooh.f(context, "appContext");
        aooh.f(rlvVar, "loggingBindings");
        aooh.f(zjsVar, "dialerTelecom");
        aooh.f(jbmVar, "beeslySettings");
        this.a = context;
        this.h = ipcVar;
        this.b = rlvVar;
        this.c = zjsVar;
        this.g = zjmVar;
        this.d = jbmVar;
        this.e = rsd.f;
        this.f = new rsb(rsn.a);
    }

    public final rsb a() {
        return this.f;
    }

    public final rsd b() {
        return this.e;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x005e  */
    /* JADX WARN: Code duplicated, block: B:27:0x0098  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(aoln aolnVar) {
        defpackage.jam jamVar;
        if (aolnVar instanceof defpackage.jam) {
            jamVar = (defpackage.jam) aolnVar;
            int i = jamVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                jamVar.c = i - Integer.MIN_VALUE;
            } else {
                jamVar = new defpackage.jam(this, aolnVar);
            }
        } else {
            jamVar = new defpackage.jam(this, aolnVar);
        }
        java.lang.Object objF = jamVar.a;
        aolu aoluVar = aolu.a;
        int i2 = jamVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                aooc.af(objF);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objF);
            }
            return ((java.lang.Boolean) objF).booleanValue() ? new rsh(new rsp(new rse(2132017442, (java.lang.Object) null)), new rry(defpackage.abja.ay), new rrx(new rse(2132017441, (java.lang.Object) null)), new rsa(new rse(2132017440, (java.lang.Object) null), new defpackage.coo((java.lang.Object) this, 4, (int[]) null))) : new rsh(new rsp(new rse(2132017445, (java.lang.Object) null)), new rry(defpackage.abja.ay), new rrx(new rse(2132017444, (java.lang.Object) null)), new rsa(new rse(2132017443, (java.lang.Object) null), new defpackage.coo((java.lang.Object) this, 5, (int[]) null)));
        }
        aooc.af(objF);
        jbm jbmVar = this.d;
        jamVar.c = 1;
        objF = jbmVar.f(jamVar);
        if (objF == aoluVar) {
            return aoluVar;
        }
        if (((java.lang.Boolean) objF).booleanValue()) {
            return null;
        }
        jamVar.c = 2;
        objF = d(jamVar);
        if (objF == aoluVar) {
            return aoluVar;
        }
        if (((java.lang.Boolean) objF).booleanValue()) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x005d  */
    /* JADX WARN: Code duplicated, block: B:25:0x0075  */
    /* JADX WARN: Code duplicated, block: B:28:0x0087  */
    /* JADX WARN: Code duplicated, block: B:30:0x009d  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v14, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x009d -> B:31:0x009e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00ab -> B:21:0x0057). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object d(aoln r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.jan
            if (r0 == 0) goto L13
            r0 = r9
            jan r0 = (defpackage.jan) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            jan r0 = new jan
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.b
            aolu r1 = aolu.a
            int r2 = r0.d
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L44
            if (r2 == r5) goto L40
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r2 = r0.a
            aooc.af(r9)
            goto L9e
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L38:
            android.telecom.PhoneAccountHandle r2 = r0.e
            java.lang.Object r5 = r0.a
            aooc.af(r9)
            goto L78
        L40:
            aooc.af(r9)
            goto L51
        L44:
            aooc.af(r9)
            zjs r9 = r8.c
            r0.d = r5
            java.lang.Object r9 = r9.q(r0)
            if (r9 == r1) goto Laf
        L51:
            java.util.List r9 = (java.util.List) r9
            java.util.Iterator r9 = r9.iterator()
        L57:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto Lad
            java.lang.Object r2 = r9.next()
            android.telecom.PhoneAccountHandle r2 = (android.telecom.PhoneAccountHandle) r2
            zjm r5 = r8.g
            ajcq r5 = r5.k(r2)
            r0.a = r9
            r0.e = r2
            r0.d = r4
            java.lang.Object r5 = aosv.D(r5, r0)
            if (r5 == r1) goto Laf
            r7 = r5
            r5 = r9
            r9 = r7
        L78:
            java.lang.String r6 = "await(...)"
            aooh.e(r9, r6)
            j$.util.Optional r9 = (j$.util.Optional) r9
            java.lang.Object r9 = aooh.q(r9)
            vcc r9 = (vcc) r9
            if (r9 == 0) goto Lab
            ajcq r9 = r9.d(r2)
            java.lang.String r2 = "isVvmEnabled(...)"
            aooh.e(r9, r2)
            r0.a = r5
            r2 = 0
            r0.e = r2
            r0.d = r3
            java.lang.Object r9 = aosv.D(r9, r0)
            if (r9 == r1) goto Laf
            r2 = r5
        L9e:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto La9
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            goto Laf
        La9:
            r9 = r2
            goto L57
        Lab:
            r9 = r5
            goto L57
        Lad:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
        Laf:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jao.d(aoln):java.lang.Object");
    }

    public final void e() {
        this.b.o(rmx.zu);
        ryg rygVarAU = pez.aU(rvq.a.m());
        ryg rygVarAS = pez.aS(rvo.a.m());
        rygVarAS.k(rvc.J);
        rygVarAU.o(rygVarAS.i());
        android.content.Intent intentAddFlags = this.h.aL(rygVarAU.n()).addFlags(268435456);
        aooh.e(intentAddFlags, "addFlags(...)");
        ahqx.l(this.a, intentAddFlags);
    }

    public final void f() {
        this.b.o(rmx.zt);
    }

    public final void g() {
        this.b.o(rmx.zs);
    }
}
