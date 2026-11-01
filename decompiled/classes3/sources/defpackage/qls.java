package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qls extends amzm {
    private final amzg b;

    public qls(amyz amyzVar, amyz amyzVar2, amzg amzgVar) {
        super(amyzVar2, new defpackage.amzw(defpackage.qls.class), amyzVar);
        this.b = amzs.b(amzgVar);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        zzx zzxVar = (zzx) obj;
        aooh.f(zzxVar, "oemNotificationModifier");
        java.util.Set setKeySet = zzxVar.k().keySet();
        aooh.e(setKeySet, "<get-keys>(...)");
        java.util.Comparator comparatorComparingInt = j$.util.Comparator.-CC.comparingInt(new defpackage.qkr(new defpackage.pmu(19), 2));
        aooh.e(comparatorComparingInt, "comparingInt(...)");
        ted tedVar = (ted) ajsz.bK(setKeySet, comparatorComparingInt);
        j$.util.Optional optionalOfNullable = j$.util.Optional.ofNullable(tedVar != null ? (rsr) wsc.D(zzxVar, tedVar) : null);
        aooh.e(optionalOfNullable, "ofNullable(...)");
        return aiql.z(optionalOfNullable);
    }

    protected final ajcq c() {
        return this.b.d();
    }
}
