package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class aoxo {
    public static final defpackage.aonj a = new defpackage.aoso(3);
    public static final defpackage.aonn b = new defpackage.dkm(19);

    public static final defpackage.aoxh a(defpackage.aoxh aoxhVar) {
        return !(aoxhVar instanceof defpackage.aozh) ? b(aoxhVar, a, b) : aoxhVar;
    }

    public static final defpackage.aoxh b(defpackage.aoxh aoxhVar, defpackage.aonj aonjVar, defpackage.aonn aonnVar) {
        if (aoxhVar instanceof defpackage.aoxf) {
            defpackage.aoxf aoxfVar = (defpackage.aoxf) aoxhVar;
            if (aoxfVar.a == aonjVar && aoxfVar.b == aonnVar) {
                return aoxhVar;
            }
        }
        return new defpackage.aoxf(aoxhVar, aonjVar, aonnVar);
    }
}
