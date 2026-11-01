package com.google.android.apps.aicore.aidl;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class SummarizationArguments extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.xkg(11);
    public final aify a;
    public final aify b;

    public SummarizationArguments(java.util.List list, java.util.List list2) {
        this.a = aify.n(list);
        this.b = aify.n(list2);
    }

    public static com.google.android.apps.aicore.aidl.SummarizationArguments a(java.util.Map map) {
        java.util.ArrayList arrayList = new java.util.ArrayList(map.keySet());
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList2.add((java.lang.String) j$.util.Map.-EL.getOrDefault(map, (java.lang.String) arrayList.get(i), ""));
        }
        return new com.google.android.apps.aicore.aidl.SummarizationArguments(arrayList, arrayList2);
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        aify aifyVar = this.a;
        int iF = aais.f(parcel, 20293);
        aais.C(parcel, 1, aifyVar);
        aais.C(parcel, 2, this.b);
        aais.g(parcel, iF);
    }
}
