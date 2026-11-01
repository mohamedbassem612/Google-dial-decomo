package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aasi extends defpackage.aaft {
    public aasi(com.google.android.gms.common.data.DataHolder dataHolder) {
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
        java.lang.String strC3 = dataHolder.c("package_name", i, iB);
        java.lang.String strC4 = (!dataHolder.f("authority") || dataHolder.g("authority", i, iB)) ? null : dataHolder.c("authority", i, iB);
        java.lang.String strC5 = dataHolder.g("matched_selection_type", i, iB) ? null : dataHolder.c("matched_selection_type", i, iB);
        java.lang.String strC6 = dataHolder.g("matched_selection_value", i, iB) ? null : dataHolder.c("matched_selection_value", i, iB);
        aais.at(strC, "lookupKey cannot be null");
        aais.at(strC3, "packageName cannot be null");
        return new com.google.android.gms.people.peopleprovider.PeopleProviderGroup(strC, strC2, strC3, strC4, strC5, strC6);
    }
}
