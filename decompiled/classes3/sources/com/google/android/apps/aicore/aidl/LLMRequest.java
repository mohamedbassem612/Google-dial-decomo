package com.google.android.apps.aicore.aidl;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class LLMRequest extends com.google.android.apps.aicore.aidl.AbstractRequest implements java.lang.AutoCloseable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.yly();
    public static final aify a = aify.r("auxiliary_lora_file", "auxiliary_drafter_lora_file", "auxiliary_session_state_file");
    public final aify b;
    public final float c;
    public final int d;
    public final aify e;
    public final int f;
    public final int g;
    public final boolean h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final float m;
    public final java.lang.String n;
    public final android.os.Bundle o;
    public final int p;
    public final com.google.android.apps.aicore.aidl.UserProperties q;
    public final int r;
    public final com.google.android.apps.aicore.aidl.LLMPrefixParam s;
    public final com.google.android.apps.aicore.aidl.ResponseSchema t;
    public final boolean u;

    @java.lang.Deprecated
    public final com.google.android.apps.aicore.aidl.FunctionTools v;
    public final com.google.android.apps.aicore.aidl.ThinkingConfig w;
    private final defpackage.ylq x;
    private final defpackage.ylm y;

    public LLMRequest(java.util.List list, float f, int i, java.util.List list2, int i2, int i3, android.os.IBinder iBinder, boolean z, int i4, android.os.IBinder iBinder2, int i5, int i6, java.lang.String str, android.os.Bundle bundle, int i7, com.google.android.apps.aicore.aidl.UserProperties userProperties, int i8, com.google.android.apps.aicore.aidl.LLMPrefixParam lLMPrefixParam, int i9, float f2, com.google.android.apps.aicore.aidl.ResponseSchema responseSchema, boolean z2, com.google.android.apps.aicore.aidl.FunctionTools functionTools, com.google.android.apps.aicore.aidl.ThinkingConfig thinkingConfig) {
        defpackage.ylq ylqVar;
        this.b = aify.n(list);
        this.c = f;
        this.d = i;
        this.m = f2;
        this.e = aify.n(list2);
        this.f = i2;
        this.g = i3;
        defpackage.ylm ylmVar = null;
        if (iBinder == null) {
            ylqVar = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.ILLMStreamingCallback");
            ylqVar = iInterfaceQueryLocalInterface instanceof defpackage.ylq ? (defpackage.ylq) iInterfaceQueryLocalInterface : new defpackage.ylq(iBinder);
        }
        this.x = ylqVar;
        this.h = z;
        this.i = i4;
        if (iBinder2 != null) {
            android.os.IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.apps.aicore.aidl.IImageEmbeddingCallback");
            ylmVar = iInterfaceQueryLocalInterface2 instanceof defpackage.ylm ? (defpackage.ylm) iInterfaceQueryLocalInterface2 : new defpackage.ylm(iBinder2);
        }
        this.y = ylmVar;
        this.j = i5;
        this.k = i6;
        this.n = str;
        this.o = bundle;
        this.p = i7;
        this.q = userProperties == null ? com.google.android.apps.aicore.aidl.UserProperties.a : userProperties;
        this.r = i8;
        this.s = lLMPrefixParam;
        this.l = i9;
        this.t = responseSchema;
        this.u = z2;
        this.v = functionTools;
        this.w = thinkingConfig;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        aify aifyVar = this.b;
        if (aifyVar != null) {
            for (java.lang.Object obj : aifyVar) {
                if (obj instanceof java.lang.AutoCloseable) {
                    defpackage.xhp.s((java.lang.AutoCloseable) obj);
                }
            }
        }
        android.os.Bundle bundle = this.o;
        if (bundle != null) {
            aike aikeVar = a;
            int i = aikeVar.d;
            for (int i2 = 0; i2 < i; i2++) {
                defpackage.xhp.s((android.os.ParcelFileDescriptor) bundle.getParcelable((java.lang.String) aikeVar.get(i2), android.os.ParcelFileDescriptor.class));
            }
        }
        com.google.android.apps.aicore.aidl.LLMPrefixParam lLMPrefixParam = this.s;
        if (lLMPrefixParam != null) {
            defpackage.xhp.s(lLMPrefixParam.b);
        }
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        aify aifyVar = this.b;
        int iF = aais.f(parcel, 20293);
        aais.E(parcel, 1, aifyVar);
        aais.k(parcel, 2, this.c);
        aais.l(parcel, 3, this.d);
        aais.C(parcel, 4, this.e);
        aais.l(parcel, 5, this.f);
        aais.l(parcel, 6, this.g);
        defpackage.ylq ylqVar = this.x;
        aais.u(parcel, 7, ylqVar == null ? null : ((ylb) ylqVar).a);
        aais.h(parcel, 8, this.h);
        aais.l(parcel, 9, this.i);
        defpackage.ylm ylmVar = this.y;
        aais.u(parcel, 10, ylmVar != null ? ((ylb) ylmVar).a : null);
        aais.l(parcel, 11, this.j);
        aais.l(parcel, 12, this.k);
        aais.A(parcel, 13, this.n);
        aais.p(parcel, 14, this.o);
        aais.l(parcel, 15, this.p);
        aais.z(parcel, 16, this.q, i);
        aais.l(parcel, 17, this.r);
        aais.z(parcel, 18, this.s, i);
        aais.l(parcel, 19, this.l);
        aais.k(parcel, 20, this.m);
        aais.z(parcel, 21, this.t, i);
        aais.h(parcel, 22, this.u);
        aais.z(parcel, 23, this.v, i);
        aais.z(parcel, 24, this.w, i);
        aais.g(parcel, iF);
    }

    public LLMRequest(aify aifyVar, float f, int i, aify aifyVar2, int i2, int i3, boolean z, int i4, android.os.Bundle bundle, int i5, com.google.android.apps.aicore.aidl.UserProperties userProperties, float f2, com.google.android.apps.aicore.aidl.ResponseSchema responseSchema, com.google.android.apps.aicore.aidl.FunctionTools functionTools) {
        this.b = aifyVar;
        this.c = f;
        this.d = i;
        this.m = f2;
        this.e = aifyVar2;
        this.f = i2;
        this.g = i3;
        this.x = null;
        this.h = z;
        this.i = i4;
        this.y = null;
        this.j = 0;
        this.k = 0;
        this.n = null;
        this.o = bundle;
        this.p = i5;
        this.q = userProperties == null ? com.google.android.apps.aicore.aidl.UserProperties.a : userProperties;
        this.r = 0;
        this.s = null;
        this.l = 0;
        this.t = responseSchema;
        this.u = false;
        this.v = functionTools;
        this.w = null;
    }
}
