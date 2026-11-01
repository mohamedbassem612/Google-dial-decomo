package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class zyq extends ylc implements android.os.IInterface {
    public zyq() {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
    }

    protected final boolean F(int i, android.os.Parcel parcel, android.os.Parcel parcel2) {
        switch (i) {
            case 101:
                yld.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                yld.c(parcel);
                throw new java.lang.UnsupportedOperationException();
            case 102:
                com.google.android.gms.common.api.Status status = (com.google.android.gms.common.api.Status) yld.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                yld.c(parcel);
                a(status);
                break;
            case 103:
                com.google.android.gms.common.api.Status status2 = (com.google.android.gms.common.api.Status) yld.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                yld.c(parcel);
                b(status2);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }

    public void a(com.google.android.gms.common.api.Status status) {
        throw new java.lang.UnsupportedOperationException();
    }

    public void b(com.google.android.gms.common.api.Status status) {
        throw new java.lang.UnsupportedOperationException();
    }
}
