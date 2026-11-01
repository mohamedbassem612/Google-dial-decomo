package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class aepk implements defpackage.aepj {
    private final /* synthetic */ int $cid;
    final /* synthetic */ defpackage.ahzi a;
    final /* synthetic */ defpackage.ahzi b;
    final /* synthetic */ defpackage.aepm c;
    final /* synthetic */ java.lang.Object d;

    public aepk(defpackage.aepm aepmVar, defpackage.ahzi ahziVar, defpackage.ahzi ahziVar2, defpackage.tvn tvnVar, int i) {
        this.$cid = i;
        this.a = ahziVar;
        this.b = ahziVar2;
        this.d = tvnVar;
        j$.util.Objects.requireNonNull(aepmVar);
        this.c = aepmVar;
    }

    private final void a() {
        defpackage.aepm aepmVar = this.c;
        defpackage.aepi aepiVar = aepmVar.b;
        if (aepiVar != null) {
            ((defpackage.aepu) this.d).g.remove(aepiVar);
            aepmVar.b = null;
        }
    }

    private final void b() {
        defpackage.aepm aepmVar = this.c;
        defpackage.aepn aepnVar = aepmVar.a;
        if (aepnVar != null) {
            ((defpackage.tvn) this.d).x(aepnVar);
            aepmVar.a = null;
        }
    }

    @Override // defpackage.aepj
    public final void g(defpackage.aenj aenjVar) {
        int i = this.$cid;
        defpackage.ahzi ahziVar = this.a;
        if (i != 0) {
            if (((java.lang.Boolean) ahziVar.eZ()).booleanValue()) {
                this.c.c.k(aenjVar);
                return;
            } else if (((java.lang.Boolean) this.b.eZ()).booleanValue()) {
                b();
                return;
            } else {
                this.c.c.k(aenjVar);
                return;
            }
        }
        if (((java.lang.Boolean) ahziVar.eZ()).booleanValue()) {
            this.c.c.k(aenjVar);
        } else if (((java.lang.Boolean) this.b.eZ()).booleanValue()) {
            this.c.c.k(aenjVar);
        } else {
            a();
        }
    }

    @Override // defpackage.aepj
    public final void j(defpackage.aenj aenjVar) {
        int i = this.$cid;
        defpackage.ahzi ahziVar = this.a;
        if (i != 0) {
            if (((java.lang.Boolean) ahziVar.eZ()).booleanValue()) {
                this.c.c.l(aenjVar);
                return;
            } else if (((java.lang.Boolean) this.b.eZ()).booleanValue()) {
                b();
                return;
            } else {
                this.c.c.l(aenjVar);
                return;
            }
        }
        if (((java.lang.Boolean) ahziVar.eZ()).booleanValue()) {
            this.c.c.l(aenjVar);
        } else if (((java.lang.Boolean) this.b.eZ()).booleanValue()) {
            this.c.c.l(aenjVar);
        } else {
            a();
        }
    }

    public aepk(defpackage.aepm aepmVar, defpackage.ahzi ahziVar, defpackage.ahzi ahziVar2, defpackage.aepu aepuVar, int i) {
        this.$cid = i;
        this.a = ahziVar;
        this.b = ahziVar2;
        this.d = aepuVar;
        j$.util.Objects.requireNonNull(aepmVar);
        this.c = aepmVar;
    }
}
