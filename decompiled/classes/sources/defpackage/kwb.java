package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class kwb implements defpackage.ajbc {
    private final /* synthetic */ int $cid;

    public /* synthetic */ kwb(int i) {
        this.$cid = i;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: vcv */
    /* JADX INFO: Thrown type has an unknown type hierarchy: vcx */
    /* JADX INFO: Thrown type has an unknown type hierarchy: vex */
    @Override // defpackage.ajbc
    public final java.lang.Object a(defpackage.ajyk ajykVar, java.lang.Object obj) throws vcv, vex, vcx {
        switch (this.$cid) {
            case 0:
                android.database.Cursor cursor = (android.database.Cursor) obj;
                if (cursor == null || !cursor.moveToFirst()) {
                    return null;
                }
                return cursor.getString(cursor.getColumnIndex("data1"));
            case 1:
                android.database.Cursor cursor2 = (android.database.Cursor) obj;
                defpackage.grn grnVar = defpackage.kfu.a;
                int columnIndexOrThrow = cursor2.getColumnIndexOrThrow("_id");
                java.util.ArrayList arrayList = new java.util.ArrayList();
                if (cursor2.moveToFirst()) {
                    do {
                        arrayList.add(java.lang.Long.valueOf(cursor2.getLong(columnIndexOrThrow)));
                    } while (cursor2.moveToNext());
                }
                return defpackage.ahvr.bv(arrayList);
            case 2:
                android.database.Cursor cursor3 = (android.database.Cursor) obj;
                if (cursor3 == null) {
                    return j$.util.Optional.empty();
                }
                return !cursor3.moveToFirst() ? j$.util.Optional.empty() : j$.util.Optional.of(cursor3.getString(0));
            case 3:
                android.database.Cursor cursor4 = (android.database.Cursor) obj;
                int i = nxz.a;
                defpackage.aooh.f(cursor4, "cursor");
                java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
                cursor4.moveToFirst();
                while (!cursor4.isAfterLast()) {
                    java.lang.String string = cursor4.getString(2);
                    if (string != null) {
                        linkedHashSet.add(string);
                    }
                    cursor4.moveToNext();
                }
                return linkedHashSet;
            case 4:
                android.database.Cursor cursor5 = (android.database.Cursor) obj;
                int i2 = nxz.a;
                defpackage.aooh.f(cursor5, "cursor");
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                cursor5.moveToFirst();
                while (!cursor5.isAfterLast()) {
                    java.lang.String string2 = cursor5.getString(0);
                    java.lang.String string3 = cursor5.getString(1);
                    if (string2 != null && string3 != null) {
                        linkedHashMap.put(string2, string3);
                    }
                    cursor5.moveToNext();
                }
                return linkedHashMap;
            case 5:
                android.database.Cursor cursor6 = (android.database.Cursor) obj;
                defpackage.aimz aimzVar = defpackage.onw.a;
                defpackage.aidf aidfVar = new defpackage.aidf(null);
                if (cursor6 == null) {
                    ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) defpackage.onw.a.c()).m(defpackage.aioa.MEDIUM)).i(defpackage.zct.b)).l("com/android/dialer/fixeddialingnumber/impl/phonelookup/FixedDialingNumberPhoneLookupContributor", "getFdnListFromUri", (char) 240, "FixedDialingNumberPhoneLookupContributor.java")).v("null cursor");
                } else if (cursor6.moveToFirst()) {
                    int columnIndexOrThrow2 = cursor6.getColumnIndexOrThrow("name");
                    int columnIndexOrThrow3 = cursor6.getColumnIndexOrThrow("number");
                    do {
                        aidfVar.t(cursor6.getString(columnIndexOrThrow3), cursor6.getString(columnIndexOrThrow2));
                    } while (cursor6.moveToNext());
                } else {
                    ((defpackage.aimw) ((defpackage.aimw) defpackage.onw.a.b()).l("com/android/dialer/fixeddialingnumber/impl/phonelookup/FixedDialingNumberPhoneLookupContributor", "getFdnListFromUri", 245, "FixedDialingNumberPhoneLookupContributor.java")).v("empty cursor");
                }
                return aidfVar;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                android.database.Cursor cursor7 = (android.database.Cursor) obj;
                defpackage.aooh.f(ajykVar, "<unused var>");
                return java.lang.Boolean.valueOf(cursor7 != null && cursor7.getCount() > 0);
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                return java.lang.Boolean.valueOf(((android.database.Cursor) obj).getCount() > 0);
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                android.database.Cursor cursor8 = (android.database.Cursor) obj;
                defpackage.aimz aimzVar2 = tia.a;
                defpackage.aift aiftVarD = defpackage.aify.d(cursor8.getCount());
                cursor8.moveToFirst();
                int columnIndexOrThrow4 = cursor8.getColumnIndexOrThrow("_id");
                int columnIndex = cursor8.getColumnIndex("snippet");
                while (!cursor8.isAfterLast()) {
                    long j = cursor8.getLong(columnIndexOrThrow4);
                    java.lang.String string4 = cursor8.getString(columnIndex);
                    j$.util.Optional.empty();
                    j$.util.Optional optionalOfNullable = j$.util.Optional.ofNullable(string4);
                    if (optionalOfNullable == null) {
                        throw new java.lang.NullPointerException("Null snippet");
                    }
                    aiftVarD.i(new thz(j, optionalOfNullable));
                    cursor8.moveToNext();
                }
                return aiftVarD.g();
            case 9:
                android.database.Cursor cursor9 = (android.database.Cursor) obj;
                defpackage.aimz aimzVar3 = tic.a;
                defpackage.aihb aihbVar = new defpackage.aihb();
                if (cursor9 == null) {
                    ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) tic.a.c()).m(defpackage.aioa.MEDIUM)).i(defpackage.zct.b)).l("com/android/dialer/searchfragment/contactretriever/impl/RawContactsAccountTypeFilter", "getContactIdsWithoutExcludedAccountTypes", 'Q', "RawContactsAccountTypeFilter.java")).v("empty cursor");
                    return aihbVar.g();
                }
                cursor9.moveToFirst();
                while (!cursor9.isAfterLast()) {
                    aihbVar.c(java.lang.Long.valueOf(cursor9.getLong(0)));
                    cursor9.moveToNext();
                }
                return aihbVar.g();
            case 10:
                android.database.Cursor cursor10 = (android.database.Cursor) obj;
                if (cursor10 == null) {
                    return j$.util.Optional.empty();
                }
                if (!cursor10.moveToFirst()) {
                    return j$.util.Optional.empty();
                }
                int columnIndex2 = cursor10.getColumnIndex("date");
                return columnIndex2 < 0 ? j$.util.Optional.empty() : j$.util.Optional.of(java.lang.Long.valueOf(cursor10.getLong(columnIndex2)));
            case 11:
                android.database.Cursor cursor11 = (android.database.Cursor) obj;
                defpackage.aooh.f(ajykVar, "<unused var>");
                return (cursor11 == null || cursor11.getCount() <= 0) ? ujf.b : ujf.a;
            case 12:
                throw new vex();
            case 13:
                defpackage.vcr vcrVar = defpackage.vgg.a;
                return ((vcx) obj).a;
            case 14:
                defpackage.vcr vcrVar2 = defpackage.vgg.a;
                return ((vcx) obj).a;
            case 15:
                throw new vcx(java.lang.String.format("Failed to request data network, got RequestFailedException with error: %s", ((vis) obj).getMessage()), vbw.J);
            case 16:
                throw new vcx(vbw.D, (java.lang.IllegalStateException) obj);
            case 17:
                throw new vcx(vbw.D, (vgv) obj);
            case 18:
                return null;
            case 19:
                throw new vcv(vbw.V, "Failed to request data network", (vis) obj);
            default:
                java.lang.String[] strArr = defpackage.vva.a;
                return java.lang.Integer.valueOf(((android.database.Cursor) obj).getCount());
        }
    }
}
