package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class owx implements iox {
    public static final iot a = new iot(defpackage.owt.a, defpackage.owu.a, new jot(2), defpackage.owv.a);
    public static final aimz b = aimz.i("com/android/dialer/incall/answer/method/settings/service/AnswerMethodBackup");
    public final iqe c;
    public final rlv d;
    private final aoin e;

    public owx(iqe iqeVar, rlv rlvVar, aoin aoinVar) {
        aooh.f(iqeVar, "backupMigrationFactory");
        aooh.f(rlvVar, "loggingBindings");
        aooh.f(aoinVar, "dataStore");
        this.c = iqeVar;
        this.d = rlvVar;
        this.e = aoinVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(aoln aolnVar) {
        defpackage.oww owwVar;
        if (aolnVar instanceof defpackage.oww) {
            owwVar = (defpackage.oww) aolnVar;
            int i = owwVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                owwVar.c = i - Integer.MIN_VALUE;
            } else {
                owwVar = new defpackage.oww(this, aolnVar);
            }
        } else {
            owwVar = new defpackage.oww(this, aolnVar);
        }
        java.lang.Object objAu = owwVar.a;
        aolu aoluVar = aolu.a;
        int i2 = owwVar.c;
        if (i2 == 0) {
            aooc.af(objAu);
            aoxh aoxhVarB = ((ecx) this.e.a()).b();
            owwVar.c = 1;
            objAu = aoov.au(aoxhVarB, owwVar);
            if (objAu == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objAu);
        }
        this.d.o(rmx.dk);
        return objAu;
    }

    public final iot c() {
        return a;
    }
}
