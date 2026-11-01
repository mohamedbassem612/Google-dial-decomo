package com.google.android.gms.cloudmessaging;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class CloudMessagingMessengerCompat implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.xkk(7);
    final android.os.Messenger a;

    public CloudMessagingMessengerCompat(android.os.IBinder iBinder) {
        this.a = new android.os.Messenger(iBinder);
    }

    public final android.os.IBinder a() {
        return this.a.getBinder();
    }

    public final void b(android.os.Message message) throws android.os.RemoteException {
        this.a.send(message);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return a().equals(((com.google.android.gms.cloudmessaging.CloudMessagingMessengerCompat) obj).a());
        } catch (java.lang.ClassCastException unused) {
            return false;
        }
    }

    public final int hashCode() {
        return a().hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeStrongBinder(this.a.getBinder());
    }
}
