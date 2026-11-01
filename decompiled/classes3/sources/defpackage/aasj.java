package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aasj extends defpackage.aaft {
    public aasj(com.google.android.gms.common.data.DataHolder dataHolder) {
        super(dataHolder);
    }

    @Override // defpackage.aafu
    public final /* bridge */ /* synthetic */ java.lang.Object d(int i) {
        com.google.android.gms.common.data.DataHolder dataHolder = this.a;
        if (dataHolder == null) {
            throw new java.lang.IllegalStateException("DataHolder is null");
        }
        int iB = dataHolder.b(i);
        java.lang.String strC = dataHolder.c("lookup_key", i, iB);
        java.lang.String strC2 = dataHolder.g("display_name", i, iB) ? null : dataHolder.c("display_name", i, iB);
        java.lang.String strC3 = dataHolder.g("photo_uri", i, iB) ? null : dataHolder.c("photo_uri", i, iB);
        java.lang.String strC4 = dataHolder.c("package_name", i, iB);
        java.lang.String strC5 = (!dataHolder.f("authority") || dataHolder.g("authority", i, iB)) ? null : dataHolder.c("authority", i, iB);
        int iA = dataHolder.a("capabilities", i, iB);
        boolean z = false;
        if (dataHolder.f("is_known") && !dataHolder.g("is_known", i, iB)) {
            dataHolder.d("is_known", i);
            long j = dataHolder.d[iB].getLong(i, dataHolder.c.getInt("is_known"));
            java.lang.Long.valueOf(j).getClass();
            if (j == 1) {
                z = true;
            }
        }
        java.lang.String strC6 = dataHolder.g("matched_selection_type", i, iB) ? null : dataHolder.c("matched_selection_type", i, iB);
        java.lang.String strC7 = dataHolder.g("matched_selection_value", i, iB) ? null : dataHolder.c("matched_selection_value", i, iB);
        android.net.Uri uri = strC3 != null ? android.net.Uri.parse(strC3) : null;
        aais.at(strC, "lookupKey cannot be null");
        aais.at(strC4, "packageName cannot be null");
        return new com.google.android.gms.people.peopleprovider.PeopleProviderPerson(strC, strC2, uri, strC4, iA, strC6, strC7, strC5, z);
    }
}
