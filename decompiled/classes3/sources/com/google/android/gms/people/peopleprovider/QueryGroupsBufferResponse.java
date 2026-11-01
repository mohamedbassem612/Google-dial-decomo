package com.google.android.gms.people.peopleprovider;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class QueryGroupsBufferResponse extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable, defpackage.aafu {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aarr(20);
    public final com.google.android.gms.common.data.DataHolder a;
    public final java.util.List b;
    private final defpackage.aasi c;

    public QueryGroupsBufferResponse(com.google.android.gms.common.data.DataHolder dataHolder, java.util.List list) {
        aais.as(dataHolder);
        this.a = dataHolder;
        this.b = list == null ? java.util.Collections.EMPTY_LIST : list;
        this.c = new defpackage.aasi(dataHolder);
    }

    public final /* synthetic */ void a() {
        close();
    }

    @Override // defpackage.aafu
    public final int c() {
        throw null;
    }

    @Override // defpackage.aafu, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.c.a();
    }

    @Override // defpackage.aafu
    public final /* bridge */ /* synthetic */ java.lang.Object d(int i) {
        throw null;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.people.peopleprovider.QueryGroupsBufferResponse) {
            com.google.android.gms.people.peopleprovider.QueryGroupsBufferResponse queryGroupsBufferResponse = (com.google.android.gms.people.peopleprovider.QueryGroupsBufferResponse) obj;
            if (j$.util.Objects.equals(this.a, queryGroupsBufferResponse.a) && j$.util.Objects.equals(this.b, queryGroupsBufferResponse.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.a, this.b});
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
        return new defpackage.aafv(this.c);
    }

    public final java.lang.String toString() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        aehj.bX("dataHolder", this.a, arrayList);
        aehj.bX("unreachablePackages", this.b, arrayList);
        return aehj.bW(arrayList, this);
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable abstractSafeParcelable = this.a;
        int iF = aais.f(parcel, 20293);
        aais.z(parcel, 1, abstractSafeParcelable, i);
        aais.C(parcel, 2, this.b);
        aais.g(parcel, iF);
    }
}
