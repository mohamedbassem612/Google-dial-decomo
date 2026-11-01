package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class cul extends cmv implements cuk {
    public aonj a;
    public aonj b;

    public cul(aonj aonjVar, aonj aonjVar2) {
        this.a = aonjVar;
        this.b = aonjVar2;
    }

    public final boolean A(android.view.KeyEvent keyEvent) {
        aonj aonjVar = this.a;
        if (aonjVar != null) {
            return ((java.lang.Boolean) aonjVar.a(new defpackage.cui(keyEvent))).booleanValue();
        }
        return false;
    }

    public final boolean B(android.view.KeyEvent keyEvent) {
        aonj aonjVar = this.b;
        if (aonjVar != null) {
            return ((java.lang.Boolean) aonjVar.a(new defpackage.cui(keyEvent))).booleanValue();
        }
        return false;
    }
}
