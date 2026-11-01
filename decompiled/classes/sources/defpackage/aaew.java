package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class aaew extends defpackage.ylc implements defpackage.aaex {
    public aaew() {
        super("com.google.android.gms.common.api.internal.IStatusCallback");
    }

    @Override // defpackage.ylc
    protected final boolean F(int i, android.os.Parcel parcel, android.os.Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        com.google.android.gms.common.api.Status status = (com.google.android.gms.common.api.Status) defpackage.yld.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
        defpackage.yld.c(parcel);
        a(status);
        return true;
    }
}
