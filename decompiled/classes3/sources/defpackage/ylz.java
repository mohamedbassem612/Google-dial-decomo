package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ylz {
    public java.lang.String a;
    public java.lang.String b;
    public java.util.List c;
    public com.google.android.apps.aicore.aidl.ResponseSchema d;
    public java.util.List e;
    public java.util.List f;
    public java.util.List g;
    public java.lang.String h;
    public java.util.Map i;
    private int j;
    private byte k;

    public final com.google.android.apps.aicore.aidl.ResponseSchema a() {
        if (this.k != 1) {
            throw new java.lang.IllegalStateException("Missing required properties: type");
        }
        int i = this.j;
        java.lang.String str = this.a;
        java.lang.String str2 = this.b;
        java.util.List list = this.c;
        com.google.android.apps.aicore.aidl.ResponseSchema responseSchema = this.d;
        java.util.List<java.lang.String> list2 = this.e;
        java.util.List list3 = this.f;
        java.util.List list4 = this.g;
        java.lang.String str3 = this.h;
        java.util.Map map = this.i;
        if (list2 != null && !list2.isEmpty()) {
            if (map == null) {
                throw new java.lang.IllegalArgumentException("Required property is set but properties are null or empty.");
            }
            for (java.lang.String str4 : list2) {
                if (!map.containsKey(str4)) {
                    throw new java.lang.IllegalArgumentException(a.bk(str4, "Required property '", "' is not present in properties."));
                }
            }
        }
        android.os.Bundle bundle = null;
        aify aifyVarN = list == null ? null : aify.n(list);
        aify aifyVarN2 = list2 == null ? null : aify.n(list2);
        java.util.List listN = list3 == null ? null : aify.n(list3);
        java.util.List listN2 = list4 == null ? null : aify.n(list4);
        if (map != null && !map.isEmpty()) {
            bundle = new android.os.Bundle();
            ailj ailjVarK = ((aikj) map).e().k();
            while (ailjVarK.hasNext()) {
                java.util.Map.Entry entry = (java.util.Map.Entry) ailjVarK.next();
                com.google.android.gms.common.internal.safeparcel.SafeParcelable safeParcelable = (com.google.android.apps.aicore.aidl.ResponseSchema) entry.getValue();
                java.lang.String str5 = (java.lang.String) entry.getKey();
                android.os.Bundle bundle2 = new android.os.Bundle();
                if (safeParcelable instanceof defpackage.yle) {
                    ((defpackage.yle) safeParcelable).a();
                }
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                safeParcelable.writeToParcel(parcelObtain, 0);
                bundle2.putByteArray("schema_data", parcelObtain.marshall());
                parcelObtain.recycle();
                bundle.putBundle(str5, bundle2);
            }
        }
        return new com.google.android.apps.aicore.aidl.ResponseSchema(i, str, str2, null, aifyVarN, responseSchema, null, null, aifyVarN2, null, null, null, null, null, null, null, listN, listN2, str3, bundle);
    }

    public final void b(int i) {
        this.j = i;
        this.k = (byte) 1;
    }
}
