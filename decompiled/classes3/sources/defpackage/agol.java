package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class agol implements gig {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ agol(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v8, types: [android.os.Parcelable, java.lang.Object] */
    public final android.os.Bundle a() {
        int i = this.$cid;
        if (i != 0) {
            if (i != 1) {
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putParcelable("com.google.apps.tiktok.cache.InstanceStateStore", this.a);
                return bundle;
            }
            android.os.Bundle bundle2 = new android.os.Bundle();
            defpackage.agoi agoiVar = (defpackage.agoi) this.a;
            bundle2.putBundle("state_account_state_bundle", agoiVar.a.a());
            bundle2.putBoolean("tiktok_accounts_disabled", agoiVar.b);
            return bundle2;
        }
        android.os.Bundle bundle3 = new android.os.Bundle();
        defpackage.agom agomVar = (defpackage.agom) this.a;
        agomVar.a.f(bundle3);
        defpackage.agny agnyVar = agomVar.b;
        if (agnyVar == null) {
            return bundle3;
        }
        bundle3.putInt("KSCH$AC$callbacks_id", agnyVar.a);
        bundle3.putInt("KSCH$AC$callbacks_state", agnyVar.b);
        return bundle3;
    }
}
