package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agyr extends defpackage.agyq {
    private static final defpackage.agwm d = new defpackage.agwm((byte[]) null);
    private final aw a;
    private final aoir b;
    private final ajwr c;

    public agyr(ajwr ajwrVar, aw awVar) {
        aooh.f(ajwrVar, "subscriptionFuturesMixinImpl");
        aooh.f(awVar, "fragment");
        this.c = ajwrVar;
        this.a = awVar;
        aoir aoirVarAh = aooc.ah(3, new defpackage.agob(new defpackage.agob(awVar, 5), 6));
        aopu[] aopuVarArr = aoou.a;
        this.b = zb.k(awVar, new aooa(defpackage.agyt.class), new defpackage.agob(aoirVarAh, 7), new defpackage.agob(aoirVarAh, 8), new jll(awVar, aoirVarAh, 5));
    }

    private final defpackage.agyt b() {
        return (defpackage.agyt) this.b.a();
    }

    @Override // defpackage.agyq
    public final defpackage.zoe a(int i, agxi agxiVar) {
        if (this.a.P().d != emq.b) {
            throw new java.lang.IllegalStateException("`ComposeSubscriptionMixin` should only register in the fragment peer's constructor or `onCreate()`.");
        }
        java.util.Map map = b().a;
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(i);
        java.lang.Object obj = map.get(numValueOf);
        if (obj == null) {
            androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState = new androidx.compose.runtime.ParcelableSnapshotMutableState(defpackage.agys.a, cdu.c);
            map.put(numValueOf, parcelableSnapshotMutableState);
            obj = parcelableSnapshotMutableState;
        }
        ccp ccpVar = (ccp) obj;
        java.util.Map map2 = b().b;
        java.lang.Object obj2 = map2.get(numValueOf);
        if (obj2 == null) {
            androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState2 = new androidx.compose.runtime.ParcelableSnapshotMutableState(d, cdu.c);
            map2.put(numValueOf, parcelableSnapshotMutableState2);
            obj2 = parcelableSnapshotMutableState2;
        }
        ccp ccpVar2 = (ccp) obj2;
        if ((ccpVar.a() instanceof defpackage.agyw) || (ccpVar.a() instanceof defpackage.agyu)) {
            ccpVar.b(defpackage.agys.a);
        }
        ajwr ajwrVar = this.c;
        aooh.f(ajwrVar, "subscriptionFuturesMixinImpl");
        defpackage.agyo agyoVar = new defpackage.agyo(ccpVar, ccpVar2);
        afec.c();
        ((agtg) ajwrVar.b).execute(ahqx.h(new el(ajwrVar, i, agxiVar, agyoVar, 3)));
        return new defpackage.zoe(ccpVar);
    }
}
