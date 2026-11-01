package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class ainu {
    public static final defpackage.ainu c = new defpackage.ainq();
    public static final defpackage.ainu d = new defpackage.ainq();

    protected ainu() {
    }

    static defpackage.ainu b(defpackage.ainu ainuVar, defpackage.ainu ainuVar2) {
        defpackage.ainu ainuVar3;
        defpackage.ainu ainuVar4;
        if (ainuVar != null) {
            if (ainuVar2 == null || ainuVar == (ainuVar3 = c) || ainuVar2 == (ainuVar4 = d)) {
                return ainuVar;
            }
            if (ainuVar2 != ainuVar3 && ainuVar != ainuVar4) {
                return new ainr(ainuVar, ainuVar2);
            }
        }
        return ainuVar2;
    }

    protected abstract void a();
}
