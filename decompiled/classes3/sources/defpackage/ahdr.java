package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ahdr {
    public final android.content.Context a;
    public final agoo b;
    public com.google.apps.tiktok.account.AccountId c;
    public final ajwr d;
    public final zzx e;
    private final amwu f;
    private final aewq g;
    private final java.util.Map h;

    public ahdr(android.content.Context context, amwu amwuVar, aewq aewqVar, agoo agooVar, zzx zzxVar, java.util.Map map) {
        aooh.f(context, "context");
        aooh.f(amwuVar, "gmsCommitter");
        aooh.f(aewqVar, "phenotypeContext");
        aooh.f(agooVar, "accountDataService");
        this.a = context;
        this.f = amwuVar;
        this.g = aewqVar;
        this.b = agooVar;
        this.e = zzxVar;
        this.h = map;
        this.d = new ajwr();
    }

    public final ajcq a(aexf aexfVar, akzc akzcVar, java.lang.String str, java.lang.String str2) {
        java.lang.String str3;
        aooh.f(aexfVar, "commitProperties");
        aooh.f(str2, "packageName");
        if (akzcVar != null) {
            aewq aewqVar = this.g;
            aoke aokeVar = (java.util.Set) this.h.get(aewo.c(str2));
            if (aokeVar == null) {
                aokeVar = aoke.a;
            }
            str3 = str2;
            aewqVar.i.A(akzcVar, aokeVar, str, str3, true, true);
        } else {
            str3 = str2;
        }
        return ((ahbz) this.f.a()).a(str3, aexfVar);
    }
}
