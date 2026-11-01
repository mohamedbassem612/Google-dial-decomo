package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class acdg implements defpackage.accr {
    private static final java.util.Map a = defpackage.ajsz.aO(new defpackage.aoiu(1, defpackage.ammm.SUNDAY), new defpackage.aoiu(2, defpackage.ammm.MONDAY), new defpackage.aoiu(3, defpackage.ammm.TUESDAY), new defpackage.aoiu(4, defpackage.ammm.WEDNESDAY), new defpackage.aoiu(5, defpackage.ammm.THURSDAY), new defpackage.aoiu(6, defpackage.ammm.FRIDAY), new defpackage.aoiu(7, defpackage.ammm.SATURDAY));
    private final defpackage.acbd b;
    private final defpackage.accq c;

    public acdg(defpackage.aazc aazcVar, defpackage.acbd acbdVar) {
        if (aazcVar == null) {
            defpackage.aooh.i("clock");
        }
        if (acbdVar == null) {
            defpackage.aooh.i("promoEvalLogger");
        }
        this.b = acbdVar;
        this.c = defpackage.accq.f;
    }

    @Override // defpackage.accr
    public final defpackage.accq a() {
        return this.c;
    }

    @Override // defpackage.accu
    public final boolean b(akkj akkjVar, acct acctVar) {
        defpackage.aooh.f(akkjVar, "triggeringConditions");
        defpackage.alat<akkf> alatVar = akkjVar.h;
        defpackage.aooh.e(alatVar, "getTimeConstraintList(...)");
        if (alatVar.isEmpty()) {
            return true;
        }
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        defpackage.aooh.e(calendar, "getInstance(...)");
        calendar.setTimeInMillis(j$.time.Instant.now().toEpochMilli());
        defpackage.ammm ammmVar = (defpackage.ammm) a.get(java.lang.Integer.valueOf(calendar.get(7)));
        int i = (calendar.get(11) * 60) + calendar.get(12);
        for (akkf akkfVar : alatVar) {
            ammo ammoVar = akkfVar.d;
            if (ammoVar == null) {
                ammoVar = ammo.a;
            }
            defpackage.aooh.e(ammoVar, "getStartTime(...)");
            int iCx = defpackage.agab.cx(ammoVar);
            ammo ammoVar2 = akkfVar.e;
            if (ammoVar2 == null) {
                ammoVar2 = ammo.a;
            }
            defpackage.aooh.e(ammoVar2, "getEndTime(...)");
            int iCx2 = defpackage.agab.cx(ammoVar2);
            if (new defpackage.alam(akkfVar.f, akkf.a).contains(ammmVar) && i >= iCx && i <= iCx2) {
                return true;
            }
        }
        this.b.b(acctVar.b, "No condition matched. Condition list: %s", alatVar);
        return false;
    }
}
