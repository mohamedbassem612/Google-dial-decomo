package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aeef extends defpackage.aomh implements defpackage.aonn {
    private final /* synthetic */ int $cid;
    int a;
    final /* synthetic */ java.lang.Object b;
    final /* synthetic */ java.lang.Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aeef(defpackage.adai adaiVar, com.google.android.libraries.notifications.platform.registration.AccountRepresentation accountRepresentation, defpackage.aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = adaiVar;
        this.c = accountRepresentation;
    }

    @Override // defpackage.aonn
    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.$cid;
        if (i == 0) {
            return ((defpackage.aeef) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
        }
        if (i == 1) {
            return ((defpackage.aeef) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
        }
        if (i != 2) {
            return ((defpackage.aeef) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
        }
        return ((defpackage.aeef) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001d, code lost:
    
        if (r7.fM(r2, r6) != r0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008f, code lost:
    
        if (r7 != r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d1, code lost:
    
        if (((defpackage.zdi) r7).b((defpackage.zzc) r2, r6) != r0) goto L40;
     */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.google.android.libraries.notifications.platform.registration.AccountRepresentation, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7, types: [aoxi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v26, types: [aoxh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v3, types: [aeee, java.lang.Object] */
    @Override // defpackage.aomb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r7) {
        /*
            Method dump skipped, instruction units count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aeef.b(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [aoxh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.google.android.libraries.notifications.platform.registration.AccountRepresentation, java.lang.Object] */
    @Override // defpackage.aomb
    public final defpackage.aoln c(java.lang.Object obj, defpackage.aoln aolnVar) {
        defpackage.aeef aeefVar;
        int i = this.$cid;
        if (i == 0) {
            return new defpackage.aeef((defpackage.adai) this.b, (com.google.android.libraries.notifications.platform.registration.AccountRepresentation) this.c, aolnVar, 0);
        }
        if (i == 1) {
            aeefVar = new defpackage.aeef((defpackage.zdi) this.b, (defpackage.zzc) this.c, aolnVar, 1);
        } else {
            if (i != 2) {
                return new defpackage.aeef((defpackage.aoxh) this.b, (defpackage.apar) this.c, aolnVar, 3);
            }
            aeefVar = new defpackage.aeef((defpackage.aegn) this.b, (defpackage.akti) this.c, aolnVar, 2);
        }
        return aeefVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aeef(defpackage.aegn aegnVar, defpackage.akti aktiVar, defpackage.aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = aegnVar;
        this.c = aktiVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aeef(defpackage.aoxh aoxhVar, defpackage.apar aparVar, defpackage.aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = aoxhVar;
        this.c = aparVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aeef(defpackage.zdi zdiVar, defpackage.zzc zzcVar, defpackage.aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = zdiVar;
        this.c = zzcVar;
    }
}
