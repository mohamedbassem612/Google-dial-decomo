package com.google.android.apps.aicore.aidl;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class LLMPrefixParam extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.apps.aicore.aidl.Bundleable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.xfa(18);
    public final java.util.List a;
    public final android.os.ParcelFileDescriptor b;
    public final int c;
    public final boolean d;
    private final defpackage.yln e;

    public LLMPrefixParam(java.util.List list, android.os.ParcelFileDescriptor parcelFileDescriptor, int i, android.os.IBinder iBinder, boolean z) {
        defpackage.yln ylnVar;
        this.a = list == null ? aike.a : aify.n(list);
        this.b = parcelFileDescriptor;
        if (iBinder == null) {
            ylnVar = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.IInferenceStateCallback");
            ylnVar = iInterfaceQueryLocalInterface instanceof defpackage.yln ? (defpackage.yln) iInterfaceQueryLocalInterface : new defpackage.yln(iBinder);
        }
        this.e = ylnVar;
        this.d = z;
        this.c = i;
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iF = aais.f(parcel, 20293);
        aais.E(parcel, 1, this.a);
        aais.z(parcel, 2, this.b, i);
        aais.l(parcel, 3, this.c);
        defpackage.yln ylnVar = this.e;
        aais.u(parcel, 4, ylnVar == null ? null : ((ylb) ylnVar).a);
        aais.h(parcel, 5, this.d);
        aais.g(parcel, iF);
    }
}
