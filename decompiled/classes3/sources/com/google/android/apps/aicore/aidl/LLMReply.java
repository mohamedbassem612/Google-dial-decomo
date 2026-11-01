package com.google.android.apps.aicore.aidl;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class LLMReply extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.xfa(19);
    public final java.lang.String a;

    @java.lang.Deprecated
    public final float b;
    public final int c;
    public final float d;
    final android.os.Bundle e;
    public final com.google.android.apps.aicore.aidl.CitationMetadata f;
    public final java.util.List g;

    public LLMReply(java.lang.String str, float f, int i, float f2, android.os.Bundle bundle, com.google.android.apps.aicore.aidl.CitationMetadata citationMetadata, java.util.List list) {
        this.a = str;
        this.b = f;
        this.c = i;
        this.d = f2;
        this.e = bundle;
        this.f = citationMetadata;
        this.g = list;
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        java.lang.String str = this.a;
        int iF = aais.f(parcel, 20293);
        aais.A(parcel, 1, str);
        aais.k(parcel, 2, this.b);
        aais.l(parcel, 3, this.c);
        aais.k(parcel, 4, this.d);
        aais.p(parcel, 5, this.e);
        aais.z(parcel, 6, this.f, i);
        aais.E(parcel, 7, this.g);
        aais.g(parcel, iF);
    }
}
