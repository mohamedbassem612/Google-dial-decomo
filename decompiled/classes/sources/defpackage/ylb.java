package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class ylb implements android.os.IInterface {
    public final android.os.IBinder a;
    private final java.lang.String b;

    protected ylb(android.os.IBinder iBinder, java.lang.String str) {
        this.a = iBinder;
        this.b = str;
    }

    @Override // android.os.IInterface
    public final android.os.IBinder asBinder() {
        return this.a;
    }

    public final android.os.Parcel eP() {
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.b);
        return parcelObtain;
    }

    public final android.os.Parcel eQ(int i, android.os.Parcel parcel) {
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        try {
            try {
                this.a.transact(i, parcel, parcelObtain, 0);
                parcelObtain.readException();
                parcel.recycle();
                return parcelObtain;
            } catch (java.lang.RuntimeException e) {
                parcelObtain.recycle();
                throw e;
            }
        } catch (java.lang.Throwable th) {
            parcel.recycle();
            throw th;
        }
    }

    public final void eR(int i, android.os.Parcel parcel) {
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        try {
            this.a.transact(i, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    public final void eS(int i, android.os.Parcel parcel) {
        try {
            this.a.transact(i, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
