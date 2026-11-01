package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class zya extends ylc implements android.os.IInterface {
    public zya() {
        super("com.google.android.gms.auth.api.internal.IAuthCallbacks");
    }

    protected final boolean F(int i, android.os.Parcel parcel, android.os.Parcel parcel2) {
        if (i == 1) {
            yld.c(parcel);
            throw new java.lang.UnsupportedOperationException();
        }
        if (i != 2) {
            return false;
        }
        java.lang.String string = parcel.readString();
        yld.c(parcel);
        a(string);
        parcel2.writeNoException();
        return true;
    }

    public void a(java.lang.String str) {
        throw new java.lang.UnsupportedOperationException();
    }
}
