package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qkm {
    public static final aimz a = aimz.i("com/android/dialer/incall/statusbarnotification/service/NotificationContactPhotoLoader");
    public final android.content.Context b;
    public final aoin c;
    public final ajcu d;
    public final ops e;
    public final zpz f;

    public qkm(android.content.Context context, ops opsVar, zpz zpzVar, aoin aoinVar, ajcu ajcuVar) {
        this.b = context;
        this.e = opsVar;
        this.f = zpzVar;
        this.c = aoinVar;
        this.d = ajcuVar;
    }

    static /* synthetic */ ajcq a(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        java.util.Set set = (java.util.Set) list.get(0);
        ajct ajctVar = (ajct) list.get(1);
        aooh.f(set, "safeModelCandidates");
        aooh.f(ajctVar, "lightweightExecutor");
        return defpackage.zkb.b(set, ajctVar);
    }
}
