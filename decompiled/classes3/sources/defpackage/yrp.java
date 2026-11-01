package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public abstract class yrp extends ylc implements defpackage.yrq {
    public yrp() {
        super("com.google.android.apps.tachyon.contacts.reachability.IReachabilityQueryNoCacheCallback");
    }

    protected final boolean F(int i, android.os.Parcel parcel, android.os.Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        java.util.HashMap hashMap = parcel.readHashMap(yld.a);
        yld.c(parcel);
        a(hashMap);
        return true;
    }
}
