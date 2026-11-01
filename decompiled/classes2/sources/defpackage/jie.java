package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jie extends aomh implements aonn {
    private final /* synthetic */ int $cid;
    final /* synthetic */ long a;
    final /* synthetic */ java.lang.Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jie(long j, java.lang.String str, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = j;
        this.b = str;
    }

    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        switch (this.$cid) {
            case 0:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 1:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 2:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 3:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 4:
                return c((defpackage.lsv) obj, (aoln) obj2).b(aojh.a);
            case 5:
                return c((nxp) obj, (aoln) obj2).b(aojh.a);
            case 6:
                return c((oel) obj, (aoln) obj2).b(aojh.a);
            case 7:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            default:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
        }
    }

    /* JADX WARN: Type inference failed for: r13v7, types: [java.lang.Object, java.util.Map$Entry] */
    public final java.lang.Object b(java.lang.Object obj) {
        wjp nxpVar;
        boolean z;
        boolean z2;
        boolean z3 = true;
        switch (this.$cid) {
            case 0:
                aooc.af(obj);
                ((defpackage.jif) this.b).c = new java.lang.Long(this.a);
                return aojh.a;
            case 1:
                aooc.af(obj);
                ((defpackage.jif) this.b).d = new java.lang.Long(this.a);
                return aojh.a;
            case 2:
                aooc.af(obj);
                ((defpackage.jif) this.b).e = new java.lang.Long(this.a);
                return aojh.a;
            case 3:
                aooc.af(obj);
                ((defpackage.jif) this.b).b = new java.lang.Long(this.a);
                return aojh.a;
            case 4:
                aooc.af(obj);
                return new defpackage.lsv(this.a, (java.lang.String) this.b);
            case 5:
                aooc.af(obj);
                ?? r13 = this.b;
                aooh.f((java.lang.Object) r13, "<this>");
                nxpVar = new nxp((java.lang.String) r13.getKey(), (defpackage.nwx) r13.getValue(), this.a, 0L);
                break;
            case 6:
                aooc.af(obj);
                java.lang.Object obj2 = this.b;
                if (((defpackage.oet) obj2).ordinal() != 1) {
                    throw new java.lang.IllegalArgumentException("unknown enum value: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(obj2))));
                }
                nxpVar = new oel(this.a, defpackage.oee.URGENT);
                break;
                break;
            case 7:
                aooc.af(obj);
                rsr rsrVar = new rsr();
                rsrVar.aC(new kaw("created").aI(">", java.lang.Long.valueOf(this.a)));
                rsr rsrVarAB = rsrVar.aB();
                ueu ueuVarF = ((ueh) this.b).c.b.f("client_spam_table", (java.lang.String[]) null, (java.lang.String) rsrVarAB.b, (java.lang.String[]) rsrVarAB.a);
                try {
                    if (ueuVarF == null) {
                        uex.a.c().m(aioa.b).i(zct.b).l("com/android/dialer/spam/inapp/SpamDatabaseUtils", "dataUpdatedInClientTable", 488, "SpamDatabaseUtils.java").v("null cursor returned");
                        z = false;
                    } else {
                        z = ueuVarF.getCount() > 0;
                        ueuVarF.close();
                    }
                    java.lang.Object obj3 = this.b;
                    long j = this.a;
                    rsr rsrVar2 = new rsr();
                    rsrVar2.aC(new kaw("created").aI(">", java.lang.Long.valueOf(j)));
                    rsr rsrVarAB2 = rsrVar2.aB();
                    java.lang.Object obj4 = rsrVarAB2.b;
                    java.lang.Object obj5 = rsrVarAB2.a;
                    ueuVarF = ((ueh) obj3).c.b;
                    android.database.Cursor cursorF = ueuVarF.f("server_spam_table", (java.lang.String[]) null, (java.lang.String) obj4, (java.lang.String[]) obj5);
                    try {
                        if (cursorF == null) {
                            uex.a.c().m(aioa.b).i(zct.b).l("com/android/dialer/spam/inapp/SpamDatabaseUtils", "dataUpdatedInServerTable", 456, "SpamDatabaseUtils.java").v("null cursor returned");
                            z2 = false;
                        } else {
                            z2 = cursorF.getCount() > 0;
                            cursorF.close();
                        }
                        if (!z && !z2) {
                            z3 = false;
                        }
                        return java.lang.Boolean.valueOf(z3);
                    } catch (java.lang.Throwable th) {
                        if (cursorF == null) {
                            throw th;
                        }
                        try {
                            cursorF.close();
                            throw th;
                        } catch (java.lang.Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                } catch (java.lang.Throwable th3) {
                    if (ueuVarF == null) {
                        throw th3;
                    }
                    try {
                        ueuVarF.close();
                        throw th3;
                    } catch (java.lang.Throwable th4) {
                        th3.addSuppressed(th4);
                        throw th3;
                    }
                }
            default:
                aooc.af(obj);
                long j2 = this.a;
                wjt wjtVar = (wjt) this.b;
                nxpVar = new wjp(ahvr.bv(wjtVar.b), ahvr.bv(wjtVar.c), wjtVar.d, j2);
                break;
        }
        return nxpVar;
    }

    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, java.util.Map$Entry] */
    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        switch (this.$cid) {
            case 0:
                return new defpackage.jie((defpackage.jif) this.b, this.a, aolnVar, 0);
            case 1:
                return new defpackage.jie((defpackage.jif) this.b, this.a, aolnVar, 1, (byte[]) null);
            case 2:
                return new defpackage.jie((defpackage.jif) this.b, this.a, aolnVar, 2, (char[]) null);
            case 3:
                return new defpackage.jie((defpackage.jif) this.b, this.a, aolnVar, 3, (short[]) null);
            case 4:
                return new defpackage.jie(this.a, (java.lang.String) this.b, aolnVar, 4);
            case 5:
                return new defpackage.jie((java.util.Map.Entry) this.b, this.a, aolnVar, 5);
            case 6:
                return new defpackage.jie(this.a, (defpackage.oet) this.b, aolnVar, 6);
            case 7:
                return new defpackage.jie((ueh) this.b, this.a, aolnVar, 7);
            default:
                return new defpackage.jie((wjt) this.b, this.a, aolnVar, 8);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jie(long j, defpackage.oet oetVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = j;
        this.b = oetVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jie(java.util.Map.Entry entry, long j, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = entry;
        this.a = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jie(defpackage.jif jifVar, long j, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = jifVar;
        this.a = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jie(defpackage.jif jifVar, long j, aoln aolnVar, int i, byte[] bArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = jifVar;
        this.a = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jie(defpackage.jif jifVar, long j, aoln aolnVar, int i, char[] cArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = jifVar;
        this.a = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jie(defpackage.jif jifVar, long j, aoln aolnVar, int i, short[] sArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = jifVar;
        this.a = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jie(ueh uehVar, long j, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = uehVar;
        this.a = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jie(wjt wjtVar, long j, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = wjtVar;
        this.a = j;
    }
}
