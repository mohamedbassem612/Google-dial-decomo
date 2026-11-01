package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class agqh implements defpackage.ahyc {
    private final /* synthetic */ int $cid;

    public /* synthetic */ agqh(int i) {
        this.$cid = i;
    }

    @Override // defpackage.ahyc
    public final java.lang.Object apply(java.lang.Object obj) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        switch (this.$cid) {
            case 0:
                return null;
            case 1:
                defpackage.aift aiftVar = new defpackage.aift(4);
                for (defpackage.agqm agqmVar : j$.util.DesugarCollections.unmodifiableMap(((defpackage.agqk) obj).d).values()) {
                    int iAQ = defpackage.a.aQ(agqmVar.e);
                    if (iAQ == 0) {
                        iAQ = 1;
                    }
                    if (iAQ == 2) {
                        aiftVar.i(defpackage.aogc.H(agqmVar));
                    }
                }
                return aiftVar.g();
            case 2:
                return null;
            case 3:
                defpackage.aift aiftVar2 = new defpackage.aift(4);
                for (defpackage.gsx gsxVar : (java.util.List) obj) {
                    if (!gsxVar.c.contains("tiktok_account_work")) {
                        aiftVar2.i(gsxVar);
                    }
                }
                return aiftVar2.g();
            case 4:
                return new defpackage.ahbm(true);
            case 5:
                defpackage.ahbq ahbqVar = defpackage.ahew.k;
                return null;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                java.util.HashSet hashSet = new java.util.HashSet();
                for (agon agonVar : (java.util.List) obj) {
                    if (!agonVar.b.j.equals("incognito")) {
                        hashSet.add(agonVar.a);
                    }
                }
                return hashSet;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                return null;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                return defpackage.ahot.a;
            case 9:
                int i = defpackage.ajcj.a;
                return java.lang.Boolean.valueOf(((java.util.List) obj).contains(java.lang.String.class));
            case 10:
                int i2 = defpackage.ajcj.a;
                return java.lang.Boolean.valueOf(((java.util.List) obj).contains(java.lang.Throwable.class));
            case 11:
                int i3 = defpackage.ajcj.a;
                return java.util.Arrays.asList(((java.lang.reflect.Constructor) obj).getParameterTypes());
            case 12:
                android.content.Context context = (android.content.Context) obj;
                java.lang.String str5 = defpackage.andh.a;
                if (str5 != null) {
                    return str5;
                }
                synchronized (defpackage.andh.class) {
                    java.lang.String str6 = defpackage.andh.a;
                    if (str6 == null) {
                        java.lang.String strE = defpackage.aewo.e(context, "com.google.android.gms.auth_account_client");
                        defpackage.andh.a = strE;
                        str = strE;
                    } else {
                        str = str6;
                    }
                    break;
                }
                return str;
            case 13:
                android.content.Context context2 = (android.content.Context) obj;
                java.lang.String str7 = defpackage.ando.a;
                if (str7 != null) {
                    return str7;
                }
                synchronized (defpackage.ando.class) {
                    java.lang.String str8 = defpackage.ando.a;
                    if (str8 == null) {
                        java.lang.String strE2 = defpackage.aewo.e(context2, "com.google.android.gms.clearcut_client");
                        defpackage.ando.a = strE2;
                        str2 = strE2;
                    } else {
                        str2 = str8;
                    }
                    break;
                }
                return str2;
            case 14:
                return defpackage.anee.a((android.content.Context) obj);
            case 15:
                android.content.Context context3 = (android.content.Context) obj;
                java.lang.String str9 = defpackage.anfa.b;
                if (str9 != null) {
                    return str9;
                }
                synchronized (defpackage.anfa.class) {
                    java.lang.String str10 = defpackage.anfa.b;
                    if (str10 == null) {
                        java.lang.String strE3 = defpackage.aewo.e(context3, "com.google.android.libraries.notifications.platform");
                        defpackage.anfa.b = strE3;
                        str3 = strE3;
                    } else {
                        str3 = str10;
                    }
                    break;
                }
                return str3;
            default:
                android.content.Context context4 = (android.content.Context) obj;
                java.lang.String str11 = defpackage.anhb.a;
                if (str11 != null) {
                    return str11;
                }
                synchronized (defpackage.anhb.class) {
                    java.lang.String str12 = defpackage.anhb.a;
                    if (str12 == null) {
                        java.lang.String strE4 = defpackage.aewo.e(context4, "com.google.android.libraries.mdi.sync");
                        defpackage.anhb.a = strE4;
                        str4 = strE4;
                    } else {
                        str4 = str12;
                    }
                    break;
                }
                return str4;
        }
    }
}
