package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class wqr {
    public static final /* synthetic */ int d = 0;
    private static final defpackage.aimz e = defpackage.aimz.i("com/android/dialer/xatu/impl/storage/XatuDatabase");
    private static final defpackage.ahbq f;
    public final defpackage.ajct a;
    public final defpackage.aoin b;
    public final defpackage.zzx c;

    static {
        defpackage.afib afibVar = new defpackage.afib();
        afibVar.a("CREATE TABLE xatu_data (call_creation_time_millis INTEGER PRIMARY KEY, last_modified_timestamp_millis INTEGER NOT NULL, persisted_details BLOB NOT NULL)");
        f = afibVar.b();
    }

    public wqr(defpackage.ajct ajctVar, defpackage.aogc aogcVar, defpackage.aoin aoinVar) {
        this.a = ajctVar;
        this.c = aogcVar.aB("xatu_data", f);
        this.b = aoinVar;
    }

    public static void f(java.util.List list) {
        defpackage.ailk ailkVarListIterator = ((defpackage.aify) list).listIterator(0);
        while (ailkVarListIterator.hasNext()) {
            wqt wqtVar = ((wqp) ailkVarListIterator.next()).e;
            if (wqtVar == null) {
                wqtVar = wqt.a;
            }
            wqs wqsVar = wqtVar.c;
            if (wqsVar == null) {
                wqsVar = wqs.a;
            }
            for (wrf wrfVar : wqsVar.c) {
                if ((wrfVar.b & 4) != 0) {
                    o(wrfVar.e);
                }
                if ((wrfVar.b & 2) != 0) {
                    wqn wqnVar = wrfVar.d;
                    if (wqnVar == null) {
                        wqnVar = wqn.a;
                    }
                    o(wqnVar.c);
                }
                if ((wrfVar.b & 8) != 0) {
                    o(wrfVar.f);
                }
                if ((wrfVar.b & 16) != 0) {
                    o(wrfVar.g);
                }
            }
        }
    }

    public static final wqp g(long j, wgu wguVar) {
        defpackage.akzx akzxVarM = wqp.a.m();
        akzxVarM.u();
        wqp wqpVar = akzxVarM.b;
        wqpVar.b |= 1;
        wqpVar.c = j;
        long epochMilli = j$.time.Instant.now().toEpochMilli();
        akzxVarM.u();
        wqp wqpVar2 = akzxVarM.b;
        wqpVar2.b |= 2;
        wqpVar2.d = epochMilli;
        defpackage.akzx akzxVarM2 = wqt.a.m();
        akzxVarM2.u();
        wqt wqtVar = akzxVarM2.b;
        j$.util.Objects.requireNonNull(wguVar);
        wqtVar.d = wguVar;
        wqtVar.b |= 2;
        wqs wqsVar = wqs.a;
        akzxVarM2.u();
        wqt wqtVar2 = akzxVarM2.b;
        j$.util.Objects.requireNonNull(wqsVar);
        wqtVar2.c = wqsVar;
        wqtVar2.b |= 1;
        wqt wqtVarR = akzxVarM2.r();
        akzxVarM.u();
        wqp wqpVar3 = akzxVarM.b;
        j$.util.Objects.requireNonNull(wqtVarR);
        wqpVar3.e = wqtVarR;
        wqpVar3.b |= 4;
        return akzxVarM.r();
    }

    public static final defpackage.aify h(java.util.List list) {
        defpackage.aift aiftVar = new defpackage.aift(4);
        defpackage.ailk ailkVarListIterator = ((defpackage.aify) list).listIterator(0);
        while (ailkVarListIterator.hasNext()) {
            wqp wqpVar = (wqp) ailkVarListIterator.next();
            wqt wqtVar = wqpVar.e;
            if (wqtVar == null) {
                wqtVar = wqt.a;
            }
            wgu wguVar = wqtVar.d;
            if (wguVar == null) {
                wguVar = wgu.a;
            }
            defpackage.akzx akzxVarL = wguVar.L();
            akzxVarL.u();
            wgu wguVar2 = akzxVarL.b;
            wguVar2.b |= 1;
            wguVar2.c = false;
            akzxVarL.u();
            wgu wguVar3 = akzxVarL.b;
            wguVar3.b |= 2;
            wguVar3.d = false;
            aiftVar.i(g(wqpVar.c, akzxVarL.r()));
        }
        return aiftVar.g();
    }

    public static defpackage.aify i(defpackage.adag adagVar, defpackage.aify aifyVar) {
        int i;
        defpackage.aift aiftVar = new defpackage.aift(4);
        defpackage.aift aiftVar2 = new defpackage.aift(4);
        java.util.Iterator it = defpackage.ahvr.bf(aifyVar, 999).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.util.List list = (java.util.List) it.next();
            defpackage.adag adagVar2 = new defpackage.adag((byte[]) null);
            adagVar2.n("SELECT * FROM xatu_data WHERE call_creation_time_millis IN (?");
            adagVar2.o((java.lang.Long) list.get(0));
            for (int i2 = 1; i2 < list.size(); i2++) {
                adagVar2.n(", ?");
                adagVar2.o((java.lang.Long) list.get(i2));
            }
            adagVar2.n(")");
            aiftVar2.i(adagVar2.B());
        }
        defpackage.aify aifyVarG = aiftVar2.g();
        int i3 = ((defpackage.aike) aifyVarG).d;
        for (i = 0; i < i3; i++) {
            android.database.Cursor cursorY = adagVar.y((defpackage.adag) aifyVarG.get(i));
            while (cursorY.moveToNext()) {
                try {
                    j$.util.Optional optionalN = n(cursorY);
                    j$.util.Objects.requireNonNull(aiftVar);
                    wlm wlmVar = new wlm(aiftVar, 4);
                    if (true == optionalN.isPresent()) {
                        ((defpackage.aift) wlmVar.a).i(optionalN.get());
                    }
                } catch (java.lang.Throwable th) {
                    if (cursorY != null) {
                        try {
                            cursorY.close();
                        } catch (java.lang.Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }
            if (cursorY != null) {
                cursorY.close();
            }
        }
        return aiftVar.g();
    }

    public static j$.util.Optional j(defpackage.adag adagVar, long j) {
        defpackage.adag adagVar2 = new defpackage.adag((byte[]) null);
        adagVar2.n("SELECT * FROM xatu_data WHERE call_creation_time_millis = ?");
        adagVar2.o(java.lang.Long.valueOf(j));
        android.database.Cursor cursorY = adagVar.y(adagVar2.B());
        try {
            j$.util.Optional optionalEmpty = !cursorY.moveToFirst() ? j$.util.Optional.empty() : n(cursorY);
            if (cursorY != null) {
                cursorY.close();
            }
            return optionalEmpty;
        } catch (java.lang.Throwable th) {
            if (cursorY != null) {
                try {
                    cursorY.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static final void k(defpackage.adag adagVar, wqp wqpVar) throws java.lang.InterruptedException {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("call_creation_time_millis", java.lang.Long.valueOf(wqpVar.c));
        contentValues.put("last_modified_timestamp_millis", java.lang.Long.valueOf(j$.time.Instant.now().toEpochMilli()));
        wqt wqtVar = wqpVar.e;
        if (wqtVar == null) {
            wqtVar = wqt.a;
        }
        contentValues.put("persisted_details", wqtVar.i());
        adagVar.k("xatu_data", contentValues, 5);
    }

    public static defpackage.aify l(defpackage.adag adagVar, defpackage.adag adagVar2) {
        defpackage.aift aiftVar = new defpackage.aift(4);
        android.database.Cursor cursorY = adagVar.y(adagVar2);
        while (cursorY.moveToNext()) {
            try {
                j$.util.Optional optionalN = n(cursorY);
                j$.util.Objects.requireNonNull(aiftVar);
                wlm wlmVar = new wlm(aiftVar, 4);
                if (true == optionalN.isPresent()) {
                    ((defpackage.aift) wlmVar.a).i(optionalN.get());
                }
            } catch (java.lang.Throwable th) {
                if (cursorY != null) {
                    try {
                        cursorY.close();
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        if (cursorY != null) {
            cursorY.close();
        }
        return aiftVar.g();
    }

    private static j$.util.Optional n(android.database.Cursor cursor) {
        long j = cursor.getLong(cursor.getColumnIndex("call_creation_time_millis"));
        long j2 = cursor.getLong(cursor.getColumnIndex("last_modified_timestamp_millis"));
        byte[] blob = cursor.getBlob(cursor.getColumnIndex("persisted_details"));
        try {
            defpackage.akzx akzxVarM = wqp.a.m();
            akzxVarM.u();
            wqp wqpVar = akzxVarM.b;
            wqpVar.b |= 1;
            wqpVar.c = j;
            akzxVarM.u();
            wqp wqpVar2 = akzxVarM.b;
            wqpVar2.b |= 2;
            wqpVar2.d = j2;
            wqt wqtVarB = defpackage.alad.B(wqt.a, blob, defpackage.akzq.a());
            akzxVarM.u();
            wqp wqpVar3 = akzxVarM.b;
            j$.util.Objects.requireNonNull(wqtVarB);
            wqpVar3.e = wqtVarB;
            wqpVar3.b |= 4;
            return j$.util.Optional.of(akzxVarM.r());
        } catch (defpackage.alaz e2) {
            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) e.c()).i(defpackage.zct.b)).k(e2)).l("com/android/dialer/xatu/impl/storage/XatuDatabase", "toXatuData", (char) 478, "XatuDatabase.java")).v("failed to deserialize persisted details proto");
            return j$.util.Optional.empty();
        }
    }

    private static void o(java.lang.String str) {
        if (str.isEmpty()) {
            return;
        }
        java.io.File file = new java.io.File(str);
        if (!file.exists()) {
            ((defpackage.aimw) ((defpackage.aimw) e.b()).l("com/android/dialer/xatu/impl/storage/XatuDatabase", "deleteFile", 434, "XatuDatabase.java")).y("file %s doesn't exist", file.getName());
        } else {
            if (file.delete()) {
                return;
            }
            defpackage.ainm ainmVarD = e.d();
            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ainmVarD).i(defpackage.zct.b)).l("com/android/dialer/xatu/impl/storage/XatuDatabase", "deleteFile", (char) 439, "XatuDatabase.java")).y("unable to delete file %s", file.getName());
        }
    }

    public final defpackage.ajcq a(defpackage.aify aifyVar) {
        return defpackage.ahvr.H(this.c.F(new ufj(this, aifyVar, 5)), new wie(this, 19), this.a);
    }

    public final defpackage.ajcq b(defpackage.aify aifyVar) {
        return this.c.F(new jsh(aifyVar, 15));
    }

    public final defpackage.ajcq c(long j) {
        return this.c.F(new lbk(j, 7));
    }

    public final defpackage.ajcq d(long j, wgu wguVar) {
        return defpackage.ahvr.H(this.c.G(new wqq(j, wguVar, 1)), new wie(this, 18), this.a);
    }

    public final defpackage.ajcq e(long j, wqs wqsVar) {
        return this.c.G(new wqq(j, wqsVar, 0));
    }

    public final defpackage.ajcq m(defpackage.adag adagVar) {
        return this.c.F(new jsh(adagVar, 14));
    }
}
