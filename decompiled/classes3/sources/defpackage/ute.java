package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ute implements defpackage.usa {
    private static final int c;
    private static final int d;
    public final defpackage.usj a;
    public final ahbv b;
    private final int e;
    private final ajct f;
    private final agtc g;

    static {
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MINUTES;
        c = 300;
        java.util.concurrent.TimeUnit timeUnit2 = java.util.concurrent.TimeUnit.MINUTES;
        d = 3600;
    }

    public ute(aoin aoinVar, ajcu ajcuVar, ahbv ahbvVar, defpackage.usj usjVar, defpackage.utf utfVar) {
        this.e = ((java.lang.Long) aoinVar.a()).intValue();
        this.f = ajcuVar;
        this.b = ahbvVar;
        this.a = usjVar;
        j$.util.Objects.requireNonNull(utfVar);
        this.g = new agtc(new defpackage.plx(utfVar, 19), ajcuVar);
    }

    private final int d(int i) {
        float fQ = aiql.Q(i, c, d);
        int i2 = this.e;
        return java.lang.Math.round(fQ / i2) * i2;
    }

    @Override // defpackage.usa
    public final ajcq a(java.lang.String str) {
        ahrv ahrvVarG = ahrv.g(this.g.a());
        uhj uhjVar = new uhj(this, str, 7);
        ajct ajctVar = this.f;
        return ahrvVarG.i(uhjVar, ajctVar).i(new defpackage.udu(this, 10), ajctVar).h(new defpackage.uev(this, 13), ajctVar);
    }

    @Override // defpackage.usa
    public final ajcq b(java.lang.String str) {
        ahrv ahrvVarG = ahrv.g(this.g.a());
        uhj uhjVar = new uhj(this, str, 6);
        ajct ajctVar = this.f;
        return ahrvVarG.i(uhjVar, ajctVar).i(new defpackage.udu(this, 9), ajctVar).h(new defpackage.uev(this, 12), ajctVar);
    }

    public final defpackage.urw c(defpackage.urw urwVar) {
        akzx akzxVarM = defpackage.urw.a.m();
        defpackage.urv urvVar = defpackage.urv.a;
        akzx akzxVarM2 = urvVar.m();
        defpackage.urv urvVar2 = urwVar.c;
        if (urvVar2 == null) {
            urvVar2 = urvVar;
        }
        int iD = d(urvVar2.c);
        akzxVarM2.u();
        defpackage.urv urvVar3 = (defpackage.urv) akzxVarM2.b;
        urvVar3.b |= 1;
        urvVar3.c = iD;
        defpackage.urv urvVar4 = urwVar.c;
        if (urvVar4 != null) {
            urvVar = urvVar4;
        }
        int iD2 = d(urvVar.d);
        akzxVarM2.u();
        defpackage.urv urvVar5 = (defpackage.urv) akzxVarM2.b;
        urvVar5.b |= 2;
        urvVar5.d = iD2;
        akzxVarM.u();
        defpackage.urw urwVar2 = (defpackage.urw) akzxVarM.b;
        defpackage.urv urvVar6 = (defpackage.urv) akzxVarM2.p();
        j$.util.Objects.requireNonNull(urvVar6);
        urwVar2.c = urvVar6;
        urwVar2.b |= 1;
        return (defpackage.urw) akzxVarM.p();
    }
}
