package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ahfy extends defpackage.emy {
    private defpackage.ahmw f;

    public ahfy(defpackage.az azVar) {
        super(azVar, true);
    }

    @Override // defpackage.emy
    public final void f(defpackage.emp empVar) {
        super.e("getObserverCount");
        if (this.e.d() <= 0) {
            super.f(empVar);
            return;
        }
        defpackage.ahmw ahmwVar = this.f;
        if (empVar == null) {
            defpackage.aooh.i("event");
        }
        defpackage.emo emoVar = defpackage.emp.Companion;
        int iOrdinal = empVar.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                defpackage.ahou ahouVar = defpackage.ahot.a;
                defpackage.aooh.e(ahouVar, "empty(...)");
                ahmwVar.r("Lifecycle.Started", ahouVar);
            } else if (iOrdinal == 2) {
                defpackage.ahou ahouVar2 = defpackage.ahot.a;
                defpackage.aooh.e(ahouVar2, "empty(...)");
                ahmwVar.r("Lifecycle.Resumed", ahouVar2);
            } else if (iOrdinal == 3) {
                defpackage.ahou ahouVar3 = defpackage.ahot.a;
                defpackage.aooh.e(ahouVar3, "empty(...)");
                ahmwVar.r("Lifecycle.Paused", ahouVar3);
            } else if (iOrdinal == 4) {
                defpackage.ahou ahouVar4 = defpackage.ahot.a;
                defpackage.aooh.e(ahouVar4, "empty(...)");
                ahmwVar.r("Lifecycle.Stopped", ahouVar4);
            } else {
                if (iOrdinal != 5) {
                    java.util.Objects.toString(empVar);
                    throw new java.lang.UnsupportedOperationException("Unknown lifecycle: ".concat(java.lang.String.valueOf(empVar)));
                }
                defpackage.ahou ahouVar5 = defpackage.ahot.a;
                defpackage.aooh.e(ahouVar5, "empty(...)");
                ahmwVar.r("Lifecycle.Destroyed", ahouVar5);
            }
        } else if (ahmwVar.e == null) {
            defpackage.ahou ahouVar6 = defpackage.ahot.a;
            defpackage.aooh.e(ahouVar6, "empty(...)");
            ahmwVar.r("Lifecycle.Created", ahouVar6);
            ahmwVar.d = true;
        }
        try {
            super.f(empVar);
        } finally {
            this.f.p(empVar);
        }
    }

    public final void h(defpackage.ahmw ahmwVar) {
        defpackage.ahvr.bZ(this.f == null, "Activity was already created");
        this.f = ahmwVar;
    }
}
