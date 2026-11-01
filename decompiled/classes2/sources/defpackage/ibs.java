package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ibs {
    public static final aimz a = aimz.i("com/android/dialer/audio/impl/tidepods/AudioAvailableCallAttributesUpdatePropagator");
    public final ajct b;
    public final zpm j;
    private final defpackage.ibt l;
    public final java.util.Set c = new java.util.LinkedHashSet();
    public j$.util.Optional d = j$.util.Optional.empty();
    public final zmp e = new defpackage.ibp(this, 0);
    public final zni f = new defpackage.leq(this, 1);
    public final znh g = new otl(this, 1);
    public final znl h = new defpackage.kxs(this, 1);
    public final rai k = new rai(this);
    public final znc i = new pte(this, 1);

    /* JADX WARN: Type inference failed for: r4v1, types: [aoin, java.lang.Object] */
    public ibs(zpm zpmVar, defpackage.hgw hgwVar, ajct ajctVar) {
        this.j = zpmVar;
        defpackage.ibg ibgVar = new defpackage.ibg(this, 5);
        ajct ajctVar2 = (ajct) hgwVar.a.a();
        ajctVar2.getClass();
        this.l = new defpackage.ibt(ibgVar, ajctVar2);
        this.b = ajctVar;
    }

    public final void a(defpackage.hyu hyuVar) {
        this.c.add(hyuVar);
        hyuVar.a(this.d);
        b();
    }

    public final void b() {
        this.l.a();
    }
}
