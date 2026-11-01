package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class dgv extends aomh implements aonn {
    java.lang.Object a;
    int b;
    final /* synthetic */ android.content.ContentResolver c;
    final /* synthetic */ android.net.Uri d;
    final /* synthetic */ defpackage.dgw e;
    final /* synthetic */ aowi f;
    final /* synthetic */ android.content.Context g;
    private /* synthetic */ java.lang.Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dgv(android.content.ContentResolver contentResolver, android.net.Uri uri, defpackage.dgw dgwVar, aowi aowiVar, android.content.Context context, aoln aolnVar) {
        super(2, aolnVar);
        this.c = contentResolver;
        this.d = uri;
        this.e = dgwVar;
        this.f = aowiVar;
        this.g = context;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoxi) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0042 A[Catch: all -> 0x0075, TRY_LEAVE, TryCatch #0 {all -> 0x0075, blocks: (B:6:0x000f, B:11:0x002b, B:13:0x003a, B:15:0x0042, B:7:0x0013, B:10:0x0024), top: B:23:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0068 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    public final java.lang.Object b(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.h
            aoxi r0 = (aoxi) r0
            aolu r1 = aolu.a
            int r2 = r6.b
            r3 = 1
            if (r2 == 0) goto L17
            java.lang.Object r4 = r6.a
            if (r2 == r3) goto L13
            aooc.af(r7)     // Catch: java.lang.Throwable -> L75
            goto L2b
        L13:
            aooc.af(r7)     // Catch: java.lang.Throwable -> L75
            goto L3a
        L17:
            aooc.af(r7)
            android.content.ContentResolver r7 = r6.c
            android.net.Uri r2 = r6.d
            r4 = 0
            dgw r5 = r6.e
            r7.registerContentObserver(r2, r4, r5)
            aowi r7 = r6.f     // Catch: java.lang.Throwable -> L75
            aovx r7 = r7.A()     // Catch: java.lang.Throwable -> L75
            r4 = r7
        L2b:
            r6.h = r0     // Catch: java.lang.Throwable -> L75
            r6.a = r4     // Catch: java.lang.Throwable -> L75
            r6.b = r3     // Catch: java.lang.Throwable -> L75
            r7 = r4
            aovx r7 = (aovx) r7     // Catch: java.lang.Throwable -> L75
            java.lang.Object r7 = r7.a(r6)     // Catch: java.lang.Throwable -> L75
            if (r7 == r1) goto L74
        L3a:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L75
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L75
            if (r7 == 0) goto L6b
            r7 = r4
            aovx r7 = (aovx) r7     // Catch: java.lang.Throwable -> L75
            r7.b()     // Catch: java.lang.Throwable -> L75
            android.content.Context r7 = r6.g     // Catch: java.lang.Throwable -> L75
            adw r2 = dgx.a     // Catch: java.lang.Throwable -> L75
            android.content.ContentResolver r7 = r7.getContentResolver()     // Catch: java.lang.Throwable -> L75
            java.lang.String r2 = "animator_duration_scale"
            r5 = 1065353216(0x3f800000, float:1.0)
            float r7 = android.provider.Settings.Global.getFloat(r7, r2, r5)     // Catch: java.lang.Throwable -> L75
            java.lang.Float r2 = new java.lang.Float     // Catch: java.lang.Throwable -> L75
            r2.<init>(r7)     // Catch: java.lang.Throwable -> L75
            r6.h = r0     // Catch: java.lang.Throwable -> L75
            r6.a = r4     // Catch: java.lang.Throwable -> L75
            r7 = 2
            r6.b = r7     // Catch: java.lang.Throwable -> L75
            java.lang.Object r7 = r0.a(r2, r6)     // Catch: java.lang.Throwable -> L75
            if (r7 != r1) goto L2b
            goto L74
        L6b:
            android.content.ContentResolver r7 = r6.c
            dgw r6 = r6.e
            r7.unregisterContentObserver(r6)
            aojh r1 = aojh.a
        L74:
            return r1
        L75:
            r7 = move-exception
            android.content.ContentResolver r0 = r6.c
            dgw r6 = r6.e
            r0.unregisterContentObserver(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dgv.b(java.lang.Object):java.lang.Object");
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        defpackage.dgv dgvVar = new defpackage.dgv(this.c, this.d, this.e, this.f, this.g, aolnVar);
        dgvVar.h = obj;
        return dgvVar;
    }
}
