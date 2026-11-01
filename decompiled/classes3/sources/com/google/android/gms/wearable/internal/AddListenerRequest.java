package com.google.android.gms.wearable.internal;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class AddListenerRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aatx(18);
    public final defpackage.aaxm a;
    public final android.content.IntentFilter[] b;
    public final java.lang.String c;
    public final java.lang.String d;

    public AddListenerRequest(android.os.IBinder iBinder, android.content.IntentFilter[] intentFilterArr, java.lang.String str, java.lang.String str2) {
        defpackage.aaxm aaxkVar;
        if (iBinder != null) {
            android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableListener");
            aaxkVar = iInterfaceQueryLocalInterface instanceof defpackage.aaxm ? (defpackage.aaxm) iInterfaceQueryLocalInterface : new defpackage.aaxk(iBinder);
        } else {
            aaxkVar = null;
        }
        this.a = aaxkVar;
        this.b = intentFilterArr;
        this.c = str;
        this.d = str2;
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        defpackage.aaxm aaxmVar = this.a;
        int iF = aais.f(parcel, 20293);
        aais.u(parcel, 2, aaxmVar == null ? null : aaxmVar.asBinder());
        aais.D(parcel, 3, this.b, i);
        aais.A(parcel, 4, this.c);
        aais.A(parcel, 5, this.d);
        aais.g(parcel, iF);
    }

    public AddListenerRequest(defpackage.aayd aaydVar) {
        this.a = aaydVar;
        throw null;
    }
}
