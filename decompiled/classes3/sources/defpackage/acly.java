package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class acly {
    public final android.content.Context a;
    public final ajct b;
    public final aoin c;
    public volatile defpackage.aevx d;
    zzd e;
    zzd f;

    public acly(android.content.Context context, aoin aoinVar, ajct ajctVar) {
        this.a = context;
        this.c = aoinVar;
        this.b = ajctVar;
    }

    public final synchronized zzd a(acln aclnVar) {
        zzd zzdVarB;
        int i = aclnVar.b - 1;
        if (i == 0 || i == 1) {
            zzdVarB = this.e;
            if (zzdVarB == null) {
                android.content.Context context = this.a;
                java.util.List list = zzd.m;
                zzdVarB = new zza(context, "NOOP_LOG_SOURCE_NAME").b();
                this.e = zzdVarB;
            }
        } else {
            if (i != 2) {
                return null;
            }
            zzdVarB = this.f;
            if (zzdVarB == null) {
                zzdVarB = zzd.i(this.a, "NOOP_LOG_SOURCE_NAME");
                this.f = zzdVarB;
            }
        }
        return zzdVarB;
    }

    public final ajcq b(defpackage.aclx aclxVar, ajcq ajcqVar) {
        return aizu.g(ajan.g(ajcqVar, new defpackage.wzg(this, aclxVar, 9), this.b), aacw.class, new defpackage.acwn(1), ajbm.a);
    }

    public acly() {
        throw null;
    }
}
