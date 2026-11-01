package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class wzf implements defpackage.ahek {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/incallui/atlas/ui/impl/database/postcall/AtlasMetricsListener");
    private final defpackage.zjx b;
    private final defpackage.ajct c;

    public wzf(defpackage.zjx zjxVar, defpackage.ajct ajctVar) {
        this.b = zjxVar;
        this.c = ajctVar;
    }

    @Override // defpackage.ahek
    public final defpackage.ajcq a() {
        defpackage.aimz aimzVar = defpackage.wzh.a;
        defpackage.aguv aguvVarA = defpackage.aguz.a(defpackage.wzh.class);
        aguvVarA.f(new defpackage.aguy("com.android.incallui.atlas.ui.impl.database.retention.AtlasMetricsDeletionWorker", 1));
        aguvVarA.d(new defpackage.aguw(defpackage.wzh.c, defpackage.ahwt.a));
        aguvVarA.b(defpackage.wzh.d);
        aguvVarA.c(defpackage.wzh.b);
        defpackage.ajcq ajcqVarB = this.b.b(aguvVarA.a());
        defpackage.ahvr.J(ajcqVarB, new defpackage.lcn(this, 6), this.c);
        return ajcqVarB;
    }
}
