package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class rwh implements java.util.function.Consumer {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ int a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;

    public /* synthetic */ rwh(alkv alkvVar, almy almyVar, int i, int i2) {
        this.$cid = i2;
        this.c = alkvVar;
        this.b = almyVar;
        this.a = i;
    }

    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object obj) {
        int i = this.$cid;
        if (i == 0) {
            java.lang.Object obj2 = this.c;
            int i2 = this.a;
            ((rwi) this.b).k((java.lang.String) obj, i2, (android.app.Notification) obj2);
            return;
        }
        if (i == 1) {
            agsm.i(511, ahvr.E(new mo((zne) obj, this.c, this.a, 8), ((defpackage.pti) this.b).a), "Failed sending onStateChange", new java.lang.Object[0]);
            return;
        }
        if (i != 2) {
            int i3 = this.a;
            java.lang.Object obj3 = this.b;
            ((alkv) this.c).j((almy) obj3, (aify) obj, i3);
            return;
        }
        int i4 = this.a;
        java.lang.Object obj4 = this.b;
        ((alkv) this.c).j((almy) obj4, (aify) obj, i4);
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        int i = this.$cid;
        if (i == 0) {
            return j$.util.function.Consumer.-CC.$default$andThen(this, consumer);
        }
        if (i != 1) {
            return i != 2 ? j$.util.function.Consumer.-CC.$default$andThen(this, consumer) : j$.util.function.Consumer.-CC.$default$andThen(this, consumer);
        }
        return j$.util.function.Consumer.-CC.$default$andThen(this, consumer);
    }

    public /* synthetic */ rwh(defpackage.pti ptiVar, android.telecom.Call call, int i, int i2) {
        this.$cid = i2;
        this.b = ptiVar;
        this.c = call;
        this.a = i;
    }

    public /* synthetic */ rwh(rwi rwiVar, int i, android.app.Notification notification, int i2) {
        this.$cid = i2;
        this.b = rwiVar;
        this.a = i;
        this.c = notification;
    }
}
