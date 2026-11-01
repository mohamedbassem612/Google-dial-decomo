package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class gql implements java.lang.Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ boolean a;
    public final /* synthetic */ java.lang.Object b;

    public gql(ydx ydxVar, boolean z, int i) {
        this.$cid = i;
        this.a = z;
        j$.util.Objects.requireNonNull(ydxVar);
        this.b = ydxVar;
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [dxw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v14, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v26, types: [java.lang.Object, ydi] */
    /* JADX WARN: Type inference failed for: r6v9, types: [aoin, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = 1;
        switch (this.$cid) {
            case 0:
                this.b.accept(java.lang.Boolean.valueOf(this.a));
                break;
            case 1:
                java.lang.String str = eum.a;
                defpackage.eyc eycVar = ((defpackage.exy) ((ils) this.b).a).a;
                boolean z = eycVar.t;
                final boolean z2 = this.a;
                if (z != z2) {
                    eycVar.t = z2;
                    eycVar.h.e(23, new defpackage.etl() { // from class: exx
                        @Override // defpackage.etl
                        public final void a(java.lang.Object obj) {
                            int i2 = defpackage.exy.b;
                            ((erg) obj).v(z2);
                        }
                    });
                }
                break;
            case 2:
                ((defpackage.iao) ((defpackage.iap) this.b).a.a()).a(new defpackage.lkh(this.a, i));
                break;
            case 3:
                ((mvx) this.b).a.d(this.a, new defpackage.nnm(1));
                break;
            case 4:
                ((nnx) this.b).a.d(this.a, new defpackage.nnm(0));
                break;
            case 5:
                boolean z3 = this.a;
                defpackage.hwv hwvVar = (defpackage.hwv) this.b;
                ((java.util.concurrent.atomic.AtomicBoolean) hwvVar.d).set(z3);
                ((ptt) hwvVar.e.a()).a();
                break;
            case 6:
                boolean z4 = this.a;
                defpackage.hwv hwvVar2 = (defpackage.hwv) this.b;
                if (((java.util.concurrent.atomic.AtomicBoolean) hwvVar2.c).getAndSet(z4) != z4) {
                    ((ptt) hwvVar2.e.a()).a();
                }
                break;
            case 7:
                qdp qdpVar = (qdp) ((qhx) this.b).a;
                if (!qdpVar.f.isEmpty()) {
                    boolean z5 = this.a;
                    if (!qdpVar.e.isPresent() || ((java.lang.Boolean) qdpVar.e.orElseThrow()).booleanValue() != z5) {
                        aimw aimwVarL = qdp.a.b().l("com/android/dialer/incall/proximitysensor/impl/incall/DisplayStateTracker$1", "onDisplayChanged", 78, "DisplayStateTracker.java");
                        java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(z5);
                        aimwVarL.y("set isDisplayOn to %b", boolValueOf);
                        qdpVar.e = j$.util.Optional.of(boolValueOf);
                        qdpVar.h.a(ajcm.a);
                    }
                }
                break;
            case 8:
                java.lang.Object obj = this.b;
                rhp rhpVar = (rhp) obj;
                rhpVar.i.a(qbc.ef);
                rhpVar.e.set(true);
                agsm.i(714, rhpVar.h.f(), "Failed to disconnect.", new java.lang.Object[0]);
                rhpVar.a(this.a);
                break;
            case 9:
                java.lang.Object obj2 = this.b;
                rhp rhpVar2 = (rhp) obj2;
                rhpVar2.i.a(qbc.ee);
                rhpVar2.e.set(true);
                rhpVar2.a(this.a);
                break;
            case 10:
                ygc.g();
                boolean z6 = this.a;
                aeok aeokVar = ((ydx) this.b).a;
                boolean z7 = aeokVar.a;
                aeokVar.a = z6;
                if (z7 != z6) {
                    aeokVar.b.a(z6);
                }
                break;
            default:
                if (this.a) {
                    anwv anwvVar = ((anws) this.b).a;
                    anwvVar.p = true;
                    if (anwvVar.l > 0) {
                        ahzh ahzhVar = anwvVar.o;
                        ahzhVar.d();
                        ahzhVar.e();
                    }
                }
                ((anws) this.b).a.q = false;
                break;
        }
    }

    public /* synthetic */ gql(java.lang.Object obj, boolean z, int i) {
        this.$cid = i;
        this.b = obj;
        this.a = z;
    }

    public gql(anws anwsVar, boolean z, int i) {
        this.$cid = i;
        this.a = z;
        j$.util.Objects.requireNonNull(anwsVar);
        this.b = anwsVar;
    }
}
