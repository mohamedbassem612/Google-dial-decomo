package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class vuq implements ajbc {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;

    public /* synthetic */ vuq(lwo lwoVar, java.lang.String str, lwi lwiVar, int i) {
        this.$cid = i;
        this.b = lwoVar;
        this.a = str;
        this.c = lwiVar;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004c  */
    public final java.lang.Object a(ajyk ajykVar, java.lang.Object obj) {
        long j;
        java.lang.String string;
        int i;
        boolean z = false;
        if (this.$cid != 0) {
            android.database.Cursor cursor = (android.database.Cursor) obj;
            if (cursor == null) {
                return aokc.a;
            }
            aokv aokvVar = new aokv(10);
            if (cursor.moveToFirst()) {
                while (aokvVar.b <= 20) {
                    java.lang.String string2 = cursor.getString(3);
                    if (string2 != null) {
                        java.lang.Object obj2 = this.a;
                        java.lang.String string3 = cursor.getString(4);
                        java.lang.String str = (java.lang.String) obj2;
                        if (defpackage.ths.g(str, string2)) {
                            i = 2;
                        } else if (defpackage.ths.e(str, string3) || defpackage.ths.f(str, string3, ((lwo) this.b).b)) {
                            i = 1;
                        } else {
                            i = 0;
                        }
                    } else {
                        i = 0;
                    }
                    if (i != 0) {
                        aokvVar.add(new lwh(defpackage.tin.b(cursor, j$.util.Optional.empty(), i), (lwi) this.c));
                    }
                    if (!cursor.moveToNext()) {
                        break;
                    }
                }
            }
            return ajsz.aX(aokvVar);
        }
        android.database.Cursor cursor2 = (android.database.Cursor) obj;
        if (vva.j(cursor2)) {
            throw new java.lang.IllegalStateException("unable to retrieve voicemail content information");
        }
        java.lang.Object obj3 = this.b;
        java.lang.Object obj4 = this.a;
        kiu kiuVar = ((defpackage.uzo) obj3).d;
        if (kiuVar == null) {
            kiuVar = kiu.a;
        }
        aeqx aeqxVar = ((vva) obj4).o;
        java.lang.Object obj5 = this.c;
        java.lang.String lowerCase = aeqxVar.d(kiuVar, true).toString().toLowerCase(java.util.Locale.getDefault());
        j$.util.Optional optionalEmpty = j$.util.Optional.empty();
        if (obj5 == null) {
            throw new java.lang.NullPointerException("Null uri");
        }
        if (lowerCase == null) {
            throw new java.lang.NullPointerException("Null name");
        }
        int columnIndex = cursor2.getColumnIndex("date");
        if (columnIndex >= 0) {
            j = cursor2.getLong(columnIndex);
            z = true;
        } else {
            a.bI(vva.b.c().m(aioa.b), "DATE index is missing", "com/android/dialer/voicemail/tab/impl/dataservice/impl/VoicemailDataServiceImpl", "getContentInfo", (char) 1038, "VoicemailDataServiceImpl.java", zct.b);
            j = 0;
        }
        long j2 = j;
        int columnIndex2 = cursor2.getColumnIndex("mime_type");
        if (columnIndex2 >= 0) {
            string = cursor2.getString(columnIndex2);
            if (string == null) {
                throw new java.lang.NullPointerException("Null mimeType");
            }
        } else {
            a.bI(vva.b.c().m(aioa.b), "MIME_TYPE index is missing", "com/android/dialer/voicemail/tab/impl/dataservice/impl/VoicemailDataServiceImpl", "getContentInfo", (char) 1051, "VoicemailDataServiceImpl.java", zct.b);
            string = null;
        }
        int columnIndex3 = cursor2.getColumnIndex("transcription");
        if (columnIndex3 >= 0) {
            optionalEmpty = j$.util.Optional.ofNullable(cursor2.getString(columnIndex3));
            if (optionalEmpty == null) {
                throw new java.lang.NullPointerException("Null transcription");
            }
        } else {
            a.bI(vva.b.c().m(aioa.b), "TRANSCRIPTION index is missing", "com/android/dialer/voicemail/tab/impl/dataservice/impl/VoicemailDataServiceImpl", "getContentInfo", (char) 1065, "VoicemailDataServiceImpl.java", zct.b);
        }
        j$.util.Optional optional = optionalEmpty;
        if (z && string != null) {
            return new defpackage.vuz(lowerCase, j2, string, optional, (android.net.Uri) obj5);
        }
        java.lang.String str2 = string;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (!z) {
            sb.append(" date");
        }
        if (str2 == null) {
            sb.append(" mimeType");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public /* synthetic */ vuq(vva vvaVar, defpackage.uzo uzoVar, android.net.Uri uri, int i) {
        this.$cid = i;
        this.a = vvaVar;
        this.b = uzoVar;
        this.c = uri;
    }
}
