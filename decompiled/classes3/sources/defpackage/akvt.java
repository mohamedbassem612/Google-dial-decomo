package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public abstract class akvt extends ylc implements defpackage.akvu {
    public akvt() {
        super("com.google.oslo.service.serviceinterface.aidl.IOsloServiceGestureListener");
    }

    protected final boolean F(int i, android.os.Parcel parcel, android.os.Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        android.os.Bundle bundle = (android.os.Bundle) yld.a(parcel, android.os.Bundle.CREATOR);
        yld.c(parcel);
        a(bundle);
        return true;
    }
}
