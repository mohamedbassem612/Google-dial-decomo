package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class amwv implements defpackage.emx, defpackage.eoi, defpackage.emn {
    private final android.app.Activity a;
    private final defpackage.aw b;
    private final defpackage.ahgd c;

    public amwv(android.app.Activity activity, defpackage.ahgd ahgdVar, defpackage.aw awVar) {
        int i = activity != null ? 1 : 0;
        i = ahgdVar != null ? i + 1 : i;
        defpackage.ajsz.dA((awVar != null ? i + 1 : i) == 1, "Exactly one of the host components must be non-null.", new java.lang.Object[0]);
        this.a = activity;
        this.c = ahgdVar;
        this.b = awVar;
    }

    @Override // defpackage.emx
    public final defpackage.ems P() {
        return ((defpackage.emx) c()).P();
    }

    @Override // defpackage.emn
    public final defpackage.eoe R() {
        return ((defpackage.emn) c()).R();
    }

    @Override // defpackage.eoi
    public final defpackage.eoh S() {
        return ((defpackage.eoi) c()).S();
    }

    @Override // defpackage.emn
    public final defpackage.eoq T() {
        return ((defpackage.emn) c()).T();
    }

    public final android.app.Activity a() {
        android.app.Activity activity = this.a;
        activity.getClass();
        return activity;
    }

    public final defpackage.aw b() {
        defpackage.aw awVar = this.b;
        defpackage.ajsz.dB(awVar);
        return awVar;
    }

    public final java.lang.Object c() {
        int iD = d() - 1;
        if (iD != 0) {
            return iD != 1 ? b() : e();
        }
        return a();
    }

    public final int d() {
        if (this.a != null) {
            return 1;
        }
        if (this.b != null) {
            return 3;
        }
        if (this.c != null) {
            return 2;
        }
        throw new java.lang.AssertionError("Shouldn't reach here.");
    }

    public final defpackage.ahgd e() {
        defpackage.ahgd ahgdVar = this.c;
        defpackage.ajsz.dB(ahgdVar);
        return ahgdVar;
    }

    public final java.lang.String toString() {
        return "ScreenHost{host=" + c().toString() + '}';
    }
}
