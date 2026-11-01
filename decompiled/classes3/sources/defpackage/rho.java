package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class rho implements android.content.Loader.OnLoadCompleteListener {
    public static final aimz a = aimz.i("com/android/dialer/interactions/PhoneNumberInteraction");
    static final java.lang.String b = "rho";
    public static final java.lang.String[] c = {"_id", "data1", "is_super_primary", "data2", "data3", "mimetype", "contact_id"};
    public static final aify d;
    private static final java.lang.String[] g;
    public final android.content.Context e;
    public android.content.CursorLoader f;
    private final jxb h;
    private long i = -1;

    static {
        java.lang.String[] strArr = {"_id", "data1", "is_super_primary", "account_type", "data_set", "data2", "data3", "mimetype", "contact_id"};
        g = strArr;
        d = aify.o(strArr);
    }

    public rho(android.content.Context context, jxb jxbVar) {
        this.e = context;
        this.h = jxbVar;
    }

    public static void a(android.content.Context context, java.lang.String str, int i, boolean z, jxb jxbVar) {
        rhn rhnVarBl = pez.bl(context);
        if (i == 2) {
            defpackage.uxw.b(context, new android.content.Intent("android.intent.action.SENDTO", android.net.Uri.fromParts("sms", str, null)), 2132017288);
            return;
        }
        acxg acxgVarOW = rhnVarBl.oW();
        defpackage.amdx amdxVar = new defpackage.amdx(null, null, null);
        amdxVar.s(str);
        amdxVar.m(jxbVar);
        amdxVar.q(z);
        amdxVar.l(jxbVar.l);
        acxgVarOW.w((defpackage.zrx) amdxVar.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void b(int i) {
        android.content.Context context = this.e;
        if (i == 1 || i == 2) {
            android.widget.Toast.makeText(context, 2132018297, 0).show();
        }
        ((com.android.dialer.shortcuts.CallContactActivity) context).finish();
    }

    private final void c(java.lang.String str) {
        a(this.e, str, 1, false, this.h);
    }

    @Override // android.content.Loader.OnLoadCompleteListener
    public final /* synthetic */ void onLoadComplete(android.content.Loader loader, java.lang.Object obj) {
        int columnIndexOrThrow;
        int columnIndexOrThrow2;
        java.lang.String str;
        java.lang.String str2;
        java.util.ArrayList<? extends android.os.Parcelable> arrayList;
        android.database.Cursor cursor = (android.database.Cursor) obj;
        java.lang.String str3 = "com/android/dialer/interactions/PhoneNumberInteraction";
        if (cursor == null) {
            a.b().l("com/android/dialer/interactions/PhoneNumberInteraction", "onLoadComplete", 325, "PhoneNumberInteraction.java").v("null cursor");
            b(3);
            return;
        }
        try {
            java.util.ArrayList<? extends android.os.Parcelable> arrayList2 = new java.util.ArrayList<>();
            android.content.Context context = this.e;
            if (!((uxz) context).o) {
                a.b().l("com/android/dialer/interactions/PhoneNumberInteraction", "onLoadComplete", 333, "PhoneNumberInteraction.java").v("not safe to commit transaction");
                b(4);
            } else if (cursor.moveToFirst()) {
                int columnIndexOrThrow3 = cursor.getColumnIndexOrThrow("contact_id");
                int columnIndexOrThrow4 = cursor.getColumnIndexOrThrow("is_super_primary");
                int columnIndexOrThrow5 = cursor.getColumnIndexOrThrow("data1");
                int columnIndexOrThrow6 = cursor.getColumnIndexOrThrow("_id");
                boolean zBooleanValue = ((java.lang.Boolean) pez.bl(context).hS().a()).booleanValue();
                if (zBooleanValue) {
                    columnIndexOrThrow = -1;
                    columnIndexOrThrow2 = -1;
                } else {
                    columnIndexOrThrow = cursor.getColumnIndexOrThrow("account_type");
                    columnIndexOrThrow2 = cursor.getColumnIndexOrThrow("data_set");
                }
                int columnIndexOrThrow7 = cursor.getColumnIndexOrThrow("data2");
                int columnIndexOrThrow8 = cursor.getColumnIndexOrThrow("data3");
                int columnIndexOrThrow9 = cursor.getColumnIndexOrThrow("mimetype");
                java.util.ArrayList<? extends android.os.Parcelable> arrayList3 = arrayList2;
                java.lang.String string = null;
                while (true) {
                    if (this.i == -1) {
                        this.i = cursor.getLong(columnIndexOrThrow3);
                    }
                    if (cursor.getInt(columnIndexOrThrow4) != 0) {
                        string = cursor.getString(columnIndexOrThrow5);
                    }
                    str = string;
                    com.android.dialer.interactions.PhoneNumberInteraction$PhoneItem phoneNumberInteraction$PhoneItem = new com.android.dialer.interactions.PhoneNumberInteraction$PhoneItem();
                    int i = columnIndexOrThrow3;
                    str2 = str3;
                    phoneNumberInteraction$PhoneItem.a = cursor.getLong(columnIndexOrThrow6);
                    phoneNumberInteraction$PhoneItem.b = cursor.getString(columnIndexOrThrow5);
                    if (zBooleanValue) {
                        phoneNumberInteraction$PhoneItem.c = null;
                        phoneNumberInteraction$PhoneItem.d = null;
                    } else {
                        phoneNumberInteraction$PhoneItem.c = cursor.getString(columnIndexOrThrow);
                        phoneNumberInteraction$PhoneItem.d = cursor.getString(columnIndexOrThrow2);
                    }
                    phoneNumberInteraction$PhoneItem.e = cursor.getInt(columnIndexOrThrow7);
                    phoneNumberInteraction$PhoneItem.f = cursor.getString(columnIndexOrThrow8);
                    phoneNumberInteraction$PhoneItem.g = cursor.getString(columnIndexOrThrow9);
                    arrayList = arrayList3;
                    arrayList.add(phoneNumberInteraction$PhoneItem);
                    if (!cursor.moveToNext()) {
                        break;
                    }
                    arrayList3 = arrayList;
                    str3 = str2;
                    columnIndexOrThrow3 = i;
                    string = str;
                }
                if (str != null) {
                    c(str);
                } else {
                    int size = arrayList.size();
                    if (size <= 20) {
                        int i2 = 0;
                        while (i2 < size) {
                            com.android.dialer.interactions.PhoneNumberInteraction$PhoneItem phoneNumberInteraction$PhoneItem2 = (com.android.dialer.interactions.PhoneNumberInteraction$PhoneItem) arrayList.get(i2);
                            int i3 = i2 + 1;
                            if (phoneNumberInteraction$PhoneItem2 != null) {
                                for (int i4 = i3; i4 < size; i4++) {
                                    com.android.dialer.interactions.PhoneNumberInteraction$PhoneItem phoneNumberInteraction$PhoneItem3 = (com.android.dialer.interactions.PhoneNumberInteraction$PhoneItem) arrayList.get(i4);
                                    if (phoneNumberInteraction$PhoneItem3 != null) {
                                        if (!phoneNumberInteraction$PhoneItem2.a(phoneNumberInteraction$PhoneItem3, context)) {
                                            if (phoneNumberInteraction$PhoneItem3.a(phoneNumberInteraction$PhoneItem2, context)) {
                                                arrayList.set(i2, null);
                                                break;
                                            }
                                        } else {
                                            arrayList.set(i4, null);
                                        }
                                    }
                                }
                            }
                            i2 = i3;
                        }
                        java.util.Iterator<? extends android.os.Parcelable> it = arrayList.iterator();
                        while (it.hasNext()) {
                            if (it.next() == null) {
                                it.remove();
                            }
                        }
                    }
                    if (arrayList.isEmpty()) {
                        b(2);
                    } else if (arrayList.size() == 1) {
                        c(((com.android.dialer.interactions.PhoneNumberInteraction$PhoneItem) arrayList.get(0)).b);
                    } else if (((da) context).isFinishing()) {
                        a.b().l(str2, "showDisambiguationDialog", 478, "PhoneNumberInteraction.java").v("activity finishing");
                    } else if (((da) context).isDestroyed()) {
                        a.b().l(str2, "showDisambiguationDialog", 484, "PhoneNumberInteraction.java").v("activity destroyed");
                    } else {
                        try {
                            bo boVarA = ((az) context).a();
                            jxb jxbVar = this.h;
                            defpackage.rhl rhlVar = new defpackage.rhl();
                            android.os.Bundle bundle = new android.os.Bundle();
                            bundle.putParcelableArrayList("phoneList", arrayList);
                            bundle.putInt("interactionType", 1);
                            bundle.putBoolean("is_video_call", false);
                            defpackage.sns.v(bundle, "com.android.dialer.callintent.CALL_SPECIFIC_APP_DATA", jxbVar);
                            rhlVar.au(bundle);
                            rhlVar.q(boVarA, b);
                        } catch (java.lang.IllegalStateException e) {
                            a.bq(a.c(), "caught exception", "com/android/dialer/interactions/PhoneNumberInteraction", "showDisambiguationDialog", (char) 498, "PhoneNumberInteraction.java", e, zct.b);
                        }
                    }
                }
            } else {
                b(1);
            }
            cursor.close();
        } catch (java.lang.Throwable th) {
            cursor.close();
            throw th;
        }
    }
}
