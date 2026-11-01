package android.support.v4.os;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public class ResultReceiver implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.v(5);
    defpackage.dxd a;

    public ResultReceiver(android.os.Parcel parcel) {
        defpackage.dxd dxbVar;
        android.os.IBinder strongBinder = parcel.readStrongBinder();
        if (strongBinder == null) {
            dxbVar = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("android.support.v4.os.IResultReceiver");
            dxbVar = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof defpackage.dxd)) ? new defpackage.dxb(strongBinder) : (defpackage.dxd) iInterfaceQueryLocalInterface;
        }
        this.a = dxbVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        synchronized (this) {
            if (this.a == null) {
                this.a = new defpackage.dxc();
            }
            parcel.writeStrongBinder(this.a.asBinder());
        }
    }
}
