package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ard extends aomg implements aonn {
    int a;
    final /* synthetic */ aonj b;
    final /* synthetic */ aomy c;
    final /* synthetic */ aomy d;
    final /* synthetic */ aonn e;
    private /* synthetic */ java.lang.Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ard(aonj aonjVar, aomy aomyVar, aomy aomyVar2, aonn aonnVar, aoln aolnVar) {
        super(aolnVar);
        this.b = aonjVar;
        this.c = aomyVar;
        this.d = aomyVar2;
        this.e = aonnVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((cwc) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003c A[Catch: CancellationException -> 0x0093, TryCatch #0 {CancellationException -> 0x0093, blocks: (B:6:0x0010, B:19:0x005e, B:21:0x0066, B:23:0x0073, B:25:0x007f, B:26:0x0082, B:27:0x0085, B:28:0x008b, B:7:0x0014, B:15:0x0038, B:17:0x003c, B:8:0x0018, B:13:0x002a, B:11:0x001f), top: B:34:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:21:0x0066 A[Catch: CancellationException -> 0x0093, TryCatch #0 {CancellationException -> 0x0093, blocks: (B:6:0x0010, B:19:0x005e, B:21:0x0066, B:23:0x0073, B:25:0x007f, B:26:0x0082, B:27:0x0085, B:28:0x008b, B:7:0x0014, B:15:0x0038, B:17:0x003c, B:8:0x0018, B:13:0x002a, B:11:0x001f), top: B:34:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:23:0x0073 A[Catch: CancellationException -> 0x0093, TryCatch #0 {CancellationException -> 0x0093, blocks: (B:6:0x0010, B:19:0x005e, B:21:0x0066, B:23:0x0073, B:25:0x007f, B:26:0x0082, B:27:0x0085, B:28:0x008b, B:7:0x0014, B:15:0x0038, B:17:0x003c, B:8:0x0018, B:13:0x002a, B:11:0x001f), top: B:34:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:25:0x007f A[Catch: CancellationException -> 0x0093, TryCatch #0 {CancellationException -> 0x0093, blocks: (B:6:0x0010, B:19:0x005e, B:21:0x0066, B:23:0x0073, B:25:0x007f, B:26:0x0082, B:27:0x0085, B:28:0x008b, B:7:0x0014, B:15:0x0038, B:17:0x003c, B:8:0x0018, B:13:0x002a, B:11:0x001f), top: B:34:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:28:0x008b A[Catch: CancellationException -> 0x0093, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x0093, blocks: (B:6:0x0010, B:19:0x005e, B:21:0x0066, B:23:0x0073, B:25:0x007f, B:26:0x0082, B:27:0x0085, B:28:0x008b, B:7:0x0014, B:15:0x0038, B:17:0x003c, B:8:0x0018, B:13:0x002a, B:11:0x001f), top: B:34:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0082 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:? A[RETURN, SYNTHETIC] */
    public final java.lang.Object b(java.lang.Object obj) {
        defpackage.cvm cvmVar;
        java.util.List list;
        int size;
        int i;
        defpackage.cvm cvmVar2;
        cwc cwcVar = (cwc) this.f;
        aolu aoluVar = aolu.a;
        int i2 = this.a;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    aooc.af(obj);
                } else {
                    if (i2 == 2) {
                        aooc.af(obj);
                        cvmVar = (defpackage.cvm) obj;
                        if (cvmVar != null) {
                            this.b.a(new cpm(cvmVar.c));
                            long j = cvmVar.a;
                            agb agbVar = new agb(this.e, 17);
                            this.f = cwcVar;
                            this.a = 3;
                            obj = defpackage.ro.n(cwcVar, j, agbVar, this);
                            if (obj == aoluVar) {
                                return aoluVar;
                            }
                        }
                        return aojh.a;
                    }
                    aooc.af(obj);
                }
                if (((java.lang.Boolean) obj).booleanValue()) {
                    list = cwcVar.p().a;
                    size = list.size();
                    for (i = 0; i < size; i++) {
                        cvmVar2 = (defpackage.cvm) list.get(i);
                        if (uu.s(cvmVar2)) {
                            cvmVar2.b();
                        }
                    }
                    this.c.a();
                } else {
                    this.d.a();
                }
                return aojh.a;
            }
            aooc.af(obj);
            this.f = cwcVar;
            this.a = 1;
            obj = defpackage.atv.d(cwcVar, null, this, 2);
            if (obj == aoluVar) {
                return aoluVar;
            }
            long j2 = ((defpackage.cvm) obj).a;
            this.f = cwcVar;
            this.a = 2;
            obj = defpackage.ro.k(cwcVar, j2, this);
            if (obj == aoluVar) {
                return aoluVar;
            }
            cvmVar = (defpackage.cvm) obj;
            if (cvmVar != null) {
                this.b.a(new cpm(cvmVar.c));
                long j3 = cvmVar.a;
                agb agbVar2 = new agb(this.e, 17);
                this.f = cwcVar;
                this.a = 3;
                obj = defpackage.ro.n(cwcVar, j3, agbVar2, this);
                if (obj == aoluVar) {
                    return aoluVar;
                }
                if (((java.lang.Boolean) obj).booleanValue()) {
                    list = cwcVar.p().a;
                    size = list.size();
                    while (i < size) {
                        cvmVar2 = (defpackage.cvm) list.get(i);
                        if (uu.s(cvmVar2)) {
                            cvmVar2.b();
                        }
                    }
                    this.c.a();
                } else {
                    this.d.a();
                }
            }
            return aojh.a;
        } catch (java.util.concurrent.CancellationException e) {
            this.d.a();
            throw e;
        }
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        defpackage.ard ardVar = new defpackage.ard(this.b, this.c, this.d, this.e, aolnVar);
        ardVar.f = obj;
        return ardVar;
    }
}
