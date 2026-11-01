package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ufo {
    private static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/spam/inapp/storage/InAppSpamDatabase");
    private static final defpackage.ahbq b;
    private final defpackage.zzx c;

    static {
        defpackage.afib afibVar = new defpackage.afib();
        afibVar.a("CREATE TABLE in_app_spam_history (\n        phone_number TEXT PRIMARY KEY,\n        in_app_verdict BLOB NOT NULL)");
        b = afibVar.b();
    }

    public ufo(defpackage.aogc aogcVar) {
        this.c = aogcVar.aB("in_app_spam_database", b);
    }

    public static final java.util.Map e(defpackage.adag adagVar, java.util.List list) throws java.io.IOException {
        defpackage.adag adagVar2 = new defpackage.adag((byte[]) null);
        adagVar2.n("SELECT * FROM in_app_spam_history WHERE phone_number in (?");
        adagVar2.p((java.lang.String) list.get(0));
        int size = list.size();
        for (int i = 1; i < size; i++) {
            adagVar2.n(", ?");
            adagVar2.p((java.lang.String) list.get(i));
        }
        adagVar2.n(")");
        defpackage.adag adagVarB = adagVar2.B();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        android.database.Cursor cursorY = adagVar.y(adagVarB);
        while (cursorY.moveToNext()) {
            try {
                int columnIndex = cursorY.getColumnIndex("phone_number");
                int columnIndex2 = cursorY.getColumnIndex("in_app_verdict");
                if (columnIndex < 0) {
                    ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.c()).m(defpackage.aioa.MEDIUM)).i(defpackage.zct.b).l("com/android/dialer/spam/inapp/storage/InAppSpamDatabase", "getInAppSpamVerdictsSync$<anonymous>", 139, "InAppSpamDatabase.kt")).v("failed to find Column COLUMN_ID in cursor");
                } else if (columnIndex2 < 0) {
                    ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.c()).m(defpackage.aioa.MEDIUM)).i(defpackage.zct.b).l("com/android/dialer/spam/inapp/storage/InAppSpamDatabase", "getInAppSpamVerdictsSync$<anonymous>", 147, "InAppSpamDatabase.kt")).v("failed to find Column COLUMN_IN_APP_VERDICT in cursor");
                } else {
                    java.lang.String string = cursorY.getString(columnIndex);
                    defpackage.aooh.e(string, "getString(...)");
                    byte[] blob = cursorY.getBlob(columnIndex2);
                    try {
                        ufu ufuVarB = defpackage.alad.B(ufu.a, blob, defpackage.akzq.a());
                        defpackage.aooh.e(ufuVarB, "parseFrom(...)");
                        linkedHashMap.put(string, ufuVarB);
                    } catch (defpackage.alaz e) {
                        ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.c()).i(defpackage.zct.b)).k(e).l("com/android/dialer/spam/inapp/storage/InAppSpamDatabase", "getInAppSpamVerdictsSync$<anonymous>", 164, "InAppSpamDatabase.kt")).v("failed to deserialize InAppSpamHistory proto");
                    }
                }
            } catch (java.lang.Throwable th) {
                try {
                    throw th;
                } catch (java.lang.Throwable th2) {
                    defpackage.ajsz.ak(cursorY, th);
                    throw th2;
                }
            }
        }
        defpackage.ajsz.ak(cursorY, null);
        return defpackage.ajsz.aS(linkedHashMap);
    }

    public static final boolean f(defpackage.adag adagVar, java.lang.String str, ufu ufuVar) {
        if (str.length() == 0) {
            return false;
        }
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("phone_number", str);
        contentValues.put("in_app_verdict", ufuVar.i());
        return adagVar.k("in_app_spam_history", contentValues, 5) != -1;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(java.lang.String str, defpackage.aoln aolnVar) throws java.lang.Throwable {
        ufk ufkVar;
        if (aolnVar instanceof ufk) {
            ufkVar = (ufk) aolnVar;
            int i = ufkVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ufkVar.c = i - Integer.MIN_VALUE;
            } else {
                ufkVar = new ufk(this, aolnVar);
            }
        } else {
            ufkVar = new ufk(this, aolnVar);
        }
        java.lang.Object objD = ufkVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = ufkVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(objD);
            defpackage.ajcq ajcqVarF = this.c.F(new jsh(str, 10));
            defpackage.aooh.e(ajcqVarF, "executeFunctionTransaction(...)");
            ufkVar.d = str;
            ufkVar.c = 1;
            objD = defpackage.aosv.D(ajcqVarF, ufkVar);
            if (objD == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = ufkVar.d;
            defpackage.aooc.af(objD);
        }
        return ((java.util.Map) objD).get(str);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(java.util.List list, defpackage.aoln aolnVar) throws java.lang.Throwable {
        ufl uflVar;
        if (aolnVar instanceof ufl) {
            uflVar = (ufl) aolnVar;
            int i = uflVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                uflVar.c = i - Integer.MIN_VALUE;
            } else {
                uflVar = new ufl(this, aolnVar);
            }
        } else {
            uflVar = new ufl(this, aolnVar);
        }
        java.lang.Object objD = uflVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = uflVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(objD);
            defpackage.ajcq ajcqVarF = this.c.F(new jsh(list, 11));
            defpackage.aooh.e(ajcqVarF, "executeFunctionTransaction(...)");
            uflVar.c = 1;
            objD = defpackage.aosv.D(ajcqVarF, uflVar);
            if (objD == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(objD);
        }
        defpackage.aooh.e(objD, "await(...)");
        return objD;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(java.lang.String str, ufu ufuVar, defpackage.aoln aolnVar) throws java.lang.Throwable {
        ufm ufmVar;
        if (aolnVar instanceof ufm) {
            ufmVar = (ufm) aolnVar;
            int i = ufmVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ufmVar.c = i - Integer.MIN_VALUE;
            } else {
                ufmVar = new ufm(this, aolnVar);
            }
        } else {
            ufmVar = new ufm(this, aolnVar);
        }
        java.lang.Object objD = ufmVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = ufmVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(objD);
            defpackage.ajcq ajcqVarF = this.c.F(new ufj(str, ufuVar, 0));
            defpackage.aooh.e(ajcqVarF, "executeFunctionTransaction(...)");
            ufmVar.c = 1;
            objD = defpackage.aosv.D(ajcqVarF, ufmVar);
            if (objD == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(objD);
        }
        defpackage.aooh.e(objD, "await(...)");
        return objD;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object d(java.lang.String str, ufu ufuVar, defpackage.aoln aolnVar) throws java.lang.Throwable {
        ufn ufnVar;
        if (aolnVar instanceof ufn) {
            ufnVar = (ufn) aolnVar;
            int i = ufnVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ufnVar.c = i - Integer.MIN_VALUE;
            } else {
                ufnVar = new ufn(this, aolnVar);
            }
        } else {
            ufnVar = new ufn(this, aolnVar);
        }
        java.lang.Object objD = ufnVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = ufnVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(objD);
            defpackage.ajcq ajcqVarF = this.c.F(new ufj(str, ufuVar, 2));
            defpackage.aooh.e(ajcqVarF, "executeFunctionTransaction(...)");
            ufnVar.c = 1;
            objD = defpackage.aosv.D(ajcqVarF, ufnVar);
            if (objD == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(objD);
        }
        defpackage.aooh.e(objD, "await(...)");
        return objD;
    }
}
