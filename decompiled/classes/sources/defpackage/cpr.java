package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class cpr {
    public static final android.graphics.Canvas a = new android.graphics.Canvas();

    public static final android.graphics.Canvas a(defpackage.cqf cqfVar) {
        if (cqfVar == null) {
            defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.graphics.AndroidCanvas");
        }
        return ((defpackage.cpq) cqfVar).a;
    }

    public static final defpackage.cqf b(defpackage.cpu cpuVar) {
        defpackage.cpq cpqVar = new defpackage.cpq();
        cpqVar.a = new android.graphics.Canvas(defpackage.rz.h(cpuVar));
        return cpqVar;
    }
}
