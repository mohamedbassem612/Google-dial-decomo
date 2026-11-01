package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hmk implements defpackage.hqs {
    public final defpackage.hmq a;
    public final aoxh b;

    public hmk(defpackage.hmq hmqVar) {
        this.a = hmqVar;
        ojo ojoVar = hmqVar.e;
        android.net.Uri uri = android.provider.ContactsContract.CommonDataKinds.Phone.CONTENT_URI;
        aooh.e(uri, "CONTENT_URI");
        this.b = new defpackage.hlh(ojoVar.k(uri), this, 2);
    }

    public static final java.util.List b(java.util.List list) {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.lang.Object obj : list) {
            java.lang.Long lValueOf = java.lang.Long.valueOf(((defpackage.hmg) obj).a);
            java.lang.Object arrayList = linkedHashMap.get(lValueOf);
            if (arrayList == null) {
                arrayList = new java.util.ArrayList();
                linkedHashMap.put(lValueOf, arrayList);
            }
            ((java.util.List) arrayList).add(obj);
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(linkedHashMap.size());
        for (java.util.Map.Entry entry : linkedHashMap.entrySet()) {
            ((java.lang.Number) entry.getKey()).longValue();
            java.util.List list2 = (java.util.List) entry.getValue();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.util.Iterator it = list2.iterator();
            while (it.hasNext()) {
                ajsz.bv(arrayList3, ((defpackage.hmg) it.next()).b);
            }
            defpackage.hmg hmgVar = (defpackage.hmg) ajsz.bE(list2);
            long j = hmgVar.a;
            java.lang.String str = hmgVar.c;
            long j2 = hmgVar.d;
            java.lang.String str2 = hmgVar.e;
            java.lang.String str3 = hmgVar.f;
            aooh.f(str, "displayNamePrimary");
            aooh.f(str2, "photoThumbnailUri");
            aooh.f(str3, "lookupKey");
            arrayList2.add(new defpackage.hmg(j, arrayList3, str, j2, str2, str3));
        }
        return arrayList2;
    }

    @Override // defpackage.hqs
    public final aoxh a() {
        return this.b;
    }
}
