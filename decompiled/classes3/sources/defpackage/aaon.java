package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aaon extends ylc implements android.os.IInterface {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aaon(defpackage.uzx uzxVar) {
        super("com.google.android.gms.maps.internal.IOnMapClickListener");
        j$.util.Objects.requireNonNull(uzxVar);
    }

    protected final boolean F(int i, android.os.Parcel parcel, android.os.Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        yld.c(parcel);
        parcel2.writeNoException();
        return true;
    }
}
