package com.google.android.apps.aicore.aidl;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class SummarizationRequest extends com.google.android.apps.aicore.aidl.AbstractRequest {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.xkg(15);
    public final aify a;
    public final float b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final com.google.android.apps.aicore.aidl.SummarizationArguments i;
    public final int j;
    public final aify k;
    public final com.google.android.apps.aicore.aidl.UserProperties l;
    private final defpackage.ylv m;
    private final defpackage.ylw n;

    public SummarizationRequest(java.util.List list, float f, int i, int i2, int i3, android.os.IBinder iBinder, int i4, int i5, android.os.IBinder iBinder2, int i6, com.google.android.apps.aicore.aidl.SummarizationArguments summarizationArguments, int i7, java.util.List list2, com.google.android.apps.aicore.aidl.UserProperties userProperties) {
        defpackage.ylv ylvVar;
        defpackage.ylw ylwVar;
        this.a = aify.n(list);
        this.b = f;
        this.c = i;
        this.d = i2;
        this.e = i3;
        if (iBinder == null) {
            ylvVar = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.ISummarizationStreamingCallback");
            ylvVar = iInterfaceQueryLocalInterface instanceof defpackage.ylv ? (defpackage.ylv) iInterfaceQueryLocalInterface : new defpackage.ylv(iBinder);
        }
        this.m = ylvVar;
        this.f = i4;
        this.g = i5;
        if (iBinder2 == null) {
            ylwVar = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.apps.aicore.aidl.ITaskStateChangeCallback");
            ylwVar = iInterfaceQueryLocalInterface2 instanceof defpackage.ylw ? (defpackage.ylw) iInterfaceQueryLocalInterface2 : new defpackage.ylw(iBinder2);
        }
        this.n = ylwVar;
        this.h = i6;
        this.i = summarizationArguments;
        this.j = i7;
        this.k = list2 != null ? aify.n(list2) : null;
        this.l = userProperties == null ? com.google.android.apps.aicore.aidl.UserProperties.a : userProperties;
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iF = aais.f(parcel, 20293);
        aais.E(parcel, 1, this.a);
        aais.k(parcel, 2, this.b);
        aais.l(parcel, 3, this.c);
        aais.l(parcel, 4, this.d);
        aais.l(parcel, 5, this.e);
        defpackage.ylv ylvVar = this.m;
        aais.u(parcel, 6, ylvVar == null ? null : ((ylb) ylvVar).a);
        aais.l(parcel, 7, this.f);
        aais.l(parcel, 8, this.g);
        defpackage.ylw ylwVar = this.n;
        aais.u(parcel, 9, ylwVar != null ? ((ylb) ylwVar).a : null);
        aais.l(parcel, 10, this.h);
        aais.z(parcel, 11, this.i, i);
        aais.l(parcel, 12, this.j);
        aais.E(parcel, 13, this.k);
        aais.z(parcel, 14, this.l, i);
        aais.g(parcel, iF);
    }

    public SummarizationRequest(aify aifyVar, int i, int i2, int i3, int i4, int i5, int i6, com.google.android.apps.aicore.aidl.SummarizationArguments summarizationArguments, com.google.android.apps.aicore.aidl.UserProperties userProperties) {
        ahvr.bZ(!aifyVar.isEmpty(), "Invalid SummarizationRequest: Neither messages nor batchMessages is set.");
        aifyVar.isEmpty();
        this.a = aifyVar;
        this.b = 0.0f;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.m = null;
        this.f = i4;
        this.g = i5;
        this.n = null;
        this.h = i6;
        this.i = summarizationArguments;
        this.j = 0;
        this.k = null;
        this.l = userProperties == null ? com.google.android.apps.aicore.aidl.UserProperties.a : userProperties;
    }
}
