package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class cyr extends cmv {
    public aonj a;
    private diy b;

    public cyr(aonj aonjVar) {
        this.a = aonjVar;
    }

    public final void b() {
        diy diyVar = this.b;
        if (diyVar != null) {
            diyVar.b();
        }
        this.b = wi.h(this, this.a);
    }

    public final void dc() {
        b();
    }

    public final void u() {
        diy diyVar = this.b;
        if (diyVar != null) {
            diyVar.b();
        }
        this.b = null;
    }
}
