package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class nri {
    public static final java.lang.String b;
    public static final java.lang.String c;
    public static final java.lang.String d;
    public static final java.lang.String e;
    private static final defpackage.ahbq h;
    private final defpackage.aoin g;
    private final defpackage.zzx i;
    private final defpackage.aogc j;
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/dobby/impl/storage/DobbyDatabase");
    private static final java.lang.String f = "CREATE TABLE dobby_session (\n        call_creation_time_millis INTEGER PRIMARY KEY,\n        last_modified_millis INTEGER NOT NULL,\n        data BLOB NOT NULL)";

    static {
        defpackage.afib afibVar = new defpackage.afib();
        afibVar.a("CREATE TABLE dobby_session (\n        call_creation_time_millis INTEGER PRIMARY KEY,\n        last_modified_millis INTEGER NOT NULL,\n        data BLOB NOT NULL)");
        h = afibVar.b();
        b = "SELECT * FROM dobby_session WHERE call_creation_time_millis < ?";
        c = "SELECT * FROM dobby_session WHERE call_creation_time_millis = ?";
        d = "SELECT * FROM dobby_session";
        e = "SELECT * FROM dobby_session WHERE last_modified_millis >= ?";
    }

    public nri(defpackage.aoss aossVar, defpackage.aogc aogcVar, defpackage.aazc aazcVar, defpackage.aoin aoinVar) {
        if (aossVar == null) {
            defpackage.aooh.i("lightweightScope");
        }
        if (aazcVar == null) {
            defpackage.aooh.i("clock");
        }
        if (aoinVar == null) {
            defpackage.aooh.i("annotatedCallLogRefreshStarter");
        }
        this.j = aogcVar;
        this.g = aoinVar;
        this.i = aogcVar.aB("dobby_storage", h);
    }

    public static final boolean o(defpackage.adag adagVar, long j, nsq nsqVar) {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("call_creation_time_millis", java.lang.Long.valueOf(j));
        contentValues.put("last_modified_millis", java.lang.Long.valueOf(j$.time.Instant.now().toEpochMilli()));
        contentValues.put("data", nsqVar.i());
        return adagVar.k("dobby_session", contentValues, 5) != -1;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(java.util.List list, defpackage.aoln aolnVar) throws java.lang.Throwable {
        nqv nqvVar;
        if (aolnVar instanceof nqv) {
            nqvVar = (nqv) aolnVar;
            int i = nqvVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nqvVar.c = i - Integer.MIN_VALUE;
            } else {
                nqvVar = new nqv(this, aolnVar);
            }
        } else {
            nqvVar = new nqv(this, aolnVar);
        }
        java.lang.Object objD = nqvVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = nqvVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(objD);
            defpackage.ajcq ajcqVarF = this.i.F(new jsh(list, 7));
            defpackage.aooh.e(ajcqVarF, "executeFunctionTransaction(...)");
            nqvVar.c = 1;
            objD = defpackage.aosv.D(ajcqVarF, nqvVar);
            if (objD == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(objD);
        }
        java.lang.Integer num = (java.lang.Integer) objD;
        defpackage.aooh.c(num);
        return num;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(java.util.List list, defpackage.aoln aolnVar) throws java.lang.Throwable {
        nqw nqwVar;
        if (aolnVar instanceof nqw) {
            nqwVar = (nqw) aolnVar;
            int i = nqwVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nqwVar.c = i - Integer.MIN_VALUE;
            } else {
                nqwVar = new nqw(this, aolnVar);
            }
        } else {
            nqwVar = new nqw(this, aolnVar);
        }
        java.lang.Object objD = nqwVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = nqwVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(objD);
            defpackage.ajcq ajcqVarF = this.i.F(new jsh(list, 5));
            defpackage.aooh.e(ajcqVarF, "executeFunctionTransaction(...)");
            nqwVar.c = 1;
            objD = defpackage.aosv.D(ajcqVarF, nqwVar);
            if (objD == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(objD);
        }
        java.lang.Integer num = (java.lang.Integer) objD;
        ((defpackage.kjr) this.g.a()).a();
        defpackage.aooh.c(num);
        return num;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(long j, defpackage.aoln aolnVar) throws java.lang.Throwable {
        nqx nqxVar;
        if (aolnVar instanceof nqx) {
            nqxVar = (nqx) aolnVar;
            int i = nqxVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nqxVar.c = i - Integer.MIN_VALUE;
            } else {
                nqxVar = new nqx(this, aolnVar);
            }
        } else {
            nqxVar = new nqx(this, aolnVar);
        }
        java.lang.Object objD = nqxVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = nqxVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(objD);
            defpackage.ajcq ajcqVarF = this.i.F(new lbk(j, 2));
            defpackage.aooh.e(ajcqVarF, "executeFunctionTransaction(...)");
            nqxVar.c = 1;
            objD = defpackage.aosv.D(ajcqVarF, nqxVar);
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
    public final java.lang.Object d(long j, defpackage.aoln aolnVar) throws java.lang.Throwable {
        nqy nqyVar;
        if (aolnVar instanceof nqy) {
            nqyVar = (nqy) aolnVar;
            int i = nqyVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nqyVar.c = i - Integer.MIN_VALUE;
            } else {
                nqyVar = new nqy(this, aolnVar);
            }
        } else {
            nqyVar = new nqy(this, aolnVar);
        }
        java.lang.Object objD = nqyVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = nqyVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(objD);
            defpackage.ajcq ajcqVarF = this.i.F(new lbk(j, 4));
            defpackage.aooh.e(ajcqVarF, "executeFunctionTransaction(...)");
            nqyVar.c = 1;
            objD = defpackage.aosv.D(ajcqVarF, nqyVar);
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
    public final java.lang.Object e(java.util.List list, defpackage.aoln aolnVar) throws java.lang.Throwable {
        nqz nqzVar;
        if (aolnVar instanceof nqz) {
            nqzVar = (nqz) aolnVar;
            int i = nqzVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nqzVar.c = i - Integer.MIN_VALUE;
            } else {
                nqzVar = new nqz(this, aolnVar);
            }
        } else {
            nqzVar = new nqz(this, aolnVar);
        }
        java.lang.Object objD = nqzVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = nqzVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(objD);
            defpackage.ajcq ajcqVarF = this.i.F(new jsh(list, 8));
            defpackage.aooh.e(ajcqVarF, "executeFunctionTransaction(...)");
            nqzVar.c = 1;
            objD = defpackage.aosv.D(ajcqVarF, nqzVar);
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
    public final java.lang.Object f(long j, defpackage.aoln aolnVar) throws java.lang.Throwable {
        nra nraVar;
        if (aolnVar instanceof nra) {
            nraVar = (nra) aolnVar;
            int i = nraVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nraVar.c = i - Integer.MIN_VALUE;
            } else {
                nraVar = new nra(this, aolnVar);
            }
        } else {
            nraVar = new nra(this, aolnVar);
        }
        java.lang.Object objD = nraVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = nraVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(objD);
            defpackage.ajcq ajcqVarF = this.i.F(new lbk(j, 5));
            defpackage.aooh.e(ajcqVarF, "executeFunctionTransaction(...)");
            nraVar.c = 1;
            objD = defpackage.aosv.D(ajcqVarF, nraVar);
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
    public final java.lang.Object g(defpackage.aoln aolnVar) throws java.lang.Throwable {
        nrb nrbVar;
        if (aolnVar instanceof nrb) {
            nrbVar = (nrb) aolnVar;
            int i = nrbVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nrbVar.c = i - Integer.MIN_VALUE;
            } else {
                nrbVar = new nrb(this, aolnVar);
            }
        } else {
            nrbVar = new nrb(this, aolnVar);
        }
        java.lang.Object objD = nrbVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = nrbVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(objD);
            defpackage.ajcq ajcqVarF = this.i.F(new nqt());
            defpackage.aooh.e(ajcqVarF, "executeFunctionTransaction(...)");
            nrbVar.c = 1;
            objD = defpackage.aosv.D(ajcqVarF, nrbVar);
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

    public final java.lang.Object h(long j, defpackage.aoln aolnVar) {
        defpackage.ajcq ajcqVarF = this.i.F(new lbk(j, 6));
        defpackage.aooh.e(ajcqVarF, "executeFunctionTransaction(...)");
        return defpackage.aosv.D(ajcqVarF, aolnVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object i(java.util.List list, defpackage.aoln aolnVar) {
        nrc nrcVar;
        if (aolnVar instanceof nrc) {
            nrcVar = (nrc) aolnVar;
            int i = nrcVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nrcVar.c = i - Integer.MIN_VALUE;
            } else {
                nrcVar = new nrc(this, aolnVar);
            }
        } else {
            nrcVar = new nrc(this, aolnVar);
        }
        java.lang.Object objD = nrcVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = nrcVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(objD);
            defpackage.ajcq ajcqVarF = this.i.F(new jsh(list, 6));
            defpackage.aooh.e(ajcqVarF, "executeFunctionTransaction(...)");
            nrcVar.c = 1;
            objD = defpackage.aosv.D(ajcqVarF, nrcVar);
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
    public final java.lang.Object j(long j, defpackage.aoln aolnVar) throws java.lang.Throwable {
        nrd nrdVar;
        if (aolnVar instanceof nrd) {
            nrdVar = (nrd) aolnVar;
            int i = nrdVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nrdVar.c = i - Integer.MIN_VALUE;
            } else {
                nrdVar = new nrd(this, aolnVar);
            }
        } else {
            nrdVar = new nrd(this, aolnVar);
        }
        java.lang.Object objD = nrdVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = nrdVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(objD);
            defpackage.ajcq ajcqVarF = this.i.F(new lbk(j, 3));
            defpackage.aooh.e(ajcqVarF, "executeFunctionTransaction(...)");
            nrdVar.c = 1;
            objD = defpackage.aosv.D(ajcqVarF, nrdVar);
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
    public final java.lang.Object k(long j, nsm nsmVar, defpackage.aoln aolnVar) throws java.lang.Throwable {
        nre nreVar;
        if (aolnVar instanceof nre) {
            nreVar = (nre) aolnVar;
            int i = nreVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nreVar.c = i - Integer.MIN_VALUE;
            } else {
                nreVar = new nre(this, aolnVar);
            }
        } else {
            nreVar = new nre(this, aolnVar);
        }
        java.lang.Object objD = nreVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = nreVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(objD);
            defpackage.ajcq ajcqVarF = this.i.F(new nqu(j, nsmVar, 3));
            defpackage.aooh.e(ajcqVarF, "executeFunctionTransaction(...)");
            nreVar.c = 1;
            objD = defpackage.aosv.D(ajcqVarF, nreVar);
            if (objD == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(objD);
        }
        java.lang.Boolean bool = (java.lang.Boolean) objD;
        ((defpackage.kjr) this.g.a()).a();
        defpackage.aooh.c(bool);
        return bool;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object l(long j, nsl nslVar, defpackage.aoln aolnVar) throws java.lang.Throwable {
        nrf nrfVar;
        if (aolnVar instanceof nrf) {
            nrfVar = (nrf) aolnVar;
            int i = nrfVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nrfVar.c = i - Integer.MIN_VALUE;
            } else {
                nrfVar = new nrf(this, aolnVar);
            }
        } else {
            nrfVar = new nrf(this, aolnVar);
        }
        java.lang.Object objD = nrfVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = nrfVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(objD);
            defpackage.ajcq ajcqVarF = this.i.F(new nqu(j, nslVar, 0));
            defpackage.aooh.e(ajcqVarF, "executeFunctionTransaction(...)");
            nrfVar.c = 1;
            objD = defpackage.aosv.D(ajcqVarF, nrfVar);
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
    public final java.lang.Object m(long j, nso nsoVar, defpackage.aoln aolnVar) throws java.lang.Throwable {
        nrg nrgVar;
        if (aolnVar instanceof nrg) {
            nrgVar = (nrg) aolnVar;
            int i = nrgVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nrgVar.c = i - Integer.MIN_VALUE;
            } else {
                nrgVar = new nrg(this, aolnVar);
            }
        } else {
            nrgVar = new nrg(this, aolnVar);
        }
        java.lang.Object objD = nrgVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = nrgVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(objD);
            defpackage.ajcq ajcqVarF = this.i.F(new nqu(j, nsoVar, 2));
            defpackage.aooh.e(ajcqVarF, "executeFunctionTransaction(...)");
            nrgVar.c = 1;
            objD = defpackage.aosv.D(ajcqVarF, nrgVar);
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
    public final java.lang.Object n(long j, nss nssVar, defpackage.aoln aolnVar) throws java.lang.Throwable {
        nrh nrhVar;
        if (aolnVar instanceof nrh) {
            nrhVar = (nrh) aolnVar;
            int i = nrhVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nrhVar.c = i - Integer.MIN_VALUE;
            } else {
                nrhVar = new nrh(this, aolnVar);
            }
        } else {
            nrhVar = new nrh(this, aolnVar);
        }
        java.lang.Object objD = nrhVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = nrhVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(objD);
            defpackage.ajcq ajcqVarF = this.i.F(new nqu(j, nssVar, 1));
            defpackage.aooh.e(ajcqVarF, "executeFunctionTransaction(...)");
            nrhVar.c = 1;
            objD = defpackage.aosv.D(ajcqVarF, nrhVar);
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
